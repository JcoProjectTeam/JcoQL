// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2024-06-25 05:50:41

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
		"HOWINCLUDE", "HOWINTERSECT", "HOWMEET", "ID", "IF_ERROR", "IF_FAILS", 
		"IMPORT", "IN", "INCLUDED", "INPUT", "INRANGE", "INT", "INTERSECT", "INTERSECTION", 
		"INTO", "ISNOTNULL", "ISNULL", "JAVA", "JAVASCRIPT", "JOIN", "KEEP", "KEEPING", 
		"KNOWN", "LAST", "LB", "LBR", "LE", "LEFT", "LETTER", "LOCALLY", "LOOKUP", 
		"LP", "LT", "MATCHING", "MAXIMUM", "MEET", "MEMBERSHIP_ARRAY", "MEMBERSHIP_TO", 
		"MERGE", "MINIMUM", "MIN_SIMILARITY", "MODEL", "MUL", "NEQ", "NOT", "OF", 
		"ON", "OPERATOR", "OR", "ORDER", "ORIENTATION", "OTHERS", "PARAMETERS", 
		"PARTITION", "POINT", "POLYLINE", "POS", "PRECONDITION", "PRODUCT", "QUOTE", 
		"QUOTED_VALUE", "RB", "RBR", "REMOVE", "RESOLVING", "RIGHT", "RP", "SAVE", 
		"SC", "SCAN_ERROR", "SERVER", "SET", "SETS", "SETTING", "SORT", "SUB", 
		"SUBTRACT", "SUM", "THRESHOLD", "TILDE", "TO", "TO_POLYLINE", "TRAJECTORY", 
		"TRANSLATE", "TYPE", "UNCOMPARABLE", "UNKNOWN", "UNPACK", "USE", "USING", 
		"VERSUS", "WHERE", "WHITE_SPACES", "WITH", "WITHIN", "WITHOUT", "WRT", 
		"WS", "XXX"
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
	public static final int HOWINCLUDE=80;
	public static final int HOWINTERSECT=81;
	public static final int HOWMEET=82;
	public static final int ID=83;
	public static final int IF_ERROR=84;
	public static final int IF_FAILS=85;
	public static final int IMPORT=86;
	public static final int IN=87;
	public static final int INCLUDED=88;
	public static final int INPUT=89;
	public static final int INRANGE=90;
	public static final int INT=91;
	public static final int INTERSECT=92;
	public static final int INTERSECTION=93;
	public static final int INTO=94;
	public static final int ISNOTNULL=95;
	public static final int ISNULL=96;
	public static final int JAVA=97;
	public static final int JAVASCRIPT=98;
	public static final int JOIN=99;
	public static final int KEEP=100;
	public static final int KEEPING=101;
	public static final int KNOWN=102;
	public static final int LAST=103;
	public static final int LB=104;
	public static final int LBR=105;
	public static final int LE=106;
	public static final int LEFT=107;
	public static final int LETTER=108;
	public static final int LOCALLY=109;
	public static final int LOOKUP=110;
	public static final int LP=111;
	public static final int LT=112;
	public static final int MATCHING=113;
	public static final int MAXIMUM=114;
	public static final int MEET=115;
	public static final int MEMBERSHIP_ARRAY=116;
	public static final int MEMBERSHIP_TO=117;
	public static final int MERGE=118;
	public static final int MINIMUM=119;
	public static final int MIN_SIMILARITY=120;
	public static final int MODEL=121;
	public static final int MUL=122;
	public static final int NEQ=123;
	public static final int NOT=124;
	public static final int OF=125;
	public static final int ON=126;
	public static final int OPERATOR=127;
	public static final int OR=128;
	public static final int ORDER=129;
	public static final int ORIENTATION=130;
	public static final int OTHERS=131;
	public static final int PARAMETERS=132;
	public static final int PARTITION=133;
	public static final int POINT=134;
	public static final int POLYLINE=135;
	public static final int POS=136;
	public static final int PRECONDITION=137;
	public static final int PRODUCT=138;
	public static final int QUOTE=139;
	public static final int QUOTED_VALUE=140;
	public static final int RB=141;
	public static final int RBR=142;
	public static final int REMOVE=143;
	public static final int RESOLVING=144;
	public static final int RIGHT=145;
	public static final int RP=146;
	public static final int SAVE=147;
	public static final int SC=148;
	public static final int SCAN_ERROR=149;
	public static final int SERVER=150;
	public static final int SET=151;
	public static final int SETS=152;
	public static final int SETTING=153;
	public static final int SORT=154;
	public static final int SUB=155;
	public static final int SUBTRACT=156;
	public static final int SUM=157;
	public static final int THRESHOLD=158;
	public static final int TILDE=159;
	public static final int TO=160;
	public static final int TO_POLYLINE=161;
	public static final int TRAJECTORY=162;
	public static final int TRANSLATE=163;
	public static final int TYPE=164;
	public static final int UNCOMPARABLE=165;
	public static final int UNKNOWN=166;
	public static final int UNPACK=167;
	public static final int USE=168;
	public static final int USING=169;
	public static final int VERSUS=170;
	public static final int WHERE=171;
	public static final int WHITE_SPACES=172;
	public static final int WITH=173;
	public static final int WITHIN=174;
	public static final int WITHOUT=175;
	public static final int WRT=176;
	public static final int WS=177;
	public static final int XXX=178;

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
		public static final String release = "4.0.02";
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:89:1: start : ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | createFuzzyEvaluatorRule | test )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:3: ( ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | createFuzzyEvaluatorRule | test )* EOF )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | createFuzzyEvaluatorRule | test )* EOF
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | createFuzzyEvaluatorRule | test )*
			loop1:
			while (true) {
				int alt1=22;
				switch ( input.LA(1) ) {
				case GET:
					{
					int LA1_2 = input.LA(2);
					if ( (LA1_2==COLLECTION) ) {
						alt1=1;
					}
					else if ( (LA1_2==DICTIONARY) ) {
						alt1=14;
					}

					}
					break;
				case SAVE:
					{
					alt1=2;
					}
					break;
				case JOIN:
					{
					alt1=3;
					}
					break;
				case FILTER:
					{
					alt1=4;
					}
					break;
				case GROUP:
					{
					alt1=5;
					}
					break;
				case EXPAND:
					{
					alt1=6;
					}
					break;
				case MERGE:
					{
					alt1=7;
					}
					break;
				case INTERSECT:
					{
					alt1=8;
					}
					break;
				case SUBTRACT:
					{
					alt1=9;
					}
					break;
				case USE:
					{
					alt1=10;
					}
					break;
				case TRAJECTORY:
					{
					alt1=11;
					}
					break;
				case CREATE:
					{
					switch ( input.LA(2) ) {
					case FUZZY:
						{
						switch ( input.LA(3) ) {
						case OPERATOR:
							{
							alt1=12;
							}
							break;
						case AGGREGATOR:
							{
							alt1=16;
							}
							break;
						case SET:
							{
							alt1=17;
							}
							break;
						case EVALUATOR:
							{
							alt1=20;
							}
							break;
						}
						}
						break;
					case JAVASCRIPT:
						{
						alt1=13;
						}
						break;
					case ID:
						{
						alt1=18;
						}
						break;
					case JAVA:
						{
						alt1=19;
						}
						break;
					}
					}
					break;
				case LOOKUP:
					{
					alt1=15;
					}
					break;
				case XXX:
					{
					alt1=21;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:7: getCollectionRule
					{
					pushFollow(FOLLOW_getCollectionRule_in_start69);
					getCollectionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:91:7: saveAsRule
					{
					pushFollow(FOLLOW_saveAsRule_in_start95);
					saveAsRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:92:7: joinOfCollectionsRule
					{
					pushFollow(FOLLOW_joinOfCollectionsRule_in_start128);
					joinOfCollectionsRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:93:7: filterRule
					{
					pushFollow(FOLLOW_filterRule_in_start150);
					filterRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:94:7: groupRule
					{
					pushFollow(FOLLOW_groupRule_in_start183);
					groupRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:7: expandRule
					{
					pushFollow(FOLLOW_expandRule_in_start217);
					expandRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:96:7: mergeCollectionsRule
					{
					pushFollow(FOLLOW_mergeCollectionsRule_in_start250);
					mergeCollectionsRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:97:7: intersectCollectionsRule
					{
					pushFollow(FOLLOW_intersectCollectionsRule_in_start273);
					intersectCollectionsRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:98:7: subtractCollectionsRule
					{
					pushFollow(FOLLOW_subtractCollectionsRule_in_start292);
					subtractCollectionsRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:99:7: useDbRule
					{
					pushFollow(FOLLOW_useDbRule_in_start312);
					useDbRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:100:7: trajectoryMatchingRule
					{
					pushFollow(FOLLOW_trajectoryMatchingRule_in_start346);
					trajectoryMatchingRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:101:7: createFuzzyOperatorRule
					{
					pushFollow(FOLLOW_createFuzzyOperatorRule_in_start365);
					createFuzzyOperatorRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:102:7: createJavaScriptFunctionRule
					{
					pushFollow(FOLLOW_createJavaScriptFunctionRule_in_start380);
					createJavaScriptFunctionRule();
					state._fsp--;

					}
					break;
				case 14 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:103:7: getDictionaryRule
					{
					pushFollow(FOLLOW_getDictionaryRule_in_start392);
					getDictionaryRule();
					state._fsp--;

					}
					break;
				case 15 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:104:7: lookupFromWebRule
					{
					pushFollow(FOLLOW_lookupFromWebRule_in_start410);
					lookupFromWebRule();
					state._fsp--;

					}
					break;
				case 16 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:105:7: createFuzzyAggregatorRule
					{
					pushFollow(FOLLOW_createFuzzyAggregatorRule_in_start428);
					createFuzzyAggregatorRule();
					state._fsp--;

					}
					break;
				case 17 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:106:7: createFuzzySetModelRule
					{
					pushFollow(FOLLOW_createFuzzySetModelRule_in_start444);
					createFuzzySetModelRule();
					state._fsp--;

					}
					break;
				case 18 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:107:7: createGenericFuzzySetOperatorRule
					{
					pushFollow(FOLLOW_createGenericFuzzySetOperatorRule_in_start459);
					createGenericFuzzySetOperatorRule();
					state._fsp--;

					}
					break;
				case 19 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:108:7: createJavaFunctionRule
					{
					pushFollow(FOLLOW_createJavaFunctionRule_in_start469);
					createJavaFunctionRule();
					state._fsp--;

					}
					break;
				case 20 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:109:7: createFuzzyEvaluatorRule
					{
					pushFollow(FOLLOW_createFuzzyEvaluatorRule_in_start484);
					createFuzzyEvaluatorRule();
					state._fsp--;

					}
					break;
				case 21 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:110:7: test
					{
					pushFollow(FOLLOW_test_in_start498);
					test();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start534); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:1: test : XXX SC ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:5: ( XXX SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:7: XXX SC
			{
			match(input,XXX,FOLLOW_XXX_in_test545); 
			match(input,SC,FOLLOW_SC_in_test547); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:120:1: collectionReferenceRule returns [DbCollection cr] : name= ID ( AT db= ID )? ( AS alias= ID )? ;
	public final DbCollection collectionReferenceRule() throws RecognitionException {
		DbCollection cr = null;


		Token name=null;
		Token db=null;
		Token alias=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:121:3: (name= ID ( AT db= ID )? ( AS alias= ID )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:5: name= ID ( AT db= ID )? ( AS alias= ID )?
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule571); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:5: ( AT db= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:7: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_collectionReferenceRule581); 
					db=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule585); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:124:5: ( AS alias= ID )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:124:7: AS alias= ID
					{
					match(input,AS,FOLLOW_AS_in_collectionReferenceRule598); 
					alias=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule602); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:129:1: fieldRefRule returns [Field field] : (fd= FIELD_NAME )+ ;
	public final Field fieldRefRule() throws RecognitionException {
		Field field = null;


		Token fd=null;

			field = new Field (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:131:3: ( (fd= FIELD_NAME )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:132:5: (fd= FIELD_NAME )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:132:5: (fd= FIELD_NAME )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:132:7: fd= FIELD_NAME
					{
					fd=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_fieldRefRule649); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:136:1: buildActionRule returns [BuildAction ga] : BUILD os= objectStructureRule[true] ;
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:138:3: ( BUILD os= objectStructureRule[true] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:139:5: BUILD os= objectStructureRule[true]
			{
			match(input,BUILD,FOLLOW_BUILD_in_buildActionRule689); 
			pushFollow(FOLLOW_objectStructureRule_in_buildActionRule707);
			os=objectStructureRule(true);
			state._fsp--;

			 ga.setObjectStructure (os); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:145:1: objectStructureRule[boolean generateActionCaller] returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule(boolean generateActionCaller) throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:146:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:147:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule743); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule754);
			ofs=outputFieldSpecRule();
			state._fsp--;

			 obj = new ObjectStructure (ofs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:8: (t= COMMA ofs= outputFieldSpecRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:10: t= COMMA ofs= outputFieldSpecRule
					{
					t=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectStructureRule775); 
					pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule779);
					ofs=outputFieldSpecRule();
					state._fsp--;

					 env.addOutputFieldSpec (obj, ofs, generateActionCaller, t); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_objectStructureRule795); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:155:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:156:3: (fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:157:5: fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule820);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:5: ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:7: COLON (os= objectStructureRule[false] |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule834); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:13: (os= objectStructureRule[false] |f= factorRule )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==LBR) ) {
						alt6=1;
					}
					else if ( (LA6_0==APEX_VALUE||LA6_0==ARRAY_FUNCTION||LA6_0==BOOLEAN||LA6_0==DEGREE||(LA6_0 >= EXTENT && LA6_0 <= EXTRACT_ARRAY)||LA6_0==FIELD_NAME||LA6_0==FLOAT||(LA6_0 >= ID && LA6_0 <= IF_ERROR)||LA6_0==INT||LA6_0==LB||LA6_0==LP||(LA6_0 >= MEMBERSHIP_ARRAY && LA6_0 <= MEMBERSHIP_TO)||LA6_0==QUOTED_VALUE||LA6_0==TRANSLATE) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:15: os= objectStructureRule[false]
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule840);
							os=objectStructureRule(false);
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:159:11: f= factorRule
							{
							pushFollow(FOLLOW_factorRule_in_outputFieldSpecRule879);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:166:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:168:3: ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==KEEPING) ) {
				alt9=1;
			}
			else if ( (LA9_0==SETTING) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:169:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule969); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule971); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:170:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule1003); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule1005); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:171:14: ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					int alt8=4;
					switch ( input.LA(1) ) {
					case POINT:
						{
						alt8=1;
						}
						break;
					case AGGREGATE:
						{
						alt8=2;
						}
						break;
					case FIELD_NAME:
						{
						alt8=3;
						}
						break;
					case TO_POLYLINE:
						{
						alt8=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:171:16: POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP
							{
							match(input,POINT,FOLLOW_POINT_in_geometricOptionRule1023); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1025); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1029);
							lat=fieldRefRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_geometricOptionRule1031); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1035);
							lon=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1037); 
							 geo.setPoint (lat, lon); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:172:16: AGGREGATE LP afr= fieldRefRule RP
							{
							match(input,AGGREGATE,FOLLOW_AGGREGATE_in_geometricOptionRule1057); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1059); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1063);
							afr=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1065); 
							 geo.setAggregate (afr); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:173:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1097);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:174:16: TO_POLYLINE LP f= fieldRefRule RP
							{
							match(input,TO_POLYLINE,FOLLOW_TO_POLYLINE_in_geometricOptionRule1135); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1137); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1141);
							f=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1143); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:1: dropGeometryRule : DROPPING GEOMETRY ;
	public final void dropGeometryRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:179:3: ( DROPPING GEOMETRY )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:4: DROPPING GEOMETRY
			{
			match(input,DROPPING,FOLLOW_DROPPING_in_dropGeometryRule1189); 
			match(input,GEOMETRY,FOLLOW_GEOMETRY_in_dropGeometryRule1191); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:184:1: caseClauseRule returns [CaseClause cc] : (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		Token c=null;
		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:3: ( (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:5: (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:5: (c= CASES |c= CASE )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CASES) ) {
				alt10=1;
			}
			else if ( (LA10_0==CASE) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:7: c= CASES
					{
					c=(Token)match(input,CASES,FOLLOW_CASES_in_caseClauseRule1242); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:17: c= CASE
					{
					c=(Token)match(input,CASE,FOLLOW_CASE_in_caseClauseRule1248); 
					}
					break;

			}

			 cc = env.newCaseClause (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:8: (wc= whereCaseRule )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WHERE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1271);
					wc=whereCaseRule();
					state._fsp--;

					 cc.addWhereCase (wc); 
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:188:8: (oth= othersRule )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==DROP||LA12_0==KEEP) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:188:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1300);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:197:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:198:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:6: (ot= KEEP |ot= DROP )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==KEEP) ) {
				alt13=1;
			}
			else if ( (LA13_0==DROP) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1353); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1359); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1370); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1395); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1406);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:7: (gs= generateSectionRule[true] )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==GENERATE) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1424);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:215:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:216:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:217:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1461); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:218:7: (go= geometricOptionRule )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==KEEPING) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==GEOMETRY) ) {
					alt15=1;
				}
			}
			else if ( (LA15_0==SETTING) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:218:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1478);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:4: (cf= checkForFuzzySetRule[gs] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CHECK_FOR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1495);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:4: (ac= alphaCutRule[gs] )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ALPHACUT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1526);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:7: (ga= buildActionRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BUILD) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1564);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:4: (df= keepDropFuzzySetsRule )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DEFUZZIFY||LA19_0==KEEPING) ) {
				alt19=1;
			}
			else if ( (LA19_0==DROPPING) ) {
				int LA19_2 = input.LA(2);
				if ( (LA19_2==ALL||LA19_2==FUZZY) ) {
					alt19=1;
				}
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1584);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:223:7: ( dropGeometryRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==DROPPING) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:223:9: dropGeometryRule
					{
					pushFollow(FOLLOW_dropGeometryRule_in_generateSectionRule1602);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:231:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:232:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:233:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1663);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:4: ( OR c2= andConditionRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==OR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1678); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1682);
					c2=andConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop21;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:239:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:240:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:241:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1739);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:242:5: ( AND c2= notConditionRule )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==AND) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:242:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1755); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1759);
					c2=notConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop22;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:247:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:5: (not= NOT )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NOT) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1821); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1833);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:256:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:257:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
			int alt25=5;
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
			case ID:
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
				alt25=1;
				}
				break;
			case FIELD:
				{
				alt25=2;
				}
				break;
			case WITH:
				{
				alt25=3;
				}
				break;
			case WITHOUT:
				{
				alt25=4;
				}
				break;
			case KNOWN:
			case UNKNOWN:
			case WITHIN:
				{
				alt25=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:258:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1877);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					int alt24=3;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EQ||LA24_0==GE||LA24_0==GT||LA24_0==LE||LA24_0==LT||LA24_0==NEQ) ) {
						alt24=1;
					}
					else if ( (LA24_0==INRANGE) ) {
						alt24=2;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule1905);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:260:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule1934);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:261:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule1966);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule1989);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule2015);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:264:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule2035);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:268:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule2071);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule2080);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule2109); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:11: (lp= LB |lp= LP )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LB) ) {
				alt26=1;
			}
			else if ( (LA26_0==LP) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule2115); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule2121); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule2131);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule2133); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule2137);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:279:3: (rp= RP |rp= RB )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==RP) ) {
				alt27=1;
			}
			else if ( (LA27_0==RB) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:279:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule2146); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:279:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule2152); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:284:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:285:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule2191); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2195);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:285:26: (n= ISNULL |n= ISNOTNULL )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ISNULL) ) {
				alt28=1;
			}
			else if ( (LA28_0==ISNOTNULL) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:285:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2201); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:285:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2207); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:289:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
			int alt29=3;
			switch ( input.LA(1) ) {
			case WITHIN:
				{
				alt29=1;
				}
				break;
			case KNOWN:
				{
				alt29=2;
				}
				break;
			case UNKNOWN:
				{
				alt29=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2281); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2287); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2293); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2314); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2316); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2320); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:7: ( COMMA fs= ID )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2350); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2354); 
					 env.addFuzzySet (wuk, fs); 
					}
					break;

				default :
					break loop30;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:300:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2407); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2418);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:7: ( COMMA fr= fieldRefRule )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==COMMA) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2436); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2440);
					fr=fieldRefRule();
					state._fsp--;

					 wp.addField (fr); 
					}
					break;

				default :
					break loop31;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2478); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ARRAY||LA33_0==GEOMETRY||LA33_0==ID) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					int alt32=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt32=1;
						}
						break;
					case ARRAY:
						{
						alt32=2;
						}
						break;
					case GEOMETRY:
						{
						alt32=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}
					switch (alt32) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2493); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2499); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2505); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2526);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:6: ( COMMA fr= fieldRefRule )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==COMMA) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2549); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2553);
					fr=fieldRefRule();
					state._fsp--;

					 wp.addField (fr); 
					}
					break;

				default :
					break loop34;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:319:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==APEX_VALUE||LA36_0==ARRAY_FUNCTION||LA36_0==BOOLEAN||LA36_0==DEGREE||(LA36_0 >= EXTENT && LA36_0 <= EXTRACT_ARRAY)||LA36_0==FIELD_NAME||LA36_0==FLOAT||(LA36_0 >= ID && LA36_0 <= IF_ERROR)||LA36_0==INT||LA36_0==LB||LA36_0==LP||(LA36_0 >= MEMBERSHIP_ARRAY && LA36_0 <= MEMBERSHIP_TO)||LA36_0==QUOTED_VALUE||LA36_0==TRANSLATE) ) {
				alt36=1;
			}
			else if ( (LA36_0==ADD||LA36_0==SUB) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2599);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:6: (s= ADD |s= SUB )
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==ADD) ) {
						alt35=1;
					}
					else if ( (LA35_0==SUB) ) {
						alt35=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}

					switch (alt35) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2622); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2628); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2633);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==ADD||LA38_0==SUB) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2651); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2657); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2662);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop38;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:328:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:330:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2700);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==DIV||LA40_0==MUL) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:7: (s= MUL |s= DIV )
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==MUL) ) {
						alt39=1;
					}
					else if ( (LA39_0==DIV) ) {
						alt39=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}

					switch (alt39) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2723); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2729); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2734);
					f=factorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
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
		return et;
	}
	// $ANTLR end "termRule"



	// $ANTLR start "factorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB ) ( EXP e= factorRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:3: ( ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB ) ( EXP e= factorRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:4: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB ) ( EXP e= factorRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:4: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= factorRule ( COMMA f= factorRule )* RB )
			int alt43=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt43=1;
				}
				break;
			case FIELD_NAME:
				{
				alt43=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt43=3;
				}
				break;
			case ID:
				{
				alt43=4;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case EXTENT:
			case EXTRACT_ARRAY:
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt43=5;
				}
				break;
			case LB:
				{
				alt43=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:6: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2767); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2771);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2773); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:339:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2797);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:340:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2824);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2852); 
					match(input,LP,FOLLOW_LP_in_factorRule2854); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:14: (fp= functionParamsRule )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==ADD||LA41_0==APEX_VALUE||LA41_0==ARRAY_FUNCTION||LA41_0==BOOLEAN||LA41_0==DEGREE||(LA41_0 >= EXTENT && LA41_0 <= EXTRACT_ARRAY)||LA41_0==FIELD_NAME||LA41_0==FLOAT||(LA41_0 >= ID && LA41_0 <= IF_ERROR)||LA41_0==INT||LA41_0==LB||LA41_0==LP||(LA41_0 >= MEMBERSHIP_ARRAY && LA41_0 <= MEMBERSHIP_TO)||LA41_0==QUOTED_VALUE||LA41_0==SUB||LA41_0==TRANSLATE) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2859);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2863); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:6: sf= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2880);
					sf=specialFunctionRule();
					state._fsp--;

						ef = sf; 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:343:6: LB f= factorRule ( COMMA f= factorRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_factorRule2912); 
					pushFollow(FOLLOW_factorRule_in_factorRule2916);
					f=factorRule();
					state._fsp--;

					 ef = new ExpressionFactor (f); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:344:6: ( COMMA f= factorRule )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==COMMA) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:344:8: COMMA f= factorRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_factorRule2943); 
							pushFollow(FOLLOW_factorRule_in_factorRule2947);
							f=factorRule();
							state._fsp--;

								ef.addArrayValue (f); 
							}
							break;

						default :
							break loop42;
						}
					}

					match(input,RB,FOLLOW_RB_in_factorRule2986); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:4: ( EXP e= factorRule )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==EXP) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:6: EXP e= factorRule
					{
					match(input,EXP,FOLLOW_EXP_in_factorRule2999); 
					pushFollow(FOLLOW_factorRule_in_factorRule3003);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (mt= MEMBERSHIP_TO LP fs= ID RP | EXTENT LP fs= ID RP | DEGREE LP fs= ID (dg= FIELD_NAME )? RP | MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP | EXTRACT_ARRAY LP field= fieldRefRule FROM_ARRAY array= fieldRefRule RP | IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP | TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
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
		Expression e =null;
		Value v =null;
		ArrayFunctionFactor a =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:2: (mt= MEMBERSHIP_TO LP fs= ID RP | EXTENT LP fs= ID RP | DEGREE LP fs= ID (dg= FIELD_NAME )? RP | MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP | EXTRACT_ARRAY LP field= fieldRefRule FROM_ARRAY array= fieldRefRule RP | IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP | TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
			int alt51=8;
			switch ( input.LA(1) ) {
			case MEMBERSHIP_TO:
				{
				alt51=1;
				}
				break;
			case EXTENT:
				{
				alt51=2;
				}
				break;
			case DEGREE:
				{
				alt51=3;
				}
				break;
			case MEMBERSHIP_ARRAY:
				{
				alt51=4;
				}
				break;
			case EXTRACT_ARRAY:
				{
				alt51=5;
				}
				break;
			case IF_ERROR:
				{
				alt51=6;
				}
				break;
			case TRANSLATE:
				{
				alt51=7;
				}
				break;
			case ARRAY_FUNCTION:
				{
				alt51=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:4: mt= MEMBERSHIP_TO LP fs= ID RP
					{
					mt=(Token)match(input,MEMBERSHIP_TO,FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule3054); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3057); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3061); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule3063); 
						expr = env.buildMembershipTo (mt, fs); 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:5: EXTENT LP fs= ID RP
					{
					match(input,EXTENT,FOLLOW_EXTENT_in_specialFunctionRule3094); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3102); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3106); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule3108); 
						expr = env.buildExtent (fs); 						
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:5: DEGREE LP fs= ID (dg= FIELD_NAME )? RP
					{
					match(input,DEGREE,FOLLOW_DEGREE_in_specialFunctionRule3139); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3147); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3151); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:29: (dg= FIELD_NAME )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==FIELD_NAME) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:29: dg= FIELD_NAME
							{
							dg=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_specialFunctionRule3155); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3158); 
						expr = env.buildDegree (fs, dg);				
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:5: MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP
					{
					match(input,MEMBERSHIP_ARRAY,FOLLOW_MEMBERSHIP_ARRAY_in_specialFunctionRule3183); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3186); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:4: ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB )
					int alt47=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt47=1;
						}
						break;
					case ID:
						{
						alt47=2;
						}
						break;
					case LB:
						{
						alt47=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}
					switch (alt47) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_specialFunctionRule3221); 
							 expr = new MembershipArray (); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:6: fuzzySet= ID FROM_ARRAY array= fieldRefRule
							{
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3268); 
							match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_specialFunctionRule3270); 
							pushFollow(FOLLOW_fieldRefRule_in_specialFunctionRule3274);
							array=fieldRefRule();
							state._fsp--;

							 expr = env.createMembershipArray (fuzzySet, array); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:360:6: LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB
							{
							match(input,LB,FOLLOW_LB_in_specialFunctionRule3299); 
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3303); 
							 expr = env.createMembershipArray (fuzzySet); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:5: ( COMMA fuzzySet= ID )*
							loop46:
							while (true) {
								int alt46=2;
								int LA46_0 = input.LA(1);
								if ( (LA46_0==COMMA) ) {
									alt46=1;
								}

								switch (alt46) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:7: COMMA fuzzySet= ID
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3343); 
									fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3347); 
									 env.addMembershipArray ((MembershipArray)expr, fuzzySet); 
									}
									break;

								default :
									break loop46;
								}
							}

							match(input,RB,FOLLOW_RB_in_specialFunctionRule3390); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3397); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:364:5: EXTRACT_ARRAY LP field= fieldRefRule FROM_ARRAY array= fieldRefRule RP
					{
					match(input,EXTRACT_ARRAY,FOLLOW_EXTRACT_ARRAY_in_specialFunctionRule3403); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3407); 
					pushFollow(FOLLOW_fieldRefRule_in_specialFunctionRule3411);
					field=fieldRefRule();
					state._fsp--;

					match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_specialFunctionRule3413); 
					pushFollow(FOLLOW_fieldRefRule_in_specialFunctionRule3417);
					array=fieldRefRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3419); 
						expr = env.createExtractArray(field, array); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:5: IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule3428); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3434); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3438);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3440); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule3444);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3446); 
						expr = env.buildIfError (e, v); 					
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:5: TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule3457); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3463); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3467);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3469); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3473); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:16: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==COMMA) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:18: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3493); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule3497); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:17: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt49=2;
							int LA49_0 = input.LA(1);
							if ( (LA49_0==COMMA) ) {
								alt49=1;
							}
							switch (alt49) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:19: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3518); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:25: (d= APEX_VALUE |d= QUOTED_VALUE )
									int alt48=2;
									int LA48_0 = input.LA(1);
									if ( (LA48_0==APEX_VALUE) ) {
										alt48=1;
									}
									else if ( (LA48_0==QUOTED_VALUE) ) {
										alt48=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 48, 0, input);
										throw nvae;
									}

									switch (alt48) {
										case 1 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:26: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule3523); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:41: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule3529); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3538); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:369:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule3551);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:373:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |b= BOOLEAN |a= APEX_VALUE |q= QUOTED_VALUE );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token b=null;
		Token a=null;
		Token q=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:374:3: (n= INT |f= FLOAT |b= BOOLEAN |a= APEX_VALUE |q= QUOTED_VALUE )
			int alt52=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt52=1;
				}
				break;
			case FLOAT:
				{
				alt52=2;
				}
				break;
			case BOOLEAN:
				{
				alt52=3;
				}
				break;
			case APEX_VALUE:
				{
				alt52=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt52=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:375:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule3605); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:376:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule3625); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:377:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule3644); 
					 vl = new Value (Value.BOOLEAN, b.getText());	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:378:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule3661); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:379:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule3675); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3703); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3743); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:388:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==FIELD_NAME) ) {
				alt54=1;
			}
			else if ( (LA54_0==LB) ) {
				alt54=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:388:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3772);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:389:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule3793); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3797);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:5: ( COMMA e= restrictedExpressionRule )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==COMMA) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3812); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3816);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop53;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule3840); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3848); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule3852); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==COMMA) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3880); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==FIELD_NAME) ) {
						alt57=1;
					}
					else if ( (LA57_0==DOCUMENTS) ) {
						alt57=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}

					switch (alt57) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3886);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:9: ( COMMA fx= fieldRefRule )*
							loop55:
							while (true) {
								int alt55=2;
								int LA55_0 = input.LA(1);
								if ( (LA55_0==COMMA) ) {
									alt55=1;
								}

								switch (alt55) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3908); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3912);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop55;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:396:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule3944); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3967); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3971);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:398:9: ( COMMA fx= fieldRefRule )*
							loop56:
							while (true) {
								int alt56=2;
								int LA56_0 = input.LA(1);
								if ( (LA56_0==COMMA) ) {
									alt56=1;
								}

								switch (alt56) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:398:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3990); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3994);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop56;
								}
							}

							}
							break;

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule4032); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:411:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:413:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==APEX_VALUE||LA60_0==ARRAY_FUNCTION||LA60_0==BOOLEAN||LA60_0==DEGREE||(LA60_0 >= EXTENT && LA60_0 <= EXTRACT_ARRAY)||LA60_0==FIELD_NAME||LA60_0==FLOAT||(LA60_0 >= ID && LA60_0 <= IF_ERROR)||LA60_0==INT||LA60_0==LB||LA60_0==LP||(LA60_0 >= MEMBERSHIP_ARRAY && LA60_0 <= MEMBERSHIP_TO)||LA60_0==QUOTED_VALUE||LA60_0==TRANSLATE) ) {
				alt60=1;
			}
			else if ( (LA60_0==ADD||LA60_0==SUB) ) {
				alt60=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4067);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:415:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:415:5: (s= ADD |s= SUB )
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==ADD) ) {
						alt59=1;
					}
					else if ( (LA59_0==SUB) ) {
						alt59=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}

					switch (alt59) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:415:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule4090); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:415:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule4096); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4101);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==ADD||LA62_0==SUB) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:7: (s= ADD |s= SUB )
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==ADD) ) {
						alt61=1;
					}
					else if ( (LA61_0==SUB) ) {
						alt61=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 61, 0, input);
						throw nvae;
					}

					switch (alt61) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule4119); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule4125); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4130);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop62;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:422:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:423:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule4168);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==DIV||LA64_0==MUL) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:7: (s= MUL |s= DIV )
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==MUL) ) {
						alt63=1;
					}
					else if ( (LA63_0==DIV) ) {
						alt63=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);
						throw nvae;
					}

					switch (alt63) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule4191); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule4197); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule4202);
					f=restrictedFactorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop64;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB ) ( EXP e= restrictedFactorRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:3: ( ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB ) ( EXP e= restrictedFactorRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:430:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB ) ( EXP e= restrictedFactorRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:430:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |sf= specialFunctionRule | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB )
			int alt67=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt67=1;
				}
				break;
			case FIELD_NAME:
				{
				alt67=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt67=3;
				}
				break;
			case ID:
				{
				alt67=4;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case EXTENT:
			case EXTRACT_ARRAY:
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt67=5;
				}
				break;
			case LB:
				{
				alt67=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:430:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule4236); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule4240);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule4242); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:431:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule4260);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:432:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule4287);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule4315); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule4317); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:14: (fp= functionParamsRule )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==ADD||LA65_0==APEX_VALUE||LA65_0==ARRAY_FUNCTION||LA65_0==BOOLEAN||LA65_0==DEGREE||(LA65_0 >= EXTENT && LA65_0 <= EXTRACT_ARRAY)||LA65_0==FIELD_NAME||LA65_0==FLOAT||(LA65_0 >= ID && LA65_0 <= IF_ERROR)||LA65_0==INT||LA65_0==LB||LA65_0==LP||(LA65_0 >= MEMBERSHIP_ARRAY && LA65_0 <= MEMBERSHIP_TO)||LA65_0==QUOTED_VALUE||LA65_0==SUB||LA65_0==TRANSLATE) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule4322);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule4326); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:6: sf= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule4345);
					sf=specialFunctionRule();
					state._fsp--;

						ef = sf;	
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:6: LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_restrictedFactorRule4376); 
					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4380);
					f=restrictedFactorRule();
					state._fsp--;

					 ef = new ExpressionFactor (f); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:436:6: ( COMMA f= restrictedFactorRule )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==COMMA) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:436:8: COMMA f= restrictedFactorRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_restrictedFactorRule4402); 
							pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4406);
							f=restrictedFactorRule();
							state._fsp--;

								ef.addArrayValue (f); 
							}
							break;

						default :
							break loop66;
						}
					}

					match(input,RB,FOLLOW_RB_in_restrictedFactorRule4440); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:4: ( EXP e= restrictedFactorRule )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==EXP) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:6: EXP e= restrictedFactorRule
					{
					match(input,EXP,FOLLOW_EXP_in_restrictedFactorRule4452); 
					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4456);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:445:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:446:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule4511);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:447:6: ( COMMA e= restrictedExpressionRule )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==COMMA) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:447:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule4529); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule4533);
					e=restrictedExpressionRule();
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop69;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:455:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:456:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			int alt70=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt70=1;
				}
				break;
			case NEQ:
				{
				alt70=2;
				}
				break;
			case LT:
				{
				alt70=3;
				}
				break;
			case GT:
				{
				alt70=4;
				}
				break;
			case LE:
				{
				alt70=5;
				}
				break;
			case GE:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule4577); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule4587); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:459:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule4597); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:460:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule4607); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:461:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule4617); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:462:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule4627); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:469:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:470:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:471:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:471:4: (s= ADD |s= SUB )?
			int alt71=3;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==ADD) ) {
				alt71=1;
			}
			else if ( (LA71_0==SUB) ) {
				alt71=2;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:471:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule4667); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:471:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule4673); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:4: (n= FLOAT |n= INT )
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==FLOAT) ) {
				alt72=1;
			}
			else if ( (LA72_0==INT) ) {
				alt72=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule4686); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule4692); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:478:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token ty=null;
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:479:2: ( CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:480:3: CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4721); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:480:15: (ty= ID )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==ID) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:480:15: ty= ID
					{
					ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4725); 
					}
					break;

			}

			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4728); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4730); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4734); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4736); 
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4741);
			fe=usingOrConditionRule();
			state._fsp--;

			 env.addCheckForFuzzySet (gs, fs, fe, ty); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:481:4: ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==COMMA) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:481:37: COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
						ty = null; 
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule4789); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:482:13: (ty= ID )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==ID) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:482:13: ty= ID
							{
							ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4793); 
							}
							break;

					}

					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4796); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4798); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4802); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4804); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4808);
					fe=usingOrConditionRule();
					state._fsp--;

					 env.addCheckForFuzzySet (gs, fs, fe, ty); 
					}
					break;

				default :
					break loop75;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:487:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:488:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:489:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4840);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:490:4: ( OR c2= usingAndConditionRule )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==OR) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:490:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule4855); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4859);
					c2=usingAndConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop76;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:498:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:499:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:500:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4921);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:501:5: ( AND c2= usingNotConditionRule )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==AND) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:501:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule4937); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4941);
					c2=usingNotConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop77;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:506:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:507:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:508:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:508:5: (not= NOT )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==NOT) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:508:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule5003); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule5015);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:514:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:515:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
			int alt81=3;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt81=1;
				}
				break;
			case ID:
				{
				alt81=2;
				}
				break;
			case IF_FAILS:
				{
				alt81=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:516:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule5047); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule5051);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule5053); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:517:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule5075); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:517:9: ( LP (fp= functionParamsRule )? RP )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==LP) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:517:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule5078); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:517:13: (fp= functionParamsRule )?
							int alt79=2;
							int LA79_0 = input.LA(1);
							if ( (LA79_0==ADD||LA79_0==APEX_VALUE||LA79_0==ARRAY_FUNCTION||LA79_0==BOOLEAN||LA79_0==DEGREE||(LA79_0 >= EXTENT && LA79_0 <= EXTRACT_ARRAY)||LA79_0==FIELD_NAME||LA79_0==FLOAT||(LA79_0 >= ID && LA79_0 <= IF_ERROR)||LA79_0==INT||LA79_0==LB||LA79_0==LP||(LA79_0 >= MEMBERSHIP_ARRAY && LA79_0 <= MEMBERSHIP_TO)||LA79_0==QUOTED_VALUE||LA79_0==SUB||LA79_0==TRANSLATE) ) {
								alt79=1;
							}
							switch (alt79) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:517:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule5083);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule5087); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:518:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule5112); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule5114); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule5122);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule5124); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule5128);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule5136); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		Token de=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:2: ( ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:3: ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule5152); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule5157);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule5159); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule5163); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:38: (de= FIELD_NAME )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==FIELD_NAME) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:38: de= FIELD_NAME
					{
					de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule5167); 
					}
					break;

			}

				env.addAlphaCut (gs, n, on, de); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:4: ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==COMMA) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:30: COMMA n= numericRule ON on= ID (de= FIELD_NAME )?
					{
					 de = null; 
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule5209); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule5213);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule5215); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule5219); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:36: (de= FIELD_NAME )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==FIELD_NAME) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:36: de= FIELD_NAME
							{
							de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule5223); 
							}
							break;

					}

					 env.addAlphaCut (gs, n, on, de); 
					}
					break;

				default :
					break loop84;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:539:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
			int alt87=5;
			switch ( input.LA(1) ) {
			case DEFUZZIFY:
				{
				alt87=1;
				}
				break;
			case DROPPING:
				{
				int LA87_2 = input.LA(2);
				if ( (LA87_2==ALL) ) {
					alt87=2;
				}
				else if ( (LA87_2==FUZZY) ) {
					alt87=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 87, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KEEPING:
				{
				int LA87_3 = input.LA(2);
				if ( (LA87_3==ALL) ) {
					alt87=3;
				}
				else if ( (LA87_3==FUZZY) ) {
					alt87=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 87, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:540:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule5261); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule5280); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule5282); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5284); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5286); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:542:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule5298); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule5300); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5302); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5304); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:543:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule5317); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5319); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5321); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5325); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:5: ( COMMA fs= ID )*
					loop85:
					while (true) {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==COMMA) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule5339); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5343); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop85;
						}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule5368); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5370); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5372); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5376); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:546:5: ( COMMA fs= ID )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==COMMA) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:546:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule5391); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5395); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop86;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:2: ( ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:3: ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule5436); 
			match(input,FIELDS,FOLLOW_FIELDS_in_addFieldsRule5438); 
			match(input,LBR,FOLLOW_LBR_in_addFieldsRule5465); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5473);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule5475); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5479);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:5: ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==COMMA) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:7: COMMA f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule5498); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5502);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule5504); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5508);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop88;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_addFieldsRule5526); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==DISTANCE||LA89_0==INCLUDED||LA89_0==INTERSECT||LA89_0==MEET||LA89_0==ORIENTATION) ) {
				alt89=1;
			}
			else if ( (LA89_0==APEX_VALUE||LA89_0==ARRAY_FUNCTION||LA89_0==BOOLEAN||LA89_0==DEGREE||(LA89_0 >= EXTENT && LA89_0 <= EXTRACT_ARRAY)||LA89_0==FIELD_NAME||LA89_0==FLOAT||(LA89_0 >= ID && LA89_0 <= IF_ERROR)||LA89_0==INT||LA89_0==LB||LA89_0==LP||(LA89_0 >= MEMBERSHIP_ARRAY && LA89_0 <= MEMBERSHIP_TO)||LA89_0==QUOTED_VALUE||LA89_0==TRANSLATE) ) {
				alt89=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}

			switch (alt89) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule5549);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:564:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule5564);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
			int alt94=5;
			switch ( input.LA(1) ) {
			case DISTANCE:
				{
				alt94=1;
				}
				break;
			case ORIENTATION:
				{
				alt94=2;
				}
				break;
			case INCLUDED:
				{
				alt94=3;
				}
				break;
			case MEET:
				{
				alt94=4;
				}
				break;
			case INTERSECT:
				{
				alt94=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule5603); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5605); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5609); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5611); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:25: (cp= comparatorRule n= numericRule )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==EQ||LA90_0==GE||LA90_0==GT||LA90_0==LE||LA90_0==LT||LA90_0==NEQ) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule5617);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5621);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule5645); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5647); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:21: (f= LEFT |f= RIGHT )
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==LEFT) ) {
						alt91=1;
					}
					else if ( (LA91_0==RIGHT) ) {
						alt91=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 91, 0, input);
						throw nvae;
					}

					switch (alt91) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5653); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5659); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:42: ( COMMA o= ID COLON d= numericRule )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==COMMA) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule5665); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5670); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule5672); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5676);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5681); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:576:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule5693); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5695); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:576:18: (i= LEFT |i= RIGHT )
					int alt93=2;
					int LA93_0 = input.LA(1);
					if ( (LA93_0==LEFT) ) {
						alt93=1;
					}
					else if ( (LA93_0==RIGHT) ) {
						alt93=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 93, 0, input);
						throw nvae;
					}

					switch (alt93) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:576:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5701); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:576:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5707); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5710); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:577:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule5742); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:578:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule5789); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:583:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:585:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule5852); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule5854); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule5856); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==KEEP) ) {
				alt99=1;
			}
			else if ( ((LA99_0 >= HOWINCLUDE && LA99_0 <= HOWMEET)||LA99_0==LEFT||LA99_0==RIGHT) ) {
				alt99=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}

			switch (alt99) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule5864); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:588:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					int alt96=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt96=1;
						}
						break;
					case LEFT:
						{
						alt96=2;
						}
						break;
					case RIGHT:
						{
						alt96=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);
						throw nvae;
					}
					switch (alt96) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:588:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule5901); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:7: ( resolvingRule[sfs] )?
							int alt95=2;
							int LA95_0 = input.LA(1);
							if ( (LA95_0==RESOLVING) ) {
								alt95=1;
							}
							switch (alt95) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5937);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:590:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule5955); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule5991); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6022);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:5: ( COMMA addFuzzySetRule[sfs] )*
					loop97:
					while (true) {
						int alt97=2;
						int LA97_0 = input.LA(1);
						if ( (LA97_0==COMMA) ) {
							alt97=1;
						}

						switch (alt97) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule6031); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6033);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop97;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:594:5: ( resolvingRule[sfs] )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==RESOLVING) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:594:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule6049);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:600:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule6076); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule6078); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:6: (t= AND |t= OR |t= FIRST |t= LAST )
			int alt100=4;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt100=1;
				}
				break;
			case OR:
				{
				alt100=2;
				}
				break;
			case FIRST:
				{
				alt100=3;
				}
				break;
			case LAST:
				{
				alt100=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule6090); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule6096); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule6102); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule6108); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
			int alt106=4;
			switch ( input.LA(1) ) {
			case LEFT:
			case RIGHT:
				{
				alt106=1;
				}
				break;
			case HOWINCLUDE:
				{
				alt106=2;
				}
				break;
			case HOWMEET:
				{
				alt106=3;
				}
				break;
			case HOWINTERSECT:
				{
				alt106=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:3: (s= LEFT |s= RIGHT )
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==LEFT) ) {
						alt101=1;
					}
					else if ( (LA101_0==RIGHT) ) {
						alt101=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 101, 0, input);
						throw nvae;
					}

					switch (alt101) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6140); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6146); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:4: ( ALL |fs= ID ( AS newFs= ID )? )
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==ALL) ) {
						alt103=1;
					}
					else if ( (LA103_0==ID) ) {
						alt103=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 103, 0, input);
						throw nvae;
					}

					switch (alt103) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule6157); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6193); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:12: ( AS newFs= ID )?
							int alt102=2;
							int LA102_0 = input.LA(1);
							if ( (LA102_0==AS) ) {
								alt102=1;
							}
							switch (alt102) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule6197); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6201); 
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:610:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule6232); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6236); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:610:22: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:610:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6242); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:610:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6248); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6252); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6254); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6258); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule6271); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6276); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:20: (s= LEFT |s= RIGHT )
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==LEFT) ) {
						alt105=1;
					}
					else if ( (LA105_0==RIGHT) ) {
						alt105=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 105, 0, input);
						throw nvae;
					}

					switch (alt105) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6282); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6288); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6292); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6295); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6299); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:612:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule6322); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6325); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6327); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6340); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6344); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:621:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule6368); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule6370); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:622:6: (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==ID) ) {
				alt109=1;
			}
			else if ( (LA109_0==FROM_WEB) ) {
				alt109=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:622:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule6382); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:622:16: ( AT db= ID )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==AT) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:622:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule6386); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule6390); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:623:8: FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM_WEB,FOLLOW_FROM_WEB_in_getCollectionRule6421); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:623:17: (url= APEX_VALUE |url= QUOTED_VALUE )
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==APEX_VALUE) ) {
						alt108=1;
					}
					else if ( (LA108_0==QUOTED_VALUE) ) {
						alt108=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 108, 0, input);
						throw nvae;
					}

					switch (alt108) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:623:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule6426); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:623:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule6432); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule6445); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:628:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:630:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule6466); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule6468); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6479); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule6481); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6485); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule6487); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6491); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule6520); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:639:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule6539); 
			match(input,AS,FOLLOW_AS_in_saveAsRule6541); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6551); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:12: ( AT db= ID )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==AT) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule6555); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6559); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule6579); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:1: lookupFromWebRule : LOOKUP FROM_WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:2: ( LOOKUP FROM_WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:647:3: LOOKUP FROM_WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule6595); 
			match(input,FROM_WEB,FOLLOW_FROM_WEB_in_lookupFromWebRule6597); 
				LookupFromWeb gfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:648:4: (fe= forEachRule )+
			int cnt111=0;
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==FOR) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:648:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule6613);
					fe=forEachRule();
					state._fsp--;

						gfw.addForEach (fe);	
					}
					break;

				default :
					if ( cnt111 >= 1 ) break loop111;
					EarlyExitException eee = new EarlyExitException(111, input);
					throw eee;
				}
				cnt111++;
			}

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule6626); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:653:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:654:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:655:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule6646); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule6648); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule6652);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule6657); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule6661);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:660:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:661:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule6684); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule6686); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6688); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6697);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule6701); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6705);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:664:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==ON) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:664:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule6717); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6719); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6723);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==SET) ) {
				int LA114_1 = input.LA(2);
				if ( (LA114_1==GEOMETRY) ) {
					alt114=1;
				}
			}
			switch (alt114) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule6755); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6757); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					int alt113=4;
					switch ( input.LA(1) ) {
					case INTERSECTION:
						{
						alt113=1;
						}
						break;
					case RIGHT:
						{
						alt113=2;
						}
						break;
					case LEFT:
						{
						alt113=3;
						}
						break;
					case ALL:
						{
						alt113=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 113, 0, input);
						throw nvae;
					}
					switch (alt113) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule6763); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule6769); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule6775); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule6781); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:7: ( addFieldsRule[jc] )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==ADD_ST) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule6801);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:7: (sfs= setFuzzySetsRule )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==SET) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6861);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:6: (cc= caseClauseRule |gs= generateSectionRule[true] )?
			int alt117=3;
			int LA117_0 = input.LA(1);
			if ( ((LA117_0 >= CASE && LA117_0 <= CASES)) ) {
				alt117=1;
			}
			else if ( (LA117_0==GENERATE) ) {
				alt117=2;
			}
			switch (alt117) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule6903);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:669:8: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_joinOfCollectionsRule6946);
					gs=generateSectionRule(true);
					state._fsp--;

						jc.setGenerateSection (gs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:670:7: ( REMOVE DUPLICATES )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==REMOVE) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:670:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule6984); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule6986); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule7027); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:675:1: filterRule : FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;
		GenerateSection gs =null;

			Filter f=null;	
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:3: ( FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:678:4: FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule7056); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:5: (fc= caseClauseRule |gs= generateSectionRule[true] )
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( ((LA119_0 >= CASE && LA119_0 <= CASES)) ) {
				alt119=1;
			}
			else if ( (LA119_0==GENERATE) ) {
				alt119=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}

			switch (alt119) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:7: fc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_filterRule7067);
					fc=caseClauseRule();
					state._fsp--;

					 f = env.addFilter (fc); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:680:7: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_filterRule7086);
					gs=generateSectionRule(true);
					state._fsp--;

						f = env.addFilter (gs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:681:7: ( REMOVE DUPLICATES )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==REMOVE) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:681:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule7105); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule7107); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule7128); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule7149); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:689:7: (p= groupPartitionRule )+
			int cnt121=0;
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==PARTITION) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:689:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule7174);
					p=groupPartitionRule();
					state._fsp--;

					 g.addPartition (p); 
					}
					break;

				default :
					if ( cnt121 >= 1 ) break loop121;
					EarlyExitException eee = new EarlyExitException(121, input);
					throw eee;
				}
				cnt121++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:690:7: (oth= othersRule )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==DROP||LA122_0==KEEP) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:690:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule7200);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule7224); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:695:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:696:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:697:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule7247); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule7251);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule7264); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7268);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:10: ( COMMA fr= fieldRefRule )*
			loop123:
			while (true) {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==COMMA) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule7293); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7297);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop123;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule7319); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7323);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:8: ( DROP GROUPING FIELDS )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==DROP) ) {
				int LA124_1 = input.LA(2);
				if ( (LA124_1==GROUPING) ) {
					alt124=1;
				}
			}
			switch (alt124) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule7344); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule7346); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule7348); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:702:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==ORDER) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:702:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule7370); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule7372); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule7376);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:703:9: ( COMMA sf= sortingFieldRule )*
					loop125:
					while (true) {
						int alt125=2;
						int LA125_0 = input.LA(1);
						if ( (LA125_0==COMMA) ) {
							alt125=1;
						}

						switch (alt125) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:703:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule7393); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule7397);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop125;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:704:6: ( KEEP UNCOMPARABLE )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( (LA126_0==KEEP) ) {
						int LA126_1 = input.LA(2);
						if ( (LA126_1==UNCOMPARABLE) ) {
							alt126=1;
						}
					}
					switch (alt126) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:704:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule7416); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule7418); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:706:7: (gs= generateSectionRule[false] )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==GENERATE) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:706:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule7449);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:710:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:711:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule7480);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule7484); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule7488); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:3: (v= VERSUS )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==VERSUS) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule7503); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:719:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule7532); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:720:7: (u= unpackRule )+
			int cnt130=0;
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==UNPACK) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:720:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule7556);
					u=unpackRule();
					state._fsp--;

					 e.addUnpack (u); 
					}
					break;

				default :
					if ( cnt130 >= 1 ) break loop130;
					EarlyExitException eee = new EarlyExitException(130, input);
					throw eee;
				}
				cnt130++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:7: (oth= othersRule )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==DROP||LA131_0==KEEP) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule7588);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule7612); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:726:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:727:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:728:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule7634); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule7639);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule7646); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7650);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule7657); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7661);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:734:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:6: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule7689); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule7691); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7705);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:9: ( COMMA cr= collectionReferenceRule )+
			int cnt132=0;
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==COMMA) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule7727); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7731);
					cr=collectionReferenceRule();
					state._fsp--;

					 mc.addCollection (cr); 
					}
					break;

				default :
					if ( cnt132 >= 1 ) break loop132;
					EarlyExitException eee = new EarlyExitException(132, input);
					throw eee;
				}
				cnt132++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:739:7: ( REMOVE DUPLICATES )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==REMOVE) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:739:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule7752); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule7754); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule7784); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:744:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:745:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule7804); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule7806); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7816);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule7818); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7822);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule7834); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:752:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:753:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule7856); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule7858); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7866);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule7868); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7872);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule7884); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:760:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:763:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule7911); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule7921); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:10: (d= ID |d= APEX_VALUE )
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==ID) ) {
				alt134=1;
			}
			else if ( (LA134_0==APEX_VALUE) ) {
				alt134=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}

			switch (alt134) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7926); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7932); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==AS) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule7956); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:13: (a= ID |a= APEX_VALUE )
					int alt135=2;
					int LA135_0 = input.LA(1);
					if ( (LA135_0==ID) ) {
						alt135=1;
					}
					else if ( (LA135_0==APEX_VALUE) ) {
						alt135=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 135, 0, input);
						throw nvae;
					}

					switch (alt135) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7961); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7967); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:768:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==COMMA) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:768:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule8048); 
					match(input,DB,FOLLOW_DB_in_useDbRule8050); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:768:20: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:768:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8055); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:768:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8061); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt139=2;
					int LA139_0 = input.LA(1);
					if ( (LA139_0==AS) ) {
						alt139=1;
					}
					switch (alt139) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule8084); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:21: (a= ID |a= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8089); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8095); 
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
					break loop140;
				}
			}

			match(input,ON,FOLLOW_ON_in_useDbRule8173); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==DEFAULT) ) {
				alt144=1;
			}
			else if ( (LA144_0==SERVER) ) {
				alt144=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}

			switch (alt144) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule8185); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule8187); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:774:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule8199); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:775:10: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:775:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8214); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:775:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8220); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt143=2;
					int LA143_0 = input.LA(1);
					if ( (LA143_0==APEX_VALUE||LA143_0==ID) ) {
						alt143=1;
					}
					switch (alt143) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:12: (d= ID |d= APEX_VALUE )
							int alt142=2;
							int LA142_0 = input.LA(1);
							if ( (LA142_0==ID) ) {
								alt142=1;
							}
							else if ( (LA142_0==APEX_VALUE) ) {
								alt142=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 142, 0, input);
								throw nvae;
							}

							switch (alt142) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8244); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8250); 
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

			match(input,SC,FOLLOW_SC_in_useDbRule8275); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:782:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:784:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule8300); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule8302); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8312);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule8314); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8318);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:7: (tp= trajectoryPartitionRule )+
			int cnt145=0;
			loop145:
			while (true) {
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==PARTITION) ) {
					alt145=1;
				}

				switch (alt145) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule8334);
					tp=trajectoryPartitionRule();
					state._fsp--;

					 tm.addPartition (tp); 
					}
					break;

				default :
					if ( cnt145 >= 1 ) break loop145;
					EarlyExitException eee = new EarlyExitException(145, input);
					throw eee;
				}
				cnt145++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:7: (oth= othersRule )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==DROP||LA146_0==KEEP) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule8374);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule8416); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:792:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:793:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule8444); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule8454);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:796:6: (tpm= partitionMatchingRule )+
			int cnt147=0;
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==MATCHING) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:796:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8475);
					tpm=partitionMatchingRule();
					state._fsp--;

					 tp.addPartitionMatching (tpm);  
					}
					break;

				default :
					if ( cnt147 >= 1 ) break loop147;
					EarlyExitException eee = new EarlyExitException(147, input);
					throw eee;
				}
				cnt147++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:800:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:801:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:802:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule8512); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8516);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule8523); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8527);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule8534); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule8536); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule8540); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule8543); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8547);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:6: ( WHERE wc= orConditionRule )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==WHERE) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule8562); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule8566);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule8590); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8594);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:807:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==ADDING) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:807:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule8617); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8621);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule8623); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule8625); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:808:6: ( MIN_SIMILARITY n= numericRule )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==MIN_SIMILARITY) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:808:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8647); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8651);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:814:1: parameterRule[ParamList pl, boolean check] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl, boolean check) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:815:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:816:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8699); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule8715); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8719); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:821:1: createJavaScriptFunctionRule : CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList(), false] ( COMMA p= parameterRule[jsf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:822:2: ( CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList(), false] ( COMMA p= parameterRule[jsf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:823:4: CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList(), false] ( COMMA p= parameterRule[jsf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaScriptFunctionRule8743); 
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8745); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8747); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule8755); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8789); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8799);
			p=parameterRule(jsf.getParamList(), false);
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:827:5: ( COMMA p= parameterRule[jsf.getParamList(), false] )*
			loop151:
			while (true) {
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==COMMA) ) {
					alt151=1;
				}

				switch (alt151) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:827:7: COMMA p= parameterRule[jsf.getParamList(), false]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule8822); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8826);
					p=parameterRule(jsf.getParamList(), false);
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop151;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:828:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==PRECONDITION) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:828:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8849); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8853);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule8869); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule8882); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule8888); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:1: createFuzzyOperatorRule : CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList(), true] ( COMMA p= parameterRule[fo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:852:3: ( CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList(), true] ( COMMA p= parameterRule[fo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:853:4: CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList(), true] ( COMMA p= parameterRule[fo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyOperatorRule8910); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyOperatorRule8912); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createFuzzyOperatorRule8914); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule8918); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8943); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8953);
			p=parameterRule(fo.getParamList(), true);
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:856:5: ( COMMA p= parameterRule[fo.getParamList(), true] )*
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==COMMA) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:856:7: COMMA p= parameterRule[fo.getParamList(), true]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8976); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8980);
					p=parameterRule(fo.getParamList(), true);
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop153;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:857:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==PRECONDITION) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:857:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule9005); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule9009);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule9024); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule9028);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==POLYLINE) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule9047); 
					match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule9050); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule9062); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9066);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule9068); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9072);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule9074); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:11: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt155=0;
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==COMMA) ) {
							alt155=1;
						}

						switch (alt155) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:13: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule9096); 
							match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule9098); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9102);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule9104); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule9108);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule9110); 
							 env.addFuzzyPolylinePoint (fo, x, y); 
							}
							break;

						default :
							if ( cnt155 >= 1 ) break loop155;
							EarlyExitException eee = new EarlyExitException(155, input);
							throw eee;
						}
						cnt155++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule9131); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule9138); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:868:1: createFuzzyEvaluatorRule : CREATE FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? ( feSortRule[fe] )? (f= feForAllRule[fe] |d= feDeriveRule[fe] )* EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyEvaluatorRule() throws RecognitionException {
		Token n=null;
		Condition pc =null;
		ForAllClause f =null;
		DeriveClause d =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:2: ( CREATE FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? ( feSortRule[fe] )? (f= feForAllRule[fe] |d= feDeriveRule[fe] )* EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:3: CREATE FUZZY EVALUATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? ( feSortRule[fe] )? (f= feForAllRule[fe] |d= feDeriveRule[fe] )* EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyEvaluatorRule9158); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyEvaluatorRule9160); 
			match(input,EVALUATOR,FOLLOW_EVALUATOR_in_createFuzzyEvaluatorRule9162); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyEvaluatorRule9166); 
			 FuzzyEvaluator fe = env.addFuzzyEvaluator (n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyEvaluatorRule9192); 
			pushFollow(FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9199);
			feParameterRule(fe);
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:5: ( COMMA feParameterRule[fe] )*
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==COMMA) ) {
					alt157=1;
				}

				switch (alt157) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:7: COMMA feParameterRule[fe]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9231); 
					pushFollow(FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9233);
					feParameterRule(fe);
					state._fsp--;

					}
					break;

				default :
					break loop157;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:4: ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==PRECONDITION) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:6: PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyEvaluatorRule9282); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyEvaluatorRule9286);
					pc=jfOrConditionRule(fe.getParamList(), false);
					state._fsp--;

					 fe.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:4: ( feSortRule[fe] )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==SORT) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:6: feSortRule[fe]
					{
					pushFollow(FOLLOW_feSortRule_in_createFuzzyEvaluatorRule9305);
					feSortRule(fe);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:4: (f= feForAllRule[fe] |d= feDeriveRule[fe] )*
			loop160:
			while (true) {
				int alt160=3;
				int LA160_0 = input.LA(1);
				if ( (LA160_0==FOR) ) {
					alt160=1;
				}
				else if ( (LA160_0==DERIVE) ) {
					alt160=2;
				}

				switch (alt160) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:6: f= feForAllRule[fe]
					{
					pushFollow(FOLLOW_feForAllRule_in_createFuzzyEvaluatorRule9359);
					f=feForAllRule(fe);
					state._fsp--;

					 fe.forAllDeriveList.add(f); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:6: d= feDeriveRule[fe]
					{
					pushFollow(FOLLOW_feDeriveRule_in_createFuzzyEvaluatorRule9394);
					d=feDeriveRule(fe);
					state._fsp--;

					 fe.forAllDeriveList.add(d); 
					}
					break;

				default :
					break loop160;
				}
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyEvaluatorRule9428); 
			pushFollow(FOLLOW_feExpressionRule_in_createFuzzyEvaluatorRule9432);
			e=feExpressionRule(fe, null);
			state._fsp--;

			 fe.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==POLYLINE) ) {
				alt162=1;
			}
			switch (alt162) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyEvaluatorRule9459); 
					match(input,LB,FOLLOW_LB_in_createFuzzyEvaluatorRule9461); 
					match(input,LP,FOLLOW_LP_in_createFuzzyEvaluatorRule9468); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9472);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9474); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9478);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyEvaluatorRule9480); 
					 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt161=0;
					loop161:
					while (true) {
						int alt161=2;
						int LA161_0 = input.LA(1);
						if ( (LA161_0==COMMA) ) {
							alt161=1;
						}

						switch (alt161) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:8: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9503); 
							match(input,LP,FOLLOW_LP_in_createFuzzyEvaluatorRule9505); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9509);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyEvaluatorRule9511); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyEvaluatorRule9515);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyEvaluatorRule9517); 
							 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
							}
							break;

						default :
							if ( cnt161 >= 1 ) break loop161;
							EarlyExitException eee = new EarlyExitException(161, input);
							throw eee;
						}
						cnt161++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyEvaluatorRule9537); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyEvaluatorRule9544); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:889:1: createFuzzyAggregatorRule : CREATE FUZZY AGGREGATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? ( feSortRule[fe] )? (f= feForAllRule[fe] |d= feDeriveRule[fe] )+ EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyAggregatorRule() throws RecognitionException {
		Token n=null;
		Condition pc =null;
		ForAllClause f =null;
		DeriveClause d =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:890:2: ( CREATE FUZZY AGGREGATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? ( feSortRule[fe] )? (f= feForAllRule[fe] |d= feDeriveRule[fe] )+ EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:891:3: CREATE FUZZY AGGREGATOR n= ID PARAMETERS feParameterRule[fe] ( COMMA feParameterRule[fe] )* ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )? ( feSortRule[fe] )? (f= feForAllRule[fe] |d= feDeriveRule[fe] )+ EVALUATE e= feExpressionRule[fe, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyAggregatorRule9562); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyAggregatorRule9564); 
			match(input,AGGREGATOR,FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule9566); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyAggregatorRule9570); 
			 FuzzyEvaluator fe = env.addFuzzyAggregator (n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule9596); 
			pushFollow(FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9603);
			feParameterRule(fe);
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:894:5: ( COMMA feParameterRule[fe] )*
			loop163:
			while (true) {
				int alt163=2;
				int LA163_0 = input.LA(1);
				if ( (LA163_0==COMMA) ) {
					alt163=1;
				}

				switch (alt163) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:894:7: COMMA feParameterRule[fe]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9635); 
					pushFollow(FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9637);
					feParameterRule(fe);
					state._fsp--;

					}
					break;

				default :
					break loop163;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:895:4: ( PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false] )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==PRECONDITION) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:895:6: PRECONDITION pc= jfOrConditionRule[fe.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule9686); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule9690);
					pc=jfOrConditionRule(fe.getParamList(), false);
					state._fsp--;

					 fe.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:896:4: ( feSortRule[fe] )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==SORT) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:896:6: feSortRule[fe]
					{
					pushFollow(FOLLOW_feSortRule_in_createFuzzyAggregatorRule9709);
					feSortRule(fe);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:897:4: (f= feForAllRule[fe] |d= feDeriveRule[fe] )+
			int cnt166=0;
			loop166:
			while (true) {
				int alt166=3;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==FOR) ) {
					alt166=1;
				}
				else if ( (LA166_0==DERIVE) ) {
					alt166=2;
				}

				switch (alt166) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:897:6: f= feForAllRule[fe]
					{
					pushFollow(FOLLOW_feForAllRule_in_createFuzzyAggregatorRule9763);
					f=feForAllRule(fe);
					state._fsp--;

					 fe.forAllDeriveList.add(f); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:898:6: d= feDeriveRule[fe]
					{
					pushFollow(FOLLOW_feDeriveRule_in_createFuzzyAggregatorRule9798);
					d=feDeriveRule(fe);
					state._fsp--;

					 fe.forAllDeriveList.add(d); 
					}
					break;

				default :
					if ( cnt166 >= 1 ) break loop166;
					EarlyExitException eee = new EarlyExitException(166, input);
					throw eee;
				}
				cnt166++;
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyAggregatorRule9832); 
			pushFollow(FOLLOW_feExpressionRule_in_createFuzzyAggregatorRule9836);
			e=feExpressionRule(fe, null);
			state._fsp--;

			 fe.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==POLYLINE) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyAggregatorRule9863); 
					match(input,LB,FOLLOW_LB_in_createFuzzyAggregatorRule9865); 
					match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule9872); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9876);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9878); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9882);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule9884); 
					 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:902:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt167=0;
					loop167:
					while (true) {
						int alt167=2;
						int LA167_0 = input.LA(1);
						if ( (LA167_0==COMMA) ) {
							alt167=1;
						}

						switch (alt167) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:902:8: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9907); 
							match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule9909); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9913);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9915); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9919);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule9921); 
							 env.addFuzzyEvaluatorPolylinePoint (fe, x, y); 
							}
							break;

						default :
							if ( cnt167 >= 1 ) break loop167;
							EarlyExitException eee = new EarlyExitException(167, input);
							throw eee;
						}
						cnt167++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyAggregatorRule9941); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyAggregatorRule9948); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:908:1: feForAllRule[FuzzyEvaluator fe] returns [ForAllClause fac] : FOR ALL v= ID IN ar= ID ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )? ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fe, fac] ( COMMA ac= aggSpecRule[fe, fac] )* ;
	public final ForAllClause feForAllRule(FuzzyEvaluator fe) throws RecognitionException {
		ForAllClause fac = null;


		Token v=null;
		Token ar=null;
		Token id=null;
		Expression x1 =null;
		Expression x2 =null;
		Expression e =null;
		AggregateClause ac =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:909:2: ( FOR ALL v= ID IN ar= ID ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )? ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fe, fac] ( COMMA ac= aggSpecRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:910:3: FOR ALL v= ID IN ar= ID ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )? ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fe, fac] ( COMMA ac= aggSpecRule[fe, fac] )*
			{
			match(input,FOR,FOLLOW_FOR_in_feForAllRule9970); 
			match(input,ALL,FOLLOW_ALL_in_feForAllRule9972); 
			v=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule9976); 
			match(input,IN,FOLLOW_IN_in_feForAllRule9978); 
			ar=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule9982); 
			 fac = env.createForAllClause(v, ar, fe);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:4: ( LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==LB) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:6: LB x1= feExpressionRule[fe, null] COMMA x2= feExpressionRule[fe, null] RB
					{
					match(input,LB,FOLLOW_LB_in_feForAllRule10007); 
					pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10012);
					x1=feExpressionRule(fe, null);
					state._fsp--;

					 fac.firstIndex = x1; 
					match(input,COMMA,FOLLOW_COMMA_in_feForAllRule10031); 
					pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10035);
					x2=feExpressionRule(fe, null);
					state._fsp--;

					match(input,RB,FOLLOW_RB_in_feForAllRule10039); 
					 fac.lastIndex  = x2; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:913:4: ( LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )* )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==LOCALLY) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:913:6: LOCALLY e= feExpressionRule[fe, fac] AS id= ID ( COMMA e= feExpressionRule[fe, fac] AS id= ID )*
					{
					match(input,LOCALLY,FOLLOW_LOCALLY_in_feForAllRule10069); 
					pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10073);
					e=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,AS,FOLLOW_AS_in_feForAllRule10077); 
					id=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule10081); 
					 env.createLocallyClause(fac, id, e, fe); 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:914:5: ( COMMA e= feExpressionRule[fe, fac] AS id= ID )*
					loop170:
					while (true) {
						int alt170=2;
						int LA170_0 = input.LA(1);
						if ( (LA170_0==COMMA) ) {
							alt170=1;
						}

						switch (alt170) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:914:7: COMMA e= feExpressionRule[fe, fac] AS id= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_feForAllRule10095); 
							pushFollow(FOLLOW_feExpressionRule_in_feForAllRule10099);
							e=feExpressionRule(fe, fac);
							state._fsp--;

							match(input,AS,FOLLOW_AS_in_feForAllRule10103); 
							id=(Token)match(input,ID,FOLLOW_ID_in_feForAllRule10107); 
							 env.createLocallyClause(fac, id, e, fe); 	
							}
							break;

						default :
							break loop170;
						}
					}

					}
					break;

			}

			match(input,AGGREGATE,FOLLOW_AGGREGATE_in_feForAllRule10123); 
			pushFollow(FOLLOW_aggSpecRule_in_feForAllRule10127);
			ac=aggSpecRule(fe, fac);
			state._fsp--;

			 fac.aggregate.add(ac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:4: ( COMMA ac= aggSpecRule[fe, fac] )*
			loop172:
			while (true) {
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==COMMA) ) {
					alt172=1;
				}

				switch (alt172) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:6: COMMA ac= aggSpecRule[fe, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_feForAllRule10146); 
					pushFollow(FOLLOW_aggSpecRule_in_feForAllRule10150);
					ac=aggSpecRule(fe, fac);
					state._fsp--;

					 fac.aggregate.add(ac);
					}
					break;

				default :
					break loop172;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:922:1: feDeriveRule[FuzzyEvaluator fe] returns [DeriveClause dc] : DERIVE (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] ) AS id= ID ;
	public final DeriveClause feDeriveRule(FuzzyEvaluator fe) throws RecognitionException {
		DeriveClause dc = null;


		Token id=null;
		Expression e =null;

			int dt = DeriveClause.DERIVE_SCALAR; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:924:2: ( DERIVE (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] ) AS id= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:925:3: DERIVE (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] ) AS id= ID
			{
			match(input,DERIVE,FOLLOW_DERIVE_in_feDeriveRule10211); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:925:10: (e= feExpressionRule[fe, null] |e= feCumulateRule[fe] )
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==ADD||LA173_0==APEX_VALUE||LA173_0==BOOLEAN||LA173_0==FLOAT||(LA173_0 >= ID && LA173_0 <= IF_ERROR)||LA173_0==INT||LA173_0==LP||LA173_0==POS||LA173_0==QUOTED_VALUE||LA173_0==SUB) ) {
				alt173=1;
			}
			else if ( (LA173_0==CUMULATE) ) {
				alt173=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 173, 0, input);
				throw nvae;
			}

			switch (alt173) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:925:12: e= feExpressionRule[fe, null]
					{
					pushFollow(FOLLOW_feExpressionRule_in_feDeriveRule10217);
					e=feExpressionRule(fe, null);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:926:9: e= feCumulateRule[fe]
					{
					pushFollow(FOLLOW_feCumulateRule_in_feDeriveRule10233);
					e=feCumulateRule(fe);
					state._fsp--;

					 dt = DeriveClause.DERIVE_ARRAY; 
					}
					break;

			}

			match(input,AS,FOLLOW_AS_in_feDeriveRule10250); 
			id=(Token)match(input,ID,FOLLOW_ID_in_feDeriveRule10254); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:1: feCumulateRule[FuzzyEvaluator fe] returns [Expression feExpr] : CUMULATE LP a= ID RP ;
	public final Expression feCumulateRule(FuzzyEvaluator fe) throws RecognitionException {
		Expression feExpr = null;


		Token a=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:2: ( CUMULATE LP a= ID RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:3: CUMULATE LP a= ID RP
			{
			match(input,CUMULATE,FOLLOW_CUMULATE_in_feCumulateRule10298); 
			match(input,LP,FOLLOW_LP_in_feCumulateRule10300); 
			a=(Token)match(input,ID,FOLLOW_ID_in_feCumulateRule10304); 
			match(input,RP,FOLLOW_RP_in_feCumulateRule10306); 
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



	// $ANTLR start "feSortRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:937:1: feSortRule[FuzzyEvaluator fe] : SORT s1= feArraySortRule[fe] ( COMMA s2= feArraySortRule[fe] )* ;
	public final void feSortRule(FuzzyEvaluator fe) throws RecognitionException {
		SortFuzzyEvaluatorArray s1 =null;
		SortFuzzyEvaluatorArray s2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:938:2: ( SORT s1= feArraySortRule[fe] ( COMMA s2= feArraySortRule[fe] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:939:3: SORT s1= feArraySortRule[fe] ( COMMA s2= feArraySortRule[fe] )*
			{
			match(input,SORT,FOLLOW_SORT_in_feSortRule10324); 
			pushFollow(FOLLOW_feArraySortRule_in_feSortRule10328);
			s1=feArraySortRule(fe);
			state._fsp--;

				fe.sortList.add(s1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:940:4: ( COMMA s2= feArraySortRule[fe] )*
			loop174:
			while (true) {
				int alt174=2;
				int LA174_0 = input.LA(1);
				if ( (LA174_0==COMMA) ) {
					alt174=1;
				}

				switch (alt174) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:940:6: COMMA s2= feArraySortRule[fe]
					{
					match(input,COMMA,FOLLOW_COMMA_in_feSortRule10341); 
					pushFollow(FOLLOW_feArraySortRule_in_feSortRule10345);
					s2=feArraySortRule(fe);
					state._fsp--;

						fe.sortList.add(s2); 
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
	}
	// $ANTLR end "feSortRule"



	// $ANTLR start "feArraySortRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:944:1: feArraySortRule[FuzzyEvaluator fe] returns [SortFuzzyEvaluatorArray sfea] : ( feArrayIndexRule[fe, sfea] BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS i1= ID | LP feArrayIndexRule[fe, sfea] ( COMMA feArrayIndexRule[fe, sfea] )+ RP BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS LP i2= ID ( COMMA i3= ID )+ RP ) ;
	public final SortFuzzyEvaluatorArray feArraySortRule(FuzzyEvaluator fe) throws RecognitionException {
		SortFuzzyEvaluatorArray sfea = null;


		Token i1=null;
		Token i2=null;
		Token i3=null;

		 sfea = new SortFuzzyEvaluatorArray (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:946:2: ( ( feArrayIndexRule[fe, sfea] BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS i1= ID | LP feArrayIndexRule[fe, sfea] ( COMMA feArrayIndexRule[fe, sfea] )+ RP BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS LP i2= ID ( COMMA i3= ID )+ RP ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:947:3: ( feArrayIndexRule[fe, sfea] BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS i1= ID | LP feArrayIndexRule[fe, sfea] ( COMMA feArrayIndexRule[fe, sfea] )+ RP BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS LP i2= ID ( COMMA i3= ID )+ RP )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:947:3: ( feArrayIndexRule[fe, sfea] BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS i1= ID | LP feArrayIndexRule[fe, sfea] ( COMMA feArrayIndexRule[fe, sfea] )+ RP BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS LP i2= ID ( COMMA i3= ID )+ RP )
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==ID) ) {
				alt179=1;
			}
			else if ( (LA179_0==LP) ) {
				alt179=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 179, 0, input);
				throw nvae;
			}

			switch (alt179) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:947:5: feArrayIndexRule[fe, sfea] BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS i1= ID
					{
					pushFollow(FOLLOW_feArrayIndexRule_in_feArraySortRule10378);
					feArrayIndexRule(fe, sfea);
					state._fsp--;

					match(input,BY,FOLLOW_BY_in_feArraySortRule10386); 
					pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10389);
					feSortFieldRule(fe, sfea);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:949:6: ( COMMA feSortFieldRule[fe, sfea] )*
					loop175:
					while (true) {
						int alt175=2;
						int LA175_0 = input.LA(1);
						if ( (LA175_0==COMMA) ) {
							alt175=1;
						}

						switch (alt175) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:949:8: COMMA feSortFieldRule[fe, sfea]
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10400); 
							pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10402);
							feSortFieldRule(fe, sfea);
							state._fsp--;

							}
							break;

						default :
							break loop175;
						}
					}

					match(input,AS,FOLLOW_AS_in_feArraySortRule10413); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_feArraySortRule10417); 
					 env.setFuzzyEvaluatorNewArray (fe, sfea, i1); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:951:5: LP feArrayIndexRule[fe, sfea] ( COMMA feArrayIndexRule[fe, sfea] )+ RP BY feSortFieldRule[fe, sfea] ( COMMA feSortFieldRule[fe, sfea] )* AS LP i2= ID ( COMMA i3= ID )+ RP
					{
					match(input,LP,FOLLOW_LP_in_feArraySortRule10443); 
					pushFollow(FOLLOW_feArrayIndexRule_in_feArraySortRule10445);
					feArrayIndexRule(fe, sfea);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:952:5: ( COMMA feArrayIndexRule[fe, sfea] )+
					int cnt176=0;
					loop176:
					while (true) {
						int alt176=2;
						int LA176_0 = input.LA(1);
						if ( (LA176_0==COMMA) ) {
							alt176=1;
						}

						switch (alt176) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:952:7: COMMA feArrayIndexRule[fe, sfea]
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10455); 
							pushFollow(FOLLOW_feArrayIndexRule_in_feArraySortRule10457);
							feArrayIndexRule(fe, sfea);
							state._fsp--;

							}
							break;

						default :
							if ( cnt176 >= 1 ) break loop176;
							EarlyExitException eee = new EarlyExitException(176, input);
							throw eee;
						}
						cnt176++;
					}

					match(input,RP,FOLLOW_RP_in_feArraySortRule10464); 
					match(input,BY,FOLLOW_BY_in_feArraySortRule10471); 
					pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10473);
					feSortFieldRule(fe, sfea);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:954:6: ( COMMA feSortFieldRule[fe, sfea] )*
					loop177:
					while (true) {
						int alt177=2;
						int LA177_0 = input.LA(1);
						if ( (LA177_0==COMMA) ) {
							alt177=1;
						}

						switch (alt177) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:954:8: COMMA feSortFieldRule[fe, sfea]
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10484); 
							pushFollow(FOLLOW_feSortFieldRule_in_feArraySortRule10486);
							feSortFieldRule(fe, sfea);
							state._fsp--;

							}
							break;

						default :
							break loop177;
						}
					}

					match(input,AS,FOLLOW_AS_in_feArraySortRule10497); 
					match(input,LP,FOLLOW_LP_in_feArraySortRule10499); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_feArraySortRule10503); 
					 env.setFuzzyEvaluatorNewArray (fe, sfea, i2); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:956:6: ( COMMA i3= ID )+
					int cnt178=0;
					loop178:
					while (true) {
						int alt178=2;
						int LA178_0 = input.LA(1);
						if ( (LA178_0==COMMA) ) {
							alt178=1;
						}

						switch (alt178) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:956:8: COMMA i3= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_feArraySortRule10531); 
							i3=(Token)match(input,ID,FOLLOW_ID_in_feArraySortRule10535); 
							 env.setFuzzyEvaluatorNewArray (fe, sfea, i3); 
							}
							break;

						default :
							if ( cnt178 >= 1 ) break loop178;
							EarlyExitException eee = new EarlyExitException(178, input);
							throw eee;
						}
						cnt178++;
					}

					match(input,RP,FOLLOW_RP_in_feArraySortRule10558); 
					}
					break;

			}

				env.checkFuzzyEvaluatorSortingList (sfea); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sfea;
	}
	// $ANTLR end "feArraySortRule"



	// $ANTLR start "feArrayIndexRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:960:1: feArrayIndexRule[FuzzyEvaluator fe, SortFuzzyEvaluatorArray sfea] : i= ID IN a= ID ;
	public final void feArrayIndexRule(FuzzyEvaluator fe, SortFuzzyEvaluatorArray sfea) throws RecognitionException {
		Token i=null;
		Token a=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:961:2: (i= ID IN a= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:962:3: i= ID IN a= ID
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_feArrayIndexRule10605); 
			match(input,IN,FOLLOW_IN_in_feArrayIndexRule10607); 
			a=(Token)match(input,ID,FOLLOW_ID_in_feArrayIndexRule10611); 
			 env.addFuzzyEvaluatorSortingArray (fe, sfea, i, a); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:1: feSortFieldRule[FuzzyEvaluator fe, SortFuzzyEvaluatorArray sfea] : i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )? ;
	public final void feSortFieldRule(FuzzyEvaluator fe, SortFuzzyEvaluatorArray sfea) throws RecognitionException {
		Token i=null;
		Token t=null;
		Token v=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:2: (i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:3: i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )?
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_feSortFieldRule10639); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:8: (f= fieldRefRule )?
			int alt180=2;
			int LA180_0 = input.LA(1);
			if ( (LA180_0==FIELD_NAME) ) {
				alt180=1;
			}
			switch (alt180) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:9: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_feSortFieldRule10644);
					f=fieldRefRule();
					state._fsp--;

					}
					break;

			}

			match(input,TYPE,FOLLOW_TYPE_in_feSortFieldRule10657); 
			t=(Token)match(input,ID,FOLLOW_ID_in_feSortFieldRule10661); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:969:3: (v= VERSUS )?
			int alt181=2;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==VERSUS) ) {
				alt181=1;
			}
			switch (alt181) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:969:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_feSortFieldRule10670); 
					}
					break;

			}

			 env.addFuzzyEvaluatorSortingField (fe, sfea, i, f, t, v); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:973:1: aggSpecRule[FuzzyEvaluator fe, ForAllClause fac] returns [AggregateClause ac] : (wt= withSpec )? e= feExpressionRule[fe, fac] AS a= ID ;
	public final AggregateClause aggSpecRule(FuzzyEvaluator fe, ForAllClause fac) throws RecognitionException {
		AggregateClause ac = null;


		Token a=null;
		String wt =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:2: ( (wt= withSpec )? e= feExpressionRule[fe, fac] AS a= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:3: (wt= withSpec )? e= feExpressionRule[fe, fac] AS a= ID
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:3: (wt= withSpec )?
			int alt182=2;
			int LA182_0 = input.LA(1);
			if ( (LA182_0==WITH) ) {
				alt182=1;
			}
			switch (alt182) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:5: wt= withSpec
					{
					pushFollow(FOLLOW_withSpec_in_aggSpecRule10711);
					wt=withSpec();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_feExpressionRule_in_aggSpecRule10721);
			e=feExpressionRule(fe, fac);
			state._fsp--;

			match(input,AS,FOLLOW_AS_in_aggSpecRule10728); 
			a=(Token)match(input,ID,FOLLOW_ID_in_aggSpecRule10732); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:980:1: withSpec returns [String s] : WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM ) ;
	public final String withSpec() throws RecognitionException {
		String s = null;


		Token x=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:981:2: ( WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:982:4: WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM )
			{
			match(input,WITH,FOLLOW_WITH_in_withSpec10765); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:982:9: (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM )
			int alt183=4;
			switch ( input.LA(1) ) {
			case SUM:
				{
				alt183=1;
				}
				break;
			case PRODUCT:
				{
				alt183=2;
				}
				break;
			case MINIMUM:
				{
				alt183=3;
				}
				break;
			case MAXIMUM:
				{
				alt183=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 183, 0, input);
				throw nvae;
			}
			switch (alt183) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:982:11: x= SUM
					{
					x=(Token)match(input,SUM,FOLLOW_SUM_in_withSpec10771); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:9: x= PRODUCT
					{
					x=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_withSpec10784); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:984:9: x= MINIMUM
					{
					x=(Token)match(input,MINIMUM,FOLLOW_MINIMUM_in_withSpec10797); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:985:9: x= MAXIMUM
					{
					x=(Token)match(input,MAXIMUM,FOLLOW_MAXIMUM_in_withSpec10810); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:989:1: feParameterRule[FuzzyEvaluator fe] : p= ID TYPE (t= ID |t= ARRAY ) ;
	public final void feParameterRule(FuzzyEvaluator fe) throws RecognitionException {
		Token p=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:990:2: (p= ID TYPE (t= ID |t= ARRAY ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:3: p= ID TYPE (t= ID |t= ARRAY )
			{
			p=(Token)match(input,ID,FOLLOW_ID_in_feParameterRule10843); 
			match(input,TYPE,FOLLOW_TYPE_in_feParameterRule10862); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:8: (t= ID |t= ARRAY )
			int alt184=2;
			int LA184_0 = input.LA(1);
			if ( (LA184_0==ID) ) {
				alt184=1;
			}
			else if ( (LA184_0==ARRAY) ) {
				alt184=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 184, 0, input);
				throw nvae;
			}

			switch (alt184) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:9: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_feParameterRule10867); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:16: t= ARRAY
					{
					t=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_feParameterRule10873); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:998:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:999:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1000:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule10911);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1001:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop185:
			while (true) {
				int alt185=2;
				int LA185_0 = input.LA(1);
				if ( (LA185_0==OR) ) {
					alt185=1;
				}

				switch (alt185) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1001:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule10928); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule10932);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop185;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1007:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1008:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1009:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule10998);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1010:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop186:
			while (true) {
				int alt186=2;
				int LA186_0 = input.LA(1);
				if ( (LA186_0==AND) ) {
					alt186=1;
				}

				switch (alt186) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1010:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule11016); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule11020);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop186;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1015:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1016:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1017:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1017:5: (not= NOT )?
			int alt187=2;
			int LA187_0 = input.LA(1);
			if ( (LA187_0==NOT) ) {
				alt187=1;
			}
			switch (alt187) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1017:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule11088); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule11099);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1023:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1024:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1025:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule11137);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1026:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt188=3;
			int LA188_0 = input.LA(1);
			if ( (LA188_0==EQ||LA188_0==GE||LA188_0==GT||LA188_0==LE||LA188_0==LT||LA188_0==NEQ) ) {
				alt188=1;
			}
			else if ( (LA188_0==INRANGE) ) {
				alt188=2;
			}
			switch (alt188) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1026:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule11157);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1027:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule11177);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1031:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1032:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1033:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule11224);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule11233);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1038:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1040:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1041:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1041:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt190=2;
			int LA190_0 = input.LA(1);
			if ( (LA190_0==APEX_VALUE||LA190_0==FLOAT||LA190_0==ID||LA190_0==INT||LA190_0==LP||LA190_0==QUOTED_VALUE) ) {
				alt190=1;
			}
			else if ( (LA190_0==ADD||LA190_0==SUB) ) {
				alt190=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 190, 0, input);
				throw nvae;
			}

			switch (alt190) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1041:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule11275);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1042:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1042:6: (s= ADD |s= SUB )
					int alt189=2;
					int LA189_0 = input.LA(1);
					if ( (LA189_0==ADD) ) {
						alt189=1;
					}
					else if ( (LA189_0==SUB) ) {
						alt189=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 189, 0, input);
						throw nvae;
					}

					switch (alt189) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1042:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule11298); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1042:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule11304); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule11309);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1043:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop192:
			while (true) {
				int alt192=2;
				int LA192_0 = input.LA(1);
				if ( (LA192_0==ADD||LA192_0==SUB) ) {
					alt192=1;
				}

				switch (alt192) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1043:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1043:7: (s= ADD |s= SUB )
					int alt191=2;
					int LA191_0 = input.LA(1);
					if ( (LA191_0==ADD) ) {
						alt191=1;
					}
					else if ( (LA191_0==SUB) ) {
						alt191=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 191, 0, input);
						throw nvae;
					}

					switch (alt191) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1043:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule11327); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1043:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule11333); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule11338);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop192;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1047:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1049:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1050:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule11378);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop194:
			while (true) {
				int alt194=2;
				int LA194_0 = input.LA(1);
				if ( (LA194_0==DIV||LA194_0==MUL) ) {
					alt194=1;
				}

				switch (alt194) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:7: (s= MUL |s= DIV )
					int alt193=2;
					int LA193_0 = input.LA(1);
					if ( (LA193_0==MUL) ) {
						alt193=1;
					}
					else if ( (LA193_0==DIV) ) {
						alt193=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 193, 0, input);
						throw nvae;
					}

					switch (alt193) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule11403); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule11409); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule11414);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop194;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1055:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )? ;
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1056:3: ( ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:4: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:4: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt197=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt197=1;
				}
				break;
			case INT:
				{
				alt197=2;
				}
				break;
			case FLOAT:
				{
				alt197=3;
				}
				break;
			case APEX_VALUE:
				{
				alt197=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt197=5;
				}
				break;
			case ID:
				{
				alt197=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 197, 0, input);
				throw nvae;
			}
			switch (alt197) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:6: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule11455); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule11459);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule11463); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule11483); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1059:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule11521); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule11558); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1061:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule11592); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1062:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule11625); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt196=2;
					int LA196_0 = input.LA(1);
					if ( (LA196_0==LP) ) {
						alt196=1;
					}
					switch (alt196) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:8: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule11665); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:14: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt195=2;
							int LA195_0 = input.LA(1);
							if ( (LA195_0==ADD||LA195_0==APEX_VALUE||LA195_0==FLOAT||LA195_0==ID||LA195_0==INT||LA195_0==LP||LA195_0==QUOTED_VALUE||LA195_0==SUB) ) {
								alt195=1;
							}
							switch (alt195) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:15: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule11670);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule11676); 
							}
							break;

					}

					 expr = env.checkJFFactor(x, p1, fp, pl, jsCaller); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:4: ( EXP e= jfFactorRule[pl, jsCaller] )?
			int alt198=2;
			int LA198_0 = input.LA(1);
			if ( (LA198_0==EXP) ) {
				alt198=1;
			}
			switch (alt198) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:6: EXP e= jfFactorRule[pl, jsCaller]
					{
					match(input,EXP,FOLLOW_EXP_in_jfFactorRule11703); 
					pushFollow(FOLLOW_jfFactorRule_in_jfFactorRule11707);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1069:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1072:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11761);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop199:
			while (true) {
				int alt199=2;
				int LA199_0 = input.LA(1);
				if ( (LA199_0==COMMA) ) {
					alt199=1;
				}

				switch (alt199) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule11781); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11785);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop199;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1079:1: feExpressionRule[FuzzyEvaluator fe, ForAllClause fac] returns [Expression expr] : (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] ) ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )* ;
	public final Expression feExpressionRule(FuzzyEvaluator fe, ForAllClause fac) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1081:3: ( (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] ) ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1082:4: (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] ) ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1082:4: (t= feTermRule[fe, fac] | (s= ADD |s= SUB ) t= feTermRule[fe, fac] )
			int alt201=2;
			int LA201_0 = input.LA(1);
			if ( (LA201_0==APEX_VALUE||LA201_0==BOOLEAN||LA201_0==FLOAT||(LA201_0 >= ID && LA201_0 <= IF_ERROR)||LA201_0==INT||LA201_0==LP||LA201_0==POS||LA201_0==QUOTED_VALUE) ) {
				alt201=1;
			}
			else if ( (LA201_0==ADD||LA201_0==SUB) ) {
				alt201=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 201, 0, input);
				throw nvae;
			}

			switch (alt201) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1082:6: t= feTermRule[fe, fac]
					{
					pushFollow(FOLLOW_feTermRule_in_feExpressionRule11833);
					t=feTermRule(fe, fac);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1083:6: (s= ADD |s= SUB ) t= feTermRule[fe, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1083:6: (s= ADD |s= SUB )
					int alt200=2;
					int LA200_0 = input.LA(1);
					if ( (LA200_0==ADD) ) {
						alt200=1;
					}
					else if ( (LA200_0==SUB) ) {
						alt200=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 200, 0, input);
						throw nvae;
					}

					switch (alt200) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1083:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_feExpressionRule11855); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1083:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_feExpressionRule11861); 
							}
							break;

					}

					pushFollow(FOLLOW_feTermRule_in_feExpressionRule11866);
					t=feTermRule(fe, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1084:5: ( (s= ADD |s= SUB ) t= feTermRule[fe, fac] )*
			loop203:
			while (true) {
				int alt203=2;
				int LA203_0 = input.LA(1);
				if ( (LA203_0==ADD||LA203_0==SUB) ) {
					alt203=1;
				}

				switch (alt203) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1084:7: (s= ADD |s= SUB ) t= feTermRule[fe, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1084:7: (s= ADD |s= SUB )
					int alt202=2;
					int LA202_0 = input.LA(1);
					if ( (LA202_0==ADD) ) {
						alt202=1;
					}
					else if ( (LA202_0==SUB) ) {
						alt202=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 202, 0, input);
						throw nvae;
					}

					switch (alt202) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1084:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_feExpressionRule11883); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1084:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_feExpressionRule11889); 
							}
							break;

					}

					pushFollow(FOLLOW_feTermRule_in_feExpressionRule11894);
					t=feTermRule(fe, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop203;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1087:1: feTermRule[FuzzyEvaluator fe, ForAllClause fac] returns [ExpressionTerm et] : f= feFactorRule[fe, fac] ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )* ;
	public final ExpressionTerm feTermRule(FuzzyEvaluator fe, ForAllClause fac) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1089:3: (f= feFactorRule[fe, fac] ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:4: f= feFactorRule[fe, fac] ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )*
			{
			pushFollow(FOLLOW_feFactorRule_in_feTermRule11933);
			f=feFactorRule(fe, fac);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:5: ( (s= MUL |s= DIV ) f= feFactorRule[fe, fac] )*
			loop205:
			while (true) {
				int alt205=2;
				int LA205_0 = input.LA(1);
				if ( (LA205_0==DIV||LA205_0==MUL) ) {
					alt205=1;
				}

				switch (alt205) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:7: (s= MUL |s= DIV ) f= feFactorRule[fe, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:7: (s= MUL |s= DIV )
					int alt204=2;
					int LA204_0 = input.LA(1);
					if ( (LA204_0==MUL) ) {
						alt204=1;
					}
					else if ( (LA204_0==DIV) ) {
						alt204=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 204, 0, input);
						throw nvae;
					}

					switch (alt204) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_feTermRule11958); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_feTermRule11964); 
							}
							break;

					}

					pushFollow(FOLLOW_feFactorRule_in_feTermRule11969);
					f=feFactorRule(fe, fac);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop205;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1096:1: feFactorRule[FuzzyEvaluator fe, ForAllClause fac] returns [ExpressionFactor expr] : ( LP op= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? ) ( EXP exp= feFactorRule[fe, fac] )? ;
	public final ExpressionFactor feFactorRule(FuzzyEvaluator fe, ForAllClause fac) throws RecognitionException {
		ExpressionFactor expr = null;


		Token p=null;
		Token x=null;
		Expression op =null;
		Value vl =null;
		Expression e =null;
		Value v =null;
		ArrayReference ref =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor exp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1097:3: ( ( LP op= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? ) ( EXP exp= feFactorRule[fe, fac] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1098:4: ( LP op= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? ) ( EXP exp= feFactorRule[fe, fac] )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1098:4: ( LP op= feExpressionRule[fe, fac] RP |vl= valueRule |p= POS | IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP |x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )? )
			int alt207=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt207=1;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt207=2;
				}
				break;
			case POS:
				{
				alt207=3;
				}
				break;
			case IF_ERROR:
				{
				alt207=4;
				}
				break;
			case ID:
				{
				alt207=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 207, 0, input);
				throw nvae;
			}
			switch (alt207) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1098:6: LP op= feExpressionRule[fe, fac] RP
					{
					match(input,LP,FOLLOW_LP_in_feFactorRule12009); 
					pushFollow(FOLLOW_feExpressionRule_in_feFactorRule12013);
					op=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_feFactorRule12017); 
					 expr = new ExpressionFactor (op); 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_feFactorRule12058);
					vl=valueRule();
					state._fsp--;

						expr = new ExpressionFactor (vl);		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:6: p= POS
					{
					p=(Token)match(input,POS,FOLLOW_POS_in_feFactorRule12110); 
					 expr = env.getPosFactor (fac, p); 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:5: IF_ERROR LP e= feExpressionRule[fe, fac] COMMA v= valueRule RP
					{
					match(input,IF_ERROR,FOLLOW_IF_ERROR_in_feFactorRule12163); 
					match(input,LP,FOLLOW_LP_in_feFactorRule12233); 
					pushFollow(FOLLOW_feExpressionRule_in_feFactorRule12237);
					e=feExpressionRule(fe, fac);
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_feFactorRule12241); 
					pushFollow(FOLLOW_valueRule_in_feFactorRule12245);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_feFactorRule12247); 
						expr = env.buildIfError (e, v); 		
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1103:6: x= ID (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_feFactorRule12258); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1103:11: (ref= feArrayRefRule[x, fe, fac] | LP fp= feFunctionParamsRule[fe, fac] RP )?
					int alt206=3;
					int LA206_0 = input.LA(1);
					if ( (LA206_0==LB) ) {
						alt206=1;
					}
					else if ( (LA206_0==LP) ) {
						alt206=2;
					}
					switch (alt206) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1103:13: ref= feArrayRefRule[x, fe, fac]
							{
							pushFollow(FOLLOW_feArrayRefRule_in_feFactorRule12264);
							ref=feArrayRefRule(x, fe, fac);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1104:10: LP fp= feFunctionParamsRule[fe, fac] RP
							{
							match(input,LP,FOLLOW_LP_in_feFactorRule12325); 
							pushFollow(FOLLOW_feFunctionParamsRule_in_feFactorRule12329);
							fp=feFunctionParamsRule(fe, fac);
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_feFactorRule12333); 
							}
							break;

					}

					 expr = env.setFuzzyEvaluatorExprFromArrayRef(x, fp, ref, fe, fac);
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:4: ( EXP exp= feFactorRule[fe, fac] )?
			int alt208=2;
			int LA208_0 = input.LA(1);
			if ( (LA208_0==EXP) ) {
				alt208=1;
			}
			switch (alt208) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:6: EXP exp= feFactorRule[fe, fac]
					{
					match(input,EXP,FOLLOW_EXP_in_feFactorRule12356); 
					pushFollow(FOLLOW_feFactorRule_in_feFactorRule12360);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1110:1: feFunctionParamsRule[FuzzyEvaluator fe, ForAllClause fac] returns [ArrayList<Expression> params] : e= feExpressionRule[fe, fac] ( COMMA e= feExpressionRule[fe, fac] )* ;
	public final ArrayList<Expression> feFunctionParamsRule(FuzzyEvaluator fe, ForAllClause fac) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1112:3: (e= feExpressionRule[fe, fac] ( COMMA e= feExpressionRule[fe, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1113:4: e= feExpressionRule[fe, fac] ( COMMA e= feExpressionRule[fe, fac] )*
			{
			pushFollow(FOLLOW_feExpressionRule_in_feFunctionParamsRule12442);
			e=feExpressionRule(fe, fac);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1114:6: ( COMMA e= feExpressionRule[fe, fac] )*
			loop209:
			while (true) {
				int alt209=2;
				int LA209_0 = input.LA(1);
				if ( (LA209_0==COMMA) ) {
					alt209=1;
				}

				switch (alt209) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1114:8: COMMA e= feExpressionRule[fe, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_feFunctionParamsRule12463); 
					pushFollow(FOLLOW_feExpressionRule_in_feFunctionParamsRule12467);
					e=feExpressionRule(fe, fac);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop209;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1118:1: feArrayRefRule[Token id, FuzzyEvaluator fe, ForAllClause fac] returns [ArrayReference ref] : LB (e= feExpressionRule[fe, fac] ) RB (f= fieldRefRule )? ;
	public final ArrayReference feArrayRefRule(Token id, FuzzyEvaluator fe, ForAllClause fac) throws RecognitionException {
		ArrayReference ref = null;


		Expression e =null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1119:2: ( LB (e= feExpressionRule[fe, fac] ) RB (f= fieldRefRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1120:3: LB (e= feExpressionRule[fe, fac] ) RB (f= fieldRefRule )?
			{
			match(input,LB,FOLLOW_LB_in_feArrayRefRule12501); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1120:6: (e= feExpressionRule[fe, fac] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1120:7: e= feExpressionRule[fe, fac]
			{
			pushFollow(FOLLOW_feExpressionRule_in_feArrayRefRule12506);
			e=feExpressionRule(fe, fac);
			state._fsp--;

			}

			match(input,RB,FOLLOW_RB_in_feArrayRefRule12511); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1121:3: (f= fieldRefRule )?
			int alt210=2;
			int LA210_0 = input.LA(1);
			if ( (LA210_0==FIELD_NAME) ) {
				alt210=1;
			}
			switch (alt210) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1121:4: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_feArrayRefRule12521);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1129:1: createFuzzySetModelRule : CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC ;
	public final void createFuzzySetModelRule() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token n=null;
		Expression e =null;
		Condition c =null;
		FuzzyOperatorDefinition fo =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1129:24: ( CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1130:3: CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzySetModelRule12541); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzySetModelRule12543); 
			match(input,SET,FOLLOW_SET_in_createFuzzySetModelRule12545); 
			match(input,MODEL,FOLLOW_MODEL_in_createFuzzySetModelRule12547); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12551); 
			 FuzzySetModel fm = env.addFuzzySetModel (t);	
			match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetModelRule12561); 
			p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12567); 
			 env.addDegreeType(fm, p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1132:6: ( COMMA p= ID )*
			loop211:
			while (true) {
				int alt211=2;
				int LA211_0 = input.LA(1);
				if ( (LA211_0==COMMA) ) {
					alt211=1;
				}

				switch (alt211) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1132:8: COMMA p= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetModelRule12587); 
					p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12591); 
					 env.addDegreeType(fm, p); 
					}
					break;

				default :
					break loop211;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1133:4: ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )?
			int alt213=2;
			int LA213_0 = input.LA(1);
			if ( (LA213_0==DERIVED) ) {
				alt213=1;
			}
			switch (alt213) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1133:6: DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )*
					{
					match(input,DERIVED,FOLLOW_DERIVED_in_createFuzzySetModelRule12617); 
					match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetModelRule12619); 
					n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12623); 
					 env.checkDerivedDegree(fm, n);  
					match(input,AS,FOLLOW_AS_in_createFuzzySetModelRule12636); 
					pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetModelRule12640);
					e=ftExpressionRule(fm.getDegreesList());
					state._fsp--;

					 env.addDerivedDegree(fm, n, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1135:6: ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )*
					loop212:
					while (true) {
						int alt212=2;
						int LA212_0 = input.LA(1);
						if ( (LA212_0==COMMA) ) {
							alt212=1;
						}

						switch (alt212) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1135:8: COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()]
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetModelRule12654); 
							n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule12661); 
							 env.checkDerivedDegree(fm, n);  
							match(input,AS,FOLLOW_AS_in_createFuzzySetModelRule12685); 
							pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetModelRule12689);
							e=ftExpressionRule(fm.getDegreesList());
							state._fsp--;

							 env.addDerivedDegree(fm, n, e); 
							}
							break;

						default :
							break loop212;
						}
					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1138:4: ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )?
			int alt214=2;
			int LA214_0 = input.LA(1);
			if ( (LA214_0==CONSTRAINT) ) {
				alt214=1;
			}
			switch (alt214) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1138:6: CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false]
					{
					match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_createFuzzySetModelRule12708); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzySetModelRule12712);
					c=jfOrConditionRule(fm.getAllDegreesList(), false);
					state._fsp--;

					 fm.constraint=c; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:4: (fo= fuzzyOperatorDefinitionRule[fm] )*
			loop215:
			while (true) {
				int alt215=2;
				int LA215_0 = input.LA(1);
				if ( (LA215_0==OPERATOR) ) {
					alt215=1;
				}

				switch (alt215) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:6: fo= fuzzyOperatorDefinitionRule[fm]
					{
					pushFollow(FOLLOW_fuzzyOperatorDefinitionRule_in_createFuzzySetModelRule12731);
					fo=fuzzyOperatorDefinitionRule(fm);
					state._fsp--;

					}
					break;

				default :
					break loop215;
				}
			}

			match(input,SC,FOLLOW_SC_in_createFuzzySetModelRule12739); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1143:1: fuzzyOperatorDefinitionRule[FuzzySetModel fm] returns [FuzzyOperatorDefinition defOp] : OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+ ;
	public final FuzzyOperatorDefinition fuzzyOperatorDefinitionRule(FuzzySetModel fm) throws RecognitionException {
		FuzzyOperatorDefinition defOp = null;


		Token o=null;
		Token x=null;
		Expression exp =null;

		 defOp = new FuzzyOperatorDefinition(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:49: ( OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1145:2: OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+
			{
			match(input,OPERATOR,FOLLOW_OPERATOR_in_fuzzyOperatorDefinitionRule12760); 
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1146:2: ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+
			int cnt216=0;
			loop216:
			while (true) {
				int alt216=2;
				int LA216_0 = input.LA(1);
				if ( (LA216_0==EVALUATE) ) {
					alt216=1;
				}

				switch (alt216) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1146:4: EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot]
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_fuzzyOperatorDefinitionRule12800); 
					x=(Token)match(input,ID,FOLLOW_ID_in_fuzzyOperatorDefinitionRule12804); 
					match(input,AS,FOLLOW_AS_in_fuzzyOperatorDefinitionRule12806); 
						env.checkOperatorDegree(defOp, x, fm);	
					pushFollow(FOLLOW_ftConditionExpressionRule_in_fuzzyOperatorDefinitionRule12838);
					exp=ftConditionExpressionRule(fm.getDegreesList(), isNot);
					state._fsp--;

						env.addOperatorDegree(defOp, x, exp);	
					}
					break;

				default :
					if ( cnt216 >= 1 ) break loop216;
					EarlyExitException eee = new EarlyExitException(216, input);
					throw eee;
				}
				cnt216++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:1: createGenericFuzzySetOperatorRule : CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList(), true] ( COMMA p= parameterRule[gfo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:34: ( CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList(), true] ( COMMA p= parameterRule[gfo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1152:3: CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList(), true] ( COMMA p= parameterRule[gfo.getParamList(), true] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule12899); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule12903); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule12905); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule12907); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule12911); 
			 GenericFuzzyOperator gfo = env.addGenericFuzzyOperator(t, n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule12932); 
			pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12936);
			p=parameterRule(gfo.getParamList(), true);
			state._fsp--;

			 gfo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1154:4: ( COMMA p= parameterRule[gfo.getParamList(), true] )*
			loop217:
			while (true) {
				int alt217=2;
				int LA217_0 = input.LA(1);
				if ( (LA217_0==COMMA) ) {
					alt217=1;
				}

				switch (alt217) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1154:6: COMMA p= parameterRule[gfo.getParamList(), true]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12953); 
					pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12958);
					p=parameterRule(gfo.getParamList(), true);
					state._fsp--;

					 gfo.parameters.add (p); 
					}
					break;

				default :
					break loop217;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1155:3: ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )?
			int alt218=2;
			int LA218_0 = input.LA(1);
			if ( (LA218_0==PRECONDITION) ) {
				alt218=1;
			}
			switch (alt218) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1155:5: PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule12978); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule12982);
					pc=jfOrConditionRule(gfo.getParamList(), false);
					state._fsp--;

					 gfo.precondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1156:3: ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+
			int cnt221=0;
			loop221:
			while (true) {
				int alt221=2;
				int LA221_0 = input.LA(1);
				if ( (LA221_0==EVALUATE) ) {
					alt221=1;
				}

				switch (alt221) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1156:5: EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule12998); 
					g=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule13002); 
					 Parameter ev = env.createFgoParameter (g); 
					match(input,AS,FOLLOW_AS_in_createGenericFuzzySetOperatorRule13036); 
					pushFollow(FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule13040);
					e=jfExpressionRule(gfo.getParamList(), false);
					state._fsp--;

					 FuzzyPolyline fp = env.manageEvaluate(gfo, ev, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					int alt220=2;
					int LA220_0 = input.LA(1);
					if ( (LA220_0==POLYLINE) ) {
						alt220=1;
					}
					switch (alt220) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1159:5: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
							{
							match(input,POLYLINE,FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule13063); 
							match(input,LB,FOLLOW_LB_in_createGenericFuzzySetOperatorRule13065); 
							match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule13078); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13082);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13084); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13088);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule13090); 
							 env.addFuzzyPolylinePoint (fp, x, y); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1161:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
							int cnt219=0;
							loop219:
							while (true) {
								int alt219=2;
								int LA219_0 = input.LA(1);
								if ( (LA219_0==COMMA) ) {
									alt219=1;
								}

								switch (alt219) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1161:8: COMMA LP x= numericRule COMMA y= numericRule RP
									{
									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13112); 
									match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule13114); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13118);
									x=numericRule();
									state._fsp--;

									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13120); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13124);
									y=numericRule();
									state._fsp--;

									match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule13126); 
									 env.addFuzzyPolylinePoint (fp, x, y); 
									}
									break;

								default :
									if ( cnt219 >= 1 ) break loop219;
									EarlyExitException eee = new EarlyExitException(219, input);
									throw eee;
								}
								cnt219++;
							}

							match(input,RB,FOLLOW_RB_in_createGenericFuzzySetOperatorRule13145); 
							}
							break;

					}

					 gfo.polylines.add(fp); 
					}
					break;

				default :
					if ( cnt221 >= 1 ) break loop221;
					EarlyExitException eee = new EarlyExitException(221, input);
					throw eee;
				}
				cnt221++;
			}

			match(input,SC,FOLLOW_SC_in_createGenericFuzzySetOperatorRule13209); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1171:1: ftExpressionRule[ParamList pl] returns [Expression expr] : (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* ;
	public final Expression ftExpressionRule(ParamList pl) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1173:3: ( (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1174:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1174:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] )
			int alt223=2;
			int LA223_0 = input.LA(1);
			if ( (LA223_0==ARRAY_FUNCTION||LA223_0==DEGREE||(LA223_0 >= EXTENT && LA223_0 <= EXTRACT_ARRAY)||LA223_0==FLOAT||(LA223_0 >= ID && LA223_0 <= IF_ERROR)||LA223_0==INT||LA223_0==LP||(LA223_0 >= MEMBERSHIP_ARRAY && LA223_0 <= MEMBERSHIP_TO)||LA223_0==TRANSLATE) ) {
				alt223=1;
			}
			else if ( (LA223_0==ADD||LA223_0==SUB) ) {
				alt223=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 223, 0, input);
				throw nvae;
			}

			switch (alt223) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1174:6: t= ftTermRule[pl]
					{
					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule13243);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1175:6: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1175:6: (s= ADD |s= SUB )
					int alt222=2;
					int LA222_0 = input.LA(1);
					if ( (LA222_0==ADD) ) {
						alt222=1;
					}
					else if ( (LA222_0==SUB) ) {
						alt222=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 222, 0, input);
						throw nvae;
					}

					switch (alt222) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1175:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule13265); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1175:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule13271); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule13276);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1176:5: ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			loop225:
			while (true) {
				int alt225=2;
				int LA225_0 = input.LA(1);
				if ( (LA225_0==ADD||LA225_0==SUB) ) {
					alt225=1;
				}

				switch (alt225) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1176:7: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1176:7: (s= ADD |s= SUB )
					int alt224=2;
					int LA224_0 = input.LA(1);
					if ( (LA224_0==ADD) ) {
						alt224=1;
					}
					else if ( (LA224_0==SUB) ) {
						alt224=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 224, 0, input);
						throw nvae;
					}

					switch (alt224) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1176:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule13293); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1176:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule13299); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule13304);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop225;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1179:1: ftTermRule[ParamList pl] returns [ExpressionTerm et] : f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* ;
	public final ExpressionTerm ftTermRule(ParamList pl) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:3: (f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:4: f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			{
			pushFollow(FOLLOW_ftFactorRule_in_ftTermRule13341);
			f=ftFactorRule(pl);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:5: ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			loop227:
			while (true) {
				int alt227=2;
				int LA227_0 = input.LA(1);
				if ( (LA227_0==DIV||LA227_0==MUL) ) {
					alt227=1;
				}

				switch (alt227) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:7: (s= MUL |s= DIV ) f= ftFactorRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:7: (s= MUL |s= DIV )
					int alt226=2;
					int LA226_0 = input.LA(1);
					if ( (LA226_0==MUL) ) {
						alt226=1;
					}
					else if ( (LA226_0==DIV) ) {
						alt226=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 226, 0, input);
						throw nvae;
					}

					switch (alt226) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftTermRule13366); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftTermRule13372); 
							}
							break;

					}

					pushFollow(FOLLOW_ftFactorRule_in_ftTermRule13377);
					f=ftFactorRule(pl);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop227;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1186:1: ftFactorRule[ParamList pl] returns [ExpressionFactor ef] : ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule );
	public final ExpressionFactor ftFactorRule(ParamList pl) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1186:57: ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule )
			int alt229=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt229=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt229=2;
				}
				break;
			case ID:
				{
				int LA229_4 = input.LA(2);
				if ( (LA229_4==LP) ) {
					alt229=4;
				}
				else if ( (LA229_4==ADD||LA229_4==COMMA||LA229_4==CONSTRAINT||LA229_4==DIV||LA229_4==MUL||LA229_4==OPERATOR||LA229_4==RP||LA229_4==SC||LA229_4==SUB) ) {
					alt229=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 229, 4, input);
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
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt229=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 229, 0, input);
				throw nvae;
			}
			switch (alt229) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1187:5: LP op= ftExpressionRule[pl] RP
					{
					match(input,LP,FOLLOW_LP_in_ftFactorRule13409); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFactorRule13413);
					op=ftExpressionRule(pl);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftFactorRule13416); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1188:6: vl= ftValueRule
					{
					pushFollow(FOLLOW_ftValueRule_in_ftFactorRule13436);
					vl=ftValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1189:6: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule13463); 
					 ef = env.checkDegree(pl,x);	 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:6: x= ID LP (fp= ftFunctionParamsRule[pl] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule13495); 
					match(input,LP,FOLLOW_LP_in_ftFactorRule13497); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:14: (fp= ftFunctionParamsRule[pl] )?
					int alt228=2;
					int LA228_0 = input.LA(1);
					if ( (LA228_0==ADD||LA228_0==ARRAY_FUNCTION||LA228_0==DEGREE||(LA228_0 >= EXTENT && LA228_0 <= EXTRACT_ARRAY)||LA228_0==FLOAT||(LA228_0 >= ID && LA228_0 <= IF_ERROR)||LA228_0==INT||LA228_0==LP||(LA228_0 >= MEMBERSHIP_ARRAY && LA228_0 <= MEMBERSHIP_TO)||LA228_0==SUB||LA228_0==TRANSLATE) ) {
						alt228=1;
					}
					switch (alt228) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:15: fp= ftFunctionParamsRule[pl]
							{
							pushFollow(FOLLOW_ftFunctionParamsRule_in_ftFactorRule13502);
							fp=ftFunctionParamsRule(pl);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftFactorRule13507); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1191:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_ftFactorRule13522);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1194:1: ftValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1194:31: (n= INT |f= FLOAT )
			int alt230=2;
			int LA230_0 = input.LA(1);
			if ( (LA230_0==INT) ) {
				alt230=1;
			}
			else if ( (LA230_0==FLOAT) ) {
				alt230=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 230, 0, input);
				throw nvae;
			}

			switch (alt230) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1195:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftValueRule13547); 
					 vl = new Value (Value.INT, n.getText());   
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1196:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftValueRule13567); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1199:1: ftFunctionParamsRule[ParamList pl] returns [ArrayList<Expression> params] : e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* ;
	public final ArrayList<Expression> ftFunctionParamsRule(ParamList pl) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1201:3: (e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1202:4: e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )*
			{
			pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13603);
			e=ftExpressionRule(pl);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1203:6: ( COMMA e= ftExpressionRule[pl] )*
			loop231:
			while (true) {
				int alt231=2;
				int LA231_0 = input.LA(1);
				if ( (LA231_0==COMMA) ) {
					alt231=1;
				}

				switch (alt231) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1203:8: COMMA e= ftExpressionRule[pl]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftFunctionParamsRule13624); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13628);
					e=ftExpressionRule(pl);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop231;
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



	// $ANTLR start "ftConditionExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1209:1: ftConditionExpressionRule[ParamList pl, boolean isNot] returns [Expression expr] : (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* ;
	public final Expression ftConditionExpressionRule(ParamList pl, boolean isNot) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1211:4: ( (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1212:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1212:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )
			int alt233=2;
			int LA233_0 = input.LA(1);
			if ( (LA233_0==ARRAY_FUNCTION||LA233_0==DEGREE||(LA233_0 >= EXTENT && LA233_0 <= EXTRACT_ARRAY)||LA233_0==FLOAT||(LA233_0 >= ID && LA233_0 <= IF_ERROR)||LA233_0==INT||LA233_0==LP||(LA233_0 >= MEMBERSHIP_ARRAY && LA233_0 <= MEMBERSHIP_TO)||LA233_0==TRANSLATE) ) {
				alt233=1;
			}
			else if ( (LA233_0==ADD||LA233_0==SUB) ) {
				alt233=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 233, 0, input);
				throw nvae;
			}

			switch (alt233) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1212:6: t= ftConditionTermRule[pl,isNot]
					{
					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule13678);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:6: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:6: (s= ADD |s= SUB )
					int alt232=2;
					int LA232_0 = input.LA(1);
					if ( (LA232_0==ADD) ) {
						alt232=1;
					}
					else if ( (LA232_0==SUB) ) {
						alt232=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 232, 0, input);
						throw nvae;
					}

					switch (alt232) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule13702); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule13708); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule13713);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:5: ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			loop235:
			while (true) {
				int alt235=2;
				int LA235_0 = input.LA(1);
				if ( (LA235_0==ADD||LA235_0==SUB) ) {
					alt235=1;
				}

				switch (alt235) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:7: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:7: (s= ADD |s= SUB )
					int alt234=2;
					int LA234_0 = input.LA(1);
					if ( (LA234_0==ADD) ) {
						alt234=1;
					}
					else if ( (LA234_0==SUB) ) {
						alt234=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 234, 0, input);
						throw nvae;
					}

					switch (alt234) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule13732); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule13738); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule13743);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop235;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1218:1: ftConditionTermRule[ParamList pl, boolean isNot] returns [ExpressionTerm et] : f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* ;
	public final ExpressionTerm ftConditionTermRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1220:4: (f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1221:4: f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule13778);
			f=ftConditionFactorRule(pl, isNot);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:5: ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			loop237:
			while (true) {
				int alt237=2;
				int LA237_0 = input.LA(1);
				if ( (LA237_0==DIV||LA237_0==MUL) ) {
					alt237=1;
				}

				switch (alt237) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:7: (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:7: (s= MUL |s= DIV )
					int alt236=2;
					int LA236_0 = input.LA(1);
					if ( (LA236_0==MUL) ) {
						alt236=1;
					}
					else if ( (LA236_0==DIV) ) {
						alt236=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 236, 0, input);
						throw nvae;
					}

					switch (alt236) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftConditionTermRule13795); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftConditionTermRule13801); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule13806);
					f=ftConditionFactorRule(pl, isNot);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop237;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1225:1: ftConditionFactorRule[ParamList pl, boolean isNot] returns [ExpressionFactor ef] : ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= specialFunctionRule );
	public final ExpressionFactor ftConditionFactorRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Token f=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1226:5: ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= specialFunctionRule )
			int alt239=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt239=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt239=2;
				}
				break;
			case ID:
				{
				int LA239_4 = input.LA(2);
				if ( (LA239_4==FIELD_NAME) ) {
					alt239=3;
				}
				else if ( (LA239_4==LP) ) {
					alt239=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 239, 4, input);
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
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt239=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 239, 0, input);
				throw nvae;
			}
			switch (alt239) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1227:5: LP op= ftConditionExpressionRule[pl,isNot] RP
					{
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule13836); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule13840);
					op=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule13843); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1228:6: vl= ftConditionValueRule
					{
					pushFollow(FOLLOW_ftConditionValueRule_in_ftConditionFactorRule13861);
					vl=ftConditionValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1229:6: x= ID f= FIELD_NAME
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule13890); 
					f=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_ftConditionFactorRule13894); 
					 ef = env.makeExpDegree(x, f, isNot, pl); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1230:6: x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule13925); 
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule13927); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1230:14: (fp= ftConditionFunctionParamsRule[pl,isNot] )?
					int alt238=2;
					int LA238_0 = input.LA(1);
					if ( (LA238_0==ADD||LA238_0==ARRAY_FUNCTION||LA238_0==DEGREE||(LA238_0 >= EXTENT && LA238_0 <= EXTRACT_ARRAY)||LA238_0==FLOAT||(LA238_0 >= ID && LA238_0 <= IF_ERROR)||LA238_0==INT||LA238_0==LP||(LA238_0 >= MEMBERSHIP_ARRAY && LA238_0 <= MEMBERSHIP_TO)||LA238_0==SUB||LA238_0==TRANSLATE) ) {
						alt238=1;
					}
					switch (alt238) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1230:15: fp= ftConditionFunctionParamsRule[pl,isNot]
							{
							pushFollow(FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule13932);
							fp=ftConditionFunctionParamsRule(pl, isNot);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule13937); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1231:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_ftConditionFactorRule13950);
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
	// $ANTLR end "ftConditionFactorRule"



	// $ANTLR start "ftConditionValueRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1235:1: ftConditionValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftConditionValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1236:5: (n= INT |f= FLOAT )
			int alt240=2;
			int LA240_0 = input.LA(1);
			if ( (LA240_0==INT) ) {
				alt240=1;
			}
			else if ( (LA240_0==FLOAT) ) {
				alt240=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 240, 0, input);
				throw nvae;
			}

			switch (alt240) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1237:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftConditionValueRule13996); 
					 vl = new Value (Value.INT, n.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1238:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftConditionValueRule14016); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1241:1: ftConditionFunctionParamsRule[ParamList pl, boolean isNot] returns [ArrayList<Expression> params] : e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* ;
	public final ArrayList<Expression> ftConditionFunctionParamsRule(ParamList pl, boolean isNot) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1243:3: (e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1244:4: e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14054);
			e=ftConditionExpressionRule(pl, isNot);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1245:6: ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			loop241:
			while (true) {
				int alt241=2;
				int LA241_0 = input.LA(1);
				if ( (LA241_0==COMMA) ) {
					alt241=1;
				}

				switch (alt241) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1245:8: COMMA e= ftConditionExpressionRule[pl,isNot]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftConditionFunctionParamsRule14073); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14077);
					e=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop241;
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



	// $ANTLR start "createJavaFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1256:1: createJavaFunctionRule : CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList(), false] ( COMMA p= parameterRule[jf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC ;
	public final void createJavaFunctionRule() throws RecognitionException {
		Token jfn=null;
		Token cl=null;
		Token imp=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1257:2: ( CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList(), false] ( COMMA p= parameterRule[jf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1258:4: CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList(), false] ( COMMA p= parameterRule[jf.getParamList(), false] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaFunctionRule14113); 
			match(input,JAVA,FOLLOW_JAVA_in_createJavaFunctionRule14115); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaFunctionRule14117); 
			jfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule14125); 
			 JavaFunction jf = env.addJavaFunction (jfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaFunctionRule14158); 
			pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule14168);
			p=parameterRule(jf.getParamList(), false);
			state._fsp--;

			 jf.parameters.add (p); 					
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1262:5: ( COMMA p= parameterRule[jf.getParamList(), false] )*
			loop242:
			while (true) {
				int alt242=2;
				int LA242_0 = input.LA(1);
				if ( (LA242_0==COMMA) ) {
					alt242=1;
				}

				switch (alt242) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1262:7: COMMA p= parameterRule[jf.getParamList(), false]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaFunctionRule14190); 
					pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule14194);
					p=parameterRule(jf.getParamList(), false);
					state._fsp--;

					 jf.parameters.add (p);					
					}
					break;

				default :
					break loop242;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1263:4: ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )?
			int alt243=2;
			int LA243_0 = input.LA(1);
			if ( (LA243_0==PRECONDITION) ) {
				alt243=1;
			}
			switch (alt243) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1263:6: PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaFunctionRule14214); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaFunctionRule14218);
					pc=jfOrConditionRule(jf.getParamList(), true);
					state._fsp--;

						jf.preCondition = pc; 					
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule14232); 
			cl=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule14236); 
				jf.setClass (cl.getText());		
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1265:4: ( IMPORT imp= QUOTED_VALUE )?
			int alt244=2;
			int LA244_0 = input.LA(1);
			if ( (LA244_0==IMPORT) ) {
				alt244=1;
			}
			switch (alt244) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1265:6: IMPORT imp= QUOTED_VALUE
					{
					match(input,IMPORT,FOLLOW_IMPORT_in_createJavaFunctionRule14271); 
					imp=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule14275); 
						jf.setImport (imp.getText()); 	
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule14305); 
			match(input,BODY,FOLLOW_BODY_in_createJavaFunctionRule14307); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaFunctionRule14320); 
			match(input,SC,FOLLOW_SC_in_createJavaFunctionRule14326); 
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



	public static final BitSet FOLLOW_getCollectionRule_in_start69 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_saveAsRule_in_start95 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start128 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_filterRule_in_start150 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_groupRule_in_start183 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_expandRule_in_start217 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start250 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start273 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start292 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_useDbRule_in_start312 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start346 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start365 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start380 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start392 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start410 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_createFuzzyAggregatorRule_in_start428 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_createFuzzySetModelRule_in_start444 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_createGenericFuzzySetOperatorRule_in_start459 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_createJavaFunctionRule_in_start469 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_createFuzzyEvaluatorRule_in_start484 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_test_in_start498 = new BitSet(new long[]{0x0800000200000000L,0x0040400810003002L,0x0004010410080000L});
	public static final BitSet FOLLOW_EOF_in_start534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_test547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule571 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule585 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule689 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule754 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule779 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule820 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule834 = new BitSet(new long[]{0x300000400008A000L,0x0030830008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule1005 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000001L,0x0000000200000040L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule1023 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1029 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule1057 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1135 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_dropGeometryRule1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_dropGeometryRule1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASES_in_caseClauseRule1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1271 = new BitSet(new long[]{0x0004000000000002L,0x0000001000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_DROP_in_othersRule1359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1395 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1461 = new BitSet(new long[]{0x0008002002100402L,0x0000002000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1478 = new BitSet(new long[]{0x0008002002100402L,0x0000002000000000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1495 = new BitSet(new long[]{0x0008002000100402L,0x0000002000000000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1526 = new BitSet(new long[]{0x0008002000100002L,0x0000002000000000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1564 = new BitSet(new long[]{0x0008002000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1584 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_dropGeometryRule_in_generateSectionRule1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1678 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1739 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1755 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1759 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1821 = new BitSet(new long[]{0x700000400008A010L,0x0030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1877 = new BitSet(new long[]{0x0080000000000002L,0x0801040004008200L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule1966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule2015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule2071 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule2080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule2109 = new BitSet(new long[]{0x0000000000000000L,0x0000810000000000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule2115 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_LP_in_inRangeRule2121 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2131 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule2133 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000042000L});
	public static final BitSet FOLLOW_RP_in_inRangeRule2146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule2152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule2191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2320 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2354 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2418 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2440 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2478 = new BitSet(new long[]{0x0000000000004000L,0x0000000000080801L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2526 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2553 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2599 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2622 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2628 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2633 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2651 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2657 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2662 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2700 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2723 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_DIV_in_termRule2729 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2734 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2767 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_factorRule2773 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2797 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2824 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2852 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2854 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808041000L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_factorRule2863 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2880 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LB_in_factorRule2912 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_factorRule_in_factorRule2916 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_factorRule2943 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_factorRule_in_factorRule2947 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_factorRule2986 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_factorRule2999 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_factorRule_in_factorRule3003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule3054 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENT_in_specialFunctionRule3094 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEGREE_in_specialFunctionRule3139 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000040000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_specialFunctionRule3155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_ARRAY_in_specialFunctionRule3183 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3186 = new BitSet(new long[]{0x0000000000000200L,0x0000010000080000L});
	public static final BitSet FOLLOW_ALL_in_specialFunctionRule3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_specialFunctionRule3270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_specialFunctionRule3274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LB_in_specialFunctionRule3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3303 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3347 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_specialFunctionRule3390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTRACT_ARRAY_in_specialFunctionRule3403 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_specialFunctionRule3411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_specialFunctionRule3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_specialFunctionRule3417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule3428 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3434 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3438 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3440 = new BitSet(new long[]{0x0000000000082000L,0x0000000008000008L,0x0000000000001000L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule3444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule3457 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3463 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3467 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3473 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3493 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule3497 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3518 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule3523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule3529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule3551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule3605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule3625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule3644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule3661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule3675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3703 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3743 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3772 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule3793 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3797 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3812 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3816 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule3840 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule3852 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3880 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3886 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3912 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule3944 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3971 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3994 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule4032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4067 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule4090 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule4096 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4101 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule4119 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule4125 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4130 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule4168 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule4191 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule4197 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule4202 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule4236 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule4240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule4242 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule4260 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule4287 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule4315 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule4317 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808041000L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule4322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule4326 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule4345 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LB_in_restrictedFactorRule4376 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4380 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_restrictedFactorRule4402 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4406 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_restrictedFactorRule4440 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_restrictedFactorRule4452 = new BitSet(new long[]{0x300000400008A000L,0x0030810008180009L,0x0000000800001000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule4511 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule4529 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule4533 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule4577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule4587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule4597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule4607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule4617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule4667 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000008L});
	public static final BitSet FOLLOW_SUB_in_numericRule4673 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000008L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule4686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule4692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080100L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4736 = new BitSet(new long[]{0x0000000000000000L,0x1000800000280000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4741 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule4789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080100L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4804 = new BitSet(new long[]{0x0000000000000000L,0x1000800000280000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4808 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule4855 = new BitSet(new long[]{0x0000000000000000L,0x1000800000280000L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4859 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4921 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule4937 = new BitSet(new long[]{0x0000000000000000L,0x1000800000280000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4941 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule5003 = new BitSet(new long[]{0x0000000000000000L,0x0000800000280000L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule5015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule5047 = new BitSet(new long[]{0x0000000000000000L,0x1000800000280000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule5051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule5053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule5075 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule5078 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808041000L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule5083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule5087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule5112 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule5114 = new BitSet(new long[]{0x0000000000000000L,0x1000800000280000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule5122 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule5124 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule5128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule5136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule5152 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule5157 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule5159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule5163 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule5167 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule5209 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule5213 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule5215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule5219 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule5223 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule5261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule5280 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule5282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule5298 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule5300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule5317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5325 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule5339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5343 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule5368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5376 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule5391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5395 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule5436 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_addFieldsRule5438 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LBR_in_addFieldsRule5465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5473 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5475 = new BitSet(new long[]{0x300040400008A000L,0x0038810019180009L,0x0000000800001004L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5479 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5502 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5504 = new BitSet(new long[]{0x300040400008A000L,0x0038810019180009L,0x0000000800001004L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5508 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBR_in_addFieldsRule5526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule5549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule5564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule5603 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5611 = new BitSet(new long[]{0x0080000000000002L,0x0801040000008200L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule5617 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule5645 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5647 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5653 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5659 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule5665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5670 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule5672 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule5693 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5695 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule5742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule5789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule5852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule5854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule5856 = new BitSet(new long[]{0x0000000000000000L,0x0000081000070000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule5864 = new BitSet(new long[]{0x0000000000000200L,0x0000080000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule5901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule5955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule5991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6022 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule6031 = new BitSet(new long[]{0x0000000000000000L,0x0000080000070000L,0x0000000000020000L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule6033 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule6049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule6076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule6078 = new BitSet(new long[]{0x0000000000000800L,0x0000008000000004L,0x0000000000000001L});
	public static final BitSet FOLLOW_AND_in_resolvingRule6090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule6096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule6102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule6108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6140 = new BitSet(new long[]{0x0000000000000200L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6146 = new BitSet(new long[]{0x0000000000000200L,0x0000000000080000L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule6157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6193 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule6232 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6236 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6252 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule6271 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6276 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6292 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule6322 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6327 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule6368 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule6370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080040L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule6382 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule6386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule6390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_FROM_WEB_in_getCollectionRule6421 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule6426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule6432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule6445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule6466 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule6468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6479 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule6481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6485 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule6487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule6520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule6539 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule6541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6551 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_AT_in_saveAsRule6555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_saveAsRule6579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule6595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FROM_WEB_in_lookupFromWebRule6597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule6613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule6626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule6646 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule6648 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule6652 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule6657 = new BitSet(new long[]{0x300000400008A010L,0x0030810008180009L,0x0000000808001000L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule6661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule6684 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule6686 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6697 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule6701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6705 = new BitSet(new long[]{0x0000000001800040L,0x4000000000000400L,0x0000000000908000L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule6717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6719 = new BitSet(new long[]{0x0000400000000000L,0x0008000011000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6723 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000000908000L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule6755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6757 = new BitSet(new long[]{0x0000000000000200L,0x0000080020000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule6763 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000000908000L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule6769 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000000908000L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule6775 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000000908000L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule6781 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000400L,0x0000000000908000L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule6801 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000400L,0x0000000000908000L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6861 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000400L,0x0000000000108000L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule6903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000108000L});
	public static final BitSet FOLLOW_generateSectionRule_in_joinOfCollectionsRule6946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000108000L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule6984 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule6986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule7027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule7056 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000400L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule7067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000108000L});
	public static final BitSet FOLLOW_generateSectionRule_in_filterRule7086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000108000L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule7105 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule7107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_filterRule7128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule7149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule7174 = new BitSet(new long[]{0x0004000000000000L,0x0000001000000000L,0x0000000000100020L});
	public static final BitSet FOLLOW_othersRule_in_groupRule7200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_groupRule7224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule7247 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule7251 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule7264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7268 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule7293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7297 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule7319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7323 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000400L,0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule7344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule7346 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule7348 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule7370 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule7372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule7376 = new BitSet(new long[]{0x0000000040000002L,0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule7393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule7397 = new BitSet(new long[]{0x0000000040000002L,0x0000001000000400L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule7416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule7418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule7449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule7480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule7484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule7488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule7503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule7532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule7556 = new BitSet(new long[]{0x0004000000000000L,0x0000001000000000L,0x0000008000100000L});
	public static final BitSet FOLLOW_othersRule_in_expandRule7588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_expandRule7612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule7634 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule7639 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule7646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TO_in_unpackRule7657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule7689 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule7691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7705 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule7727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7731 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000108000L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule7752 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule7754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule7784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule7804 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule7806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7816 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule7818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule7834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule7856 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule7858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7866 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule7868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule7884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule7911 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7921 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7926 = new BitSet(new long[]{0x0000000040010000L,0x4000000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7932 = new BitSet(new long[]{0x0000000040010000L,0x4000000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7956 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7961 = new BitSet(new long[]{0x0000000040000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7967 = new BitSet(new long[]{0x0000000040000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule8048 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule8050 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8055 = new BitSet(new long[]{0x0000000040010000L,0x4000000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8061 = new BitSet(new long[]{0x0000000040010000L,0x4000000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule8084 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8089 = new BitSet(new long[]{0x0000000040000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8095 = new BitSet(new long[]{0x0000000040000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_ON_in_useDbRule8173 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule8185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule8187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule8199 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8214 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L,0x0000000000100000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8220 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_useDbRule8275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule8300 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule8302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8312 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule8314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule8334 = new BitSet(new long[]{0x0004000000000000L,0x0000001000000000L,0x0000000000100020L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule8374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule8416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule8444 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule8454 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8475 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule8512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule8523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule8534 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule8536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule8540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule8543 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8547 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule8562 = new BitSet(new long[]{0x700000400008A010L,0x1030814008180009L,0x0000E04808001000L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule8566 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule8590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8594 = new BitSet(new long[]{0x0000000000000022L,0x0100000000000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule8617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule8623 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule8625 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8647 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule8699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule8715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_parameterRule8719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaScriptFunctionRule8743 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule8755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8799 = new BitSet(new long[]{0x0000000040040000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule8822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8826 = new BitSet(new long[]{0x0000000040040000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8849 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8853 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule8869 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule8882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule8888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyOperatorRule8910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyOperatorRule8912 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_OPERATOR_in_createFuzzyOperatorRule8914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule8918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8953 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8980 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule9005 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule9009 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule9024 = new BitSet(new long[]{0x0000000000002010L,0x0000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule9028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule9047 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule9050 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule9062 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9066 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule9068 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule9074 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule9096 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule9098 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9102 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule9104 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule9108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule9110 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule9131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule9138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyEvaluatorRule9158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyEvaluatorRule9160 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_EVALUATOR_in_createFuzzyEvaluatorRule9162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyEvaluatorRule9166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyEvaluatorRule9192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9199 = new BitSet(new long[]{0x0100010040000000L,0x0000000000000010L,0x0000000004000200L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyEvaluatorRule9233 = new BitSet(new long[]{0x0100010040000000L,0x0000000000000010L,0x0000000004000200L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyEvaluatorRule9282 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyEvaluatorRule9286 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L,0x0000000004000000L});
	public static final BitSet FOLLOW_feSortRule_in_createFuzzyEvaluatorRule9305 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_feForAllRule_in_createFuzzyEvaluatorRule9359 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_feDeriveRule_in_createFuzzyEvaluatorRule9394 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyEvaluatorRule9428 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_createFuzzyEvaluatorRule9432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyEvaluatorRule9459 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyEvaluatorRule9461 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyEvaluatorRule9468 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9472 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9474 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyEvaluatorRule9480 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9503 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyEvaluatorRule9505 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9509 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyEvaluatorRule9511 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyEvaluatorRule9515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyEvaluatorRule9517 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyEvaluatorRule9537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyEvaluatorRule9544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyAggregatorRule9562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyAggregatorRule9564 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule9566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyAggregatorRule9570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule9596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9603 = new BitSet(new long[]{0x0000010040000000L,0x0000000000000010L,0x0000000004000200L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feParameterRule_in_createFuzzyAggregatorRule9637 = new BitSet(new long[]{0x0000010040000000L,0x0000000000000010L,0x0000000004000200L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule9686 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule9690 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L,0x0000000004000000L});
	public static final BitSet FOLLOW_feSortRule_in_createFuzzyAggregatorRule9709 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_feForAllRule_in_createFuzzyAggregatorRule9763 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_feDeriveRule_in_createFuzzyAggregatorRule9798 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyAggregatorRule9832 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_createFuzzyAggregatorRule9836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyAggregatorRule9863 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyAggregatorRule9865 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule9872 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9876 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9878 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule9884 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9907 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule9909 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9913 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9915 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule9921 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyAggregatorRule9941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyAggregatorRule9948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_feForAllRule9970 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_feForAllRule9972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule9976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_IN_in_feForAllRule9978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule9982 = new BitSet(new long[]{0x0000000000000080L,0x0000210000000000L});
	public static final BitSet FOLLOW_LB_in_feForAllRule10007 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10012 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feForAllRule10031 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_feForAllRule10039 = new BitSet(new long[]{0x0000000000000080L,0x0000200000000000L});
	public static final BitSet FOLLOW_LOCALLY_in_feForAllRule10069 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10073 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_feForAllRule10077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule10081 = new BitSet(new long[]{0x0000000040000080L});
	public static final BitSet FOLLOW_COMMA_in_feForAllRule10095 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feForAllRule10099 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_feForAllRule10103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feForAllRule10107 = new BitSet(new long[]{0x0000000040000080L});
	public static final BitSet FOLLOW_AGGREGATE_in_feForAllRule10123 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000200008001100L});
	public static final BitSet FOLLOW_aggSpecRule_in_feForAllRule10127 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_feForAllRule10146 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000200008001100L});
	public static final BitSet FOLLOW_aggSpecRule_in_feForAllRule10150 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_DERIVE_in_feDeriveRule10211 = new BitSet(new long[]{0x0000000400082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feDeriveRule10217 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_feCumulateRule_in_feDeriveRule10233 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_feDeriveRule10250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feDeriveRule10254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CUMULATE_in_feCumulateRule10298 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_feCumulateRule10300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feCumulateRule10304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_feCumulateRule10306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SORT_in_feSortRule10324 = new BitSet(new long[]{0x0000000000000000L,0x0000800000080000L});
	public static final BitSet FOLLOW_feArraySortRule_in_feSortRule10328 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_feSortRule10341 = new BitSet(new long[]{0x0000000000000000L,0x0000800000080000L});
	public static final BitSet FOLLOW_feArraySortRule_in_feSortRule10345 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_feArrayIndexRule_in_feArraySortRule10378 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_feArraySortRule10386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10389 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10402 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_AS_in_feArraySortRule10413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feArraySortRule10417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_feArraySortRule10443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feArrayIndexRule_in_feArraySortRule10445 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feArrayIndexRule_in_feArraySortRule10457 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_feArraySortRule10464 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_feArraySortRule10471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10473 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_feSortFieldRule_in_feArraySortRule10486 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_AS_in_feArraySortRule10497 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_feArraySortRule10499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feArraySortRule10503 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feArraySortRule10531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feArraySortRule10535 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_feArraySortRule10558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_feArrayIndexRule10605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_IN_in_feArrayIndexRule10607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feArrayIndexRule10611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_feSortFieldRule10639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000001000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_feSortFieldRule10644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_TYPE_in_feSortFieldRule10657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feSortFieldRule10661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_VERSUS_in_feSortFieldRule10670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withSpec_in_aggSpecRule10711 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_aggSpecRule10721 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_aggSpecRule10728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_aggSpecRule10732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withSpec10765 = new BitSet(new long[]{0x0000000000000000L,0x0084000000000000L,0x0000000020000400L});
	public static final BitSet FOLLOW_SUM_in_withSpec10771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_withSpec10784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINIMUM_in_withSpec10797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAXIMUM_in_withSpec10810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_feParameterRule10843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_TYPE_in_feParameterRule10862 = new BitSet(new long[]{0x0000000000004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_feParameterRule10867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_feParameterRule10873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule10911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule10928 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule10932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule10998 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule11016 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule11020 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule11088 = new BitSet(new long[]{0x0000000000002010L,0x0000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule11099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule11137 = new BitSet(new long[]{0x0080000000000002L,0x0801040004008200L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule11157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule11177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule11224 = new BitSet(new long[]{0x0000000000002010L,0x0000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule11233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule11275 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule11298 = new BitSet(new long[]{0x0000000000002000L,0x0000800008080008L,0x0000000000001000L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule11304 = new BitSet(new long[]{0x0000000000002000L,0x0000800008080008L,0x0000000000001000L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule11309 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule11327 = new BitSet(new long[]{0x0000000000002000L,0x0000800008080008L,0x0000000000001000L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule11333 = new BitSet(new long[]{0x0000000000002000L,0x0000800008080008L,0x0000000000001000L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule11338 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule11378 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule11403 = new BitSet(new long[]{0x0000000000002000L,0x0000800008080008L,0x0000000000001000L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule11409 = new BitSet(new long[]{0x0000000000002000L,0x0000800008080008L,0x0000000000001000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule11414 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule11455 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule11459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule11463 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule11483 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule11521 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule11558 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule11592 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule11625 = new BitSet(new long[]{0x0400000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule11665 = new BitSet(new long[]{0x0000000000002010L,0x0000800008080008L,0x0000000008041000L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule11670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule11676 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_jfFactorRule11703 = new BitSet(new long[]{0x0000000000002000L,0x0000800008080008L,0x0000000000001000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfFactorRule11707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11761 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule11781 = new BitSet(new long[]{0x0000000000002010L,0x0000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11785 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_feTermRule_in_feExpressionRule11833 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_feExpressionRule11855 = new BitSet(new long[]{0x0000000000082000L,0x0000800008180008L,0x0000000000001100L});
	public static final BitSet FOLLOW_SUB_in_feExpressionRule11861 = new BitSet(new long[]{0x0000000000082000L,0x0000800008180008L,0x0000000000001100L});
	public static final BitSet FOLLOW_feTermRule_in_feExpressionRule11866 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_feExpressionRule11883 = new BitSet(new long[]{0x0000000000082000L,0x0000800008180008L,0x0000000000001100L});
	public static final BitSet FOLLOW_SUB_in_feExpressionRule11889 = new BitSet(new long[]{0x0000000000082000L,0x0000800008180008L,0x0000000000001100L});
	public static final BitSet FOLLOW_feTermRule_in_feExpressionRule11894 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_feFactorRule_in_feTermRule11933 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_MUL_in_feTermRule11958 = new BitSet(new long[]{0x0000000000082000L,0x0000800008180008L,0x0000000000001100L});
	public static final BitSet FOLLOW_DIV_in_feTermRule11964 = new BitSet(new long[]{0x0000000000082000L,0x0000800008180008L,0x0000000000001100L});
	public static final BitSet FOLLOW_feFactorRule_in_feTermRule11969 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12009 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFactorRule12013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12017 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_valueRule_in_feFactorRule12058 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_POS_in_feFactorRule12110 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_feFactorRule12163 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12233 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFactorRule12237 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_feFactorRule12241 = new BitSet(new long[]{0x0000000000082000L,0x0000000008000008L,0x0000000000001000L});
	public static final BitSet FOLLOW_valueRule_in_feFactorRule12245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12247 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_feFactorRule12258 = new BitSet(new long[]{0x0400000000000002L,0x0000810000000000L});
	public static final BitSet FOLLOW_feArrayRefRule_in_feFactorRule12264 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LP_in_feFactorRule12325 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feFunctionParamsRule_in_feFactorRule12329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_feFactorRule12333 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_EXP_in_feFactorRule12356 = new BitSet(new long[]{0x0000000000082000L,0x0000800008180008L,0x0000000000001100L});
	public static final BitSet FOLLOW_feFactorRule_in_feFactorRule12360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFunctionParamsRule12442 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_feFunctionParamsRule12463 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feFunctionParamsRule12467 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LB_in_feArrayRefRule12501 = new BitSet(new long[]{0x0000000000082010L,0x0000800008180008L,0x0000000008001100L});
	public static final BitSet FOLLOW_feExpressionRule_in_feArrayRefRule12506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_feArrayRefRule12511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_fieldRefRule_in_feArrayRefRule12521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzySetModelRule12541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzySetModelRule12543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_SET_in_createFuzzySetModelRule12545 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_MODEL_in_createFuzzySetModelRule12547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12551 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetModelRule12561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12567 = new BitSet(new long[]{0x0000020140000000L,0x8000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetModelRule12587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12591 = new BitSet(new long[]{0x0000020140000000L,0x8000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_DERIVED_in_createFuzzySetModelRule12617 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetModelRule12619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12623 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetModelRule12636 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetModelRule12640 = new BitSet(new long[]{0x0000000140000000L,0x8000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetModelRule12654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule12661 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetModelRule12685 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetModelRule12689 = new BitSet(new long[]{0x0000000140000000L,0x8000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CONSTRAINT_in_createFuzzySetModelRule12708 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzySetModelRule12712 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_fuzzyOperatorDefinitionRule_in_createFuzzySetModelRule12731 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_createFuzzySetModelRule12739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_fuzzyOperatorDefinitionRule12760 = new BitSet(new long[]{0x0000000000000800L,0x1000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_fuzzyOperatorDefinitionRule12764 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_fuzzyOperatorDefinitionRule12800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_fuzzyOperatorDefinitionRule12804 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_fuzzyOperatorDefinitionRule12806 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_fuzzyOperatorDefinitionRule12838 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule12899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule12903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule12905 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule12907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule12911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule12932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12936 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12958 = new BitSet(new long[]{0x0100000040000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule12978 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule12982 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule12998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule13002 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createGenericFuzzySetOperatorRule13036 = new BitSet(new long[]{0x0000000000002010L,0x0000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule13040 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule13063 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LB_in_createGenericFuzzySetOperatorRule13065 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule13078 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13082 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13084 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule13090 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13112 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule13114 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13118 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule13120 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000008L,0x0000000008000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule13124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule13126 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RB_in_createGenericFuzzySetOperatorRule13145 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_createGenericFuzzySetOperatorRule13209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule13243 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule13265 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule13271 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule13276 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule13293 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule13299 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule13304 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule13341 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftTermRule13366 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_DIV_in_ftTermRule13372 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule13377 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule13409 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFactorRule13413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule13416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftValueRule_in_ftFactorRule13436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule13463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule13495 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule13497 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808040000L});
	public static final BitSet FOLLOW_ftFunctionParamsRule_in_ftFactorRule13502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule13507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_ftFactorRule13522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftValueRule13547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftValueRule13567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13603 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_ftFunctionParamsRule13624 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule13628 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule13678 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule13702 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule13708 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule13713 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule13732 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule13738 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule13743 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule13778 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftConditionTermRule13795 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_DIV_in_ftConditionTermRule13801 = new BitSet(new long[]{0x3000004000008000L,0x0030800008180008L,0x0000000800000000L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule13806 = new BitSet(new long[]{0x0000800000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule13836 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule13840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule13843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionValueRule_in_ftConditionFactorRule13861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule13890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FIELD_NAME_in_ftConditionFactorRule13894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule13925 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule13927 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808040000L});
	public static final BitSet FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule13932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule13937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_ftConditionFactorRule13950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftConditionValueRule13996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftConditionValueRule14016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14054 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_ftConditionFunctionParamsRule14073 = new BitSet(new long[]{0x3000004000008010L,0x0030800008180008L,0x0000000808000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule14077 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaFunctionRule14113 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_JAVA_in_createJavaFunctionRule14115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaFunctionRule14117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule14125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaFunctionRule14158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule14168 = new BitSet(new long[]{0x0000000044000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_COMMA_in_createJavaFunctionRule14190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule14194 = new BitSet(new long[]{0x0000000044000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaFunctionRule14214 = new BitSet(new long[]{0x0000000000002010L,0x1000800008080008L,0x0000000008001000L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaFunctionRule14218 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule14232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule14236 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IMPORT_in_createJavaFunctionRule14271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule14275 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule14305 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaFunctionRule14307 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaFunctionRule14320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SC_in_createJavaFunctionRule14326 = new BitSet(new long[]{0x0000000000000002L});
}
