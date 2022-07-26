/* *****************************************
***** Parser JCoQL Antlr Specification *****
***************************************** */

//ver4.0
grammar JCoQL;

options {
  language = Java;
}

@header{
  package jco.ql.parser;
  
  import java.io.*;
  import jco.ql.parser.model.*;
  import jco.ql.parser.model.condition.*;
  import jco.ql.parser.model.fuzzy.*;
  import jco.ql.parser.model.predicate.*;
  import jco.ql.parser.model.util.*;
}

@lexer::header{
  package jco.ql.parser;
}

@members{
	public static final String version = "4.0";
	public static final String release = "4.0.00";
 	Environment env;

  public JCoQLParser(JCoQLLexer lexer) {		
		this(new CommonTokenStream(lexer));
		env = new Environment(input, version, release);
		lexer.setEnvironment(env);
	}
	// 2021.12.14 - These constructors are added to avoid to create a lexer outside the parser
  public JCoQLParser(FileReader fileIn) throws IOException {		
		this(new CommonTokenStream(null));
		JCoQLLexer lexer = new JCoQLLexer(new ANTLRReaderStream(fileIn)); 
		input = new CommonTokenStream(lexer);
		env = new Environment(input, version, release);
		lexer.setEnvironment(env);
	}
  public JCoQLParser(String docIn) throws IOException {		
		this(new CommonTokenStream(null));
		JCoQLLexer lexer = new JCoQLLexer(new ANTLRReaderStream(new StringReader (docIn))); 
		input = new CommonTokenStream(lexer);
		env = new Environment(input, version, release);
		lexer.setEnvironment(env);
	}
  
  public Environment getEnvironment() {
    return env;
  }
  
  public List<String> getErrorList () {
    return env.errorList;
  }


  public void displayRecognitionError(String[] tokenNames,
                                       RecognitionException e) {
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		  
		Token tk = input.LT(1);
		env.handleError(tokenNames, e, hdr, msg);
  }
    
}

@lexer::members{
  Environment env;

  void setEnvironment (Environment e) {
    env = e;
  }
}

// ########### Syntax Rules ###########

// Start Symbol
start 
  : ( getCollectionRule             // 1 
    | saveAsRule                    // 3 
    | joinOfCollectionsRule         // 4 	
    | filterRule                    // 6 
    | groupRule                     // 7 
    | expandRule                    // 8 
    | mergeCollectionsRule          // 9 
    | intersectCollectionsRule      // 10
    | subtractCollectionsRule       // 11
    | useDbRule                     // 12
    | trajectoryMatchingRule        // 13
    |	createFuzzyOperatorRule				// 14
    | createJavaScriptFunctionRule	// 15
    | getDictionaryRule							// 16
    | lookupFromWebRule							// 17
    | test                      // istruzione di test...
    )* EOF
  ;

// serie di produzioni di prova...
test: XXX SC ;

//-------------------------------------------------


collectionReferenceRule returns [DbCollection cr]
  :
    name=ID 	
    ( AT db=ID )? 	
    ( AS alias=ID )?
    { cr = env.addDbCollection ($name, $db, $alias); }    
  ;
  

fieldRefRule returns [Field field]
@init {	field = new Field (); }
  : 
    ( fd=FIELD_NAME							{ env.addField ($field, $fd); }			)+
  ;


buildActionRule returns [BuildAction ga]
@init { ga = new BuildAction(); }
  :
    BUILD								
	     os=objectStructureRule { ga.setObjectStructure (os); }	    
  ;


// modficata il 10.03.2022
objectStructureRule returns [ObjectStructure obj]
  :
    LBR 
      ofs=outputFieldSpecRule							{ obj = new ObjectStructure (ofs); }
	      ( t=COMMA ofs=outputFieldSpecRule 			{ obj.addOutputFieldSpec(ofs); }   )*
    RBR
  ;


// modified on 2022.03.30
outputFieldSpecRule returns [OutputFieldSpec ofs]
  :
    fr=fieldRefRule																											{ ofs = new OutputFieldSpec (fr); }
    (	COLON ( os=objectStructureRule																										{ ofs.setFieldSpec (os); 	}
    				| f=factorRule																															{	ofs.setFieldSpec (f);		}
          	)
     )?      
  ;
  


geometricOptionRule returns [GeometricOption geo]
@init { geo = new GeometricOption (); }
  :
	    KEEPING GEOMETRY																								{ geo.setKeeping (); }
	  | SETTING GEOMETRY 
	            ( POINT LP lat=fieldRefRule COMMA lon=fieldRefRule RP		{ geo.setPoint (lat, lon); }
	            | AGGREGATE LP afr=fieldRefRule RP 											{ geo.setAggregate (afr); }
	            | fr=fieldRefRule 																			{ geo.setField (fr); }
	            | TO_POLYLINE LP f=fieldRefRule RP											{ geo.setPolyline (f); }  
	            )
  ;
// added on 2022.09.22  
dropGeometryRule 
  :
	  DROPPING GEOMETRY																								
  ;

	
caseClauseRule returns [CaseClause cc]
  :
    CASE 												{ cc = new CaseClause (); }
	      ( wc=whereCaseRule					{ cc.addWhereCase (wc); } )+	      
	      ( oth=othersRule 						{ cc.setOthers (oth); }		)?
  ;


othersRule returns [String oth]
  :    
     ( ot=KEEP | ot=DROP ) { oth=$ot.getText(); }
     OTHERS 
  ;



whereCaseRule returns [WhereCase wc]
  : 
    WHERE 
     	c=orConditionRule 				{ wc = new WhereCase (c); }
     	( gs=generateSectionRule [true]		{	wc.setGenerateSection (gs);	}	)?
  ;
  
  
// complete=true if caller is WHERECASE (and fuzzy option are allowed)
// complete=false if caller is PARTITION (and fuzzy option are not allowed)
generateSectionRule [boolean complete]	returns [GenerateSection gs]
	:
		g=GENERATE 			{	gs = new GenerateSection (complete);	}
     	( go=geometricOptionRule				{	gs.addGeometricOption (go); 	} )?
			( cf=checkForFuzzySetRule [gs]																		)?
			(	ac=alphaCutRule [gs]																						)?
   	 	( ga=buildActionRule 						{ gs.addBuildAction (ga); 			}	)?
			( df=keepDropFuzzySetsRule	 		{ gs.addKeepDropFuzzySets (df); } )?
     	( dropGeometryRule							{	gs.addDropGeometry (); 				} )?
   	 																	{	env.checkGenerate (gs, $g);		}
	;


/* --------------------------------------------------
		Condition-preficate model for CASE WHERE context
	---------------------------------------------------	*/
orConditionRule returns [Condition c]
  : 
    c1=andConditionRule 						{ c = new ConditionOr (c1); }
			( OR c2=andConditionRule 					{ ((ConditionOr)c).addCondition (c2); } 	)*
																		{ c = env.simplifyConditionOr ((ConditionOr)c); }
  ;

 
andConditionRule returns [Condition c]
  : 
    c1=notConditionRule 						{ c = new ConditionAnd (c1); }
    ( AND c2=notConditionRule 					{ ((ConditionAnd)c).addCondition (c2); } 	)*
																		{ c = env.simplifyConditionAnd ((ConditionAnd)c); }
  ;
  
  
notConditionRule returns [Condition c]
  : 
    ( not=NOT )? 
    p=predicateRule 						    { c = env.createCondition (not, p); }    
  ;




predicateRule returns [Predicate p]
  :
     	e1=expressionRule														{	p	=	e1; 	}
     		(	cp=compareRule [e1]												{ p = cp; 	} 
     		| irp=inRangeRule [e1]											{ p = irp; 	}		)?  		
    | np=nullPredicateRule												{	p = np;		}
    | wp=withPredicateRule      									{ p = wp; 	}
    | wop=withoutPredicateRule  									{ p = wop;	}
		| fp=wukFuzzyPredicateRule										{ p = fp; 	}
  ;


compareRule [Expression e1] returns [Predicate p]
	:
    c=comparatorRule 
    e2=expressionRule 						{ p = new ComparisonPredicate (e1, c.getText(), e2); } 
	;


inRangeRule [Expression expr] returns [Predicate p]
	:
		INRANGE ( lp=LB | lp=LP ) 
			n1=numericRule COMMA n2=numericRule 
		( rp=RP | rp=RB )															{	p = env.getInRangePredicate (expr, $lp, n1, n2, $rp); }
	;

	
nullPredicateRule returns [NullPredicate np]
	:
    FIELD f=fieldRefRule ( n=ISNULL | n=ISNOTNULL)							{	np = env.createNullPredicate (f, $n); } 																																			     
	;
	
	
wukFuzzyPredicateRule returns [WUKPredicate wuk]
	:
		(	t=WITHIN | t=KNOWN | t=UNKNOWN ) 										{ wuk = env.createWUKPredicate($t); }
					FUZZY SETS fs=ID 																		{ env.addFuzzySet (wuk, $fs); }
				 	( COMMA fs=ID 																			{ env.addFuzzySet (wuk, $fs); }		)*
	;

	

withoutPredicateRule returns [WithoutPredicate wp]
@init { wp = new WithoutPredicate (); }
  :
    WITHOUT 
      fr=fieldRefRule 						{ wp.addField (fr); }
      ( COMMA fr=fieldRefRule 				{ wp.addField (fr); } 	)*
  ;



withPredicateRule returns [WithPredicate wp]
@init { wp = new WithPredicate (); }
  :
    WITH 
      ( ( ts=ID | ts=ARRAY | ts=GEOMETRY )  	{ env.checkWithPredicateTypeSelector (wp, $ts); }  	)? 
		   fr=fieldRefRule 												{ wp.addField (fr); }
	    ( COMMA fr=fieldRefRule 								{ wp.addField (fr); } 	)*
  ;



expressionRule returns [Expression expr]
@init { expr = new Expression (); }
  : 
  	(	t=termRule												{ expr.addTerm (t, null); }
  	|	(s=ADD | s=SUB) t=termRule				{ expr.addTerm (t, $s.getText()); } )
    ( (s=ADD | s=SUB) t=termRule 				{ expr.addTerm (t, $s.getText()); }	)*
  ;


termRule returns [ExpressionTerm et]
@init { et = new ExpressionTerm (); }
  : 
  	f=factorRule											{ et.addFactor(f, null);}
    ( (s=MUL | s=DIV) f=factorRule 			{ et.addFactor(f, s.getText());}		)*
  ;

  
factorRule returns [ExpressionFactor ef]
  : 
	  	LP op=orConditionRule RP						   		{ ef = new ExpressionFactor (op); }
	  |	fr=fieldRefRule														{ ef = new ExpressionFactor (fr); }
	  | vl=valueRule															{	ef = new ExpressionFactor (vl);	}
	  | x=ID LP (fp=functionParamsRule)? RP				{ ef = env.buildFunction ($x, fp); } 
	  | e=specialFunctionRule											{	ef = e;	}
  ;


valueRule returns [Value vl]
  : 
  		n=INT           { vl = new Value (Value.INT, $n.getText()); 		}
		| f=FLOAT         { vl = new Value (Value.FLOAT, $f.getText());		}
	  | a=APEX_VALUE    { vl = new Value (Value.APEX, $a.getText()); 		}
	  | q=QUOTED_VALUE  { vl = new Value (Value.QUOTED, $q.getText());	}
	  | b=BOOLEAN       { vl = new Value (Value.BOOLEAN, $b.getText());	}
  ;


specialFunctionRule returns [SpecialFunctionFactor expr]
	:
			f=MEMBERSHIP_OF LP mo=ID RP																							{	expr = env.buildMembershipOf ($mo); 		}
		| f=IF_ERROR			LP e=restrictedExpressionRule COMMA v=valueRule RP			{	expr = env.buildIfError (e, v); 	}
		|	f=TRANSLATE 		LP e=restrictedExpressionRule COMMA dict=ID 
				    						( COMMA cs=BOOLEAN 
				    							( COMMA (d=APEX_VALUE | d=QUOTED_VALUE) )? )?	RP		{	expr = env.buildTranslate 	(e, $dict, $cs, $d); 	}	
		| a=arrayFunctionRule 																										{ expr = a; }
	;
	
	
arrayFunctionRule returns [ArrayFunctionFactor af]
	: (	fun=ARRAY_FUNCTION)												{	af = env.newArrayFunction ($fun);	}																						
		LP 																			
			( fr=fieldRefRule 												{ af.setFieldArray (fr); 			}
			| LB e=restrictedExpressionRule 					{	af.addExpressionArray (e);	}
				( COMMA e=restrictedExpressionRule			{	af.addExpressionArray (e);	}									)* 		
				RB	) 
			COMMA type=ID 														{	env.setArrayFunctionType (af, $type); }				// ID in NUMERIC, BOOLEAN, STRING

			( COMMA ( fx=fieldRefRule 								{	af.addSearchingField (fx); 	}
								( COMMA fx=fieldRefRule 				{	af.addSearchingField (fx); 	}									)*		
							| d=DOCUMENTS 										{	env.setArrayFunctionSearcingType (af, $d); }	// ID in DOCUMENTS
								COMMA fx=fieldRefRule 					{	af.addSearchingField (fx); 	}
								( COMMA fx=fieldRefRule 				{	af.addSearchingField (fx); 	}									)* 			
							)	 )?
		RP
	;

/* -------------------------------------------------------
		FINE Condition-preficate model for CASE WHERE context
	--------------------------------------------------------	*/

/* ---------------------------------------------------------
		Expression model for PredefinedFunction e BUILD section
	----------------------------------------------------------	*/

restrictedExpressionRule returns [Expression expr]
@init { expr = new Expression (); }
  : 
  	( t=restrictedTermRule												{ expr.addTerm (t, null); }	
		| (s=ADD | s=SUB) t=restrictedTermRule				{ expr.addTerm (t, $s.getText()); }	)
    ( (s=ADD | s=SUB) t=restrictedTermRule 				{ expr.addTerm (t, $s.getText()); }	)*
  ;


restrictedTermRule returns [ExpressionTerm et]
@init { et = new ExpressionTerm (); }
  : 
  	f=restrictedFactorRule											{ et.addFactor(f, null);}
    ( (s=MUL | s=DIV) f=restrictedFactorRule 			{ et.addFactor(f, s.getText());}		)*
  ;

  
restrictedFactorRule returns [ExpressionFactor ef]
  : 
	  	LP ex=restrictedExpressionRule RP					{ ef = new ExpressionFactor (ex); }
	  |	fr=fieldRefRule														{ ef = new ExpressionFactor (fr); }
	  | vl=valueRule															{	ef = new ExpressionFactor (vl);	}
	  | x=ID LP (fp=functionParamsRule)? RP				{ ef = env.buildFunction ($x, fp); } 
	  | e = specialFunctionRule										{	ef = e;	}
  ;

  
functionParamsRule returns [ArrayList<Expression> params]
  @init{ params = new ArrayList<Expression>(); }
  : 
  	e=restrictedExpressionRule 							{ params.add(e); }
    	( COMMA e=restrictedExpressionRule 				{ params.add(e); }		)*
  ;
  
/* ---------------------------------------------------------
		Expression model for PredefinedFunction e BUILD section
	----------------------------------------------------------	*/

  
comparatorRule returns [Token op] 
  : 
  	( o=EQ
    | o=NEQ
    | o=LT
    | o=GT
    | o=LE
    | o=GE
    )
    { op = $o; }
  ;

 
// token arricchito con il segno
numericRule returns [String num]
  : 
  	( s=ADD | s=SUB )? 
  	( n=FLOAT | n=INT )					{ num = env.getNumeric($s, $n); }
  ;


//--- CHECK FOR FUZZY SET MODEL
checkForFuzzySetRule [GenerateSection gs]
	:	
		CHECK_FOR FUZZY SET fs=ID	USING fe=usingOrConditionRule 					{ env.addCheckForFuzzySet (gs, fs, fe); } 
			( COMMA FUZZY SET fs=ID	USING fe=usingOrConditionRule 					{ env.addCheckForFuzzySet (gs, fs, fe); }		)*
	;	

usingOrConditionRule returns [Condition c]
  : 
    c1=usingAndConditionRule 						{ c = new ConditionOr (c1); }
			( OR c2=usingAndConditionRule 					{ ((ConditionOr)c).addCondition (c2); } 	)*
																		{ c = env.simplifyConditionOr ((ConditionOr)c); }
  ;

 
usingAndConditionRule returns [Condition c]
  : 
    c1=usingNotConditionRule 						{ c = new ConditionAnd (c1); }
    ( AND c2=usingNotConditionRule 					{ ((ConditionAnd)c).addCondition (c2); } 	)*
																		{ c = env.simplifyConditionAnd ((ConditionAnd)c); }
  ;
  
  
usingNotConditionRule returns [Condition c]
  : 
    ( not=NOT )? 
    p=usingPredicateRule 
    { c = env.createCondition (not, p); }    
  ;


usingPredicateRule returns [Predicate p]
  :
  	LP c=usingOrConditionRule RP										{	p = new UsingPredicate (c); }
	| x=ID (LP (fp=functionParamsRule)? RP)?					{	p = new UsingPredicate ($x.getText(), fp); }        
	| IF_FAILS LP 
			c=usingOrConditionRule COMMA n=numericRule 		{ p = new UsingPredicate (c, n); }
		RP
	;


alphaCutRule [GenerateSection gs]
	:
		ALPHACUT 	n=numericRule ON on=ID  		{	env.addAlphaCut (gs, n, $on); }
			(	COMMA	n=numericRule ON on=ID  		{ env.addAlphaCut (gs, n, $on); }	)*
	;
//--- END CHECK FOR FUZZY SET MODEL



// modified on 19.11.2021


keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs]  
@init{ dfs = new KeepingDroppingFuzzySets ();}
	:
			DEFUZZIFY 											{	dfs.setDefuzzify(); }
		|	DROPPING ALL FUZZY SETS 				{	dfs.setDroppingAll(); }
		|	KEEPING ALL FUZZY SETS 					{	dfs.setKeepingAll(); }
		|	DROPPING FUZZY SETS fs=ID  			{	dfs.setDropping($fs.getText()); }
				( COMMA fs=ID 										{ dfs.addFuzzySet ($fs.getText()); } 			)* 
		|	KEEPING FUZZY SETS fs=ID 				{	dfs.setKeeping($fs.getText()); } 
				( COMMA fs=ID 										{ dfs.addFuzzySet ($fs.getText()); } 			)* 		
	;

	

addFieldsRule [JoinCollections jc]  
	:
		ADD_ST 
			FIELD f=fieldRefRule COLON af=insertFieldRule[f]  							{ jc.addAddField (af); }
				( COMMA FIELD f=fieldRefRule COLON af=insertFieldRule[f] 				{ jc.addAddField (af); } 		)*	
	;


insertFieldRule [Field f] returns [AddField af]
	:
			sf=spatialFunctionRule [false]				{ af = new AddField (f, sf); }
		|	ef=restrictedFactorRule								{ af = new AddField (f, ef); }
	;



// expressionRule added on 2022.03.30
// expression rule cannot be call on ON GEOMETRY clasue (check=true)
spatialFunctionRule [boolean joinCaller] returns [SpatialFunction sf]
@init{ sf = new SpatialFunction (); }
  :
	  	DISTANCE LP u=ID RP ( cp=comparatorRule n=numericRule )?													{ env.setDistance (sf, $u, cp, n, joinCaller); }
	  | ORIENTATION LP ( f=LEFT | f=RIGHT ) ( COMMA  o=ID COLON d=numericRule )? RP 			{ env.setOrientation (sf, $f, $o, d, joinCaller);  }
	  | INCLUDED LP ( i=LEFT | i=RIGHT) RP																								{ sf.setType (SpatialFunction.INCLUDED, $i.getText()); }
	  | MEET																																							{ sf.setType (SpatialFunction.MEET); }
	  | INTERSECT																																					{ sf.setType (SpatialFunction.INTERSECT); }
  ;


// aggiunto il 09.07.2021		
setFuzzySetsRule returns [SetFuzzySets sfs]
@init{ sfs = new SetFuzzySets(); }
	:	
		SET FUZZY SETS 
			( KEEP																										
					(	k=ALL 																							{	sfs.setByKeep($k.getText()); } 
						( resolvingRule [sfs] ) ?	
					| k=LEFT 																							{	sfs.setByKeep($k.getText()); }
					| k=RIGHT)																						{	sfs.setByKeep($k.getText()); }
			| addFuzzySetRule[sfs]
				(	COMMA addFuzzySetRule[sfs] )*				
				( resolvingRule [sfs] ) ?	
			)
	;

resolvingRule [SetFuzzySets sfs]
	:
		RESOLVING WITH 	
					(t=AND | t=OR | t=FIRST | t=LAST) 										{	sfs.setPolicy($t.getText()); }
	;

addFuzzySetRule [SetFuzzySets sfs]
	:
		(	s=LEFT | s=RIGHT) 		
			( ALL 																									{	sfs.add ($s.getText()); }
			| fs=ID ( AS newFs=ID)?																	{	env.addSetFuzztSets (sfs, $s.getText(), $fs.getText(), $newFs); }
		)
	|	f=HOWINCLUDE 		LP ( s=LEFT | s=RIGHT ) RP	AS fs=ID			{	sfs.addFunction ($f.getText(), s.getText(), $fs.getText()); }		
	|	f=HOWMEET 			LP ( s=LEFT | s=RIGHT ) RP 	AS fs=ID			{	sfs.addFunction ($f.getText(), s.getText(), $fs.getText()); }												
	|	f=HOWINTERSECT 	LP RP												AS fs=ID			{	sfs.addFunction ($f.getText(), null, $fs.getText()); }
	;


// --------------- Basic operators -----------------


getCollectionRule
  : 
  	GET COLLECTION 
	    ( name=ID ( AT db=ID )? 													{ env.addGetCollection ($name, $db, null); }    
	    | FROM WEB (url=APEX_VALUE | url=QUOTED_VALUE)		{ env.addGetCollection ($url); }  )
    SC 
  ;

  
getDictionaryRule
  : 
  	GET DICTIONARY 
	     name=ID AT db=ID AS dict=ID											
	     { env.addGetDictionary ($name, $db, $dict); }    
    SC 
  ;


saveAsRule
  : 
  	SAVE AS 
	    cn=ID ( AT db=ID )?					{ env.addSaveAs ($cn, $db); }     
    SC
  ;


lookupFromWebRule
	:	
		LOOKUP FROM WEB 					{	LookupFromWeb gfw = env.addLookupFromWeb ();	}
			(	fe=forEachRule					{	gfw.addForEach (fe);	}	)+
		SC		
	;


forEachRule	returns [ForEach fe]
	:
		FOR EACH c=orConditionRule
			CALL e=expressionRule			{ fe = new ForEach (c, e); }
	;
	
	
joinOfCollectionsRule
  :
    JOIN OF COLLECTIONS
	    c1=collectionReferenceRule tk=COMMA c2=collectionReferenceRule 	{ JoinCollections jc = env.addJoin (c1, c2, $tk); }
	    ( ON GEOMETRY nff=spatialFunctionRule [true]												{ jc.setCondition (nff); }						)?
	    (	SET GEOMETRY ( g=INTERSECTION | g=RIGHT | g=LEFT | g=ALL )				{ jc.setSetGeometry ($g.getText()); }	)?
      ( addFieldsRule [jc] 																																											)?
      ( sfs=setFuzzySetsRule																							{ jc.setSetFuzzySets (sfs);	}					)?
	    ( cc=caseClauseRule 																								{ jc.setCaseClause (cc); }						)?	    
      ( REMOVE DUPLICATES 																								{	jc.setRemoveDuplicates();	}					)?  
    SC   
  ;
  

filterRule 
  : 
  	FILTER 
       fc=caseClauseRule 						{ Filter f = env.addFilter (fc); }
      ( REMOVE DUPLICATES 						{	f.setRemoveDuplicates(); }				)?  
    SC
  ;
  

groupRule 
  : 
  	GROUP 											{ Group g = env.addGroup (); }
      ( p=groupPartitionRule 						{ g.addPartition (p); } 			)+
      ( oth=othersRule 									{ g.setOthers(oth); }					)?
    SC
  ;


groupPartitionRule returns [Partition p] 
  :
    PARTITION c=orConditionRule					{ p = new Partition (c); }
	    BY fr=fieldRefRule 										{ p.addByField (fr); }
			      ( COMMA fr=fieldRefRule						{ p.addByField (fr); }					)*
      INTO fr=fieldRefRule									{ p.setInto (fr); }
      	(	DROP GROUPING FIELDS							{	p.setDropGroupingFields (); }		)?
      ( ORDER BY	sf=sortingFieldRule				{ p.addSortingField (sf); 		}
      		( COMMA sf=sortingFieldRule				{ p.addSortingField (sf); 		}		)* 
					( KEEP UNCOMPARABLE								{ p.setKeepUncomparable ();		}		)?
			)?
     	( gs=generateSectionRule [false]			{	p.setGenerateSection (gs);	}		)?
  ;


sortingFieldRule returns [SortField sf]
	:
		fr=fieldRefRule
		TYPE t=ID						{	sf = env.createSortField (fr, $t); 	}
		( v=VERSUS 					{	sf.setVersus ($v.getText ());				}		)? 
	;	

expandRule
  :
    EXPAND 										{ Expand e = env.addExpand (); }
      ( u=unpackRule 								{ e.addUnpack (u); } 							)+
      ( oth=othersRule 							{ e.setOthers(oth); }							)?
    SC
  ;


unpackRule returns [Unpack u]
  :
    UNPACK  p=orConditionRule
	    ARRAY fr1=fieldRefRule
	    TO fr2=fieldRefRule						{ u = new Unpack (p, fr1, fr2); } 
  ;

 
mergeCollectionsRule
  :
     MERGE COLLECTIONS 		
     		cr=collectionReferenceRule 								{ MergeCollections mc = env.addMergeCollections (cr); }
		      ( COMMA cr=collectionReferenceRule					{ mc.addCollection (cr); }			)+
		    ( REMOVE DUPLICATES 													{	mc.setRemoveDuplicates(); }		 		)?  
    SC
  ;
  

intersectCollectionsRule
  :
    INTERSECT COLLECTIONS 
    	cr1=collectionReferenceRule COMMA cr2=collectionReferenceRule					{ env.addInstersectCollections (cr1, cr2); }
    SC
  ;
  
  
subtractCollectionsRule
  :
    SUBTRACT COLLECTIONS 
			cr1=collectionReferenceRule COMMA cr2=collectionReferenceRule					{ env.addSubtractCollections (cr1, cr2); }
    SC
  ;
  
  
useDbRule
@init { DbName db = null; }
  :
    USE { UseDb ud = env.addUseDb (); }
      DB (d=ID | d=APEX_VALUE)          	{ db = new DbName ($d.getText()); }
        (AS (a=ID | a=APEX_VALUE)         { db.setAlias ($a.getText()); }      )? 
                                          { ud.addDb (db); }    

        ( COMMA DB (d=ID | d=APEX_VALUE)  { db = new DbName ($d.getText()); }
               ( AS (a=ID | a=APEX_VALUE) { db.setAlias ($a.getText()); }      )? 
                                          { ud.addDb (db); }    
        )*
	    ON 
	      ( DEFAULT SERVER 
	      | SERVER 
	        (d=ID | d=APEX_VALUE) 					{ ud.setServer ($d.getText()); }
	        ( (d=ID | d=APEX_VALUE) 				{ ud.setConnectionString ($d.getText()); } )?
	      )
    SC
  ;  
  
  
trajectoryMatchingRule 
  :
    TRAJECTORY MATCHING
      cr1=collectionReferenceRule COMMA cr2=collectionReferenceRule			{ TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); }
      ( tp=trajectoryPartitionRule																					{ tm.addPartition (tp); }				)+
      ( oth=othersRule 																											{ tm.setOthers (oth); }					)?
    SC
  ;  
  
  
trajectoryPartitionRule returns [TrajectoryPartition tp]
  :
    PARTITION 
	    c=orConditionRule 								{ tp = new TrajectoryPartition (c); }
	    ( tpm=partitionMatchingRule							{ tp.addPartitionMatching (tpm);  }  		)+
  ;


partitionMatchingRule  returns [PartitionMatching pt]
  :
    MATCHING fr1=fieldRefRule
	    WRT fr2=fieldRefRule
	    THRESHOLD LP	u=ID  RP v=numericRule					{ pt = env.setThreshold (fr1, fr2, $u, v); }
	    ( WHERE wc=orConditionRule 										{ pt.setWhereCondition (wc); } 		)?
	    INTO fr3=fieldRefRule 												{ pt.setInto (fr3); }
	    ( ADDING fr4=fieldRefRule TO INPUT 						{ pt.setPathToInput (fr4);	} 		)?
	    ( MIN_SIMILARITY n=numericRule  							{ pt.setMinSimilarity (n); } 			)?    
  ;
  



parameterRule [ParamList pl] returns [Parameter p]
	:	
		v=ID										{	env.checkParameterDeclaration ($v, pl); } 
		TYPE t=ID								{	p = env.createParameter ($v, $t); }
	;

  
createJavaScriptFunctionRule
	:
		CREATE_JF 
			jsfn=ID 																										{ JavascriptFunction jsf = env.addJavascriptFunction ($jsfn); }
			PARAMETERS 	
				p=parameterRule [jsf.getParamList()] 													{ jsf.parameters.add (p); }
				( COMMA p=parameterRule [jsf.getParamList()]										{ jsf.parameters.add (p);}   )*
			(	PRECONDITION pc=jfOrConditionRule [jsf.getParamList(), true]	{	jsf.preCondition = pc; } 		)?
			BODY 
					{ // ANTLR 3.4 apparently do not support multi context, so scanning must be performed this way
						int res = JavascriptFunction.NO_BEGIN;
						Token myToken = null;
						Token wsToken = null;
						boolean started = false;
						while (input.LA(1)!= END_BODY) {						
							myToken = input.LT(1);
							wsToken = input.get(myToken.getTokenIndex()-1);
							if (started && wsToken.getType() == WHITE_SPACES)
								jsf.addJavascriptWS(wsToken.getText());
							res = env.addJSFbody(jsf, myToken);
							started = true;
							input.consume();
						}
						env.checkJSFbody (res, myToken);		
					}
			END_BODY		
		SC
	; 
	
	
createFuzzyOperatorRule 
		:		
			CREATE_FO f=ID																							{ FuzzyOperator fo = env.addFuzzyOperator ($f); }
			PARAMETERS 	
				p=parameterRule [fo.getParamList()] 													{ fo.parameters.add (p); }
				( COMMA p=parameterRule [fo.getParamList()]												{ fo.parameters.add (p);}   )*
			( PRECONDITION pc=jfOrConditionRule [fo.getParamList(), false]	{ fo.preCondition = pc; }			)?
			EVALUATE e=jfExpressionRule [fo.getParamList(), false]							{ fo.evaluate = e; }	
			POLYLINE 	LB
									LP x=numericRule COMMA y=numericRule RP							{ env.addFuzzyPolylinePoint (fo, x, y); }
									( COMMA LP x=numericRule COMMA y=numericRule RP 				{ env.addFuzzyPolylinePoint (fo, x, y); }		)*
								RB
		SC
	;  


 
jfOrConditionRule [ParamList pl, boolean jsCaller] returns [Condition c]
  : 
    c1=jfAndConditionRule [pl, jsCaller] 						{ c = new ConditionOr (c1); }
			( OR c2=jfAndConditionRule [pl, jsCaller] 					{ ((ConditionOr)c).addCondition (c2); } 	)*
																								{ c = env.simplifyConditionOr ((ConditionOr)c); }
  ;

 

jfAndConditionRule [ParamList pl, boolean jsCaller] returns [Condition c]
  : 
    c1=jfNotConditionRule [pl, jsCaller] 						{ c = new ConditionAnd (c1); }
    ( AND c2=jfNotConditionRule [pl, jsCaller] 					{ ((ConditionAnd)c).addCondition (c2); } 	)*
																								{ c = env.simplifyConditionAnd ((ConditionAnd)c); }
  ;


jfNotConditionRule [ParamList pl, boolean jsCaller] returns [Condition c]
  : 
    ( not=NOT )?
    p=jsfPredicateRule[pl, jsCaller] 					{ c = env.createCondition (not, p); }    
  ;



jsfPredicateRule [ParamList pl, boolean jsCaller] returns [Predicate p]
  :
  	e1=jfExpressionRule [pl, jsCaller]						{	p	=	e1; 	}
    	(	cp=jfCompareRule [e1, pl, jsCaller]				{ p = cp; 	} 
     	| irp=inRangeRule [e1]											{ p = irp; 	}		)?  		
  ;


jfCompareRule [Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p]
	:
    c=comparatorRule 
    e2=jfExpressionRule [pl, jsCaller]						{ p = new ComparisonPredicate (e1, c.getText(), e2); } 
	;


jfExpressionRule [ParamList pl, boolean jsCaller] returns [Expression expr]
@init { expr = new Expression (); }
  : 
  	(	t=jfTermRule [pl, jsCaller]										{ expr.addTerm (t, null); }
  	|	(s=ADD | s=SUB) t=jfTermRule [pl, jsCaller]		{ expr.addTerm (t, $s.getText()); } )
    ( (s=ADD | s=SUB) t=jfTermRule [pl, jsCaller] 		{ expr.addTerm (t, $s.getText()); }	)*
  ;


jfTermRule [ParamList pl, boolean jsCaller] returns [ExpressionTerm et]
@init { et = new ExpressionTerm (); }
  : 
  	f=jfFactorRule [pl, jsCaller]											{ et.addFactor(f, null);}
    ( (s=MUL | s=DIV) f=jfFactorRule [pl, jsCaller] 			{ et.addFactor(f, s.getText());}		)*
  ;
  
  
jfFactorRule [ParamList pl, boolean jsCaller] returns [ExpressionFactor expr]
  : 
	  	LP op=jfOrConditionRule [pl, jsCaller] RP										{ expr = new ExpressionFactor (op); }
	  | v=INT																												{ expr = new ExpressionFactor (new Value(Value.INT, $v.getText())); }
	  | v=FLOAT																											{ expr = new ExpressionFactor (new Value(Value.FLOAT, $v.getText())); }
	  | v=APEX_VALUE																								{ expr = new ExpressionFactor (new Value(Value.APEX, $v.getText())); }
	  | v=QUOTED_VALUE																							{ expr = new ExpressionFactor (new Value(Value.QUOTED, $v.getText())); }
	  | x=ID 																												
	  		(p1=LP (fp=jfFunctionParamsRule [pl, jsCaller])? RP)? 		{ expr = env.checkJFFactor($x, $p1, fp, pl, jsCaller); }        
  ;
  

jfFunctionParamsRule [ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params]
  @init{ params = new ArrayList<Expression>(); }
  : 
  	e=jfExpressionRule [pl, jsCaller] 							{ params.add(e); }
    	( COMMA e=jfExpressionRule [pl, jsCaller] 				{ params.add(e); }		)*
  ;



  

// ************************************
// ***
// ***            SCANNER  
// ***
// ************************************

fragment LETTER : 'A'..'Z'|'a'..'z';
fragment DIGIT0 : '1'..'9';
fragment DIGIT  : '0'..'9';
fragment WS
  :   ( ' '           
      | '\t'
      | '\r'
      | '\n'
      )+ 
  ;



// boolean Operator
AND : 'AND';
OR  : 'OR';
NOT : 'NOT';

// keywords
ADDING					: 'ADDING';
ADD_ST  	 			: 'ADD';
AGGREGATE 	    : 'AGGREGATE';
ALL         	  : 'ALL';
ALPHACUT				:	'ALPHACUT';
ARRAY   	      : 'ARRAY';
ARRAY_FUNCTION	:	( 'MIN' | 'MAX' | 'AVG' | 'SUM') '_ARRAY';
AS        	    : 'AS';
BODY						:	'BODY' 							{	env.disableScannerError();	}; 
END_BODY				:	'END' WS 'BODY' 		{	env.enableScannerError();		};
BOOLEAN 	      : 'TRUE' | 'FALSE';
BUILD 					: 'BUILD';
BY          	  : 'BY';
CALL          	: 'CALL';
CASE          	: 'CASE';
CHECK_FOR				: 'CHECK' WS 'FOR';
COLLECTION  	  : 'COLLECTION';
COLLECTIONS   	: 'COLLECTIONS';
CREATE_FO				:	'CREATE' WS 'FUZZY' WS 'OPERATOR';
CREATE_JF				: 'CREATE' WS 'JAVASCRIPT' WS 'FUNCTION';
DB      	      : 'DB';
DEFAULT					: 'DEFAULT';
DEFUZZIFY				:	'DEFUZZIFY';
DICTIONARY			:	'DICTIONARY';
DIRECTION				:	'DIRECTION';
DISTANCE				:	'DISTANCE';
DOCUMENTS				:	'DOCUMENTS';
DROP  	        : 'DROP';
DROPPING      	: 'DROPPING';
DUPLICATES  	  : 'DUPLICATES';
EACH						: 'EACH';
EXPAND    	    : 'EXPAND';
EVALUATE				:	'EVALUATE';
FIELD						: 'FIELD';
FIELDS					: 'FIELDS';
FILTER    	    : 'FILTER';
FIRST	  	      : 'FIRST';
FOR							: 'FOR';
FROM						: 'FROM';
FUZZY						: 'FUZZY';
GENERATE				:	'GENERATE';
GEOMETRY  	    : 'GEOMETRY';
GET         	  : 'GET';
GROUP         	: 'GROUP';
GROUPING	      : 'GROUPING';
HOWINCLUDE			:	'HOW_INCLUDE';
HOWINTERSECT		:	'HOW_INTERSECT';
HOWMEET					:	'HOW_MEET';
IF_ERROR				: 'IF_ERROR';
IF_FAILS				: 'IF_FAILS';
INCLUDED    	  : 'INCLUDED';
INPUT		      	: 'INPUT';
INRANGE		      : 'IN_RANGE';
INTERSECT				: 'INTERSECT';
INTERSECTION	  : 'INTERSECTION';
INTO	          : 'INTO';
ISNULL					: 'IS' WS 'NULL';
ISNOTNULL				: 'IS' WS 'NOT' WS 'NULL';
JOIN      	    : 'JOIN';
KEEP        	  : 'KEEP';
KEEPING       	: 'KEEPING';
KNOWN						:	'KNOWN';
LAST  	        : 'LAST';
LEFT    	      : 'LEFT';
LOOKUP 					:	'LOOKUP';
MATCHING  	    : 'MATCHING';
MEET        	  : 'MEET';
MEMBERSHIP_OF 	:	'MEMBERSHIP_OF';	
MERGE         	: 'MERGE';
MIN_SIMILARITY	:	'MIN' WS 'SIMILARITY';
OF        	    : 'OF';
ON       	  	  : 'ON';
ORIENTATION  	  : 'ORIENTATION';
OTHERS					: 'OTHERS';
ORDER						: 'ORDER' | 'SORTED';
PARAMETERS			:	'PARAMETERS';
PARTITION 			: 'PARTITION';
POINT						: 'POINT';
POLYLINE				:	'POLYLINE';
PRECONDITION		:	'PRECONDITION';
RESOLVING				:	'RESOLVING';
RIGHT     	    : 'RIGHT';
REMOVE      	  : 'REMOVE';
SAVE          	: 'SAVE';
SERVER     	  	: 'SERVER';
SET        	  	: 'SET';
SETS        	  : 'SETS';
SETTING  	    	: 'SETTING';
SUBTRACT  	    : 'SUBTRACT';
TO          	  : 'TO';
TO_POLYLINE 	  : 'TO_POLYLINE';
THRESHOLD 	    : 'THRESHOLD';
TRANSLATE				: 'TRANSLATE';
TRAJECTORY 	  	: 'TRAJECTORY';
TYPE						:	'TYPE';
UNCOMPARABLE		:	'UNCOMPARABLE';
UNKNOWN					:	'UNKNOWN';
UNPACK	        : 'UNPACK';
USE     	      : 'USE';
USING     	    : 'USING';
VERSUS      	  : 'DESC' | 'ASC';
WEB							: 'WEB';
WHERE	         	: 'WHERE';
WITH  	        : 'WITH';
WITHIN  	      : 'WITHIN';
WITHOUT   	    : 'WITHOUT';
WRT           	: 'WRT';


INT			: '0' | DIGIT0 DIGIT* ;
FLOAT		: DIGIT0 DIGIT* DOT DIGIT+ | '0' DOT DIGIT+; 

ID			: LETTER (LETTER | DIGIT | '_')*;

FIELD_NAME		: DOT (LETTER | DIGIT | TILDE | '_')+  
     		      | DOT '"' (~('"') )* '"'
       ;


// puntuaction
AT    : '@';
EQ    : '=';
NEQ   : '!=';
LE    : '<=';
GE    : '>=';
LT    : '<';
GT    : '>';
DOT   : '.';
ADD   : '+';
SUB   : '-';
MUL   : '*';
DIV   : '/';
COMMA : ',';
COLON : ':';
SC    : ';';
LP    : '(';
RP    :	 ')';
LB    : '[';
RB    : ']';
LBR   : '{';
RBR   : '}';
APEX  : '\'';
QUOTE : '"';
TILDE : '~';
XXX   : '###TEST***';



WHITE_SPACES 
  : WS { $channel = HIDDEN; } ; 

APEX_VALUE
  :  '\'' (~('\'') )* '\'' ;

QUOTED_VALUE
  :  '"' (~('"') )* '"' ;
	
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n'			 									{	$channel = HIDDEN;	}
    |   '/*' ( options {	greedy = false;	} : . )* '*/' 		{	$channel = HIDDEN;	}
    ;


SCAN_ERROR   
  : .					{ env.myScannerErrorHandler(getLine(), getCharPositionInLine(), getText());	}
  ;
 