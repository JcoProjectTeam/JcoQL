// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2023-08-11 18:42:29

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
		"COMMA", "COMMENT", "CONSTRAINT", "CREATE", "DB", "DEFAULT", "DEFUZZIFY", 
		"DEGREE", "DEGREES", "DERIVE", "DERIVED", "DICTIONARY", "DIGIT", "DIGIT0", 
		"DIRECTION", "DISTANCE", "DIV", "DOCUMENTS", "DOT", "DROP", "DROPPING", 
		"DUPLICATES", "EACH", "END_BODY", "EQ", "EVALUATE", "EXP", "EXPAND", "EXTENT", 
		"FIELD", "FIELDS", "FIELD_NAME", "FILTER", "FIRST", "FLOAT", "FOR", "FROM_ARRAY", 
		"FROM_WEB", "FUNCTION", "FUZZY", "GE", "GENERATE", "GEOMETRY", "GET", 
		"GROUP", "GROUPING", "GT", "HOWINCLUDE", "HOWINTERSECT", "HOWMEET", "ID", 
		"IF_ERROR", "IF_FAILS", "IMPORT", "IN", "INCLUDED", "INPUT", "INRANGE", 
		"INT", "INTERSECT", "INTERSECTION", "INTO", "ISNOTNULL", "ISNULL", "JAVA", 
		"JAVASCRIPT", "JOIN", "KEEP", "KEEPING", "KNOWN", "LAST", "LB", "LBR", 
		"LE", "LEFT", "LETTER", "LOCALLY", "LOOKUP", "LP", "LT", "MATCHING", "MAXIMUM", 
		"MEET", "MEMBERSHIP_ARRAY", "MEMBERSHIP_TO", "MERGE", "MINIMUM", "MIN_SIMILARITY", 
		"MODEL", "MUL", "NEQ", "NOT", "OF", "ON", "OPERATOR", "OR", "ORDER", "ORIENTATION", 
		"OTHERS", "PARAMETERS", "PARTITION", "POINT", "POLYLINE", "POS", "PRECONDITION", 
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
	public static final int DB=34;
	public static final int DEFAULT=35;
	public static final int DEFUZZIFY=36;
	public static final int DEGREE=37;
	public static final int DEGREES=38;
	public static final int DERIVE=39;
	public static final int DERIVED=40;
	public static final int DICTIONARY=41;
	public static final int DIGIT=42;
	public static final int DIGIT0=43;
	public static final int DIRECTION=44;
	public static final int DISTANCE=45;
	public static final int DIV=46;
	public static final int DOCUMENTS=47;
	public static final int DOT=48;
	public static final int DROP=49;
	public static final int DROPPING=50;
	public static final int DUPLICATES=51;
	public static final int EACH=52;
	public static final int END_BODY=53;
	public static final int EQ=54;
	public static final int EVALUATE=55;
	public static final int EXP=56;
	public static final int EXPAND=57;
	public static final int EXTENT=58;
	public static final int FIELD=59;
	public static final int FIELDS=60;
	public static final int FIELD_NAME=61;
	public static final int FILTER=62;
	public static final int FIRST=63;
	public static final int FLOAT=64;
	public static final int FOR=65;
	public static final int FROM_ARRAY=66;
	public static final int FROM_WEB=67;
	public static final int FUNCTION=68;
	public static final int FUZZY=69;
	public static final int GE=70;
	public static final int GENERATE=71;
	public static final int GEOMETRY=72;
	public static final int GET=73;
	public static final int GROUP=74;
	public static final int GROUPING=75;
	public static final int GT=76;
	public static final int HOWINCLUDE=77;
	public static final int HOWINTERSECT=78;
	public static final int HOWMEET=79;
	public static final int ID=80;
	public static final int IF_ERROR=81;
	public static final int IF_FAILS=82;
	public static final int IMPORT=83;
	public static final int IN=84;
	public static final int INCLUDED=85;
	public static final int INPUT=86;
	public static final int INRANGE=87;
	public static final int INT=88;
	public static final int INTERSECT=89;
	public static final int INTERSECTION=90;
	public static final int INTO=91;
	public static final int ISNOTNULL=92;
	public static final int ISNULL=93;
	public static final int JAVA=94;
	public static final int JAVASCRIPT=95;
	public static final int JOIN=96;
	public static final int KEEP=97;
	public static final int KEEPING=98;
	public static final int KNOWN=99;
	public static final int LAST=100;
	public static final int LB=101;
	public static final int LBR=102;
	public static final int LE=103;
	public static final int LEFT=104;
	public static final int LETTER=105;
	public static final int LOCALLY=106;
	public static final int LOOKUP=107;
	public static final int LP=108;
	public static final int LT=109;
	public static final int MATCHING=110;
	public static final int MAXIMUM=111;
	public static final int MEET=112;
	public static final int MEMBERSHIP_ARRAY=113;
	public static final int MEMBERSHIP_TO=114;
	public static final int MERGE=115;
	public static final int MINIMUM=116;
	public static final int MIN_SIMILARITY=117;
	public static final int MODEL=118;
	public static final int MUL=119;
	public static final int NEQ=120;
	public static final int NOT=121;
	public static final int OF=122;
	public static final int ON=123;
	public static final int OPERATOR=124;
	public static final int OR=125;
	public static final int ORDER=126;
	public static final int ORIENTATION=127;
	public static final int OTHERS=128;
	public static final int PARAMETERS=129;
	public static final int PARTITION=130;
	public static final int POINT=131;
	public static final int POLYLINE=132;
	public static final int POS=133;
	public static final int PRECONDITION=134;
	public static final int PRODUCT=135;
	public static final int QUOTE=136;
	public static final int QUOTED_VALUE=137;
	public static final int RB=138;
	public static final int RBR=139;
	public static final int REMOVE=140;
	public static final int RESOLVING=141;
	public static final int RIGHT=142;
	public static final int RP=143;
	public static final int SAVE=144;
	public static final int SC=145;
	public static final int SCAN_ERROR=146;
	public static final int SERVER=147;
	public static final int SET=148;
	public static final int SETS=149;
	public static final int SETTING=150;
	public static final int SORT=151;
	public static final int SUB=152;
	public static final int SUBTRACT=153;
	public static final int SUM=154;
	public static final int THRESHOLD=155;
	public static final int TILDE=156;
	public static final int TO=157;
	public static final int TO_POLYLINE=158;
	public static final int TRAJECTORY=159;
	public static final int TRANSLATE=160;
	public static final int TYPE=161;
	public static final int UNCOMPARABLE=162;
	public static final int UNKNOWN=163;
	public static final int UNPACK=164;
	public static final int USE=165;
	public static final int USING=166;
	public static final int VERSUS=167;
	public static final int WHERE=168;
	public static final int WHITE_SPACES=169;
	public static final int WITH=170;
	public static final int WITHIN=171;
	public static final int WITHOUT=172;
	public static final int WRT=173;
	public static final int WS=174;
	public static final int XXX=175;

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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:89:1: start : ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:3: ( ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )* EOF )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )* EOF
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetModelRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )*
			loop1:
			while (true) {
				int alt1=21;
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
					alt1=20;
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:109:7: test
					{
					pushFollow(FOLLOW_test_in_start484);
					test();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start520); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:1: test : XXX SC ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:5: ( XXX SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:7: XXX SC
			{
			match(input,XXX,FOLLOW_XXX_in_test531); 
			match(input,SC,FOLLOW_SC_in_test533); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:119:1: collectionReferenceRule returns [DbCollection cr] : name= ID ( AT db= ID )? ( AS alias= ID )? ;
	public final DbCollection collectionReferenceRule() throws RecognitionException {
		DbCollection cr = null;


		Token name=null;
		Token db=null;
		Token alias=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:120:3: (name= ID ( AT db= ID )? ( AS alias= ID )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:121:5: name= ID ( AT db= ID )? ( AS alias= ID )?
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule557); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:5: ( AT db= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:7: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_collectionReferenceRule567); 
					db=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule571); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:5: ( AS alias= ID )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:7: AS alias= ID
					{
					match(input,AS,FOLLOW_AS_in_collectionReferenceRule584); 
					alias=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule588); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:128:1: fieldRefRule returns [Field field] : (fd= FIELD_NAME )+ ;
	public final Field fieldRefRule() throws RecognitionException {
		Field field = null;


		Token fd=null;

			field = new Field (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:130:3: ( (fd= FIELD_NAME )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:131:5: (fd= FIELD_NAME )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:131:5: (fd= FIELD_NAME )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:131:7: fd= FIELD_NAME
					{
					fd=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_fieldRefRule635); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:135:1: buildActionRule returns [BuildAction ga] : BUILD os= objectStructureRule[true] ;
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:137:3: ( BUILD os= objectStructureRule[true] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:138:5: BUILD os= objectStructureRule[true]
			{
			match(input,BUILD,FOLLOW_BUILD_in_buildActionRule675); 
			pushFollow(FOLLOW_objectStructureRule_in_buildActionRule693);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:144:1: objectStructureRule[boolean generateActionCaller] returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule(boolean generateActionCaller) throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:145:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:146:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule729); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule740);
			ofs=outputFieldSpecRule();
			state._fsp--;

			 obj = new ObjectStructure (ofs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:8: (t= COMMA ofs= outputFieldSpecRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:10: t= COMMA ofs= outputFieldSpecRule
					{
					t=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectStructureRule761); 
					pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule765);
					ofs=outputFieldSpecRule();
					state._fsp--;

					 env.addOutputFieldSpec (obj, ofs, generateActionCaller, t); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_objectStructureRule781); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:154:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:155:3: (fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:156:5: fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule806);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:157:5: ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:157:7: COLON (os= objectStructureRule[false] |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule820); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:157:13: (os= objectStructureRule[false] |f= factorRule )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==LBR) ) {
						alt6=1;
					}
					else if ( (LA6_0==APEX_VALUE||LA6_0==ARRAY_FUNCTION||LA6_0==BOOLEAN||LA6_0==DEGREE||LA6_0==EXTENT||LA6_0==FIELD_NAME||LA6_0==FLOAT||(LA6_0 >= ID && LA6_0 <= IF_ERROR)||LA6_0==INT||LA6_0==LB||LA6_0==LP||(LA6_0 >= MEMBERSHIP_ARRAY && LA6_0 <= MEMBERSHIP_TO)||LA6_0==QUOTED_VALUE||LA6_0==TRANSLATE) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:157:15: os= objectStructureRule[false]
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule826);
							os=objectStructureRule(false);
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:11: f= factorRule
							{
							pushFollow(FOLLOW_factorRule_in_outputFieldSpecRule865);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:165:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:167:3: ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:168:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule955); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule957); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:169:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule989); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule991); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:170:14: ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:170:16: POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP
							{
							match(input,POINT,FOLLOW_POINT_in_geometricOptionRule1009); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1011); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1015);
							lat=fieldRefRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_geometricOptionRule1017); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1021);
							lon=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1023); 
							 geo.setPoint (lat, lon); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:171:16: AGGREGATE LP afr= fieldRefRule RP
							{
							match(input,AGGREGATE,FOLLOW_AGGREGATE_in_geometricOptionRule1043); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1045); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1049);
							afr=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1051); 
							 geo.setAggregate (afr); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:172:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1083);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:173:16: TO_POLYLINE LP f= fieldRefRule RP
							{
							match(input,TO_POLYLINE,FOLLOW_TO_POLYLINE_in_geometricOptionRule1121); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1123); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1127);
							f=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1129); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:1: dropGeometryRule : DROPPING GEOMETRY ;
	public final void dropGeometryRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:3: ( DROPPING GEOMETRY )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:179:4: DROPPING GEOMETRY
			{
			match(input,DROPPING,FOLLOW_DROPPING_in_dropGeometryRule1175); 
			match(input,GEOMETRY,FOLLOW_GEOMETRY_in_dropGeometryRule1177); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:183:1: caseClauseRule returns [CaseClause cc] : (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		Token c=null;
		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:184:3: ( (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:5: (c= CASES |c= CASE ) (wc= whereCaseRule )+ (oth= othersRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:5: (c= CASES |c= CASE )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:7: c= CASES
					{
					c=(Token)match(input,CASES,FOLLOW_CASES_in_caseClauseRule1228); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:17: c= CASE
					{
					c=(Token)match(input,CASE,FOLLOW_CASE_in_caseClauseRule1234); 
					}
					break;

			}

			 cc = env.newCaseClause (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:8: (wc= whereCaseRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1257);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:8: (oth= othersRule )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==DROP||LA12_0==KEEP) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1286);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:196:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:197:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:198:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:198:6: (ot= KEEP |ot= DROP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:198:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1339); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:198:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1345); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1356); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:204:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1381); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1392);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:7: (gs= generateSectionRule[true] )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==GENERATE) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1410);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:214:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:215:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:216:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1447); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:217:7: (go= geometricOptionRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:217:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1464);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:218:4: (cf= checkForFuzzySetRule[gs] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CHECK_FOR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:218:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1481);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:4: (ac= alphaCutRule[gs] )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ALPHACUT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1512);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:7: (ga= buildActionRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BUILD) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1550);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:4: (df= keepDropFuzzySetsRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1570);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:7: ( dropGeometryRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==DROPPING) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:9: dropGeometryRule
					{
					pushFollow(FOLLOW_dropGeometryRule_in_generateSectionRule1588);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:230:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:231:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:232:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1649);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:233:4: ( OR c2= andConditionRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==OR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:233:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1664); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1668);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:238:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:239:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:240:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1725);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:241:5: ( AND c2= notConditionRule )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==AND) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:241:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1741); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1745);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:246:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:247:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:5: (not= NOT )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NOT) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1807); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1819);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:255:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:256:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
			int alt25=5;
			switch ( input.LA(1) ) {
			case ADD:
			case APEX_VALUE:
			case ARRAY_FUNCTION:
			case BOOLEAN:
			case DEGREE:
			case EXTENT:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:257:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1863);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:258:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:258:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule1891);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule1920);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:260:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule1952);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:261:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule1975);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule2001);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule2021);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:267:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:268:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule2057);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule2066);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule2095); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:11: (lp= LB |lp= LP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule2101); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule2107); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule2117);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule2119); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule2123);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:3: (rp= RP |rp= RB )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule2132); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule2138); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:282:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:284:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule2177); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2181);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:284:26: (n= ISNULL |n= ISNOTNULL )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:284:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2187); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:284:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2193); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:288:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:289:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2267); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2273); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2279); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2300); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2302); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2306); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:7: ( COMMA fs= ID )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2336); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2340); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:300:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2393); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2404);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:7: ( COMMA fr= fieldRefRule )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==COMMA) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2422); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2426);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:307:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2464); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ARRAY||LA33_0==GEOMETRY||LA33_0==ID) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2479); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2485); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2491); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2512);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:6: ( COMMA fr= fieldRefRule )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==COMMA) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2535); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2539);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:320:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==APEX_VALUE||LA36_0==ARRAY_FUNCTION||LA36_0==BOOLEAN||LA36_0==DEGREE||LA36_0==EXTENT||LA36_0==FIELD_NAME||LA36_0==FLOAT||(LA36_0 >= ID && LA36_0 <= IF_ERROR)||LA36_0==INT||LA36_0==LB||LA36_0==LP||(LA36_0 >= MEMBERSHIP_ARRAY && LA36_0 <= MEMBERSHIP_TO)||LA36_0==QUOTED_VALUE||LA36_0==TRANSLATE) ) {
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2585);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:6: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2608); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2614); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2619);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==ADD||LA38_0==SUB) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2637); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2643); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2648);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:329:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:330:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2686);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==DIV||LA40_0==MUL) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:7: (s= MUL |s= DIV )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2709); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2715); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2720);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:335:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= factorRule ( COMMA f= factorRule )* RB |sf= specialFunctionRule ) ( EXP e= factorRule )? ;
	public final ExpressionFactor factorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Condition op =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor f =null;
		SpecialFunctionFactor sf =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:3: ( ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= factorRule ( COMMA f= factorRule )* RB |sf= specialFunctionRule ) ( EXP e= factorRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:4: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= factorRule ( COMMA f= factorRule )* RB |sf= specialFunctionRule ) ( EXP e= factorRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:4: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= factorRule ( COMMA f= factorRule )* RB |sf= specialFunctionRule )
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
			case LB:
				{
				alt43=5;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case EXTENT:
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:6: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2753); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2757);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2759); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2780);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:339:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2804);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:340:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2829); 
					match(input,LP,FOLLOW_LP_in_factorRule2831); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:340:14: (fp= functionParamsRule )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==ADD||LA41_0==APEX_VALUE||LA41_0==ARRAY_FUNCTION||LA41_0==BOOLEAN||LA41_0==DEGREE||LA41_0==EXTENT||LA41_0==FIELD_NAME||LA41_0==FLOAT||(LA41_0 >= ID && LA41_0 <= IF_ERROR)||LA41_0==INT||LA41_0==LB||LA41_0==LP||(LA41_0 >= MEMBERSHIP_ARRAY && LA41_0 <= MEMBERSHIP_TO)||LA41_0==QUOTED_VALUE||LA41_0==SUB||LA41_0==TRANSLATE) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:340:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2836);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2840); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:6: LB f= factorRule ( COMMA f= factorRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_factorRule2853); 
					pushFollow(FOLLOW_factorRule_in_factorRule2857);
					f=factorRule();
					state._fsp--;

					 ef = new ExpressionFactor (f); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:6: ( COMMA f= factorRule )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==COMMA) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:8: COMMA f= factorRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_factorRule2881); 
							pushFollow(FOLLOW_factorRule_in_factorRule2885);
							f=factorRule();
							state._fsp--;

								ef.addArrayValue (f); 
							}
							break;

						default :
							break loop42;
						}
					}

					match(input,RB,FOLLOW_RB_in_factorRule2924); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:344:6: sf= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2933);
					sf=specialFunctionRule();
					state._fsp--;

						ef = sf; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:4: ( EXP e= factorRule )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==EXP) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:6: EXP e= factorRule
					{
					match(input,EXP,FOLLOW_EXP_in_factorRule2957); 
					pushFollow(FOLLOW_factorRule_in_factorRule2961);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (mt= MEMBERSHIP_TO LP fs= ID RP | EXTENT LP fs= ID RP | DEGREE LP fs= ID (dg= FIELD_NAME )? RP | MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP | IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP | TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
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
		Expression e =null;
		Value v =null;
		ArrayFunctionFactor a =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:2: (mt= MEMBERSHIP_TO LP fs= ID RP | EXTENT LP fs= ID RP | DEGREE LP fs= ID (dg= FIELD_NAME )? RP | MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP | IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP | TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
			int alt51=7;
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
			case IF_ERROR:
				{
				alt51=5;
				}
				break;
			case TRANSLATE:
				{
				alt51=6;
				}
				break;
			case ARRAY_FUNCTION:
				{
				alt51=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:4: mt= MEMBERSHIP_TO LP fs= ID RP
					{
					mt=(Token)match(input,MEMBERSHIP_TO,FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule3002); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3005); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3009); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule3011); 
						expr = env.buildMembershipTo (mt, fs); 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:5: EXTENT LP fs= ID RP
					{
					match(input,EXTENT,FOLLOW_EXTENT_in_specialFunctionRule3040); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3048); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3052); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule3054); 
						expr = env.buildExtent (fs); 						
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:5: DEGREE LP fs= ID (dg= FIELD_NAME )? RP
					{
					match(input,DEGREE,FOLLOW_DEGREE_in_specialFunctionRule3083); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3091); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3095); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:29: (dg= FIELD_NAME )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==FIELD_NAME) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:29: dg= FIELD_NAME
							{
							dg=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_specialFunctionRule3099); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3102); 
						expr = env.buildDegree (fs, dg);				
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:5: MEMBERSHIP_ARRAY LP ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB ) RP
					{
					match(input,MEMBERSHIP_ARRAY,FOLLOW_MEMBERSHIP_ARRAY_in_specialFunctionRule3125); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3128); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:4: ( ALL |fuzzySet= ID FROM_ARRAY array= fieldRefRule | LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_specialFunctionRule3163); 
							 expr = new MembershipArray (); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:6: fuzzySet= ID FROM_ARRAY array= fieldRefRule
							{
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3208); 
							match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_specialFunctionRule3210); 
							pushFollow(FOLLOW_fieldRefRule_in_specialFunctionRule3214);
							array=fieldRefRule();
							state._fsp--;

							 expr = env.createMembershipArray (fuzzySet, array); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:6: LB fuzzySet= ID ( COMMA fuzzySet= ID )* RB
							{
							match(input,LB,FOLLOW_LB_in_specialFunctionRule3237); 
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3241); 
							 expr = env.createMembershipArray (fuzzySet); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:360:5: ( COMMA fuzzySet= ID )*
							loop46:
							while (true) {
								int alt46=2;
								int LA46_0 = input.LA(1);
								if ( (LA46_0==COMMA) ) {
									alt46=1;
								}

								switch (alt46) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:360:7: COMMA fuzzySet= ID
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3279); 
									fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3283); 
									 env.addMembershipArray ((MembershipArray)expr, fuzzySet); 
									}
									break;

								default :
									break loop46;
								}
							}

							match(input,RB,FOLLOW_RB_in_specialFunctionRule3324); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3331); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:363:5: IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule3337); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3343); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3347);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3349); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule3353);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3355); 
						expr = env.buildIfError (e, v); 					
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:364:5: TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule3364); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3370); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3374);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3376); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3380); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:16: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==COMMA) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:18: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3400); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule3404); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:17: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt49=2;
							int LA49_0 = input.LA(1);
							if ( (LA49_0==COMMA) ) {
								alt49=1;
							}
							switch (alt49) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:19: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3425); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:25: (d= APEX_VALUE |d= QUOTED_VALUE )
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
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:26: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule3430); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:41: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule3436); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3445); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule3456);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:369:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token a=null;
		Token q=null;
		Token b=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:370:3: (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN )
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
			case APEX_VALUE:
				{
				alt52=3;
				}
				break;
			case QUOTED_VALUE:
				{
				alt52=4;
				}
				break;
			case BOOLEAN:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:371:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule3506); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:372:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule3526); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:373:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule3545); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:374:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule3559); 
					 vl = new Value (Value.QUOTED, q.getText());	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:375:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule3571); 
					 vl = new Value (Value.BOOLEAN, b.getText());	
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:381:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3604); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3644); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3673);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule3694); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3698);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:5: ( COMMA e= restrictedExpressionRule )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==COMMA) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3713); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3717);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop53;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule3741); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3749); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule3753); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==COMMA) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3781); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3787);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:9: ( COMMA fx= fieldRefRule )*
							loop55:
							while (true) {
								int alt55=2;
								int LA55_0 = input.LA(1);
								if ( (LA55_0==COMMA) ) {
									alt55=1;
								}

								switch (alt55) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3809); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3813);
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule3845); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3868); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3872);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:9: ( COMMA fx= fieldRefRule )*
							loop56:
							while (true) {
								int alt56=2;
								int LA56_0 = input.LA(1);
								if ( (LA56_0==COMMA) ) {
									alt56=1;
								}

								switch (alt56) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3891); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3895);
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

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule3933); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:407:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:409:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:410:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:410:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==APEX_VALUE||LA60_0==ARRAY_FUNCTION||LA60_0==BOOLEAN||LA60_0==DEGREE||LA60_0==EXTENT||LA60_0==FIELD_NAME||LA60_0==FLOAT||(LA60_0 >= ID && LA60_0 <= IF_ERROR)||LA60_0==INT||LA60_0==LB||LA60_0==LP||(LA60_0 >= MEMBERSHIP_ARRAY && LA60_0 <= MEMBERSHIP_TO)||LA60_0==QUOTED_VALUE||LA60_0==TRANSLATE) ) {
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:410:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3968);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:411:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:411:5: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:411:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3991); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:411:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3997); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4002);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==ADD||LA62_0==SUB) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule4020); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule4026); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule4031);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:418:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:419:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule4069);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==DIV||LA64_0==MUL) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:7: (s= MUL |s= DIV )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule4092); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule4098); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule4103);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB |sf= specialFunctionRule ) ( EXP e= restrictedFactorRule )? ;
	public final ExpressionFactor restrictedFactorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression ex =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor f =null;
		SpecialFunctionFactor sf =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:425:3: ( ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB |sf= specialFunctionRule ) ( EXP e= restrictedFactorRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:426:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB |sf= specialFunctionRule ) ( EXP e= restrictedFactorRule )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:426:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP | LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB |sf= specialFunctionRule )
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
			case LB:
				{
				alt67=5;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case EXTENT:
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:426:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule4137); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule4141);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule4143); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:427:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule4158);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule4182);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule4207); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule4209); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:14: (fp= functionParamsRule )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==ADD||LA65_0==APEX_VALUE||LA65_0==ARRAY_FUNCTION||LA65_0==BOOLEAN||LA65_0==DEGREE||LA65_0==EXTENT||LA65_0==FIELD_NAME||LA65_0==FLOAT||(LA65_0 >= ID && LA65_0 <= IF_ERROR)||LA65_0==INT||LA65_0==LB||LA65_0==LP||(LA65_0 >= MEMBERSHIP_ARRAY && LA65_0 <= MEMBERSHIP_TO)||LA65_0==QUOTED_VALUE||LA65_0==SUB||LA65_0==TRANSLATE) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule4214);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule4218); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:430:6: LB f= restrictedFactorRule ( COMMA f= restrictedFactorRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_restrictedFactorRule4231); 
					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4235);
					f=restrictedFactorRule();
					state._fsp--;

					 ef = new ExpressionFactor (f); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:431:6: ( COMMA f= restrictedFactorRule )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==COMMA) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:431:8: COMMA f= restrictedFactorRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_restrictedFactorRule4254); 
							pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4258);
							f=restrictedFactorRule();
							state._fsp--;

								ef.addArrayValue (f); 
							}
							break;

						default :
							break loop66;
						}
					}

					match(input,RB,FOLLOW_RB_in_restrictedFactorRule4292); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:6: sf= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule4303);
					sf=specialFunctionRule();
					state._fsp--;

						ef = sf;	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:4: ( EXP e= restrictedFactorRule )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==EXP) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:6: EXP e= restrictedFactorRule
					{
					match(input,EXP,FOLLOW_EXP_in_restrictedFactorRule4325); 
					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedFactorRule4329);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:441:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule4374);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:6: ( COMMA e= restrictedExpressionRule )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==COMMA) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule4392); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule4396);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:452:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:453:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:453:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:453:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule4440); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule4450); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:455:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule4460); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:456:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule4470); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule4480); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule4490); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:465:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:466:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:4: (s= ADD |s= SUB )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule4530); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule4536); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:468:4: (n= FLOAT |n= INT )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:468:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule4549); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:468:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule4555); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:474:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token ty=null;
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:475:2: ( CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:476:3: CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4584); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:476:15: (ty= ID )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==ID) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:476:15: ty= ID
					{
					ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4588); 
					}
					break;

			}

			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4591); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4593); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4597); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4599); 
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4604);
			fe=usingOrConditionRule();
			state._fsp--;

			 env.addCheckForFuzzySet (gs, fs, fe, ty); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:4: ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==COMMA) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:37: COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
						ty = null; 
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule4652); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:478:13: (ty= ID )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==ID) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:478:13: ty= ID
							{
							ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4656); 
							}
							break;

					}

					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4659); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4661); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4665); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4667); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4671);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:483:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:484:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:485:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4703);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:486:4: ( OR c2= usingAndConditionRule )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==OR) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:486:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule4718); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4722);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:494:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:495:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:496:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4784);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:5: ( AND c2= usingNotConditionRule )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==AND) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule4800); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4804);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:503:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:504:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:504:5: (not= NOT )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==NOT) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:504:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule4866); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule4878);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:510:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:511:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:512:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4910); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4914);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule4916); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule4938); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:9: ( LP (fp= functionParamsRule )? RP )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==LP) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule4941); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:13: (fp= functionParamsRule )?
							int alt79=2;
							int LA79_0 = input.LA(1);
							if ( (LA79_0==ADD||LA79_0==APEX_VALUE||LA79_0==ARRAY_FUNCTION||LA79_0==BOOLEAN||LA79_0==DEGREE||LA79_0==EXTENT||LA79_0==FIELD_NAME||LA79_0==FLOAT||(LA79_0 >= ID && LA79_0 <= IF_ERROR)||LA79_0==INT||LA79_0==LB||LA79_0==LP||(LA79_0 >= MEMBERSHIP_ARRAY && LA79_0 <= MEMBERSHIP_TO)||LA79_0==QUOTED_VALUE||LA79_0==SUB||LA79_0==TRANSLATE) ) {
								alt79=1;
							}
							switch (alt79) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule4946);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule4950); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:515:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule4976); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4978); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4986);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule4988); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule4992);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule5000); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:521:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		Token de=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:522:2: ( ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:3: ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule5016); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule5021);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule5023); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule5027); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:38: (de= FIELD_NAME )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==FIELD_NAME) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:38: de= FIELD_NAME
					{
					de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule5031); 
					}
					break;

			}

				env.addAlphaCut (gs, n, on, de); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:4: ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==COMMA) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:30: COMMA n= numericRule ON on= ID (de= FIELD_NAME )?
					{
					 de = null; 
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule5073); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule5077);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule5079); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule5083); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:36: (de= FIELD_NAME )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==FIELD_NAME) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:36: de= FIELD_NAME
							{
							de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule5087); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:534:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:536:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule5125); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:538:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule5144); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule5146); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5148); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5150); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:539:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule5162); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule5164); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5166); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5168); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:540:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule5181); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5183); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5185); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5189); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:5: ( COMMA fs= ID )*
					loop85:
					while (true) {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==COMMA) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule5203); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5207); 
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:542:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule5232); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule5234); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule5236); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5240); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:543:5: ( COMMA fs= ID )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==COMMA) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:543:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule5255); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule5259); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:548:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:549:2: ( ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:550:3: ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule5300); 
			match(input,FIELDS,FOLLOW_FIELDS_in_addFieldsRule5302); 
			match(input,LBR,FOLLOW_LBR_in_addFieldsRule5329); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5337);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule5339); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5343);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:5: ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==COMMA) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:7: COMMA f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule5362); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5366);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule5368); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5372);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop88;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_addFieldsRule5390); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==DISTANCE||LA89_0==INCLUDED||LA89_0==INTERSECT||LA89_0==MEET||LA89_0==ORIENTATION) ) {
				alt89=1;
			}
			else if ( (LA89_0==APEX_VALUE||LA89_0==ARRAY_FUNCTION||LA89_0==BOOLEAN||LA89_0==DEGREE||LA89_0==EXTENT||LA89_0==FIELD_NAME||LA89_0==FLOAT||(LA89_0 >= ID && LA89_0 <= IF_ERROR)||LA89_0==INT||LA89_0==LB||LA89_0==LP||(LA89_0 >= MEMBERSHIP_ARRAY && LA89_0 <= MEMBERSHIP_TO)||LA89_0==QUOTED_VALUE||LA89_0==TRANSLATE) ) {
				alt89=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}

			switch (alt89) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule5413);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule5428);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:568:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule5467); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5469); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5473); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5475); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:25: (cp= comparatorRule n= numericRule )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==EQ||LA90_0==GE||LA90_0==GT||LA90_0==LE||LA90_0==LT||LA90_0==NEQ) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule5481);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5485);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule5509); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5511); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:21: (f= LEFT |f= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5517); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5523); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:42: ( COMMA o= ID COLON d= numericRule )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==COMMA) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule5529); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5534); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule5536); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5540);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5545); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule5557); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5559); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:18: (i= LEFT |i= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5565); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5571); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5574); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule5606); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule5653); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:580:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:583:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule5716); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule5718); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule5720); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:584:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:584:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule5728); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:585:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:585:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule5765); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:7: ( resolvingRule[sfs] )?
							int alt95=2;
							int LA95_0 = input.LA(1);
							if ( (LA95_0==RESOLVING) ) {
								alt95=1;
							}
							switch (alt95) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5801);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule5819); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:588:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule5855); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5886);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:590:5: ( COMMA addFuzzySetRule[sfs] )*
					loop97:
					while (true) {
						int alt97=2;
						int LA97_0 = input.LA(1);
						if ( (LA97_0==COMMA) ) {
							alt97=1;
						}

						switch (alt97) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:590:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule5895); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5897);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop97;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:5: ( resolvingRule[sfs] )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==RESOLVING) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5913);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:595:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:597:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule5940); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule5942); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:6: (t= AND |t= OR |t= FIRST |t= LAST )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule5954); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule5960); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule5966); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule5972); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:602:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:3: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6004); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6010); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:4: ( ALL |fs= ID ( AS newFs= ID )? )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule6021); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6057); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:12: ( AS newFs= ID )?
							int alt102=2;
							int LA102_0 = input.LA(1);
							if ( (LA102_0==AS) ) {
								alt102=1;
							}
							switch (alt102) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule6061); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6065); 
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule6096); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6100); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:22: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6106); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6112); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6116); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6118); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6122); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule6135); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6140); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:20: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule6146); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule6152); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6156); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6159); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6163); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:609:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule6186); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule6189); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule6191); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule6204); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule6208); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:618:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule6232); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule6234); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:6: (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule6246); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:16: ( AT db= ID )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==AT) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule6250); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule6254); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:8: FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM_WEB,FOLLOW_FROM_WEB_in_getCollectionRule6285); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:17: (url= APEX_VALUE |url= QUOTED_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule6290); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule6296); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule6309); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:625:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:626:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:627:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule6330); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule6332); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6343); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule6345); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6349); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule6351); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6355); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule6384); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:634:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:635:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:636:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule6403); 
			match(input,AS,FOLLOW_AS_in_saveAsRule6405); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6415); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:12: ( AT db= ID )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==AT) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule6419); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6423); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule6443); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:642:1: lookupFromWebRule : LOOKUP FROM_WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:643:2: ( LOOKUP FROM_WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:644:3: LOOKUP FROM_WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule6459); 
			match(input,FROM_WEB,FOLLOW_FROM_WEB_in_lookupFromWebRule6461); 
				LookupFromWeb gfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:4: (fe= forEachRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule6477);
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

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule6490); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule6510); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule6512); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule6516);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule6521); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule6525);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:657:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:658:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:659:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule |gs= generateSectionRule[true] )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule6548); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule6550); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6552); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6561);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule6565); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6569);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:661:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==ON) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:661:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule6581); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6583); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6587);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule6619); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6621); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule6627); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule6633); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule6639); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule6645); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:7: ( addFieldsRule[jc] )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==ADD_ST) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule6665);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:664:7: (sfs= setFuzzySetsRule )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==SET) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:664:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6725);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:6: (cc= caseClauseRule |gs= generateSectionRule[true] )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule6767);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:8: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_joinOfCollectionsRule6810);
					gs=generateSectionRule(true);
					state._fsp--;

						jc.setGenerateSection (gs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:7: ( REMOVE DUPLICATES )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==REMOVE) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule6848); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule6850); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule6891); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:672:1: filterRule : FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;
		GenerateSection gs =null;

			Filter f=null;	
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:674:3: ( FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:675:4: FILTER (fc= caseClauseRule |gs= generateSectionRule[true] ) ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule6920); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:676:5: (fc= caseClauseRule |gs= generateSectionRule[true] )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:676:7: fc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_filterRule6931);
					fc=caseClauseRule();
					state._fsp--;

					 f = env.addFilter (fc); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:7: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_filterRule6950);
					gs=generateSectionRule(true);
					state._fsp--;

						f = env.addFilter (gs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:678:7: ( REMOVE DUPLICATES )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==REMOVE) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:678:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule6969); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule6971); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule6992); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:685:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule7013); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:7: (p= groupPartitionRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule7038);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:7: (oth= othersRule )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==DROP||LA122_0==KEEP) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule7064);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule7088); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:692:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:693:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:694:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule7111); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule7115);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule7128); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7132);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:696:10: ( COMMA fr= fieldRefRule )*
			loop123:
			while (true) {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==COMMA) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:696:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule7157); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7161);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop123;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule7183); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule7187);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:698:8: ( DROP GROUPING FIELDS )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:698:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule7208); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule7210); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule7212); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==ORDER) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule7234); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule7236); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule7240);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:700:9: ( COMMA sf= sortingFieldRule )*
					loop125:
					while (true) {
						int alt125=2;
						int LA125_0 = input.LA(1);
						if ( (LA125_0==COMMA) ) {
							alt125=1;
						}

						switch (alt125) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:700:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule7257); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule7261);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop125;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:6: ( KEEP UNCOMPARABLE )?
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule7280); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule7282); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:703:7: (gs= generateSectionRule[false] )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==GENERATE) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:703:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule7313);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:707:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:708:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:709:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule7344);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule7348); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule7352); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:711:3: (v= VERSUS )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==VERSUS) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:711:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule7367); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:715:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule7396); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:7: (u= unpackRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule7420);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:7: (oth= othersRule )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==DROP||LA131_0==KEEP) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule7452);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule7476); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:723:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:725:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule7498); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule7503);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule7510); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7514);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule7521); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7525);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:731:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:732:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:733:6: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule7553); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule7555); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7569);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:9: ( COMMA cr= collectionReferenceRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule7591); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7595);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:7: ( REMOVE DUPLICATES )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==REMOVE) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule7616); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule7618); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule7648); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:743:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule7668); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule7670); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7680);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule7682); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7686);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule7698); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule7720); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule7722); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7730);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule7732); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7736);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule7748); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:759:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:760:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule7775); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule7785); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:761:10: (d= ID |d= APEX_VALUE )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:761:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7790); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:761:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7796); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==AS) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule7820); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:13: (a= ID |a= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7825); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7831); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==COMMA) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule7912); 
					match(input,DB,FOLLOW_DB_in_useDbRule7914); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:20: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7919); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7925); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:766:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt139=2;
					int LA139_0 = input.LA(1);
					if ( (LA139_0==AS) ) {
						alt139=1;
					}
					switch (alt139) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:766:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule7948); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:766:21: (a= ID |a= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:766:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7953); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:766:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7959); 
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

			match(input,ON,FOLLOW_ON_in_useDbRule8037); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:770:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:770:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule8049); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule8051); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:771:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule8063); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:772:10: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:772:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8078); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:772:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8084); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt143=2;
					int LA143_0 = input.LA(1);
					if ( (LA143_0==APEX_VALUE||LA143_0==ID) ) {
						alt143=1;
					}
					switch (alt143) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:12: (d= ID |d= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule8108); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule8114); 
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

			match(input,SC,FOLLOW_SC_in_useDbRule8139); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:779:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:780:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:781:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule8164); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule8166); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8176);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule8178); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8182);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:7: (tp= trajectoryPartitionRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule8198);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:784:7: (oth= othersRule )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==DROP||LA146_0==KEEP) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:784:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule8238);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule8280); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:789:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:790:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:791:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule8308); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule8318);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:793:6: (tpm= partitionMatchingRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:793:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8339);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:797:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:798:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:799:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule8376); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8380);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule8387); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8391);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule8398); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule8400); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule8404); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule8407); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8411);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:802:6: ( WHERE wc= orConditionRule )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==WHERE) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:802:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule8426); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule8430);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule8454); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8458);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:804:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==ADDING) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:804:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule8481); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8485);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule8487); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule8489); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:6: ( MIN_SIMILARITY n= numericRule )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==MIN_SIMILARITY) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8511); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8515);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:811:1: parameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:812:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:813:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8563); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule8579); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8583); 
				p = env.createParameter (v, t); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:818:1: createJavaScriptFunctionRule : CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:819:2: ( CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:820:4: CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaScriptFunctionRule8607); 
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8609); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8611); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule8619); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8651); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8661);
			p=parameterRule(jsf.getParamList());
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:824:5: ( COMMA p= parameterRule[jsf.getParamList()] )*
			loop151:
			while (true) {
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==COMMA) ) {
					alt151=1;
				}

				switch (alt151) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:824:7: COMMA p= parameterRule[jsf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule8686); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8690);
					p=parameterRule(jsf.getParamList());
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop151;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:825:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==PRECONDITION) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:825:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8715); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8719);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule8733); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule8746); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule8752); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:848:1: createFuzzyOperatorRule : CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:849:3: ( CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:4: CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyOperatorRule8774); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyOperatorRule8776); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createFuzzyOperatorRule8778); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule8782); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8807); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8817);
			p=parameterRule(fo.getParamList());
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:853:5: ( COMMA p= parameterRule[fo.getParamList()] )*
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==COMMA) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:853:7: COMMA p= parameterRule[fo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8842); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8846);
					p=parameterRule(fo.getParamList());
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop153;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:854:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==PRECONDITION) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:854:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8873); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8877);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule8891); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8895);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:856:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==POLYLINE) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:856:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule8913); 
					match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule8916); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8928); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8932);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8934); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8938);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8940); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:858:11: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:858:13: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8962); 
							match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8964); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8968);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8970); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8974);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8976); 
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

					match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule8997); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule9004); 
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



	// $ANTLR start "createFuzzyAggregatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:866:1: createFuzzyAggregatorRule : CREATE FUZZY AGGREGATOR n= ID PARAMETERS faParameterRule[fa] ( COMMA faParameterRule[fa] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( faSortRule[fa] )? (f= faForAllRule[fa] |d= faDeriveRule[fa] )+ EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyAggregatorRule() throws RecognitionException {
		Token n=null;
		Condition pc =null;
		ForAllClause f =null;
		DeriveClause d =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:867:2: ( CREATE FUZZY AGGREGATOR n= ID PARAMETERS faParameterRule[fa] ( COMMA faParameterRule[fa] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( faSortRule[fa] )? (f= faForAllRule[fa] |d= faDeriveRule[fa] )+ EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:868:3: CREATE FUZZY AGGREGATOR n= ID PARAMETERS faParameterRule[fa] ( COMMA faParameterRule[fa] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( faSortRule[fa] )? (f= faForAllRule[fa] |d= faDeriveRule[fa] )+ EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyAggregatorRule9026); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyAggregatorRule9028); 
			match(input,AGGREGATOR,FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule9030); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyAggregatorRule9034); 
			 FuzzyAggregator fa = env.addFuzzyAggregator (n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule9060); 
			pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule9067);
			faParameterRule(fa);
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:871:5: ( COMMA faParameterRule[fa] )*
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==COMMA) ) {
					alt157=1;
				}

				switch (alt157) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:871:7: COMMA faParameterRule[fa]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9099); 
					pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule9101);
					faParameterRule(fa);
					state._fsp--;

					}
					break;

				default :
					break loop157;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:4: ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==PRECONDITION) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:6: PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule9150); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule9154);
					pc=jfOrConditionRule(fa.getParamList(), false);
					state._fsp--;

					 fa.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:4: ( faSortRule[fa] )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==SORT) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:6: faSortRule[fa]
					{
					pushFollow(FOLLOW_faSortRule_in_createFuzzyAggregatorRule9173);
					faSortRule(fa);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:4: (f= faForAllRule[fa] |d= faDeriveRule[fa] )+
			int cnt160=0;
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:6: f= faForAllRule[fa]
					{
					pushFollow(FOLLOW_faForAllRule_in_createFuzzyAggregatorRule9227);
					f=faForAllRule(fa);
					state._fsp--;

					 fa.forAllDeriveList.add(f); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:6: d= faDeriveRule[fa]
					{
					pushFollow(FOLLOW_faDeriveRule_in_createFuzzyAggregatorRule9262);
					d=faDeriveRule(fa);
					state._fsp--;

					 fa.forAllDeriveList.add(d); 
					}
					break;

				default :
					if ( cnt160 >= 1 ) break loop160;
					EarlyExitException eee = new EarlyExitException(160, input);
					throw eee;
				}
				cnt160++;
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyAggregatorRule9296); 
			pushFollow(FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule9300);
			e=faExpressionRule(fa, null);
			state._fsp--;

			 fa.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==POLYLINE) ) {
				alt162=1;
			}
			switch (alt162) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyAggregatorRule9327); 
					match(input,LB,FOLLOW_LB_in_createFuzzyAggregatorRule9329); 
					match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule9336); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9340);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9342); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9346);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule9348); 
					 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:8: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9371); 
							match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule9373); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9377);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule9379); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule9383);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule9385); 
							 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
							}
							break;

						default :
							if ( cnt161 >= 1 ) break loop161;
							EarlyExitException eee = new EarlyExitException(161, input);
							throw eee;
						}
						cnt161++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyAggregatorRule9405); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyAggregatorRule9412); 
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



	// $ANTLR start "faForAllRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:885:1: faForAllRule[FuzzyAggregator fa] returns [ForAllClause fac] : FOR ALL v= ID IN ar= ID ( LB x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RB )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID ( COMMA e= faExpressionRule[fa, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* ;
	public final ForAllClause faForAllRule(FuzzyAggregator fa) throws RecognitionException {
		ForAllClause fac = null;


		Token v=null;
		Token ar=null;
		Token id=null;
		Expression x1 =null;
		Expression x2 =null;
		Expression e =null;
		AggregateClause ac =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:886:2: ( FOR ALL v= ID IN ar= ID ( LB x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RB )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID ( COMMA e= faExpressionRule[fa, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:887:3: FOR ALL v= ID IN ar= ID ( LB x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RB )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID ( COMMA e= faExpressionRule[fa, fac] AS id= ID )* )? AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )*
			{
			match(input,FOR,FOLLOW_FOR_in_faForAllRule9433); 
			match(input,ALL,FOLLOW_ALL_in_faForAllRule9435); 
			v=(Token)match(input,ID,FOLLOW_ID_in_faForAllRule9439); 
			match(input,IN,FOLLOW_IN_in_faForAllRule9441); 
			ar=(Token)match(input,ID,FOLLOW_ID_in_faForAllRule9445); 
			 fac = env.createForAllClause(v, ar, fa);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:888:4: ( LB x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RB )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==LB) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:888:6: LB x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RB
					{
					match(input,LB,FOLLOW_LB_in_faForAllRule9470); 
					pushFollow(FOLLOW_faExpressionRule_in_faForAllRule9475);
					x1=faExpressionRule(fa, null);
					state._fsp--;

					 fac.firstIndex = x1; 
					match(input,COMMA,FOLLOW_COMMA_in_faForAllRule9494); 
					pushFollow(FOLLOW_faExpressionRule_in_faForAllRule9498);
					x2=faExpressionRule(fa, null);
					state._fsp--;

					match(input,RB,FOLLOW_RB_in_faForAllRule9502); 
					 fac.lastIndex  = x2; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:890:4: ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID ( COMMA e= faExpressionRule[fa, fac] AS id= ID )* )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==LOCALLY) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:890:6: LOCALLY e= faExpressionRule[fa, fac] AS id= ID ( COMMA e= faExpressionRule[fa, fac] AS id= ID )*
					{
					match(input,LOCALLY,FOLLOW_LOCALLY_in_faForAllRule9532); 
					pushFollow(FOLLOW_faExpressionRule_in_faForAllRule9536);
					e=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,AS,FOLLOW_AS_in_faForAllRule9540); 
					id=(Token)match(input,ID,FOLLOW_ID_in_faForAllRule9544); 
					 env.createLocallyClause(fac, id, e, fa); 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:891:5: ( COMMA e= faExpressionRule[fa, fac] AS id= ID )*
					loop164:
					while (true) {
						int alt164=2;
						int LA164_0 = input.LA(1);
						if ( (LA164_0==COMMA) ) {
							alt164=1;
						}

						switch (alt164) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:891:7: COMMA e= faExpressionRule[fa, fac] AS id= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_faForAllRule9558); 
							pushFollow(FOLLOW_faExpressionRule_in_faForAllRule9562);
							e=faExpressionRule(fa, fac);
							state._fsp--;

							match(input,AS,FOLLOW_AS_in_faForAllRule9566); 
							id=(Token)match(input,ID,FOLLOW_ID_in_faForAllRule9570); 
							 env.createLocallyClause(fac, id, e, fa); 	
							}
							break;

						default :
							break loop164;
						}
					}

					}
					break;

			}

			match(input,AGGREGATE,FOLLOW_AGGREGATE_in_faForAllRule9586); 
			pushFollow(FOLLOW_aggSpecRule_in_faForAllRule9590);
			ac=aggSpecRule(fa, fac);
			state._fsp--;

			 fac.aggregate.add(ac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:893:4: ( COMMA ac= aggSpecRule[fa, fac] )*
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==COMMA) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:893:6: COMMA ac= aggSpecRule[fa, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_faForAllRule9609); 
					pushFollow(FOLLOW_aggSpecRule_in_faForAllRule9613);
					ac=aggSpecRule(fa, fac);
					state._fsp--;

					 fac.aggregate.add(ac);
					}
					break;

				default :
					break loop166;
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
	// $ANTLR end "faForAllRule"



	// $ANTLR start "faDeriveRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:898:1: faDeriveRule[FuzzyAggregator fa] returns [DeriveClause dc] : DERIVE e= faExpressionRule[fa, null] AS id= ID ;
	public final DeriveClause faDeriveRule(FuzzyAggregator fa) throws RecognitionException {
		DeriveClause dc = null;


		Token id=null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:899:2: ( DERIVE e= faExpressionRule[fa, null] AS id= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:3: DERIVE e= faExpressionRule[fa, null] AS id= ID
			{
			match(input,DERIVE,FOLLOW_DERIVE_in_faDeriveRule9667); 
			pushFollow(FOLLOW_faExpressionRule_in_faDeriveRule9671);
			e=faExpressionRule(fa, null);
			state._fsp--;

			match(input,AS,FOLLOW_AS_in_faDeriveRule9675); 
			id=(Token)match(input,ID,FOLLOW_ID_in_faDeriveRule9679); 
			 dc = env.createDeriveClause(id, e, fa); 		
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
	// $ANTLR end "faDeriveRule"



	// $ANTLR start "faSortRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:904:1: faSortRule[FuzzyAggregator fa] : SORT s1= faArraySortRule[fa] ( COMMA s2= faArraySortRule[fa] )* ;
	public final void faSortRule(FuzzyAggregator fa) throws RecognitionException {
		SortFuzzyAggregatorElement s1 =null;
		SortFuzzyAggregatorElement s2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:905:2: ( SORT s1= faArraySortRule[fa] ( COMMA s2= faArraySortRule[fa] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:906:3: SORT s1= faArraySortRule[fa] ( COMMA s2= faArraySortRule[fa] )*
			{
			match(input,SORT,FOLLOW_SORT_in_faSortRule9700); 
			pushFollow(FOLLOW_faArraySortRule_in_faSortRule9704);
			s1=faArraySortRule(fa);
			state._fsp--;

				fa.sortList.add(s1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:907:4: ( COMMA s2= faArraySortRule[fa] )*
			loop167:
			while (true) {
				int alt167=2;
				int LA167_0 = input.LA(1);
				if ( (LA167_0==COMMA) ) {
					alt167=1;
				}

				switch (alt167) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:907:6: COMMA s2= faArraySortRule[fa]
					{
					match(input,COMMA,FOLLOW_COMMA_in_faSortRule9717); 
					pushFollow(FOLLOW_faArraySortRule_in_faSortRule9721);
					s2=faArraySortRule(fa);
					state._fsp--;

						fa.sortList.add(s2); 
					}
					break;

				default :
					break loop167;
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
	// $ANTLR end "faSortRule"



	// $ANTLR start "faArraySortRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:1: faArraySortRule[FuzzyAggregator fa] returns [SortFuzzyAggregatorElement sfae] : ( faArrayIndexRule[fa, sfae] BY faSortFieldRule[fa, sfae] ( COMMA faSortFieldRule[fa, sfae] )* AS i1= ID | LP faArrayIndexRule[fa, sfae] ( COMMA faArrayIndexRule[fa, sfae] )+ RP BY faSortFieldRule[fa, sfae] ( COMMA faSortFieldRule[fa, sfae] )* AS LP i2= ID ( COMMA i3= ID )+ RP );
	public final SortFuzzyAggregatorElement faArraySortRule(FuzzyAggregator fa) throws RecognitionException {
		SortFuzzyAggregatorElement sfae = null;


		Token i1=null;
		Token i2=null;
		Token i3=null;

		 sfae = new SortFuzzyAggregatorElement (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:913:2: ( faArrayIndexRule[fa, sfae] BY faSortFieldRule[fa, sfae] ( COMMA faSortFieldRule[fa, sfae] )* AS i1= ID | LP faArrayIndexRule[fa, sfae] ( COMMA faArrayIndexRule[fa, sfae] )+ RP BY faSortFieldRule[fa, sfae] ( COMMA faSortFieldRule[fa, sfae] )* AS LP i2= ID ( COMMA i3= ID )+ RP )
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==ID) ) {
				alt172=1;
			}
			else if ( (LA172_0==LP) ) {
				alt172=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 172, 0, input);
				throw nvae;
			}

			switch (alt172) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:914:4: faArrayIndexRule[fa, sfae] BY faSortFieldRule[fa, sfae] ( COMMA faSortFieldRule[fa, sfae] )* AS i1= ID
					{
					pushFollow(FOLLOW_faArrayIndexRule_in_faArraySortRule9753);
					faArrayIndexRule(fa, sfae);
					state._fsp--;

					match(input,BY,FOLLOW_BY_in_faArraySortRule9761); 
					pushFollow(FOLLOW_faSortFieldRule_in_faArraySortRule9764);
					faSortFieldRule(fa, sfae);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:6: ( COMMA faSortFieldRule[fa, sfae] )*
					loop168:
					while (true) {
						int alt168=2;
						int LA168_0 = input.LA(1);
						if ( (LA168_0==COMMA) ) {
							alt168=1;
						}

						switch (alt168) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:8: COMMA faSortFieldRule[fa, sfae]
							{
							match(input,COMMA,FOLLOW_COMMA_in_faArraySortRule9775); 
							pushFollow(FOLLOW_faSortFieldRule_in_faArraySortRule9777);
							faSortFieldRule(fa, sfae);
							state._fsp--;

							}
							break;

						default :
							break loop168;
						}
					}

					match(input,AS,FOLLOW_AS_in_faArraySortRule9788); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_faArraySortRule9792); 
					 env.setFuzzyAggregatorNewArray (fa, sfae, i1); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:918:5: LP faArrayIndexRule[fa, sfae] ( COMMA faArrayIndexRule[fa, sfae] )+ RP BY faSortFieldRule[fa, sfae] ( COMMA faSortFieldRule[fa, sfae] )* AS LP i2= ID ( COMMA i3= ID )+ RP
					{
					match(input,LP,FOLLOW_LP_in_faArraySortRule9818); 
					pushFollow(FOLLOW_faArrayIndexRule_in_faArraySortRule9820);
					faArrayIndexRule(fa, sfae);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:919:5: ( COMMA faArrayIndexRule[fa, sfae] )+
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:919:7: COMMA faArrayIndexRule[fa, sfae]
							{
							match(input,COMMA,FOLLOW_COMMA_in_faArraySortRule9830); 
							pushFollow(FOLLOW_faArrayIndexRule_in_faArraySortRule9832);
							faArrayIndexRule(fa, sfae);
							state._fsp--;

							}
							break;

						default :
							if ( cnt169 >= 1 ) break loop169;
							EarlyExitException eee = new EarlyExitException(169, input);
							throw eee;
						}
						cnt169++;
					}

					match(input,RP,FOLLOW_RP_in_faArraySortRule9839); 
					match(input,BY,FOLLOW_BY_in_faArraySortRule9846); 
					pushFollow(FOLLOW_faSortFieldRule_in_faArraySortRule9848);
					faSortFieldRule(fa, sfae);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:921:6: ( COMMA faSortFieldRule[fa, sfae] )*
					loop170:
					while (true) {
						int alt170=2;
						int LA170_0 = input.LA(1);
						if ( (LA170_0==COMMA) ) {
							alt170=1;
						}

						switch (alt170) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:921:8: COMMA faSortFieldRule[fa, sfae]
							{
							match(input,COMMA,FOLLOW_COMMA_in_faArraySortRule9859); 
							pushFollow(FOLLOW_faSortFieldRule_in_faArraySortRule9861);
							faSortFieldRule(fa, sfae);
							state._fsp--;

							}
							break;

						default :
							break loop170;
						}
					}

					match(input,AS,FOLLOW_AS_in_faArraySortRule9872); 
					match(input,LP,FOLLOW_LP_in_faArraySortRule9874); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_faArraySortRule9878); 
					 env.setFuzzyAggregatorNewArray (fa, sfae, i2); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:923:6: ( COMMA i3= ID )+
					int cnt171=0;
					loop171:
					while (true) {
						int alt171=2;
						int LA171_0 = input.LA(1);
						if ( (LA171_0==COMMA) ) {
							alt171=1;
						}

						switch (alt171) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:923:8: COMMA i3= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_faArraySortRule9906); 
							i3=(Token)match(input,ID,FOLLOW_ID_in_faArraySortRule9910); 
							 env.setFuzzyAggregatorNewArray (fa, sfae, i3); 
							}
							break;

						default :
							if ( cnt171 >= 1 ) break loop171;
							EarlyExitException eee = new EarlyExitException(171, input);
							throw eee;
						}
						cnt171++;
					}

					match(input,RP,FOLLOW_RP_in_faArraySortRule9933); 
						env.checkFuzzyAggregatorSortingList (sfae); 
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
		return sfae;
	}
	// $ANTLR end "faArraySortRule"



	// $ANTLR start "faArrayIndexRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:927:1: faArrayIndexRule[FuzzyAggregator fa, SortFuzzyAggregatorElement sfae] : i= ID IN a= ID ;
	public final void faArrayIndexRule(FuzzyAggregator fa, SortFuzzyAggregatorElement sfae) throws RecognitionException {
		Token i=null;
		Token a=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:2: (i= ID IN a= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:929:3: i= ID IN a= ID
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_faArrayIndexRule9979); 
			match(input,IN,FOLLOW_IN_in_faArrayIndexRule9981); 
			a=(Token)match(input,ID,FOLLOW_ID_in_faArrayIndexRule9985); 
			 env.addFuzzyAggregatorSortingArray (fa, sfae, i, a); 
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
	// $ANTLR end "faArrayIndexRule"



	// $ANTLR start "faSortFieldRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:1: faSortFieldRule[FuzzyAggregator fa, SortFuzzyAggregatorElement sfae] : i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )? ;
	public final void faSortFieldRule(FuzzyAggregator fa, SortFuzzyAggregatorElement sfae) throws RecognitionException {
		Token i=null;
		Token t=null;
		Token v=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:2: (i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:3: i= ID (f= fieldRefRule )? TYPE t= ID (v= VERSUS )?
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_faSortFieldRule10013); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:8: (f= fieldRefRule )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==FIELD_NAME) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:9: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_faSortFieldRule10018);
					f=fieldRefRule();
					state._fsp--;

					}
					break;

			}

			match(input,TYPE,FOLLOW_TYPE_in_faSortFieldRule10031); 
			t=(Token)match(input,ID,FOLLOW_ID_in_faSortFieldRule10035); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:3: (v= VERSUS )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==VERSUS) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_faSortFieldRule10044); 
					}
					break;

			}

			 env.addFuzzyAggregatorSortingField (fa, sfae, i, f, t, v); 
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
	// $ANTLR end "faSortFieldRule"



	// $ANTLR start "aggSpecRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:940:1: aggSpecRule[FuzzyAggregator fa, ForAllClause fac] returns [AggregateClause ac] : (wt= withSpec )? e= faExpressionRule[fa, fac] AS a= ID ;
	public final AggregateClause aggSpecRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		AggregateClause ac = null;


		Token a=null;
		String wt =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:2: ( (wt= withSpec )? e= faExpressionRule[fa, fac] AS a= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:942:3: (wt= withSpec )? e= faExpressionRule[fa, fac] AS a= ID
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:942:3: (wt= withSpec )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==WITH) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:942:5: wt= withSpec
					{
					pushFollow(FOLLOW_withSpec_in_aggSpecRule10085);
					wt=withSpec();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_faExpressionRule_in_aggSpecRule10095);
			e=faExpressionRule(fa, fac);
			state._fsp--;

			match(input,AS,FOLLOW_AS_in_aggSpecRule10102); 
			a=(Token)match(input,ID,FOLLOW_ID_in_aggSpecRule10106); 
			 ac = env.createAggregateClause(wt, e, a, fa, fac);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:947:1: withSpec returns [String s] : WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM ) ;
	public final String withSpec() throws RecognitionException {
		String s = null;


		Token x=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:948:2: ( WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:949:4: WITH (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM )
			{
			match(input,WITH,FOLLOW_WITH_in_withSpec10139); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:949:9: (x= SUM |x= PRODUCT |x= MINIMUM |x= MAXIMUM )
			int alt176=4;
			switch ( input.LA(1) ) {
			case SUM:
				{
				alt176=1;
				}
				break;
			case PRODUCT:
				{
				alt176=2;
				}
				break;
			case MINIMUM:
				{
				alt176=3;
				}
				break;
			case MAXIMUM:
				{
				alt176=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 176, 0, input);
				throw nvae;
			}
			switch (alt176) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:949:11: x= SUM
					{
					x=(Token)match(input,SUM,FOLLOW_SUM_in_withSpec10145); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:950:9: x= PRODUCT
					{
					x=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_withSpec10158); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:951:9: x= MINIMUM
					{
					x=(Token)match(input,MINIMUM,FOLLOW_MINIMUM_in_withSpec10171); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:952:9: x= MAXIMUM
					{
					x=(Token)match(input,MAXIMUM,FOLLOW_MAXIMUM_in_withSpec10184); 
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



	// $ANTLR start "faParameterRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:956:1: faParameterRule[FuzzyAggregator fa] : p= ID TYPE (t= ID |t= ARRAY ) ;
	public final void faParameterRule(FuzzyAggregator fa) throws RecognitionException {
		Token p=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:957:2: (p= ID TYPE (t= ID |t= ARRAY ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:958:3: p= ID TYPE (t= ID |t= ARRAY )
			{
			p=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule10217); 
			match(input,TYPE,FOLLOW_TYPE_in_faParameterRule10236); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:959:8: (t= ID |t= ARRAY )
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==ID) ) {
				alt177=1;
			}
			else if ( (LA177_0==ARRAY) ) {
				alt177=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 177, 0, input);
				throw nvae;
			}

			switch (alt177) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:959:9: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule10241); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:959:16: t= ARRAY
					{
					t=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_faParameterRule10247); 
					}
					break;

			}

				env.createFAParameter (fa, p, t); 			
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
	// $ANTLR end "faParameterRule"



	// $ANTLR start "jfOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule10285);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:968:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop178:
			while (true) {
				int alt178=2;
				int LA178_0 = input.LA(1);
				if ( (LA178_0==OR) ) {
					alt178=1;
				}

				switch (alt178) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:968:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule10302); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule10306);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop178;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:976:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule10372);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:977:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop179:
			while (true) {
				int alt179=2;
				int LA179_0 = input.LA(1);
				if ( (LA179_0==AND) ) {
					alt179=1;
				}

				switch (alt179) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:977:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule10390); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule10394);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop179;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:982:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:984:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:984:5: (not= NOT )?
			int alt180=2;
			int LA180_0 = input.LA(1);
			if ( (LA180_0==NOT) ) {
				alt180=1;
			}
			switch (alt180) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:984:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule10462); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule10473);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:990:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule10511);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:993:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt181=3;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==EQ||LA181_0==GE||LA181_0==GT||LA181_0==LE||LA181_0==LT||LA181_0==NEQ) ) {
				alt181=1;
			}
			else if ( (LA181_0==INRANGE) ) {
				alt181=2;
			}
			switch (alt181) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:993:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule10531);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:994:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule10551);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:998:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:999:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1000:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule10598);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule10607);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1005:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1007:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1008:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1008:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==APEX_VALUE||LA183_0==FLOAT||LA183_0==ID||LA183_0==INT||LA183_0==LP||LA183_0==QUOTED_VALUE) ) {
				alt183=1;
			}
			else if ( (LA183_0==ADD||LA183_0==SUB) ) {
				alt183=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 183, 0, input);
				throw nvae;
			}

			switch (alt183) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1008:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule10649);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1009:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1009:6: (s= ADD |s= SUB )
					int alt182=2;
					int LA182_0 = input.LA(1);
					if ( (LA182_0==ADD) ) {
						alt182=1;
					}
					else if ( (LA182_0==SUB) ) {
						alt182=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 182, 0, input);
						throw nvae;
					}

					switch (alt182) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1009:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule10672); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1009:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule10678); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule10683);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1010:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop185:
			while (true) {
				int alt185=2;
				int LA185_0 = input.LA(1);
				if ( (LA185_0==ADD||LA185_0==SUB) ) {
					alt185=1;
				}

				switch (alt185) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1010:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1010:7: (s= ADD |s= SUB )
					int alt184=2;
					int LA184_0 = input.LA(1);
					if ( (LA184_0==ADD) ) {
						alt184=1;
					}
					else if ( (LA184_0==SUB) ) {
						alt184=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 184, 0, input);
						throw nvae;
					}

					switch (alt184) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1010:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule10701); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1010:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule10707); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule10712);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop185;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1014:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1016:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1017:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule10752);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1018:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop187:
			while (true) {
				int alt187=2;
				int LA187_0 = input.LA(1);
				if ( (LA187_0==DIV||LA187_0==MUL) ) {
					alt187=1;
				}

				switch (alt187) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1018:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1018:7: (s= MUL |s= DIV )
					int alt186=2;
					int LA186_0 = input.LA(1);
					if ( (LA186_0==MUL) ) {
						alt186=1;
					}
					else if ( (LA186_0==DIV) ) {
						alt186=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 186, 0, input);
						throw nvae;
					}

					switch (alt186) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1018:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule10777); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1018:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule10783); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule10788);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop187;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1022:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )? ;
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1023:3: ( ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1024:4: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? ) ( EXP e= jfFactorRule[pl, jsCaller] )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1024:4: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt190=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt190=1;
				}
				break;
			case INT:
				{
				alt190=2;
				}
				break;
			case FLOAT:
				{
				alt190=3;
				}
				break;
			case APEX_VALUE:
				{
				alt190=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt190=5;
				}
				break;
			case ID:
				{
				alt190=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 190, 0, input);
				throw nvae;
			}
			switch (alt190) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1024:6: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule10829); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule10833);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule10837); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1025:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule10857); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1026:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule10895); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1027:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule10932); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1028:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule10966); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1029:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule10999); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1030:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt189=2;
					int LA189_0 = input.LA(1);
					if ( (LA189_0==LP) ) {
						alt189=1;
					}
					switch (alt189) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1030:8: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule11039); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1030:14: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt188=2;
							int LA188_0 = input.LA(1);
							if ( (LA188_0==ADD||LA188_0==APEX_VALUE||LA188_0==FLOAT||LA188_0==ID||LA188_0==INT||LA188_0==LP||LA188_0==QUOTED_VALUE||LA188_0==SUB) ) {
								alt188=1;
							}
							switch (alt188) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1030:15: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule11044);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule11050); 
							}
							break;

					}

					 expr = env.checkJFFactor(x, p1, fp, pl, jsCaller); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1032:4: ( EXP e= jfFactorRule[pl, jsCaller] )?
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==EXP) ) {
				alt191=1;
			}
			switch (alt191) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1032:6: EXP e= jfFactorRule[pl, jsCaller]
					{
					match(input,EXP,FOLLOW_EXP_in_jfFactorRule11077); 
					pushFollow(FOLLOW_jfFactorRule_in_jfFactorRule11081);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1036:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1038:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1039:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11135);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1040:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop192:
			while (true) {
				int alt192=2;
				int LA192_0 = input.LA(1);
				if ( (LA192_0==COMMA) ) {
					alt192=1;
				}

				switch (alt192) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1040:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule11155); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11159);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
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
		return params;
	}
	// $ANTLR end "jfFunctionParamsRule"



	// $ANTLR start "faExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1046:1: faExpressionRule[FuzzyAggregator fa, ForAllClause fac] returns [Expression expr] : (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* ;
	public final Expression faExpressionRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1048:3: ( (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1049:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1049:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] )
			int alt194=2;
			int LA194_0 = input.LA(1);
			if ( (LA194_0==APEX_VALUE||LA194_0==FLOAT||LA194_0==ID||LA194_0==INT||LA194_0==LP||LA194_0==POS||LA194_0==QUOTED_VALUE) ) {
				alt194=1;
			}
			else if ( (LA194_0==ADD||LA194_0==SUB) ) {
				alt194=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 194, 0, input);
				throw nvae;
			}

			switch (alt194) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1049:6: t= faTermRule[fa, fac]
					{
					pushFollow(FOLLOW_faTermRule_in_faExpressionRule11207);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1050:6: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1050:6: (s= ADD |s= SUB )
					int alt193=2;
					int LA193_0 = input.LA(1);
					if ( (LA193_0==ADD) ) {
						alt193=1;
					}
					else if ( (LA193_0==SUB) ) {
						alt193=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 193, 0, input);
						throw nvae;
					}

					switch (alt193) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1050:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule11229); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1050:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule11235); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule11240);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:5: ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			loop196:
			while (true) {
				int alt196=2;
				int LA196_0 = input.LA(1);
				if ( (LA196_0==ADD||LA196_0==SUB) ) {
					alt196=1;
				}

				switch (alt196) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:7: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:7: (s= ADD |s= SUB )
					int alt195=2;
					int LA195_0 = input.LA(1);
					if ( (LA195_0==ADD) ) {
						alt195=1;
					}
					else if ( (LA195_0==SUB) ) {
						alt195=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 195, 0, input);
						throw nvae;
					}

					switch (alt195) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule11257); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule11263); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule11268);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop196;
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
	// $ANTLR end "faExpressionRule"



	// $ANTLR start "faTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1054:1: faTermRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionTerm et] : f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* ;
	public final ExpressionTerm faTermRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1056:3: (f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1057:4: f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			{
			pushFollow(FOLLOW_faFactorRule_in_faTermRule11307);
			f=faFactorRule(fa, fac);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:5: ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			loop198:
			while (true) {
				int alt198=2;
				int LA198_0 = input.LA(1);
				if ( (LA198_0==DIV||LA198_0==MUL) ) {
					alt198=1;
				}

				switch (alt198) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:7: (s= MUL |s= DIV ) f= faFactorRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:7: (s= MUL |s= DIV )
					int alt197=2;
					int LA197_0 = input.LA(1);
					if ( (LA197_0==MUL) ) {
						alt197=1;
					}
					else if ( (LA197_0==DIV) ) {
						alt197=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 197, 0, input);
						throw nvae;
					}

					switch (alt197) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_faTermRule11332); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_faTermRule11338); 
							}
							break;

					}

					pushFollow(FOLLOW_faFactorRule_in_faTermRule11343);
					f=faFactorRule(fa, fac);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop198;
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
	// $ANTLR end "faTermRule"



	// $ANTLR start "faFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1062:1: faFactorRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionFactor expr] : ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] | LP fp= faFunctionParamsRule[fa, fac] RP )? ) ( EXP e= faFactorRule[fa, fac] )? ;
	public final ExpressionFactor faFactorRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Expression op =null;
		ArrayReference ref =null;
		ArrayList<Expression> fp =null;
		ExpressionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:3: ( ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] | LP fp= faFunctionParamsRule[fa, fac] RP )? ) ( EXP e= faFactorRule[fa, fac] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1064:4: ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] | LP fp= faFunctionParamsRule[fa, fac] RP )? ) ( EXP e= faFactorRule[fa, fac] )?
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1064:4: ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] | LP fp= faFunctionParamsRule[fa, fac] RP )? )
			int alt200=7;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt200=1;
				}
				break;
			case INT:
				{
				alt200=2;
				}
				break;
			case FLOAT:
				{
				alt200=3;
				}
				break;
			case APEX_VALUE:
				{
				alt200=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt200=5;
				}
				break;
			case POS:
				{
				alt200=6;
				}
				break;
			case ID:
				{
				alt200=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 200, 0, input);
				throw nvae;
			}
			switch (alt200) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1064:6: LP op= faExpressionRule[fa, fac] RP
					{
					match(input,LP,FOLLOW_LP_in_faFactorRule11382); 
					pushFollow(FOLLOW_faExpressionRule_in_faFactorRule11387);
					op=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_faFactorRule11391); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_faFactorRule11409); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1066:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_faFactorRule11443); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1067:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_faFactorRule11476); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1068:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_faFactorRule11506); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1069:6: v= POS
					{
					v=(Token)match(input,POS,FOLLOW_POS_in_faFactorRule11535); 
					 expr = new ExpressionFactor (v.getText()); 
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:6: x= ID (ref= faArrayRefRule[x, fa] | LP fp= faFunctionParamsRule[fa, fac] RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_faFactorRule11569); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:11: (ref= faArrayRefRule[x, fa] | LP fp= faFunctionParamsRule[fa, fac] RP )?
					int alt199=3;
					int LA199_0 = input.LA(1);
					if ( (LA199_0==LB) ) {
						alt199=1;
					}
					else if ( (LA199_0==LP) ) {
						alt199=2;
					}
					switch (alt199) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:13: ref= faArrayRefRule[x, fa]
							{
							pushFollow(FOLLOW_faArrayRefRule_in_faFactorRule11575);
							ref=faArrayRefRule(x, fa);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:10: LP fp= faFunctionParamsRule[fa, fac] RP
							{
							match(input,LP,FOLLOW_LP_in_faFactorRule11588); 
							pushFollow(FOLLOW_faFunctionParamsRule_in_faFactorRule11592);
							fp=faFunctionParamsRule(fa, fac);
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_faFactorRule11596); 
							}
							break;

					}

					 expr = env.setFuzzyAggregatorExprFromArrayRef(x, fp, ref, fa, fac);
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:4: ( EXP e= faFactorRule[fa, fac] )?
			int alt201=2;
			int LA201_0 = input.LA(1);
			if ( (LA201_0==EXP) ) {
				alt201=1;
			}
			switch (alt201) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:6: EXP e= faFactorRule[fa, fac]
					{
					match(input,EXP,FOLLOW_EXP_in_faFactorRule11613); 
					pushFollow(FOLLOW_faFactorRule_in_faFactorRule11617);
					e=faFactorRule(fa, fac);
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
	// $ANTLR end "faFactorRule"



	// $ANTLR start "faFunctionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1077:1: faFunctionParamsRule[FuzzyAggregator fa, ForAllClause fac] returns [ArrayList<Expression> params] : e= faExpressionRule[fa, fac] ( COMMA e= faExpressionRule[fa, fac] )* ;
	public final ArrayList<Expression> faFunctionParamsRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1079:3: (e= faExpressionRule[fa, fac] ( COMMA e= faExpressionRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:4: e= faExpressionRule[fa, fac] ( COMMA e= faExpressionRule[fa, fac] )*
			{
			pushFollow(FOLLOW_faExpressionRule_in_faFunctionParamsRule11669);
			e=faExpressionRule(fa, fac);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1081:6: ( COMMA e= faExpressionRule[fa, fac] )*
			loop202:
			while (true) {
				int alt202=2;
				int LA202_0 = input.LA(1);
				if ( (LA202_0==COMMA) ) {
					alt202=1;
				}

				switch (alt202) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1081:8: COMMA e= faExpressionRule[fa, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_faFunctionParamsRule11690); 
					pushFollow(FOLLOW_faExpressionRule_in_faFunctionParamsRule11694);
					e=faExpressionRule(fa, fac);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop202;
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
	// $ANTLR end "faFunctionParamsRule"



	// $ANTLR start "faArrayRefRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1085:1: faArrayRefRule[Token id, FuzzyAggregator fa] returns [ArrayReference ref] : LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? ;
	public final ArrayReference faArrayRefRule(Token id, FuzzyAggregator fa) throws RecognitionException {
		ArrayReference ref = null;


		Expression e =null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1086:2: ( LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1087:3: LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )?
			{
			match(input,LB,FOLLOW_LB_in_faArrayRefRule11728); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1087:6: (e= faExpressionRule[fa, null] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1087:7: e= faExpressionRule[fa, null]
			{
			pushFollow(FOLLOW_faExpressionRule_in_faArrayRefRule11733);
			e=faExpressionRule(fa, null);
			state._fsp--;

			}

			match(input,RB,FOLLOW_RB_in_faArrayRefRule11738); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1088:3: (f= fieldRefRule )?
			int alt203=2;
			int LA203_0 = input.LA(1);
			if ( (LA203_0==FIELD_NAME) ) {
				alt203=1;
			}
			switch (alt203) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1088:4: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_faArrayRefRule11748);
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
	// $ANTLR end "faArrayRefRule"



	// $ANTLR start "createFuzzySetModelRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1096:1: createFuzzySetModelRule : CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC ;
	public final void createFuzzySetModelRule() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token n=null;
		Expression e =null;
		Condition c =null;
		FuzzyOperatorDefinition fo =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1096:24: ( CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1097:3: CREATE FUZZY SET MODEL t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )? (fo= fuzzyOperatorDefinitionRule[fm] )* SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzySetModelRule11768); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzySetModelRule11770); 
			match(input,SET,FOLLOW_SET_in_createFuzzySetModelRule11772); 
			match(input,MODEL,FOLLOW_MODEL_in_createFuzzySetModelRule11774); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule11778); 
			 FuzzySetModel fm = env.addFuzzySetModel (t);	
			match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetModelRule11788); 
			p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule11794); 
			 env.addDegreeType(fm, p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:6: ( COMMA p= ID )*
			loop204:
			while (true) {
				int alt204=2;
				int LA204_0 = input.LA(1);
				if ( (LA204_0==COMMA) ) {
					alt204=1;
				}

				switch (alt204) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:8: COMMA p= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetModelRule11814); 
					p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule11818); 
					 env.addDegreeType(fm, p); 
					}
					break;

				default :
					break loop204;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:4: ( DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )* )?
			int alt206=2;
			int LA206_0 = input.LA(1);
			if ( (LA206_0==DERIVED) ) {
				alt206=1;
			}
			switch (alt206) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:6: DERIVED DEGREES n= ID AS e= ftExpressionRule[fm.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )*
					{
					match(input,DERIVED,FOLLOW_DERIVED_in_createFuzzySetModelRule11844); 
					match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetModelRule11846); 
					n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule11850); 
					 env.checkDerivedDegree(fm, n);  
					match(input,AS,FOLLOW_AS_in_createFuzzySetModelRule11863); 
					pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetModelRule11867);
					e=ftExpressionRule(fm.getDegreesList());
					state._fsp--;

					 env.addDerivedDegree(fm, n, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1102:6: ( COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()] )*
					loop205:
					while (true) {
						int alt205=2;
						int LA205_0 = input.LA(1);
						if ( (LA205_0==COMMA) ) {
							alt205=1;
						}

						switch (alt205) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1102:8: COMMA n= ID AS e= ftExpressionRule[fm.getDegreesList()]
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetModelRule11881); 
							n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetModelRule11888); 
							 env.checkDerivedDegree(fm, n);  
							match(input,AS,FOLLOW_AS_in_createFuzzySetModelRule11912); 
							pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetModelRule11916);
							e=ftExpressionRule(fm.getDegreesList());
							state._fsp--;

							 env.addDerivedDegree(fm, n, e); 
							}
							break;

						default :
							break loop205;
						}
					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1105:4: ( CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false] )?
			int alt207=2;
			int LA207_0 = input.LA(1);
			if ( (LA207_0==CONSTRAINT) ) {
				alt207=1;
			}
			switch (alt207) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1105:6: CONSTRAINT c= jfOrConditionRule[fm.getAllDegreesList(), false]
					{
					match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_createFuzzySetModelRule11935); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzySetModelRule11939);
					c=jfOrConditionRule(fm.getAllDegreesList(), false);
					state._fsp--;

					 fm.constraint=c; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:4: (fo= fuzzyOperatorDefinitionRule[fm] )*
			loop208:
			while (true) {
				int alt208=2;
				int LA208_0 = input.LA(1);
				if ( (LA208_0==OPERATOR) ) {
					alt208=1;
				}

				switch (alt208) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:6: fo= fuzzyOperatorDefinitionRule[fm]
					{
					pushFollow(FOLLOW_fuzzyOperatorDefinitionRule_in_createFuzzySetModelRule11958);
					fo=fuzzyOperatorDefinitionRule(fm);
					state._fsp--;

					}
					break;

				default :
					break loop208;
				}
			}

			match(input,SC,FOLLOW_SC_in_createFuzzySetModelRule11966); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1110:1: fuzzyOperatorDefinitionRule[FuzzySetModel fm] returns [FuzzyOperatorDefinition defOp] : OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+ ;
	public final FuzzyOperatorDefinition fuzzyOperatorDefinitionRule(FuzzySetModel fm) throws RecognitionException {
		FuzzyOperatorDefinition defOp = null;


		Token o=null;
		Token x=null;
		Expression exp =null;

		 defOp = new FuzzyOperatorDefinition(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1111:49: ( OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1112:2: OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+
			{
			match(input,OPERATOR,FOLLOW_OPERATOR_in_fuzzyOperatorDefinitionRule11987); 
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1113:2: ( EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot] )+
			int cnt209=0;
			loop209:
			while (true) {
				int alt209=2;
				int LA209_0 = input.LA(1);
				if ( (LA209_0==EVALUATE) ) {
					alt209=1;
				}

				switch (alt209) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1113:4: EVALUATE x= ID AS exp= ftConditionExpressionRule[fm.getDegreesList(), isNot]
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_fuzzyOperatorDefinitionRule12027); 
					x=(Token)match(input,ID,FOLLOW_ID_in_fuzzyOperatorDefinitionRule12031); 
					match(input,AS,FOLLOW_AS_in_fuzzyOperatorDefinitionRule12033); 
						env.checkOperatorDegree(defOp, x, fm);	
					pushFollow(FOLLOW_ftConditionExpressionRule_in_fuzzyOperatorDefinitionRule12065);
					exp=ftConditionExpressionRule(fm.getDegreesList(), isNot);
					state._fsp--;

						env.addOperatorDegree(defOp, x, exp);	
					}
					break;

				default :
					if ( cnt209 >= 1 ) break loop209;
					EarlyExitException eee = new EarlyExitException(209, input);
					throw eee;
				}
				cnt209++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1118:1: createGenericFuzzySetOperatorRule : CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList()] ( COMMA p= parameterRule[gfo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1118:34: ( CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList()] ( COMMA p= parameterRule[gfo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1119:3: CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[gfo.getParamList()] ( COMMA p= parameterRule[gfo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule12126); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule12130); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule12132); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule12134); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule12138); 
			 GenericFuzzyOperator gfo = env.addGenericFuzzyOperator(t, n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule12154); 
			pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12158);
			p=parameterRule(gfo.getParamList());
			state._fsp--;

			 gfo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1121:4: ( COMMA p= parameterRule[gfo.getParamList()] )*
			loop210:
			while (true) {
				int alt210=2;
				int LA210_0 = input.LA(1);
				if ( (LA210_0==COMMA) ) {
					alt210=1;
				}

				switch (alt210) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1121:6: COMMA p= parameterRule[gfo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12178); 
					pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12183);
					p=parameterRule(gfo.getParamList());
					state._fsp--;

					 gfo.parameters.add (p); 
					}
					break;

				default :
					break loop210;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1122:3: ( PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false] )?
			int alt211=2;
			int LA211_0 = input.LA(1);
			if ( (LA211_0==PRECONDITION) ) {
				alt211=1;
			}
			switch (alt211) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1122:5: PRECONDITION pc= jfOrConditionRule[gfo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule12206); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule12210);
					pc=jfOrConditionRule(gfo.getParamList(), false);
					state._fsp--;

					 gfo.precondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1123:3: ( EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+
			int cnt214=0;
			loop214:
			while (true) {
				int alt214=2;
				int LA214_0 = input.LA(1);
				if ( (LA214_0==EVALUATE) ) {
					alt214=1;
				}

				switch (alt214) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1124:4: EVALUATE g= ID AS e= jfExpressionRule[gfo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule12230); 
					g=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule12234); 
					 Parameter ev = env.createFgoParameter (g); 
					match(input,AS,FOLLOW_AS_in_createGenericFuzzySetOperatorRule12262); 
					pushFollow(FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule12266);
					e=jfExpressionRule(gfo.getParamList(), false);
					state._fsp--;

					 FuzzyPolyline fp = env.manageEvaluate(gfo, ev, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1126:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					int alt213=2;
					int LA213_0 = input.LA(1);
					if ( (LA213_0==POLYLINE) ) {
						alt213=1;
					}
					switch (alt213) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1127:5: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
							{
							match(input,POLYLINE,FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule12285); 
							match(input,LB,FOLLOW_LB_in_createGenericFuzzySetOperatorRule12287); 
							match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule12298); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12302);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12304); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12308);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule12310); 
							 env.addFuzzyPolylinePoint (fp, x, y); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1129:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
							int cnt212=0;
							loop212:
							while (true) {
								int alt212=2;
								int LA212_0 = input.LA(1);
								if ( (LA212_0==COMMA) ) {
									alt212=1;
								}

								switch (alt212) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1129:8: COMMA LP x= numericRule COMMA y= numericRule RP
									{
									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12327); 
									match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule12329); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12333);
									x=numericRule();
									state._fsp--;

									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12335); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12339);
									y=numericRule();
									state._fsp--;

									match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule12341); 
									 env.addFuzzyPolylinePoint (fp, x, y); 
									}
									break;

								default :
									if ( cnt212 >= 1 ) break loop212;
									EarlyExitException eee = new EarlyExitException(212, input);
									throw eee;
								}
								cnt212++;
							}

							match(input,RB,FOLLOW_RB_in_createGenericFuzzySetOperatorRule12355); 
							}
							break;

					}

					 gfo.polylines.add(fp); 
					}
					break;

				default :
					if ( cnt214 >= 1 ) break loop214;
					EarlyExitException eee = new EarlyExitException(214, input);
					throw eee;
				}
				cnt214++;
			}

			match(input,SC,FOLLOW_SC_in_createGenericFuzzySetOperatorRule12414); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:1: ftExpressionRule[ParamList pl] returns [Expression expr] : (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* ;
	public final Expression ftExpressionRule(ParamList pl) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1141:3: ( (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1142:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1142:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] )
			int alt216=2;
			int LA216_0 = input.LA(1);
			if ( (LA216_0==ARRAY_FUNCTION||LA216_0==DEGREE||LA216_0==EXTENT||LA216_0==FLOAT||(LA216_0 >= ID && LA216_0 <= IF_ERROR)||LA216_0==INT||LA216_0==LP||(LA216_0 >= MEMBERSHIP_ARRAY && LA216_0 <= MEMBERSHIP_TO)||LA216_0==TRANSLATE) ) {
				alt216=1;
			}
			else if ( (LA216_0==ADD||LA216_0==SUB) ) {
				alt216=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 216, 0, input);
				throw nvae;
			}

			switch (alt216) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1142:6: t= ftTermRule[pl]
					{
					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule12448);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1143:6: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1143:6: (s= ADD |s= SUB )
					int alt215=2;
					int LA215_0 = input.LA(1);
					if ( (LA215_0==ADD) ) {
						alt215=1;
					}
					else if ( (LA215_0==SUB) ) {
						alt215=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 215, 0, input);
						throw nvae;
					}

					switch (alt215) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1143:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule12470); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1143:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule12476); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule12481);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:5: ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			loop218:
			while (true) {
				int alt218=2;
				int LA218_0 = input.LA(1);
				if ( (LA218_0==ADD||LA218_0==SUB) ) {
					alt218=1;
				}

				switch (alt218) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:7: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:7: (s= ADD |s= SUB )
					int alt217=2;
					int LA217_0 = input.LA(1);
					if ( (LA217_0==ADD) ) {
						alt217=1;
					}
					else if ( (LA217_0==SUB) ) {
						alt217=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 217, 0, input);
						throw nvae;
					}

					switch (alt217) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule12498); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule12504); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule12509);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop218;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1147:1: ftTermRule[ParamList pl] returns [ExpressionTerm et] : f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* ;
	public final ExpressionTerm ftTermRule(ParamList pl) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1149:3: (f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1150:4: f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			{
			pushFollow(FOLLOW_ftFactorRule_in_ftTermRule12546);
			f=ftFactorRule(pl);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:5: ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			loop220:
			while (true) {
				int alt220=2;
				int LA220_0 = input.LA(1);
				if ( (LA220_0==DIV||LA220_0==MUL) ) {
					alt220=1;
				}

				switch (alt220) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:7: (s= MUL |s= DIV ) f= ftFactorRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:7: (s= MUL |s= DIV )
					int alt219=2;
					int LA219_0 = input.LA(1);
					if ( (LA219_0==MUL) ) {
						alt219=1;
					}
					else if ( (LA219_0==DIV) ) {
						alt219=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 219, 0, input);
						throw nvae;
					}

					switch (alt219) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftTermRule12571); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftTermRule12577); 
							}
							break;

					}

					pushFollow(FOLLOW_ftFactorRule_in_ftTermRule12582);
					f=ftFactorRule(pl);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop220;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1154:1: ftFactorRule[ParamList pl] returns [ExpressionFactor ef] : ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule );
	public final ExpressionFactor ftFactorRule(ParamList pl) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1154:57: ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule )
			int alt222=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt222=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt222=2;
				}
				break;
			case ID:
				{
				int LA222_4 = input.LA(2);
				if ( (LA222_4==LP) ) {
					alt222=4;
				}
				else if ( (LA222_4==ADD||LA222_4==COMMA||LA222_4==CONSTRAINT||LA222_4==DIV||LA222_4==MUL||LA222_4==OPERATOR||LA222_4==RP||LA222_4==SC||LA222_4==SUB) ) {
					alt222=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 222, 4, input);
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
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt222=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 222, 0, input);
				throw nvae;
			}
			switch (alt222) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1155:5: LP op= ftExpressionRule[pl] RP
					{
					match(input,LP,FOLLOW_LP_in_ftFactorRule12614); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFactorRule12618);
					op=ftExpressionRule(pl);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftFactorRule12621); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1156:6: vl= ftValueRule
					{
					pushFollow(FOLLOW_ftValueRule_in_ftFactorRule12641);
					vl=ftValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1157:6: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule12668); 
					 ef = env.checkDegree(pl,x);	 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:6: x= ID LP (fp= ftFunctionParamsRule[pl] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule12700); 
					match(input,LP,FOLLOW_LP_in_ftFactorRule12702); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:14: (fp= ftFunctionParamsRule[pl] )?
					int alt221=2;
					int LA221_0 = input.LA(1);
					if ( (LA221_0==ADD||LA221_0==ARRAY_FUNCTION||LA221_0==DEGREE||LA221_0==EXTENT||LA221_0==FLOAT||(LA221_0 >= ID && LA221_0 <= IF_ERROR)||LA221_0==INT||LA221_0==LP||(LA221_0 >= MEMBERSHIP_ARRAY && LA221_0 <= MEMBERSHIP_TO)||LA221_0==SUB||LA221_0==TRANSLATE) ) {
						alt221=1;
					}
					switch (alt221) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:15: fp= ftFunctionParamsRule[pl]
							{
							pushFollow(FOLLOW_ftFunctionParamsRule_in_ftFactorRule12707);
							fp=ftFunctionParamsRule(pl);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftFactorRule12712); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1159:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_ftFactorRule12727);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1162:1: ftValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1162:31: (n= INT |f= FLOAT )
			int alt223=2;
			int LA223_0 = input.LA(1);
			if ( (LA223_0==INT) ) {
				alt223=1;
			}
			else if ( (LA223_0==FLOAT) ) {
				alt223=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 223, 0, input);
				throw nvae;
			}

			switch (alt223) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1163:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftValueRule12752); 
					 vl = new Value (Value.INT, n.getText());   
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1164:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftValueRule12772); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1167:1: ftFunctionParamsRule[ParamList pl] returns [ArrayList<Expression> params] : e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* ;
	public final ArrayList<Expression> ftFunctionParamsRule(ParamList pl) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1169:3: (e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1170:4: e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )*
			{
			pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule12808);
			e=ftExpressionRule(pl);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1171:6: ( COMMA e= ftExpressionRule[pl] )*
			loop224:
			while (true) {
				int alt224=2;
				int LA224_0 = input.LA(1);
				if ( (LA224_0==COMMA) ) {
					alt224=1;
				}

				switch (alt224) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1171:8: COMMA e= ftExpressionRule[pl]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftFunctionParamsRule12829); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule12833);
					e=ftExpressionRule(pl);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop224;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1177:1: ftConditionExpressionRule[ParamList pl, boolean isNot] returns [Expression expr] : (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* ;
	public final Expression ftConditionExpressionRule(ParamList pl, boolean isNot) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1179:4: ( (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1180:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1180:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )
			int alt226=2;
			int LA226_0 = input.LA(1);
			if ( (LA226_0==ARRAY_FUNCTION||LA226_0==DEGREE||LA226_0==EXTENT||LA226_0==FLOAT||(LA226_0 >= ID && LA226_0 <= IF_ERROR)||LA226_0==INT||LA226_0==LP||(LA226_0 >= MEMBERSHIP_ARRAY && LA226_0 <= MEMBERSHIP_TO)||LA226_0==TRANSLATE) ) {
				alt226=1;
			}
			else if ( (LA226_0==ADD||LA226_0==SUB) ) {
				alt226=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 226, 0, input);
				throw nvae;
			}

			switch (alt226) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1180:6: t= ftConditionTermRule[pl,isNot]
					{
					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule12883);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:6: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:6: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule12907); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule12913); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule12918);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:5: ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			loop228:
			while (true) {
				int alt228=2;
				int LA228_0 = input.LA(1);
				if ( (LA228_0==ADD||LA228_0==SUB) ) {
					alt228=1;
				}

				switch (alt228) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:7: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:7: (s= ADD |s= SUB )
					int alt227=2;
					int LA227_0 = input.LA(1);
					if ( (LA227_0==ADD) ) {
						alt227=1;
					}
					else if ( (LA227_0==SUB) ) {
						alt227=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 227, 0, input);
						throw nvae;
					}

					switch (alt227) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule12937); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule12943); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule12948);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
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
		return expr;
	}
	// $ANTLR end "ftConditionExpressionRule"



	// $ANTLR start "ftConditionTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1186:1: ftConditionTermRule[ParamList pl, boolean isNot] returns [ExpressionTerm et] : f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* ;
	public final ExpressionTerm ftConditionTermRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1188:4: (f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1189:4: f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule12983);
			f=ftConditionFactorRule(pl, isNot);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:5: ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			loop230:
			while (true) {
				int alt230=2;
				int LA230_0 = input.LA(1);
				if ( (LA230_0==DIV||LA230_0==MUL) ) {
					alt230=1;
				}

				switch (alt230) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:7: (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:7: (s= MUL |s= DIV )
					int alt229=2;
					int LA229_0 = input.LA(1);
					if ( (LA229_0==MUL) ) {
						alt229=1;
					}
					else if ( (LA229_0==DIV) ) {
						alt229=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 229, 0, input);
						throw nvae;
					}

					switch (alt229) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftConditionTermRule13000); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1190:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftConditionTermRule13006); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule13011);
					f=ftConditionFactorRule(pl, isNot);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop230;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1193:1: ftConditionFactorRule[ParamList pl, boolean isNot] returns [ExpressionFactor ef] : ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= specialFunctionRule );
	public final ExpressionFactor ftConditionFactorRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Token f=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1194:5: ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= specialFunctionRule )
			int alt232=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt232=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt232=2;
				}
				break;
			case ID:
				{
				int LA232_4 = input.LA(2);
				if ( (LA232_4==FIELD_NAME) ) {
					alt232=3;
				}
				else if ( (LA232_4==LP) ) {
					alt232=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 232, 4, input);
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
			case IF_ERROR:
			case MEMBERSHIP_ARRAY:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt232=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 232, 0, input);
				throw nvae;
			}
			switch (alt232) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1195:5: LP op= ftConditionExpressionRule[pl,isNot] RP
					{
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule13041); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule13045);
					op=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule13048); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1196:6: vl= ftConditionValueRule
					{
					pushFollow(FOLLOW_ftConditionValueRule_in_ftConditionFactorRule13066);
					vl=ftConditionValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1197:6: x= ID f= FIELD_NAME
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule13095); 
					f=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_ftConditionFactorRule13099); 
					 ef = env.makeExpDegree(x, f, isNot, pl); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1198:6: x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule13130); 
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule13132); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1198:14: (fp= ftConditionFunctionParamsRule[pl,isNot] )?
					int alt231=2;
					int LA231_0 = input.LA(1);
					if ( (LA231_0==ADD||LA231_0==ARRAY_FUNCTION||LA231_0==DEGREE||LA231_0==EXTENT||LA231_0==FLOAT||(LA231_0 >= ID && LA231_0 <= IF_ERROR)||LA231_0==INT||LA231_0==LP||(LA231_0 >= MEMBERSHIP_ARRAY && LA231_0 <= MEMBERSHIP_TO)||LA231_0==SUB||LA231_0==TRANSLATE) ) {
						alt231=1;
					}
					switch (alt231) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1198:15: fp= ftConditionFunctionParamsRule[pl,isNot]
							{
							pushFollow(FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule13137);
							fp=ftConditionFunctionParamsRule(pl, isNot);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule13142); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1199:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_ftConditionFactorRule13155);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1203:1: ftConditionValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftConditionValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1204:5: (n= INT |f= FLOAT )
			int alt233=2;
			int LA233_0 = input.LA(1);
			if ( (LA233_0==INT) ) {
				alt233=1;
			}
			else if ( (LA233_0==FLOAT) ) {
				alt233=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 233, 0, input);
				throw nvae;
			}

			switch (alt233) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1205:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftConditionValueRule13201); 
					 vl = new Value (Value.INT, n.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftConditionValueRule13221); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1209:1: ftConditionFunctionParamsRule[ParamList pl, boolean isNot] returns [ArrayList<Expression> params] : e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* ;
	public final ArrayList<Expression> ftConditionFunctionParamsRule(ParamList pl, boolean isNot) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1211:3: (e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1212:4: e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule13259);
			e=ftConditionExpressionRule(pl, isNot);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:6: ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			loop234:
			while (true) {
				int alt234=2;
				int LA234_0 = input.LA(1);
				if ( (LA234_0==COMMA) ) {
					alt234=1;
				}

				switch (alt234) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:8: COMMA e= ftConditionExpressionRule[pl,isNot]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftConditionFunctionParamsRule13278); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule13282);
					e=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop234;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1224:1: createJavaFunctionRule : CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC ;
	public final void createJavaFunctionRule() throws RecognitionException {
		Token jfn=null;
		Token cl=null;
		Token imp=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1225:2: ( CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1226:4: CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaFunctionRule13318); 
			match(input,JAVA,FOLLOW_JAVA_in_createJavaFunctionRule13320); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaFunctionRule13322); 
			jfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule13330); 
			 JavaFunction jf = env.addJavaFunction (jfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaFunctionRule13362); 
			pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule13372);
			p=parameterRule(jf.getParamList());
			state._fsp--;

			 jf.parameters.add (p); 					
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1230:5: ( COMMA p= parameterRule[jf.getParamList()] )*
			loop235:
			while (true) {
				int alt235=2;
				int LA235_0 = input.LA(1);
				if ( (LA235_0==COMMA) ) {
					alt235=1;
				}

				switch (alt235) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1230:7: COMMA p= parameterRule[jf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaFunctionRule13396); 
					pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule13400);
					p=parameterRule(jf.getParamList());
					state._fsp--;

					 jf.parameters.add (p);					
					}
					break;

				default :
					break loop235;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1231:4: ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )?
			int alt236=2;
			int LA236_0 = input.LA(1);
			if ( (LA236_0==PRECONDITION) ) {
				alt236=1;
			}
			switch (alt236) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1231:6: PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaFunctionRule13423); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaFunctionRule13427);
					pc=jfOrConditionRule(jf.getParamList(), true);
					state._fsp--;

						jf.preCondition = pc; 					
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule13440); 
			cl=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule13444); 
				jf.setClass (cl.getText());		
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1233:4: ( IMPORT imp= QUOTED_VALUE )?
			int alt237=2;
			int LA237_0 = input.LA(1);
			if ( (LA237_0==IMPORT) ) {
				alt237=1;
			}
			switch (alt237) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1233:6: IMPORT imp= QUOTED_VALUE
					{
					match(input,IMPORT,FOLLOW_IMPORT_in_createJavaFunctionRule13478); 
					imp=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule13482); 
						jf.setImport (imp.getText()); 	
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule13511); 
			match(input,BODY,FOLLOW_BODY_in_createJavaFunctionRule13513); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaFunctionRule13526); 
			match(input,SC,FOLLOW_SC_in_createJavaFunctionRule13532); 
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



	public static final BitSet FOLLOW_getCollectionRule_in_start69 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_saveAsRule_in_start95 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start128 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_filterRule_in_start150 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_groupRule_in_start183 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_expandRule_in_start217 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start250 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start273 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start292 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_useDbRule_in_start312 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start346 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start365 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start380 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start392 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start410 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_createFuzzyAggregatorRule_in_start428 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_createFuzzySetModelRule_in_start444 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_createGenericFuzzySetOperatorRule_in_start459 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_createJavaFunctionRule_in_start469 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_test_in_start484 = new BitSet(new long[]{0x4200000200000000L,0x0008080102000600L,0x0000802082010000L});
	public static final BitSet FOLLOW_EOF_in_start520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_test533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule557 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule571 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule635 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule675 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule729 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule740 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule761 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule765 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule806 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule820 = new BitSet(new long[]{0x240000200008A000L,0x0006106001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule991 = new BitSet(new long[]{0x2000000000000080L,0x0000000000000000L,0x0000000040000008L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule1009 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1011 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1015 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule1017 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule1043 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1045 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1121 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1123 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_dropGeometryRule1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_GEOMETRY_in_dropGeometryRule1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASES_in_caseClauseRule1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1257 = new BitSet(new long[]{0x0002000000000002L,0x0000000200000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_DROP_in_othersRule1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1381 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1447 = new BitSet(new long[]{0x0004001002100402L,0x0000000400000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1464 = new BitSet(new long[]{0x0004001002100402L,0x0000000400000000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1481 = new BitSet(new long[]{0x0004001000100402L,0x0000000400000000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1512 = new BitSet(new long[]{0x0004001000100002L,0x0000000400000000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1550 = new BitSet(new long[]{0x0004001000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1570 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_dropGeometryRule_in_generateSectionRule1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1649 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1664 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1668 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1725 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1741 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1745 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1807 = new BitSet(new long[]{0x2C0000200008A010L,0x0006102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1863 = new BitSet(new long[]{0x0040000000000002L,0x0100208000801040L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule1891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule1975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule2001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule2021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule2057 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule2066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule2095 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule2101 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_LP_in_inRangeRule2107 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2117 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule2119 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008400L});
	public static final BitSet FOLLOW_RP_in_inRangeRule2132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule2177 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2181 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2306 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2340 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2393 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2404 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2422 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2426 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2464 = new BitSet(new long[]{0x2000000000004000L,0x0000000000010100L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2479 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2485 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2491 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2512 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2535 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2539 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2585 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2608 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2614 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2619 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2637 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2643 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2648 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2686 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2709 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_DIV_in_termRule2715 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_factorRule_in_termRule2720 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2753 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_factorRule2759 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2780 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2804 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2829 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2831 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101008200L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_factorRule2840 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_LB_in_factorRule2853 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_factorRule_in_factorRule2857 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_factorRule2881 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_factorRule_in_factorRule2885 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_factorRule2924 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2933 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_EXP_in_factorRule2957 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_factorRule_in_factorRule2961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule3002 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENT_in_specialFunctionRule3040 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEGREE_in_specialFunctionRule3083 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3095 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_specialFunctionRule3099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_ARRAY_in_specialFunctionRule3125 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3128 = new BitSet(new long[]{0x0000000000000200L,0x0000002000010000L});
	public static final BitSet FOLLOW_ALL_in_specialFunctionRule3163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_specialFunctionRule3210 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_specialFunctionRule3214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LB_in_specialFunctionRule3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3241 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3283 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_specialFunctionRule3324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule3337 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3343 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3347 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3349 = new BitSet(new long[]{0x0000000000082000L,0x0000000001000001L,0x0000000000000200L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule3353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule3364 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3370 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3374 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3380 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3400 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule3404 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3425 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule3430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule3436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule3456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule3506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule3526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule3545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule3559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule3571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3604 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3644 = new BitSet(new long[]{0x2000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3673 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule3694 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3698 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3713 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3717 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule3741 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule3753 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3781 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3787 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3809 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3813 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule3845 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3868 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3872 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3891 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3895 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule3933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3968 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3991 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3997 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4002 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule4020 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule4026 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule4031 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule4069 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule4092 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule4098 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule4103 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule4137 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule4141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule4143 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule4158 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule4182 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule4207 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule4209 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101008200L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule4214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule4218 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_LB_in_restrictedFactorRule4231 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4235 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_restrictedFactorRule4254 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4258 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_restrictedFactorRule4292 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule4303 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_EXP_in_restrictedFactorRule4325 = new BitSet(new long[]{0x240000200008A000L,0x0006102001030001L,0x0000000100000200L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedFactorRule4329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule4374 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule4392 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule4396 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule4440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule4450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule4460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule4470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule4480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule4490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule4530 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000001L});
	public static final BitSet FOLLOW_SUB_in_numericRule4536 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000001L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule4549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule4555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010020L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4599 = new BitSet(new long[]{0x0000000000000000L,0x0200100000050000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4604 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule4652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010020L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4667 = new BitSet(new long[]{0x0000000000000000L,0x0200100000050000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4671 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4703 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule4718 = new BitSet(new long[]{0x0000000000000000L,0x0200100000050000L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4722 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4784 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule4800 = new BitSet(new long[]{0x0000000000000000L,0x0200100000050000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4804 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule4866 = new BitSet(new long[]{0x0000000000000000L,0x0000100000050000L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule4878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4910 = new BitSet(new long[]{0x0000000000000000L,0x0200100000050000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule4938 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4941 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101008200L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule4946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule4976 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4978 = new BitSet(new long[]{0x0000000000000000L,0x0200100000050000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4986 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule4988 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule4992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule5000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule5016 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule5021 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule5023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule5027 = new BitSet(new long[]{0x2000000040000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule5031 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule5073 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule5077 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule5079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule5083 = new BitSet(new long[]{0x2000000040000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule5087 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule5125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule5144 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule5146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule5162 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule5164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule5181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5189 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule5203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5207 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule5232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule5234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule5236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5240 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule5255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule5259 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule5300 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_addFieldsRule5302 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LBR_in_addFieldsRule5329 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5337 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5339 = new BitSet(new long[]{0x240020200008A000L,0x8007102003230001L,0x0000000100000200L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5343 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule5362 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5366 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5368 = new BitSet(new long[]{0x240020200008A000L,0x8007102003230001L,0x0000000100000200L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5372 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RBR_in_addFieldsRule5390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule5413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule5428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule5467 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5475 = new BitSet(new long[]{0x0040000000000002L,0x0100208000001040L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule5481 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule5509 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5511 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5517 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5523 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule5529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5534 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule5536 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule5557 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5559 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule5606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule5653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule5718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule5720 = new BitSet(new long[]{0x0000000000000000L,0x000001020000E000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule5728 = new BitSet(new long[]{0x0000000000000200L,0x0000010000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule5765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule5819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule5855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5886 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule5895 = new BitSet(new long[]{0x0000000000000000L,0x000001000000E000L,0x0000000000004000L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5897 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule5940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule5942 = new BitSet(new long[]{0x8000000000000800L,0x2000001000000000L});
	public static final BitSet FOLLOW_AND_in_resolvingRule5954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule5960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule5966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule5972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6004 = new BitSet(new long[]{0x0000000000000200L,0x0000000000010000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6010 = new BitSet(new long[]{0x0000000000000200L,0x0000000000010000L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule6021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6057 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule6096 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6100 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6116 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule6135 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6140 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule6146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule6152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6156 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule6186 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule6189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule6191 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule6204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule6208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule6232 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule6234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010008L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule6246 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule6250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule6254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_FROM_WEB_in_getCollectionRule6285 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule6290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule6296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule6309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule6330 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule6332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6343 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule6345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6349 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule6351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule6384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule6403 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule6405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6415 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_saveAsRule6419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_saveAsRule6443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule6459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FROM_WEB_in_lookupFromWebRule6461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule6477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule6490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule6510 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule6512 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule6516 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule6521 = new BitSet(new long[]{0x240000200008A010L,0x0006102001030001L,0x0000000101000200L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule6525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule6548 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule6550 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6561 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule6565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6569 = new BitSet(new long[]{0x0000000001800040L,0x0800000000000080L,0x0000000000121000L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule6581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6583 = new BitSet(new long[]{0x0000200000000000L,0x8001000002200000L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6587 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000080L,0x0000000000121000L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule6619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6621 = new BitSet(new long[]{0x0000000000000200L,0x0000010004000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule6627 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000080L,0x0000000000121000L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule6633 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000080L,0x0000000000121000L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule6639 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000080L,0x0000000000121000L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule6645 = new BitSet(new long[]{0x0000000001800040L,0x0000000000000080L,0x0000000000121000L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule6665 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000080L,0x0000000000121000L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6725 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000080L,0x0000000000021000L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule6767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000021000L});
	public static final BitSet FOLLOW_generateSectionRule_in_joinOfCollectionsRule6810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000021000L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule6848 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule6850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule6891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule6920 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000080L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule6931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000021000L});
	public static final BitSet FOLLOW_generateSectionRule_in_filterRule6950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000021000L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule6969 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule6971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_filterRule6992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule7013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule7038 = new BitSet(new long[]{0x0002000000000000L,0x0000000200000000L,0x0000000000020004L});
	public static final BitSet FOLLOW_othersRule_in_groupRule7064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_groupRule7088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule7111 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule7115 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule7128 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7132 = new BitSet(new long[]{0x0000000040000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule7157 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7161 = new BitSet(new long[]{0x0000000040000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule7183 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule7187 = new BitSet(new long[]{0x0002000000000002L,0x4000000000000080L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule7208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule7210 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule7212 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000080L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule7234 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule7236 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule7240 = new BitSet(new long[]{0x0000000040000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule7257 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule7261 = new BitSet(new long[]{0x0000000040000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule7280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule7282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule7313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule7344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule7348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule7352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule7367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule7396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule7420 = new BitSet(new long[]{0x0002000000000000L,0x0000000200000000L,0x0000001000020000L});
	public static final BitSet FOLLOW_othersRule_in_expandRule7452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_expandRule7476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule7498 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule7503 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule7510 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_TO_in_unpackRule7521 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule7553 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule7555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7569 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule7591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7595 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000021000L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule7616 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule7618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule7648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule7668 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule7670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7680 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule7682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule7698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule7720 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule7722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7730 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule7732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule7748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule7775 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7785 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7790 = new BitSet(new long[]{0x0000000040010000L,0x0800000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7796 = new BitSet(new long[]{0x0000000040010000L,0x0800000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7820 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7825 = new BitSet(new long[]{0x0000000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7831 = new BitSet(new long[]{0x0000000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule7912 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7914 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7919 = new BitSet(new long[]{0x0000000040010000L,0x0800000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7925 = new BitSet(new long[]{0x0000000040010000L,0x0800000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7948 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7953 = new BitSet(new long[]{0x0000000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7959 = new BitSet(new long[]{0x0000000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_ON_in_useDbRule8037 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule8049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule8051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule8063 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8078 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x0000000000020000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8084 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_useDbRule8108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule8114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_useDbRule8139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule8164 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule8166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8176 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule8178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule8182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule8198 = new BitSet(new long[]{0x0002000000000000L,0x0000000200000000L,0x0000000000020004L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule8238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule8280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule8308 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule8318 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8339 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule8376 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule8387 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule8398 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule8400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule8404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule8407 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8411 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule8426 = new BitSet(new long[]{0x2C0000200008A010L,0x0206102801030001L,0x00001C0901000200L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule8430 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule8454 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8458 = new BitSet(new long[]{0x0000000000000022L,0x0020000000000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule8481 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule8487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule8489 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8511 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule8563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule8579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_parameterRule8583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaScriptFunctionRule8607 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule8619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8661 = new BitSet(new long[]{0x0000000040040000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule8686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8690 = new BitSet(new long[]{0x0000000040040000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8715 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8719 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule8733 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule8746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule8752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyOperatorRule8774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyOperatorRule8776 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_OPERATOR_in_createFuzzyOperatorRule8778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule8782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8817 = new BitSet(new long[]{0x0080000040000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8846 = new BitSet(new long[]{0x0080000040000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8873 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8877 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule8891 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020010L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule8913 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule8916 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8928 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8932 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8934 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8940 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8962 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8964 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8968 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8970 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8976 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule8997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule9004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyAggregatorRule9026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyAggregatorRule9028 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule9030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyAggregatorRule9034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule9060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule9067 = new BitSet(new long[]{0x0000008040000000L,0x0000000000000002L,0x0000000000800040L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule9101 = new BitSet(new long[]{0x0000008040000000L,0x0000000000000002L,0x0000000000800040L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule9150 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule9154 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_faSortRule_in_createFuzzyAggregatorRule9173 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_faForAllRule_in_createFuzzyAggregatorRule9227 = new BitSet(new long[]{0x0080008000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_faDeriveRule_in_createFuzzyAggregatorRule9262 = new BitSet(new long[]{0x0080008000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyAggregatorRule9296 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule9300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020010L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyAggregatorRule9327 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyAggregatorRule9329 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule9336 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9340 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9342 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule9348 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9371 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule9373 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9377 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule9379 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule9383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule9385 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_createFuzzyAggregatorRule9405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyAggregatorRule9412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_faForAllRule9433 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_faForAllRule9435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faForAllRule9439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_IN_in_faForAllRule9441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faForAllRule9445 = new BitSet(new long[]{0x0000000000000080L,0x0000042000000000L});
	public static final BitSet FOLLOW_LB_in_faForAllRule9470 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faForAllRule9475 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_faForAllRule9494 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faForAllRule9498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_faForAllRule9502 = new BitSet(new long[]{0x0000000000000080L,0x0000040000000000L});
	public static final BitSet FOLLOW_LOCALLY_in_faForAllRule9532 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faForAllRule9536 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_faForAllRule9540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faForAllRule9544 = new BitSet(new long[]{0x0000000040000080L});
	public static final BitSet FOLLOW_COMMA_in_faForAllRule9558 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faForAllRule9562 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_faForAllRule9566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faForAllRule9570 = new BitSet(new long[]{0x0000000040000080L});
	public static final BitSet FOLLOW_AGGREGATE_in_faForAllRule9586 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000040001000220L});
	public static final BitSet FOLLOW_aggSpecRule_in_faForAllRule9590 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_faForAllRule9609 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000040001000220L});
	public static final BitSet FOLLOW_aggSpecRule_in_faForAllRule9613 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_DERIVE_in_faDeriveRule9667 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faDeriveRule9671 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_faDeriveRule9675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faDeriveRule9679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SORT_in_faSortRule9700 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L});
	public static final BitSet FOLLOW_faArraySortRule_in_faSortRule9704 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_faSortRule9717 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L});
	public static final BitSet FOLLOW_faArraySortRule_in_faSortRule9721 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_faArrayIndexRule_in_faArraySortRule9753 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_faArraySortRule9761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faSortFieldRule_in_faArraySortRule9764 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_COMMA_in_faArraySortRule9775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faSortFieldRule_in_faArraySortRule9777 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_AS_in_faArraySortRule9788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faArraySortRule9792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_faArraySortRule9818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faArrayIndexRule_in_faArraySortRule9820 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_faArraySortRule9830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faArrayIndexRule_in_faArraySortRule9832 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_faArraySortRule9839 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_faArraySortRule9846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faSortFieldRule_in_faArraySortRule9848 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_COMMA_in_faArraySortRule9859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_faSortFieldRule_in_faArraySortRule9861 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_AS_in_faArraySortRule9872 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_faArraySortRule9874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faArraySortRule9878 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_faArraySortRule9906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faArraySortRule9910 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_faArraySortRule9933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_faArrayIndexRule9979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_IN_in_faArrayIndexRule9981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faArrayIndexRule9985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_faSortFieldRule10013 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_faSortFieldRule10018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_TYPE_in_faSortFieldRule10031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faSortFieldRule10035 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_VERSUS_in_faSortFieldRule10044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withSpec_in_aggSpecRule10085 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_aggSpecRule10095 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_aggSpecRule10102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_aggSpecRule10106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withSpec10139 = new BitSet(new long[]{0x0000000000000000L,0x0010800000000000L,0x0000000004000080L});
	public static final BitSet FOLLOW_SUM_in_withSpec10145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_withSpec10158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINIMUM_in_withSpec10171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAXIMUM_in_withSpec10184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_faParameterRule10217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_TYPE_in_faParameterRule10236 = new BitSet(new long[]{0x0000000000004000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_faParameterRule10241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_faParameterRule10247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule10285 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule10302 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule10306 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule10372 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule10390 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule10394 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule10462 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule10473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule10511 = new BitSet(new long[]{0x0040000000000002L,0x0100208000801040L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule10531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule10551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule10598 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule10607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule10649 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule10672 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000200L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule10678 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000200L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule10683 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule10701 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000200L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule10707 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000200L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule10712 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule10752 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule10777 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000200L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule10783 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000200L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule10788 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule10829 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule10833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule10837 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule10857 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule10895 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule10932 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule10966 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule10999 = new BitSet(new long[]{0x0100000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule11039 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001008200L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule11044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule11050 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_EXP_in_jfFactorRule11077 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000200L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfFactorRule11081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11135 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule11155 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule11159 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule11207 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule11229 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000220L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule11235 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000220L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule11240 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule11257 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000220L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule11263 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000220L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule11268 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule11307 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_MUL_in_faTermRule11332 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000220L});
	public static final BitSet FOLLOW_DIV_in_faTermRule11338 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000220L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule11343 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_LP_in_faFactorRule11382 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faFactorRule11387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_faFactorRule11391 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_INT_in_faFactorRule11409 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_faFactorRule11443 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_faFactorRule11476 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_faFactorRule11506 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_POS_in_faFactorRule11535 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_ID_in_faFactorRule11569 = new BitSet(new long[]{0x0100000000000002L,0x0000102000000000L});
	public static final BitSet FOLLOW_faArrayRefRule_in_faFactorRule11575 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_LP_in_faFactorRule11588 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faFunctionParamsRule_in_faFactorRule11592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_faFactorRule11596 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_EXP_in_faFactorRule11613 = new BitSet(new long[]{0x0000000000002000L,0x0000100001010001L,0x0000000000000220L});
	public static final BitSet FOLLOW_faFactorRule_in_faFactorRule11617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_faExpressionRule_in_faFunctionParamsRule11669 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_faFunctionParamsRule11690 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faFunctionParamsRule11694 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LB_in_faArrayRefRule11728 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000220L});
	public static final BitSet FOLLOW_faExpressionRule_in_faArrayRefRule11733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_faArrayRefRule11738 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_faArrayRefRule11748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzySetModelRule11768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzySetModelRule11770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_SET_in_createFuzzySetModelRule11772 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_MODEL_in_createFuzzySetModelRule11774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule11778 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetModelRule11788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule11794 = new BitSet(new long[]{0x0000010140000000L,0x1000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetModelRule11814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule11818 = new BitSet(new long[]{0x0000010140000000L,0x1000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_DERIVED_in_createFuzzySetModelRule11844 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetModelRule11846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule11850 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetModelRule11863 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetModelRule11867 = new BitSet(new long[]{0x0000000140000000L,0x1000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetModelRule11881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetModelRule11888 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetModelRule11912 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetModelRule11916 = new BitSet(new long[]{0x0000000140000000L,0x1000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CONSTRAINT_in_createFuzzySetModelRule11935 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzySetModelRule11939 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_fuzzyOperatorDefinitionRule_in_createFuzzySetModelRule11958 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_createFuzzySetModelRule11966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_fuzzyOperatorDefinitionRule11987 = new BitSet(new long[]{0x0000000000000800L,0x2200000000000000L});
	public static final BitSet FOLLOW_set_in_fuzzyOperatorDefinitionRule11991 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_fuzzyOperatorDefinitionRule12027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_fuzzyOperatorDefinitionRule12031 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_fuzzyOperatorDefinitionRule12033 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_fuzzyOperatorDefinitionRule12065 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule12126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule12130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule12132 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule12134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule12138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule12154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12158 = new BitSet(new long[]{0x0080000040000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule12183 = new BitSet(new long[]{0x0080000040000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule12206 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule12210 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule12230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule12234 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createGenericFuzzySetOperatorRule12262 = new BitSet(new long[]{0x0000000000002010L,0x0000100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule12266 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0000000000020010L});
	public static final BitSet FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule12285 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LB_in_createGenericFuzzySetOperatorRule12287 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule12298 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12302 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12304 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule12310 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12327 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule12329 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12333 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule12335 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000001L,0x0000000001000000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule12339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule12341 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RB_in_createGenericFuzzySetOperatorRule12355 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_createGenericFuzzySetOperatorRule12414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule12448 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule12470 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule12476 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule12481 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule12498 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule12504 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule12509 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule12546 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftTermRule12571 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_DIV_in_ftTermRule12577 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule12582 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule12614 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFactorRule12618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule12621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftValueRule_in_ftFactorRule12641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule12668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule12700 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule12702 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101008000L});
	public static final BitSet FOLLOW_ftFunctionParamsRule_in_ftFactorRule12707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule12712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_ftFactorRule12727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftValueRule12752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftValueRule12772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule12808 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_ftFunctionParamsRule12829 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101000000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule12833 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule12883 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule12907 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule12913 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule12918 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule12937 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule12943 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule12948 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule12983 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftConditionTermRule13000 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_DIV_in_ftConditionTermRule13006 = new BitSet(new long[]{0x0400002000008000L,0x0006100001030001L,0x0000000100000000L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule13011 = new BitSet(new long[]{0x0000400000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule13041 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule13045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule13048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionValueRule_in_ftConditionFactorRule13066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule13095 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_ftConditionFactorRule13099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule13130 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule13132 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101008000L});
	public static final BitSet FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule13137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule13142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_ftConditionFactorRule13155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftConditionValueRule13201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftConditionValueRule13221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule13259 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_ftConditionFunctionParamsRule13278 = new BitSet(new long[]{0x0400002000008010L,0x0006100001030001L,0x0000000101000000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule13282 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaFunctionRule13318 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_JAVA_in_createJavaFunctionRule13320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaFunctionRule13322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule13330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaFunctionRule13362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule13372 = new BitSet(new long[]{0x0000000044000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_createJavaFunctionRule13396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule13400 = new BitSet(new long[]{0x0000000044000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaFunctionRule13423 = new BitSet(new long[]{0x0000000000002010L,0x0200100001010001L,0x0000000001000200L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaFunctionRule13427 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule13440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule13444 = new BitSet(new long[]{0x0000000004000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_IMPORT_in_createJavaFunctionRule13478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule13482 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule13511 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaFunctionRule13513 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaFunctionRule13526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_createJavaFunctionRule13532 = new BitSet(new long[]{0x0000000000000002L});
}
