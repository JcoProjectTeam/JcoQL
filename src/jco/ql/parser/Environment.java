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
import jco.ql.parser.model.fuzzy.FuzzyPoint;
import jco.ql.parser.model.fuzzy.FuzzySetDefinition;
import jco.ql.parser.model.fuzzy.SetFuzzySets;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.predicate.ExpressionFactor;
import jco.ql.parser.model.predicate.ExpressionTerm;
import jco.ql.parser.model.predicate.FunctionFactor;
import jco.ql.parser.model.predicate.IfErrorFunction;
import jco.ql.parser.model.predicate.InRangePredicate;
import jco.ql.parser.model.predicate.MembershipOfFunction;
import jco.ql.parser.model.predicate.ArrayFunctionFactor;
import jco.ql.parser.model.predicate.ArrayReference;
import jco.ql.parser.model.predicate.EOrientation;
import jco.ql.parser.model.predicate.NullPredicate;
import jco.ql.parser.model.predicate.Predicate;
import jco.ql.parser.model.predicate.TranslateFunction;
import jco.ql.parser.model.predicate.UsingAggregatorPredicate;
import jco.ql.parser.model.predicate.WUKPredicate;
import jco.ql.parser.model.predicate.WithPredicate;
import jco.ql.parser.model.util.*;

/**
 * 
 * @author Zunstraal
 *
 */
public class Environment {
	public static final int UNDEFINED = -1;	
	public static final int TOKEN_ERROR = 0;	

	public static final int ERR_ON_SYNTAX = 1;	
	public static final int ERR_ON_FIELDNAME = 2;
	public static final int ERR_ON_FULLFIELDNAME = 3;
	public static final int ERR_ON_FILTERCASE = 4;
	public static final int ERR_ON_FIELDUNKNOWN	= 10;
	public static final int ERR_ON_MISSING_COMPARATOR = 11;
	public static final int ERR_ON_UNEXPECTED_COMPARATOR = 12;
	public static final int ERR_ON_MISSING_COMMA = 13;
	public static final int ERR_ON_UNEXPECTED_COMMA = 14;
	public static final int ERR_ON_UNEXPECTED_EXPRESSION = 15;
	public static final int ERR_ON_MISSING_NUMBER = 16;
	public static final int ERR_ON_MISSING_LEFT_BOUND_PAR = 17;
	public static final int ERR_ON_MISSING_RIGHT_BOUND_PAR = 18;
	public static final int ERR_ON_WRONG_NUMBER_FORMAT = 19;
	public static final int ERR_ON_MISSING_FUZZYOPERATOR = 20;
	public static final int ERR_ON_MISSING_JSF = 21;
	public static final int ERR_ON_MISSING_PARAMETER = 22;
	public static final int ERR_ON_MISSING_FUZZYAGGREGATOR = 23;
	public static final int ERR_ON_JS_BEGIN = 40;
	public static final int ERR_ON_JS_PAR = 41;
	public static final int ERR_ON_JS_NO_END = 42;
	public static final int ERR_ON_JS_BAD_END = 43;
	public static final int ERR_NULL_PREDICATE = 44;
	public static final int ERR_ON_WRONG_FIELD_TYPE = 50;
	public static final int ERR_ON_FIELD_TYPE_UNAPPLICABLE = 51;
	public static final int ERR_ON_MISSING_DOC_SELECTOR = 52;
	public static final int ERR_ON_WRONG_DOC_SELECTOR = 53;
	public static final int LAST_SYNTAX_ERROR = 100;

	public static final int FIRST_SEMANTIC_ERROR = 101;
	public static final int ERR_ON_SAME_COLLECTION	= 111;
	public static final int ERR_ON_SAME_ALIAS = 112;
	public static final int ERR_ON_NEED_ALIAS = 113;
	public static final int ERR_ON_OLD_JOIN_ALIAS = 114;
	public static final int ERR_ON_JOIN_ALIAS = 115;
	public static final int ERR_ON_TEMPORARY_COLLECTION_NAME = 116;
	public static final int ERR_ON_EMPTY_GENERATE = 117;
	public static final int ERR_ON_FUZZY_OPTIONS = 118;
	public static final int ERR_UNDEFINED_WUK = 119;
	public static final int ERR_UNDEFINED_FUZZYSET = 120;
	
	public static final int WRONG_UNIT = 121;
	public static final int MISSING_UNIT = 122;
	public static final int WRONG_DIRECTION = 123;
	public static final int WRONG_TYPESELECTOR = 124;
	public static final int ERR_ON_RANGE_VALUE = 130;
	public static final int ERR_ON_RANGE_ORDER = 131;
	public static final int ERR_ON_POLYLINE_Y_VALUE = 133;
	public static final int ERR_ON_POLYLINE_ORDER = 134;
	public static final int ERR_ON_ALPHACUT_VALUE = 140;
	public static final int ERR_ON_FUZZY_SET_NAME = 150;
	public static final int ERR_ON_GENERATE_COMPLEXITY = 160;
	public static final int ERR_ON_PARAMETER_REFERENCE = 170;
	public static final int ERR_ON_PARAMETER_DECLARATION = 171;
	public static final int ERR_NULL_FUNCTION_NAME = 172;
	public static final int ERR_WRONG_PARAMETERS_NUMBER = 173;	
	
	public static final int ERR_ON_VERSUS_IN_FUZZY_AGGREGATOR = 180; 
	public static final int ERR_ON_ALIAS_REFERENCE_IN_EVALUATE = 181;
	public static final int ERR_ON_ALIAS_DEFINITION = 182;
	public static final int ERR_ON_ARRAY_REF_IN_EXPRESSION = 183;
	public static final int ERR_ON_ID_NOT_DECLARED = 184;
	public static final int ERR_ON_ARRAY_REFERENCE_NOT_DECLARED = 185;
	
	
	private String version;
	private String release;
	private boolean checkScannerError;
	TokenStream input;
	Hashtable<String, Double> symbolTable;
	List<String> errorList;	
	List<String> warningList;
	List<Instruction> instructionList;
	int nInstruction;
	

	public Environment (TokenStream input, String version, String release) {
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
		//st= st + "\n"+ e.getUnexpectedType()+ "\n" + h + " \n" + m ;
		
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
		if (code == ERR_ON_FIELDNAME)
			st += "Fieldname must be without Collection Name";
		else if (code == ERR_ON_FULLFIELDNAME)
			st += "Fieldname needs Collection Name";
		else if (code == ERR_ON_FILTERCASE)
			st += "Missing valued field or WITH clause or WITHOUT clause in FilterCase";
		else if (code == ERR_ON_FIELDUNKNOWN)
			st += "Field not included in any Collection";
		else if (code == ERR_ON_SAME_COLLECTION)
			st += "Collections must be different, or have different alias";
		else if (code == ERR_ON_SAME_ALIAS)
			st += "Collections share the same alias";
		else if (code == ERR_ON_NEED_ALIAS)
			st += "Give both Collections a different alias";
		else if (code == ERR_ON_OLD_JOIN_ALIAS)
			st += "Collections in JOIN must have different names or aliases";
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
		else if (code == ERR_ON_UNEXPECTED_EXPRESSION)
			st += "Unexepcted expression";
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
		else if (code == ERR_ON_MISSING_JSF)
			st += "Missing Javascript Function name";
		else if (code == ERR_ON_MISSING_PARAMETER)
			st += "Missing parameter";
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
		else if (code == ERR_ON_RANGE_VALUE)
			st += "Range values must be >= 0";
		else if (code == ERR_ON_RANGE_ORDER)
			st += "Wrong order on range values";
		else if (code == ERR_ON_POLYLINE_Y_VALUE)
			st += "Polyline Y values must must be within [0, 1]";
		else if (code == ERR_ON_POLYLINE_ORDER)
			st += "Polyline X value must be greater than the previous";
		else if (code == ERR_ON_ALPHACUT_VALUE)
			st += "ALPHA-CUT values must must be within [0, 1]";
		else if (code == ERR_ON_JS_BEGIN)
			st += "Missing '{' to open Javascript body";
		else if (code == ERR_ON_JS_PAR)
			st += "No '{' to match with this '}'";
		else if (code == ERR_ON_JS_NO_END)
			st += "Missing '}' to close Javascript body";
		else if (code == ERR_ON_JS_BAD_END)
			st += "Missing '}' to close Javascript body";
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
		else if (code == ERR_ON_FUZZY_SET_NAME)
			st += "FuzzySetName should be in the form ID or ID.ID";
		else if (code == ERR_ON_GENERATE_COMPLEXITY)
			st += "The following less complex field spec must placed before";
		else if (code == ERR_ON_PARAMETER_REFERENCE)
			st += "\"" + tk.getText() + "\" must be declared before in PARAMETERS";
		else if (code == ERR_ON_PARAMETER_DECLARATION)
			st += "\"" + tk.getText() + "\" already declared in PARAMETERS";
		else if (code == ERR_NULL_FUNCTION_NAME)
			st += "Missing function name";
		else if (code == ERR_WRONG_PARAMETERS_NUMBER)
			st += "Wrong number of parameters for predefined function " + tk.getText();
		else if (code == ERR_ON_VERSUS_IN_FUZZY_AGGREGATOR)
			st += "Non acceptable type of versus selection " + tk.getText();
		else if (code == ERR_ON_ALIAS_REFERENCE_IN_EVALUATE)
			st += "All IDs in EVALUATE must be declared before in PARAMETERS or AGGRAGATE";
		else if (code == ERR_ON_ALIAS_DEFINITION)
			st += "\"" + tk.getText() + "\" has been already declared before";
		else if (code == ERR_ON_ARRAY_REF_IN_EXPRESSION)
			st += "Error in expression: there can't be any array references outside FOR ALL clause";
		else if (code == ERR_ON_ID_NOT_DECLARED)
			st += "Error in expression: id \"" + tk.getText() + "\" has never been defined";
		else if (code == ERR_ON_ARRAY_REFERENCE_NOT_DECLARED)
			st += "Error in expression: array \"" + tk.getText() + "\" has never been defined";
		else
			st += "*";
							
		addError(st); 
	}
	
// ----------------------------------------------
	
	void addField (Field field, Token f) {
		field.addField(f.getText());
	}

	
	public DbCollection addDbCollection(Token name, Token db, Token as) {
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
	
	void addFuzzyAggregatorPolylinePoint (FuzzyAggregator fa, String x, String y) {
		if (x != null && y != null) {
			double xValue = Double.parseDouble(x) ;
			double yValue = Double.parseDouble(y) ;
					
			if (yValue < 0 || yValue > 1)
				myErrorHandler(ERR_ON_POLYLINE_Y_VALUE);
			if (fa.hasDefaultPolyline()) 
				fa.resetPolyline();
			if (fa.polyline.size() > 0) {
				double x0Value = Double.parseDouble(fa.polyline.get(fa.polyline.size()-1).x);
				if (xValue <= x0Value)
					myErrorHandler(ERR_ON_POLYLINE_ORDER);
			}
			fa.polyline.add(new FuzzyPoint (x, y));
		}
	} 
	
	
	int addJSFbody (JavascriptFunction jsf, Token t) {
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


	// serve a  controllare che gli OutputFieldSpec inseriti abbiano complessità crescente all'interno di una GenerateAction
	public void addOutputFieldSpec(ObjectStructure obj, OutputFieldSpec ofs, boolean generateActionCaller, Token t) {
		if (!obj.addOutputFieldSpec(ofs) && generateActionCaller)
			myErrorHandler(ERR_ON_GENERATE_COMPLEXITY, t);
	}

	
	public void checkParameterDeclaration(Token x, ParamList pl) {
		if (x == null || pl.contains(x.getText()))
			myErrorHandler(ERR_ON_PARAMETER_DECLARATION, x);						
	}


	public void addAlphaCut(GenerateSection gs, String n, Token on) {
		if (n != null) {
			double nValue = Double.parseDouble(n) ;
					
			if (nValue < 0 || nValue > 1)
				myErrorHandler(ERR_ON_ALPHACUT_VALUE);	
			else
				gs.addAlphaCut (new AlphaCut(n, on.getText()));		
		}
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
/*	public FunctionFactor buildFunction(Token x, ArrayList<Expression> fp) {
		FunctionFactor exprFactor = new FunctionFactor();

		if (x == null) {
			myErrorHandler(ERR_NULL_FUNCTION_NAME);
			return exprFactor;
		}
		String name = x.getText();
		exprFactor = new FunctionFactor(name, fp);

		if (!exprFactor.checkParamNumber())
				myErrorHandler(ERR_MISSING_PARAMETERS_PREDEFINED_FUNCTION, x);

		return exprFactor;
	}
*/
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

	
	public IfErrorFunction buildIfError(Expression e, Value v) {
		IfErrorFunction exprFactor = new IfErrorFunction(e, v);
		return exprFactor;
	}

	public MembershipOfFunction buildMembershipOf(Token mo) {
		MembershipOfFunction exprFactor = new MembershipOfFunction("@@@@");
		if (mo != null)
			exprFactor = new MembershipOfFunction(mo.getText());
		return exprFactor;
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


	public void addCheckForFuzzySet(GenerateSection gs, Token fs, Condition fe) {
		String fuzzySet = "null";
		if (fs == null)
			myErrorHandler(ERR_UNDEFINED_FUZZYSET);
		else
			fuzzySet = fs.getText();
		gs.addFuzzySetDefinition (new FuzzySetDefinition (fuzzySet, fe));
	}


	public Parameter createParameter(Token v, Token t) {
		Parameter p = null;
		if (v == null || t == null)
			myErrorHandler(ERR_ON_MISSING_PARAMETER);
		else
			p = new Parameter (v.getText(), t.getText());

		return p;
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
	
	
	/* Aggiunte Invernici*/
	
	FuzzyAggregator addFuzzyAggregator (Token id) {
		String foName = "null";
		if (id == null) 
			myErrorHandler(ERR_ON_MISSING_FUZZYAGGREGATOR);
		else
			foName = id.getText();
		FuzzyAggregator fa = new FuzzyAggregator (nInstruction, foName);
		nInstruction++;
		instructionList.add(fa);
		return fa;
	}

	
	public void setVersusFuzzyAggregator(FuzzyAggregator fa, String versus) {
		if (versus == null)
			myErrorHandler(ERR_ON_VERSUS_IN_FUZZY_AGGREGATOR);
		else {
			if(versus.equals("ASC"))
				fa.versus = FuzzyAggregator.ASCENDING;
			else
				fa.versus = FuzzyAggregator.DESCENDING;
		}		
	}
	
	public ArrayReference setArrayRef(Token id_array, Expression e, Field field) {
		
		if(id_array == null)
			myErrorHandler(ERR_ON_SYNTAX);
		ArrayReference ref = new ArrayReference(id_array.getText());
		if(field == null)
			ref.type = ArrayReference.ARRAY;
		else {
			ref.type = ArrayReference.ARRAY_FIELD;
			ref.array_field = field;
		}
		
		if(e == null)
			myErrorHandler(ERR_ON_SYNTAX);
		else 
			ref.index = e;
		
		return ref;
	}
	
	public ExpressionFactor setExprFromArrayRef(Token id, ArrayReference ref, FuzzyAggregator fa, ForAllClause fac) {
		ExpressionFactor e = null;
		if(id == null) {
			myErrorHandler(ERR_ON_SYNTAX);
			e = new ExpressionFactor();
		}
		//If I'm not in the FOR ALL clause and I have an array ref, thers's an error
		else if(fac == null && fa!= null && fa.hasArrayReferenceDefined(id.getText())) 
				myErrorHandler(ERR_ON_ARRAY_REF_IN_EXPRESSION, id);
		else if(ref == null) {			
			if(fac!= null && fac.hasArrayReferenceDefinedInForAll(id.getText())) {		
				ArrayReference newRef = new ArrayReference(id.getText());
				newRef.type = ArrayReference.ARRAY;
				ExpressionFactor exprF = new ExpressionFactor (new Value(Value.POS, "POS"));
				ExpressionTerm exprT = new ExpressionTerm();
				exprT.addFactor(exprF);
				Expression pos = new Expression();
				pos.addTerm(exprT);
				newRef.index = pos;
				e= new ExpressionFactor(newRef);
			}
			else {
				if((fa != null && !fa.hasParameterDefined(id.getText())) && (fac != null && !fac.hasParameterDefinedInForAll(id.getText()))) {
					myErrorHandler(ERR_ON_ID_NOT_DECLARED, id);
				}
				else
					e = new ExpressionFactor(id.getText());
			}
		}
		else {
			if(fac!= null && !fac.hasArrayReferenceDefinedInForAll(id.getText()))
				myErrorHandler(ERR_ON_ARRAY_REFERENCE_NOT_DECLARED, id);
			e = new ExpressionFactor(ref);
		}
		
		return e;
	}
	
	public AggregateClause createAggregateClause(String withType, Expression e, Token alias, FuzzyAggregator fa, ForAllClause fac){
		AggregateClause ac = null;
		if(alias == null || e == null)
			myErrorHandler(ERR_ON_SYNTAX, alias);
		
		String n = alias.getText();
		
		//Verifico l'alias non sia già stato usato. Verifico nei parametri, nelle altre AGGREGATE e nelle LOCALLY dell'attuale FOR ALL
		if(fa.hasParameterDefined(n) || fa.hasParameterDefinedInCurrentForAll(n, fac)) {
			myErrorHandler(ERR_ON_ALIAS_DEFINITION, alias);
		}
		
		
		if(withType!=null)
			ac = new AggregateClause(n, withType);			
		else
			ac = new AggregateClause(n);
		ac.exp = e;		
		return ac;
	}
	
	public void setUsingAggregateFromArray(UsingAggregatorPredicate p, Token fuzzySet, Token array) {
		p.aggregatorType = UsingAggregatorPredicate.SELECTED_FUZZY_SET_FROM_ARRAY;
		
		if(array == null)
			myErrorHandler(ERR_ON_SYNTAX, array);
		
		if(fuzzySet == null)
			myErrorHandler(ERR_ON_SYNTAX, fuzzySet);
		
		p.arrayName = array.getText();
		p.fuzzySetsSelected.add(fuzzySet.getText());
	}
	
	public void setUsingAggregateInDocument(UsingAggregatorPredicate p, Token fuzzySet) {
		if (fuzzySet == null) {
			myErrorHandler(ERR_ON_SYNTAX, fuzzySet);
		}
		
		p.fuzzySetsSelected.add(fuzzySet.getText());		
	}
	
	
	public ForAllClause createForAllClause(Token id, FuzzyAggregator fa) {
		if (id == null) {
			myErrorHandler(ERR_ON_SYNTAX, id);
			return new ForAllClause("");
		}
		
		if (!fa.hasArrayReferenceDefined(id.getText())) //Verifico che il parametro della FOR ALL sia stato dichiarato e sia un ARRAY
			myErrorHandler(ERR_ON_PARAMETER_REFERENCE, id);
		
		ForAllClause clause = new ForAllClause(id.getText());
		return clause;		
	}
	
	public void createLocallyClause(ForAllClause fac, Token id, Expression e, FuzzyAggregator fa) {
		if (id == null || e == null) {
			myErrorHandler(ERR_ON_SYNTAX, id);
		}
		else {
			if(fa.hasParameterDefinedInCurrentForAll(id.getText(), fac))
				myErrorHandler(ERR_ON_ALIAS_DEFINITION, id);
			
			fac.locally.add(new LocallyClause(e, id.getText())); 
		}
	}
	//TODO check here
	public void setEvaluateClause(FuzzyAggregator fa, Expression e) {
		/*for(ExpressionTerm et: e.terms) {
			for(ExpressionFactor ef: et.factors){
				if(ef.getType() == ExpressionFactor.ARRAY_REF)
					myErrorHandler(ERR_ON_EVALUATE_ARRAY_REF_IN_EXPRESSION);
				if(ef.getType() == ExpressionFactor.ID && !fa.hasParameterDefined(ef.idName))
					myErrorHandler(ERR_ON_ALIAS_REFERENCE_IN_EVALUATE);
			}
		}*/
		if(e != null)
			fa.evaluate = e;
		else
			myErrorHandler(ERR_ON_SYNTAX);
	}
	
	public UsingAggregatorPredicate createUsingAggregatorPredicate(Token id) {
		UsingAggregatorPredicate predicate = new UsingAggregatorPredicate("");
		if (id == null) {
			myErrorHandler(ERR_ON_SYNTAX, id);
		}
		else {
			predicate.fuzzyAggregatorName = id.getText();
		}
		return predicate;
	}

}

