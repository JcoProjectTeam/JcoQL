// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2025-05-12 22:56:30

  package jco.ql.parser;
  
  import java.io.*;
  import jco.ql.parser.model.*;
  import jco.ql.parser.model.condition.*;
  import jco.ql.parser.model.fuzzy.*;
  import jco.ql.parser.model.predicate.*;
  import jco.ql.parser.model.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JCoQLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADDING", "ADD_ST", "AGGREGATE", 
		"AGGREGATOR", "ALL", "ALPHACUT", "AND", "APEX", "APEX_VALUE", "ARRAY", 
		"ARRAY_FUNCTION", "AS", "AT", "BODY", "BOOLEAN", "BUILD", "BY", "CALL", 
		"CASE", "CASES", "CHECK_FOR", "CLASS", "COLLECTION", "COLLECTIONS", "COLON", 
		"COMMA", "COMMENT", "CONSTRAINT", "CREATE", "CUMULATE", "DB", "DEFAULT", 
		"DEFUZZIFY", "DEGREE", "DEGREES", "DERIVE", "DERIVED", "DICTIONARY", "DIGIT", 
		"DIGIT0", "DIRECTION", "DISTANCE", "DIV", "DOCUMENTS", "DOT", "DROP", 
		"DROPPING", "DUPLICATES", "EACH", "END_BODY", "EQ", "EVALUATE", "EVALUATOR", 
		"EXP", "EXPAND", "EXTENT", "EXTRACT_ARRAY", "FIELD", "FIELDS", "FIELD_NAME", 
		"FILTER", "FIRST", "FLOAT", "FOR", "FROM_ARRAY", "FROM_WEB", "FUNCTION", 
		"FUZZY", "GE", "GENERATE", "GEOMETRY", "GET", "GROUP", "GROUPING", "GT", 
		"HASH_NAME", "HOWINCLUDE", "HOWINTERSECT", "HOWMEET", "ID", "IF", "IF_ERROR", 
		"IF_FAILS", "IMPORT", "IN", "INCLUDED", "INPUT", "INRANGE", "INT", "INTERSECT", 
		"INTERSECTION", "INTO", "ISNOTNULL", "ISNULL", "JAVA", "JAVASCRIPT", "JOIN", 
		"KEEP", "KEEPING", "KNOWN", "LAST", "LB", "LBR", "LE", "LEFT", "LETTER", 
		"LOCALLY", "LOOKUP", "LP", "LT", "MATCHING", "MAXIMUM", "MEET", "MEMBERSHIP_ARRAY", 
		"MEMBERSHIP_TO", "MERGE", "MINIMUM", "MIN_SIMILARITY", "MODEL", "MUL", 
		"NEQ", "NOT", "OF", "ON", "OPERATOR", "OR", "ORDER", "ORIENTATION", "OTHERS", 
		"PARAMETERS", "PARTITION", "POINT", "POLYLINE", "POS", "PRECONDITION", 
		"PRODUCT", "QUOTE", "QUOTED_VALUE", "RB", "RBR", "REMOVE", "RESOLVING", 
		"RIGHT", "RP", "SAVE", "SC", "SCAN_ERROR", "SERVER", "SET", "SETS", "SETTING", 
		"SORT", "SUB", "SUBTRACT", "SUM", "THRESHOLD", "TILDE", "TO", "TO_POLYLINE", 
		"TRAJECTORY", "TRANSLATE", "TYPE", "UNCOMPARABLE", "UNKNOWN", "UNPACK", 
		"USE", "USING", "VERSUS", "WHERE", "WHITE_SPACES", "WITH", "WITHIN", "WITHOUT", 
		"WRT", "WS", "XXX"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int ADDING=5;
	public static final int ADD_ST=6;
	public static final int AGGREGATE=7;
	public static final int AGGREGATOR=8;
	public static final int ALL=9;
	public static final int ALPHACUT=10;
	public static final int AND=11;
	public static final int APEX=12;
	public static final int APEX_VALUE=13;
	public static final int ARRAY=14;
	public static final int ARRAY_FUNCTION=15;
	public static final int AS=16;
	public static final int AT=17;
	public static final int BODY=18;
	public static final int BOOLEAN=19;
	public static final int BUILD=20;
	public static final int BY=21;
	public static final int CALL=22;
	public static final int CASE=23;
	public static final int CASES=24;
	public static final int CHECK_FOR=25;
	public static final int CLASS=26;
	public static final int COLLECTION=27;
	public static final int COLLECTIONS=28;
	public static final int COLON=29;
	public static final int COMMA=30;
	public static final int COMMENT=31;
	public static final int CONSTRAINT=32;
	public static final int CREATE=33;
	public static final int CUMULATE=34;
	public static final int DB=35;
	public static final int DEFAULT=36;
	public static final int DEFUZZIFY=37;
	public static final int DEGREE=38;
	public static final int DEGREES=39;
	public static final int DERIVE=40;
	public static final int DERIVED=41;
	public static final int DICTIONARY=42;
	public static final int DIGIT=43;
	public static final int DIGIT0=44;
	public static final int DIRECTION=45;
	public static final int DISTANCE=46;
	public static final int DIV=47;
	public static final int DOCUMENTS=48;
	public static final int DOT=49;
	public static final int DROP=50;
	public static final int DROPPING=51;
	public static final int DUPLICATES=52;
	public static final int EACH=53;
	public static final int END_BODY=54;
	public static final int EQ=55;
	public static final int EVALUATE=56;
	public static final int EVALUATOR=57;
	public static final int EXP=58;
	public static final int EXPAND=59;
	public static final int EXTENT=60;
	public static final int EXTRACT_ARRAY=61;
	public static final int FIELD=62;
	public static final int FIELDS=63;
	public static final int FIELD_NAME=64;
	public static final int FILTER=65;
	public static final int FIRST=66;
	public static final int FLOAT=67;
	public static final int FOR=68;
	public static final int FROM_ARRAY=69;
	public static final int FROM_WEB=70;
	public static final int FUNCTION=71;
	public static final int FUZZY=72;
	public static final int GE=73;
	public static final int GENERATE=74;
	public static final int GEOMETRY=75;
	public static final int GET=76;
	public static final int GROUP=77;
	public static final int GROUPING=78;
	public static final int GT=79;
	public static final int HASH_NAME=80;
	public static final int HOWINCLUDE=81;
	public static final int HOWINTERSECT=82;
	public static final int HOWMEET=83;
	public static final int ID=84;
	public static final int IF=85;
	public static final int IF_ERROR=86;
	public static final int IF_FAILS=87;
	public static final int IMPORT=88;
	public static final int IN=89;
	public static final int INCLUDED=90;
	public static final int INPUT=91;
	public static final int INRANGE=92;
	public static final int INT=93;
	public static final int INTERSECT=94;
	public static final int INTERSECTION=95;
	public static final int INTO=96;
	public static final int ISNOTNULL=97;
	public static final int ISNULL=98;
	public static final int JAVA=99;
	public static final int JAVASCRIPT=100;
	public static final int JOIN=101;
	public static final int KEEP=102;
	public static final int KEEPING=103;
	public static final int KNOWN=104;
	public static final int LAST=105;
	public static final int LB=106;
	public static final int LBR=107;
	public static final int LE=108;
	public static final int LEFT=109;
	public static final int LETTER=110;
	public static final int LOCALLY=111;
	public static final int LOOKUP=112;
	public static final int LP=113;
	public static final int LT=114;
	public static final int MATCHING=115;
	public static final int MAXIMUM=116;
	public static final int MEET=117;
	public static final int MEMBERSHIP_ARRAY=118;
	public static final int MEMBERSHIP_TO=119;
	public static final int MERGE=120;
	public static final int MINIMUM=121;
	public static final int MIN_SIMILARITY=122;
	public static final int MODEL=123;
	public static final int MUL=124;
	public static final int NEQ=125;
	public static final int NOT=126;
	public static final int OF=127;
	public static final int ON=128;
	public static final int OPERATOR=129;
	public static final int OR=130;
	public static final int ORDER=131;
	public static final int ORIENTATION=132;
	public static final int OTHERS=133;
	public static final int PARAMETERS=134;
	public static final int PARTITION=135;
	public static final int POINT=136;
	public static final int POLYLINE=137;
	public static final int POS=138;
	public static final int PRECONDITION=139;
	public static final int PRODUCT=140;
	public static final int QUOTE=141;
	public static final int QUOTED_VALUE=142;
	public static final int RB=143;
	public static final int RBR=144;
	public static final int REMOVE=145;
	public static final int RESOLVING=146;
	public static final int RIGHT=147;
	public static final int RP=148;
	public static final int SAVE=149;
	public static final int SC=150;
	public static final int SCAN_ERROR=151;
	public static final int SERVER=152;
	public static final int SET=153;
	public static final int SETS=154;
	public static final int SETTING=155;
	public static final int SORT=156;
	public static final int SUB=157;
	public static final int SUBTRACT=158;
	public static final int SUM=159;
	public static final int THRESHOLD=160;
	public static final int TILDE=161;
	public static final int TO=162;
	public static final int TO_POLYLINE=163;
	public static final int TRAJECTORY=164;
	public static final int TRANSLATE=165;
	public static final int TYPE=166;
	public static final int UNCOMPARABLE=167;
	public static final int UNKNOWN=168;
	public static final int UNPACK=169;
	public static final int USE=170;
	public static final int USING=171;
	public static final int VERSUS=172;
	public static final int WHERE=173;
	public static final int WHITE_SPACES=174;
	public static final int WITH=175;
	public static final int WITHIN=176;
	public static final int WITHOUT=177;
	public static final int WRT=178;
	public static final int WS=179;
	public static final int XXX=180;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JCoQLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JCoQLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return JCoQLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g"; }


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
	    



	// $ANTLR start "start"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:94:1: start : ( useDbRule | getCollectionRule | getDictionaryRule | lookupFromWebRule | saveAsRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | filterRule | joinOfCollectionsRule | trajectoryMatchingRule | groupRule | expandRule | createJavaScriptFunctionRule | createJavaFunctionRule | createFuzzyOperatorRule | createFuzzyAggregatorRule | createFuzzyEvaluatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createGenericFuzzyEvaluatorRule | test )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:3: ( ( useDbRule | getCollectionRule | getDictionaryRule | lookupFromWebRule | saveAsRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | filterRule | joinOfCollectionsRule | trajectoryMatchingRule | groupRule | expandRule | createJavaScriptFunctionRule | createJavaFunctionRule | createFuzzyOperatorRule | createFuzzyAggregatorRule | createFuzzyEvaluatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createGenericFuzzyEvaluatorRule | test )* EOF )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:5: ( useDbRule | getCollectionRule | getDictionaryRule | lookupFromWebRule | saveAsRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | filterRule | joinOfCollectionsRule | trajectoryMatchingRule | groupRule | expandRule | createJavaScriptFunctionRule | createJavaFunctionRule | createFuzzyOperatorRule | createFuzzyAggregatorRule | createFuzzyEvaluatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createGenericFuzzyEvaluatorRule | test )* EOF
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:5: ( useDbRule | getCollectionRule | getDictionaryRule | lookupFromWebRule | saveAsRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | filterRule | joinOfCollectionsRule | trajectoryMatchingRule | groupRule | expandRule | createJavaScriptFunctionRule | createJavaFunctionRule | createFuzzyOperatorRule | createFuzzyAggregatorRule | createFuzzyEvaluatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createGenericFuzzyEvaluatorRule | test )*
			loop1:
			while (true) {
				int alt1=23;
				switch ( input.LA(1) ) {
				case USE:
					{
					alt1=1;
					}
					break;
				case GET:
					{
					int LA1_3 = input.LA(2);
					if ( (LA1_3==COLLECTION) ) {
						alt1=2;
					}
					else if ( (LA1_3==DICTIONARY) ) {
						alt1=3;
					}

					}
					break;
				case LOOKUP:
					{
					alt1=4;
					}
					break;
				case SAVE:
					{
					alt1=5;
					}
					break;
				case MERGE:
					{
					alt1=6;
					}
					break;
				case INTERSECT:
					{
					alt1=7;
					}
					break;
				case SUBTRACT:
					{
					alt1=8;
					}
					break;
				case FILTER:
					{
					alt1=9;
					}
					break;
				case JOIN:
					{
					alt1=10;
					}
					break;
				case TRAJECTORY:
					{
					alt1=11;
					}
					break;
				case GROUP:
					{
					alt1=12;
					}
					break;
				case EXPAND:
					{
					alt1=13;
					}
					break;
				case CREATE:
					{
					switch ( input.LA(2) ) {
					case JAVASCRIPT:
						{
						alt1=14;
						}
						break;
					case JAVA:
						{
						alt1=15;
						}
						break;
					case FUZZY:
						{
						switch ( input.LA(3) ) {
						case OPERATOR:
							{
							alt1=16;
							}
							break;
						case AGGREGATOR:
							{
							alt1=17;
							}
							break;
						case EVALUATOR:
							{
							alt1=18;
							}
							break;
						case SET:
							{
							alt1=19;
							}
							break;
						}
						}
						break;
					case ID:
						{
						int LA1_21 = input.LA(3);
						if ( (LA1_21==FUZZY) ) {
							int LA1_26 = input.LA(4);
							if ( (LA1_26==OPERATOR) ) {
								alt1=20;
							}
							else if ( (LA1_26==EVALUATOR) ) {
								alt1=21;
							}

						}

						}
						break;
					}
					}
					break;
				case XXX:
					{
					alt1=22;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:7: useDbRule
					{
					pushFollow(FOLLOW_useDbRule_in_start81);
					useDbRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:96:7: getCollectionRule
					{
					pushFollow(FOLLOW_getCollectionRule_in_start115);
					getCollectionRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:97:7: getDictionaryRule
					{
					pushFollow(FOLLOW_getDictionaryRule_in_start141);
					getDictionaryRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:98:7: lookupFromWebRule
					{
					pushFollow(FOLLOW_lookupFromWebRule_in_start159);
					lookupFromWebRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:99:7: saveAsRule
					{
					pushFollow(FOLLOW_saveAsRule_in_start177);
					saveAsRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:101:7: mergeCollectionsRule
					{
					pushFollow(FOLLOW_mergeCollectionsRule_in_start211);
					mergeCollectionsRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:102:7: intersectCollectionsRule
					{
					pushFollow(FOLLOW_intersectCollectionsRule_in_start234);
					intersectCollectionsRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:103:7: subtractCollectionsRule
					{
					pushFollow(FOLLOW_subtractCollectionsRule_in_start253);
					subtractCollectionsRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:105:7: filterRule
					{
					pushFollow(FOLLOW_filterRule_in_start274);
					filterRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:106:7: joinOfCollectionsRule
					{
					pushFollow(FOLLOW_joinOfCollectionsRule_in_start307);
					joinOfCollectionsRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:107:7: trajectoryMatchingRule
					{
					pushFollow(FOLLOW_trajectoryMatchingRule_in_start329);
					trajectoryMatchingRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:109:7: groupRule
					{
					pushFollow(FOLLOW_groupRule_in_start349);
					groupRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:110:7: expandRule
					{
					pushFollow(FOLLOW_expandRule_in_start383);
					expandRule();
					state._fsp--;

					}
					break;
				case 14 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:112:7: createJavaScriptFunctionRule
					{
					pushFollow(FOLLOW_createJavaScriptFunctionRule_in_start417);
					createJavaScriptFunctionRule();
					state._fsp--;

					}
					break;
				case 15 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:113:7: createJavaFunctionRule
					{
					pushFollow(FOLLOW_createJavaFunctionRule_in_start429);
					createJavaFunctionRule();
					state._fsp--;

					}
					break;
				case 16 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:7: createFuzzyOperatorRule
					{
					pushFollow(FOLLOW_createFuzzyOperatorRule_in_start445);
					createFuzzyOperatorRule();
					state._fsp--;

					}
					break;
				case 17 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:116:7: createFuzzyAggregatorRule
					{
					pushFollow(FOLLOW_createFuzzyAggregatorRule_in_start460);
					createFuzzyAggregatorRule();
					state._fsp--;

					}
					break;
				case 18 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:117:7: createFuzzyEvaluatorRule
					{
					pushFollow(FOLLOW_createFuzzyEvaluatorRule_in_start476);
					createFuzzyEvaluatorRule();
					state._fsp--;

					}
					break;
				case 19 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:119:7: createFuzzySetModelRule
					{
					pushFollow(FOLLOW_createFuzzySetModelRule_in_start491);
					createFuzzySetModelRule();
					state._fsp--;

					}
					break;
				case 20 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:120:7: createGenericFuzzySetOperatorRule
					{
					pushFollow(FOLLOW_createGenericFuzzySetOperatorRule_in_start506);
					createGenericFuzzySetOperatorRule();
					state._fsp--;

					}
					break;
				case 21 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:121:7: createGenericFuzzyEvaluatorRule
					{
					pushFollow(FOLLOW_createGenericFuzzyEvaluatorRule_in_start516);
					createGenericFuzzyEvaluatorRule();
					state._fsp--;

					}
					break;
				case 22 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:7: test
					{
					pushFollow(FOLLOW_test_in_start530);
					test();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start566); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "test"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:128:1: test : XXX SC ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:128:5: ( XXX SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:128:7: XXX SC
			{
			match(input,XXX,FOLLOW_XXX_in_test577); 
			match(input,SC,FOLLOW_SC_in_test579); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "test"



	// $ANTLR start "collectionReferenceRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:133:1: collectionReferenceRule returns [DbCollection cr] : name= ID ( AT db= ID )? ( AS alias= ID )? ;
	public final DbCollection collectionReferenceRule() throws RecognitionException {
		DbCollection cr = null;


		Token name=null;
		Token db=null;
		Token alias=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:134:3: (name= ID ( AT db= ID )? ( AS alias= ID )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:135:5: name= ID ( AT db= ID )? ( AS alias= ID )?
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule603); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:136:5: ( AT db= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:136:7: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_collectionReferenceRule613); 
					db=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule617); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:137:5: ( AS alias= ID )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:137:7: AS alias= ID
					{
					match(input,AS,FOLLOW_AS_in_collectionReferenceRule630); 
					alias=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule634); 
					}
					break;

			}

			 cr = env.addDbCollection (name, db, alias); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return cr;
	}
	// $ANTLR end "collectionReferenceRule"



	// $ANTLR start "fieldRefRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:142:1: fieldRefRule returns [Field field] : (fd= FIELD_NAME )+ ;
	public final Field fieldRefRule() throws RecognitionException {
		Field field = null;


		Token fd=null;

			field = new Field (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:144:3: ( (fd= FIELD_NAME )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:145:5: (fd= FIELD_NAME )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:145:5: (fd= FIELD_NAME )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==FIELD_NAME) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:145:7: fd= FIELD_NAME
					{
					fd=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_fieldRefRule681); 
					 env.addField (field, fd); 
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return field;
	}
	// $ANTLR end "fieldRefRule"



	// $ANTLR start "buildActionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:1: buildActionRule returns [BuildAction ga] : ( BUILD os= objectStructureRule[true] | ADD_ST FIELDS os= objectStructureRule[true] | REMOVE FIELDS LBR fr= fieldRefRule ( COMMA fr= fieldRefRule )* RBR );
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;
		Field fr =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:151:3: ( BUILD os= objectStructureRule[true] | ADD_ST FIELDS os= objectStructureRule[true] | REMOVE FIELDS LBR fr= fieldRefRule ( COMMA fr= fieldRefRule )* RBR )
			int alt6=3;
			switch ( input.LA(1) ) {
			case BUILD:
				{
				alt6=1;
				}
				break;
			case ADD_ST:
				{
				alt6=2;
				}
				break;
			case REMOVE:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:152:5: BUILD os= objectStructureRule[true]
					{
					match(input,BUILD,FOLLOW_BUILD_in_buildActionRule721); 
					pushFollow(FOLLOW_objectStructureRule_in_buildActionRule743);
					os=objectStructureRule(true);
					state._fsp--;

					 ga.setBuildObjectStructure (os); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:154:4: ADD_ST FIELDS os= objectStructureRule[true]
					{
					match(input,ADD_ST,FOLLOW_ADD_ST_in_buildActionRule753); 
					match(input,FIELDS,FOLLOW_FIELDS_in_buildActionRule755); 
					pushFollow(FOLLOW_objectStructureRule_in_buildActionRule765);
					os=objectStructureRule(true);
					state._fsp--;

					 ga.setAddObjectStructure (os); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:156:4: REMOVE FIELDS LBR fr= fieldRefRule ( COMMA fr= fieldRefRule )* RBR
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_buildActionRule777); 
					match(input,FIELDS,FOLLOW_FIELDS_in_buildActionRule779); 
					match(input,LBR,FOLLOW_LBR_in_buildActionRule784); 
					pushFollow(FOLLOW_fieldRefRule_in_buildActionRule788);
					fr=fieldRefRule();
					state._fsp--;

					 ga.setRemoveField (fr); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:5: ( COMMA fr= fieldRefRule )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:6: COMMA fr= fieldRefRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_buildActionRule805); 
							pushFollow(FOLLOW_fieldRefRule_in_buildActionRule809);
							fr=fieldRefRule();
							state._fsp--;

							 ga.setRemoveField (fr); 
							}
							break;

						default :
							break loop5;
						}
					}

					match(input,RBR,FOLLOW_RBR_in_buildActionRule829); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ga;
	}
	// $ANTLR end "buildActionRule"



	// $ANTLR start "objectStructureRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:164:1: objectStructureRule[boolean generateActionCaller] returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule(boolean generateActionCaller) throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:165:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:166:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule854); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule865);
			ofs=outputFieldSpecRule();
			state._fsp--;

			 obj = new ObjectStructure (ofs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:168:8: (t= COMMA ofs= outputFieldSpecRule )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:168:10: t= COMMA ofs= outputFieldSpecRule
					{
					t=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectStructureRule886); 
					pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule890);
					ofs=outputFieldSpecRule();
					state._fsp--;

					 env.addOutputFieldSpec (obj, ofs, generateActionCaller, t); 
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_objectStructureRule906); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "objectStructureRule"



	// $ANTLR start "outputFieldSpecRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:174:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:175:3: (fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:176:5: fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule931);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:5: ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==COLON) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:7: COLON (os= objectStructureRule[false] |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule945); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:13: (os= objectStructureRule[false] |f= factorRule )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LBR) ) {
						alt8=1;
					}
					else if ( (LA8_0==APEX_VALUE||LA8_0==ARRAY_FUNCTION||LA8_0==BOOLEAN||LA8_0==DEGREE||(LA8_0 >= EXTENT && LA8_0 <= EXTRACT_ARRAY)||LA8_0==FIELD_NAME||LA8_0==FLOAT||LA8_0==HASH_NAME||(LA8_0 >= ID && LA8_0 <= IF_ERROR)||LA8_0==INT||LA8_0==LB||LA8_0==LP||(LA8_0 >= MEMBERSHIP_ARRAY && LA8_0 <= MEMBERSHIP_TO)||LA8_0==QUOTED_VALUE||LA8_0==TRANSLATE) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:15: os= objectStructureRule[false]
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule951);
							os=objectStructureRule(false);
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:11: f= factorRule
							{
							pushFollow(FOLLOW_factorRule_in_outputFieldSpecRule990);
							f=factorRule();
							state._fsp--;

								ofs.setFieldSpec (f);		
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ofs;
	}
	// $ANTLR end "outputFieldSpecRule"



	// $ANTLR start "geometricOptionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:3: ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==KEEPING) ) {
				alt11=1;
			}
			else if ( (LA11_0==SETTING) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:188:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule1080); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule1082); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:189:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule1114); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule1116); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:190:14: ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					int alt10=4;
					switch ( input.LA(1) ) {
					case POINT:
						{
						alt10=1;
						}
						break;
					case AGGREGATE:
						{
						alt10=2;
						}
						break;
					case FIELD_NAME:
						{
						alt10=3;
						}
						break;
					case TO_POLYLINE:
						{
						alt10=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:190:16: POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP
							{
							match(input,POINT,FOLLOW_POINT_in_geometricOptionRule1134); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1136); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1140);
							lat=fieldRefRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_geometricOptionRule1142); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1146);
							lon=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1148); 
							 geo.setPoint (lat, lon); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:191:16: AGGREGATE LP afr= fieldRefRule RP
							{
							match(input,AGGREGATE,FOLLOW_AGGREGATE_in_geometricOptionRule1168); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1170); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1174);
							afr=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1176); 
							 geo.setAggregate (afr); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:192:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1208);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:193:16: TO_POLYLINE LP f= fieldRefRule RP
							{
							match(input,TO_POLYLINE,FOLLOW_TO_POLYLINE_in_geometricOptionRule1246); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1248); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1252);
							f=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1254); 
							 geo.setPolyline (f); 
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return geo;
	}
	// $ANTLR end "geometricOptionRule"



	// $ANTLR start "dropGeometryRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:197:1: dropGeometryRule : DROPPING GEOMETRY ;
	public final void dropGeometryRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:198:3: ( DROPPING GEOMETRY )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:4: DROPPING GEOMETRY
			{
			match(input,DROPPING,FOLLOW_DROPPING_in_dropGeometryRule1300); 
			match(input,GEOMETRY,FOLLOW_GEOMETRY_in_dropGeometryRule1302); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dropGeometryRule"



	// $ANTLR start "caseClauseRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:203:1: caseClauseRule returns [CaseClause cc] : (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		Token c=null;
		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:204:3: ( (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:5: (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:5: (c= CASES |c= CASE )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CASES) ) {
				alt12=1;
			}
			else if ( (LA12_0==CASE) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:7: c= CASES
					{
					c=(Token)match(input,CASES,FOLLOW_CASES_in_caseClauseRule1353); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:17: c= CASE
					{
					c=(Token)match(input,CASE,FOLLOW_CASE_in_caseClauseRule1359); 
					}
					break;

			}

			 cc = env.newCaseClause (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:8: (wc= whereCaseRule )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==WHERE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1382);
					wc=whereCaseRule();
					state._fsp--;

					 cc.addWhereCase (wc); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:8: (oth= othersRule )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==DROP||LA14_0==KEEP) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1411);
					oth=othersRule();
					state._fsp--;

					 cc.setOthers (oth); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return cc;
	}
	// $ANTLR end "caseClauseRule"



	// $ANTLR start "othersRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:211:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:212:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:213:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:213:6: (ot= KEEP |ot= DROP )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==KEEP) ) {
				alt15=1;
			}
			else if ( (LA15_0==DROP) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:213:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1454); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:213:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1460); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1471); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return oth;
	}
	// $ANTLR end "othersRule"



	// $ANTLR start "whereCaseRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1496); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1507);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:223:7: (gs= generateSectionRule[true] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==GENERATE) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:223:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1525);
					gs=generateSectionRule(true);
					state._fsp--;

						wc.setGenerateSection (gs);	
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return wc;
	}
	// $ANTLR end "whereCaseRule"



	// $ANTLR start "generateSectionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:229:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )* (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:230:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )* (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:231:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )* (df= keepDropFuzzySetsRule )? ( dropGeometryRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1562); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:232:7: (go= geometricOptionRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==KEEPING) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==GEOMETRY) ) {
					alt17=1;
				}
			}
			else if ( (LA17_0==SETTING) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:232:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1579);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:233:4: (cf= checkForFuzzySetRule[gs] )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==CHECK_FOR) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:233:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1596);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:4: (ac= alphaCutRule[gs] )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ALPHACUT) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1627);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:235:7: (ga= buildActionRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==REMOVE) ) {
					int LA20_6 = input.LA(2);
					if ( (LA20_6==FIELDS) ) {
						alt20=1;
					}

				}
				else if ( (LA20_0==ADD_ST||LA20_0==BUILD) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:235:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1665);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

				default :
					break loop20;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:236:4: (df= keepDropFuzzySetsRule )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DEFUZZIFY||LA21_0==KEEPING) ) {
				alt21=1;
			}
			else if ( (LA21_0==DROPPING) ) {
				int LA21_2 = input.LA(2);
				if ( (LA21_2==ALL||LA21_2==FUZZY) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:236:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1685);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:237:7: ( dropGeometryRule )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==DROPPING) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:237:9: dropGeometryRule
					{
					pushFollow(FOLLOW_dropGeometryRule_in_generateSectionRule1703);
					dropGeometryRule();
					state._fsp--;

						gs.addDropGeometry (); 				
					}
					break;

			}

				env.checkGenerate (gs, g);		
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return gs;
	}
	// $ANTLR end "generateSectionRule"



	// $ANTLR start "orConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:245:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:246:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:247:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1764);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:4: ( OR c2= andConditionRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==OR) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1779); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1783);
					c2=andConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop23;
				}
			}

			 c = env.simplifyConditionOr ((ConditionOr)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "orConditionRule"



	// $ANTLR start "andConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:253:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:254:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:255:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1840);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:256:5: ( AND c2= notConditionRule )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==AND) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:256:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1856); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1860);
					c2=notConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop24;
				}
			}

			 c = env.simplifyConditionAnd ((ConditionAnd)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "andConditionRule"



	// $ANTLR start "notConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:261:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:5: (not= NOT )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==NOT) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1922); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1934);
			p=predicateRule();
			state._fsp--;

			 c = env.createCondition (not, p); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "notConditionRule"



	// $ANTLR start "predicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
	public final Predicate predicateRule() throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;
		NullPredicate np =null;
		WithPredicate wp =null;
		WithoutPredicate wop =null;
		WUKPredicate fp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
			int alt27=5;
			switch ( input.LA(1) ) {
			case ADD:
			case APEX_VALUE:
			case ARRAY_FUNCTION:
			case BOOLEAN:
			case DEGREE:
			case EXTENT:
			case EXTRACT_ARRAY:
			case FIELD_NAME:
			case FLOAT:
			case HASH_NAME:
			case ID:
			case IF:
			case IF_ERROR:
			case INT:
			case LB:
			case LP:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case QUOTED_VALUE:
			case SUB:
			case TRANSLATE:
				{
				alt27=1;
				}
				break;
			case FIELD:
				{
				alt27=2;
				}
				break;
			case WITH:
				{
				alt27=3;
				}
				break;
			case WITHOUT:
				{
				alt27=4;
				}
				break;
			case KNOWN:
			case UNKNOWN:
			case WITHIN:
				{
				alt27=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:272:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1978);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:273:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					int alt26=3;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EQ||LA26_0==GE||LA26_0==GT||LA26_0==LE||LA26_0==LT||LA26_0==NEQ) ) {
						alt26=1;
					}
					else if ( (LA26_0==INRANGE) ) {
						alt26=2;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:273:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule2006);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule2035);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule2067);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule2090);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule2116);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule2136);
					fp=wukFuzzyPredicateRule();
					state._fsp--;

					 p = fp; 	
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "predicateRule"



	// $ANTLR start "compareRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:282:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:284:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule2172);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule2181);
			e2=expressionRule();
			state._fsp--;

			 p = new ComparisonPredicate (e1, c.getText(), e2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "compareRule"



	// $ANTLR start "inRangeRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:289:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule2210); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:11: (lp= LB |lp= LP )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==LB) ) {
				alt28=1;
			}
			else if ( (LA28_0==LP) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule2216); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule2222); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule2232);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule2234); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule2238);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:3: (rp= RP |rp= RB )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==RP) ) {
				alt29=1;
			}
			else if ( (LA29_0==RB) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule2247); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule2253); 
					}
					break;

			}

				p = env.getInRangePredicate (expr, lp, n1, n2, rp); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "inRangeRule"



	// $ANTLR start "nullPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule2292); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2296);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:26: (n= ISNULL |n= ISNOTNULL )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ISNULL) ) {
				alt30=1;
			}
			else if ( (LA30_0==ISNOTNULL) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2302); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2308); 
					}
					break;

			}

				np = env.createNullPredicate (f, n); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return np;
	}
	// $ANTLR end "nullPredicateRule"



	// $ANTLR start "wukFuzzyPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:305:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:305:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
			int alt31=3;
			switch ( input.LA(1) ) {
			case WITHIN:
				{
				alt31=1;
				}
				break;
			case KNOWN:
				{
				alt31=2;
				}
				break;
			case UNKNOWN:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:305:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2382); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:305:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2388); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:305:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2394); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2415); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2417); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2421); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:307:7: ( COMMA fs= ID )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==COMMA) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:307:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2451); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2455); 
					 env.addFuzzySet (wuk, fs); 
					}
					break;

				default :
					break loop32;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return wuk;
	}
	// $ANTLR end "wukFuzzyPredicateRule"



	// $ANTLR start "withoutPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:315:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2508); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2519);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:7: ( COMMA fr= fieldRefRule )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2537); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2541);
					fr=fieldRefRule();
					state._fsp--;

					 wp.addField (fr); 
					}
					break;

				default :
					break loop33;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return wp;
	}
	// $ANTLR end "withoutPredicateRule"



	// $ANTLR start "withPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:325:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2579); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==ARRAY||LA35_0==GEOMETRY||LA35_0==ID) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					int alt34=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt34=1;
						}
						break;
					case ARRAY:
						{
						alt34=2;
						}
						break;
					case GEOMETRY:
						{
						alt34=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}
					switch (alt34) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2594); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2600); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2606); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2627);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:328:6: ( COMMA fr= fieldRefRule )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==COMMA) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:328:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2650); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2654);
					fr=fieldRefRule();
					state._fsp--;

					 wp.addField (fr); 
					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return wp;
	}
	// $ANTLR end "withPredicateRule"



	// $ANTLR start "expressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:333:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:335:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==APEX_VALUE||LA38_0==ARRAY_FUNCTION||LA38_0==BOOLEAN||LA38_0==DEGREE||(LA38_0 >= EXTENT && LA38_0 <= EXTRACT_ARRAY)||LA38_0==FIELD_NAME||LA38_0==FLOAT||LA38_0==HASH_NAME||(LA38_0 >= ID && LA38_0 <= IF_ERROR)||LA38_0==INT||LA38_0==LB||LA38_0==LP||(LA38_0 >= MEMBERSHIP_ARRAY && LA38_0 <= MEMBERSHIP_TO)||LA38_0==QUOTED_VALUE||LA38_0==TRANSLATE) ) {
				alt38=1;
			}
			else if ( (LA38_0==ADD||LA38_0==SUB) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2701);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:6: (s= ADD |s= SUB )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==ADD) ) {
						alt37=1;
					}
					else if ( (LA37_0==SUB) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2724); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2730); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2735);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==ADD||LA40_0==SUB) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:7: (s= ADD |s= SUB )
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==ADD) ) {
						alt39=1;
					}
					else if ( (LA39_0==SUB) ) {
						alt39=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}

					switch (alt39) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2753); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2759); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2764);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop40;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "expressionRule"



	// $ANTLR start "termRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:344:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:345:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2802);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==DIV||LA42_0==MUL) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:7: (s= MUL |s= DIV )
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==MUL) ) {
						alt41=1;
					}
					else if ( (LA41_0==DIV) ) {
						alt41=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}

					switch (alt41) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2825); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2831); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2836);
					f=factorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop42;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return et;
	}
	// $ANTLR end "termRule"



	// $ANTLR start "factorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:350:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB ) ( EXP e= factorRule )? ;
	public final ExpressionFactor factorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Condition op =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor sf =null;
		ExpressionFactor f =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:3: ( ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB ) ( EXP e= factorRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:4: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB ) ( EXP e= factorRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:4: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB )
			int alt45=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt45=1;
				}
				break;
			case FIELD_NAME:
				{
				alt45=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt45=3;
				}
				break;
			case ID:
				{
				alt45=4;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case EXTENT:
			case EXTRACT_ARRAY:
			case HASH_NAME:
			case IF:
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt45=5;
				}
				break;
			case LB:
				{
				alt45=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:6: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2869); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2873);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2875); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2899);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2926);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2954); 
					match(input,LP,FOLLOW_LP_in_factorRule2956); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:14: (fp= functionParamsRule )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==ADD||LA43_0==APEX_VALUE||LA43_0==ARRAY_FUNCTION||LA43_0==BOOLEAN||LA43_0==DEGREE||(LA43_0 >= EXTENT && LA43_0 <= EXTRACT_ARRAY)||LA43_0==FIELD_NAME||LA43_0==FLOAT||LA43_0==HASH_NAME||(LA43_0 >= ID && LA43_0 <= IF_ERROR)||LA43_0==INT||LA43_0==LB||LA43_0==LP||(LA43_0 >= MEMBERSHIP_ARRAY && LA43_0 <= MEMBERSHIP_TO)||LA43_0==QUOTED_VALUE||LA43_0==SUB||LA43_0==TRANSLATE) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2961);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2965); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:6: sf= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2982);
					sf=specialFunctionRule();
					state._fsp--;

						ef = sf; 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:6: LB f= factorRule ( COMMA f= factorRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_factorRule3014); 
					pushFollow(FOLLOW_factorRule_in_factorRule3018);
					f=factorRule();
					state._fsp--;

					 ef = new ExpressionFactor (f); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:6: ( COMMA f= factorRule )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==COMMA) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:8: COMMA f= factorRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_factorRule3045); 
							pushFollow(FOLLOW_factorRule_in_factorRule3049);
							f=factorRule();
							state._fsp--;

								ef.addArrayValue (f); 
							}
							break;

						default :
							break loop44;
						}
					}

					match(input,RB,FOLLOW_RB_in_factorRule3088); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:4: ( EXP e= factorRule )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==EXP) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:6: EXP e= factorRule
					{
					match(input,EXP,FOLLOW_EXP_in_factorRule3101); 
					pushFollow(FOLLOW_factorRule_in_factorRule3105);
					e=factorRule();
					state._fsp--;

						ef.addExp (e); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ef;
	}
	// $ANTLR end "factorRule"



	// $ANTLR start "specialFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (mt= MEMBERSHIP_TO LP fs= ID RP | EXTENT LP fs= ID RP | DEGREE LP fs= ID (dg= FIELD_NAME )? RP |fs= HASH_NAME (dg= FIELD_NAME )? | MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP | EXTRACT_ARRAY LP field= fieldRefRule FROM_ARRAY array= fieldRefRule RP | IF LP LP co= orConditionRule RP COMMA et= restrictedExpressionRule COMMA ef= restrictedExpressionRule RP | IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP | TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
	public final SpecialFunctionFactor specialFunctionRule() throws RecognitionException {
		SpecialFunctionFactor expr = null;


		Token mt=null;
		Token fs=null;
		Token dg=null;
		Token fuzzySet=null;
		Token dict=null;
		Token cs=null;
		Token d=null;
		Field array =null;
		Field field =null;
		Condition co =null;
		Expression et =null;
		Expression ef =null;
		Expression e =null;
		Value v =null;
		ArrayFunctionFactor a =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:2: (mt= MEMBERSHIP_TO LP fs= ID RP | EXTENT LP fs= ID RP | DEGREE LP fs= ID (dg= FIELD_NAME )? RP |fs= HASH_NAME (dg= FIELD_NAME )? | MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP | EXTRACT_ARRAY LP field= fieldRefRule FROM_ARRAY array= fieldRefRule RP | IF LP LP co= orConditionRule RP COMMA et= restrictedExpressionRule COMMA ef= restrictedExpressionRule RP | IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP | TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
			int alt54=10;
			switch ( input.LA(1) ) {
			case MEMBERSHIP_TO:
				{
				alt54=1;
				}
				break;
			case EXTENT:
				{
				alt54=2;
				}
				break;
			case DEGREE:
				{
				alt54=3;
				}
				break;
			case HASH_NAME:
				{
				alt54=4;
				}
				break;
			case MEMBERSHIP_ARRAY:
				{
				alt54=5;
				}
				break;
			case EXTRACT_ARRAY:
				{
				alt54=6;
				}
				break;
			case IF:
				{
				alt54=7;
				}
				break;
			case IF_ERROR:
				{
				alt54=8;
				}
				break;
			case TRANSLATE:
				{
				alt54=9;
				}
				break;
			case ARRAY_FUNCTION:
				{
				alt54=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:4: mt= MEMBERSHIP_TO LP fs= ID RP
					{
					mt=(Token)match(input,MEMBERSHIP_TO,FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule3156); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3159); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3163); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule3165); 
						expr = env.buildMembershipTo (mt, fs); 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:369:5: EXTENT LP fs= ID RP
					{
					match(input,EXTENT,FOLLOW_EXTENT_in_specialFunctionRule3196); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3204); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3208); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule3210); 
						expr = env.buildExtent (fs); 						
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:370:5: DEGREE LP fs= ID (dg= FIELD_NAME )? RP
					{
					match(input,DEGREE,FOLLOW_DEGREE_in_specialFunctionRule3241); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3249); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3253); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:370:29: (dg= FIELD_NAME )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==FIELD_NAME) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:370:29: dg= FIELD_NAME
							{
							dg=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_specialFunctionRule3257); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3260); 
						expr = env.buildDegree (fs, dg, true);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:371:5: fs= HASH_NAME (dg= FIELD_NAME )?
					{
					fs=(Token)match(input,HASH_NAME,FOLLOW_HASH_NAME_in_specialFunctionRule3287); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:371:27: (dg= FIELD_NAME )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==FIELD_NAME) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:371:27: dg= FIELD_NAME
							{
							dg=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_specialFunctionRule3298); 
							}
							break;

					}

						expr = env.buildDegree (fs, dg, false);	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:372:5: MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP
					{
					match(input,MEMBERSHIP_ARRAY,FOLLOW_MEMBERSHIP_ARRAY_in_specialFunctionRule3327); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3330); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:373:4: ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB )
					int alt50=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt50=1;
						}
						break;
					case ID:
						{
						alt50=2;
						}
						break;
					case LB:
						{
						alt50=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:373:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_specialFunctionRule3365); 
							 expr = new MembershipArray (); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:374:6: fuzzySet= ID FROM_ARRAY array= fieldRefRule
							{
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3412); 
							match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_specialFunctionRule3414); 
							pushFollow(FOLLOW_fieldRefRule_in_specialFunctionRule3418);
							array=fieldRefRule();
							state._fsp--;

							 expr = env.createMembershipArray (fuzzySet, array); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:375:6: LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB
							{
							match(input,LB,FOLLOW_LB_in_specialFunctionRule3443); 
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3447); 
							 expr = env.createMembershipArray (fuzzySet); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:376:5: ( COMMA fuzzySet= ID )*
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( (LA49_0==COMMA) ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:376:7: COMMA fuzzySet= ID
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3487); 
									fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3491); 
									 env.addMembershipArray ((MembershipArray)expr, fuzzySet); 
									}
									break;

								default :
									break loop49;
								}
							}

							match(input,RB,FOLLOW_RB_in_specialFunctionRule3534); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3541); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:379:5: EXTRACT_ARRAY LP field= fieldRefRule FROM_ARRAY array= fieldRefRule RP
					{
					match(input,EXTRACT_ARRAY,FOLLOW_EXTRACT_ARRAY_in_specialFunctionRule3547); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3551); 
					pushFollow(FOLLOW_fieldRefRule_in_specialFunctionRule3555);
					field=fieldRefRule();
					state._fsp--;

					match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_specialFunctionRule3557); 
					pushFollow(FOLLOW_fieldRefRule_in_specialFunctionRule3561);
					array=fieldRefRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3563); 
						expr = env.createExtractArray(field, array); 
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:380:5: IF LP LP co= orConditionRule RP COMMA et= restrictedExpressionRule COMMA ef= restrictedExpressionRule RP
					{
					match(input,IF,FOLLOW_IF_in_specialFunctionRule3572); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3574); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3576); 
					pushFollow(FOLLOW_orConditionRule_in_specialFunctionRule3580);
					co=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3582); 
					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3611); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3615);
					et=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3621); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3625);
					ef=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3627); 
						expr = env.buildIfFunction (co, et, ef); 
					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:5: IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule3653); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3659); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3663);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3665); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule3669);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3671); 
						expr = env.buildIfError (e, v); 					
					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:5: TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule3682); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3688); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3692);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3694); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3698); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:16: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==COMMA) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:18: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3718); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule3722); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:17: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt52=2;
							int LA52_0 = input.LA(1);
							if ( (LA52_0==COMMA) ) {
								alt52=1;
							}
							switch (alt52) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:19: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3743); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:25: (d= APEX_VALUE |d= QUOTED_VALUE )
									int alt51=2;
									int LA51_0 = input.LA(1);
									if ( (LA51_0==APEX_VALUE) ) {
										alt51=1;
									}
									else if ( (LA51_0==QUOTED_VALUE) ) {
										alt51=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 51, 0, input);
										throw nvae;
									}

									switch (alt51) {
										case 1 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:26: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule3748); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:41: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule3754); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3763); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 10 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule3776);
					a=arrayFunctionRule();
					state._fsp--;

					 expr = a; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "specialFunctionRule"



	// $ANTLR start "valueRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |b= BOOLEAN |a= APEX_VALUE |q= QUOTED_VALUE );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token b=null;
		Token a=null;
		Token q=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:3: (n= INT |f= FLOAT |b= BOOLEAN |a= APEX_VALUE |q= QUOTED_VALUE )
			int alt55=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt55=1;
				}
				break;
			case FLOAT:
				{
				alt55=2;
				}
				break;
			case BOOLEAN:
				{
				alt55=3;
				}
				break;
			case APEX_VALUE:
				{
				alt55=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt55=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:393:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule3830); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule3850); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule3869); 
					 vl = new Value (Value.BOOLEAN, b.getText());	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:396:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule3886); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule3900); 
					 vl = new Value (Value.QUOTED, q.getText());	
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vl;
	}
	// $ANTLR end "valueRule"



	// $ANTLR start "arrayFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:403:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3928); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3968); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:406:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==FIELD_NAME) ) {
				alt57=1;
			}
			else if ( (LA57_0==LB) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:406:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3997);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:407:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule4018); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule4022);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:408:5: ( COMMA e= restrictedExpressionRule )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==COMMA) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:408:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule4037); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule4041);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop56;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule4065); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule4073); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule4077); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==COMMA) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule4105); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==FIELD_NAME) ) {
						alt60=1;
					}
					else if ( (LA60_0==DOCUMENTS) ) {
						alt60=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 60, 0, input);
						throw nvae;
					}

					switch (alt60) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule4111);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:413:9: ( COMMA fx= fieldRefRule )*
							loop58:
							while (true) {
								int alt58=2;
								int LA58_0 = input.LA(1);
								if ( (LA58_0==COMMA) ) {
									alt58=1;
								}

								switch (alt58) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:413:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule4133); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule4137);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop58;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule4169); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule4192); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule4196);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:9: ( COMMA fx= fieldRefRule )*
							loop59:
							while (true) {
								int alt59=2;
								int LA59_0 = input.LA(1);
								if ( (LA59_0==COMMA) ) {
									alt59=1;
								}

								switch (alt59) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule4215); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule4219);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop59;
								}
							}

							}
							break;

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule4257); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return af;
	}
	// $ANTLR end "arrayFunctionRule"



	// $ANTLR start "restrictedExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:431:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:432:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:432:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==APEX_VALUE||LA63_0==ARRAY_FUNCTION||LA63_0==BOOLEAN||LA63_0==DEGREE||(LA63_0 >= EXTENT && LA63_0 <= EXTRACT_ARRAY)||LA63_0==FIELD_NAME||LA63_0==FLOAT||LA63_0==HASH_NAME||(LA63_0 >= ID && LA63_0 <= IF_ERROR)||LA63_0==INT||LA63_0==LB||LA63_0==LP||(LA63_0 >= MEMBERSHIP_ARRAY && LA63_0 <= MEMBERSHIP_TO)||LA63_0==QUOTED_VALUE||LA63_0==TRANSLATE) ) {
				alt63=1;
			}
			else if ( (LA63_0==ADD||LA63_0==SUB) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:432:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4292);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:5: (s= ADD |s= SUB )
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==ADD) ) {
						alt62=1;
					}
					else if ( (LA62_0==SUB) ) {
						alt62=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 62, 0, input);
						throw nvae;
					}

					switch (alt62) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule4315); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule4321); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4326);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==ADD||LA65_0==SUB) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:7: (s= ADD |s= SUB )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==ADD) ) {
						alt64=1;
					}
					else if ( (LA64_0==SUB) ) {
						alt64=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}

					switch (alt64) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule4344); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule4350); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4355);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop65;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "restrictedExpressionRule"



	// $ANTLR start "restrictedTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:438:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:440:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:441:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule4393);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==DIV||LA67_0==MUL) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:7: (s= MUL |s= DIV )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==MUL) ) {
						alt66=1;
					}
					else if ( (LA66_0==DIV) ) {
						alt66=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule4416); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule4422); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule4427);
					f=restrictedFactorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop67;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return et;
	}
	// $ANTLR end "restrictedTermRule"



	// $ANTLR start "restrictedFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:446:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB ) ( EXP e= restrictedFactorRule )? ;
	public final ExpressionFactor restrictedFactorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression ex =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor sf =null;
		ExpressionFactor f =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:447:3: ( ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB ) ( EXP e= restrictedFactorRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB ) ( EXP e= restrictedFactorRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB )
			int alt70=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt70=1;
				}
				break;
			case FIELD_NAME:
				{
				alt70=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt70=3;
				}
				break;
			case ID:
				{
				alt70=4;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case EXTENT:
			case EXTRACT_ARRAY:
			case HASH_NAME:
			case IF:
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt70=5;
				}
				break;
			case LB:
				{
				alt70=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule4461); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule4465);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule4467); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:449:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule4485);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:450:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule4512);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule4540); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule4542); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:14: (fp= functionParamsRule )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==ADD||LA68_0==APEX_VALUE||LA68_0==ARRAY_FUNCTION||LA68_0==BOOLEAN||LA68_0==DEGREE||(LA68_0 >= EXTENT && LA68_0 <= EXTRACT_ARRAY)||LA68_0==FIELD_NAME||LA68_0==FLOAT||LA68_0==HASH_NAME||(LA68_0 >= ID && LA68_0 <= IF_ERROR)||LA68_0==INT||LA68_0==LB||LA68_0==LP||(LA68_0 >= MEMBERSHIP_ARRAY && LA68_0 <= MEMBERSHIP_TO)||LA68_0==QUOTED_VALUE||LA68_0==SUB||LA68_0==TRANSLATE) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule4547);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule4551); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:452:6: sf= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule4570);
					sf=specialFunctionRule();
					state._fsp--;

						ef = sf;	
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:453:6: LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_restrictedFactorRule4601); 
					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4605);
					f=restrictedFactorRule();
					state._fsp--;

					 ef = new ExpressionFactor (f); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:6: ( COMMA f= restrictedFactorRule )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==COMMA) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:8: COMMA f= restrictedFactorRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_restrictedFactorRule4627); 
							pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4631);
							f=restrictedFactorRule();
							state._fsp--;

								ef.addArrayValue (f); 
							}
							break;

						default :
							break loop69;
						}
					}

					match(input,RB,FOLLOW_RB_in_restrictedFactorRule4665); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:4: ( EXP e= restrictedFactorRule )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==EXP) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:6: EXP e= restrictedFactorRule
					{
					match(input,EXP,FOLLOW_EXP_in_restrictedFactorRule4677); 
					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4681);
					e=restrictedFactorRule();
					state._fsp--;

						ef.addExp (e); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ef;
	}
	// $ANTLR end "restrictedFactorRule"



	// $ANTLR start "functionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:461:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:463:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:464:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule4736);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:465:6: ( COMMA e= restrictedExpressionRule )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==COMMA) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:465:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule4754); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule4758);
					e=restrictedExpressionRule();
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop72;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return params;
	}
	// $ANTLR end "functionParamsRule"



	// $ANTLR start "comparatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:473:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:474:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:475:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:475:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			int alt73=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt73=1;
				}
				break;
			case NEQ:
				{
				alt73=2;
				}
				break;
			case LT:
				{
				alt73=3;
				}
				break;
			case GT:
				{
				alt73=4;
				}
				break;
			case LE:
				{
				alt73=5;
				}
				break;
			case GE:
				{
				alt73=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:475:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule4802); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:476:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule4812); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule4822); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:478:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule4832); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:479:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule4842); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:480:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule4852); 
					}
					break;

			}

			 op = o; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "comparatorRule"



	// $ANTLR start "numericRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:487:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:488:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:489:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:489:4: (s= ADD |s= SUB )?
			int alt74=3;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==ADD) ) {
				alt74=1;
			}
			else if ( (LA74_0==SUB) ) {
				alt74=2;
			}
			switch (alt74) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:489:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule4892); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:489:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule4898); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:490:4: (n= FLOAT |n= INT )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==FLOAT) ) {
				alt75=1;
			}
			else if ( (LA75_0==INT) ) {
				alt75=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:490:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule4911); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:490:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule4917); 
					}
					break;

			}

			 num = env.getNumeric(s, n); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return num;
	}
	// $ANTLR end "numericRule"



	// $ANTLR start "checkForFuzzySetRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:496:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token ty=null;
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:2: ( CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:498:3: CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4946); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:498:15: (ty= ID )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==ID) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:498:15: ty= ID
					{
					ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4950); 
					}
					break;

			}

			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4953); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4955); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4959); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4961); 
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4966);
			fe=usingOrConditionRule();
			state._fsp--;

			 env.addCheckForFuzzySet (gs, fs, fe, ty); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:499:4: ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==COMMA) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:499:37: COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
						ty = null; 
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule5014); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:500:13: (ty= ID )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==ID) ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:500:13: ty= ID
							{
							ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule5018); 
							}
							break;

					}

					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule5021); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule5023); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule5027); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule5029); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule5033);
					fe=usingOrConditionRule();
					state._fsp--;

					 env.addCheckForFuzzySet (gs, fs, fe, ty); 
					}
					break;

				default :
					break loop78;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "checkForFuzzySetRule"



	// $ANTLR start "usingOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:505:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:506:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:507:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule5065);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:508:4: ( OR c2= usingAndConditionRule )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==OR) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:508:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule5080); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule5084);
					c2=usingAndConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop79;
				}
			}

			 c = env.simplifyConditionOr ((ConditionOr)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "usingOrConditionRule"



	// $ANTLR start "usingAndConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:516:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:517:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:518:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule5146);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:519:5: ( AND c2= usingNotConditionRule )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==AND) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:519:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule5162); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule5166);
					c2=usingNotConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop80;
				}
			}

			 c = env.simplifyConditionAnd ((ConditionAnd)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "usingAndConditionRule"



	// $ANTLR start "usingNotConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:5: (not= NOT )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==NOT) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule5228); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule5240);
			p=usingPredicateRule();
			state._fsp--;

			 c = env.createCondition (not, p); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "usingNotConditionRule"



	// $ANTLR start "usingPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:532:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:533:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
			int alt84=3;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt84=1;
				}
				break;
			case ID:
				{
				alt84=2;
				}
				break;
			case IF_FAILS:
				{
				alt84=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:534:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule5272); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule5276);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule5278); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:535:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule5300); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:535:9: ( LP (fp= functionParamsRule )? RP )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==LP) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:535:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule5303); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:535:13: (fp= functionParamsRule )?
							int alt82=2;
							int LA82_0 = input.LA(1);
							if ( (LA82_0==ADD||LA82_0==APEX_VALUE||LA82_0==ARRAY_FUNCTION||LA82_0==BOOLEAN||LA82_0==DEGREE||(LA82_0 >= EXTENT && LA82_0 <= EXTRACT_ARRAY)||LA82_0==FIELD_NAME||LA82_0==FLOAT||LA82_0==HASH_NAME||(LA82_0 >= ID && LA82_0 <= IF_ERROR)||LA82_0==INT||LA82_0==LB||LA82_0==LP||(LA82_0 >= MEMBERSHIP_ARRAY && LA82_0 <= MEMBERSHIP_TO)||LA82_0==QUOTED_VALUE||LA82_0==SUB||LA82_0==TRANSLATE) ) {
								alt82=1;
							}
							switch (alt82) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:535:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule5308);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule5312); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:536:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule5337); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule5339); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule5347);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule5349); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule5353);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule5365); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "usingPredicateRule"



	// $ANTLR start "alphaCutRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:542:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		Token de=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:543:2: ( ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:3: ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule5381); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule5386);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule5388); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule5392); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:38: (de= FIELD_NAME )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==FIELD_NAME) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:38: de= FIELD_NAME
					{
					de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule5396); 
					}
					break;

			}

				env.addAlphaCut (gs, n, on, de); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:4: ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			loop87:
			while (true) {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==COMMA) ) {
					alt87=1;
				}

				switch (alt87) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:30: COMMA n= numericRule ON on= ID (de= FIELD_NAME )?
					{
					 de = null; 
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule5438); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule5442);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule5444); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule5448); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:546:36: (de= FIELD_NAME )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==FIELD_NAME) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:546:36: de= FIELD_NAME
							{
							de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule5452); 
							}
							break;

					}

					 env.addAlphaCut (gs, n, on, de); 
					}
					break;

				default :
					break loop87;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alphaCutRule"



	// $ANTLR start "keepDropFuzzySetsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:555:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
			int alt90=5;
			switch ( input.LA(1) ) {
			case DEFUZZIFY:
				{
				alt90=1;
				}
				break;
			case DROPPING:
				{
				int LA90_2 = input.LA(2);
				if ( (LA90_2==ALL) ) {
					alt90=2;
				}
				else if ( (LA90_2==FUZZY) ) {
					alt90=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KEEPING:
				{
				int LA90_3 = input.LA(2);
				if ( (LA90_3==ALL) ) {
					alt90=3;
				}
				else if ( (LA90_3==FUZZY) ) {
					alt90=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule5490); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule5509); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule5511); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5513); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5515); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule5527); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule5529); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5531); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5533); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule5546); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5548); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5550); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5554); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:5: ( COMMA fs= ID )*
					loop88:
					while (true) {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==COMMA) ) {
							alt88=1;
						}

						switch (alt88) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule5568); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5572); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop88;
						}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule5597); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5599); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5601); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5605); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:564:5: ( COMMA fs= ID )*
					loop89:
					while (true) {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==COMMA) ) {
							alt89=1;
						}

						switch (alt89) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:564:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule5620); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5624); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop89;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dfs;
	}
	// $ANTLR end "keepDropFuzzySetsRule"



	// $ANTLR start "addFieldsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:569:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:2: ( ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:3: ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule5665); 
			match(input,FIELDS,FOLLOW_FIELDS_in_addFieldsRule5667); 
			match(input,LBR,FOLLOW_LBR_in_addFieldsRule5694); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5702);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule5704); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5708);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:5: ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==COMMA) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:7: COMMA f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule5727); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5731);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule5733); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5737);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop91;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_addFieldsRule5755); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "addFieldsRule"



	// $ANTLR start "insertFieldRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:579:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:580:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==DISTANCE||LA92_0==INCLUDED||LA92_0==INTERSECT||LA92_0==MEET||LA92_0==ORIENTATION) ) {
				alt92=1;
			}
			else if ( (LA92_0==APEX_VALUE||LA92_0==ARRAY_FUNCTION||LA92_0==BOOLEAN||LA92_0==DEGREE||(LA92_0 >= EXTENT && LA92_0 <= EXTRACT_ARRAY)||LA92_0==FIELD_NAME||LA92_0==FLOAT||LA92_0==HASH_NAME||(LA92_0 >= ID && LA92_0 <= IF_ERROR)||LA92_0==INT||LA92_0==LB||LA92_0==LP||(LA92_0 >= MEMBERSHIP_ARRAY && LA92_0 <= MEMBERSHIP_TO)||LA92_0==QUOTED_VALUE||LA92_0==TRANSLATE) ) {
				alt92=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:581:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule5778);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule5793);
					ef=restrictedFactorRule();
					state._fsp--;

					 af = new AddField (f, ef); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return af;
	}
	// $ANTLR end "insertFieldRule"



	// $ANTLR start "spatialFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
	public final SpatialFunction spatialFunctionRule(boolean joinCaller) throws RecognitionException {
		SpatialFunction sf = null;


		Token u=null;
		Token f=null;
		Token o=null;
		Token i=null;
		Token cp =null;
		String n =null;
		String d =null;

		 sf = new SpatialFunction (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
			int alt97=5;
			switch ( input.LA(1) ) {
			case DISTANCE:
				{
				alt97=1;
				}
				break;
			case ORIENTATION:
				{
				alt97=2;
				}
				break;
			case INCLUDED:
				{
				alt97=3;
				}
				break;
			case MEET:
				{
				alt97=4;
				}
				break;
			case INTERSECT:
				{
				alt97=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule5832); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5834); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5838); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5840); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:25: (cp= comparatorRule n= numericRule )?
					int alt93=2;
					int LA93_0 = input.LA(1);
					if ( (LA93_0==EQ||LA93_0==GE||LA93_0==GT||LA93_0==LE||LA93_0==LT||LA93_0==NEQ) ) {
						alt93=1;
					}
					switch (alt93) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule5846);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5850);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule5874); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5876); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:21: (f= LEFT |f= RIGHT )
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==LEFT) ) {
						alt94=1;
					}
					else if ( (LA94_0==RIGHT) ) {
						alt94=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 94, 0, input);
						throw nvae;
					}

					switch (alt94) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5882); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5888); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:42: ( COMMA o= ID COLON d= numericRule )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==COMMA) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule5894); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5899); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule5901); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5905);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5910); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:594:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule5922); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5924); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:594:18: (i= LEFT |i= RIGHT )
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==LEFT) ) {
						alt96=1;
					}
					else if ( (LA96_0==RIGHT) ) {
						alt96=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);
						throw nvae;
					}

					switch (alt96) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:594:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5930); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:594:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5936); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5939); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:595:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule5971); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule6018); 
					 sf.setType (SpatialFunction.INTERSECT); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sf;
	}
	// $ANTLR end "spatialFunctionRule"



	// $ANTLR start "setFuzzySetsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule6081); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule6083); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule6085); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==KEEP) ) {
				alt102=1;
			}
			else if ( ((LA102_0 >= HOWINCLUDE && LA102_0 <= HOWMEET)||LA102_0==LEFT||LA102_0==RIGHT) ) {
				alt102=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule6093); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					int alt99=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt99=1;
						}
						break;
					case LEFT:
						{
						alt99=2;
						}
						break;
					case RIGHT:
						{
						alt99=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 99, 0, input);
						throw nvae;
					}
					switch (alt99) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule6130); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:7: ( resolvingRule[sfs] )?
							int alt98=2;
							int LA98_0 = input.LA(1);
							if ( (LA98_0==RESOLVING) ) {
								alt98=1;
							}
							switch (alt98) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule6166);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule6184); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:609:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule6220); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:610:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6251);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:5: ( COMMA addFuzzySetRule[sfs] )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==COMMA) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule6260); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6262);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop100;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:612:5: ( resolvingRule[sfs] )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==RESOLVING) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:612:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule6278);
							resolvingRule(sfs);
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sfs;
	}
	// $ANTLR end "setFuzzySetsRule"



	// $ANTLR start "resolvingRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:618:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule6305); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule6307); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:6: (t= AND |t= OR |t= FIRST |t= LAST )
			int alt103=4;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt103=1;
				}
				break;
			case OR:
				{
				alt103=2;
				}
				break;
			case FIRST:
				{
				alt103=3;
				}
				break;
			case LAST:
				{
				alt103=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule6319); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule6325); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule6331); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule6337); 
					}
					break;

			}

				sfs.setPolicy(t.getText()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "resolvingRule"



	// $ANTLR start "addFuzzySetRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:622:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:623:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
			int alt109=4;
			switch ( input.LA(1) ) {
			case LEFT:
			case RIGHT:
				{
				alt109=1;
				}
				break;
			case HOWINCLUDE:
				{
				alt109=2;
				}
				break;
			case HOWMEET:
				{
				alt109=3;
				}
				break;
			case HOWINTERSECT:
				{
				alt109=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:624:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:624:3: (s= LEFT |s= RIGHT )
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==LEFT) ) {
						alt104=1;
					}
					else if ( (LA104_0==RIGHT) ) {
						alt104=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 104, 0, input);
						throw nvae;
					}

					switch (alt104) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:624:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6369); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:624:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6375); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:625:4: ( ALL |fs= ID ( AS newFs= ID )? )
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==ALL) ) {
						alt106=1;
					}
					else if ( (LA106_0==ID) ) {
						alt106=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 106, 0, input);
						throw nvae;
					}

					switch (alt106) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:625:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule6386); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:626:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6422); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:626:12: ( AS newFs= ID )?
							int alt105=2;
							int LA105_0 = input.LA(1);
							if ( (LA105_0==AS) ) {
								alt105=1;
							}
							switch (alt105) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:626:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule6426); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6430); 
									}
									break;

							}

								env.addSetFuzztSets (sfs, s.getText(), fs.getText(), newFs); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:628:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule6461); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6465); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:628:22: (s= LEFT |s= RIGHT )
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==LEFT) ) {
						alt107=1;
					}
					else if ( (LA107_0==RIGHT) ) {
						alt107=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 107, 0, input);
						throw nvae;
					}

					switch (alt107) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:628:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6471); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:628:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6477); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6481); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6483); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6487); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule6500); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6505); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:20: (s= LEFT |s= RIGHT )
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==LEFT) ) {
						alt108=1;
					}
					else if ( (LA108_0==RIGHT) ) {
						alt108=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 108, 0, input);
						throw nvae;
					}

					switch (alt108) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6511); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6517); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6521); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6524); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6528); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:630:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule6551); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6554); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6556); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6569); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6573); 
						sfs.addFunction (f.getText(), null, fs.getText()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "addFuzzySetRule"



	// $ANTLR start "getCollectionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:639:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule6597); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule6599); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:6: (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==ID) ) {
				alt112=1;
			}
			else if ( (LA112_0==FROM_WEB) ) {
				alt112=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}

			switch (alt112) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule6611); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:16: ( AT db= ID )?
					int alt110=2;
					int LA110_0 = input.LA(1);
					if ( (LA110_0==AT) ) {
						alt110=1;
					}
					switch (alt110) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule6615); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule6619); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:8: FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM_WEB,FOLLOW_FROM_WEB_in_getCollectionRule6650); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:17: (url= APEX_VALUE |url= QUOTED_VALUE )
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==APEX_VALUE) ) {
						alt111=1;
					}
					else if ( (LA111_0==QUOTED_VALUE) ) {
						alt111=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 111, 0, input);
						throw nvae;
					}

					switch (alt111) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule6655); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule6661); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule6674); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "getCollectionRule"



	// $ANTLR start "getDictionaryRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:647:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:648:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule6695); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule6697); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6708); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule6710); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6714); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule6716); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6720); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule6749); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "getDictionaryRule"



	// $ANTLR start "saveAsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:655:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:656:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:657:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule6768); 
			match(input,AS,FOLLOW_AS_in_saveAsRule6770); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6780); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:658:12: ( AT db= ID )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==AT) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:658:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule6784); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6788); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule6808); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "saveAsRule"



	// $ANTLR start "lookupFromWebRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:1: lookupFromWebRule : LOOKUP FROM_WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:664:2: ( LOOKUP FROM_WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:3: LOOKUP FROM_WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule6824); 
			match(input,FROM_WEB,FOLLOW_FROM_WEB_in_lookupFromWebRule6826); 
				LookupFromWeb lfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:4: (fe= forEachRule )+
			int cnt114=0;
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==FOR) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule6842);
					fe=forEachRule();
					state._fsp--;

						lfw.addForEach (fe);	
					}
					break;

				default :
					if ( cnt114 >= 1 ) break loop114;
					EarlyExitException eee = new EarlyExitException(114, input);
					throw eee;
				}
				cnt114++;
			}

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule6855); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lookupFromWebRule"



	// $ANTLR start "forEachRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:671:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:672:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:673:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule6875); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule6877); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule6881);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule6886); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule6890);
			e=expressionRule();
			state._fsp--;

			 fe = new ForEach (c, e); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return fe;
	}
	// $ANTLR end "forEachRule"



	// $ANTLR start "joinOfCollectionsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:678:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC ;
	public final void joinOfCollectionsRule() throws RecognitionException {
		Token tk=null;
		Token g=null;
		DbCollection c1 =null;
		DbCollection c2 =null;
		SpatialFunction nff =null;
		SetFuzzySets sfs =null;
		CaseClause cc =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:680:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule6913); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule6915); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6917); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6926);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule6930); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6934);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:682:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==ON) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:682:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule6946); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6948); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6952);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==SET) ) {
				int LA117_1 = input.LA(2);
				if ( (LA117_1==GEOMETRY) ) {
					alt117=1;
				}
			}
			switch (alt117) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule6984); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6986); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					int alt116=4;
					switch ( input.LA(1) ) {
					case INTERSECTION:
						{
						alt116=1;
						}
						break;
					case RIGHT:
						{
						alt116=2;
						}
						break;
					case LEFT:
						{
						alt116=3;
						}
						break;
					case ALL:
						{
						alt116=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 116, 0, input);
						throw nvae;
					}
					switch (alt116) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule6992); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule6998); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule7004); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule7010); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:7: ( addFieldsRule[jc] )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==ADD_ST) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule7030);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:685:7: (sfs= setFuzzySetsRule )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==SET) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:685:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule7090);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:6: (cc= caseClauseRule |gs= generateSectionRule[true] )?
			int alt120=3;
			int LA120_0 = input.LA(1);
			if ( ((LA120_0 >= CASE && LA120_0 <= CASES)) ) {
				alt120=1;
			}
			else if ( (LA120_0==GENERATE) ) {
				alt120=2;
			}
			switch (alt120) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule7132);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:8: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_joinOfCollectionsRule7175);
					gs=generateSectionRule(true);
					state._fsp--;

						jc.setGenerateSection (gs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:7: ( REMOVE DUPLICATES )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==REMOVE) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule7213); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule7215); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule7256); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "joinOfCollectionsRule"



	// $ANTLR start "filterRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:693:1: filterRule : FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;
		GenerateSection gs =null;

			Filter f=null;	
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:695:3: ( FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:696:4: FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule7285); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:697:5: (fc= caseClauseRule |gs= generateSectionRule[true] )
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( ((LA122_0 >= CASE && LA122_0 <= CASES)) ) {
				alt122=1;
			}
			else if ( (LA122_0==GENERATE) ) {
				alt122=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}

			switch (alt122) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:697:7: fc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_filterRule7296);
					fc=caseClauseRule();
					state._fsp--;

					 f = env.addFilter (fc); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:698:7: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_filterRule7315);
					gs=generateSectionRule(true);
					state._fsp--;

						f = env.addFilter (gs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:7: ( REMOVE DUPLICATES )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==REMOVE) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule7334); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule7336); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule7357); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "filterRule"



	// $ANTLR start "groupRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:704:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:705:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:706:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule7378); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:707:7: (p= groupPartitionRule )+
			int cnt124=0;
			loop124:
			while (true) {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==PARTITION) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:707:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule7403);
					p=groupPartitionRule();
					state._fsp--;

					 g.addPartition (p); 
					}
					break;

				default :
					if ( cnt124 >= 1 ) break loop124;
					EarlyExitException eee = new EarlyExitException(124, input);
					throw eee;
				}
				cnt124++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:708:7: (oth= othersRule )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==DROP||LA125_0==KEEP) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:708:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule7429);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule7453); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "groupRule"



	// $ANTLR start "groupPartitionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:715:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule7476); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule7480);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule7493); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7497);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:10: ( COMMA fr= fieldRefRule )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==COMMA) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule7522); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7526);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop126;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule7548); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7552);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:719:8: ( DROP GROUPING FIELDS )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==DROP) ) {
				int LA127_1 = input.LA(2);
				if ( (LA127_1==GROUPING) ) {
					alt127=1;
				}
			}
			switch (alt127) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:719:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule7573); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule7575); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule7577); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:720:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==ORDER) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:720:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule7599); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule7601); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule7605);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:9: ( COMMA sf= sortingFieldRule )*
					loop128:
					while (true) {
						int alt128=2;
						int LA128_0 = input.LA(1);
						if ( (LA128_0==COMMA) ) {
							alt128=1;
						}

						switch (alt128) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule7622); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule7626);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop128;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:722:6: ( KEEP UNCOMPARABLE )?
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==KEEP) ) {
						int LA129_1 = input.LA(2);
						if ( (LA129_1==UNCOMPARABLE) ) {
							alt129=1;
						}
					}
					switch (alt129) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:722:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule7645); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule7647); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:7: (gs= generateSectionRule[false] )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==GENERATE) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule7678);
					gs=generateSectionRule(false);
					state._fsp--;

						p.setGenerateSection (gs);	
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "groupPartitionRule"



	// $ANTLR start "sortingFieldRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:728:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:729:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:730:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule7709);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule7713); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule7717); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:732:3: (v= VERSUS )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==VERSUS) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:732:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule7732); 
						sf.setVersus (v.getText ());				
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sf;
	}
	// $ANTLR end "sortingFieldRule"



	// $ANTLR start "expandRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:737:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule7761); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:7: (u= unpackRule )+
			int cnt133=0;
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==UNPACK) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule7785);
					u=unpackRule();
					state._fsp--;

					 e.addUnpack (u); 
					}
					break;

				default :
					if ( cnt133 >= 1 ) break loop133;
					EarlyExitException eee = new EarlyExitException(133, input);
					throw eee;
				}
				cnt133++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:739:7: (oth= othersRule )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==DROP||LA134_0==KEEP) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:739:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule7817);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule7841); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expandRule"



	// $ANTLR start "unpackRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:744:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:745:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule7863); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule7868);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule7875); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7879);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule7886); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7890);
			fr2=fieldRefRule();
			state._fsp--;

			 u = new Unpack (p, fr1, fr2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return u;
	}
	// $ANTLR end "unpackRule"



	// $ANTLR start "mergeCollectionsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:752:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:753:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:5: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule7917); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule7919); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7933);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:9: ( COMMA cr= collectionReferenceRule )+
			int cnt135=0;
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==COMMA) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule7955); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7959);
					cr=collectionReferenceRule();
					state._fsp--;

					 mc.addCollection (cr); 
					}
					break;

				default :
					if ( cnt135 >= 1 ) break loop135;
					EarlyExitException eee = new EarlyExitException(135, input);
					throw eee;
				}
				cnt135++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:7: ( REMOVE DUPLICATES )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==REMOVE) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule7980); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule7982); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule8012); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mergeCollectionsRule"



	// $ANTLR start "intersectCollectionsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:763:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule8032); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule8034); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule8044);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule8046); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule8050);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule8062); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "intersectCollectionsRule"



	// $ANTLR start "subtractCollectionsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:770:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:771:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:772:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule8084); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule8086); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule8094);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule8096); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule8100);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule8112); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subtractCollectionsRule"



	// $ANTLR start "useDbRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:778:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:780:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:781:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule8139); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule8149); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:782:10: (d= ID |d= APEX_VALUE )
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==ID) ) {
				alt137=1;
			}
			else if ( (LA137_0==APEX_VALUE) ) {
				alt137=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 137, 0, input);
				throw nvae;
			}

			switch (alt137) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:782:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8154); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:782:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8160); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==AS) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule8184); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:13: (a= ID |a= APEX_VALUE )
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( (LA138_0==ID) ) {
						alt138=1;
					}
					else if ( (LA138_0==APEX_VALUE) ) {
						alt138=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 138, 0, input);
						throw nvae;
					}

					switch (alt138) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8189); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8195); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==COMMA) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule8276); 
					match(input,DB,FOLLOW_DB_in_useDbRule8278); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:20: (d= ID |d= APEX_VALUE )
					int alt140=2;
					int LA140_0 = input.LA(1);
					if ( (LA140_0==ID) ) {
						alt140=1;
					}
					else if ( (LA140_0==APEX_VALUE) ) {
						alt140=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 140, 0, input);
						throw nvae;
					}

					switch (alt140) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8283); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8289); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt142=2;
					int LA142_0 = input.LA(1);
					if ( (LA142_0==AS) ) {
						alt142=1;
					}
					switch (alt142) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule8312); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:21: (a= ID |a= APEX_VALUE )
							int alt141=2;
							int LA141_0 = input.LA(1);
							if ( (LA141_0==ID) ) {
								alt141=1;
							}
							else if ( (LA141_0==APEX_VALUE) ) {
								alt141=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 141, 0, input);
								throw nvae;
							}

							switch (alt141) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8317); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8323); 
									}
									break;

							}

							 db.setAlias (a.getText()); 
							}
							break;

					}

					 ud.addDb (db); 
					}
					break;

				default :
					break loop143;
				}
			}

			match(input,ON,FOLLOW_ON_in_useDbRule8401); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:791:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==DEFAULT) ) {
				alt147=1;
			}
			else if ( (LA147_0==SERVER) ) {
				alt147=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 147, 0, input);
				throw nvae;
			}

			switch (alt147) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:791:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule8413); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule8415); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:792:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule8427); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:793:10: (d= ID |d= APEX_VALUE )
					int alt144=2;
					int LA144_0 = input.LA(1);
					if ( (LA144_0==ID) ) {
						alt144=1;
					}
					else if ( (LA144_0==APEX_VALUE) ) {
						alt144=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 144, 0, input);
						throw nvae;
					}

					switch (alt144) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:793:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8442); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:793:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8448); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt146=2;
					int LA146_0 = input.LA(1);
					if ( (LA146_0==APEX_VALUE||LA146_0==ID) ) {
						alt146=1;
					}
					switch (alt146) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:12: (d= ID |d= APEX_VALUE )
							int alt145=2;
							int LA145_0 = input.LA(1);
							if ( (LA145_0==ID) ) {
								alt145=1;
							}
							else if ( (LA145_0==APEX_VALUE) ) {
								alt145=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 145, 0, input);
								throw nvae;
							}

							switch (alt145) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8472); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8478); 
									}
									break;

							}

							 ud.setConnectionString (d.getText()); 
							}
							break;

					}

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_useDbRule8503); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "useDbRule"



	// $ANTLR start "trajectoryMatchingRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:800:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:801:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:802:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule8528); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule8530); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8540);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule8542); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8546);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:804:7: (tp= trajectoryPartitionRule )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==PARTITION) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:804:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule8562);
					tp=trajectoryPartitionRule();
					state._fsp--;

					 tm.addPartition (tp); 
					}
					break;

				default :
					if ( cnt148 >= 1 ) break loop148;
					EarlyExitException eee = new EarlyExitException(148, input);
					throw eee;
				}
				cnt148++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:7: (oth= othersRule )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==DROP||LA149_0==KEEP) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule8602);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule8644); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "trajectoryMatchingRule"



	// $ANTLR start "trajectoryPartitionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:810:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:811:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:812:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule8672); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule8682);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:814:6: (tpm= partitionMatchingRule )+
			int cnt150=0;
			loop150:
			while (true) {
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==MATCHING) ) {
					alt150=1;
				}

				switch (alt150) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:814:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8703);
					tpm=partitionMatchingRule();
					state._fsp--;

					 tp.addPartitionMatching (tpm);  
					}
					break;

				default :
					if ( cnt150 >= 1 ) break loop150;
					EarlyExitException eee = new EarlyExitException(150, input);
					throw eee;
				}
				cnt150++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tp;
	}
	// $ANTLR end "trajectoryPartitionRule"



	// $ANTLR start "partitionMatchingRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:818:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
	public final PartitionMatching partitionMatchingRule() throws RecognitionException {
		PartitionMatching pt = null;


		Token u=null;
		Field fr1 =null;
		Field fr2 =null;
		String v =null;
		Condition wc =null;
		Field fr3 =null;
		Field fr4 =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:819:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:820:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule8740); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8744);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule8751); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8755);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule8762); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule8764); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule8768); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule8771); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8775);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:823:6: ( WHERE wc= orConditionRule )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==WHERE) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:823:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule8790); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule8794);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule8818); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8822);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:825:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==ADDING) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:825:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule8845); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8849);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule8851); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule8853); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:826:6: ( MIN_SIMILARITY n= numericRule )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==MIN_SIMILARITY) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:826:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8875); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8879);
					n=numericRule();
					state._fsp--;

					 pt.setMinSimilarity (n); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pt;
	}
	// $ANTLR end "partitionMatchingRule"



	// $ANTLR start "parameterRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:832:1: parameterRule[ParamList pl, boolean check] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl, boolean check) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:833:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8927); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule8943); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8947); 
				p = env.createParameter (check, v, t); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "parameterRule"



	// $ANTLR start "createJavaScriptFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:839:1: createJavaScriptFunctionRule : CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList(), false] ( COMMA p= parameterRule[jsf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:840:2: ( CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList(), false] ( COMMA p= parameterRule[jsf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:841:4: CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList(), false] ( COMMA p= parameterRule[jsf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaScriptFunctionRule8971); 
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8973); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8975); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule8983); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule9017); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule9027);
			p=parameterRule(jsf.getParamList(), false);
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:845:5: ( COMMA p= parameterRule[jsf.getParamList(), false] )*
			loop154:
			while (true) {
				int alt154=2;
				int LA154_0 = input.LA(1);
				if ( (LA154_0==COMMA) ) {
					alt154=1;
				}

				switch (alt154) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:845:7: COMMA p= parameterRule[jsf.getParamList(), false]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule9050); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule9054);
					p=parameterRule(jsf.getParamList(), false);
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop154;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:846:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==PRECONDITION) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:846:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule9077); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule9081);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule9097); 
			 // ANTLR 3.4 apparently do not support multi context, so scanning must be performed this way
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule9110); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule9116); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createJavaScriptFunctionRule"



	// $ANTLR start "createFuzzyOperatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:1: createFuzzyOperatorRule : CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList(), true] ( COMMA p= parameterRule[fo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:871:3: ( CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList(), true] ( COMMA p= parameterRule[fo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:4: CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList(), true] ( COMMA p= parameterRule[fo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyOperatorRule9138); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyOperatorRule9140); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createFuzzyOperatorRule9142); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule9146); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule9171); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule9181);
			p=parameterRule(fo.getParamList(), true);
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:5: ( COMMA p= parameterRule[fo.getParamList(), true] )*
			loop156:
			while (true) {
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==COMMA) ) {
					alt156=1;
				}

				switch (alt156) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:7: COMMA p= parameterRule[fo.getParamList(), true]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule9204); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule9208);
					p=parameterRule(fo.getParamList(), true);
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop156;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==PRECONDITION) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule9233); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule9237);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule9252); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule9256);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==POLYLINE) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule9275); 
					match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule9278); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule9290); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9294);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule9296); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9300);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule9302); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:880:11: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt158=0;
					loop158:
					while (true) {
						int alt158=2;
						int LA158_0 = input.LA(1);
						if ( (LA158_0==COMMA) ) {
							alt158=1;
						}

						switch (alt158) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:880:13: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule9324); 
							match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule9326); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9330);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule9332); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9336);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule9338); 
							 env.addFuzzyPolylinePoint (fo, x, y); 
							}
							break;

						default :
							if ( cnt158 >= 1 ) break loop158;
							EarlyExitException eee = new EarlyExitException(158, input);
							throw eee;
						}
						cnt158++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule9359); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule9366); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createFuzzyOperatorRule"



	// $ANTLR start "createFuzzyEvaluatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:887:1: createFuzzyEvaluatorRule : CREATE FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), true] )? (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )* EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyEvaluatorRule() throws RecognitionException {
		Token n=null;
		Condition pc =null;
		FESortArrayClause s =null;
		FEDeriveClause d =null;
		FEForAllClause f =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:888:2: ( CREATE FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), true] )? (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )* EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:889:3: CREATE FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), true] )? (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )* EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyEvaluatorRule9386); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyEvaluatorRule9388); 
			match(input,EVALUATOR,FOLLOW_EVALUATOR_in_createFuzzyEvaluatorRule9390); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyEvaluatorRule9394); 
			 FuzzyEvaluator fe = env.addFuzzyEvaluator (n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyEvaluatorRule9420); 
			pushFollow(FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9427);
			feParameterRule(fe);
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:892:5: ( COMMA feParameterRule[fe] )*
			loop160:
			while (true) {
				int alt160=2;
				int LA160_0 = input.LA(1);
				if ( (LA160_0==COMMA) ) {
					alt160=1;
				}

				switch (alt160) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:892:7: COMMA feParameterRule[fe]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9459); 
					pushFollow(FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9461);
					feParameterRule(fe);
					state._fsp--;

					}
					break;

				default :
					break loop160;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:893:4: ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), true] )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==PRECONDITION) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:893:6: PRECONDITION pc= jfOrConditionRule[fe.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyEvaluatorRule9512); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyEvaluatorRule9516);
					pc=jfOrConditionRule(fe.getParamList(), true);
					state._fsp--;

					 fe.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:894:4: (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )*
			loop162:
			while (true) {
				int alt162=4;
				switch ( input.LA(1) ) {
				case SORT:
					{
					alt162=1;
					}
					break;
				case DERIVE:
					{
					alt162=2;
					}
					break;
				case FOR:
					{
					alt162=3;
					}
					break;
				}
				switch (alt162) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:894:6: s= feArraySortRule[fe]
					{
					pushFollow(FOLLOW_feArraySortRule_in_createFuzzyEvaluatorRule9540);
					s=feArraySortRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(s);	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:895:6: d= feDeriveRule[fe]
					{
					pushFollow(FOLLOW_feDeriveRule_in_createFuzzyEvaluatorRule9575);
					d=feDeriveRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(d);	
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:896:6: f= feForAllRule[fe]
					{
					pushFollow(FOLLOW_feForAllRule_in_createFuzzyEvaluatorRule9611);
					f=feForAllRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(f);	
					}
					break;

				default :
					break loop162;
				}
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyEvaluatorRule9645); 
			pushFollow(FOLLOW_feExpressionRule_in_createFuzzyEvaluatorRule9649);
			e=feExpressionRule(fe, null);
			state._fsp--;

			 fe.evaluate = e;								
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:898:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==POLYLINE) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:898:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyEvaluatorRule9676); 
					match(input,LB,FOLLOW_LB_in_createFuzzyEvaluatorRule9678); 
					match(input,LP,FOLLOW_LP_in_createFuzzyEvaluatorRule9685); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9689);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9691); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9695);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyEvaluatorRule9697); 
					 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt163=0;
					loop163:
					while (true) {
						int alt163=2;
						int LA163_0 = input.LA(1);
						if ( (LA163_0==COMMA) ) {
							alt163=1;
						}

						switch (alt163) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:8: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9720); 
							match(input,LP,FOLLOW_LP_in_createFuzzyEvaluatorRule9722); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9726);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9728); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9732);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyEvaluatorRule9734); 
							 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
							}
							break;

						default :
							if ( cnt163 >= 1 ) break loop163;
							EarlyExitException eee = new EarlyExitException(163, input);
							throw eee;
						}
						cnt163++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyEvaluatorRule9754); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyEvaluatorRule9761); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createFuzzyEvaluatorRule"



	// $ANTLR start "createFuzzyAggregatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:909:1: createFuzzyAggregatorRule : CREATE FUZZY AGGREGATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? (s= feArraySortRule[fe] )* (f= feForAllRule[fe] |d= feDeriveRule[fe] )+ EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyAggregatorRule() throws RecognitionException {
		Token n=null;
		Condition pc =null;
		FESortArrayClause s =null;
		FEForAllClause f =null;
		FEDeriveClause d =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:910:2: ( CREATE FUZZY AGGREGATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? (s= feArraySortRule[fe] )* (f= feForAllRule[fe] |d= feDeriveRule[fe] )+ EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:3: CREATE FUZZY AGGREGATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? (s= feArraySortRule[fe] )* (f= feForAllRule[fe] |d= feDeriveRule[fe] )+ EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyAggregatorRule9780); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyAggregatorRule9782); 
			match(input,AGGREGATOR,FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule9784); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyAggregatorRule9788); 
			 FuzzyEvaluator fe = env.addFuzzyAggregator (n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule9814); 
			pushFollow(FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9821);
			feParameterRule(fe);
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:914:5: ( COMMA feParameterRule[fe] )*
			loop165:
			while (true) {
				int alt165=2;
				int LA165_0 = input.LA(1);
				if ( (LA165_0==COMMA) ) {
					alt165=1;
				}

				switch (alt165) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:914:7: COMMA feParameterRule[fe]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9853); 
					pushFollow(FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9855);
					feParameterRule(fe);
					state._fsp--;

					}
					break;

				default :
					break loop165;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:915:4: ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==PRECONDITION) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:915:6: PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule9906); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule9910);
					pc=jfOrConditionRule(fe.getParamList(), false);
					state._fsp--;

					 fe.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:4: (s= feArraySortRule[fe] )*
			loop167:
			while (true) {
				int alt167=2;
				int LA167_0 = input.LA(1);
				if ( (LA167_0==SORT) ) {
					alt167=1;
				}

				switch (alt167) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:6: s= feArraySortRule[fe]
					{
					pushFollow(FOLLOW_feArraySortRule_in_createFuzzyAggregatorRule9933);
					s=feArraySortRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(s); 
					}
					break;

				default :
					break loop167;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:917:4: (f= feForAllRule[fe] |d= feDeriveRule[fe] )+
			int cnt168=0;
			loop168:
			while (true) {
				int alt168=3;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==FOR) ) {
					alt168=1;
				}
				else if ( (LA168_0==DERIVE) ) {
					alt168=2;
				}

				switch (alt168) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:917:6: f= feForAllRule[fe]
					{
					pushFollow(FOLLOW_feForAllRule_in_createFuzzyAggregatorRule9970);
					f=feForAllRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(f); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:918:6: d= feDeriveRule[fe]
					{
					pushFollow(FOLLOW_feDeriveRule_in_createFuzzyAggregatorRule10005);
					d=feDeriveRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(d); 
					}
					break;

				default :
					if ( cnt168 >= 1 ) break loop168;
					EarlyExitException eee = new EarlyExitException(168, input);
					throw eee;
				}
				cnt168++;
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyAggregatorRule10039); 
			pushFollow(FOLLOW_feExpressionRule_in_createFuzzyAggregatorRule10043);
			e=feExpressionRule(fe, null);
			state._fsp--;

			 fe.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:920:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==POLYLINE) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:920:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyAggregatorRule10070); 
					match(input,LB,FOLLOW_LB_in_createFuzzyAggregatorRule10072); 
					match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule10079); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule10083);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule10085); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule10089);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule10091); 
					 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:922:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt169=0;
					loop169:
					while (true) {
						int alt169=2;
						int LA169_0 = input.LA(1);
						if ( (LA169_0==COMMA) ) {
							alt169=1;
						}

						switch (alt169) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:922:8: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule10114); 
							match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule10116); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule10120);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule10122); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule10126);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule10128); 
							 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
							}
							break;

						default :
							if ( cnt169 >= 1 ) break loop169;
							EarlyExitException eee = new EarlyExitException(169, input);
							throw eee;
						}
						cnt169++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyAggregatorRule10148); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyAggregatorRule10155); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createFuzzyAggregatorRule"



	// $ANTLR start "feForAllRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:1: feForAllRule[FuzzyEvaluator fe] returns [FEForAllClause fac] : FOR ALL v= ID IN ar= ID ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )? ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fe, fac] ( COMMA ac= aggSpecRule[fe, fac] )* ;
	public final FEForAllClause feForAllRule(FuzzyEvaluator fe) throws RecognitionException {
		FEForAllClause fac = null;


		Token v=null;
		Token ar=null;
		Token id=null;
		Expression x1 =null;
		Expression x2 =null;
		Expression e =null;
		AggregateClause ac =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:929:2: ( FOR ALL v= ID IN ar= ID ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )? ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fe, fac] ( COMMA ac= aggSpecRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:930:3: FOR ALL v= ID IN ar= ID ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )? ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fe, fac] ( COMMA ac= aggSpecRule[fe, fac] )*
			{
			match(input,FOR,FOLLOW_FOR_in_feForAllRule10177); 
			match(input,ALL,FOLLOW_ALL_in_feForAllRule10179); 
			v=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule10183); 
			match(input,IN,FOLLOW_IN_in_feForAllRule10185); 
			ar=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule10189); 
			 fac = env.createForAllClause(v, ar, fe);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:931:4: ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==LB) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:931:6: LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB
					{
					match(input,LB,FOLLOW_LB_in_feForAllRule10214); 
					pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10219);
					x1=feExpressionRule(fe, null);
					state._fsp--;

					 fac.firstIndex = x1; 
					match(input,COMMA,FOLLOW_COMMA_in_feForAllRule10238); 
					pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10242);
					x2=feExpressionRule(fe, null);
					state._fsp--;

					match(input,RB,FOLLOW_RB_in_feForAllRule10246); 
					 fac.lastIndex  = x2; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:4: ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==LOCALLY) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:6: LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )*
					{
					match(input,LOCALLY,FOLLOW_LOCALLY_in_feForAllRule10276); 
					pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10280);
					e=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,AS,FOLLOW_AS_in_feForAllRule10284); 
					id=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule10288); 
					 env.createLocallyClause(fac, id, e, fe); 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:5: ( COMMA e= feExpressionRule[fe, fac] AS id= ID )*
					loop172:
					while (true) {
						int alt172=2;
						int LA172_0 = input.LA(1);
						if ( (LA172_0==COMMA) ) {
							alt172=1;
						}

						switch (alt172) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:7: COMMA e= feExpressionRule[fe, fac] AS id= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_feForAllRule10302); 
							pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10306);
							e=feExpressionRule(fe, fac);
							state._fsp--;

							match(input,AS,FOLLOW_AS_in_feForAllRule10310); 
							id=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule10314); 
							 env.createLocallyClause(fac, id, e, fe); 	
							}
							break;

						default :
							break loop172;
						}
					}

					}
					break;

			}

			match(input,AGGREGATE,FOLLOW_AGGREGATE_in_feForAllRule10330); 
			pushFollow(FOLLOW_aggSpecRule_in_feForAllRule10334);
			ac=aggSpecRule(fe, fac);
			state._fsp--;

			 fac.aggregate.add(ac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:4: ( COMMA ac= aggSpecRule[fe, fac] )*
			loop174:
			while (true) {
				int alt174=2;
				int LA174_0 = input.LA(1);
				if ( (LA174_0==COMMA) ) {
					alt174=1;
				}

				switch (alt174) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:6: COMMA ac= aggSpecRule[fe, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_feForAllRule10353); 
					pushFollow(FOLLOW_aggSpecRule_in_feForAllRule10357);
					ac=aggSpecRule(fe, fac);
					state._fsp--;

					 fac.aggregate.add(ac);
					}
					break;

				default :
					break loop174;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return fac;
	}
	// $ANTLR end "feForAllRule"



	// $ANTLR start "feDeriveRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:942:1: feDeriveRule[FuzzyEvaluator fe] returns [FEDeriveClause dc] : DERIVE (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] ) AS id= ID ;
	public final FEDeriveClause feDeriveRule(FuzzyEvaluator fe) throws RecognitionException {
		FEDeriveClause dc = null;


		Token id=null;
		Expression e =null;

			int dt = FEDeriveClause.DERIVE_SCALAR; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:944:2: ( DERIVE (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] ) AS id= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:3: DERIVE (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] ) AS id= ID
			{
			match(input,DERIVE,FOLLOW_DERIVE_in_feDeriveRule10418); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:10: (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] )
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==ADD||LA175_0==APEX_VALUE||LA175_0==BOOLEAN||LA175_0==FLOAT||(LA175_0 >= ID && LA175_0 <= IF_ERROR)||LA175_0==INT||LA175_0==LP||LA175_0==POS||LA175_0==QUOTED_VALUE||LA175_0==SUB) ) {
				alt175=1;
			}
			else if ( (LA175_0==CUMULATE) ) {
				alt175=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 175, 0, input);
				throw nvae;
			}

			switch (alt175) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:12: e= feExpressionRule[fe, null]
					{
					pushFollow(FOLLOW_feExpressionRule_in_feDeriveRule10424);
					e=feExpressionRule(fe, null);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:946:9: e= feCumulateRule[fe]
					{
					pushFollow(FOLLOW_feCumulateRule_in_feDeriveRule10440);
					e=feCumulateRule(fe);
					state._fsp--;

					 dt = FEDeriveClause.DERIVE_ARRAY; 
					}
					break;

			}

			match(input,AS,FOLLOW_AS_in_feDeriveRule10457); 
			id=(Token)match(input,ID,FOLLOW_ID_in_feDeriveRule10461); 
			 dc = env.createDeriveClause(id, e, fe, dt); 	
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dc;
	}
	// $ANTLR end "feDeriveRule"



	// $ANTLR start "feCumulateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:952:1: feCumulateRule[FuzzyEvaluator fe] returns [Expression feExpr] : CUMULATE LP a= ID RP ;
	public final Expression feCumulateRule(FuzzyEvaluator fe) throws RecognitionException {
		Expression feExpr = null;


		Token a=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:953:2: ( CUMULATE LP a= ID RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:954:3: CUMULATE LP a= ID RP
			{
			match(input,CUMULATE,FOLLOW_CUMULATE_in_feCumulateRule10505); 
			match(input,LP,FOLLOW_LP_in_feCumulateRule10507); 
			a=(Token)match(input,ID,FOLLOW_ID_in_feCumulateRule10511); 
			match(input,RP,FOLLOW_RP_in_feCumulateRule10513); 
				feExpr = env.getCumulateArray (fe, a); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return feExpr;
	}
	// $ANTLR end "feCumulateRule"



	// $ANTLR start "feArraySortRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:958:1: feArraySortRule[FuzzyEvaluator fe] returns [FESortArrayClause sac] : SORT ( feArrayIndexRule[fe, sac] BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS i1= ID | LP feArrayIndexRule[fe, sac] ( COMMA feArrayIndexRule[fe, sac] )+ RP BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS LP i2= ID ( COMMA i3= ID )+ RP ) ;
	public final FESortArrayClause feArraySortRule(FuzzyEvaluator fe) throws RecognitionException {
		FESortArrayClause sac = null;


		Token i1=null;
		Token i2=null;
		Token i3=null;

		 sac = new FESortArrayClause (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:960:2: ( SORT ( feArrayIndexRule[fe, sac] BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS i1= ID | LP feArrayIndexRule[fe, sac] ( COMMA feArrayIndexRule[fe, sac] )+ RP BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS LP i2= ID ( COMMA i3= ID )+ RP ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:960:4: SORT ( feArrayIndexRule[fe, sac] BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS i1= ID | LP feArrayIndexRule[fe, sac] ( COMMA feArrayIndexRule[fe, sac] )+ RP BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS LP i2= ID ( COMMA i3= ID )+ RP )
			{
			match(input,SORT,FOLLOW_SORT_in_feArraySortRule10538); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:961:3: ( feArrayIndexRule[fe, sac] BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS i1= ID | LP feArrayIndexRule[fe, sac] ( COMMA feArrayIndexRule[fe, sac] )+ RP BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS LP i2= ID ( COMMA i3= ID )+ RP )
			int alt180=2;
			int LA180_0 = input.LA(1);
			if ( (LA180_0==ID) ) {
				alt180=1;
			}
			else if ( (LA180_0==LP) ) {
				alt180=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 180, 0, input);
				throw nvae;
			}

			switch (alt180) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:961:5: feArrayIndexRule[fe, sac] BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS i1= ID
					{
					pushFollow(FOLLOW_feArrayIndexRule_in_feArraySortRule10544);
					feArrayIndexRule(fe, sac);
					state._fsp--;

					match(input,BY,FOLLOW_BY_in_feArraySortRule10552); 
					pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10555);
					feSortFieldRule(fe, sac);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:963:6: ( COMMA feSortFieldRule[fe, sac] )*
					loop176:
					while (true) {
						int alt176=2;
						int LA176_0 = input.LA(1);
						if ( (LA176_0==COMMA) ) {
							alt176=1;
						}

						switch (alt176) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:963:8: COMMA feSortFieldRule[fe, sac]
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10566); 
							pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10568);
							feSortFieldRule(fe, sac);
							state._fsp--;

							}
							break;

						default :
							break loop176;
						}
					}

					match(input,AS,FOLLOW_AS_in_feArraySortRule10579); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_feArraySortRule10583); 
					 env.setFuzzyEvaluatorNewArray (fe, sac, i1); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:5: LP feArrayIndexRule[fe, sac] ( COMMA feArrayIndexRule[fe, sac] )+ RP BY feSortFieldRule[fe, sac] ( COMMA feSortFieldRule[fe, sac] )* AS LP i2= ID ( COMMA i3= ID )+ RP
					{
					match(input,LP,FOLLOW_LP_in_feArraySortRule10609); 
					pushFollow(FOLLOW_feArrayIndexRule_in_feArraySortRule10611);
					feArrayIndexRule(fe, sac);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:5: ( COMMA feArrayIndexRule[fe, sac] )+
					int cnt177=0;
					loop177:
					while (true) {
						int alt177=2;
						int LA177_0 = input.LA(1);
						if ( (LA177_0==COMMA) ) {
							alt177=1;
						}

						switch (alt177) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:7: COMMA feArrayIndexRule[fe, sac]
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10621); 
							pushFollow(FOLLOW_feArrayIndexRule_in_feArraySortRule10623);
							feArrayIndexRule(fe, sac);
							state._fsp--;

							}
							break;

						default :
							if ( cnt177 >= 1 ) break loop177;
							EarlyExitException eee = new EarlyExitException(177, input);
							throw eee;
						}
						cnt177++;
					}

					match(input,RP,FOLLOW_RP_in_feArraySortRule10630); 
					match(input,BY,FOLLOW_BY_in_feArraySortRule10637); 
					pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10639);
					feSortFieldRule(fe, sac);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:968:6: ( COMMA feSortFieldRule[fe, sac] )*
					loop178:
					while (true) {
						int alt178=2;
						int LA178_0 = input.LA(1);
						if ( (LA178_0==COMMA) ) {
							alt178=1;
						}

						switch (alt178) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:968:8: COMMA feSortFieldRule[fe, sac]
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10650); 
							pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10652);
							feSortFieldRule(fe, sac);
							state._fsp--;

							}
							break;

						default :
							break loop178;
						}
					}

					match(input,AS,FOLLOW_AS_in_feArraySortRule10663); 
					match(input,LP,FOLLOW_LP_in_feArraySortRule10665); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_feArraySortRule10669); 
					 env.setFuzzyEvaluatorNewArray (fe, sac, i2); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:970:6: ( COMMA i3= ID )+
					int cnt179=0;
					loop179:
					while (true) {
						int alt179=2;
						int LA179_0 = input.LA(1);
						if ( (LA179_0==COMMA) ) {
							alt179=1;
						}

						switch (alt179) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:970:8: COMMA i3= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10697); 
							i3=(Token)match(input,ID,FOLLOW_ID_in_feArraySortRule10701); 
							 env.setFuzzyEvaluatorNewArray (fe, sac, i3); 
							}
							break;

						default :
							if ( cnt179 >= 1 ) break loop179;
							EarlyExitException eee = new EarlyExitException(179, input);
							throw eee;
						}
						cnt179++;
					}

					match(input,RP,FOLLOW_RP_in_feArraySortRule10724); 
					}
					break;

			}

				env.checkFuzzyEvaluatorSortingList (sac); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sac;
	}
	// $ANTLR end "feArraySortRule"



	// $ANTLR start "feArrayIndexRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:1: feArrayIndexRule[FuzzyEvaluator fe, FESortArrayClause sac] : i= ID IN a= ID ;
	public final void feArrayIndexRule(FuzzyEvaluator fe, FESortArrayClause sac) throws RecognitionException {
		Token i=null;
		Token a=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:2: (i= ID IN a= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:976:3: i= ID IN a= ID
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_feArrayIndexRule10771); 
			match(input,IN,FOLLOW_IN_in_feArrayIndexRule10773); 
			a=(Token)match(input,ID,FOLLOW_ID_in_feArrayIndexRule10777); 
			 env.addFuzzyEvaluatorSortingArray (fe, sac, i, a); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "feArrayIndexRule"



	// $ANTLR start "feSortFieldRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:1: feSortFieldRule[FuzzyEvaluator fe, FESortArrayClause sac] : i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )? ;
	public final void feSortFieldRule(FuzzyEvaluator fe, FESortArrayClause sac) throws RecognitionException {
		Token i=null;
		Token t=null;
		Token v=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:980:2: (i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:981:3: i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )?
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_feSortFieldRule10805); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:981:8: (f= fieldRefRule )?
			int alt181=2;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==FIELD_NAME) ) {
				alt181=1;
			}
			switch (alt181) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:981:9: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_feSortFieldRule10810);
					f=fieldRefRule();
					state._fsp--;

					}
					break;

			}

			match(input,TYPE,FOLLOW_TYPE_in_feSortFieldRule10823); 
			t=(Token)match(input,ID,FOLLOW_ID_in_feSortFieldRule10827); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:3: (v= VERSUS )?
			int alt182=2;
			int LA182_0 = input.LA(1);
			if ( (LA182_0==VERSUS) ) {
				alt182=1;
			}
			switch (alt182) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_feSortFieldRule10836); 
					}
					break;

			}

			 env.addFuzzyEvaluatorSortingField (fe, sac, i, f, t, v); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "feSortFieldRule"



	// $ANTLR start "aggSpecRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:987:1: aggSpecRule[FuzzyEvaluator fe, FEForAllClause fac] returns [AggregateClause ac] : (wt= withSpec )? e= feExpressionRule[fe, fac] AS a= ID ;
	public final AggregateClause aggSpecRule(FuzzyEvaluator fe, FEForAllClause fac) throws RecognitionException {
		AggregateClause ac = null;


		Token a=null;
		String wt =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:988:2: ( (wt= withSpec )? e= feExpressionRule[fe, fac] AS a= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:989:3: (wt= withSpec )? e= feExpressionRule[fe, fac] AS a= ID
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:989:3: (wt= withSpec )?
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==WITH) ) {
				alt183=1;
			}
			switch (alt183) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:989:5: wt= withSpec
					{
					pushFollow(FOLLOW_withSpec_in_aggSpecRule10877);
					wt=withSpec();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_feExpressionRule_in_aggSpecRule10887);
			e=feExpressionRule(fe, fac);
			state._fsp--;

			match(input,AS,FOLLOW_AS_in_aggSpecRule10894); 
			a=(Token)match(input,ID,FOLLOW_ID_in_aggSpecRule10898); 
			 ac = env.createAggregateClause(wt, e, a, fe, fac);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ac;
	}
	// $ANTLR end "aggSpecRule"



	// $ANTLR start "withSpec"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:994:1: withSpec returns [String s] : WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM ) ;
	public final String withSpec() throws RecognitionException {
		String s = null;


		Token x=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:995:2: ( WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:996:4: WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM )
			{
			match(input,WITH,FOLLOW_WITH_in_withSpec10931); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:996:9: (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM )
			int alt184=4;
			switch ( input.LA(1) ) {
			case SUM:
				{
				alt184=1;
				}
				break;
			case PRODUCT:
				{
				alt184=2;
				}
				break;
			case MINIMUM:
				{
				alt184=3;
				}
				break;
			case MAXIMUM:
				{
				alt184=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 184, 0, input);
				throw nvae;
			}
			switch (alt184) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:996:11: x= SUM
					{
					x=(Token)match(input,SUM,FOLLOW_SUM_in_withSpec10937); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:997:9: x= PRODUCT
					{
					x=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_withSpec10950); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:998:9: x= MINIMUM
					{
					x=(Token)match(input,MINIMUM,FOLLOW_MINIMUM_in_withSpec10963); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:999:9: x= MAXIMUM
					{
					x=(Token)match(input,MAXIMUM,FOLLOW_MAXIMUM_in_withSpec10976); 
					}
					break;

			}

			s = x.getText();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "withSpec"



	// $ANTLR start "feParameterRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1003:1: feParameterRule[FuzzyEvaluator fe] : p= ID TYPE (t= ID |t= ARRAY ) ;
	public final void feParameterRule(FuzzyEvaluator fe) throws RecognitionException {
		Token p=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1004:2: (p= ID TYPE (t= ID |t= ARRAY ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1005:3: p= ID TYPE (t= ID |t= ARRAY )
			{
			p=(Token)match(input,ID,FOLLOW_ID_in_feParameterRule11009); 
			match(input,TYPE,FOLLOW_TYPE_in_feParameterRule11028); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1006:8: (t= ID |t= ARRAY )
			int alt185=2;
			int LA185_0 = input.LA(1);
			if ( (LA185_0==ID) ) {
				alt185=1;
			}
			else if ( (LA185_0==ARRAY) ) {
				alt185=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 185, 0, input);
				throw nvae;
			}

			switch (alt185) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1006:9: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_feParameterRule11033); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1006:16: t= ARRAY
					{
					t=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_feParameterRule11039); 
					}
					break;

			}

				env.createFEParameter (fe, p, t); 			
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "feParameterRule"



	// $ANTLR start "jfOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1012:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1013:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1014:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule11077);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1015:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop186:
			while (true) {
				int alt186=2;
				int LA186_0 = input.LA(1);
				if ( (LA186_0==OR) ) {
					alt186=1;
				}

				switch (alt186) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1015:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule11094); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule11098);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop186;
				}
			}

			 c = env.simplifyConditionOr ((ConditionOr)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "jfOrConditionRule"



	// $ANTLR start "jfAndConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1021:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1022:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1023:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule11164);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1024:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop187:
			while (true) {
				int alt187=2;
				int LA187_0 = input.LA(1);
				if ( (LA187_0==AND) ) {
					alt187=1;
				}

				switch (alt187) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1024:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule11182); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule11186);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop187;
				}
			}

			 c = env.simplifyConditionAnd ((ConditionAnd)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "jfAndConditionRule"



	// $ANTLR start "jfNotConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1029:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1030:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1031:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1031:5: (not= NOT )?
			int alt188=2;
			int LA188_0 = input.LA(1);
			if ( (LA188_0==NOT) ) {
				alt188=1;
			}
			switch (alt188) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1031:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule11254); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule11265);
			p=jsfPredicateRule(pl, jsCaller);
			state._fsp--;

			 c = env.createCondition (not, p); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "jfNotConditionRule"



	// $ANTLR start "jsfPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1037:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1038:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1039:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule11303);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1040:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt189=3;
			int LA189_0 = input.LA(1);
			if ( (LA189_0==EQ||LA189_0==GE||LA189_0==GT||LA189_0==LE||LA189_0==LT||LA189_0==NEQ) ) {
				alt189=1;
			}
			else if ( (LA189_0==INRANGE) ) {
				alt189=2;
			}
			switch (alt189) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1040:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule11323);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1041:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule11343);
					irp=inRangeRule(e1);
					state._fsp--;

					 p = irp; 	
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "jsfPredicateRule"



	// $ANTLR start "jfCompareRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1045:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1046:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1047:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule11390);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule11399);
			e2=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 p = new ComparisonPredicate (e1, c.getText(), e2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "jfCompareRule"



	// $ANTLR start "jfExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1052:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1054:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1055:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1055:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==APEX_VALUE||LA191_0==FLOAT||(LA191_0 >= ID && LA191_0 <= IF)||LA191_0==INT||LA191_0==LP||LA191_0==QUOTED_VALUE) ) {
				alt191=1;
			}
			else if ( (LA191_0==ADD||LA191_0==SUB) ) {
				alt191=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 191, 0, input);
				throw nvae;
			}

			switch (alt191) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1055:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule11441);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1056:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1056:6: (s= ADD |s= SUB )
					int alt190=2;
					int LA190_0 = input.LA(1);
					if ( (LA190_0==ADD) ) {
						alt190=1;
					}
					else if ( (LA190_0==SUB) ) {
						alt190=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 190, 0, input);
						throw nvae;
					}

					switch (alt190) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1056:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule11464); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1056:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule11470); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule11475);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop193:
			while (true) {
				int alt193=2;
				int LA193_0 = input.LA(1);
				if ( (LA193_0==ADD||LA193_0==SUB) ) {
					alt193=1;
				}

				switch (alt193) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:7: (s= ADD |s= SUB )
					int alt192=2;
					int LA192_0 = input.LA(1);
					if ( (LA192_0==ADD) ) {
						alt192=1;
					}
					else if ( (LA192_0==SUB) ) {
						alt192=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 192, 0, input);
						throw nvae;
					}

					switch (alt192) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule11493); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule11499); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule11504);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop193;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jfExpressionRule"



	// $ANTLR start "jfTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1061:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1064:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule11544);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop195:
			while (true) {
				int alt195=2;
				int LA195_0 = input.LA(1);
				if ( (LA195_0==DIV||LA195_0==MUL) ) {
					alt195=1;
				}

				switch (alt195) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:7: (s= MUL |s= DIV )
					int alt194=2;
					int LA194_0 = input.LA(1);
					if ( (LA194_0==MUL) ) {
						alt194=1;
					}
					else if ( (LA194_0==DIV) ) {
						alt194=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 194, 0, input);
						throw nvae;
					}

					switch (alt194) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule11569); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule11575); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule11580);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop195;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return et;
	}
	// $ANTLR end "jfTermRule"



	// $ANTLR start "jfFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1069:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE | IF LP LP co= jfOrConditionRule[pl, jsCaller] RP COMMA et= jfExpressionRule[pl, jsCaller] COMMA ef= jfExpressionRule[pl, jsCaller] RP |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )? ;
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		Condition co =null;
		Expression et =null;
		Expression ef =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:3: ( ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE | IF LP LP co= jfOrConditionRule[pl, jsCaller] RP COMMA et= jfExpressionRule[pl, jsCaller] COMMA ef= jfExpressionRule[pl, jsCaller] RP |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:4: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE | IF LP LP co= jfOrConditionRule[pl, jsCaller] RP COMMA et= jfExpressionRule[pl, jsCaller] COMMA ef= jfExpressionRule[pl, jsCaller] RP |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:4: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE | IF LP LP co= jfOrConditionRule[pl, jsCaller] RP COMMA et= jfExpressionRule[pl, jsCaller] COMMA ef= jfExpressionRule[pl, jsCaller] RP |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt198=7;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt198=1;
				}
				break;
			case INT:
				{
				alt198=2;
				}
				break;
			case FLOAT:
				{
				alt198=3;
				}
				break;
			case APEX_VALUE:
				{
				alt198=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt198=5;
				}
				break;
			case IF:
				{
				alt198=6;
				}
				break;
			case ID:
				{
				alt198=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 198, 0, input);
				throw nvae;
			}
			switch (alt198) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:6: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule11621); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule11625);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule11629); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1072:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule11649); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule11687); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1074:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule11724); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1075:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule11758); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1076:5: IF LP LP co= jfOrConditionRule[pl, jsCaller] RP COMMA et= jfExpressionRule[pl, jsCaller] COMMA ef= jfExpressionRule[pl, jsCaller] RP
					{
					match(input,IF,FOLLOW_IF_in_jfFactorRule11788); 
					match(input,LP,FOLLOW_LP_in_jfFactorRule11790); 
					match(input,LP,FOLLOW_LP_in_jfFactorRule11792); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule11796);
					co=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule11800); 
					match(input,COMMA,FOLLOW_COMMA_in_jfFactorRule11813); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFactorRule11817);
					et=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_jfFactorRule11826); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFactorRule11830);
					ef=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule11834); 
						expr = env.buildIfFunction (co, et, ef); 
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1079:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule11852); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt197=2;
					int LA197_0 = input.LA(1);
					if ( (LA197_0==LP) ) {
						alt197=1;
					}
					switch (alt197) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:8: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule11892); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:14: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt196=2;
							int LA196_0 = input.LA(1);
							if ( (LA196_0==ADD||LA196_0==APEX_VALUE||LA196_0==FLOAT||(LA196_0 >= ID && LA196_0 <= IF)||LA196_0==INT||LA196_0==LP||LA196_0==QUOTED_VALUE||LA196_0==SUB) ) {
								alt196=1;
							}
							switch (alt196) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:15: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule11897);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule11903); 
							}
							break;

					}

					 expr = env.checkJFFactor(x, p1, fp, pl, jsCaller); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1082:4: ( EXP e= jfFactorRule[pl, jsCaller] )?
			int alt199=2;
			int LA199_0 = input.LA(1);
			if ( (LA199_0==EXP) ) {
				alt199=1;
			}
			switch (alt199) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1082:6: EXP e= jfFactorRule[pl, jsCaller]
					{
					match(input,EXP,FOLLOW_EXP_in_jfFactorRule11930); 
					pushFollow(FOLLOW_jfFactorRule_in_jfFactorRule11934);
					e=jfFactorRule(pl, jsCaller);
					state._fsp--;

						expr.addExp (e); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jfFactorRule"



	// $ANTLR start "jfFunctionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1086:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1088:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1089:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11988);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop200:
			while (true) {
				int alt200=2;
				int LA200_0 = input.LA(1);
				if ( (LA200_0==COMMA) ) {
					alt200=1;
				}

				switch (alt200) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule12008); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule12012);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop200;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return params;
	}
	// $ANTLR end "jfFunctionParamsRule"



	// $ANTLR start "feExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1096:1: feExpressionRule[FuzzyEvaluator fe, FEForAllClause fac] returns [Expression expr] : (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] ) ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )* ;
	public final Expression feExpressionRule(FuzzyEvaluator fe, FEForAllClause fac) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1098:3: ( (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] ) ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:4: (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] ) ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:4: (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] )
			int alt202=2;
			int LA202_0 = input.LA(1);
			if ( (LA202_0==APEX_VALUE||LA202_0==BOOLEAN||LA202_0==FLOAT||(LA202_0 >= ID && LA202_0 <= IF_ERROR)||LA202_0==INT||LA202_0==LP||LA202_0==POS||LA202_0==QUOTED_VALUE) ) {
				alt202=1;
			}
			else if ( (LA202_0==ADD||LA202_0==SUB) ) {
				alt202=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 202, 0, input);
				throw nvae;
			}

			switch (alt202) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:6: t= feTermRule[fe, fac]
					{
					pushFollow(FOLLOW_feTermRule_in_feExpressionRule12060);
					t=feTermRule(fe, fac);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:6: (s= ADD |s= SUB ) t= feTermRule[fe, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:6: (s= ADD |s= SUB )
					int alt201=2;
					int LA201_0 = input.LA(1);
					if ( (LA201_0==ADD) ) {
						alt201=1;
					}
					else if ( (LA201_0==SUB) ) {
						alt201=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 201, 0, input);
						throw nvae;
					}

					switch (alt201) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_feExpressionRule12082); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_feExpressionRule12088); 
							}
							break;

					}

					pushFollow(FOLLOW_feTermRule_in_feExpressionRule12093);
					t=feTermRule(fe, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:5: ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )*
			loop204:
			while (true) {
				int alt204=2;
				int LA204_0 = input.LA(1);
				if ( (LA204_0==ADD||LA204_0==SUB) ) {
					alt204=1;
				}

				switch (alt204) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:7: (s= ADD |s= SUB ) t= feTermRule[fe, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:7: (s= ADD |s= SUB )
					int alt203=2;
					int LA203_0 = input.LA(1);
					if ( (LA203_0==ADD) ) {
						alt203=1;
					}
					else if ( (LA203_0==SUB) ) {
						alt203=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 203, 0, input);
						throw nvae;
					}

					switch (alt203) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_feExpressionRule12110); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_feExpressionRule12116); 
							}
							break;

					}

					pushFollow(FOLLOW_feTermRule_in_feExpressionRule12121);
					t=feTermRule(fe, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop204;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "feExpressionRule"



	// $ANTLR start "feTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1104:1: feTermRule[FuzzyEvaluator fe, FEForAllClause fac] returns [ExpressionTerm et] : f= feFactorRule[fe, fac] ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )* ;
	public final ExpressionTerm feTermRule(FuzzyEvaluator fe, FEForAllClause fac) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:3: (f= feFactorRule[fe, fac] ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1107:4: f= feFactorRule[fe, fac] ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )*
			{
			pushFollow(FOLLOW_feFactorRule_in_feTermRule12160);
			f=feFactorRule(fe, fac);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:5: ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )*
			loop206:
			while (true) {
				int alt206=2;
				int LA206_0 = input.LA(1);
				if ( (LA206_0==DIV||LA206_0==MUL) ) {
					alt206=1;
				}

				switch (alt206) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:7: (s= MUL |s= DIV ) f= feFactorRule[fe, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:7: (s= MUL |s= DIV )
					int alt205=2;
					int LA205_0 = input.LA(1);
					if ( (LA205_0==MUL) ) {
						alt205=1;
					}
					else if ( (LA205_0==DIV) ) {
						alt205=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 205, 0, input);
						throw nvae;
					}

					switch (alt205) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_feTermRule12185); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_feTermRule12191); 
							}
							break;

					}

					pushFollow(FOLLOW_feFactorRule_in_feTermRule12196);
					f=feFactorRule(fe, fac);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop206;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return et;
	}
	// $ANTLR end "feTermRule"



	// $ANTLR start "feFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1113:1: feFactorRule[FuzzyEvaluator fe, FEForAllClause fac] returns [ExpressionFactor expr] : ( LP e= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP | IF LP LP co= jfOrConditionRule[fe.getParamList(), true] RP COMMA et= feExpressionRule[fe, fac] COMMA ef= feExpressionRule[fe, fac] RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? ) ( EXP exp= feFactorRule[fe, fac] )? ;
	public final ExpressionFactor feFactorRule(FuzzyEvaluator fe, FEForAllClause fac) throws RecognitionException {
		ExpressionFactor expr = null;


		Token p=null;
		Token x=null;
		Expression e =null;
		Value vl =null;
		Value v =null;
		Condition co =null;
		Expression et =null;
		Expression ef =null;
		ArrayReference ref =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor exp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1114:3: ( ( LP e= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP | IF LP LP co= jfOrConditionRule[fe.getParamList(), true] RP COMMA et= feExpressionRule[fe, fac] COMMA ef= feExpressionRule[fe, fac] RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? ) ( EXP exp= feFactorRule[fe, fac] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1115:4: ( LP e= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP | IF LP LP co= jfOrConditionRule[fe.getParamList(), true] RP COMMA et= feExpressionRule[fe, fac] COMMA ef= feExpressionRule[fe, fac] RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? ) ( EXP exp= feFactorRule[fe, fac] )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1115:4: ( LP e= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP | IF LP LP co= jfOrConditionRule[fe.getParamList(), true] RP COMMA et= feExpressionRule[fe, fac] COMMA ef= feExpressionRule[fe, fac] RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? )
			int alt208=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt208=1;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt208=2;
				}
				break;
			case POS:
				{
				alt208=3;
				}
				break;
			case IF_ERROR:
				{
				alt208=4;
				}
				break;
			case IF:
				{
				alt208=5;
				}
				break;
			case ID:
				{
				alt208=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 208, 0, input);
				throw nvae;
			}
			switch (alt208) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1115:6: LP e= feExpressionRule[fe, fac] RP
					{
					match(input,LP,FOLLOW_LP_in_feFactorRule12236); 
					pushFollow(FOLLOW_feExpressionRule_in_feFactorRule12240);
					e=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_feFactorRule12244); 
					 expr = new ExpressionFactor (e); 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1116:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_feFactorRule12286);
					vl=valueRule();
					state._fsp--;

						expr = new ExpressionFactor (vl);		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1117:6: p= POS
					{
					p=(Token)match(input,POS,FOLLOW_POS_in_feFactorRule12338); 
					 expr = env.getPosFactor (fac, p); 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1118:5: IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP
					{
					match(input,IF_ERROR,FOLLOW_IF_ERROR_in_feFactorRule12391); 
					match(input,LP,FOLLOW_LP_in_feFactorRule12461); 
					pushFollow(FOLLOW_feExpressionRule_in_feFactorRule12465);
					e=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_feFactorRule12469); 
					pushFollow(FOLLOW_valueRule_in_feFactorRule12473);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_feFactorRule12475); 
						expr = env.buildIfError (e, v); 		
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1120:5: IF LP LP co= jfOrConditionRule[fe.getParamList(), true] RP COMMA et= feExpressionRule[fe, fac] COMMA ef= feExpressionRule[fe, fac] RP
					{
					match(input,IF,FOLLOW_IF_in_feFactorRule12483); 
					match(input,LP,FOLLOW_LP_in_feFactorRule12485); 
					match(input,LP,FOLLOW_LP_in_feFactorRule12487); 
					pushFollow(FOLLOW_jfOrConditionRule_in_feFactorRule12491);
					co=jfOrConditionRule(fe.getParamList(), true);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_feFactorRule12495); 
					match(input,COMMA,FOLLOW_COMMA_in_feFactorRule12539); 
					pushFollow(FOLLOW_feExpressionRule_in_feFactorRule12543);
					et=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_feFactorRule12552); 
					pushFollow(FOLLOW_feExpressionRule_in_feFactorRule12556);
					ef=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_feFactorRule12560); 
						expr = env.buildIfFunction (co, et, ef); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1123:6: x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_feFactorRule12578); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1123:11: (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )?
					int alt207=3;
					int LA207_0 = input.LA(1);
					if ( (LA207_0==LB) ) {
						alt207=1;
					}
					else if ( (LA207_0==LP) ) {
						alt207=2;
					}
					switch (alt207) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1123:13: ref= feArrayRefRule[x, fe, fac]
							{
							pushFollow(FOLLOW_feArrayRefRule_in_feFactorRule12584);
							ref=feArrayRefRule(x, fe, fac);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1124:10: LP fp= feFunctionParamsRule[fe, fac] RP
							{
							match(input,LP,FOLLOW_LP_in_feFactorRule12645); 
							pushFollow(FOLLOW_feFunctionParamsRule_in_feFactorRule12649);
							fp=feFunctionParamsRule(fe, fac);
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_feFactorRule12653); 
							}
							break;

					}

					 expr = env.setFuzzyEvaluatorExprFromArrayRef(x, fp, ref, fe, fac);
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1126:4: ( EXP exp= feFactorRule[fe, fac] )?
			int alt209=2;
			int LA209_0 = input.LA(1);
			if ( (LA209_0==EXP) ) {
				alt209=1;
			}
			switch (alt209) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1126:6: EXP exp= feFactorRule[fe, fac]
					{
					match(input,EXP,FOLLOW_EXP_in_feFactorRule12676); 
					pushFollow(FOLLOW_feFactorRule_in_feFactorRule12680);
					exp=feFactorRule(fe, fac);
					state._fsp--;

						expr.addExp (exp); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "feFactorRule"



	// $ANTLR start "feFunctionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1130:1: feFunctionParamsRule[FuzzyEvaluator fe, FEForAllClause fac] returns [ArrayList<Expression> params] : e= feExpressionRule[fe, fac] ( COMMA e= feExpressionRule[fe, fac] )* ;
	public final ArrayList<Expression> feFunctionParamsRule(FuzzyEvaluator fe, FEForAllClause fac) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1132:3: (e= feExpressionRule[fe, fac] ( COMMA e= feExpressionRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1133:4: e= feExpressionRule[fe, fac] ( COMMA e= feExpressionRule[fe, fac] )*
			{
			pushFollow(FOLLOW_feExpressionRule_in_feFunctionParamsRule12762);
			e=feExpressionRule(fe, fac);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1134:6: ( COMMA e= feExpressionRule[fe, fac] )*
			loop210:
			while (true) {
				int alt210=2;
				int LA210_0 = input.LA(1);
				if ( (LA210_0==COMMA) ) {
					alt210=1;
				}

				switch (alt210) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1134:8: COMMA e= feExpressionRule[fe, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_feFunctionParamsRule12783); 
					pushFollow(FOLLOW_feExpressionRule_in_feFunctionParamsRule12787);
					e=feExpressionRule(fe, fac);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop210;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return params;
	}
	// $ANTLR end "feFunctionParamsRule"



	// $ANTLR start "feArrayRefRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1138:1: feArrayRefRule[Token id, FuzzyEvaluator fe, FEForAllClause fac] returns [ArrayReference ref] : LB (e= feExpressionRule[fe, fac] ) RB (f= fieldRefRule )? ;
	public final ArrayReference feArrayRefRule(Token id, FuzzyEvaluator fe, FEForAllClause fac) throws RecognitionException {
		ArrayReference ref = null;


		Expression e =null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:2: ( LB (e= feExpressionRule[fe, fac] ) RB (f= fieldRefRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1140:3: LB (e= feExpressionRule[fe, fac] ) RB (f= fieldRefRule )?
			{
			match(input,LB,FOLLOW_LB_in_feArrayRefRule12821); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1140:6: (e= feExpressionRule[fe, fac] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1140:7: e= feExpressionRule[fe, fac]
			{
			pushFollow(FOLLOW_feExpressionRule_in_feArrayRefRule12826);
			e=feExpressionRule(fe, fac);
			state._fsp--;

			}

			match(input,RB,FOLLOW_RB_in_feArrayRefRule12831); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1141:3: (f= fieldRefRule )?
			int alt211=2;
			int LA211_0 = input.LA(1);
			if ( (LA211_0==FIELD_NAME) ) {
				alt211=1;
			}
			switch (alt211) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1141:4: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_feArrayRefRule12841);
					f=fieldRefRule();
					state._fsp--;

					}
					break;

			}

			 ref = env.setArrayRef(id, e, f);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ref;
	}
	// $ANTLR end "feArrayRefRule"



	// $ANTLR start "createFuzzySetModelRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1149:1: createFuzzySetModelRule : CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC ;
	public final void createFuzzySetModelRule() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token n=null;
		Expression e =null;
		Condition c =null;
		FuzzyOperatorDefinition fo =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1149:24: ( CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1150:3: CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzySetModelRule12861); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzySetModelRule12863); 
			match(input,SET,FOLLOW_SET_in_createFuzzySetModelRule12865); 
			match(input,MODEL,FOLLOW_MODEL_in_createFuzzySetModelRule12867); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12871); 
			 FuzzySetModel fm = env.addFuzzySetModel (t);	
			match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetModelRule12881); 
			p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12887); 
			 env.addDegreeType(fm, p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1152:6: ( COMMA p= ID )*
			loop212:
			while (true) {
				int alt212=2;
				int LA212_0 = input.LA(1);
				if ( (LA212_0==COMMA) ) {
					alt212=1;
				}

				switch (alt212) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1152:8: COMMA p= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetModelRule12907); 
					p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12911); 
					 env.addDegreeType(fm, p); 
					}
					break;

				default :
					break loop212;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1153:4: ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )?
			int alt214=2;
			int LA214_0 = input.LA(1);
			if ( (LA214_0==DERIVED) ) {
				alt214=1;
			}
			switch (alt214) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1153:6: DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )*
					{
					match(input,DERIVED,FOLLOW_DERIVED_in_createFuzzySetModelRule12937); 
					match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetModelRule12939); 
					n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12943); 
					 env.checkDerivedDegree(fm, n);  
					match(input,AS,FOLLOW_AS_in_createFuzzySetModelRule12956); 
					pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetModelRule12960);
					e=ftExpressionRule(fm.getDegreesList());
					state._fsp--;

					 env.addDerivedDegree(fm, n, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1155:6: ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )*
					loop213:
					while (true) {
						int alt213=2;
						int LA213_0 = input.LA(1);
						if ( (LA213_0==COMMA) ) {
							alt213=1;
						}

						switch (alt213) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1155:8: COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()]
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetModelRule12974); 
							n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12981); 
							 env.checkDerivedDegree(fm, n);  
							match(input,AS,FOLLOW_AS_in_createFuzzySetModelRule13005); 
							pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetModelRule13009);
							e=ftExpressionRule(fm.getDegreesList());
							state._fsp--;

							 env.addDerivedDegree(fm, n, e); 
							}
							break;

						default :
							break loop213;
						}
					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:4: ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )?
			int alt215=2;
			int LA215_0 = input.LA(1);
			if ( (LA215_0==CONSTRAINT) ) {
				alt215=1;
			}
			switch (alt215) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:6: CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false]
					{
					match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_createFuzzySetModelRule13028); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzySetModelRule13032);
					c=jfOrConditionRule(fm.getAllDegreesList(), false);
					state._fsp--;

					 fm.constraint=c; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1159:4: (fo= fuzzyOperatorDefinitionRule[fm] )*
			loop216:
			while (true) {
				int alt216=2;
				int LA216_0 = input.LA(1);
				if ( (LA216_0==OPERATOR) ) {
					alt216=1;
				}

				switch (alt216) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1159:6: fo= fuzzyOperatorDefinitionRule[fm]
					{
					pushFollow(FOLLOW_fuzzyOperatorDefinitionRule_in_createFuzzySetModelRule13051);
					fo=fuzzyOperatorDefinitionRule(fm);
					state._fsp--;

					}
					break;

				default :
					break loop216;
				}
			}

			match(input,SC,FOLLOW_SC_in_createFuzzySetModelRule13059); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createFuzzySetModelRule"



	// $ANTLR start "fuzzyOperatorDefinitionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1164:1: fuzzyOperatorDefinitionRule[FuzzySetModel fm] returns [FuzzyOperatorDefinition defOp] : OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+ ;
	public final FuzzyOperatorDefinition fuzzyOperatorDefinitionRule(FuzzySetModel fm) throws RecognitionException {
		FuzzyOperatorDefinition defOp = null;


		Token o=null;
		Token x=null;
		Expression exp =null;

		 defOp = new FuzzyOperatorDefinition(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1165:49: ( OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1166:2: OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+
			{
			match(input,OPERATOR,FOLLOW_OPERATOR_in_fuzzyOperatorDefinitionRule13081); 
			o=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==NOT||input.LA(1)==OR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
				boolean isNot = env.setFuzzyOperatorType(defOp, o);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1167:2: ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+
			int cnt217=0;
			loop217:
			while (true) {
				int alt217=2;
				int LA217_0 = input.LA(1);
				if ( (LA217_0==EVALUATE) ) {
					alt217=1;
				}

				switch (alt217) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1167:4: EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot]
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_fuzzyOperatorDefinitionRule13121); 
					x=(Token)match(input,ID,FOLLOW_ID_in_fuzzyOperatorDefinitionRule13125); 
					match(input,AS,FOLLOW_AS_in_fuzzyOperatorDefinitionRule13127); 
						env.checkOperatorDegree(defOp, x, fm);	
					pushFollow(FOLLOW_ftConditionExpressionRule_in_fuzzyOperatorDefinitionRule13159);
					exp=ftConditionExpressionRule(fm.getDegreesList(), isNot);
					state._fsp--;

						env.addOperatorDegree(defOp, x, exp);	
					}
					break;

				default :
					if ( cnt217 >= 1 ) break loop217;
					EarlyExitException eee = new EarlyExitException(217, input);
					throw eee;
				}
				cnt217++;
			}

			 env.addOperatorDefinition(fm, defOp, o); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return defOp;
	}
	// $ANTLR end "fuzzyOperatorDefinitionRule"



	// $ANTLR start "createGenericFuzzySetOperatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1174:1: createGenericFuzzySetOperatorRule : CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList(), true] ( COMMA p= parameterRule[gfo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC ;
	public final void createGenericFuzzySetOperatorRule() throws RecognitionException {
		Token t=null;
		Token n=null;
		Token g=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1174:34: ( CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList(), true] ( COMMA p= parameterRule[gfo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1175:3: CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList(), true] ( COMMA p= parameterRule[gfo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule13222); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule13226); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule13228); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule13230); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule13234); 
			 GenericFuzzyOperator gfo = env.addGenericFuzzyOperator(t, n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule13255); 
			pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule13259);
			p=parameterRule(gfo.getParamList(), true);
			state._fsp--;

			 gfo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1177:4: ( COMMA p= parameterRule[gfo.getParamList(), true] )*
			loop218:
			while (true) {
				int alt218=2;
				int LA218_0 = input.LA(1);
				if ( (LA218_0==COMMA) ) {
					alt218=1;
				}

				switch (alt218) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1177:6: COMMA p= parameterRule[gfo.getParamList(), true]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13276); 
					pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule13281);
					p=parameterRule(gfo.getParamList(), true);
					state._fsp--;

					 gfo.parameters.add (p); 
					}
					break;

				default :
					break loop218;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1178:3: ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )?
			int alt219=2;
			int LA219_0 = input.LA(1);
			if ( (LA219_0==PRECONDITION) ) {
				alt219=1;
			}
			switch (alt219) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1178:5: PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule13301); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule13305);
					pc=jfOrConditionRule(gfo.getParamList(), false);
					state._fsp--;

					 gfo.precondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1179:3: ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+
			int cnt222=0;
			loop222:
			while (true) {
				int alt222=2;
				int LA222_0 = input.LA(1);
				if ( (LA222_0==EVALUATE) ) {
					alt222=1;
				}

				switch (alt222) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1179:5: EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule13321); 
					g=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule13325); 
					 Parameter ev = env.createFgoParameter (g); 
					match(input,AS,FOLLOW_AS_in_createGenericFuzzySetOperatorRule13359); 
					pushFollow(FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule13363);
					e=jfExpressionRule(gfo.getParamList(), false);
					state._fsp--;

					 FuzzyPolyline fp = env.manageEvaluate(gfo, ev, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					int alt221=2;
					int LA221_0 = input.LA(1);
					if ( (LA221_0==POLYLINE) ) {
						alt221=1;
					}
					switch (alt221) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:5: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
							{
							match(input,POLYLINE,FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule13386); 
							match(input,LB,FOLLOW_LB_in_createGenericFuzzySetOperatorRule13388); 
							match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule13401); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13405);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13407); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13411);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule13413); 
							 env.addFuzzyPolylinePoint (fp, x, y); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1184:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
							int cnt220=0;
							loop220:
							while (true) {
								int alt220=2;
								int LA220_0 = input.LA(1);
								if ( (LA220_0==COMMA) ) {
									alt220=1;
								}

								switch (alt220) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1184:8: COMMA LP x= numericRule COMMA y= numericRule RP
									{
									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13435); 
									match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule13437); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13441);
									x=numericRule();
									state._fsp--;

									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13443); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13447);
									y=numericRule();
									state._fsp--;

									match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule13449); 
									 env.addFuzzyPolylinePoint (fp, x, y); 
									}
									break;

								default :
									if ( cnt220 >= 1 ) break loop220;
									EarlyExitException eee = new EarlyExitException(220, input);
									throw eee;
								}
								cnt220++;
							}

							match(input,RB,FOLLOW_RB_in_createGenericFuzzySetOperatorRule13468); 
							}
							break;

					}

					 gfo.polylines.add(fp); 
					}
					break;

				default :
					if ( cnt222 >= 1 ) break loop222;
					EarlyExitException eee = new EarlyExitException(222, input);
					throw eee;
				}
				cnt222++;
			}

			match(input,SC,FOLLOW_SC_in_createGenericFuzzySetOperatorRule13532); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createGenericFuzzySetOperatorRule"



	// $ANTLR start "ftExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1194:1: ftExpressionRule[ParamList pl] returns [Expression expr] : (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* ;
	public final Expression ftExpressionRule(ParamList pl) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1196:3: ( (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1197:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1197:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] )
			int alt224=2;
			int LA224_0 = input.LA(1);
			if ( (LA224_0==ARRAY_FUNCTION||LA224_0==DEGREE||(LA224_0 >= EXTENT && LA224_0 <= EXTRACT_ARRAY)||LA224_0==FLOAT||LA224_0==HASH_NAME||(LA224_0 >= ID && LA224_0 <= IF_ERROR)||LA224_0==INT||LA224_0==LP||(LA224_0 >= MEMBERSHIP_ARRAY && LA224_0 <= MEMBERSHIP_TO)||LA224_0==TRANSLATE) ) {
				alt224=1;
			}
			else if ( (LA224_0==ADD||LA224_0==SUB) ) {
				alt224=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 224, 0, input);
				throw nvae;
			}

			switch (alt224) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1197:6: t= ftTermRule[pl]
					{
					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule13566);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1198:6: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1198:6: (s= ADD |s= SUB )
					int alt223=2;
					int LA223_0 = input.LA(1);
					if ( (LA223_0==ADD) ) {
						alt223=1;
					}
					else if ( (LA223_0==SUB) ) {
						alt223=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 223, 0, input);
						throw nvae;
					}

					switch (alt223) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1198:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule13588); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1198:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule13594); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule13599);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1199:5: ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			loop226:
			while (true) {
				int alt226=2;
				int LA226_0 = input.LA(1);
				if ( (LA226_0==ADD||LA226_0==SUB) ) {
					alt226=1;
				}

				switch (alt226) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1199:7: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1199:7: (s= ADD |s= SUB )
					int alt225=2;
					int LA225_0 = input.LA(1);
					if ( (LA225_0==ADD) ) {
						alt225=1;
					}
					else if ( (LA225_0==SUB) ) {
						alt225=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 225, 0, input);
						throw nvae;
					}

					switch (alt225) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1199:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule13616); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1199:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule13622); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule13627);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop226;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "ftExpressionRule"



	// $ANTLR start "ftTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1202:1: ftTermRule[ParamList pl] returns [ExpressionTerm et] : f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* ;
	public final ExpressionTerm ftTermRule(ParamList pl) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1204:3: (f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1205:4: f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			{
			pushFollow(FOLLOW_ftFactorRule_in_ftTermRule13664);
			f=ftFactorRule(pl);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:5: ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			loop228:
			while (true) {
				int alt228=2;
				int LA228_0 = input.LA(1);
				if ( (LA228_0==DIV||LA228_0==MUL) ) {
					alt228=1;
				}

				switch (alt228) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:7: (s= MUL |s= DIV ) f= ftFactorRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:7: (s= MUL |s= DIV )
					int alt227=2;
					int LA227_0 = input.LA(1);
					if ( (LA227_0==MUL) ) {
						alt227=1;
					}
					else if ( (LA227_0==DIV) ) {
						alt227=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 227, 0, input);
						throw nvae;
					}

					switch (alt227) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftTermRule13689); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftTermRule13695); 
							}
							break;

					}

					pushFollow(FOLLOW_ftFactorRule_in_ftTermRule13700);
					f=ftFactorRule(pl);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop228;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return et;
	}
	// $ANTLR end "ftTermRule"



	// $ANTLR start "ftFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1209:1: ftFactorRule[ParamList pl] returns [ExpressionFactor ef] : ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule );
	public final ExpressionFactor ftFactorRule(ParamList pl) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1209:57: ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule )
			int alt230=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt230=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt230=2;
				}
				break;
			case ID:
				{
				int LA230_4 = input.LA(2);
				if ( (LA230_4==LP) ) {
					alt230=4;
				}
				else if ( (LA230_4==ADD||LA230_4==COMMA||LA230_4==CONSTRAINT||LA230_4==DIV||LA230_4==MUL||LA230_4==OPERATOR||LA230_4==RP||LA230_4==SC||LA230_4==SUB) ) {
					alt230=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 230, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case EXTENT:
			case EXTRACT_ARRAY:
			case HASH_NAME:
			case IF:
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt230=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 230, 0, input);
				throw nvae;
			}
			switch (alt230) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1210:5: LP op= ftExpressionRule[pl] RP
					{
					match(input,LP,FOLLOW_LP_in_ftFactorRule13732); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFactorRule13736);
					op=ftExpressionRule(pl);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftFactorRule13739); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1211:6: vl= ftValueRule
					{
					pushFollow(FOLLOW_ftValueRule_in_ftFactorRule13759);
					vl=ftValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1212:6: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule13786); 
					 ef = env.checkDegree(pl,x);	 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:6: x= ID LP (fp= ftFunctionParamsRule[pl] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule13818); 
					match(input,LP,FOLLOW_LP_in_ftFactorRule13820); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:14: (fp= ftFunctionParamsRule[pl] )?
					int alt229=2;
					int LA229_0 = input.LA(1);
					if ( (LA229_0==ADD||LA229_0==ARRAY_FUNCTION||LA229_0==DEGREE||(LA229_0 >= EXTENT && LA229_0 <= EXTRACT_ARRAY)||LA229_0==FLOAT||LA229_0==HASH_NAME||(LA229_0 >= ID && LA229_0 <= IF_ERROR)||LA229_0==INT||LA229_0==LP||(LA229_0 >= MEMBERSHIP_ARRAY && LA229_0 <= MEMBERSHIP_TO)||LA229_0==SUB||LA229_0==TRANSLATE) ) {
						alt229=1;
					}
					switch (alt229) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:15: fp= ftFunctionParamsRule[pl]
							{
							pushFollow(FOLLOW_ftFunctionParamsRule_in_ftFactorRule13825);
							fp=ftFunctionParamsRule(pl);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftFactorRule13830); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_ftFactorRule13845);
					e=specialFunctionRule();
					state._fsp--;

					 ef = e; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ef;
	}
	// $ANTLR end "ftFactorRule"



	// $ANTLR start "ftValueRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1217:1: ftValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1217:31: (n= INT |f= FLOAT )
			int alt231=2;
			int LA231_0 = input.LA(1);
			if ( (LA231_0==INT) ) {
				alt231=1;
			}
			else if ( (LA231_0==FLOAT) ) {
				alt231=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 231, 0, input);
				throw nvae;
			}

			switch (alt231) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1218:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftValueRule13870); 
					 vl = new Value (Value.INT, n.getText());   
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1219:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftValueRule13890); 
					 vl = new Value (Value.FLOAT, f.getText()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vl;
	}
	// $ANTLR end "ftValueRule"



	// $ANTLR start "ftFunctionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:1: ftFunctionParamsRule[ParamList pl] returns [ArrayList<Expression> params] : e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* ;
	public final ArrayList<Expression> ftFunctionParamsRule(ParamList pl) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1224:3: (e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1225:4: e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )*
			{
			pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13926);
			e=ftExpressionRule(pl);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1226:6: ( COMMA e= ftExpressionRule[pl] )*
			loop232:
			while (true) {
				int alt232=2;
				int LA232_0 = input.LA(1);
				if ( (LA232_0==COMMA) ) {
					alt232=1;
				}

				switch (alt232) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1226:8: COMMA e= ftExpressionRule[pl]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftFunctionParamsRule13947); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13951);
					e=ftExpressionRule(pl);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop232;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return params;
	}
	// $ANTLR end "ftFunctionParamsRule"



	// $ANTLR start "ftOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1231:1: ftOrConditionRule[ParamList pl, boolean isNot] returns [Condition c] : c1= ftAndConditionRule[pl,isNot] ( OR c2= ftAndConditionRule[pl,isNot] )* ;
	public final Condition ftOrConditionRule(ParamList pl, boolean isNot) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1232:3: (c1= ftAndConditionRule[pl,isNot] ( OR c2= ftAndConditionRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1233:5: c1= ftAndConditionRule[pl,isNot] ( OR c2= ftAndConditionRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftAndConditionRule_in_ftOrConditionRule13995);
			c1=ftAndConditionRule(pl, isNot);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1234:4: ( OR c2= ftAndConditionRule[pl,isNot] )*
			loop233:
			while (true) {
				int alt233=2;
				int LA233_0 = input.LA(1);
				if ( (LA233_0==OR) ) {
					alt233=1;
				}

				switch (alt233) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1234:6: OR c2= ftAndConditionRule[pl,isNot]
					{
					match(input,OR,FOLLOW_OR_in_ftOrConditionRule14011); 
					pushFollow(FOLLOW_ftAndConditionRule_in_ftOrConditionRule14015);
					c2=ftAndConditionRule(pl, isNot);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop233;
				}
			}

			 c = env.simplifyConditionOr ((ConditionOr)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "ftOrConditionRule"



	// $ANTLR start "ftAndConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1239:1: ftAndConditionRule[ParamList pl, boolean isNot] returns [Condition c] : c1= ftNotConditionRule[pl,isNot] ( AND c2= ftNotConditionRule[pl,isNot] )* ;
	public final Condition ftAndConditionRule(ParamList pl, boolean isNot) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1240:3: (c1= ftNotConditionRule[pl,isNot] ( AND c2= ftNotConditionRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1241:5: c1= ftNotConditionRule[pl,isNot] ( AND c2= ftNotConditionRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftNotConditionRule_in_ftAndConditionRule14080);
			c1=ftNotConditionRule(pl, isNot);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1242:5: ( AND c2= ftNotConditionRule[pl,isNot] )*
			loop234:
			while (true) {
				int alt234=2;
				int LA234_0 = input.LA(1);
				if ( (LA234_0==AND) ) {
					alt234=1;
				}

				switch (alt234) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1242:7: AND c2= ftNotConditionRule[pl,isNot]
					{
					match(input,AND,FOLLOW_AND_in_ftAndConditionRule14097); 
					pushFollow(FOLLOW_ftNotConditionRule_in_ftAndConditionRule14101);
					c2=ftNotConditionRule(pl, isNot);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop234;
				}
			}

			 c = env.simplifyConditionAnd ((ConditionAnd)c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "ftAndConditionRule"



	// $ANTLR start "ftNotConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1247:1: ftNotConditionRule[ParamList pl, boolean isNot] returns [Condition c] : (not= NOT )? p= ftPredicateRule[pl,isNot] ;
	public final Condition ftNotConditionRule(ParamList pl, boolean isNot) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1248:3: ( (not= NOT )? p= ftPredicateRule[pl,isNot] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1249:5: (not= NOT )? p= ftPredicateRule[pl,isNot]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1249:5: (not= NOT )?
			int alt235=2;
			int LA235_0 = input.LA(1);
			if ( (LA235_0==NOT) ) {
				alt235=1;
			}
			switch (alt235) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1249:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_ftNotConditionRule14171); 
					}
					break;

			}

			pushFollow(FOLLOW_ftPredicateRule_in_ftNotConditionRule14183);
			p=ftPredicateRule(pl, isNot);
			state._fsp--;

			 c = env.createCondition (not, p); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "ftNotConditionRule"



	// $ANTLR start "ftPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1256:1: ftPredicateRule[ParamList pl, boolean isNot] returns [Predicate p] : e1= ftConditionExpressionRule[pl,isNot] (c= comparatorRule e2= ftConditionExpressionRule[pl,isNot] )? ;
	public final Predicate ftPredicateRule(ParamList pl, boolean isNot) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1257:3: (e1= ftConditionExpressionRule[pl,isNot] (c= comparatorRule e2= ftConditionExpressionRule[pl,isNot] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1258:3: e1= ftConditionExpressionRule[pl,isNot] (c= comparatorRule e2= ftConditionExpressionRule[pl,isNot] )?
			{
			pushFollow(FOLLOW_ftConditionExpressionRule_in_ftPredicateRule14225);
			e1=ftConditionExpressionRule(pl, isNot);
			state._fsp--;

			 p = e1; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1259:3: (c= comparatorRule e2= ftConditionExpressionRule[pl,isNot] )?
			int alt236=2;
			int LA236_0 = input.LA(1);
			if ( (LA236_0==EQ||LA236_0==GE||LA236_0==GT||LA236_0==LE||LA236_0==LT||LA236_0==NEQ) ) {
				alt236=1;
			}
			switch (alt236) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1259:5: c= comparatorRule e2= ftConditionExpressionRule[pl,isNot]
					{
					pushFollow(FOLLOW_comparatorRule_in_ftPredicateRule14241);
					c=comparatorRule();
					state._fsp--;

					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftPredicateRule14251);
					e2=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					 p = env.generateComparePredicate (e1, c, e2); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "ftPredicateRule"



	// $ANTLR start "ftConditionExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1264:1: ftConditionExpressionRule[ParamList pl, boolean isNot] returns [Expression expr] : (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* ;
	public final Expression ftConditionExpressionRule(ParamList pl, boolean isNot) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1266:2: ( (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1267:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1267:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )
			int alt238=2;
			int LA238_0 = input.LA(1);
			if ( (LA238_0==FLOAT||(LA238_0 >= ID && LA238_0 <= IF)||LA238_0==INT||LA238_0==LP) ) {
				alt238=1;
			}
			else if ( (LA238_0==ADD||LA238_0==SUB) ) {
				alt238=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 238, 0, input);
				throw nvae;
			}

			switch (alt238) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1267:6: t= ftConditionTermRule[pl,isNot]
					{
					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule14295);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1268:6: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1268:6: (s= ADD |s= SUB )
					int alt237=2;
					int LA237_0 = input.LA(1);
					if ( (LA237_0==ADD) ) {
						alt237=1;
					}
					else if ( (LA237_0==SUB) ) {
						alt237=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 237, 0, input);
						throw nvae;
					}

					switch (alt237) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1268:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule14319); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1268:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule14325); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule14330);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1269:5: ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			loop240:
			while (true) {
				int alt240=2;
				int LA240_0 = input.LA(1);
				if ( (LA240_0==ADD||LA240_0==SUB) ) {
					alt240=1;
				}

				switch (alt240) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1269:7: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1269:7: (s= ADD |s= SUB )
					int alt239=2;
					int LA239_0 = input.LA(1);
					if ( (LA239_0==ADD) ) {
						alt239=1;
					}
					else if ( (LA239_0==SUB) ) {
						alt239=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 239, 0, input);
						throw nvae;
					}

					switch (alt239) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1269:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule14349); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1269:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule14355); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule14360);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop240;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "ftConditionExpressionRule"



	// $ANTLR start "ftConditionTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1273:1: ftConditionTermRule[ParamList pl, boolean isNot] returns [ExpressionTerm et] : f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* ;
	public final ExpressionTerm ftConditionTermRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1275:4: (f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1276:4: f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule14396);
			f=ftConditionFactorRule(pl, isNot);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1277:5: ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			loop242:
			while (true) {
				int alt242=2;
				int LA242_0 = input.LA(1);
				if ( (LA242_0==DIV||LA242_0==MUL) ) {
					alt242=1;
				}

				switch (alt242) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1277:7: (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1277:7: (s= MUL |s= DIV )
					int alt241=2;
					int LA241_0 = input.LA(1);
					if ( (LA241_0==MUL) ) {
						alt241=1;
					}
					else if ( (LA241_0==DIV) ) {
						alt241=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 241, 0, input);
						throw nvae;
					}

					switch (alt241) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1277:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftConditionTermRule14413); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1277:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftConditionTermRule14419); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule14424);
					f=ftConditionFactorRule(pl, isNot);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop242;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return et;
	}
	// $ANTLR end "ftConditionTermRule"



	// $ANTLR start "ftConditionFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1280:1: ftConditionFactorRule[ParamList pl, boolean isNot] returns [ExpressionFactor ef] : ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= ftSpecialFunctionRule[pl,isNot] );
	public final ExpressionFactor ftConditionFactorRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Token f=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1281:5: ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= ftSpecialFunctionRule[pl,isNot] )
			int alt244=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt244=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt244=2;
				}
				break;
			case ID:
				{
				int LA244_4 = input.LA(2);
				if ( (LA244_4==FIELD_NAME) ) {
					alt244=3;
				}
				else if ( (LA244_4==LP) ) {
					alt244=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 244, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt244=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 244, 0, input);
				throw nvae;
			}
			switch (alt244) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1282:5: LP op= ftConditionExpressionRule[pl,isNot] RP
					{
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule14454); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule14458);
					op=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule14461); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1283:6: vl= ftConditionValueRule
					{
					pushFollow(FOLLOW_ftConditionValueRule_in_ftConditionFactorRule14479);
					vl=ftConditionValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1284:6: x= ID f= FIELD_NAME
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule14508); 
					f=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_ftConditionFactorRule14512); 
					 ef = env.makeExpDegree(x, f, isNot, pl); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1285:6: x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule14543); 
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule14545); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1285:14: (fp= ftConditionFunctionParamsRule[pl,isNot] )?
					int alt243=2;
					int LA243_0 = input.LA(1);
					if ( (LA243_0==ADD||LA243_0==FLOAT||(LA243_0 >= ID && LA243_0 <= IF)||LA243_0==INT||LA243_0==LP||LA243_0==SUB) ) {
						alt243=1;
					}
					switch (alt243) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1285:15: fp= ftConditionFunctionParamsRule[pl,isNot]
							{
							pushFollow(FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule14550);
							fp=ftConditionFunctionParamsRule(pl, isNot);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule14555); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1286:6: e= ftSpecialFunctionRule[pl,isNot]
					{
					pushFollow(FOLLOW_ftSpecialFunctionRule_in_ftConditionFactorRule14568);
					e=ftSpecialFunctionRule(pl, isNot);
					state._fsp--;

					 ef = e; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ef;
	}
	// $ANTLR end "ftConditionFactorRule"



	// $ANTLR start "ftConditionValueRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1290:1: ftConditionValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftConditionValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1291:5: (n= INT |f= FLOAT )
			int alt245=2;
			int LA245_0 = input.LA(1);
			if ( (LA245_0==INT) ) {
				alt245=1;
			}
			else if ( (LA245_0==FLOAT) ) {
				alt245=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 245, 0, input);
				throw nvae;
			}

			switch (alt245) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1292:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftConditionValueRule14617); 
					 vl = new Value (Value.INT, n.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1293:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftConditionValueRule14637); 
					 vl = new Value (Value.FLOAT, f.getText()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vl;
	}
	// $ANTLR end "ftConditionValueRule"



	// $ANTLR start "ftConditionFunctionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1296:1: ftConditionFunctionParamsRule[ParamList pl, boolean isNot] returns [ArrayList<Expression> params] : e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* ;
	public final ArrayList<Expression> ftConditionFunctionParamsRule(ParamList pl, boolean isNot) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1298:3: (e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1299:4: e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14675);
			e=ftConditionExpressionRule(pl, isNot);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1300:6: ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			loop246:
			while (true) {
				int alt246=2;
				int LA246_0 = input.LA(1);
				if ( (LA246_0==COMMA) ) {
					alt246=1;
				}

				switch (alt246) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1300:8: COMMA e= ftConditionExpressionRule[pl,isNot]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftConditionFunctionParamsRule14694); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14698);
					e=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop246;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return params;
	}
	// $ANTLR end "ftConditionFunctionParamsRule"



	// $ANTLR start "ftSpecialFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1305:1: ftSpecialFunctionRule[ParamList pl, boolean isNot] returns [SpecialFunctionFactor expr] : IF LP LP co= ftOrConditionRule[pl,isNot] RP COMMA et= ftConditionExpressionRule[pl,isNot] COMMA ef= ftConditionExpressionRule[pl,isNot] RP ;
	public final SpecialFunctionFactor ftSpecialFunctionRule(ParamList pl, boolean isNot) throws RecognitionException {
		SpecialFunctionFactor expr = null;


		Condition co =null;
		Expression et =null;
		Expression ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1306:2: ( IF LP LP co= ftOrConditionRule[pl,isNot] RP COMMA et= ftConditionExpressionRule[pl,isNot] COMMA ef= ftConditionExpressionRule[pl,isNot] RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1307:4: IF LP LP co= ftOrConditionRule[pl,isNot] RP COMMA et= ftConditionExpressionRule[pl,isNot] COMMA ef= ftConditionExpressionRule[pl,isNot] RP
			{
			match(input,IF,FOLLOW_IF_in_ftSpecialFunctionRule14732); 
			match(input,LP,FOLLOW_LP_in_ftSpecialFunctionRule14734); 
			match(input,LP,FOLLOW_LP_in_ftSpecialFunctionRule14736); 
			pushFollow(FOLLOW_ftOrConditionRule_in_ftSpecialFunctionRule14740);
			co=ftOrConditionRule(pl, isNot);
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ftSpecialFunctionRule14743); 
			match(input,COMMA,FOLLOW_COMMA_in_ftSpecialFunctionRule14752); 
			pushFollow(FOLLOW_ftConditionExpressionRule_in_ftSpecialFunctionRule14756);
			et=ftConditionExpressionRule(pl, isNot);
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_ftSpecialFunctionRule14763); 
			pushFollow(FOLLOW_ftConditionExpressionRule_in_ftSpecialFunctionRule14767);
			ef=ftConditionExpressionRule(pl, isNot);
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ftSpecialFunctionRule14770); 
				expr = env.buildIfFunction (co, et, ef); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "ftSpecialFunctionRule"



	// $ANTLR start "createGenericFuzzyEvaluatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1323:1: createGenericFuzzyEvaluatorRule : CREATE t= ID FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )* ( EVALUATE g= ID AS e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC ;
	public final void createGenericFuzzyEvaluatorRule() throws RecognitionException {
		Token t=null;
		Token n=null;
		Token g=null;
		Condition pc =null;
		FESortArrayClause s =null;
		FEDeriveClause d =null;
		FEForAllClause f =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1324:3: ( CREATE t= ID FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )* ( EVALUATE g= ID AS e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1325:2: CREATE t= ID FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )* ( EVALUATE g= ID AS e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createGenericFuzzyEvaluatorRule14821); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzyEvaluatorRule14825); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createGenericFuzzyEvaluatorRule14827); 
			match(input,EVALUATOR,FOLLOW_EVALUATOR_in_createGenericFuzzyEvaluatorRule14829); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzyEvaluatorRule14833); 
			 FuzzyEvaluator fe = env.addGenericFuzzyEvaluator(t, n);
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createGenericFuzzyEvaluatorRule14855); 
			pushFollow(FOLLOW_feParameterRule_in_createGenericFuzzyEvaluatorRule14857);
			feParameterRule(fe);
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1327:4: ( COMMA feParameterRule[fe] )*
			loop247:
			while (true) {
				int alt247=2;
				int LA247_0 = input.LA(1);
				if ( (LA247_0==COMMA) ) {
					alt247=1;
				}

				switch (alt247) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1327:6: COMMA feParameterRule[fe]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule14867); 
					pushFollow(FOLLOW_feParameterRule_in_createGenericFuzzyEvaluatorRule14869);
					feParameterRule(fe);
					state._fsp--;

					}
					break;

				default :
					break loop247;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1328:3: ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )?
			int alt248=2;
			int LA248_0 = input.LA(1);
			if ( (LA248_0==PRECONDITION) ) {
				alt248=1;
			}
			switch (alt248) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1328:5: PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createGenericFuzzyEvaluatorRule14885); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createGenericFuzzyEvaluatorRule14889);
					pc=jfOrConditionRule(fe.getParamList(), false);
					state._fsp--;

					 fe.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1329:3: (s= feArraySortRule[fe] |d= feDeriveRule[fe] |f= feForAllRule[fe] )*
			loop249:
			while (true) {
				int alt249=4;
				switch ( input.LA(1) ) {
				case SORT:
					{
					alt249=1;
					}
					break;
				case DERIVE:
					{
					alt249=2;
					}
					break;
				case FOR:
					{
					alt249=3;
					}
					break;
				}
				switch (alt249) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1329:5: s= feArraySortRule[fe]
					{
					pushFollow(FOLLOW_feArraySortRule_in_createGenericFuzzyEvaluatorRule14911);
					s=feArraySortRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(s); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1330:12: d= feDeriveRule[fe]
					{
					pushFollow(FOLLOW_feDeriveRule_in_createGenericFuzzyEvaluatorRule14950);
					d=feDeriveRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(d); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1331:12: f= feForAllRule[fe]
					{
					pushFollow(FOLLOW_feForAllRule_in_createGenericFuzzyEvaluatorRule14986);
					f=feForAllRule(fe);
					state._fsp--;

					 fe.feInternalClauseList.add(f); 
					}
					break;

				default :
					break loop249;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1334:3: ( EVALUATE g= ID AS e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+
			int cnt252=0;
			loop252:
			while (true) {
				int alt252=2;
				int LA252_0 = input.LA(1);
				if ( (LA252_0==EVALUATE) ) {
					alt252=1;
				}

				switch (alt252) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1334:5: EVALUATE g= ID AS e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_createGenericFuzzyEvaluatorRule15021); 
					g=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzyEvaluatorRule15025); 
					 Parameter ev = env.createGfeParameter(g); 
					match(input,AS,FOLLOW_AS_in_createGenericFuzzyEvaluatorRule15058); 
					pushFollow(FOLLOW_feExpressionRule_in_createGenericFuzzyEvaluatorRule15062);
					e=feExpressionRule(fe, null);
					state._fsp--;

					 FuzzyPolyline fp = env.manageEvaluate(fe, ev, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1336:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					int alt251=2;
					int LA251_0 = input.LA(1);
					if ( (LA251_0==POLYLINE) ) {
						alt251=1;
					}
					switch (alt251) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1337:5: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
							{
							match(input,POLYLINE,FOLLOW_POLYLINE_in_createGenericFuzzyEvaluatorRule15092); 
							match(input,LB,FOLLOW_LB_in_createGenericFuzzyEvaluatorRule15094); 
							match(input,LP,FOLLOW_LP_in_createGenericFuzzyEvaluatorRule15100); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15104);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule15106); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15110);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createGenericFuzzyEvaluatorRule15112); 
							 env.addFuzzyPolylinePoint(fp, x, y); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1339:5: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
							int cnt250=0;
							loop250:
							while (true) {
								int alt250=2;
								int LA250_0 = input.LA(1);
								if ( (LA250_0==COMMA) ) {
									alt250=1;
								}

								switch (alt250) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1339:7: COMMA LP x= numericRule COMMA y= numericRule RP
									{
									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule15134); 
									match(input,LP,FOLLOW_LP_in_createGenericFuzzyEvaluatorRule15136); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15140);
									x=numericRule();
									state._fsp--;

									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule15142); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15146);
									y=numericRule();
									state._fsp--;

									match(input,RP,FOLLOW_RP_in_createGenericFuzzyEvaluatorRule15148); 
									 env.addFuzzyPolylinePoint(fp, x, y); 
									}
									break;

								default :
									if ( cnt250 >= 1 ) break loop250;
									EarlyExitException eee = new EarlyExitException(250, input);
									throw eee;
								}
								cnt250++;
							}

							match(input,RB,FOLLOW_RB_in_createGenericFuzzyEvaluatorRule15169); 
							}
							break;

					}

					 fe.genericPolylines.add(fp); 
					}
					break;

				default :
					if ( cnt252 >= 1 ) break loop252;
					EarlyExitException eee = new EarlyExitException(252, input);
					throw eee;
				}
				cnt252++;
			}

			match(input,SC,FOLLOW_SC_in_createGenericFuzzyEvaluatorRule15216); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createGenericFuzzyEvaluatorRule"



	// $ANTLR start "createJavaFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1354:1: createJavaFunctionRule : CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList(), false] ( COMMA p= parameterRule[jf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC ;
	public final void createJavaFunctionRule() throws RecognitionException {
		Token jfn=null;
		Token cl=null;
		Token imp=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1355:2: ( CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList(), false] ( COMMA p= parameterRule[jf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1356:4: CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList(), false] ( COMMA p= parameterRule[jf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaFunctionRule15242); 
			match(input,JAVA,FOLLOW_JAVA_in_createJavaFunctionRule15244); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaFunctionRule15246); 
			jfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule15254); 
			 JavaFunction jf = env.addJavaFunction (jfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaFunctionRule15287); 
			pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule15297);
			p=parameterRule(jf.getParamList(), false);
			state._fsp--;

			 jf.parameters.add (p); 					
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1360:5: ( COMMA p= parameterRule[jf.getParamList(), false] )*
			loop253:
			while (true) {
				int alt253=2;
				int LA253_0 = input.LA(1);
				if ( (LA253_0==COMMA) ) {
					alt253=1;
				}

				switch (alt253) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1360:7: COMMA p= parameterRule[jf.getParamList(), false]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaFunctionRule15319); 
					pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule15323);
					p=parameterRule(jf.getParamList(), false);
					state._fsp--;

					 jf.parameters.add (p);					
					}
					break;

				default :
					break loop253;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1361:4: ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )?
			int alt254=2;
			int LA254_0 = input.LA(1);
			if ( (LA254_0==PRECONDITION) ) {
				alt254=1;
			}
			switch (alt254) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1361:6: PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaFunctionRule15343); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaFunctionRule15347);
					pc=jfOrConditionRule(jf.getParamList(), true);
					state._fsp--;

						jf.preCondition = pc; 					
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule15361); 
			cl=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule15365); 
				jf.setClass (cl.getText());		
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1363:4: ( IMPORT imp= QUOTED_VALUE )?
			int alt255=2;
			int LA255_0 = input.LA(1);
			if ( (LA255_0==IMPORT) ) {
				alt255=1;
			}
			switch (alt255) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1363:6: IMPORT imp= QUOTED_VALUE
					{
					match(input,IMPORT,FOLLOW_IMPORT_in_createJavaFunctionRule15400); 
					imp=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule15404); 
						jf.setImport (imp.getText()); 	
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule15434); 
			match(input,BODY,FOLLOW_BODY_in_createJavaFunctionRule15436); 
			 // ANTLR 3.4 apparently do not support multi context, so scanning must be performed this way
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaFunctionRule15449); 
			match(input,SC,FOLLOW_SC_in_createJavaFunctionRule15455); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "createJavaFunctionRule"

	// Delegated rules



	public static final BitSet FOLLOW_useDbRule_in_start81 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_getCollectionRule_in_start115 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start141 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start159 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_saveAsRule_in_start177 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start211 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start234 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start253 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_filterRule_in_start274 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start307 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start329 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_groupRule_in_start349 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_expandRule_in_start383 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start417 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createJavaFunctionRule_in_start429 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start445 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createFuzzyAggregatorRule_in_start460 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createFuzzyEvaluatorRule_in_start476 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createFuzzySetModelRule_in_start491 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createGenericFuzzySetOperatorRule_in_start506 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_createGenericFuzzyEvaluatorRule_in_start516 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_test_in_start530 = new BitSet(new long[]{0x0800000200000000L,0x0101002040003002L,0x0010041040200000L});
	public static final BitSet FOLLOW_EOF_in_start566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_test579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule603 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule617 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule721 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_ST_in_buildActionRule753 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_buildActionRule755 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REMOVE_in_buildActionRule777 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_buildActionRule779 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LBR_in_buildActionRule784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_buildActionRule788 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_buildActionRule805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_buildActionRule809 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RBR_in_buildActionRule829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule865 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule890 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule931 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule945 = new BitSet(new long[]{0x300000400008A000L,0x00C20C0020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule1116 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000001L,0x0000000800000100L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule1134 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1140 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule1168 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1246 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_dropGeometryRule1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_dropGeometryRule1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASES_in_caseClauseRule1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1382 = new BitSet(new long[]{0x0004000000000002L,0x0000004000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DROP_in_othersRule1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1496 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1562 = new BitSet(new long[]{0x0008002002100442L,0x0000008000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1579 = new BitSet(new long[]{0x0008002002100442L,0x0000008000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1596 = new BitSet(new long[]{0x0008002000100442L,0x0000008000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1627 = new BitSet(new long[]{0x0008002000100042L,0x0000008000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1665 = new BitSet(new long[]{0x0008002000100042L,0x0000008000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1685 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_dropGeometryRule_in_generateSectionRule1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1779 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1840 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1856 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1860 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1922 = new BitSet(new long[]{0x700000400008A010L,0x00C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1978 = new BitSet(new long[]{0x0080000000000002L,0x2004100010008200L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule2067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule2090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule2116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule2136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule2172 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule2181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule2210 = new BitSet(new long[]{0x0000000000000000L,0x0002040000000000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule2216 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_LP_in_inRangeRule2222 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2232 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule2234 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000108000L});
	public static final BitSet FOLLOW_RP_in_inRangeRule2247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2421 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2455 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2519 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2541 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2579 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100801L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2627 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2654 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2701 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2724 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2730 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2735 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2753 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2759 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2764 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2802 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2825 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_DIV_in_termRule2831 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2836 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2869 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorRule2875 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2899 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2926 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2954 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2956 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020104000L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorRule2965 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2982 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LB_in_factorRule3014 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_factorRule_in_factorRule3018 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_factorRule3045 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_factorRule_in_factorRule3049 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_factorRule3088 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_factorRule3101 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_factorRule_in_factorRule3105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule3156 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENT_in_specialFunctionRule3196 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEGREE_in_specialFunctionRule3241 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000100000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_specialFunctionRule3257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_NAME_in_specialFunctionRule3287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_FIELD_NAME_in_specialFunctionRule3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_ARRAY_in_specialFunctionRule3327 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3330 = new BitSet(new long[]{0x0000000000000200L,0x0000040000100000L});
	public static final BitSet FOLLOW_ALL_in_specialFunctionRule3365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_specialFunctionRule3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_specialFunctionRule3418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LB_in_specialFunctionRule3443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3447 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3491 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_specialFunctionRule3534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTRACT_ARRAY_in_specialFunctionRule3547 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_specialFunctionRule3555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_specialFunctionRule3557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_specialFunctionRule3561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_specialFunctionRule3572 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3574 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3576 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_specialFunctionRule3580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3582 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3611 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3615 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3621 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule3653 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3659 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3663 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3665 = new BitSet(new long[]{0x0000000000082000L,0x0000000020000008L,0x0000000000004000L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule3669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule3682 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3688 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3692 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3698 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3718 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule3722 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3743 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule3748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule3754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule3776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule3830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule3850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule3886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule3900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3928 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3968 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3997 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule4018 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule4022 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule4037 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule4041 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule4065 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule4073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule4077 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule4105 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule4111 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule4133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule4137 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule4169 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule4192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule4196 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule4215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule4219 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule4257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4292 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule4315 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule4321 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4326 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule4344 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule4350 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4355 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule4393 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule4416 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule4422 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule4427 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule4461 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule4465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule4467 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule4485 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule4512 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule4540 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule4542 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020104000L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule4547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule4551 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule4570 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LB_in_restrictedFactorRule4601 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4605 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_restrictedFactorRule4627 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4631 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_restrictedFactorRule4665 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_restrictedFactorRule4677 = new BitSet(new long[]{0x300000400008A000L,0x00C2040020710009L,0x0000002000004000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule4736 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule4754 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule4758 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule4802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule4812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule4822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule4832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule4842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule4852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000008L});
	public static final BitSet FOLLOW_SUB_in_numericRule4898 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000008L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule4911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule4917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100100L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4961 = new BitSet(new long[]{0x0000000000000000L,0x4002000000900000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4966 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule5014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100100L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule5018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule5021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule5023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule5027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule5029 = new BitSet(new long[]{0x0000000000000000L,0x4002000000900000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule5033 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule5065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule5080 = new BitSet(new long[]{0x0000000000000000L,0x4002000000900000L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule5084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule5146 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule5162 = new BitSet(new long[]{0x0000000000000000L,0x4002000000900000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule5166 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule5228 = new BitSet(new long[]{0x0000000000000000L,0x0002000000900000L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule5240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule5272 = new BitSet(new long[]{0x0000000000000000L,0x4002000000900000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule5276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule5278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule5300 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule5303 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020104000L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule5308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule5312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule5337 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule5339 = new BitSet(new long[]{0x0000000000000000L,0x4002000000900000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule5347 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule5349 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule5353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule5365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule5381 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule5386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule5388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule5392 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule5396 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule5438 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule5442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule5444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule5448 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule5452 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule5490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule5509 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule5511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule5527 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule5529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule5546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5554 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule5568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5572 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule5597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5605 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule5620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5624 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule5665 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_addFieldsRule5667 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LBR_in_addFieldsRule5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5702 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5704 = new BitSet(new long[]{0x300040400008A000L,0x00E2040064710009L,0x0000002000004010L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5708 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule5727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5731 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5733 = new BitSet(new long[]{0x300040400008A000L,0x00E2040064710009L,0x0000002000004010L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5737 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RBR_in_addFieldsRule5755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule5778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule5793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule5832 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5840 = new BitSet(new long[]{0x0080000000000002L,0x2004100000008200L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule5846 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule5874 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5876 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5882 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5888 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule5894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5899 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule5901 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule5922 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5924 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule5971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule6018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule6081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule6083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule6085 = new BitSet(new long[]{0x0000000000000000L,0x00002040000E0000L,0x0000000000080000L});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule6093 = new BitSet(new long[]{0x0000000000000200L,0x0000200000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule6130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule6166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule6184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule6220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6251 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule6260 = new BitSet(new long[]{0x0000000000000000L,0x00002000000E0000L,0x0000000000080000L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6262 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule6278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule6305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule6307 = new BitSet(new long[]{0x0000000000000800L,0x0000020000000004L,0x0000000000000004L});
	public static final BitSet FOLLOW_AND_in_resolvingRule6319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule6325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule6331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule6337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6369 = new BitSet(new long[]{0x0000000000000200L,0x0000000000100000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6375 = new BitSet(new long[]{0x0000000000000200L,0x0000000000100000L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule6386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6422 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule6461 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6465 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6481 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule6500 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6505 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6521 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule6551 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6556 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule6597 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule6599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100040L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule6611 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule6615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule6619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_FROM_WEB_in_getCollectionRule6650 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule6655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule6661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule6674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule6695 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule6697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6708 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule6710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6714 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule6716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule6749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule6768 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule6770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6780 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_AT_in_saveAsRule6784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_saveAsRule6808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule6824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FROM_WEB_in_lookupFromWebRule6826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule6842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule6855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule6875 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule6877 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule6881 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule6886 = new BitSet(new long[]{0x300000400008A010L,0x00C2040020710009L,0x0000002020004000L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule6890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule6913 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule6915 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6926 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule6930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6934 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000002420001L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule6946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6948 = new BitSet(new long[]{0x0000400000000000L,0x0020000044000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6952 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000002420000L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule6984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6986 = new BitSet(new long[]{0x0000000000000200L,0x0000200080000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule6992 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000002420000L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule6998 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000002420000L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule7004 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000002420000L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule7010 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000002420000L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule7030 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000400L,0x0000000002420000L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule7090 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000400L,0x0000000000420000L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule7132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000420000L});
	public static final BitSet FOLLOW_generateSectionRule_in_joinOfCollectionsRule7175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000420000L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule7213 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule7215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule7256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule7285 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000400L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule7296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000420000L});
	public static final BitSet FOLLOW_generateSectionRule_in_filterRule7315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000420000L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule7334 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule7336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_filterRule7357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule7378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule7403 = new BitSet(new long[]{0x0004000000000000L,0x0000004000000000L,0x0000000000400080L});
	public static final BitSet FOLLOW_othersRule_in_groupRule7429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_groupRule7453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule7476 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule7480 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule7493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7497 = new BitSet(new long[]{0x0000000040000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule7522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7526 = new BitSet(new long[]{0x0000000040000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule7548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7552 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule7573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule7575 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule7577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule7599 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule7601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule7605 = new BitSet(new long[]{0x0000000040000002L,0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule7622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule7626 = new BitSet(new long[]{0x0000000040000002L,0x0000004000000400L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule7645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule7647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule7678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule7709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule7713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule7717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule7732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule7761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule7785 = new BitSet(new long[]{0x0004000000000000L,0x0000004000000000L,0x0000020000400000L});
	public static final BitSet FOLLOW_othersRule_in_expandRule7817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_expandRule7841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule7863 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule7868 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule7875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_TO_in_unpackRule7886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule7917 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule7919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7933 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule7955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7959 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000420000L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule7980 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule7982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule8012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule8032 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule8034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule8044 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule8046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule8050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule8062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule8084 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule8086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule8094 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule8096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule8100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule8112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule8139 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule8149 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8154 = new BitSet(new long[]{0x0000000040010000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8160 = new BitSet(new long[]{0x0000000040010000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_AS_in_useDbRule8184 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8189 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8195 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule8276 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule8278 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8283 = new BitSet(new long[]{0x0000000040010000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8289 = new BitSet(new long[]{0x0000000040010000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_AS_in_useDbRule8312 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8317 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8323 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ON_in_useDbRule8401 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule8413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule8415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule8427 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8442 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L,0x0000000000400000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8448 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L,0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_useDbRule8503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule8528 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule8530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8540 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule8542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule8562 = new BitSet(new long[]{0x0004000000000000L,0x0000004000000000L,0x0000000000400080L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule8602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule8644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule8672 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule8682 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8703 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule8740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule8751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule8762 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule8764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule8768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule8771 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8775 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule8790 = new BitSet(new long[]{0x700000400008A010L,0x40C2050020710009L,0x0003812020004000L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule8794 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule8818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8822 = new BitSet(new long[]{0x0000000000000022L,0x0400000000000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule8845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule8851 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule8853 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8875 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule8927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule8943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_parameterRule8947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaScriptFunctionRule8971 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule8983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule9017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule9027 = new BitSet(new long[]{0x0000000040040000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule9050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule9054 = new BitSet(new long[]{0x0000000040040000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule9077 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule9081 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule9097 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule9110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule9116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyOperatorRule9138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyOperatorRule9140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_createFuzzyOperatorRule9142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule9146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule9171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule9181 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule9204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule9208 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule9233 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule9237 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule9252 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule9256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400200L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule9275 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule9278 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule9290 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9294 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule9296 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule9302 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule9324 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule9326 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9330 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule9332 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule9338 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule9359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule9366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyEvaluatorRule9386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyEvaluatorRule9388 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_EVALUATOR_in_createFuzzyEvaluatorRule9390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyEvaluatorRule9394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyEvaluatorRule9420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9427 = new BitSet(new long[]{0x0100010040000000L,0x0000000000000010L,0x0000000010000800L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9461 = new BitSet(new long[]{0x0100010040000000L,0x0000000000000010L,0x0000000010000800L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyEvaluatorRule9512 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyEvaluatorRule9516 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feArraySortRule_in_createFuzzyEvaluatorRule9540 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feDeriveRule_in_createFuzzyEvaluatorRule9575 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feForAllRule_in_createFuzzyEvaluatorRule9611 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyEvaluatorRule9645 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_createFuzzyEvaluatorRule9649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400200L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyEvaluatorRule9676 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyEvaluatorRule9678 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyEvaluatorRule9685 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9689 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9691 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyEvaluatorRule9697 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9720 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyEvaluatorRule9722 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9726 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9728 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyEvaluatorRule9734 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyEvaluatorRule9754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyEvaluatorRule9761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyAggregatorRule9780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyAggregatorRule9782 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule9784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyAggregatorRule9788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule9814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9821 = new BitSet(new long[]{0x0000010040000000L,0x0000000000000010L,0x0000000010000800L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9855 = new BitSet(new long[]{0x0000010040000000L,0x0000000000000010L,0x0000000010000800L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule9906 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule9910 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feArraySortRule_in_createFuzzyAggregatorRule9933 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feForAllRule_in_createFuzzyAggregatorRule9970 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_feDeriveRule_in_createFuzzyAggregatorRule10005 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyAggregatorRule10039 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_createFuzzyAggregatorRule10043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400200L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyAggregatorRule10070 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyAggregatorRule10072 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule10079 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule10083 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule10085 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule10089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule10091 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule10114 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule10116 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule10120 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule10122 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule10126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule10128 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyAggregatorRule10148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyAggregatorRule10155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_feForAllRule10177 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_feForAllRule10179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule10183 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_IN_in_feForAllRule10185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule10189 = new BitSet(new long[]{0x0000000000000080L,0x0000840000000000L});
	public static final BitSet FOLLOW_LB_in_feForAllRule10214 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10219 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feForAllRule10238 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_feForAllRule10246 = new BitSet(new long[]{0x0000000000000080L,0x0000800000000000L});
	public static final BitSet FOLLOW_LOCALLY_in_feForAllRule10276 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10280 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_feForAllRule10284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule10288 = new BitSet(new long[]{0x0000000040000080L});
	public static final BitSet FOLLOW_COMMA_in_feForAllRule10302 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10306 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_feForAllRule10310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule10314 = new BitSet(new long[]{0x0000000040000080L});
	public static final BitSet FOLLOW_AGGREGATE_in_feForAllRule10330 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000800020004400L});
	public static final BitSet FOLLOW_aggSpecRule_in_feForAllRule10334 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_feForAllRule10353 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000800020004400L});
	public static final BitSet FOLLOW_aggSpecRule_in_feForAllRule10357 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_DERIVE_in_feDeriveRule10418 = new BitSet(new long[]{0x0000000400082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feDeriveRule10424 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_feCumulateRule_in_feDeriveRule10440 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_feDeriveRule10457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feDeriveRule10461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CUMULATE_in_feCumulateRule10505 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_feCumulateRule10507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feCumulateRule10511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feCumulateRule10513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SORT_in_feArraySortRule10538 = new BitSet(new long[]{0x0000000000000000L,0x0002000000100000L});
	public static final BitSet FOLLOW_feArrayIndexRule_in_feArraySortRule10544 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_feArraySortRule10552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10555 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10568 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_AS_in_feArraySortRule10579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feArraySortRule10583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_feArraySortRule10609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feArrayIndexRule_in_feArraySortRule10611 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feArrayIndexRule_in_feArraySortRule10623 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feArraySortRule10630 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_feArraySortRule10637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10639 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10652 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_AS_in_feArraySortRule10663 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_feArraySortRule10665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feArraySortRule10669 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feArraySortRule10701 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feArraySortRule10724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_feArrayIndexRule10771 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_IN_in_feArrayIndexRule10773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feArrayIndexRule10777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_feSortFieldRule10805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000004000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_feSortFieldRule10810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_TYPE_in_feSortFieldRule10823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feSortFieldRule10827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_VERSUS_in_feSortFieldRule10836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withSpec_in_aggSpecRule10877 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_aggSpecRule10887 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_aggSpecRule10894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_aggSpecRule10898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withSpec10931 = new BitSet(new long[]{0x0000000000000000L,0x0210000000000000L,0x0000000080001000L});
	public static final BitSet FOLLOW_SUM_in_withSpec10937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_withSpec10950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINIMUM_in_withSpec10963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAXIMUM_in_withSpec10976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_feParameterRule11009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_TYPE_in_feParameterRule11028 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_feParameterRule11033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_feParameterRule11039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule11077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule11094 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule11098 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule11164 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule11182 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule11186 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule11254 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule11265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule11303 = new BitSet(new long[]{0x0080000000000002L,0x2004100010008200L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule11323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule11343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule11390 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule11399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule11441 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule11464 = new BitSet(new long[]{0x0000000000002000L,0x0002000020300008L,0x0000000000004000L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule11470 = new BitSet(new long[]{0x0000000000002000L,0x0002000020300008L,0x0000000000004000L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule11475 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule11493 = new BitSet(new long[]{0x0000000000002000L,0x0002000020300008L,0x0000000000004000L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule11499 = new BitSet(new long[]{0x0000000000002000L,0x0002000020300008L,0x0000000000004000L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule11504 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule11544 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule11569 = new BitSet(new long[]{0x0000000000002000L,0x0002000020300008L,0x0000000000004000L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule11575 = new BitSet(new long[]{0x0000000000002000L,0x0002000020300008L,0x0000000000004000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule11580 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule11621 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule11625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule11629 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule11649 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule11687 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule11724 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule11758 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_IF_in_jfFactorRule11788 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule11790 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule11792 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule11796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule11800 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_jfFactorRule11813 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFactorRule11817 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_jfFactorRule11826 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFactorRule11830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule11834 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule11852 = new BitSet(new long[]{0x0400000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule11892 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020104000L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule11897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule11903 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_jfFactorRule11930 = new BitSet(new long[]{0x0000000000002000L,0x0002000020300008L,0x0000000000004000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfFactorRule11934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11988 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule12008 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule12012 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_feTermRule_in_feExpressionRule12060 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_feExpressionRule12082 = new BitSet(new long[]{0x0000000000082000L,0x0002000020700008L,0x0000000000004400L});
	public static final BitSet FOLLOW_SUB_in_feExpressionRule12088 = new BitSet(new long[]{0x0000000000082000L,0x0002000020700008L,0x0000000000004400L});
	public static final BitSet FOLLOW_feTermRule_in_feExpressionRule12093 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_feExpressionRule12110 = new BitSet(new long[]{0x0000000000082000L,0x0002000020700008L,0x0000000000004400L});
	public static final BitSet FOLLOW_SUB_in_feExpressionRule12116 = new BitSet(new long[]{0x0000000000082000L,0x0002000020700008L,0x0000000000004400L});
	public static final BitSet FOLLOW_feTermRule_in_feExpressionRule12121 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_feFactorRule_in_feTermRule12160 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_MUL_in_feTermRule12185 = new BitSet(new long[]{0x0000000000082000L,0x0002000020700008L,0x0000000000004400L});
	public static final BitSet FOLLOW_DIV_in_feTermRule12191 = new BitSet(new long[]{0x0000000000082000L,0x0002000020700008L,0x0000000000004400L});
	public static final BitSet FOLLOW_feFactorRule_in_feTermRule12196 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12236 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFactorRule12240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12244 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_valueRule_in_feFactorRule12286 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_POS_in_feFactorRule12338 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_feFactorRule12391 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12461 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFactorRule12465 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feFactorRule12469 = new BitSet(new long[]{0x0000000000082000L,0x0000000020000008L,0x0000000000004000L});
	public static final BitSet FOLLOW_valueRule_in_feFactorRule12473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12475 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_IF_in_feFactorRule12483 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12485 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12487 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_feFactorRule12491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12495 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feFactorRule12539 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFactorRule12543 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feFactorRule12552 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFactorRule12556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12560 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_feFactorRule12578 = new BitSet(new long[]{0x0400000000000002L,0x0002040000000000L});
	public static final BitSet FOLLOW_feArrayRefRule_in_feFactorRule12584 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12645 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feFunctionParamsRule_in_feFactorRule12649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12653 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_feFactorRule12676 = new BitSet(new long[]{0x0000000000082000L,0x0002000020700008L,0x0000000000004400L});
	public static final BitSet FOLLOW_feFactorRule_in_feFactorRule12680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFunctionParamsRule12762 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_feFunctionParamsRule12783 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFunctionParamsRule12787 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LB_in_feArrayRefRule12821 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_feArrayRefRule12826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_feArrayRefRule12831 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_feArrayRefRule12841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzySetModelRule12861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzySetModelRule12863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SET_in_createFuzzySetModelRule12865 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_MODEL_in_createFuzzySetModelRule12867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12871 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetModelRule12881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12887 = new BitSet(new long[]{0x0000020140000000L,0x0000000000000000L,0x0000000000400002L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetModelRule12907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12911 = new BitSet(new long[]{0x0000020140000000L,0x0000000000000000L,0x0000000000400002L});
	public static final BitSet FOLLOW_DERIVED_in_createFuzzySetModelRule12937 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetModelRule12939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12943 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetModelRule12956 = new BitSet(new long[]{0x3000004000008010L,0x00C2000020710008L,0x0000002020000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetModelRule12960 = new BitSet(new long[]{0x0000000140000000L,0x0000000000000000L,0x0000000000400002L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetModelRule12974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12981 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetModelRule13005 = new BitSet(new long[]{0x3000004000008010L,0x00C2000020710008L,0x0000002020000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetModelRule13009 = new BitSet(new long[]{0x0000000140000000L,0x0000000000000000L,0x0000000000400002L});
	public static final BitSet FOLLOW_CONSTRAINT_in_createFuzzySetModelRule13028 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzySetModelRule13032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
	public static final BitSet FOLLOW_fuzzyOperatorDefinitionRule_in_createFuzzySetModelRule13051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
	public static final BitSet FOLLOW_SC_in_createFuzzySetModelRule13059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_fuzzyOperatorDefinitionRule13081 = new BitSet(new long[]{0x0000000000000800L,0x4000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_fuzzyOperatorDefinitionRule13085 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_fuzzyOperatorDefinitionRule13121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_fuzzyOperatorDefinitionRule13125 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_fuzzyOperatorDefinitionRule13127 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_fuzzyOperatorDefinitionRule13159 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule13222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule13226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule13228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule13230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule13234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule13255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule13259 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule13281 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule13301 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule13305 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule13321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule13325 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createGenericFuzzySetOperatorRule13359 = new BitSet(new long[]{0x0000000000002010L,0x0002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule13363 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000400200L});
	public static final BitSet FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule13386 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LB_in_createGenericFuzzySetOperatorRule13388 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule13401 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13405 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13407 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule13413 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13435 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule13437 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13441 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13443 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule13449 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_createGenericFuzzySetOperatorRule13468 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_createGenericFuzzySetOperatorRule13532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule13566 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule13588 = new BitSet(new long[]{0x3000004000008000L,0x00C2000020710008L,0x0000002000000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule13594 = new BitSet(new long[]{0x3000004000008000L,0x00C2000020710008L,0x0000002000000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule13599 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule13616 = new BitSet(new long[]{0x3000004000008000L,0x00C2000020710008L,0x0000002000000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule13622 = new BitSet(new long[]{0x3000004000008000L,0x00C2000020710008L,0x0000002000000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule13627 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule13664 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftTermRule13689 = new BitSet(new long[]{0x3000004000008000L,0x00C2000020710008L,0x0000002000000000L});
	public static final BitSet FOLLOW_DIV_in_ftTermRule13695 = new BitSet(new long[]{0x3000004000008000L,0x00C2000020710008L,0x0000002000000000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule13700 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule13732 = new BitSet(new long[]{0x3000004000008010L,0x00C2000020710008L,0x0000002020000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFactorRule13736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule13739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftValueRule_in_ftFactorRule13759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule13786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule13818 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule13820 = new BitSet(new long[]{0x3000004000008010L,0x00C2000020710008L,0x0000002020100000L});
	public static final BitSet FOLLOW_ftFunctionParamsRule_in_ftFactorRule13825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule13830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_ftFactorRule13845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftValueRule13870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftValueRule13890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13926 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_ftFunctionParamsRule13947 = new BitSet(new long[]{0x3000004000008010L,0x00C2000020710008L,0x0000002020000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13951 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ftAndConditionRule_in_ftOrConditionRule13995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_OR_in_ftOrConditionRule14011 = new BitSet(new long[]{0x0000000000000010L,0x4002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftAndConditionRule_in_ftOrConditionRule14015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ftNotConditionRule_in_ftAndConditionRule14080 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_ftAndConditionRule14097 = new BitSet(new long[]{0x0000000000000010L,0x4002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftNotConditionRule_in_ftAndConditionRule14101 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_ftNotConditionRule14171 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftPredicateRule_in_ftNotConditionRule14183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftPredicateRule14225 = new BitSet(new long[]{0x0080000000000002L,0x2004100000008200L});
	public static final BitSet FOLLOW_comparatorRule_in_ftPredicateRule14241 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftPredicateRule14251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule14295 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule14319 = new BitSet(new long[]{0x0000000000000000L,0x0002000020300008L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule14325 = new BitSet(new long[]{0x0000000000000000L,0x0002000020300008L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule14330 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule14349 = new BitSet(new long[]{0x0000000000000000L,0x0002000020300008L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule14355 = new BitSet(new long[]{0x0000000000000000L,0x0002000020300008L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule14360 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule14396 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftConditionTermRule14413 = new BitSet(new long[]{0x0000000000000000L,0x0002000020300008L});
	public static final BitSet FOLLOW_DIV_in_ftConditionTermRule14419 = new BitSet(new long[]{0x0000000000000000L,0x0002000020300008L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule14424 = new BitSet(new long[]{0x0000800000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule14454 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule14458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule14461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionValueRule_in_ftConditionFactorRule14479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule14508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FIELD_NAME_in_ftConditionFactorRule14512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule14543 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule14545 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020100000L});
	public static final BitSet FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule14550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule14555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftSpecialFunctionRule_in_ftConditionFactorRule14568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftConditionValueRule14617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftConditionValueRule14637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14675 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_ftConditionFunctionParamsRule14694 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14698 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_IF_in_ftSpecialFunctionRule14732 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_ftSpecialFunctionRule14734 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_ftSpecialFunctionRule14736 = new BitSet(new long[]{0x0000000000000010L,0x4002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftOrConditionRule_in_ftSpecialFunctionRule14740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ftSpecialFunctionRule14743 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_ftSpecialFunctionRule14752 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftSpecialFunctionRule14756 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_ftSpecialFunctionRule14763 = new BitSet(new long[]{0x0000000000000010L,0x0002000020300008L,0x0000000020000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftSpecialFunctionRule14767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ftSpecialFunctionRule14770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createGenericFuzzyEvaluatorRule14821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzyEvaluatorRule14825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createGenericFuzzyEvaluatorRule14827 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_EVALUATOR_in_createGenericFuzzyEvaluatorRule14829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzyEvaluatorRule14833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARAMETERS_in_createGenericFuzzyEvaluatorRule14855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feParameterRule_in_createGenericFuzzyEvaluatorRule14857 = new BitSet(new long[]{0x0100010040000000L,0x0000000000000010L,0x0000000010000800L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule14867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_feParameterRule_in_createGenericFuzzyEvaluatorRule14869 = new BitSet(new long[]{0x0100010040000000L,0x0000000000000010L,0x0000000010000800L});
	public static final BitSet FOLLOW_PRECONDITION_in_createGenericFuzzyEvaluatorRule14885 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createGenericFuzzyEvaluatorRule14889 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feArraySortRule_in_createGenericFuzzyEvaluatorRule14911 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feDeriveRule_in_createGenericFuzzyEvaluatorRule14950 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_feForAllRule_in_createGenericFuzzyEvaluatorRule14986 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000010000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createGenericFuzzyEvaluatorRule15021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzyEvaluatorRule15025 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createGenericFuzzyEvaluatorRule15058 = new BitSet(new long[]{0x0000000000082010L,0x0002000020700008L,0x0000000020004400L});
	public static final BitSet FOLLOW_feExpressionRule_in_createGenericFuzzyEvaluatorRule15062 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000400200L});
	public static final BitSet FOLLOW_POLYLINE_in_createGenericFuzzyEvaluatorRule15092 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LB_in_createGenericFuzzyEvaluatorRule15094 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzyEvaluatorRule15100 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15104 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule15106 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzyEvaluatorRule15112 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule15134 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzyEvaluatorRule15136 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15140 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzyEvaluatorRule15142 = new BitSet(new long[]{0x0000000000000010L,0x0000000020000008L,0x0000000020000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzyEvaluatorRule15146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzyEvaluatorRule15148 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RB_in_createGenericFuzzyEvaluatorRule15169 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_createGenericFuzzyEvaluatorRule15216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaFunctionRule15242 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_JAVA_in_createJavaFunctionRule15244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaFunctionRule15246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule15254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaFunctionRule15287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule15297 = new BitSet(new long[]{0x0000000044000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_createJavaFunctionRule15319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule15323 = new BitSet(new long[]{0x0000000044000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaFunctionRule15343 = new BitSet(new long[]{0x0000000000002010L,0x4002000020300008L,0x0000000020004000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaFunctionRule15347 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule15361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule15365 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IMPORT_in_createJavaFunctionRule15400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule15404 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule15434 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaFunctionRule15436 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaFunctionRule15449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_createJavaFunctionRule15455 = new BitSet(new long[]{0x0000000000000002L});
}
