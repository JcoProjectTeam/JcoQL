package jco.ql.parser;

import java.util.*;

import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import jco.ql.parser.model.*;
import jco.ql.parser.model.condition.Condition;
import jco.ql.parser.model.condition.ConditionAnd;
import jco.ql.parser.model.condition.ConditionNot;
import jco.ql.parser.model.condition.ConditionOr;
import jco.ql.parser.model.fuzzy.AlphaCut;
import jco.ql.parser.model.fuzzy.FuzzyOperatorDefinition;
import jco.ql.parser.model.fuzzy.FuzzyPoint;
import jco.ql.parser.model.fuzzy.FuzzyPolyline;
import jco.ql.parser.model.fuzzy.FuzzySetDefinition;
import jco.ql.parser.model.fuzzy.SetFuzzySets;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.predicate.ExpressionFactor;
import jco.ql.parser.model.predicate.ExtentFunction;
import jco.ql.parser.model.predicate.ExtractArray;
import jco.ql.parser.model.predicate.FunctionFactor;
import jco.ql.parser.model.predicate.IfErrorFunction;
import jco.ql.parser.model.predicate.IfFunction;
import jco.ql.parser.model.predicate.InRangePredicate;
import jco.ql.parser.model.predicate.MembershipArray;
import jco.ql.parser.model.predicate.ArrayFunctionFactor;
import jco.ql.parser.model.predicate.ArrayReference;
import jco.ql.parser.model.predicate.ComparisonPredicate;
import jco.ql.parser.model.predicate.CumulateArray;
import jco.ql.parser.model.predicate.EOrientation;
import jco.ql.parser.model.predicate.NullPredicate;
import jco.ql.parser.model.predicate.Predicate;
import jco.ql.parser.model.predicate.SpecialFunctionFactor;
import jco.ql.parser.model.predicate.TranslateFunction;
import jco.ql.parser.model.predicate.WUKPredicate;
import jco.ql.parser.model.predicate.WithPredicate;
import jco.ql.parser.model.util.*;

/**
 * 
 * @author Zunstraal
 *
 */
public class JCoQLEnvironment {
	public static final int UNDEFINED 	= -1;	
	public static final int TOKEN_ERROR = 0;	

	public static final int WARN_MEMBERSHIP = 10;	
	public static final int WARN_CASE 		= 20;	

	public static final int ERR_ON_SYNTAX 						= 1;	
	public static final int ERR_ON_MISSING_COMPARATOR 			= 11;
	public static final int ERR_ON_UNEXPECTED_COMPARATOR 		= 12;
	public static final int ERR_ON_MISSING_COMMA 				= 13;
	public static final int ERR_ON_UNEXPECTED_COMMA 			= 14;
	public static final int ERR_ON_MISSING_NUMBER 				= 16;
	public static final int ERR_ON_MISSING_LEFT_BOUND_PAR 		= 17;
	public static final int ERR_ON_MISSING_RIGHT_BOUND_PAR	 	= 18;
	public static final int ERR_ON_WRONG_NUMBER_FORMAT 			= 19;
	public static final int ERR_ON_MISSING_FUZZYOPERATOR	 	= 20;
	public static final int ERR_ON_MISSING_JSF 					= 21;
	public static final int ERR_ON_MISSING_PARAMETER 			= 22;
	public static final int ERR_ON_MISSING_FUZZYAGGREGATOR 		= 23;
	public static final int ERR_ON_MISSING_FUZZYEVALUATOR 		= 24;
	public static final int ERR_ON_WRONG_TYPE 					= 25;					
	public static final int ERR_ON_MISSING_JFNAME 				= 26;
	public static final int ERR_ON_MISSING_FST 					= 27;				// added by Balicco
	public static final int ERR_ON_MISSING_FGO 					= 28;				// added by Balicco
	public static final int ERR_ON_MISSING_FGE					= 29;				// GB
	public static final int ERR_ON_JS_BEGIN 					= 40;
	public static final int ERR_ON_JS_PAR 						= 41;
	public static final int ERR_ON_JS_NO_END 					= 42;
	public static final int ERR_ON_JS_BAD_END 					= 43;
	public static final int ERR_ON_JAVA_BEGIN 					= 44;
	public static final int ERR_ON_JAVA_PAR 					= 45;
	public static final int ERR_ON_JAVA_NO_END 					= 46;
	public static final int ERR_ON_JAVA_BAD_END 				= 47;
	public static final int ERR_NULL_PREDICATE 					= 49;
	public static final int ERR_ON_WRONG_FIELD_TYPE	 			= 50;
	public static final int ERR_ON_FIELD_TYPE_UNAPPLICABLE 		= 51;
	public static final int ERR_ON_MISSING_DOC_SELECTOR 		= 52;
	public static final int ERR_ON_WRONG_DOC_SELECTOR 			= 53;
	public static final int LAST_SYNTAX_ERROR 					= 100;

	public static final int FIRST_SEMANTIC_ERROR 				= 101;
	public static final int ERR_ON_JOIN_ALIAS 					= 115;
	public static final int ERR_ON_TEMPORARY_COLLECTION_NAME 	= 116;
	public static final int ERR_ON_EMPTY_GENERATE 				= 117;
	public static final int ERR_ON_FUZZY_OPTIONS 				= 118;
	public static final int ERR_UNDEFINED_WUK 					= 119;
	public static final int ERR_UNDEFINED_FUZZYSET 				= 120;
	
	public static final int WRONG_UNIT 							= 121;
	public static final int MISSING_UNIT 						= 122;
	public static final int WRONG_DIRECTION 					= 123;
	public static final int WRONG_TYPESELECTOR 					= 124;
	public static final int ERR_ON_POLYLINE_Y_VALUE 			= 131;
	public static final int ERR_ON_POLYLINE_ORDER 				= 132;
	public static final int ERR_UNDEFINED_PREFIX_NOT 			= 133;			// added by Balicco
	public static final int ERR_ALREADY_DEFINED_OPERATOR 		= 134;			// added by Balicco
	public static final int ERR_ALREADY_DEFINED_DEGREE 			= 135;			// added by Balicco
	public static final int ERR_WRONG_DEGREES_NUMBER 			= 136;			// added by Balicco
	public static final int ERR_UNDEFINED_DEGREE 				= 137;			// added by Balicco
	public static final int ERR_UNDEFINED_PREFIX 				= 138;			// added by Balicco
	public static final int ERR_DEGREE_NAME_NOT_ALLOWED 		= 139;
	public static final int ERR_ON_ALPHACUT_VALUE 				= 140;			// added by Balicco 
	public static final int ERR_ON_GENERATE_COMPLEXITY 			= 160;
	public static final int ERR_ON_PARAMETER_REFERENCE 			= 170;
	public static final int ERR_ON_PARAMETER_DECLARATION 		= 171;
	public static final int ERR_ON_ARRAY_DECLARATION 			= 172;
	public static final int ERR_ON_INDEX_DECLARATION 			= 173;
	public static final int ERR_ON_UNDEFINED_ARRAY 				= 174;
	public static final int ERR_ON_UNDEFINED_ARRAY_PARAMETER 	= 175;
	public static final int ERR_NULL_FUNCTION_NAME 				= 176;
	public static final int ERR_WRONG_PARAMETERS_NUMBER 		= 177;	
	
	public static final int ERR_ON_VERSUS_IN_FUZZY_AGGREGATOR 	= 180; 
	public static final int ERR_ON_ALIAS_DEFINITION 			= 181;
	public static final int ERR_ON_ID_NOT_DECLARED 				= 182;
	public static final int ERR_ON_WRONG_INDEX 					= 183;
	public static final int ERR_ON_ARRAY_NUMBER					= 184;
	public static final int ERR_ON_FA_FUNCTION 					= 185;
	public static final int ERR_ON_FE_POS_REF 					= 186;
	public static final int ERR_ON_FE_CUMULATE 					= 187;
	

	private String version;
	private String release;
	private boolean checkScannerError;
	TokenStream input;
	Hashtable<String, Double> symbolTable;
	List<String> errorList;	
	List<String> warningList;
	List<Instruction> instructionList;
	int nInstruction;
	

	public JCoQLEnvironment (TokenStream input, String version, String release) {
		symbolTable = new Hashtable<String, Double> (101);		
		errorList = new ArrayList<String> ();
		warningList = new ArrayList<String> ();		
		instructionList = new ArrayList<Instruction> ();		
		nInstruction = 0;
		this.version = version;
		this.release = release + "b";
		this.input = input;
		this.checkScannerError = true;
	}
	
	
	public String getVersion () {
		return version;
	}
	public String getRelease () {
		return release;
	}
	public List<String> getErrorList () {
		return errorList;	
	}
	public boolean hasErrors() {
		return (errorList.size() > 0);	
	}
	public boolean hasNoError() {
		return (errorList.size() == 0);	
	}
	public List<String> getWarningList () {
		return warningList;
	}
	public List<Instruction> getInstructionList () {
		if (errorList.size() == 0)
			return instructionList;
		return null;
	}
	public List<Instruction> getInstructionListIgnoringErrors () {
		return instructionList;
	}
	public int getNInstruction () {
		return nInstruction;
	}

// -----------------------------------------------------------
	
	Hashtable<String, Double> getSymbolTable () {
		return symbolTable;
	}
	
	void addInstruction (Instruction instr) {
		instructionList.add(instr);
		nInstruction++;
	}

	void addWarning (int code, Token tk) {
		String st;
		if (tk == null)
			tk = input.LT(-1);

		st = "Warning (" + code + ")";
		st += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: ";
		
		if (code == WARN_MEMBERSHIP)
			st += "The '" + tk.getText() + "' keyword is going to be deprecated. Use instead the 'MEMBERSHIP_TO' keyword";
		else if (code == WARN_CASE)
			st += "The '" + tk.getText() + "' keyword is going to be deprecated. Use instead the 'CASES' keyword";
		
		warningList.add(st);		
	}

	void addError (String msg) {
		errorList.add(msg); 		
	}

	// h holds coordinates, m it's a standard messagge error
	void handleError(String[] tokenNames,
      RecognitionException e, String h, String m) {
		
		String st = "Syntax Error " + ERR_ON_SYNTAX + " at " +
					"[" + e.token.getLine() + ", " + (e.token.getCharPositionInLine()+1) + "]: " + 
					"Found ";
		if (e.token.getType() >=0)
			st += tokenNames[e.token.getType()]; 
		st += " ('" + e.token.getText() + "')" + m;

		if (e instanceof MissingTokenException)
		   st = st + m;		
		
		addError(st); 
	}

	void enableScannerError () {
		checkScannerError = true;
	}
	void disableScannerError () {
		checkScannerError = false;
	}
	// lexical errors only
	void myScannerErrorHandler(int line, int col, String token) {
		if (checkScannerError) {
			String st = "Lexical Error " + TOKEN_ERROR +
									" at [" + line + ", " + (col+1) + "]: " +
									"Unrecognized token '" + token + "'";
			addError(st); 
		}
	}
	void myErrorHandler(int code) {
		myErrorHandler (code, null);
	}
	void myErrorHandler(int code, Token tk) {
		String st;
		if (tk == null)
			tk = input.LT(-1);

		if (code == TOKEN_ERROR)
			st = "Lexical Error " + code;
		else if (code < LAST_SYNTAX_ERROR)
			st = "Syntax Error " + code;
		else
			st = "Semantic Error " + code; 
	
		if (tk == null)
			tk = input.LT(1);
		st += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: ";
		
		if (code == TOKEN_ERROR)
			st += "Token unrecognized '" + tk.getText() + "'";
		else if (code == ERR_ON_JOIN_ALIAS)
			st += "Collections in JOIN must have different names or aliases";		
		else if (code == ERR_ON_TEMPORARY_COLLECTION_NAME)
			st += "Cannot assign 'temporary' as name to intermediate collections. 'temporary' is reserved for temporary collection";		
		else if (code == ERR_ON_EMPTY_GENERATE)
			st += "Empty GENERATE SECTION";		
		else if (code == ERR_ON_FUZZY_OPTIONS)
			st += "FUZZY OPTIONS not allowed in PARTITION GENERATE SECTION";		
		else if (code == ERR_UNDEFINED_WUK)
			st += "Undefined WITHIN or KNWON or UNKNOWN predicate";		
		else if (code == ERR_UNDEFINED_FUZZYSET)
			st += "Undefined fuzzyset";		
		else if (code == ERR_ON_MISSING_COMPARATOR)
			st += "Missing comparator";
		else if (code == ERR_ON_UNEXPECTED_COMPARATOR)
			st += "Unexepected comparator";
		else if (code == ERR_ON_MISSING_COMMA)
			st += "Missing comma";
		else if (code == ERR_ON_UNEXPECTED_COMMA)
			st += "Unexepected comma";
		else if (code == ERR_ON_MISSING_NUMBER)
			st += "Missing number";		
		else if (code == ERR_ON_MISSING_LEFT_BOUND_PAR)
			st += "Missing '[' or '(' parenthesis";		
		else if (code == ERR_ON_MISSING_RIGHT_BOUND_PAR)
			st += "Missing ']' or ')' parenthesis";		
		else if (code == ERR_ON_WRONG_NUMBER_FORMAT)
			st += "Wrong number format";		
		else if (code == ERR_ON_MISSING_FUZZYOPERATOR)
			st += "Missing Fuzzy Operator name";
		else if (code == ERR_ON_MISSING_FUZZYAGGREGATOR)
			st += "Missing Fuzzy Aggregator name";
		else if (code == ERR_ON_MISSING_FUZZYEVALUATOR)
			st += "Missing Fuzzy Evaluator name";
		else if (code == ERR_ON_WRONG_TYPE)
			st += "Parameter type not allowed";		
		else if (code == ERR_ON_MISSING_JSF)
			st += "Missing Javascript Function name";
		else if (code == ERR_ON_MISSING_FST)					// added by Balicco
			st += "Missing Fuzzy Set Type name";
		else if (code == ERR_ON_MISSING_JFNAME)
			st += "Missing Java Function name";
		else if (code == ERR_ON_MISSING_PARAMETER)				// modified by Balicco
			st += "Missing General Fuzzy Set name";
		else if (code == ERR_ON_MISSING_FGO)					// added by Balicco
			st += "Missing parameter";
		else if (code == ERR_ON_MISSING_FGE)
			st += "Missing Evaluator";							// GB
		else if (code == WRONG_UNIT)
			st += "Expecting 'M', 'KM', 'ML' as distance unit";
		else if (code == MISSING_UNIT)
			st += "Expecting 'M', 'KM', 'ML' as distance unit";
		else if (code == WRONG_DIRECTION)
			st += "Expecting a proper direction: 'LEFT, 'RIGHT' or " +
						"any combination up to 3 characters of 'N', 'S', 'W', 'E'";
		else if (code == WRONG_TYPESELECTOR)
			st += "Expecting 'SIMPLE', 'COMPLEX ', 'ARRAY', 'STRING', 'NUMBER', " + 
						"'INTEGER', 'FLOAT' or 'GEOMETRY' as type selector";
		else if (code == ERR_ON_POLYLINE_Y_VALUE)
			st += "Polyline Y values must must be within [0, 1]";
		else if (code == ERR_ON_POLYLINE_ORDER)
			st += "Polyline X value must be greater than the previous";
		else if (code == ERR_UNDEFINED_PREFIX_NOT)								// added by Balicco
			st += "The degree prefix must be 'x'";
		else if (code == ERR_ALREADY_DEFINED_OPERATOR)							// added by Balicco
			st += "Fuzzy set model operator already defined";
		else if (code == ERR_ALREADY_DEFINED_DEGREE)							// added by Balicco
			st += "Fuzzy operator already defined";
		else if (code == ERR_WRONG_DEGREES_NUMBER)								// added by Balicco
			st += "The operator "+ tk.getText() +" must evaluate all degrees";
		else if (code == ERR_UNDEFINED_DEGREE)									// added by Balicco
			st += "Unknown degree: " + tk.getText();
		else if (code == ERR_UNDEFINED_PREFIX)									// added by Balicco
			st += "The degree prefix must be 'x' or 'y'";
		else if (code == ERR_DEGREE_NAME_NOT_ALLOWED)							// added by Balicco
			st += "Degree name: "+ tk.getText() + " is reserved";
		else if (code == ERR_ON_ALPHACUT_VALUE)
			st += "ALPHA-CUT values must must be within [0, 1]";
		else if (code == ERR_ON_JS_BEGIN)
			st += "Missing '{' to open Javascript code";
		else if (code == ERR_ON_JS_PAR)
			st += "No '{' to match with this '}' in Javascript code";
		else if (code == ERR_ON_JS_NO_END)
			st += "Missing '}' to close Javascript code";
		else if (code == ERR_ON_JS_BAD_END)
			st += "Missing '}' to close Javascript code";
		else if (code == ERR_ON_JAVA_BEGIN)
			st += "Missing '{' to open Java code";
		else if (code == ERR_ON_JAVA_PAR)
			st += "No '{' to match with this '}' in Java code";
		else if (code == ERR_ON_JAVA_NO_END)
			st += "Missing '}' to close Java code";
		else if (code == ERR_ON_JAVA_BAD_END)
			st += "Missing '}' to close Java code";
		else if (code == ERR_NULL_PREDICATE)
			st += "Missing 'IS NULL' or 'IS NOT NULL' predicate";
		else if (code == ERR_ON_WRONG_FIELD_TYPE)
			st += "Missing or wrong type. Choose 'NUMERIC, 'STRING' or 'BOOLEAN'";
		else if (code == ERR_ON_FIELD_TYPE_UNAPPLICABLE)
			st += "'AVG_ARRAY' is applicable only to 'NUMERIC' fields";
		else if (code == ERR_ON_MISSING_DOC_SELECTOR)
			st += "Missing 'DOCUMENTS' search type selector";
		else if (code == ERR_ON_WRONG_DOC_SELECTOR)
			st += "Array search type selector can be only 'DOCUMENTS' or nothing";
		else if (code == ERR_ON_GENERATE_COMPLEXITY)
			st += "The following less complex field spec must placed before";
		else if (code == ERR_ON_PARAMETER_REFERENCE)									// modified by Balicco
			st += "\"" + tk.getText() + "\" must be declared before";	
		else if (code == ERR_ON_PARAMETER_DECLARATION)
			st += "Parameter \"" + tk.getText() + "\" already declared or name unavailable";
		else if (code == ERR_ON_ARRAY_DECLARATION)
			st += "Array \"" + tk.getText() + "\" already declared or name unavailable";
		else if (code == ERR_ON_INDEX_DECLARATION)
			st += "Index name \"" + tk.getText() + "\" already in use";
		else if (code == ERR_ON_UNDEFINED_ARRAY)
			st += "Array \"" + tk.getText() + "\" undefined";
		else if (code == ERR_ON_UNDEFINED_ARRAY_PARAMETER)
			st += "Array \"" + tk.getText() + "\" undefined in PARAMETERS";
		else if (code == ERR_NULL_FUNCTION_NAME)
			st += "Missing function name";
		else if (code == ERR_WRONG_PARAMETERS_NUMBER)
			st += "Wrong number of parameters for predefined function " + tk.getText();
		else if (code == ERR_ON_VERSUS_IN_FUZZY_AGGREGATOR)
			st += "Non acceptable type of versus selection " + tk.getText();
		else if (code == ERR_ON_ALIAS_DEFINITION)
			st += "\"" + tk.getText() + "\" has been already declared";
		else if (code == ERR_ON_ID_NOT_DECLARED)
			st += "Id \"" + tk.getText() + "\" not defined";
		else if (code == ERR_ON_WRONG_INDEX)
			st += "Index name \"" + tk.getText() + "\" undeclared";
		else if (code == ERR_ON_FA_FUNCTION)
			st += "Function \"" + tk.getText() + "\" not available in FUZZY AGGREGATOR";
		else if (code == ERR_ON_ARRAY_NUMBER)
			st += "Wrong number of sorted arrays";
		else if (code == ERR_ON_FE_POS_REF)
			st += "Cannot reference POS outside a FOR ALL clause";
		else if (code == ERR_ON_FE_CUMULATE)
			st += "Cannot reference CUMULATE function inside a FOR ALL clause";
				
		else
			st += "*** Error Code not recognized [" + code + "] ***";
							
		addError(st); 
	}

	// ----------------------------------------------
	
	void addField (Field field, Token f) {
		if (f == null)
			f = Token.INVALID_TOKEN;
		field.addField(f.getText());
	}

	
	public DbCollection addDbCollection(Token name, Token db, Token as) {
		if (name == null)
			name = Token.INVALID_TOKEN;
		String collectionName = name.getText();
		String dbName = null;
		String alias = null;
		if (db != null)
			dbName = db.getText();
		if (as != null)
			alias = as.getText();
		
		return new DbCollection (collectionName, dbName, alias);
	}


	void addGetCollection (Token name, Token db, Token as) {
		DbCollection dc = addDbCollection (name, db, as);
		GetCollection gc = new GetCollection(nInstruction, dc);
		nInstruction++;
		instructionList.add(gc);
	}
	public void addGetCollection(Token url) {
		GetCollection gc = new GetCollection(nInstruction, url.getText());
		nInstruction++;
		instructionList.add(gc);
	}


	void addSaveAs (Token cn, Token db) {
		if (cn == null)
			cn = Token.INVALID_TOKEN;

		if ((db == null) && cn.getText().equals("temporary"))
			myErrorHandler(ERR_ON_TEMPORARY_COLLECTION_NAME, cn);
		else {
			DbCollection collection = addDbCollection (cn, db, null);
			SaveAs sa = new SaveAs (nInstruction, collection);
			nInstruction++;
			instructionList.add(sa);
		}
	}
	
	MergeCollections addMergeCollections (DbCollection cn) {
		MergeCollections mc = new MergeCollections(nInstruction, cn);
		nInstruction++;
		instructionList.add(mc);
		return mc;
	}

	void addInstersectCollections (DbCollection cn1, DbCollection cn2) {
		IntersectCollections ic = new IntersectCollections(nInstruction, cn1, cn2);
		nInstruction++;
		instructionList.add(ic);
	}

	void addSubtractCollections (DbCollection cn1, DbCollection cn2) {
		SubtractCollections ic = new SubtractCollections(nInstruction, cn1, cn2);
		nInstruction++;
		instructionList.add(ic);
	}
	
	JoinCollections addJoin (DbCollection cn1, DbCollection cn2, Token tk) {
		JoinCollections sj = new JoinCollections (nInstruction, cn1, cn2);
		nInstruction++;
		instructionList.add(sj);
		
		if (cn1 != null && cn2 != null && cn1.sameCollectionName(cn2))
			myErrorHandler(ERR_ON_JOIN_ALIAS, tk);
			
		return sj;
	}

	Filter addFilter(CaseClause fc) {
		Filter f = new Filter (nInstruction, fc);
		nInstruction++;
		instructionList.add(f);
		return f;
	}
	Filter addFilter(GenerateSection gs) {
		Filter f = new Filter (nInstruction, gs);
		nInstruction++;
		instructionList.add(f);
		return f;
	}



	Group addGroup() {
		Group g = new Group(nInstruction);
		nInstruction++;
		instructionList.add(g);
		return g;
	}

	Expand addExpand() {
		Expand e = new Expand(nInstruction);
		nInstruction++;
		instructionList.add(e);
		return e;
	}

	UseDb addUseDb() {
		UseDb udb = new UseDb(nInstruction);
		nInstruction++;
		instructionList.add(udb);
		return udb;
	}

	TrajectoryMatching addTrajectoryMatching(DbCollection cn1, DbCollection cn2) {
		TrajectoryMatching tm = new TrajectoryMatching (nInstruction, cn1, cn2);
		nInstruction++;
		instructionList.add(tm);
		return tm;
	}

	FuzzyOperator addFuzzyOperator (Token id) {
		String foName = "null";
		if (id == null) 
			myErrorHandler(ERR_ON_MISSING_FUZZYOPERATOR);
		else
			foName = id.getText();
		FuzzyOperator fo = new FuzzyOperator (nInstruction, foName);
		nInstruction++;
		instructionList.add(fo);
		return fo;
	}
	
	JavascriptFunction addJavascriptFunction (Token id) {
		String jsfName = "null";
		if (id == null) 
			myErrorHandler(ERR_ON_MISSING_JSF);
		else
			jsfName = id.getText();
		JavascriptFunction jsf = new JavascriptFunction (nInstruction, jsfName);
		nInstruction++;
		instructionList.add(jsf);
		return jsf;
	}

	
	public void addGetDictionary(Token name, Token db, Token as) {
		if (name == null)
			name = Token.INVALID_TOKEN;
		DbCollection dbCollection = addDbCollection(name, db, as);
		GetDictionary gd = new GetDictionary(nInstruction, dbCollection);
		nInstruction++;
		instructionList.add(gd);
	}


	public LookupFromWeb addLookupFromWeb() {
		LookupFromWeb lookupFromWeb = new LookupFromWeb (nInstruction);
		nInstruction++;
		instructionList.add(lookupFromWeb);
		return lookupFromWeb;
	}


	public JavaFunction addJavaFunction(Token id) {
		String jfName = "null";
		if (id == null) 
			myErrorHandler(ERR_ON_MISSING_JFNAME);
		else
			jfName = id.getText();
		JavaFunction jf = new JavaFunction (nInstruction, jfName);
		nInstruction++;
		instructionList.add(jf);
		return jf;
	}

	// added by Balicco
	public FuzzySetModel addFuzzySetModel(Token t) {
		String name = "null";
		if (t == null) 
			myErrorHandler(ERR_ON_MISSING_FST);
		else
			name = t.getText();
		FuzzySetModel ft = new FuzzySetModel(nInstruction, name);
		nInstruction++;
		instructionList.add(ft);
		return ft;
	}
	
	// added by Balicco
	public GenericFuzzyOperator addGenericFuzzyOperator(Token t, Token n) {
		String type = "null", name = "null";
		if (t == null) 
			myErrorHandler(ERR_ON_MISSING_FST);
		else
			type = t.getText();
		if (n == null) 
			myErrorHandler(ERR_ON_MISSING_FGO);
		else
			name = n.getText();
		GenericFuzzyOperator fgo = new GenericFuzzyOperator(nInstruction, name, type);
		nInstruction++;
		instructionList.add(fgo);
		return fgo;
	}

	// GB
	public FuzzyEvaluator addGenericFuzzyEvaluator(Token t, Token n) {
		String type = "null", name = "null";
		if(t == null)
			myErrorHandler(ERR_ON_MISSING_FST);
		else
			type = t.getText();
		if(n == null)
			myErrorHandler(ERR_ON_MISSING_FGE);
		else
			name = n.getText();
		FuzzyEvaluator gfe = new FuzzyEvaluator(nInstruction, name, type);
		nInstruction++;
		instructionList.add(gfe);
		
		return gfe;
	}
	
	// GB
	public Parameter createGfeParameter(Token v) {
		Parameter p = null;
		if (v == null)
			myErrorHandler(ERR_ON_MISSING_PARAMETER);
		else
			p = new Parameter (v.getText(), "FLOAT");
		return p;
	}

	// GB
	public FuzzyPolyline manageEvaluate(FuzzyEvaluator gfe, Parameter d, Expression e) {
		if(gfe.fuzzyEvaluatorType != null) {
			gfe.genericDegrees.add(d);
			gfe.genericEvaluate.add(e);
		}
	
		return new FuzzyPolyline();
	}
	
	
	// ---------------------------	
	
	void setDistance(SpatialFunction sf, Token u, Token cp, String n, boolean joinCaller) {  
		String unit = "";
		if (u == null)
			myErrorHandler(MISSING_UNIT, u);
		else {
			unit = u.getText();
			if (!SpatialFunction.checkUnit(unit))
				myErrorHandler(WRONG_UNIT, u);
		}

		if (joinCaller && cp == null)
			myErrorHandler(ERR_ON_MISSING_COMPARATOR, cp);
		else if (joinCaller && n == null)
			cp = null;
		else if (!joinCaller && cp != null)
			myErrorHandler(ERR_ON_UNEXPECTED_COMPARATOR, cp);
		String comp = "="; // default
		if (cp != null)
			comp = cp.getText();
		sf.setType (SpatialFunction.DISTANCE, unit, comp, n, joinCaller); 				
	}
		

	void setOrientation(SpatialFunction sf, Token side, Token o, String d, boolean joinCaller) {  
		String sideString = "LEFT";
		if (side != null)
			sideString = side.getText();
		String oStr = ""; // default
		if (o != null) {
			oStr = o.getText();
			if (!EOrientation.checkDirection(oStr))
				myErrorHandler(WRONG_DIRECTION, o);
		}
		if (joinCaller && o == null)
			myErrorHandler(ERR_ON_MISSING_COMMA, o);
		else if (!joinCaller && o != null)
			myErrorHandler(ERR_ON_UNEXPECTED_COMMA, o);
		sf.setOrientationType (sideString, oStr, d, joinCaller);
	}

	public PartitionMatching setThreshold(Field fr1, Field fr2, Token u, String v) {
		String unit = "";
		if (u == null)
			myErrorHandler(MISSING_UNIT, u);
		else {
			unit = u.getText();
			if (!SpatialFunction.checkUnit(unit))
				myErrorHandler(WRONG_UNIT, u);
		}
		PartitionMatching pt = new PartitionMatching (fr1, fr2, unit, v);
		return pt;
	}

	void checkWithPredicateTypeSelector (WithPredicate wp, Token ts) {
		if (ts == null)
			ts = Token.INVALID_TOKEN;
		if (ts.getText().equals("SIMPLE")) 
			wp.setTypeSelector(WithPredicate.SIMPLE, ts.getText());
		else if (ts.getText().equals("COMPLEX"))  
			wp.setTypeSelector(WithPredicate.COMPLEX, ts.getText());
		else if (ts.getText().equals("ARRAY"))  
			wp.setTypeSelector(WithPredicate.ARRAY, ts.getText());
		else if (ts.getText().equals("STRING"))  
			wp.setTypeSelector(WithPredicate.STRING, ts.getText());
		else if (ts.getText().equals("NUMBER"))  
			wp.setTypeSelector(WithPredicate.NUMBER, ts.getText());
		else if (ts.getText().equals("INTEGER"))  
			wp.setTypeSelector(WithPredicate.INTEGER, ts.getText());
		else if (ts.getText().equals("FLOAT"))  
			wp.setTypeSelector(WithPredicate.FLOAT, ts.getText());
		else if (ts.getText().equals("GEOMETRY"))
			wp.setTypeSelector(WithPredicate.GEOMETRY, ts.getText());
		else if (ts.getText().equals("BOOLEAN"))
			wp.setTypeSelector(WithPredicate.BOOLEAN, ts.getText());
		else
			myErrorHandler(WRONG_TYPESELECTOR, ts);
	}
	
	Condition createCondition (Token not, Predicate predicate) {
		Condition p = new Condition(predicate);

		if (not != null)
			p = new ConditionNot (p);
		
		return p;
	}

	
	Condition simplifyConditionOr (ConditionOr condition) {
		if (condition.subConditions.size() == 1)
			return condition.subConditions.get(0);
		return condition;
	}

	Condition simplifyConditionAnd (ConditionAnd condition) {
		if (condition.subConditions.size() == 1)
			return condition.subConditions.get(0);
		return condition;
	}

	String getNumeric (Token sign, Token num) {
		if (sign != null)
			num.setText(sign.getText() + num.getText());
		if (num == null)
			myErrorHandler(ERR_ON_MISSING_NUMBER);
		else {
			try {
				@SuppressWarnings("unused")
				Double n = Double.parseDouble(num.getText());
				return num.getText();
			}
			catch (Exception e) {
				myErrorHandler(ERR_ON_WRONG_NUMBER_FORMAT, num);
			}
		}
		return "0";
	}

	
	void addFuzzyPolylinePoint (FuzzyOperator fo, String x, String y) {
		if (x != null && y != null) {
			double xValue = Double.parseDouble(x) ;
			double yValue = Double.parseDouble(y) ;
			
			if (yValue < 0 || yValue > 1)
				myErrorHandler(ERR_ON_POLYLINE_Y_VALUE);
			if (fo.hasDefaultPolyline()) 
				fo.resetPolyline();
			if (fo.polyline.size() > 0) {
				double x0Value = Double.parseDouble(fo.polyline.get(fo.polyline.size()-1).x);
				if (xValue <= x0Value)
					myErrorHandler(ERR_ON_POLYLINE_ORDER);
			}
			fo.polyline.add(new FuzzyPoint (x, y));
		}
	}
	
	// added by Balicco
	void addFuzzyPolylinePoint (FuzzyPolyline fp, String x, String y) {
		if (x != null && y != null) {
			double xValue = Double.parseDouble(x) ;
			double yValue = Double.parseDouble(y) ;
			
			if (yValue < 0 || yValue > 1)
				myErrorHandler(ERR_ON_POLYLINE_Y_VALUE);
			if (fp.hasDefaultPolyline()) 
				fp.resetPolyline();
			if (fp.polyline.size() > 0) {
				double x0Value = Double.parseDouble(fp.polyline.get(fp.polyline.size()-1).x);
				if (xValue <= x0Value)
					myErrorHandler(ERR_ON_POLYLINE_ORDER);
			}
			fp.polyline.add(new FuzzyPoint (x, y));
		}
	}

	
	
	void addFuzzyEvaluatorPolylinePoint (FuzzyEvaluator fe, String x, String y) {
		if (x != null && y != null) {
			double xValue = Double.parseDouble(x) ;
			double yValue = Double.parseDouble(y) ;
					
			if (yValue < 0 || yValue > 1)
				myErrorHandler(ERR_ON_POLYLINE_Y_VALUE);
			if (fe.hasDefaultPolyline()) 
				fe.resetPolyline();
			if (fe.polyline.getSize() > 0) {
				double x0Value = Double.parseDouble(fe.polyline.polyline.get(fe.polyline.getSize()-1).x);
				if (xValue <= x0Value)
					myErrorHandler(ERR_ON_POLYLINE_ORDER);
			}
			fe.polyline.polyline.add(new FuzzyPoint (x, y));
		}
	} 
	
	
	int addJSFbody (JavascriptFunction jsf, Token t) {
		if (t == null)
			t = Token.INVALID_TOKEN;

		int response = jsf.addJavascriptChunck(t.getText());
		if (response == JavascriptFunction.NO_BEGIN)
			myErrorHandler(ERR_ON_JS_BEGIN, t);
		if (response == JavascriptFunction.WRONG_PAR)
			myErrorHandler(ERR_ON_JS_PAR, t);
		return response;
	}
	

	void checkJSFbody (int response, Token t) {
		if (response == JavascriptFunction.NO_BEGIN)
			myErrorHandler(ERR_ON_JS_BEGIN, t);
		if (response == JavascriptFunction.NO_END)
			myErrorHandler(ERR_ON_JS_NO_END, t);
		if (response == JavascriptFunction.BAD_END)
			myErrorHandler(ERR_ON_JS_BAD_END, t);
	}


	int addJavaBody (JavaFunction jsf, Token t) {
		if (t == null)
			t = Token.INVALID_TOKEN;
		int response = jsf.addJavaChunck(t.getText());

		if (response == JavascriptFunction.NO_BEGIN)
			myErrorHandler(ERR_ON_JAVA_BEGIN, t);
		if (response == JavaFunction.WRONG_PAR)
			myErrorHandler(ERR_ON_JAVA_PAR, t);
		return response;
	}
	

	void checkJavaBody (int response, Token t) {
		if (response == JavaFunction.NO_BEGIN)
			myErrorHandler(ERR_ON_JAVA_BEGIN, t);
		if (response == JavaFunction.NO_END)
			myErrorHandler(ERR_ON_JAVA_NO_END, t);
		if (response == JavaFunction.BAD_END)
			myErrorHandler(ERR_ON_JAVA_BAD_END, t);
	}


	// serve a  controllare che gli OutputFieldSpec inseriti abbiano complessità crescente all'interno di una GenerateAction
	public void addOutputFieldSpec(ObjectStructure obj, OutputFieldSpec ofs, boolean generateActionCaller, Token t) {
		if (!obj.addOutputFieldSpec(ofs) && generateActionCaller)
			;//ZUN 2025-03-12 myErrorHandler(ERR_ON_GENERATE_COMPLEXITY, t);
	}

	
	public void checkParameterDeclaration(Token x, ParamList pl) {
		if (x == null || pl.contains(x.getText()))
			myErrorHandler(ERR_ON_PARAMETER_DECLARATION, x);						
	}

// Modified by Balicco	
	public void addAlphaCut(GenerateSection gs, String n, Token on, Token de) {
		if (n != null) {
			double nValue = Double.parseDouble(n) ;
					
			if (nValue < 0 || nValue > 1)
				myErrorHandler(ERR_ON_ALPHACUT_VALUE);	
			else
				if (de != null )
					gs.addAlphaCut (new AlphaCut(n, on.getText(), de.getText()));
				else
					gs.addAlphaCut (new AlphaCut(n, on.getText()));
		}
	}


	public CaseClause newCaseClause(Token c) {
		if (c != null && c.getType() == JCoQLLexer.CASE)
			addWarning (WARN_CASE, c);				
		return new CaseClause();
	}
	

	public void checkGenerate(GenerateSection gs, Token g) {
		if (gs.isEmpty())
			myErrorHandler(ERR_ON_EMPTY_GENERATE, g);
		else if (!gs.checkFuzzyOptions())
			myErrorHandler(ERR_ON_FUZZY_OPTIONS, g);
	}


	public NullPredicate createNullPredicate(Field f, Token n) {
		int nc = NullPredicate.CHECK_NULL;
		if (n == null)
			myErrorHandler(ERR_NULL_PREDICATE, n);
		else if (n.getType() == JCoQLParser.ISNOTNULL)
			nc = NullPredicate.CHECK_NOT_NULL;	

		return new NullPredicate (f, nc);
	}
	
	public WUKPredicate createWUKPredicate (Token wukType) {
		if (wukType == null)
			wukType = Token.INVALID_TOKEN;
		return new WUKPredicate (wukType.getText());
	}


	public FunctionFactor buildFunction(Token x, ArrayList<Expression> fp) {
		FunctionFactor exprFactor = new FunctionFactor();

		if (x == null) {
			myErrorHandler(ERR_NULL_FUNCTION_NAME);
			return exprFactor;
		}
		String name = x.getText();
		exprFactor = new FunctionFactor(name, fp);

		if (!exprFactor.checkParamNumber())
			myErrorHandler(ERR_WRONG_PARAMETERS_NUMBER, x);

		return exprFactor;
	}

	// i riferimento a parametro nel JSCREATE o FuzzyOperator vengono passati all'engine come fieldReference
	public ExpressionFactor getJfId (Token x, ParamList pl, boolean jsCaller) {
		ExpressionFactor ef = null;
		if (x == null) {
			myErrorHandler(ERR_NULL_FUNCTION_NAME);
			return ef;
		}
		String name = x.getText();

		if (jsCaller)
			ef = new ExpressionFactor (name);
		else {
			Field f = new Field ();
			f.addField("." + x.getText());			
			ef = new ExpressionFactor (f);				
		}

		if (!pl.contains(x.getText()))
			myErrorHandler(ERR_ON_PARAMETER_REFERENCE, x);				

		return ef;
	}
	public ExpressionFactor checkJFFactor(Token x, Token par, ArrayList<Expression> fp, ParamList pl, boolean jsCaller) {
		ExpressionFactor ef = new ExpressionFactor();
		if (x == null) {
			myErrorHandler(ERR_NULL_FUNCTION_NAME);
			return ef;
		}
		String name = x.getText();
		
		// is not function call
		if (par == null) {
			if (jsCaller)
				ef = new ExpressionFactor (name);
			else {
				Field f = new Field ();
				f.addField("." + x.getText());			
				ef = new ExpressionFactor (f);				
			}

			if (!pl.contains(x.getText()))
				myErrorHandler(ERR_ON_PARAMETER_REFERENCE, x);				
		}
		// is function call
		else {
			FunctionFactor ff = new FunctionFactor(name, fp);
			if (!ff.checkParamNumber())
				myErrorHandler(ERR_WRONG_PARAMETERS_NUMBER, x);
			return ff;
		}

		return ef;
	}

	
	public IfFunction buildIfFunction(Condition co, Expression et, Expression ef) {
		IfFunction iff = new IfFunction(co, et, ef);
		return iff;
	}


	public IfErrorFunction buildIfError(Expression e, Value v) {
		IfErrorFunction ief = new IfErrorFunction(e, v);
		return ief;
	}


	public void checkMembershipToken (Token mt) {
		if (mt != null) {
			if ("MEMBERSHIP_OF".equals(mt.getText()))
				addWarning (WARN_MEMBERSHIP, mt);				
		}
	}

	public ExtentFunction buildMembershipTo(Token mt, Token fs) {
		if (mt != null)
			checkMembershipToken (mt);
		if (fs == null)
			fs = Token.INVALID_TOKEN;
		ExtentFunction mtf = new ExtentFunction(SpecialFunctionFactor.MEMBERSHIP_TO_FUNCTION, fs.getText());
		return mtf;
	}
	
	public ExtentFunction buildExtent(Token fs) {
		if (fs == null)
			fs = Token.INVALID_TOKEN;
		ExtentFunction ef = new ExtentFunction(SpecialFunctionFactor.EXTENT_FUNCTION, fs.getText());
		return ef;
	}
	
	// added by Balicco
	public ExtentFunction buildDegree(Token t1, Token t2, boolean type) {
		ExtentFunction df = new ExtentFunction("###", "###", type);		// object
		if (t1 != null && t2 != null)
			df = new ExtentFunction(t1.getText(), t2.getText(), type);
		if (t1 != null && t2 == null)
			df = new ExtentFunction(t1.getText(), null, type);
		return df;
	}
	
	public TranslateFunction buildTranslate(Expression e, Token dict, Token cs, Token defaultValue) {
		TranslateFunction translateFunction = new TranslateFunction(e, "NONE");

		if (dict != null)
			translateFunction = new TranslateFunction(e, dict.getText());
		if (cs != null)
			translateFunction.setCaseSensitive(cs.getText());
		if (defaultValue != null)
			translateFunction.dictionaryTranslateDefault = defaultValue.getText();		
		return translateFunction;
	}


	public void addFuzzySet(WUKPredicate wuk, Token fs) {
		if (wuk == null)
			myErrorHandler(ERR_UNDEFINED_WUK);
		else
			if (fs == null)
				myErrorHandler(ERR_UNDEFINED_FUZZYSET);
			else	
				wuk.addFuzzySet(fs.getText());		
	}


	// added by Balicco
	public void addCheckForFuzzySet(GenerateSection gs, Token fs, Condition fe, Token ty) {
		String fuzzySet = "null";
		if (fs == null)
			myErrorHandler(ERR_UNDEFINED_FUZZYSET);
		fuzzySet = fs.getText();
		if (ty != null) 
			gs.addFuzzySetDefinition (new FuzzySetDefinition (fuzzySet, fe, ty.getText()));
		else 
			gs.addFuzzySetDefinition (new FuzzySetDefinition (fuzzySet, fe));
	}

	
	// check: true - activate control for knownTypes
	public Parameter createParameter(boolean check, Token v, Token t) {
		Parameter p = null;
		if (v == null || t == null)
			myErrorHandler(ERR_ON_MISSING_PARAMETER);
		else
			if (!check || Parameter.knownType(t.getText()))
				p = new Parameter (v.getText(), t.getText());
			else
				myErrorHandler(ERR_ON_WRONG_TYPE);

		return p;
	}


	public void createFEParameter(FuzzyEvaluator fe, Token n, Token t) {
		if (n == null)
			n = Token.INVALID_TOKEN;
		if (t == null)
			t = Token.INVALID_TOKEN;
		
		String par = n.getText();
		String type = t.getText();

		if (fe.isUnavailable(par))
			myErrorHandler(ERR_ON_PARAMETER_DECLARATION, n);				
		if (!Parameter.knownType(type))
			myErrorHandler(ERR_ON_WRONG_TYPE, t);
		
		Parameter p = new Parameter (par, type);
		fe.namespace.put(par, p);
		fe.parameters.add(p);
	}

	
	public Predicate getInRangePredicate(Expression expr, Token lp, String n1, String n2, Token rp) {
		if (lp == null)
			myErrorHandler(ERR_ON_MISSING_LEFT_BOUND_PAR);
		if (rp == null)
			myErrorHandler(ERR_ON_MISSING_RIGHT_BOUND_PAR);
		if (lp == null || rp == null)
			return new Predicate();
		if (n1 == null || n2 == null) {
			myErrorHandler(ERR_ON_MISSING_NUMBER);
			return new Predicate();			
		}
		Double lBound = Double.parseDouble(n1);
		Double rBound = Double.parseDouble(n2);					
		
		return new InRangePredicate(expr, lp.getText(), lBound, rBound, rp.getText());
	}


	public ArrayFunctionFactor newArrayFunction(Token functionName) {
		if (functionName == null)
			functionName = Token.INVALID_TOKEN;
		ArrayFunctionFactor fun = new ArrayFunctionFactor (functionName.getText());
		return fun;
	}


	public void setArrayFunctionType(ArrayFunctionFactor af, Token type) {
		if (type == null)
			myErrorHandler(ERR_ON_WRONG_FIELD_TYPE);
		else if (!ArrayFunctionFactor.NUMERIC_TYPE_STR.equals(type.getText()) &&
					!ArrayFunctionFactor.STRING_TYPE_STR.equals(type.getText()) &&
					!ArrayFunctionFactor.BOOLEAN_TYPE_STR.equals(type.getText()))
			myErrorHandler(ERR_ON_WRONG_FIELD_TYPE);
		else if (af.getFunctionType() == ArrayFunctionFactor.AVG_FUNCTION && 
					!ArrayFunctionFactor.NUMERIC_TYPE_STR.equals(type.getText()))
					myErrorHandler(ERR_ON_FIELD_TYPE_UNAPPLICABLE);					
		else
			af.setFieldType(type.getText());
	}

	public void setArrayFunctionSearcingType(ArrayFunctionFactor af, Token type) {
		if (type == null)
			myErrorHandler(ERR_ON_MISSING_DOC_SELECTOR);
		else if (!ArrayFunctionFactor.DOCUMENT_TYPE_STR.equals(type.getText()))
			myErrorHandler(ERR_ON_WRONG_DOC_SELECTOR);
		else
			af.setDocSearchType();		
	}


	public SortField createSortField(Field fr, Token type) {
		String typeStr = "";
		if (type == null)
			myErrorHandler(ERR_ON_WRONG_FIELD_TYPE);
		else {
			typeStr = type.getText();
			if (!SortField.checkType(typeStr)) 
				myErrorHandler(ERR_ON_WRONG_FIELD_TYPE);
		}
		return new SortField (fr, typeStr);
	}


	public void addSetFuzztSets(SetFuzzySets sfs, String side, String sourceFuzzySet, Token newFs) {
		if (newFs == null)
			sfs.add(side, sourceFuzzySet, null);
		else
			sfs.add(side, sourceFuzzySet, newFs.getText());
	}
	
	
	/* PF 2024-05-02*/
	FuzzyEvaluator addFuzzyEvaluator (Token id) {
		String feName = "null";
		if (id == null) 
			myErrorHandler(ERR_ON_MISSING_FUZZYEVALUATOR);
		else
			feName = id.getText();
		FuzzyEvaluator fe = new FuzzyEvaluator (nInstruction, feName);
		nInstruction++;
		instructionList.add(fe);
		return fe;
	}

	/* Aggiunte Invernici*/
	FuzzyEvaluator addFuzzyAggregator (Token id) {
		String faName = "null";
		if (id == null) 
			myErrorHandler(ERR_ON_MISSING_FUZZYAGGREGATOR);
		else
			faName = id.getText();
		FuzzyEvaluator fe = new FuzzyEvaluator (nInstruction, faName);
		nInstruction++;
		instructionList.add(fe);
		return fe;
	}


	public ArrayReference setArrayRef(Token idArray, Expression e, Field field) {
		if(idArray == null) {
			myErrorHandler(ERR_ON_SYNTAX);
			idArray = Token.INVALID_TOKEN;
		}
		ArrayReference ref = new ArrayReference(idArray.getText());
		if(field == null)
			ref.type = ArrayReference.ARRAY;
		else {
			ref.type = ArrayReference.ARRAY_FIELD;
			ref.arrayField = field;
		}
		
		if(e == null)
			myErrorHandler(ERR_ON_SYNTAX);
		else 
			ref.index = e;
		
		return ref;
	}
	
	public ExpressionFactor setFuzzyEvaluatorExprFromArrayRef(Token id, ArrayList<Expression> params, ArrayReference ref, FuzzyEvaluator fe, FEForAllClause fac) {
		if(id == null) 
			id = Token.INVALID_TOKEN;
		
		String idStr = id.getText();
		//default
		ExpressionFactor e = new ExpressionFactor(idStr);

		// idStr is a reference to a parameter 
		if (params == null && ref == null) {
			if (! (	fe.namespace.containsKey(idStr) || 
					((fac != null) && fac.isForAllParameter(idStr)))) 
				myErrorHandler(ERR_ON_ID_NOT_DECLARED, id);			
		}
		// idStr is the COUNT function (maybe expanded - the COUNT function has just 1 parameter)
		else if (ref == null) {
			FunctionFactor ff = new FunctionFactor(idStr, params);
			if (!ff.checkParamNumber())
				myErrorHandler(ERR_WRONG_PARAMETERS_NUMBER, id);				
			e = ff;
		}
		// idStr is an array reference
		else {
			if (!fe.namespace.containsKey(idStr) || !fe.namespace.get(idStr).isArray())
				myErrorHandler(ERR_ON_UNDEFINED_ARRAY, id);			
			e = new ExpressionFactor (ref);				
		}
	
		return e;
	}
	
	public AggregateClause createAggregateClause(String withType, Expression e, Token alias, FuzzyEvaluator fe, FEForAllClause fac){
		AggregateClause ac = null;
		if(alias == null)
			alias = Token.INVALID_TOKEN;
		if(e == null)
			alias = Token.INVALID_TOKEN;
		
		String n = alias.getText();
		
		//Verifico l'alias non sia già stato usato. Verifico nei parametri, nelle altre AGGREGATE e nelle LOCALLY dell'attuale FOR ALL
		if (fe.namespace.containsKey(n) || ((fac != null) && fac.isForAllParameter(n))) 
			myErrorHandler(ERR_ON_ALIAS_DEFINITION, alias);

		Parameter p = new Parameter(n,  Parameter.NUMERIC);
		fe.namespace.put(n, p);
				
		if(withType != null)
			ac = new AggregateClause(n, withType);			
		else
			ac = new AggregateClause(n);
		ac.exp = e;		
		return ac;
	}
	
	
	public FEForAllClause createForAllClause(Token i, Token a, FuzzyEvaluator fe) {
		if (i == null ) 
			i = Token.INVALID_TOKEN;
		if (a == null)
			a = Token.INVALID_TOKEN;
		
		String ndx = i.getText();
		String array = a.getText();
		
		if (fe.namespace.containsKey(ndx))		
			myErrorHandler(ERR_ON_INDEX_DECLARATION, i);
		else {
			Parameter p = new Parameter (ndx, Parameter.NUMERIC);
			fe.namespace.put(ndx, p);			
		}
	
		if (!fe.namespace.containsKey(array) || !fe.namespace.get(array).isArray())
			myErrorHandler(ERR_ON_UNDEFINED_ARRAY, a);
		
		FEForAllClause clause = new FEForAllClause(ndx, array);
		return clause;		
	}

	public void createLocallyClause(FEForAllClause fac, Token id, Expression e, FuzzyEvaluator fe) {
		if (id == null || e == null) {
			myErrorHandler(ERR_ON_SYNTAX, id);
		}
		else {
			String var = id.getText();
			if (fe.namespace.containsKey(var) || fac.isForAllParameter(var))
				myErrorHandler(ERR_ON_ALIAS_DEFINITION, id);
			
			fac.locally.add(new LocallyClause(e, id.getText())); 
		}
	}



	// added by Balicco 
	public void addDegreeType(FuzzySetModel ft, Token t) {
		String s = "null";
		ParamList pl = ft.getDegreesList();
		if (t == null || pl.contains(t.getText()))
			myErrorHandler(ERR_ON_PARAMETER_DECLARATION, t);
		else if (t.getText().equals("type"))
			myErrorHandler(ERR_DEGREE_NAME_NOT_ALLOWED, t);
		else
			s = t.getText();
		Parameter p = new Parameter(s, "DEGREE");
		ft.degrees.add(p);
	}
	
	// added by Balicco 
	public void checkDerivedDegree(FuzzySetModel ft, Token t) {
		ParamList pl = new ParamList(ft.degrees);
		if(t == null) 
			myErrorHandler(ERR_UNDEFINED_DEGREE, t);
		if(pl.contains(t.getText())) 
			myErrorHandler(ERR_ALREADY_DEFINED_DEGREE, t);
		if(t.getText().equals("type"))
			myErrorHandler(ERR_DEGREE_NAME_NOT_ALLOWED, t);
	}
	
	// added by Balicco 
	public ExpressionFactor checkDegree(ParamList pl, Token t) {
		String s = "null";
		if(t == null || !pl.contains(t.getText()))
			myErrorHandler(ERR_UNDEFINED_DEGREE, t);
		else 
			s = t.getText();
		return new ExpressionFactor (s);
	} 

	
	// added by Balicco 
	public void addDerivedDegree(FuzzySetModel ft, Token t, Expression e) {
		if (t == null)
			t = Token.INVALID_TOKEN;
		ft.derivedDegrees.add(t.getText()); 
		ft.derivedExpr.add(e);
	}
	
	// added by Balicco 
	public void addOperatorDegree(FuzzyOperatorDefinition defOp, Token x, Expression exp) {
		if (x == null)
			x = Token.INVALID_TOKEN;
		defOp.addDegree(x.getText(), exp);
	}	
	
	
	// added by Balicco 
	public boolean setFuzzyOperatorType(FuzzyOperatorDefinition defOp, Token t) {
		if (t == null)
			t = Token.INVALID_TOKEN;
		defOp.type = t.getText();
		if(t.getText().equals("NOT"))
			return true;
		return false;
	}
		
	// added by Balicco 
	public void checkOperatorDegree(FuzzyOperatorDefinition defOp, Token t, FuzzySetModel fm) {
		if (t == null)
			t = Token.INVALID_TOKEN;

		ParamList pl = fm.getDegreesList();
		if (!pl.contains(t.getText()))
			myErrorHandler(ERR_UNDEFINED_DEGREE, t);
		for (int i = 0; i<defOp.degrees.size(); i++) {
			if (defOp.degrees.get(i).equals(t.getText()))
				myErrorHandler(ERR_ALREADY_DEFINED_DEGREE, t);
		}
	}
	
	// added by Balicco 
	public void addOperatorDefinition(FuzzySetModel ft, FuzzyOperatorDefinition fo, Token op) {
		if (fo.type.equals("OR")) {
			if(ft.defOr != null)
				myErrorHandler(ERR_ALREADY_DEFINED_OPERATOR, op);
			ft.defOr = fo;
		}
		if (fo.type.equals("AND")) {
			if(ft.defAnd != null)
				myErrorHandler(ERR_ALREADY_DEFINED_OPERATOR, op);
			ft.defAnd = fo;
		}
		if (fo.type.equals("NOT")) {
			if(ft.defNot != null)
				myErrorHandler(ERR_ALREADY_DEFINED_OPERATOR, op);
			ft.defNot = fo;
		}
		if (ft.degrees.size() > fo.degrees.size() && fo.type != "null"){
			myErrorHandler(ERR_WRONG_DEGREES_NUMBER, op);
		}
	}
	
	// added by Balicco 
	public ExpressionFactor makeExpDegree(Token x, Token f, Boolean isNot, ParamList pl) {
		if (x == null)
			x = Token.INVALID_TOKEN;
		if (f == null)
			f = Token.INVALID_TOKEN;
		String sx = x.getText();
		String sf = f.getText().substring(1, f.getText().length());
		if (!pl.contains(sf))
			myErrorHandler(ERR_UNDEFINED_DEGREE);
		if (isNot) {
			if(!sx.equals("x"))
				myErrorHandler(ERR_UNDEFINED_PREFIX_NOT);
		}else {
			if(!sx.equals("x") && !sx.equals("y"))
				myErrorHandler(ERR_UNDEFINED_PREFIX);
		}
		return new ExpressionFactor (sx + "." + sf);
	} 
	
	// added by Balicco 
	public Parameter createFgoParameter(Token v) {
		Parameter p = null;
		if (v == null)
			myErrorHandler(ERR_ON_MISSING_PARAMETER);
		else
			p = new Parameter (v.getText(), "FLOAT");
		return p;
	}

	// added by Balicco 
	public FuzzyPolyline manageEvaluate(GenericFuzzyOperator fgo, Parameter d, Expression e) {
		fgo.degrees.add(d);  
		fgo.evaluate.add(e); 	
		return new FuzzyPolyline();
	}


	// added 2023.07.13
	public FEDeriveClause createDeriveClause(Token as, Expression e, FuzzyEvaluator fe, int dt) {
		if (as == null)
			as = Token.INVALID_TOKEN;
		String s = as.getText();
		FEDeriveClause dc = new FEDeriveClause(s, e, dt);

		if (fe.isUnavailable(s))
			myErrorHandler(ERR_ON_PARAMETER_DECLARATION, as);	
		else {
			Parameter p;
			if (dc.isDeriveScalar())
				p = new Parameter(s, Parameter.NUMERIC);
			else
				p = new Parameter(s, Parameter.ARRAY);
			fe.namespace.put(s, p);
		}
		return dc;		
	}


	// added 2023.07.13
	public void setFuzzyEvaluatorNewArray(FuzzyEvaluator fe, FESortArrayClause sfea, Token v) {
		if (v == null)
			v = Token.INVALID_TOKEN;
		String s = v.getText();
		sfea.targetArrayList.add(s);
		if (fe.isUnavailable(s))
			myErrorHandler(ERR_ON_ARRAY_DECLARATION, v);	
		else {
			Parameter p = new Parameter(s, Parameter.ARRAY);
			fe.namespace.put(s, p);			
		}
	}

	// added 2023.07.29
	public void checkFuzzyEvaluatorSortingList (FESortArrayClause sfea) {
		if (sfea.sourceArrayList.size() != sfea.targetArrayList.size())
			myErrorHandler(ERR_ON_ARRAY_NUMBER);	
		else
			sfea.linkSourceToTargetArray();		
	}

	// added 2023.07.13
	public void addFuzzyEvaluatorSortingArray(FuzzyEvaluator fe, FESortArrayClause sfea, Token i, Token a) {
		if (i == null)
			i = Token.INVALID_TOKEN;
		String ndx = i.getText();

		if (a == null)
			a = Token.INVALID_TOKEN;
		String array = a.getText();

		// check v is an existing array
		Parameter p = fe.getParamList().get(array);
		if (p == null || !p.isArray()) 
			myErrorHandler(ERR_ON_UNDEFINED_ARRAY_PARAMETER, a);	
			
		// check i has never been used
		if (fe.namespace.containsKey(ndx))
			myErrorHandler(ERR_ON_INDEX_DECLARATION, i);
		else {		
			Parameter p2 = new Parameter(ndx, Parameter.ARRAY);
			fe.namespace.put(ndx, p2);
		}
		sfea.sourceArrayList.add(a.getText());
		sfea.indexList.add(i.getText());
	}


	public void addFuzzyEvaluatorSortingField(FuzzyEvaluator fe, FESortArrayClause sfea, 
												Token ndx, Field subField, Token type, Token versus) {
		if (ndx == null)
			ndx = Token.INVALID_TOKEN;

		if (!sfea.hasIndex(ndx.getText()))
			myErrorHandler(ERR_ON_WRONG_INDEX, ndx);

		if (subField == null)
			subField = new Field();
		subField.addHeadField(ndx.getText());
		String typeStr = "";
		if (type == null)
			myErrorHandler(ERR_ON_WRONG_FIELD_TYPE);
		else {
			typeStr = type.getText();
			if (!SortField.checkType(typeStr)) 
				myErrorHandler(ERR_ON_WRONG_FIELD_TYPE);
		}
		SortField sf = new SortField (subField, typeStr);
		if (versus != null)
			sf.setVersus(versus.getText());
		sfea.sortingFieldList.add(sf);
	}


	public SpecialFunctionFactor createMembershipArray(Token fuzzySet, Field array) {
		if (fuzzySet == null)
			fuzzySet = Token.INVALID_TOKEN;
		
		return new MembershipArray (fuzzySet.getText(), array);
	}


	public SpecialFunctionFactor createMembershipArray(Token fuzzySet) {
		if (fuzzySet == null)
			fuzzySet = Token.INVALID_TOKEN;

		return new MembershipArray (fuzzySet.getText());
	}


	public void addMembershipArray(MembershipArray expr, Token fuzzySet) {
		if (fuzzySet == null)
			fuzzySet = Token.INVALID_TOKEN;
		
		expr.addFuzzyset(fuzzySet.getText());
	}

	
	// added on 2023.09.04
	public SpecialFunctionFactor createExtractArray(Field field, Field array) {
		return new ExtractArray (field, array);
	}


	// added on 2024.06.21
	public ExpressionFactor getPosFactor(FEForAllClause fac, Token p) {
		if (fac == null)
			myErrorHandler(ERR_ON_FE_POS_REF);	
		return new ExpressionFactor (p.getText());
	}


	// added on 2024.06.21
	public Expression getCumulateArray(FuzzyEvaluator fe, Token a) {
		if(a == null) 
			a = Token.INVALID_TOKEN;		
		String arrayName = a.getText();		
		
		// check v is an existing array
		Parameter p = fe.namespace.get(arrayName);
		if (p == null || !p.isArray()) 
			myErrorHandler(ERR_ON_UNDEFINED_ARRAY_PARAMETER, a);		
		
		return new Expression (new CumulateArray (arrayName));
	}


	// PF 2023.03.05 - E' una pezza.
	public Predicate generateComparePredicate(Expression e1, Token c, Expression e2) {
		Predicate p = e1;
		if (c == null) 
			myErrorHandler (ERR_ON_MISSING_COMPARATOR, c);				
		else
			p = new ComparisonPredicate (e1, c.getText(), e2);
		return p;
	}


}
