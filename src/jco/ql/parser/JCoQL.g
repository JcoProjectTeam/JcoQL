/* *****************************************
***** Parser JCoQL Antlr Specification *****
***************************************** */

//ver4.0
grammar JCoQL;

options {
  language = Java;
  k=4;							// Too many instruction starting with the same prefixes.
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
	public static final String release = "4.0.10";
 	JCoQLEnvironment env;

  public JCoQLParser(JCoQLLexer lexer) {		
		this(new CommonTokenStream(lexer));
		env = new JCoQLEnvironment(input, version, release);
		lexer.setEnvironment(env);
	}
	// 2021.12.14 - These constructors are added to avoid to create a lexer outside the parser
  public JCoQLParser(FileReader fileIn) throws IOException {		
		this(new CommonTokenStream(null));
		JCoQLLexer lexer = new JCoQLLexer(new ANTLRReaderStream(fileIn)); 
		input = new CommonTokenStream(lexer);
		env = new JCoQLEnvironment(input, version, release);
		lexer.setEnvironment(env);
	}
  public JCoQLParser(String docIn) throws IOException {		
		this(new CommonTokenStream(null));
		JCoQLLexer lexer = new JCoQLLexer(new ANTLRReaderStream(new StringReader (docIn))); 
		input = new CommonTokenStream(lexer);
		env = new JCoQLEnvironment(input, version, release);
		lexer.setEnvironment(env);
	}
  
  public JCoQLEnvironment getEnvironment() {
    return env;
  }
  
  public List<String> getErrorList () {
    return env.errorList;
  }

  public List<String> getWarningList () {
    return env.warningList;
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
  JCoQLEnvironment env;

  void setEnvironment (JCoQLEnvironment e) {
    env = e;
  }
}


// ########### Syntax Rules ###########

// Start Symbol
start 
  : ( useDbRule                     	    // 12
    |	getCollectionRule             	    // 1
    | getDictionaryRule										// 16
    | lookupFromWebRule										// 17
    | saveAsRule                    	    // 3

    | mergeCollectionsRule          	    // 9
    | intersectCollectionsRule      	    // 10
    | subtractCollectionsRule       	    // 11
// 
    | filterRule                    	    // 6
    | joinOfCollectionsRule         	    // 4
    | trajectoryMatchingRule    			    // 13

    | groupRule                     	    // 7
    | expandRule                    	    // 8

    | createJavaScriptFunctionRule				// 15
    | createJavaFunctionRule							// 21 PF news

    |	createFuzzyOperatorRule							// 14
    | createFuzzyAggregatorRule     			// 18 - Invernici
    | createFuzzyEvaluatorRule						// 22 PF news

    | createFuzzySetModelRule							// 19 - Balicco			FuzzySetType renamed in FuzzySetModel
    | createGenericFuzzySetOperatorRule		// 20 - Balicco
    | createGenericFuzzyEvaluatorRule	    // 23 Bressanelli

    | test                      					// istruzione di test...
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
    	     os=objectStructureRule [true]	{ ga.setBuildObjectStructure (os); }	
	|	ADD_ST FIELDS
	     os=objectStructureRule [true]			{ ga.setAddObjectStructure (os); }	
	| REMOVE FIELDS
			LBR fr=fieldRefRule 								{ ga.setRemoveField (fr); }
				(COMMA fr=fieldRefRule 						{ ga.setRemoveField (fr); }				)* 
			RBR
  ;


// modficata il 10.03.2022
objectStructureRule [boolean generateActionCaller] returns [ObjectStructure obj]
  :
    LBR 
      ofs=outputFieldSpecRule							{ obj = new ObjectStructure (ofs); }
	      ( t=COMMA ofs=outputFieldSpecRule 			{ env.addOutputFieldSpec (obj, ofs, generateActionCaller, $t); }   )*
    RBR
  ;


// modified on 2022.03.30
outputFieldSpecRule returns [OutputFieldSpec ofs]
  :
    fr=fieldRefRule					{ ofs = new OutputFieldSpec (fr); }
    (	COLON ( os=objectStructureRule [false]																						{ ofs.setFieldSpec (os); 	}
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
    ( c=CASES | c=CASE ) 						{ cc = env.newCaseClause ($c); }
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
   	 	( ga=buildActionRule 						{ gs.addBuildAction (ga); 			}	)*
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
	  (	LP op=orConditionRule RP						   		{ ef = new ExpressionFactor (op); }			// sub expression between ()
	  |	fr=fieldRefRule														{ ef = new ExpressionFactor (fr); }			//	fieldref
	  | vl=valueRule															{	ef = new ExpressionFactor (vl);	}			//	simple value
	  | x=ID LP (fp=functionParamsRule)? RP				{ ef = env.buildFunction ($x, fp); } 		//	normal function call...
	  | sf=specialFunctionRule										{	ef = sf; }														// special function
	  | LB f=factorRule														{ ef = new ExpressionFactor (f); }			//	array value
	  		(	COMMA f=factorRule										{	ef.addArrayValue (f); }																			
	  	)* RB
	  )	
	  (	EXP e=factorRule 													{	ef.addExp (e); } )?										// exponent (when applicable)
  ;



specialFunctionRule returns [SpecialFunctionFactor expr]
	:
			mt=MEMBERSHIP_TO 	LP fs=ID RP																								{	expr = env.buildMembershipTo ($mt, $fs); 	}
		|	EXTENT 						LP fs=ID RP																								{	expr = env.buildExtent ($fs); 						}
		| DEGREE 						LP fs=ID dg=FIELD_NAME? RP																{	expr = env.buildDegree ($fs, $dg, true);	}		// Balicco		
		| fs=HASH_NAME 							dg=FIELD_NAME? 																		{	expr = env.buildDegree ($fs, $dg, false);	}		// pf 2025-01-09
		|	MEMBERSHIP_ARRAY 	LP																												
			(	ALL 																																			{ expr = new MembershipArray (); }	
			|	fuzzySet=ID FROM_ARRAY array=fieldRefRule																	{ expr = env.createMembershipArray ($fuzzySet, array); }
			| LB fuzzySet=ID  																													{ expr = env.createMembershipArray ($fuzzySet); }
				( COMMA fuzzySet=ID																												{ env.addMembershipArray ((MembershipArray)expr, $fuzzySet); } 				)* 
				RB
			)	RP
		| EXTRACT_ARRAY			LP field=fieldRefRule FROM_ARRAY array=fieldRefRule RP		{	expr = env.createExtractArray(field, array); }
		| IF LP LP co=orConditionRule RP																							// pf 2025.02.26 - double parenthesis for prospection issues with WITH and WITHOUT Predicates
				COMMA et=restrictedExpressionRule
				COMMA ef=restrictedExpressionRule RP																			{	expr = env.buildIfFunction (co, et, ef); }
		| IF_ERROR					LP e=restrictedExpressionRule COMMA v=valueRule RP				{	expr = env.buildIfError (e, v); 					}
		|	TRANSLATE 				LP e=restrictedExpressionRule COMMA dict=ID 
				    							( COMMA cs=BOOLEAN 
				    								( COMMA (d=APEX_VALUE | d=QUOTED_VALUE) )? )?	RP			{	expr = env.buildTranslate 	(e, $dict, $cs, $d); 	}	
		| a=arrayFunctionRule 																												{ expr = a; }
	;


valueRule returns [Value vl]
  : 
  		n=INT           { vl = new Value (Value.INT, $n.getText()); 		}
		| f=FLOAT         { vl = new Value (Value.FLOAT, $f.getText());		}
	  | b=BOOLEAN       { vl = new Value (Value.BOOLEAN, $b.getText());	}
	  | a=APEX_VALUE    { vl = new Value (Value.APEX, $a.getText()); 		}
	  | q=QUOTED_VALUE  { vl = new Value (Value.QUOTED, $q.getText());	}
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
		( LP ex=restrictedExpressionRule RP					{ ef = new ExpressionFactor (ex); }			// sub expression between ()
	  |	fr=fieldRefRule														{ ef = new ExpressionFactor (fr); }			//	fieldref
	  | vl=valueRule															{	ef = new ExpressionFactor (vl);	}			//	simple value
	  | x=ID LP (fp=functionParamsRule)? RP				{ ef = env.buildFunction ($x, fp); } 		//	normal function call...
	  | sf = specialFunctionRule									{	ef = sf;	}														//	special function
	  | LB f=restrictedFactorRule									{ ef = new ExpressionFactor (f); }			//	array value
	  		(	COMMA f=restrictedFactorRule					{	ef.addArrayValue (f); }																			
	  	)* RB
	  )
	  (	EXP e=restrictedFactorRule 								{	ef.addExp (e); } )?										//	// exponent (when applicable)	  
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
/* Modifica 1.Invernici; 2.Balicco */
checkForFuzzySetRule [GenerateSection gs]
	:	
		CHECK_FOR ty=ID? FUZZY SET fs=ID USING  fe=usingOrConditionRule 	{ env.addCheckForFuzzySet (gs, $fs, fe, $ty); } 
			( 																															{	$ty = null; }
				COMMA ty=ID? FUZZY SET fs=ID	USING fe=usingOrConditionRule 	{ env.addCheckForFuzzySet (gs, $fs, fe, $ty); }		)*
	;



usingOrConditionRule returns [Condition c]
  : 
    c1=usingAndConditionRule 						{ c = new ConditionOr (c1); }
			( OR c2=usingAndConditionRule 					{ ((ConditionOr)c).addCondition (c2); } 	)*
																		{ c = env.simplifyConditionOr ((ConditionOr)c); }
  ;

/* Fine modifiche Invernici*/
	

 
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

//FI modified
usingPredicateRule returns [Predicate p]
  :
  	LP c=usingOrConditionRule RP														{	p = new UsingPredicate (c); }
	| x=ID (LP (fp=functionParamsRule)? RP)?									{	p = new UsingPredicate ($x.getText(), fp); }        
	| IF_FAILS LP 
			c=usingOrConditionRule COMMA n=numericRule 						{ p = new UsingPredicate (c, n); }
		RP
	;


alphaCutRule [GenerateSection gs]
	:
		ALPHACUT 	n=numericRule ON on=ID de=FIELD_NAME? 		{	env.addAlphaCut (gs, n, $on, $de); }
			(																									{ $de = null; }
				COMMA	n=numericRule ON on=ID de=FIELD_NAME? 		{ env.addAlphaCut (gs, n, $on, $de); }	)*
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
		ADD_ST FIELDS 																					
			LBR
				f=fieldRefRule COLON af=insertFieldRule[f]  							{ jc.addAddField (af); }
				( COMMA f=fieldRefRule COLON af=insertFieldRule[f] 				{ jc.addAddField (af); } 		)*	
			RBR
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
	    | FROM_WEB (url=APEX_VALUE | url=QUOTED_VALUE)		{ env.addGetCollection ($url); }  )
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
		LOOKUP FROM_WEB 					{	LookupFromWeb lfw = env.addLookupFromWeb ();	}
			(	fe=forEachRule					{	lfw.addForEach (fe);	}	)+
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
	    ( cc=caseClauseRule 																								{ jc.setCaseClause (cc); }						
	    |	gs=generateSectionRule [true]																			{	jc.setGenerateSection (gs);	}				)?
      ( REMOVE DUPLICATES 																								{	jc.setRemoveDuplicates();	}					)?  
    SC   
  ;
  

filterRule 
@init {	Filter f=null;	}
  : 
  	FILTER 
  		(	fc=caseClauseRule 							{ f = env.addFilter (fc); }
  		|	gs=generateSectionRule [true]		{	f = env.addFilter (gs);	}			)
      ( REMOVE DUPLICATES 							{	f.setRemoveDuplicates(); }		)?  
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
  


// PF 05.05.2024 - params type is checked only for FO, not for Java or Javascript
parameterRule [ParamList pl, boolean check] returns [Parameter p]
	:	
		v=ID										{	env.checkParameterDeclaration ($v, pl); } 
		TYPE t=ID								{	p = env.createParameter (check, $v, $t); }
	;


createJavaScriptFunctionRule
	:
			CREATE JAVASCRIPT FUNCTION
				jsfn=ID 																											{ JavascriptFunction jsf = env.addJavascriptFunction ($jsfn); }
			PARAMETERS 	
				p=parameterRule [jsf.getParamList(), false] 											{ jsf.parameters.add (p); }
				( COMMA p=parameterRule [jsf.getParamList(), false]								{ jsf.parameters.add (p);}  	)*
			(	PRECONDITION pc=jfOrConditionRule [jsf.getParamList(), true]			{	jsf.preCondition = pc; } 		)?
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
	

// 2025.02.27 - Going to be depracated - Included in FuzzyEvaluator	
createFuzzyOperatorRule 
		:		
			CREATE FUZZY OPERATOR f=ID																			{ FuzzyOperator fo = env.addFuzzyOperator ($f); }
			PARAMETERS 	
				p=parameterRule [fo.getParamList(), true] 											{ fo.parameters.add (p); }
				( COMMA p=parameterRule [fo.getParamList(), true]										{ fo.parameters.add (p);}   )*
			( PRECONDITION pc=jfOrConditionRule [fo.getParamList(), false]		{ fo.preCondition = pc; }			)?
			EVALUATE e=jfExpressionRule [fo.getParamList(), false]								{ fo.evaluate = e; }	
			( POLYLINE 	LB
										LP x=numericRule COMMA y=numericRule RP							{ env.addFuzzyPolylinePoint (fo, x, y); }
										( COMMA LP x=numericRule COMMA y=numericRule RP 				{ env.addFuzzyPolylinePoint (fo, x, y); }		)+
									RB )?
		SC
	;  
	
	
// PF 02.07.2024
createFuzzyEvaluatorRule
	:	
		CREATE FUZZY EVALUATOR n=ID  																		{ FuzzyEvaluator fe = env.addFuzzyEvaluator ($n); }
			PARAMETERS 
				feParameterRule [fe]																						
				( COMMA feParameterRule [fe]																																					)* 		
			( PRECONDITION pc=jfOrConditionRule [fe.getParamList(), true]				{ fe.preCondition = pc; }						)?
			(	s=feArraySortRule[fe]																							{ fe.feInternalClauseList.add(s);	}	
			| d=feDeriveRule[fe]																								{ fe.feInternalClauseList.add(d);	}	
			| f=feForAllRule[fe]																								{ fe.feInternalClauseList.add(f);	}	)*
			EVALUATE e=feExpressionRule [fe, null] 															{ fe.evaluate = e;								} 
			(	POLYLINE LB
					LP x=numericRule COMMA y=numericRule RP													{ env.addFuzzyEvaluatorPolylinePoint (fe, x, y); }
					( COMMA LP x=numericRule COMMA y=numericRule RP 								{ env.addFuzzyEvaluatorPolylinePoint (fe, x, y); }		)+
				RB )?
		SC
	;


/* ********* START Invernici contribution ********* */
// PF - fuzzy aggregator... are a litte differnt from fuzzy evaluator
// 2025.02.27 - Going to be depracated - Included in FuzzyEvaluator	
createFuzzyAggregatorRule
	:	
		CREATE FUZZY AGGREGATOR n=ID  																		{ FuzzyEvaluator fe = env.addFuzzyAggregator ($n); }
			PARAMETERS 
				feParameterRule [fe]																						
				( COMMA feParameterRule [fe]																																					)* 		
			( PRECONDITION pc=jfOrConditionRule [fe.getParamList(), false]			{ fe.preCondition = pc; }						)?
			( s=feArraySortRule[fe]																							{ fe.feInternalClauseList.add(s); }	)*
			(	f=feForAllRule[fe]																								{ fe.feInternalClauseList.add(f); }
			| d=feDeriveRule[fe]																								{ fe.feInternalClauseList.add(d); }	)+
			EVALUATE e=feExpressionRule [fe, null] 															{ fe.evaluate = e; } 
			(	POLYLINE LB
					LP x=numericRule COMMA y=numericRule RP													{ env.addFuzzyEvaluatorPolylinePoint (fe, x, y); }
					( COMMA LP x=numericRule COMMA y=numericRule RP 								{ env.addFuzzyEvaluatorPolylinePoint (fe, x, y); }		)+
				RB )?
		SC
	;

	
feForAllRule [FuzzyEvaluator fe] returns [FEForAllClause fac]
	: 
		FOR ALL v=ID IN ar=ID  															{ fac = env.createForAllClause($v, $ar, fe);	}
			( LB 	x1=feExpressionRule [fe, null] 								{ fac.firstIndex = x1; }
					COMMA	x2=feExpressionRule [fe, null] RB 				{ fac.lastIndex  = x2; }														)? 
			( LOCALLY e=feExpressionRule [fe, fac] AS id=ID 		{ env.createLocallyClause(fac, $id, e, fe); 	} 	
				(	COMMA e=feExpressionRule [fe, fac] AS id=ID 		{ env.createLocallyClause(fac, $id, e, fe); 	} )* 	)?
			AGGREGATE ac=aggSpecRule [fe, fac]									{ fac.aggregate.add(ac);}
			( COMMA ac=aggSpecRule [fe, fac]										{ fac.aggregate.add(ac);}														)*
			
	;


// modified on 2024.06-24
feDeriveRule [FuzzyEvaluator fe] returns [FEDeriveClause dc]
@init {	int dt = FEDeriveClause.DERIVE_SCALAR; }	
	: 
		DERIVE (	e=feExpressionRule [fe, null]		
					 |	e=feCumulateRule [fe]  				{ dt = FEDeriveClause.DERIVE_ARRAY; } 	)
			AS id=ID 															{ dc = env.createDeriveClause($id, e, fe, dt); 	} 
				 
	;

// added on 2024.06-24
feCumulateRule [FuzzyEvaluator fe] returns [Expression feExpr]
	:
		CUMULATE LP a=ID RP	{	feExpr = env.getCumulateArray (fe, $a); }	
	;


feArraySortRule [FuzzyEvaluator fe] returns [FESortArrayClause sac]
@init{ sac = new FESortArrayClause (); }
	:	SORT
		(	feArrayIndexRule[fe, sac] 
				BY  feSortFieldRule[fe, sac] 
					( COMMA feSortFieldRule[fe, sac] )* 
				AS i1=ID																			{ env.setFuzzyEvaluatorNewArray (fe, sac, $i1); }
		| LP feArrayIndexRule[fe, sac] 
				( COMMA feArrayIndexRule[fe, sac]  )+ RP 
				BY feSortFieldRule[fe, sac] 
					( COMMA feSortFieldRule[fe, sac] )* 
				AS LP i2=ID 																	{ env.setFuzzyEvaluatorNewArray (fe, sac, $i2); }
					( COMMA i3=ID																{ env.setFuzzyEvaluatorNewArray (fe, sac, $i3); }		)+ RP
		)																									{	env.checkFuzzyEvaluatorSortingList (sac); }
	;

feArrayIndexRule [FuzzyEvaluator fe, FESortArrayClause sac]
	:
		i=ID IN a=ID										{ env.addFuzzyEvaluatorSortingArray (fe, sac, $i, $a); }
	;

feSortFieldRule [FuzzyEvaluator fe, FESortArrayClause sac]
	:
		i=ID (f=fieldRefRule)?  					
		TYPE t=ID 
		( v=VERSUS )?											{ env.addFuzzyEvaluatorSortingField (fe, sac, $i, f, $t, $v); }
	;
	

aggSpecRule [FuzzyEvaluator fe, FEForAllClause fac] returns [AggregateClause ac]
	:	
		( wt=withSpec )? 
		e=feExpressionRule [fe, fac] 
		AS a=ID 													{ ac = env.createAggregateClause(wt, e, $a, fe, fac);}
	;

withSpec returns [String s]
	:
		 WITH (	x=SUM 
		 			| x=PRODUCT 
		 			| x=MINIMUM 
		 			| x=MAXIMUM ) 							{s = $x.getText();}
	 ;
	

feParameterRule [FuzzyEvaluator fe] 
	:	
		p=ID															
		TYPE (t=ID | t=ARRAY)							{	env.createFEParameter (fe, $p, $t); 			}
	;

/* ********* END Invernici contribution ********** */


jfOrConditionRule [ParamList pl, boolean jsCaller] returns [Condition c]
  : 
    c1=jfAndConditionRule [pl, jsCaller] 						{ c = new ConditionOr (c1); }
			( OR c2=jfAndConditionRule [pl, jsCaller] 				{ ((ConditionOr)c).addCondition (c2); } 	)*
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
	  (	LP op=jfOrConditionRule [pl, jsCaller] RP										{ expr = new ExpressionFactor (op); }
	  | v=INT																												{ expr = new ExpressionFactor (new Value(Value.INT, $v.getText())); }
	  | v=FLOAT																											{ expr = new ExpressionFactor (new Value(Value.FLOAT, $v.getText())); }
	  | v=APEX_VALUE																								{ expr = new ExpressionFactor (new Value(Value.APEX, $v.getText())); }
	  | v=QUOTED_VALUE																							{ expr = new ExpressionFactor (new Value(Value.QUOTED, $v.getText())); }
		| IF LP LP co=jfOrConditionRule [pl, jsCaller] RP							// added 2025.02.26 - *** double parenthesis - see special functions
				COMMA et=jfExpressionRule [pl, jsCaller] 
				COMMA ef=jfExpressionRule [pl, jsCaller] RP								{	expr = env.buildIfFunction (co, et, ef); }
	  | x=ID 																												
	  		(	p1=LP (fp=jfFunctionParamsRule [pl, jsCaller])? RP)? 		{ expr = env.checkJFFactor($x, $p1, fp, pl, jsCaller); }        
	  ) 
	  (	EXP e=jfFactorRule [pl, jsCaller]														{	expr.addExp (e); } )?
  ;
  

jfFunctionParamsRule [ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params]
  @init{ params = new ArrayList<Expression>(); }
  : 
  	e=jfExpressionRule [pl, jsCaller] 							{ params.add(e); }
    	( COMMA e=jfExpressionRule [pl, jsCaller] 				{ params.add(e); }		)*
  ;


/* Modifica Invernici: Parte espressione per la fuzzy aggregation*/

feExpressionRule [FuzzyEvaluator fe, FEForAllClause fac] returns [Expression expr]
@init { expr = new Expression (); }
  : 
  	(	t=feTermRule	[fe, fac]									{ expr.addTerm (t, null); }
  	|	(s=ADD | s=SUB) t=feTermRule [fe, fac]	{ expr.addTerm (t, $s.getText()); } )
    ( (s=ADD | s=SUB) t=feTermRule [fe, fac]	{ expr.addTerm (t, $s.getText()); }	)*
  ;
  
feTermRule [FuzzyEvaluator fe, FEForAllClause fac] returns [ExpressionTerm et]
@init { et = new ExpressionTerm (); }
  : 
  	f=feFactorRule 	[fe, fac]										{ et.addFactor(f, null);}
    ( (s=MUL | s=DIV) f=feFactorRule  [fe, fac]	{ et.addFactor(f, s.getText());}		)*
  ;
  

  
feFactorRule [FuzzyEvaluator fe, FEForAllClause fac] returns [ExpressionFactor expr]
  : 
  	(	LP e=feExpressionRule [fe, fac] RP											{ expr = new ExpressionFactor (e); 	}																					//	sub expression between ()
	  | vl=valueRule																						{	expr = new ExpressionFactor (vl);		}																				//	simple value
	  | p=POS 																									{ expr = env.getPosFactor (fac, $p); 	}																				//	POS - special for FuzzyEvaluator, only inside FOR ALL clause
		| IF_ERROR 																																																															// added on 2024.06.24
				LP e=feExpressionRule [fe, fac] COMMA v=valueRule RP	{	expr = env.buildIfError (e, v); 		}
		| IF LP LP co=jfOrConditionRule [fe.getParamList(), true] RP																																						// added 2025.02.26 - *** double parenthesis - see special functions
				COMMA et=feExpressionRule [fe, fac] 
				COMMA ef=feExpressionRule [fe, fac] RP								{	expr = env.buildIfFunction (co, et, ef); }
	  | x=ID	( ref=feArrayRefRule [x, fe, fac]																																																//	array ref
	  				| LP fp=feFunctionParamsRule [fe, fac] RP )?			{ expr = env.setFuzzyEvaluatorExprFromArrayRef($x, fp, ref, fe, fac);}				//	function call
	  )
	  (	EXP exp=feFactorRule [fe, fac]														{	expr.addExp (exp); } )?																												//	exponent (when applicable)
  ;
  

feFunctionParamsRule [FuzzyEvaluator fe, FEForAllClause fac] returns [ArrayList<Expression> params]
  @init{ params = new ArrayList<Expression>(); }
  : 
  	e=feExpressionRule [fe, fac] 								{ params.add(e); }
    	( COMMA e=feExpressionRule [fe, fac] 				{ params.add(e); }		)*
  ;


feArrayRefRule [Token id, FuzzyEvaluator fe, FEForAllClause fac] returns [ArrayReference ref]
	:	
		LB (e=feExpressionRule [fe, fac]) RB 
		(f = fieldRefRule)? { ref = env.setArrayRef(id, e, f);}
	;


/* ****************************************************************
******************     START MATTEO BALICCO      ******************
***************************************************************** */

createFuzzySetModelRule: 
		CREATE FUZZY SET	MODEL t=ID			{ FuzzySetModel fm = env.addFuzzySetModel ($t);	} 
			DEGREES 		p=ID										{ env.addDegreeType(fm, $p); }
					( COMMA p=ID									{ env.addDegreeType(fm, $p); }	)* 	 			
			(	DERIVED DEGREES	n=ID 					{ env.checkDerivedDegree(fm, $n);  }
				AS e=ftExpressionRule[fm.getDegreesList()]			{ env.addDerivedDegree(fm, $n, e); }
					(	COMMA 			n=ID 														{ env.checkDerivedDegree(fm, $n);  }
						AS e=ftExpressionRule[fm.getDegreesList()]	{ env.addDerivedDegree(fm, $n, e); }	)*
			)?
			( CONSTRAINT c=jfOrConditionRule	[fm.getAllDegreesList(), false]		{ fm.constraint=c; }		)?	
			( fo=fuzzyOperatorDefinitionRule[fm] )*
		SC	
;


fuzzyOperatorDefinitionRule[FuzzySetModel fm] returns [FuzzyOperatorDefinition defOp]
@init { defOp = new FuzzyOperatorDefinition(); }:	
	OPERATOR o=(OR | AND | NOT)																			{	boolean isNot = env.setFuzzyOperatorType(defOp, $o);	}	
	(	EVALUATE x=ID AS  																							{	env.checkOperatorDegree(defOp, $x, fm);	}
		exp=ftConditionExpressionRule[fm.getDegreesList(), isNot]				{	env.addOperatorDegree(defOp, $x, exp);	}	
	)+																															{ env.addOperatorDefinition(fm, defOp, $o); }								
;


// 2025.02.27 - Going to be depracated - Included in Generic Fuzzy Evaluator	
createGenericFuzzySetOperatorRule:
		CREATE t=ID FUZZY OPERATOR n=ID																{ GenericFuzzyOperator gfo = env.addGenericFuzzyOperator($t, $n); }
		PARAMETERS p=parameterRule	[gfo.getParamList(), true] 						{ gfo.parameters.add (p); }
			( COMMA  p=parameterRule	[gfo.getParamList(), true]							{ gfo.parameters.add (p); } 	)*
		( PRECONDITION pc=jfOrConditionRule [gfo.getParamList(), false]		{ gfo.precondition = pc; }			)?
		(	EVALUATE g=ID 																									{ Parameter ev = env.createFgoParameter ($g); } 
				AS e=jfExpressionRule [gfo.getParamList(), false]							{ FuzzyPolyline fp = env.manageEvaluate(gfo, ev, e); }
			( 	
				POLYLINE	LB						
					LP x=numericRule COMMA y=numericRule RP												{ env.addFuzzyPolylinePoint (fp, x, y); }
					( COMMA LP x=numericRule COMMA y=numericRule RP 							{ env.addFuzzyPolylinePoint (fp, x, y); }		)+
				RB																	
			)?																															{ gfo.polylines.add(fp); }
		)+
		SC		
;




ftExpressionRule[ParamList pl] returns [Expression expr]
@init { expr = new Expression (); }
  : 
  	(	t=ftTermRule[pl]										{ expr.addTerm (t, null); }
  	|	(s=ADD | s=SUB) t=ftTermRule[pl]		{ expr.addTerm (t, $s.getText()); } )
    ( (s=ADD | s=SUB) t=ftTermRule[pl] 		{ expr.addTerm (t, $s.getText()); }	)*
  ;

ftTermRule[ParamList pl] returns [ExpressionTerm et]
@init { et = new ExpressionTerm (); }
  : 
  	f=ftFactorRule[pl]												{ et.addFactor(f, null);}
    ( (s=MUL | s=DIV) f=ftFactorRule[pl] 			{ et.addFactor(f, s.getText());}		)*
  ;
  
ftFactorRule[ParamList pl] returns [ExpressionFactor ef]: 
	  	LP op=ftExpressionRule[pl] RP										{ ef = new ExpressionFactor (op); }
	  | vl=ftValueRule																	{ ef = new ExpressionFactor (vl); }
	  |	x=ID																						{ ef = env.checkDegree(pl,$x);	 }
	  | x=ID LP (fp=ftFunctionParamsRule[pl])? RP				{ ef = env.buildFunction ($x, fp); } 
	  | e=specialFunctionRule			{ ef = e; }
;
  
ftValueRule returns [Value vl]: 
  		n=INT           { vl = new Value (Value.INT, $n.getText());   }
		| f=FLOAT       { vl = new Value (Value.FLOAT, $f.getText()); }
;

ftFunctionParamsRule[ParamList pl] returns [ArrayList<Expression> params]
  @init{ params = new ArrayList<Expression>(); }
  : 
  	e=ftExpressionRule[pl] 									{ params.add(e); }
    	( COMMA e=ftExpressionRule[pl] 				{ params.add(e); }		)*
  ;
  
  
  
ftOrConditionRule[ParamList pl, boolean isNot] returns [Condition c]
  : 
    c1=ftAndConditionRule[pl,isNot] 						{ c = new ConditionOr (c1); }
			( OR c2=ftAndConditionRule[pl,isNot] 					{ ((ConditionOr)c).addCondition (c2); } 	)*
																								{ c = env.simplifyConditionOr ((ConditionOr)c); }
  ;

 
ftAndConditionRule[ParamList pl, boolean isNot] returns [Condition c]
  : 
    c1=ftNotConditionRule[pl,isNot] 						{ c = new ConditionAnd (c1); }
    ( AND c2=ftNotConditionRule[pl,isNot] 					{ ((ConditionAnd)c).addCondition (c2); } 	)*
																								{ c = env.simplifyConditionAnd ((ConditionAnd)c); }
  ;
  
  
ftNotConditionRule[ParamList pl, boolean isNot] returns [Condition c]
  : 
    ( not=NOT )? 
    p=ftPredicateRule[pl,isNot] 						    { c = env.createCondition (not, p); }    
  ;




ftPredicateRule[ParamList pl, boolean isNot] returns [Predicate p]
  :
		e1=ftConditionExpressionRule[pl,isNot] 			{ p = e1; }  
		( c=comparatorRule 
    	e2=ftConditionExpressionRule[pl,isNot] 		{ p = env.generateComparePredicate (e1, c, e2); }  )?
  ;  	

	
ftConditionExpressionRule[ParamList pl, boolean isNot] returns [Expression expr]
@init { expr = new Expression (); }
	: 
  	(	t=ftConditionTermRule[pl,isNot]												{ expr.addTerm (t, null); }
  	|	(s=ADD | s=SUB) t=ftConditionTermRule[pl,isNot]				{ expr.addTerm (t, $s.getText()); } )
    ( (s=ADD | s=SUB) t=ftConditionTermRule[pl,isNot] 			{ expr.addTerm (t, $s.getText()); } )*
	;


ftConditionTermRule[ParamList pl, boolean isNot] returns [ExpressionTerm et]
@init { et = new ExpressionTerm (); }
: 
  	f=ftConditionFactorRule	[pl,isNot]			{ et.addFactor(f, null);}
    ( (s=MUL | s=DIV) f=ftConditionFactorRule[pl,isNot] 		{ et.addFactor(f, s.getText());}		)*
;
  
ftConditionFactorRule[ParamList pl, boolean isNot] returns [ExpressionFactor ef]
: 
	  	LP op=ftConditionExpressionRule[pl,isNot] RP								{ ef = new ExpressionFactor (op); }
	  | vl=ftConditionValueRule																			{ ef = new ExpressionFactor (vl); }
	  |	x=ID	f=FIELD_NAME																					{ ef = env.makeExpDegree($x, $f, isNot, pl); }
	  | x=ID LP (fp=ftConditionFunctionParamsRule[pl,isNot])? RP		{ ef = env.buildFunction ($x, fp); } 
	  | e=ftSpecialFunctionRule[pl,isNot]														{ ef = e; }								// PF - 2025.03.03 - modificato da specialFunctionRule
;	
 
  
ftConditionValueRule returns [Value vl]
: 
  		n=INT           { vl = new Value (Value.INT, $n.getText()); }
		| f=FLOAT       { vl = new Value (Value.FLOAT, $f.getText()); }
;
  
ftConditionFunctionParamsRule[ParamList pl, boolean isNot] returns [ArrayList<Expression> params]
  @init{ params = new ArrayList<Expression>(); }
  : 
  	e=ftConditionExpressionRule[pl,isNot] 							{ params.add(e); }
    	( COMMA e=ftConditionExpressionRule[pl,isNot] 				{ params.add(e); }		)*
  ;

// PF. 2025-03-03 Aggiunta come pezza 
// la condizione dell'IF va scritta meglio...
ftSpecialFunctionRule [ParamList pl, boolean isNot] returns [SpecialFunctionFactor expr]
	:
		 IF LP LP co=ftOrConditionRule[pl,isNot] RP			// pf 2025.02.26 - double parenthesis for prospection issues with WITH and WITHOUT Predicates
				COMMA et=ftConditionExpressionRule[pl,isNot]
				COMMA ef=ftConditionExpressionRule[pl,isNot] RP																			
				{	expr = env.buildIfFunction (co, et, ef); }
	;

	


/* ****************************************************************
*******************     END MATTEO BALICCO      *******************
***************************************************************** */


/* Giorgia Bressanelli - Valutatore generico, fa anche da operatore e aggregatore */

createGenericFuzzyEvaluatorRule // da controllare le regole e le funzioni chiamate
  :	
	CREATE t=ID FUZZY EVALUATOR n=ID																	{ FuzzyEvaluator fe = env.addGenericFuzzyEvaluator($t, $n);}
		PARAMETERS feParameterRule [fe]	
			( COMMA feParameterRule [fe] 					)*
		( PRECONDITION pc=jfOrConditionRule[fe.getParamList(), false]			{ fe.preCondition = pc; } 						)?
		(	s=feArraySortRule[fe]																						{ fe.feInternalClauseList.add(s); }
		      	| d=feDeriveRule[fe]																			{ fe.feInternalClauseList.add(d); }
		      	| f=feForAllRule[fe]																			{ fe.feInternalClauseList.add(f); }
		)*
		
		( EVALUATE g=ID																										{ Parameter ev = env.createGfeParameter($g); }
		  AS e=feExpressionRule[fe, null]																	{ FuzzyPolyline fp = env.manageEvaluate(fe, ev, e); }
			(
				POLYLINE LB
				LP x=numericRule COMMA y=numericRule RP													{ env.addFuzzyPolylinePoint(fp, x, y); }
				( COMMA LP x=numericRule COMMA y=numericRule RP										{ env.addFuzzyPolylinePoint(fp, x, y); } 	)+
				RB
			)?																																{ fe.genericPolylines.add(fp); }
		)+
	SC
  ;

/* Fine Giorgia Bressanelli */ 






/* PF news JAVA Functin Rule 2023.01.23 */
createJavaFunctionRule
	:
			CREATE JAVA FUNCTION
				jfn=ID 																										{ JavaFunction jf = env.addJavaFunction ($jfn); }
			PARAMETERS 	
				p=parameterRule [jf.getParamList(), false] 										{ jf.parameters.add (p); 					}
				( COMMA p=parameterRule [jf.getParamList(), false]						{ jf.parameters.add (p);					} 	)*
			(	PRECONDITION pc=jfOrConditionRule [jf.getParamList(), true]		{	jf.preCondition = pc; 					}		)?
			CLASS cl=ID																											{	jf.setClass ($cl.getText());		}
			( IMPORT imp=QUOTED_VALUE 																			{	jf.setImport ($imp.getText()); 	}		)?
			CLASS BODY 
					{ // ANTLR 3.4 apparently do not support multi context, so scanning must be performed this way
						int res = JavaFunction.NO_BEGIN;
						Token myToken = null;
						Token wsToken = null;
						boolean started = false;
						while (input.LA(1)!= END_BODY) {						
							myToken = input.LT(1);
							wsToken = input.get(myToken.getTokenIndex()-1);
							if (started && wsToken.getType() == WHITE_SPACES)
								jf.addJavaWS(wsToken.getText());
							res = env.addJavaBody(jf, myToken);
							started = true;
							input.consume();
						}
						env.checkJavaBody (res, myToken);		
					}
			END_BODY		
		SC
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
ADDING						: 'ADDING';
ADD_ST  		 			: 'ADD';
AGGREGATE 		    : 'AGGREGATE';
AGGREGATOR				: 'AGGREGATOR';
ALL         	  	: 'ALL';
ALPHACUT					:	'ALPHACUT';
ARRAY   		      : 'ARRAY';
ARRAY_FUNCTION		:	( 'MIN' | 'MAX' | 'AVG' | 'SUM') '_ARRAY';
AS     	  	 	    : 'AS';
BODY							:	'BODY' 							{	env.disableScannerError();	}; 
END_BODY					:	'END' WS 'BODY' 		{	env.enableScannerError();		};
BOOLEAN 		      : 'TRUE' | 'FALSE';
BUILD 						: 'BUILD';
BY          		  : 'BY';
CALL          		: 'CALL';
CASE 	    	     	: 'CASE';
CASES 	         	: 'CASES';
CHECK_FOR					: 'CHECK' WS 'FOR';
CLASS							: 'CLASS';
COLLECTION  		  : 'COLLECTION';
COLLECTIONS   		: 'COLLECTIONS';
CONSTRAINT				: 'CONSTRAINT';
CREATE						: 'CREATE';							
CUMULATE					: 'CUMULATE';							
DB	      	      : 'DB';
DEFAULT						: 'DEFAULT';
DEFUZZIFY					:	'DEFUZZIFY';
DEGREE						: 'DEGREE';
DEGREES						: 'DEGREES';
DERIVE						: 'DERIVE';
DERIVED						: 'DERIVED';
DICTIONARY				:	'DICTIONARY';
DIRECTION					:	'DIRECTION';
DISTANCE					:	'DISTANCE';
DOCUMENTS					:	'DOCUMENTS';
DROP  	    	    : 'DROP';
DROPPING      		: 'DROPPING';
DUPLICATES  	  	: 'DUPLICATES';
EACH							: 'EACH';
EXPAND	    	    : 'EXPAND';
EXTENT  	  	    : 'EXTENT';
EXTRACT_ARRAY  	  : 'EXTRACT_ARRAY';
EVALUATE					:	'EVALUATE';
EVALUATOR					:	'EVALUATOR';
FIELD							: 'FIELD';
FIELDS						: 'FIELDS';
FILTER    	    	: 'FILTER';
FIRST		  	      : 'FIRST';
FOR								: 'FOR';
FROM_WEB 					:	'FROM' WS 'WEB';
FROM_ARRAY				: 'FROM' WS 'ARRAY';
FUNCTION					: 'FUNCTION';
FUZZY							: 'FUZZY';
GENERATE					:	'GENERATE';
GEOMETRY  	  	  : 'GEOMETRY';
GET         	  	: 'GET';
GROUP 	        	: 'GROUP';
GROUPING		      : 'GROUPING';
HOWINCLUDE				:	'HOW_INCLUDE';
HOWINTERSECT			:	'HOW_INTERSECT';
HOWMEET						:	'HOW_MEET';
IF								:	'IF';
IF_ERROR					: 'IF_ERROR';
IF_FAILS					: 'IF_FAILS';
IMPORT						: 'IMPORT';
INCLUDED    		  : 'INCLUDED';
INPUT		      		: 'INPUT';
INRANGE		      	: 'IN_RANGE';
INTERSECT					: 'INTERSECT';
INTERSECTION		  : 'INTERSECTION';
IN								: 'IN';
INTO	          	: 'INTO';
ISNULL						: 'IS' WS 'NULL';
ISNOTNULL					: 'IS' WS 'NOT' WS 'NULL';
JOIN      		    : 'JOIN';
JAVA							: 'JAVA';
JAVASCRIPT				: 'JAVASCRIPT';
KEEP        	  	: 'KEEP';
KEEPING	      	 	: 'KEEPING';
KNOWN							:	'KNOWN';
LAST  	  		    : 'LAST';
LEFT    	    	  : 'LEFT';
LOCALLY						: 'LOCALLY';
LOOKUP 						:	'LOOKUP';
MATCHING  		    : 'MATCHING';
MAXIMUM						: 'MAXIMUM';
MEET        	  	: 'MEET';
MEMBERSHIP_ARRAY 	:	'MEMBERSHIP_ARRAY';	
MEMBERSHIP_TO	 		:	'MEMBERSHIP_TO' | 'MEMBERSHIP_OF' ;	
MERGE         		: 'MERGE';
MIN_SIMILARITY		:	'MIN_SIMILARITY';
MINIMUM 					: 'MINIMUM';
MODEL							:	'MODEL';
OF        		    : 'OF';
ON       	  		  : 'ON';
OPERATOR 					: 'OPERATOR';
ORIENTATION  		  : 'ORIENTATION';
OTHERS						: 'OTHERS';
ORDER							: 'ORDER' | 'SORTED';
PARAMETERS				:	'PARAMETERS';
PARTITION 				: 'PARTITION';
POINT							: 'POINT';
POLYLINE					:	'POLYLINE';
POS								: 'POS';
PRECONDITION			:	'PRECONDITION';
PRODUCT  					: 'PRODUCT';
RESOLVING					:	'RESOLVING';
RIGHT 	    	    : 'RIGHT';
REMOVE  	    	  : 'REMOVE';
SAVE      	    	: 'SAVE';
SERVER     		  	: 'SERVER';
SET        	  		: 'SET';
SETS        	  	: 'SETS';
SETTING  		    	: 'SETTING';
SORT							: 'SORT';
SUBTRACT  		    : 'SUBTRACT';
SUM 							: 'SUM';
TO       		   	  : 'TO';
TO_POLYLINE 		  : 'TO_POLYLINE';
THRESHOLD 	  	  : 'THRESHOLD';
TRANSLATE					: 'TRANSLATE';
TRAJECTORY 		  	: 'TRAJECTORY';
TYPE							:	'TYPE';
UNCOMPARABLE			:	'UNCOMPARABLE';
UNKNOWN						:	'UNKNOWN';
UNPACK	  	      : 'UNPACK';
USE     	  	    : 'USE';
USING     	  	  : 'USING';
VERSUS      	  	: 'DESC' | 'ASC';
WHERE		         	: 'WHERE';
WITH  		        : 'WITH';
WITHIN  		      : 'WITHIN';
WITHOUT   		    : 'WITHOUT';
WRT           		: 'WRT';

INT			: '0' | DIGIT0 DIGIT* ;
FLOAT		: DIGIT0 DIGIT* DOT DIGIT+ | '0' DOT DIGIT+; 

ID			: LETTER (LETTER | DIGIT | '_')*;

FIELD_NAME	: DOT (LETTER | DIGIT | TILDE | '_')+  
     		    | DOT '"' (~('"') )* '"'
      			;
HASH_NAME		: '#' (LETTER | DIGIT | TILDE | '_')+  
     		    | '#' '"' (~('"') )* '"'
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
EXP   : '^';
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
