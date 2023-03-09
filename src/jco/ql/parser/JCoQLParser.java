// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2023-03-09 04:39:31

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
		"CASE", "CHECK_FOR", "CLASS", "COLLECTION", "COLLECTIONS", "COLON", "COMMA", 
		"COMMENT", "CONSTRAINT", "CREATE", "DB", "DEFAULT", "DEFUZZIFY", "DEGREE", 
		"DEGREES", "DERIVED", "DICTIONARY", "DIGIT", "DIGIT0", "DIRECTION", "DISTANCE", 
		"DIV", "DIVISION", "DOCUMENTS", "DOT", "DROP", "DROPPING", "DUPLICATES", 
		"EACH", "END_BODY", "EQ", "EVALUATE", "EXPAND", "FIELD", "FIELDS", "FIELD_NAME", 
		"FILTER", "FIRST", "FLOAT", "FOR", "FROM", "FROM_ARRAY", "FROM_WEB", "FUNCTION", 
		"FUZZY", "GE", "GENERATE", "GEOMETRY", "GET", "GROUP", "GROUPING", "GT", 
		"HOWINCLUDE", "HOWINTERSECT", "HOWMEET", "ID", "IF_ERROR", "IF_FAILS", 
		"IMPORT", "IN", "INCLUDED", "INPUT", "INRANGE", "INT", "INTERSECT", "INTERSECTION", 
		"INTO", "ISNOTNULL", "ISNULL", "JAVA", "JAVASCRIPT", "JOIN", "KEEP", "KEEPING", 
		"KNOWN", "LAST", "LB", "LBR", "LE", "LEFT", "LETTER", "LOCALLY", "LOOKUP", 
		"LP", "LT", "MATCHING", "MAXIMUM", "MEET", "MEMBERSHIP_TO", "MERGE", "MINIMUM", 
		"MIN_SIMILARITY", "MUL", "NEQ", "NOT", "OF", "ON", "OPERATOR", "OR", "ORDER", 
		"ORIENTATION", "OTHERS", "PARAMETERS", "PARTITION", "POINT", "POLYLINE", 
		"POS", "PRECONDITION", "PRODUCT", "QUOTE", "QUOTED_VALUE", "RB", "RBR", 
		"REMOVE", "RESOLVING", "RIGHT", "RP", "SAVE", "SC", "SCAN_ERROR", "SERVER", 
		"SET", "SETS", "SETTING", "SORT", "SUB", "SUBTRACT", "SUBTRACTION", "SUM", 
		"THRESHOLD", "THROUGH", "TILDE", "TO", "TO_POLYLINE", "TRAJECTORY", "TRANSLATE", 
		"TYPE", "UNCOMPARABLE", "UNKNOWN", "UNPACK", "USE", "USING", "VERSUS", 
		"WEB", "WHERE", "WHITE_SPACES", "WITH", "WITHIN", "WITHOUT", "WRT", "WS", 
		"XXX"
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
	public static final int CHECK_FOR=24;
	public static final int CLASS=25;
	public static final int COLLECTION=26;
	public static final int COLLECTIONS=27;
	public static final int COLON=28;
	public static final int COMMA=29;
	public static final int COMMENT=30;
	public static final int CONSTRAINT=31;
	public static final int CREATE=32;
	public static final int DB=33;
	public static final int DEFAULT=34;
	public static final int DEFUZZIFY=35;
	public static final int DEGREE=36;
	public static final int DEGREES=37;
	public static final int DERIVED=38;
	public static final int DICTIONARY=39;
	public static final int DIGIT=40;
	public static final int DIGIT0=41;
	public static final int DIRECTION=42;
	public static final int DISTANCE=43;
	public static final int DIV=44;
	public static final int DIVISION=45;
	public static final int DOCUMENTS=46;
	public static final int DOT=47;
	public static final int DROP=48;
	public static final int DROPPING=49;
	public static final int DUPLICATES=50;
	public static final int EACH=51;
	public static final int END_BODY=52;
	public static final int EQ=53;
	public static final int EVALUATE=54;
	public static final int EXPAND=55;
	public static final int FIELD=56;
	public static final int FIELDS=57;
	public static final int FIELD_NAME=58;
	public static final int FILTER=59;
	public static final int FIRST=60;
	public static final int FLOAT=61;
	public static final int FOR=62;
	public static final int FROM=63;
	public static final int FROM_ARRAY=64;
	public static final int FROM_WEB=65;
	public static final int FUNCTION=66;
	public static final int FUZZY=67;
	public static final int GE=68;
	public static final int GENERATE=69;
	public static final int GEOMETRY=70;
	public static final int GET=71;
	public static final int GROUP=72;
	public static final int GROUPING=73;
	public static final int GT=74;
	public static final int HOWINCLUDE=75;
	public static final int HOWINTERSECT=76;
	public static final int HOWMEET=77;
	public static final int ID=78;
	public static final int IF_ERROR=79;
	public static final int IF_FAILS=80;
	public static final int IMPORT=81;
	public static final int IN=82;
	public static final int INCLUDED=83;
	public static final int INPUT=84;
	public static final int INRANGE=85;
	public static final int INT=86;
	public static final int INTERSECT=87;
	public static final int INTERSECTION=88;
	public static final int INTO=89;
	public static final int ISNOTNULL=90;
	public static final int ISNULL=91;
	public static final int JAVA=92;
	public static final int JAVASCRIPT=93;
	public static final int JOIN=94;
	public static final int KEEP=95;
	public static final int KEEPING=96;
	public static final int KNOWN=97;
	public static final int LAST=98;
	public static final int LB=99;
	public static final int LBR=100;
	public static final int LE=101;
	public static final int LEFT=102;
	public static final int LETTER=103;
	public static final int LOCALLY=104;
	public static final int LOOKUP=105;
	public static final int LP=106;
	public static final int LT=107;
	public static final int MATCHING=108;
	public static final int MAXIMUM=109;
	public static final int MEET=110;
	public static final int MEMBERSHIP_TO=111;
	public static final int MERGE=112;
	public static final int MINIMUM=113;
	public static final int MIN_SIMILARITY=114;
	public static final int MUL=115;
	public static final int NEQ=116;
	public static final int NOT=117;
	public static final int OF=118;
	public static final int ON=119;
	public static final int OPERATOR=120;
	public static final int OR=121;
	public static final int ORDER=122;
	public static final int ORIENTATION=123;
	public static final int OTHERS=124;
	public static final int PARAMETERS=125;
	public static final int PARTITION=126;
	public static final int POINT=127;
	public static final int POLYLINE=128;
	public static final int POS=129;
	public static final int PRECONDITION=130;
	public static final int PRODUCT=131;
	public static final int QUOTE=132;
	public static final int QUOTED_VALUE=133;
	public static final int RB=134;
	public static final int RBR=135;
	public static final int REMOVE=136;
	public static final int RESOLVING=137;
	public static final int RIGHT=138;
	public static final int RP=139;
	public static final int SAVE=140;
	public static final int SC=141;
	public static final int SCAN_ERROR=142;
	public static final int SERVER=143;
	public static final int SET=144;
	public static final int SETS=145;
	public static final int SETTING=146;
	public static final int SORT=147;
	public static final int SUB=148;
	public static final int SUBTRACT=149;
	public static final int SUBTRACTION=150;
	public static final int SUM=151;
	public static final int THRESHOLD=152;
	public static final int THROUGH=153;
	public static final int TILDE=154;
	public static final int TO=155;
	public static final int TO_POLYLINE=156;
	public static final int TRAJECTORY=157;
	public static final int TRANSLATE=158;
	public static final int TYPE=159;
	public static final int UNCOMPARABLE=160;
	public static final int UNKNOWN=161;
	public static final int UNPACK=162;
	public static final int USE=163;
	public static final int USING=164;
	public static final int VERSUS=165;
	public static final int WEB=166;
	public static final int WHERE=167;
	public static final int WHITE_SPACES=168;
	public static final int WITH=169;
	public static final int WITHIN=170;
	public static final int WITHOUT=171;
	public static final int WRT=172;
	public static final int WS=173;
	public static final int XXX=174;

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
		public static final String release = "4.0.01";
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
	    



	// $ANTLR start "start"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:1: start : ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetTypeRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:3: ( ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetTypeRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )* EOF )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetTypeRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )* EOF
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createFuzzySetTypeRule | createGenericFuzzySetOperatorRule | createJavaFunctionRule | test )*
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
						int LA1_18 = input.LA(3);
						if ( (LA1_18==OPERATOR) ) {
							alt1=12;
						}
						else if ( (LA1_18==AGGREGATOR) ) {
							alt1=16;
						}

						}
						break;
					case JAVASCRIPT:
						{
						alt1=13;
						}
						break;
					case TYPE:
						{
						alt1=17;
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:7: getCollectionRule
					{
					pushFollow(FOLLOW_getCollectionRule_in_start69);
					getCollectionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:87:7: saveAsRule
					{
					pushFollow(FOLLOW_saveAsRule_in_start95);
					saveAsRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:88:7: joinOfCollectionsRule
					{
					pushFollow(FOLLOW_joinOfCollectionsRule_in_start128);
					joinOfCollectionsRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:89:7: filterRule
					{
					pushFollow(FOLLOW_filterRule_in_start150);
					filterRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:7: groupRule
					{
					pushFollow(FOLLOW_groupRule_in_start183);
					groupRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:91:7: expandRule
					{
					pushFollow(FOLLOW_expandRule_in_start217);
					expandRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:92:7: mergeCollectionsRule
					{
					pushFollow(FOLLOW_mergeCollectionsRule_in_start250);
					mergeCollectionsRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:93:7: intersectCollectionsRule
					{
					pushFollow(FOLLOW_intersectCollectionsRule_in_start273);
					intersectCollectionsRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:94:7: subtractCollectionsRule
					{
					pushFollow(FOLLOW_subtractCollectionsRule_in_start292);
					subtractCollectionsRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:7: useDbRule
					{
					pushFollow(FOLLOW_useDbRule_in_start312);
					useDbRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:96:7: trajectoryMatchingRule
					{
					pushFollow(FOLLOW_trajectoryMatchingRule_in_start346);
					trajectoryMatchingRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:97:7: createFuzzyOperatorRule
					{
					pushFollow(FOLLOW_createFuzzyOperatorRule_in_start365);
					createFuzzyOperatorRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:98:7: createJavaScriptFunctionRule
					{
					pushFollow(FOLLOW_createJavaScriptFunctionRule_in_start380);
					createJavaScriptFunctionRule();
					state._fsp--;

					}
					break;
				case 14 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:99:7: getDictionaryRule
					{
					pushFollow(FOLLOW_getDictionaryRule_in_start392);
					getDictionaryRule();
					state._fsp--;

					}
					break;
				case 15 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:100:7: lookupFromWebRule
					{
					pushFollow(FOLLOW_lookupFromWebRule_in_start410);
					lookupFromWebRule();
					state._fsp--;

					}
					break;
				case 16 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:101:7: createFuzzyAggregatorRule
					{
					pushFollow(FOLLOW_createFuzzyAggregatorRule_in_start428);
					createFuzzyAggregatorRule();
					state._fsp--;

					}
					break;
				case 17 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:102:7: createFuzzySetTypeRule
					{
					pushFollow(FOLLOW_createFuzzySetTypeRule_in_start444);
					createFuzzySetTypeRule();
					state._fsp--;

					}
					break;
				case 18 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:103:7: createGenericFuzzySetOperatorRule
					{
					pushFollow(FOLLOW_createGenericFuzzySetOperatorRule_in_start459);
					createGenericFuzzySetOperatorRule();
					state._fsp--;

					}
					break;
				case 19 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:104:7: createJavaFunctionRule
					{
					pushFollow(FOLLOW_createJavaFunctionRule_in_start469);
					createJavaFunctionRule();
					state._fsp--;

					}
					break;
				case 20 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:105:7: test
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:110:1: test : XXX SC ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:110:5: ( XXX SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:110:7: XXX SC
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:1: collectionReferenceRule returns [DbCollection cr] : name= ID ( AT db= ID )? ( AS alias= ID )? ;
	public final DbCollection collectionReferenceRule() throws RecognitionException {
		DbCollection cr = null;


		Token name=null;
		Token db=null;
		Token alias=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:116:3: (name= ID ( AT db= ID )? ( AS alias= ID )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:117:5: name= ID ( AT db= ID )? ( AS alias= ID )?
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule557); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:118:5: ( AT db= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:118:7: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_collectionReferenceRule567); 
					db=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule571); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:119:5: ( AS alias= ID )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:119:7: AS alias= ID
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:124:1: fieldRefRule returns [Field field] : (fd= FIELD_NAME )+ ;
	public final Field fieldRefRule() throws RecognitionException {
		Field field = null;


		Token fd=null;

			field = new Field (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:126:3: ( (fd= FIELD_NAME )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:127:5: (fd= FIELD_NAME )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:127:5: (fd= FIELD_NAME )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:127:7: fd= FIELD_NAME
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:131:1: buildActionRule returns [BuildAction ga] : BUILD os= objectStructureRule[true] ;
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:133:3: ( BUILD os= objectStructureRule[true] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:134:5: BUILD os= objectStructureRule[true]
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:140:1: objectStructureRule[boolean generateActionCaller] returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule(boolean generateActionCaller) throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:141:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:142:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule729); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule740);
			ofs=outputFieldSpecRule();
			state._fsp--;

			 obj = new ObjectStructure (ofs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:144:8: (t= COMMA ofs= outputFieldSpecRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:144:10: t= COMMA ofs= outputFieldSpecRule
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:150:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:151:3: (fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:152:5: fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule806);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:153:5: ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:153:7: COLON (os= objectStructureRule[false] |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule820); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:153:13: (os= objectStructureRule[false] |f= factorRule )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==LBR) ) {
						alt6=1;
					}
					else if ( (LA6_0==APEX_VALUE||LA6_0==ARRAY_FUNCTION||LA6_0==BOOLEAN||LA6_0==DEGREE||LA6_0==FIELD_NAME||LA6_0==FLOAT||(LA6_0 >= ID && LA6_0 <= IF_ERROR)||LA6_0==INT||LA6_0==LP||LA6_0==MEMBERSHIP_TO||LA6_0==QUOTED_VALUE||LA6_0==TRANSLATE) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:153:15: os= objectStructureRule[false]
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule826);
							os=objectStructureRule(false);
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:154:11: f= factorRule
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:161:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:163:3: ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:164:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule955); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule957); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:165:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule989); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule991); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:166:14: ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:166:16: POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:167:16: AGGREGATE LP afr= fieldRefRule RP
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:168:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1083);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:169:16: TO_POLYLINE LP f= fieldRefRule RP
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:173:1: dropGeometryRule : DROPPING GEOMETRY ;
	public final void dropGeometryRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:174:3: ( DROPPING GEOMETRY )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:175:4: DROPPING GEOMETRY
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:179:1: caseClauseRule returns [CaseClause cc] : CASE (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:3: ( CASE (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:181:5: CASE (wc= whereCaseRule )+ (oth= othersRule )?
			{
			match(input,CASE,FOLLOW_CASE_in_caseClauseRule1224); 
			 cc = new CaseClause (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:182:8: (wc= whereCaseRule )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WHERE) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:182:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1251);
					wc=whereCaseRule();
					state._fsp--;

					 cc.addWhereCase (wc); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:183:8: (oth= othersRule )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DROP||LA11_0==KEEP) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:183:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1280);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:188:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:189:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:189:6: (ot= KEEP |ot= DROP )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==KEEP) ) {
				alt12=1;
			}
			else if ( (LA12_0==DROP) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:189:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1323); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:189:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1329); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1340); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:195:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:196:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:197:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1365); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1376);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:7: (gs= generateSectionRule[true] )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==GENERATE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1394);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1431); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:7: (go= geometricOptionRule )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==KEEPING) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==GEOMETRY) ) {
					alt14=1;
				}
			}
			else if ( (LA14_0==SETTING) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1448);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:4: (cf= checkForFuzzySetRule[gs] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHECK_FOR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1465);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:210:4: (ac= alphaCutRule[gs] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ALPHACUT) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:210:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1496);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:211:7: (ga= buildActionRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BUILD) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:211:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1534);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:212:4: (df= keepDropFuzzySetsRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DEFUZZIFY||LA18_0==KEEPING) ) {
				alt18=1;
			}
			else if ( (LA18_0==DROPPING) ) {
				int LA18_2 = input.LA(2);
				if ( (LA18_2==ALL||LA18_2==FUZZY) ) {
					alt18=1;
				}
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:212:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1554);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:213:7: ( dropGeometryRule )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DROPPING) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:213:9: dropGeometryRule
					{
					pushFollow(FOLLOW_dropGeometryRule_in_generateSectionRule1572);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:223:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1633);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:224:4: ( OR c2= andConditionRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==OR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:224:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1648); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1652);
					c2=andConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop20;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:229:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:230:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:231:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1709);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:232:5: ( AND c2= notConditionRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:232:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1725); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1729);
					c2=notConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop21;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:237:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:238:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:239:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:239:5: (not= NOT )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NOT) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:239:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1791); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1803);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:246:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:247:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
			int alt24=5;
			switch ( input.LA(1) ) {
			case ADD:
			case APEX_VALUE:
			case ARRAY_FUNCTION:
			case BOOLEAN:
			case DEGREE:
			case FIELD_NAME:
			case FLOAT:
			case ID:
			case IF_ERROR:
			case INT:
			case LP:
			case MEMBERSHIP_TO:
			case QUOTED_VALUE:
			case SUB:
			case TRANSLATE:
				{
				alt24=1;
				}
				break;
			case FIELD:
				{
				alt24=2;
				}
				break;
			case WITH:
				{
				alt24=3;
				}
				break;
			case WITHOUT:
				{
				alt24=4;
				}
				break;
			case KNOWN:
			case UNKNOWN:
			case WITHIN:
				{
				alt24=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1847);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					int alt23=3;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EQ||LA23_0==GE||LA23_0==GT||LA23_0==LE||LA23_0==LT||LA23_0==NEQ) ) {
						alt23=1;
					}
					else if ( (LA23_0==INRANGE) ) {
						alt23=2;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule1875);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:250:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule1904);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:251:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule1936);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:252:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule1959);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:253:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule1985);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:254:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule2005);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:258:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:260:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule2041);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule2050);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:266:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:267:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule2079); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:267:11: (lp= LB |lp= LP )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LB) ) {
				alt25=1;
			}
			else if ( (LA25_0==LP) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:267:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule2085); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:267:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule2091); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule2101);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule2103); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule2107);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:3: (rp= RP |rp= RB )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==RP) ) {
				alt26=1;
			}
			else if ( (LA26_0==RB) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule2116); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule2122); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:273:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule2161); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2165);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:26: (n= ISNULL |n= ISNOTNULL )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ISNULL) ) {
				alt27=1;
			}
			else if ( (LA27_0==ISNOTNULL) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2171); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2177); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:279:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:280:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:281:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:281:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
			int alt28=3;
			switch ( input.LA(1) ) {
			case WITHIN:
				{
				alt28=1;
				}
				break;
			case KNOWN:
				{
				alt28=2;
				}
				break;
			case UNKNOWN:
				{
				alt28=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:281:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2251); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:281:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2257); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:281:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2263); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2284); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2286); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2290); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:7: ( COMMA fs= ID )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMMA) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2320); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2324); 
					 env.addFuzzySet (wuk, fs); 
					}
					break;

				default :
					break loop29;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:288:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2377); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2388);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:7: ( COMMA fr= fieldRefRule )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2406); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2410);
					fr=fieldRefRule();
					state._fsp--;

					 wp.addField (fr); 
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
		return wp;
	}
	// $ANTLR end "withoutPredicateRule"



	// $ANTLR start "withPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:300:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2448); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ARRAY||LA32_0==GEOMETRY||LA32_0==ID) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					int alt31=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt31=1;
						}
						break;
					case ARRAY:
						{
						alt31=2;
						}
						break;
					case GEOMETRY:
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2463); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2469); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2475); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2496);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:6: ( COMMA fr= fieldRefRule )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2519); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2523);
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
	// $ANTLR end "withPredicateRule"



	// $ANTLR start "expressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==APEX_VALUE||LA35_0==ARRAY_FUNCTION||LA35_0==BOOLEAN||LA35_0==DEGREE||LA35_0==FIELD_NAME||LA35_0==FLOAT||(LA35_0 >= ID && LA35_0 <= IF_ERROR)||LA35_0==INT||LA35_0==LP||LA35_0==MEMBERSHIP_TO||LA35_0==QUOTED_VALUE||LA35_0==TRANSLATE) ) {
				alt35=1;
			}
			else if ( (LA35_0==ADD||LA35_0==SUB) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2569);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:6: (s= ADD |s= SUB )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ADD) ) {
						alt34=1;
					}
					else if ( (LA34_0==SUB) ) {
						alt34=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2592); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2598); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2603);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ADD||LA37_0==SUB) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:7: (s= ADD |s= SUB )
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==ADD) ) {
						alt36=1;
					}
					else if ( (LA36_0==SUB) ) {
						alt36=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}

					switch (alt36) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2621); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2627); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2632);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop37;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:320:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2670);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==DIV||LA39_0==MUL) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:7: (s= MUL |s= DIV )
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==MUL) ) {
						alt38=1;
					}
					else if ( (LA38_0==DIV) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2693); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2699); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2704);
					f=factorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop39;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor factorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Condition op =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:3: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
			int alt41=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt41=1;
				}
				break;
			case FIELD_NAME:
				{
				alt41=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt41=3;
				}
				break;
			case ID:
				{
				alt41=4;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case IF_ERROR:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt41=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:328:5: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2738); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2742);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2744); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:329:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2765);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:330:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2789);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2814); 
					match(input,LP,FOLLOW_LP_in_factorRule2816); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:14: (fp= functionParamsRule )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==ADD||LA40_0==APEX_VALUE||LA40_0==ARRAY_FUNCTION||LA40_0==BOOLEAN||LA40_0==DEGREE||LA40_0==FIELD_NAME||LA40_0==FLOAT||(LA40_0 >= ID && LA40_0 <= IF_ERROR)||LA40_0==INT||LA40_0==LP||LA40_0==MEMBERSHIP_TO||LA40_0==QUOTED_VALUE||LA40_0==SUB||LA40_0==TRANSLATE) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2821);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2825); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2840);
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
	// $ANTLR end "factorRule"



	// $ANTLR start "valueRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token a=null;
		Token q=null;
		Token b=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:3: (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN )
			int alt42=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt42=1;
				}
				break;
			case FLOAT:
				{
				alt42=2;
				}
				break;
			case APEX_VALUE:
				{
				alt42=3;
				}
				break;
			case QUOTED_VALUE:
				{
				alt42=4;
				}
				break;
			case BOOLEAN:
				{
				alt42=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule2877); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:339:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule2897); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:340:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule2916); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule2930); 
					 vl = new Value (Value.QUOTED, q.getText());	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule2942); 
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



	// $ANTLR start "specialFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (f= MEMBERSHIP_TO LP mo= ID RP |f= DEGREE LP d1= ID (d2= FIELD_NAME )? RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
	public final SpecialFunctionFactor specialFunctionRule() throws RecognitionException {
		SpecialFunctionFactor expr = null;


		Token f=null;
		Token mo=null;
		Token d1=null;
		Token d2=null;
		Token dict=null;
		Token cs=null;
		Token d=null;
		Expression e =null;
		Value v =null;
		ArrayFunctionFactor a =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:2: (f= MEMBERSHIP_TO LP mo= ID RP |f= DEGREE LP d1= ID (d2= FIELD_NAME )? RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
			int alt47=5;
			switch ( input.LA(1) ) {
			case MEMBERSHIP_TO:
				{
				alt47=1;
				}
				break;
			case DEGREE:
				{
				alt47=2;
				}
				break;
			case IF_ERROR:
				{
				alt47=3;
				}
				break;
			case TRANSLATE:
				{
				alt47=4;
				}
				break;
			case ARRAY_FUNCTION:
				{
				alt47=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:4: f= MEMBERSHIP_TO LP mo= ID RP
					{
					f=(Token)match(input,MEMBERSHIP_TO,FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule2972); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2974); 
					mo=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2978); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule2980); 
						expr = env.buildMembershipTo (mo); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:349:5: f= DEGREE LP d1= ID (d2= FIELD_NAME )? RP
					{
					f=(Token)match(input,DEGREE,FOLLOW_DEGREE_in_specialFunctionRule3012); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3018); 
					d1=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3022); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:349:29: (d2= FIELD_NAME )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==FIELD_NAME) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:349:29: d2= FIELD_NAME
							{
							d2=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_specialFunctionRule3026); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3029); 
						expr = env.buildDegree (d1,d2); 	
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:350:5: f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					f=(Token)match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule3055); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3059); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3063);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3065); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule3069);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3071); 
						expr = env.buildIfError (e, v); 		
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:5: f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					f=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule3083); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule3087); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule3091);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3093); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule3097); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:15: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==COMMA) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:17: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3116); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule3120); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:16: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==COMMA) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:18: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3140); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:24: (d= APEX_VALUE |d= QUOTED_VALUE )
									int alt44=2;
									int LA44_0 = input.LA(1);
									if ( (LA44_0==APEX_VALUE) ) {
										alt44=1;
									}
									else if ( (LA44_0==QUOTED_VALUE) ) {
										alt44=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 44, 0, input);
										throw nvae;
									}

									switch (alt44) {
										case 1 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:25: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule3145); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:40: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule3151); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3160); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule3172);
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



	// $ANTLR start "arrayFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3222); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3262); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==FIELD_NAME) ) {
				alt49=1;
			}
			else if ( (LA49_0==LB) ) {
				alt49=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3291);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:362:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule3312); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3316);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:363:5: ( COMMA e= restrictedExpressionRule )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==COMMA) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:363:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3331); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3335);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop48;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule3359); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3367); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule3371); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==COMMA) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3399); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==FIELD_NAME) ) {
						alt52=1;
					}
					else if ( (LA52_0==DOCUMENTS) ) {
						alt52=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);
						throw nvae;
					}

					switch (alt52) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3405);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:9: ( COMMA fx= fieldRefRule )*
							loop50:
							while (true) {
								int alt50=2;
								int LA50_0 = input.LA(1);
								if ( (LA50_0==COMMA) ) {
									alt50=1;
								}

								switch (alt50) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:368:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3427); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3431);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop50;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:369:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule3463); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3486); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3490);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:371:9: ( COMMA fx= fieldRefRule )*
							loop51:
							while (true) {
								int alt51=2;
								int LA51_0 = input.LA(1);
								if ( (LA51_0==COMMA) ) {
									alt51=1;
								}

								switch (alt51) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:371:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3509); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3513);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop51;
								}
							}

							}
							break;

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule3551); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==APEX_VALUE||LA55_0==ARRAY_FUNCTION||LA55_0==BOOLEAN||LA55_0==DEGREE||LA55_0==FIELD_NAME||LA55_0==FLOAT||(LA55_0 >= ID && LA55_0 <= IF_ERROR)||LA55_0==INT||LA55_0==LP||LA55_0==MEMBERSHIP_TO||LA55_0==QUOTED_VALUE||LA55_0==TRANSLATE) ) {
				alt55=1;
			}
			else if ( (LA55_0==ADD||LA55_0==SUB) ) {
				alt55=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3586);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:388:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:388:5: (s= ADD |s= SUB )
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==ADD) ) {
						alt54=1;
					}
					else if ( (LA54_0==SUB) ) {
						alt54=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 54, 0, input);
						throw nvae;
					}

					switch (alt54) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:388:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3609); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:388:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3615); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3620);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:389:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==ADD||LA57_0==SUB) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:389:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:389:7: (s= ADD |s= SUB )
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==ADD) ) {
						alt56=1;
					}
					else if ( (LA56_0==SUB) ) {
						alt56=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 56, 0, input);
						throw nvae;
					}

					switch (alt56) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:389:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3638); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:389:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3644); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3649);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop57;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:393:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:396:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3687);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==DIV||LA59_0==MUL) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:7: (s= MUL |s= DIV )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==MUL) ) {
						alt58=1;
					}
					else if ( (LA58_0==DIV) ) {
						alt58=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule3710); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule3716); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3721);
					f=restrictedFactorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop59;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:401:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor restrictedFactorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression ex =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:402:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
			int alt61=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt61=1;
				}
				break;
			case FIELD_NAME:
				{
				alt61=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt61=3;
				}
				break;
			case ID:
				{
				alt61=4;
				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case IF_ERROR:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt61=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:403:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3755); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3759);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3761); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule3776);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:405:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule3800);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:406:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule3825); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3827); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:406:14: (fp= functionParamsRule )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==ADD||LA60_0==APEX_VALUE||LA60_0==ARRAY_FUNCTION||LA60_0==BOOLEAN||LA60_0==DEGREE||LA60_0==FIELD_NAME||LA60_0==FLOAT||(LA60_0 >= ID && LA60_0 <= IF_ERROR)||LA60_0==INT||LA60_0==LP||LA60_0==MEMBERSHIP_TO||LA60_0==QUOTED_VALUE||LA60_0==SUB||LA60_0==TRANSLATE) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:406:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule3832);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3836); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:407:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule3853);
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
	// $ANTLR end "restrictedFactorRule"



	// $ANTLR start "functionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:411:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:413:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3896);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:415:6: ( COMMA e= restrictedExpressionRule )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==COMMA) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:415:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule3914); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3918);
					e=restrictedExpressionRule();
					state._fsp--;

					 params.add(e); 
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
		return params;
	}
	// $ANTLR end "functionParamsRule"



	// $ANTLR start "comparatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:423:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:425:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:425:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			int alt63=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt63=1;
				}
				break;
			case NEQ:
				{
				alt63=2;
				}
				break;
			case LT:
				{
				alt63=3;
				}
				break;
			case GT:
				{
				alt63=4;
				}
				break;
			case LE:
				{
				alt63=5;
				}
				break;
			case GE:
				{
				alt63=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:425:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule3962); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:426:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule3972); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:427:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule3982); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule3992); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule4002); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:430:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule4012); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:437:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:438:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:4: (s= ADD |s= SUB )?
			int alt64=3;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==ADD) ) {
				alt64=1;
			}
			else if ( (LA64_0==SUB) ) {
				alt64=2;
			}
			switch (alt64) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule4052); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule4058); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:440:4: (n= FLOAT |n= INT )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==FLOAT) ) {
				alt65=1;
			}
			else if ( (LA65_0==INT) ) {
				alt65=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:440:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule4071); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:440:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule4077); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:446:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token ty=null;
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:447:2: ( CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:3: CHECK_FOR (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4106); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:15: (ty= ID )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==ID) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:15: ty= ID
					{
					ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4110); 
					}
					break;

			}

			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4113); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4115); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4119); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4121); 
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4126);
			fe=usingOrConditionRule();
			state._fsp--;

			 env.addCheckForFuzzySet (gs, fs, fe, ty); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:449:4: ( COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==COMMA) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:449:37: COMMA (ty= ID )? FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
						ty = null; 
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule4174); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:450:13: (ty= ID )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==ID) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:450:13: ty= ID
							{
							ty=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4178); 
							}
							break;

					}

					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4181); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4183); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4187); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4189); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4193);
					fe=usingOrConditionRule();
					state._fsp--;

					 env.addCheckForFuzzySet (gs, fs, fe, ty); 
					}
					break;

				default :
					break loop68;
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



	// $ANTLR start "faUsingPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:1: faUsingPredicateRule returns [UsingAggregatorPredicate p] : id= ID LP (m= MEMBERSHIP_TO ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( COMMA exp= restrictedExpressionRule )* RP ;
	public final UsingAggregatorPredicate faUsingPredicateRule() throws RecognitionException {
		UsingAggregatorPredicate p = null;


		Token id=null;
		Token m=null;
		Token fuzzySet=null;
		Token array=null;
		Expression exp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:455:3: (id= ID LP (m= MEMBERSHIP_TO ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( COMMA exp= restrictedExpressionRule )* RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:456:4: id= ID LP (m= MEMBERSHIP_TO ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( COMMA exp= restrictedExpressionRule )* RP
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4222); 
			 p = env.createUsingAggregatorPredicate(id); 
			match(input,LP,FOLLOW_LP_in_faUsingPredicateRule4234); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:3: (m= MEMBERSHIP_TO ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:5: m= MEMBERSHIP_TO ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB )
			{
			m=(Token)match(input,MEMBERSHIP_TO,FOLLOW_MEMBERSHIP_TO_in_faUsingPredicateRule4243); 
			 env.checkMembershipToken (m); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:459:4: ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB )
			int alt70=3;
			switch ( input.LA(1) ) {
			case ALL:
				{
				alt70=1;
				}
				break;
			case ID:
				{
				alt70=2;
				}
				break;
			case LB:
				{
				alt70=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:459:6: ALL
					{
					match(input,ALL,FOLLOW_ALL_in_faUsingPredicateRule4264); 
					 p.aggregatorType =  UsingAggregatorPredicate.ALL_MEMBERSHIP_IN_DOCUMENT;
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:460:6: fuzzySet= ID FROM_ARRAY array= FIELD_NAME
					{
					fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4295); 
					match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_faUsingPredicateRule4297); 
					array=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_faUsingPredicateRule4301); 
					 env.setUsingAggregateFromArray(p, fuzzySet, array);
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:461:6: LB fuzzySet= ID ( ',' fuzzySet= ID )* RB
					{
					match(input,LB,FOLLOW_LB_in_faUsingPredicateRule4311); 
					fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4315); 
					 p.aggregatorType =  UsingAggregatorPredicate.SELECTED_FUZZY_SET_IN_DOCUMENT; env.setUsingAggregateInDocument(p, fuzzySet);
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:462:5: ( ',' fuzzySet= ID )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==COMMA) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:462:6: ',' fuzzySet= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_faUsingPredicateRule4338); 
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4342); 
							 env.setUsingAggregateInDocument(p, fuzzySet);
							}
							break;

						default :
							break loop69;
						}
					}

					match(input,RB,FOLLOW_RB_in_faUsingPredicateRule4361); 
					}
					break;

			}

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:464:4: ( COMMA exp= restrictedExpressionRule )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==COMMA) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:464:6: COMMA exp= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_faUsingPredicateRule4376); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_faUsingPredicateRule4380);
					exp=restrictedExpressionRule();
					state._fsp--;

					 p.parameters.add(exp);
					}
					break;

				default :
					break loop71;
				}
			}

			match(input,RP,FOLLOW_RP_in_faUsingPredicateRule4393); 
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
	// $ANTLR end "faUsingPredicateRule"



	// $ANTLR start "usingOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:470:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:471:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4427);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:473:4: ( OR c2= usingAndConditionRule )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==OR) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:473:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule4442); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4446);
					c2=usingAndConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop72;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:478:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:479:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:480:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4503);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:481:5: ( AND c2= usingNotConditionRule )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==AND) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:481:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule4519); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4523);
					c2=usingNotConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop73;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:486:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:487:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:488:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:488:5: (not= NOT )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==NOT) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:488:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule4585); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule4597);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:494:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | AGGREGATE THROUGH fe= faUsingPredicateRule | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		UsingAggregatorPredicate fe =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:495:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | AGGREGATE THROUGH fe= faUsingPredicateRule | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
			int alt77=4;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt77=1;
				}
				break;
			case ID:
				{
				alt77=2;
				}
				break;
			case AGGREGATE:
				{
				alt77=3;
				}
				break;
			case IF_FAILS:
				{
				alt77=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:496:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4629); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4633);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule4635); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule4653); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:9: ( LP (fp= functionParamsRule )? RP )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==LP) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule4656); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:13: (fp= functionParamsRule )?
							int alt75=2;
							int LA75_0 = input.LA(1);
							if ( (LA75_0==ADD||LA75_0==APEX_VALUE||LA75_0==ARRAY_FUNCTION||LA75_0==BOOLEAN||LA75_0==DEGREE||LA75_0==FIELD_NAME||LA75_0==FLOAT||(LA75_0 >= ID && LA75_0 <= IF_ERROR)||LA75_0==INT||LA75_0==LP||LA75_0==MEMBERSHIP_TO||LA75_0==QUOTED_VALUE||LA75_0==SUB||LA75_0==TRANSLATE) ) {
								alt75=1;
							}
							switch (alt75) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule4661);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule4665); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:498:4: AGGREGATE THROUGH fe= faUsingPredicateRule
					{
					match(input,AGGREGATE,FOLLOW_AGGREGATE_in_usingPredicateRule4686); 
					match(input,THROUGH,FOLLOW_THROUGH_in_usingPredicateRule4688); 
					pushFollow(FOLLOW_faUsingPredicateRule_in_usingPredicateRule4692);
					fe=faUsingPredicateRule();
					state._fsp--;

					p = fe;
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:499:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule4702); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4704); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4712);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule4714); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule4718);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule4726); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:505:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		Token de=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:506:2: ( ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:507:3: ALPHACUT n= numericRule ON on= ID (de= FIELD_NAME )? ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule4742); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule4747);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule4749); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4753); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:507:38: (de= FIELD_NAME )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==FIELD_NAME) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:507:38: de= FIELD_NAME
					{
					de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule4757); 
					}
					break;

			}

				env.addAlphaCut (gs, n, on, de); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:508:4: ( COMMA n= numericRule ON on= ID (de= FIELD_NAME )? )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==COMMA) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:508:30: COMMA n= numericRule ON on= ID (de= FIELD_NAME )?
					{
					 de = null; 
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule4799); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule4803);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule4805); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4809); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:509:36: (de= FIELD_NAME )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==FIELD_NAME) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:509:36: de= FIELD_NAME
							{
							de=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_alphaCutRule4813); 
							}
							break;

					}

					 env.addAlphaCut (gs, n, on, de); 
					}
					break;

				default :
					break loop80;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:518:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:520:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
			int alt83=5;
			switch ( input.LA(1) ) {
			case DEFUZZIFY:
				{
				alt83=1;
				}
				break;
			case DROPPING:
				{
				int LA83_2 = input.LA(2);
				if ( (LA83_2==ALL) ) {
					alt83=2;
				}
				else if ( (LA83_2==FUZZY) ) {
					alt83=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KEEPING:
				{
				int LA83_3 = input.LA(2);
				if ( (LA83_3==ALL) ) {
					alt83=3;
				}
				else if ( (LA83_3==FUZZY) ) {
					alt83=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:521:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4851); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:522:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4870); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4872); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4874); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4876); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4888); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4890); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4892); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4894); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4907); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4909); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4911); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4915); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:5: ( COMMA fs= ID )*
					loop81:
					while (true) {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==COMMA) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4929); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4933); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop81;
						}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4958); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4960); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4962); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4966); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:5: ( COMMA fs= ID )*
					loop82:
					while (true) {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==COMMA) ) {
							alt82=1;
						}

						switch (alt82) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4981); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4985); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop82;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:532:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:533:2: ( ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:534:3: ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule5026); 
			match(input,FIELDS,FOLLOW_FIELDS_in_addFieldsRule5028); 
			match(input,LBR,FOLLOW_LBR_in_addFieldsRule5055); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5063);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule5065); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5069);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:5: ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==COMMA) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:7: COMMA f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule5088); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule5092);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule5094); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule5098);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop84;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_addFieldsRule5116); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:542:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:543:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==DISTANCE||LA85_0==INCLUDED||LA85_0==INTERSECT||LA85_0==MEET||LA85_0==ORIENTATION) ) {
				alt85=1;
			}
			else if ( (LA85_0==APEX_VALUE||LA85_0==ARRAY_FUNCTION||LA85_0==BOOLEAN||LA85_0==DEGREE||LA85_0==FIELD_NAME||LA85_0==FLOAT||(LA85_0 >= ID && LA85_0 <= IF_ERROR)||LA85_0==INT||LA85_0==LP||LA85_0==MEMBERSHIP_TO||LA85_0==QUOTED_VALUE||LA85_0==TRANSLATE) ) {
				alt85=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}

			switch (alt85) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule5139);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule5154);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:554:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
			int alt90=5;
			switch ( input.LA(1) ) {
			case DISTANCE:
				{
				alt90=1;
				}
				break;
			case ORIENTATION:
				{
				alt90=2;
				}
				break;
			case INCLUDED:
				{
				alt90=3;
				}
				break;
			case MEET:
				{
				alt90=4;
				}
				break;
			case INTERSECT:
				{
				alt90=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:555:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule5193); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5195); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5199); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5201); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:555:25: (cp= comparatorRule n= numericRule )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==EQ||LA86_0==GE||LA86_0==GT||LA86_0==LE||LA86_0==LT||LA86_0==NEQ) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:555:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule5207);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5211);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule5235); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5237); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:21: (f= LEFT |f= RIGHT )
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==LEFT) ) {
						alt87=1;
					}
					else if ( (LA87_0==RIGHT) ) {
						alt87=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 87, 0, input);
						throw nvae;
					}

					switch (alt87) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5243); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5249); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:42: ( COMMA o= ID COLON d= numericRule )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==COMMA) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule5255); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5260); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule5262); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5266);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5271); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule5283); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5285); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:18: (i= LEFT |i= RIGHT )
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==LEFT) ) {
						alt89=1;
					}
					else if ( (LA89_0==RIGHT) ) {
						alt89=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 89, 0, input);
						throw nvae;
					}

					switch (alt89) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5291); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5297); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5300); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule5332); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule5379); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:564:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:566:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:567:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule5442); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule5444); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule5446); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:568:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==KEEP) ) {
				alt95=1;
			}
			else if ( ((LA95_0 >= HOWINCLUDE && LA95_0 <= HOWMEET)||LA95_0==LEFT||LA95_0==RIGHT) ) {
				alt95=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:568:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule5454); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:569:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					int alt92=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt92=1;
						}
						break;
					case LEFT:
						{
						alt92=2;
						}
						break;
					case RIGHT:
						{
						alt92=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 92, 0, input);
						throw nvae;
					}
					switch (alt92) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:569:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule5491); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:7: ( resolvingRule[sfs] )?
							int alt91=2;
							int LA91_0 = input.LA(1);
							if ( (LA91_0==RESOLVING) ) {
								alt91=1;
							}
							switch (alt91) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5527);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule5545); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule5581); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5612);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:5: ( COMMA addFuzzySetRule[sfs] )*
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==COMMA) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule5621); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5623);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop93;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:5: ( resolvingRule[sfs] )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==RESOLVING) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5639);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:579:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:580:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:581:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule5666); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule5668); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:6: (t= AND |t= OR |t= FIRST |t= LAST )
			int alt96=4;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt96=1;
				}
				break;
			case OR:
				{
				alt96=2;
				}
				break;
			case FIRST:
				{
				alt96=3;
				}
				break;
			case LAST:
				{
				alt96=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule5680); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule5686); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule5692); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule5698); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:585:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
			int alt102=4;
			switch ( input.LA(1) ) {
			case LEFT:
			case RIGHT:
				{
				alt102=1;
				}
				break;
			case HOWINCLUDE:
				{
				alt102=2;
				}
				break;
			case HOWMEET:
				{
				alt102=3;
				}
				break;
			case HOWINTERSECT:
				{
				alt102=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:3: (s= LEFT |s= RIGHT )
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==LEFT) ) {
						alt97=1;
					}
					else if ( (LA97_0==RIGHT) ) {
						alt97=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 97, 0, input);
						throw nvae;
					}

					switch (alt97) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5730); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5736); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:588:4: ( ALL |fs= ID ( AS newFs= ID )? )
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==ALL) ) {
						alt99=1;
					}
					else if ( (LA99_0==ID) ) {
						alt99=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 99, 0, input);
						throw nvae;
					}

					switch (alt99) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:588:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule5747); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5783); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:12: ( AS newFs= ID )?
							int alt98=2;
							int LA98_0 = input.LA(1);
							if ( (LA98_0==AS) ) {
								alt98=1;
							}
							switch (alt98) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule5787); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5791); 
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule5822); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5826); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:22: (s= LEFT |s= RIGHT )
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==LEFT) ) {
						alt100=1;
					}
					else if ( (LA100_0==RIGHT) ) {
						alt100=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 100, 0, input);
						throw nvae;
					}

					switch (alt100) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5832); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5838); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5842); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5844); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5848); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule5861); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5866); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:20: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5872); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5878); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5882); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5885); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5889); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule5912); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5915); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5917); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5930); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5934); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:600:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:601:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:602:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule5958); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule5960); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:6: (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==ID) ) {
				alt105=1;
			}
			else if ( (LA105_0==FROM_WEB) ) {
				alt105=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5972); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:16: ( AT db= ID )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==AT) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:603:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule5976); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5980); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:8: FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM_WEB,FOLLOW_FROM_WEB_in_getCollectionRule6011); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:17: (url= APEX_VALUE |url= QUOTED_VALUE )
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==APEX_VALUE) ) {
						alt104=1;
					}
					else if ( (LA104_0==QUOTED_VALUE) ) {
						alt104=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 104, 0, input);
						throw nvae;
					}

					switch (alt104) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule6016); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule6022); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule6035); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:609:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:610:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule6056); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule6058); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6069); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule6071); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6075); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule6077); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule6081); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule6110); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:618:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule6129); 
			match(input,AS,FOLLOW_AS_in_saveAsRule6131); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6141); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:621:12: ( AT db= ID )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==AT) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:621:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule6145); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule6149); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule6169); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:626:1: lookupFromWebRule : LOOKUP FROM WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:627:2: ( LOOKUP FROM WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:628:3: LOOKUP FROM WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule6185); 
			match(input,FROM,FOLLOW_FROM_in_lookupFromWebRule6187); 
			match(input,WEB,FOLLOW_WEB_in_lookupFromWebRule6189); 
				LookupFromWeb gfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:4: (fe= forEachRule )+
			int cnt107=0;
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==FOR) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule6205);
					fe=forEachRule();
					state._fsp--;

						gfw.addForEach (fe);	
					}
					break;

				default :
					if ( cnt107 >= 1 ) break loop107;
					EarlyExitException eee = new EarlyExitException(107, input);
					throw eee;
				}
				cnt107++;
			}

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule6218); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:634:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:635:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:636:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule6238); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule6240); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule6244);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule6249); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule6253);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC ;
	public final void joinOfCollectionsRule() throws RecognitionException {
		Token tk=null;
		Token g=null;
		DbCollection c1 =null;
		DbCollection c2 =null;
		SpatialFunction nff =null;
		SetFuzzySets sfs =null;
		CaseClause cc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:642:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:643:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule6276); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule6278); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6280); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6289);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule6293); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6297);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==ON) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule6309); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6311); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6315);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==SET) ) {
				int LA110_1 = input.LA(2);
				if ( (LA110_1==GEOMETRY) ) {
					alt110=1;
				}
			}
			switch (alt110) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule6347); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6349); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					int alt109=4;
					switch ( input.LA(1) ) {
					case INTERSECTION:
						{
						alt109=1;
						}
						break;
					case RIGHT:
						{
						alt109=2;
						}
						break;
					case LEFT:
						{
						alt109=3;
						}
						break;
					case ALL:
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule6355); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule6361); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule6367); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule6373); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:647:7: ( addFieldsRule[jc] )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==ADD_ST) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:647:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule6393);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:648:7: (sfs= setFuzzySetsRule )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==SET) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:648:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6453);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:649:6: (cc= caseClauseRule )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==CASE) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:649:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule6495);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:7: ( REMOVE DUPLICATES )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==REMOVE) ) {
				alt114=1;
			}
			switch (alt114) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule6544); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule6546); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule6587); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:655:1: filterRule : FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:656:3: ( FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:657:4: FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule6611); 
			pushFollow(FOLLOW_caseClauseRule_in_filterRule6623);
			fc=caseClauseRule();
			state._fsp--;

			 Filter f = env.addFilter (fc); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:659:7: ( REMOVE DUPLICATES )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==REMOVE) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:659:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule6641); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule6643); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule6665); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:664:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule6686); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:7: (p= groupPartitionRule )+
			int cnt116=0;
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==PARTITION) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule6711);
					p=groupPartitionRule();
					state._fsp--;

					 g.addPartition (p); 
					}
					break;

				default :
					if ( cnt116 >= 1 ) break loop116;
					EarlyExitException eee = new EarlyExitException(116, input);
					throw eee;
				}
				cnt116++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:7: (oth= othersRule )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==DROP||LA117_0==KEEP) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule6737);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule6761); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:673:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:674:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:675:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule6784); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule6788);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule6801); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6805);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:10: ( COMMA fr= fieldRefRule )*
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==COMMA) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6830); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6834);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop118;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule6856); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6860);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:8: ( DROP GROUPING FIELDS )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==DROP) ) {
				int LA119_1 = input.LA(2);
				if ( (LA119_1==GROUPING) ) {
					alt119=1;
				}
			}
			switch (alt119) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule6881); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule6883); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule6885); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:680:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==ORDER) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:680:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule6907); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule6909); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6913);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:681:9: ( COMMA sf= sortingFieldRule )*
					loop120:
					while (true) {
						int alt120=2;
						int LA120_0 = input.LA(1);
						if ( (LA120_0==COMMA) ) {
							alt120=1;
						}

						switch (alt120) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:681:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6930); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6934);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop120;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:682:6: ( KEEP UNCOMPARABLE )?
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( (LA121_0==KEEP) ) {
						int LA121_1 = input.LA(2);
						if ( (LA121_1==UNCOMPARABLE) ) {
							alt121=1;
						}
					}
					switch (alt121) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:682:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule6953); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule6955); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:7: (gs= generateSectionRule[false] )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==GENERATE) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule6986);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:689:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:690:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule7017);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule7021); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule7025); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:692:3: (v= VERSUS )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==VERSUS) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:692:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule7040); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:695:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:696:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:697:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule7069); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:698:7: (u= unpackRule )+
			int cnt125=0;
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==UNPACK) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:698:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule7093);
					u=unpackRule();
					state._fsp--;

					 e.addUnpack (u); 
					}
					break;

				default :
					if ( cnt125 >= 1 ) break loop125;
					EarlyExitException eee = new EarlyExitException(125, input);
					throw eee;
				}
				cnt125++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:7: (oth= othersRule )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==DROP||LA126_0==KEEP) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule7125);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule7149); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:704:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:705:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:706:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule7171); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule7176);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule7183); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7187);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule7194); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7198);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:6: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule7226); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule7228); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7242);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:9: ( COMMA cr= collectionReferenceRule )+
			int cnt127=0;
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==COMMA) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule7264); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7268);
					cr=collectionReferenceRule();
					state._fsp--;

					 mc.addCollection (cr); 
					}
					break;

				default :
					if ( cnt127 >= 1 ) break loop127;
					EarlyExitException eee = new EarlyExitException(127, input);
					throw eee;
				}
				cnt127++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:7: ( REMOVE DUPLICATES )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==REMOVE) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule7289); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule7291); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule7321); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:722:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:723:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule7341); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule7343); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7353);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule7355); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7359);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule7371); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:730:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:731:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:732:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule7393); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule7395); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7403);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule7405); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7409);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule7421); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:740:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule7448); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule7458); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:10: (d= ID |d= APEX_VALUE )
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==ID) ) {
				alt129=1;
			}
			else if ( (LA129_0==APEX_VALUE) ) {
				alt129=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}

			switch (alt129) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7463); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7469); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:743:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==AS) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:743:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule7493); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:743:13: (a= ID |a= APEX_VALUE )
					int alt130=2;
					int LA130_0 = input.LA(1);
					if ( (LA130_0==ID) ) {
						alt130=1;
					}
					else if ( (LA130_0==APEX_VALUE) ) {
						alt130=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 130, 0, input);
						throw nvae;
					}

					switch (alt130) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:743:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7498); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:743:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7504); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==COMMA) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule7585); 
					match(input,DB,FOLLOW_DB_in_useDbRule7587); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:20: (d= ID |d= APEX_VALUE )
					int alt132=2;
					int LA132_0 = input.LA(1);
					if ( (LA132_0==ID) ) {
						alt132=1;
					}
					else if ( (LA132_0==APEX_VALUE) ) {
						alt132=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 132, 0, input);
						throw nvae;
					}

					switch (alt132) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7592); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7598); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==AS) ) {
						alt134=1;
					}
					switch (alt134) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule7621); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:21: (a= ID |a= APEX_VALUE )
							int alt133=2;
							int LA133_0 = input.LA(1);
							if ( (LA133_0==ID) ) {
								alt133=1;
							}
							else if ( (LA133_0==APEX_VALUE) ) {
								alt133=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 133, 0, input);
								throw nvae;
							}

							switch (alt133) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7626); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7632); 
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
					break loop135;
				}
			}

			match(input,ON,FOLLOW_ON_in_useDbRule7710); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==DEFAULT) ) {
				alt139=1;
			}
			else if ( (LA139_0==SERVER) ) {
				alt139=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}

			switch (alt139) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule7722); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7724); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:752:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7736); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:753:10: (d= ID |d= APEX_VALUE )
					int alt136=2;
					int LA136_0 = input.LA(1);
					if ( (LA136_0==ID) ) {
						alt136=1;
					}
					else if ( (LA136_0==APEX_VALUE) ) {
						alt136=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 136, 0, input);
						throw nvae;
					}

					switch (alt136) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:753:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7751); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:753:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7757); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( (LA138_0==APEX_VALUE||LA138_0==ID) ) {
						alt138=1;
					}
					switch (alt138) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:12: (d= ID |d= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7781); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7787); 
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

			match(input,SC,FOLLOW_SC_in_useDbRule7812); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:760:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:761:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7837); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule7839); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7849);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule7851); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7855);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:7: (tp= trajectoryPartitionRule )+
			int cnt140=0;
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==PARTITION) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7871);
					tp=trajectoryPartitionRule();
					state._fsp--;

					 tm.addPartition (tp); 
					}
					break;

				default :
					if ( cnt140 >= 1 ) break loop140;
					EarlyExitException eee = new EarlyExitException(140, input);
					throw eee;
				}
				cnt140++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:7: (oth= othersRule )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==DROP||LA141_0==KEEP) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule7911);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule7953); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:770:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:771:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:772:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule7981); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule7991);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:774:6: (tpm= partitionMatchingRule )+
			int cnt142=0;
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==MATCHING) ) {
					alt142=1;
				}

				switch (alt142) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:774:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8012);
					tpm=partitionMatchingRule();
					state._fsp--;

					 tp.addPartitionMatching (tpm);  
					}
					break;

				default :
					if ( cnt142 >= 1 ) break loop142;
					EarlyExitException eee = new EarlyExitException(142, input);
					throw eee;
				}
				cnt142++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:778:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:779:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:780:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule8049); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8053);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule8060); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8064);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule8071); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule8073); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule8077); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule8080); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8084);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:6: ( WHERE wc= orConditionRule )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==WHERE) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule8099); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule8103);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule8127); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8131);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:785:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==ADDING) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:785:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule8154); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule8158);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule8160); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule8162); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:6: ( MIN_SIMILARITY n= numericRule )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==MIN_SIMILARITY) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:786:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8184); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8188);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:792:1: parameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:793:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8236); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule8252); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8256); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:799:1: createJavaScriptFunctionRule : CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:800:2: ( CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:801:4: CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaScriptFunctionRule8280); 
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8282); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8284); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule8292); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8324); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8334);
			p=parameterRule(jsf.getParamList());
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:5: ( COMMA p= parameterRule[jsf.getParamList()] )*
			loop146:
			while (true) {
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==COMMA) ) {
					alt146=1;
				}

				switch (alt146) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:7: COMMA p= parameterRule[jsf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule8359); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8363);
					p=parameterRule(jsf.getParamList());
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop146;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:806:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==PRECONDITION) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:806:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8388); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8392);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule8406); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule8419); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule8425); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:829:1: createFuzzyOperatorRule : CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:830:3: ( CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:831:4: CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyOperatorRule8447); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyOperatorRule8449); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createFuzzyOperatorRule8451); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule8455); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8480); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8490);
			p=parameterRule(fo.getParamList());
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:5: ( COMMA p= parameterRule[fo.getParamList()] )*
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==COMMA) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:7: COMMA p= parameterRule[fo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8515); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8519);
					p=parameterRule(fo.getParamList());
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop148;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:835:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==PRECONDITION) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:835:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8546); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8550);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule8564); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8568);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:837:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==POLYLINE) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:837:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule8586); 
					match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule8589); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8601); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8605);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8607); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8611);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8613); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:839:11: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt150=0;
					loop150:
					while (true) {
						int alt150=2;
						int LA150_0 = input.LA(1);
						if ( (LA150_0==COMMA) ) {
							alt150=1;
						}

						switch (alt150) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:839:13: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8635); 
							match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8637); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8641);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8643); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8647);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8649); 
							 env.addFuzzyPolylinePoint (fo, x, y); 
							}
							break;

						default :
							if ( cnt150 >= 1 ) break loop150;
							EarlyExitException eee = new EarlyExitException(150, input);
							throw eee;
						}
						cnt150++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule8670); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule8677); 
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



	// $ANTLR start "aggSpecRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:846:1: aggSpecRule[FuzzyAggregator fa, ForAllClause fac] returns [AggregateClause ac] : (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID ;
	public final AggregateClause aggSpecRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		AggregateClause ac = null;


		Token alias=null;
		String with_type =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:846:80: ( (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:847:2: (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:847:2: (with_type= withSpec )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==WITH) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:847:3: with_type= withSpec
					{
					pushFollow(FOLLOW_withSpec_in_aggSpecRule8703);
					with_type=withSpec();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_faExpressionRule_in_aggSpecRule8709);
			e=faExpressionRule(fa, fac);
			state._fsp--;

			match(input,AS,FOLLOW_AS_in_aggSpecRule8713); 
			alias=(Token)match(input,ID,FOLLOW_ID_in_aggSpecRule8717); 
			 ac = env.createAggregateClause(with_type, e, alias, fa, fac);
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



	// $ANTLR start "createFuzzyAggregatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:849:1: createFuzzyAggregatorRule : CREATE FUZZY AGGREGATOR f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyAggregatorRule() throws RecognitionException {
		Token f=null;
		Token v=null;
		Parameter p =null;
		Condition pc =null;
		ForAllClause fac =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:2: ( CREATE FUZZY AGGREGATOR f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:2: CREATE FUZZY AGGREGATOR f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyAggregatorRule8731); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyAggregatorRule8733); 
			match(input,AGGREGATOR,FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule8735); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyAggregatorRule8739); 
			 FuzzyAggregator fa = env.addFuzzyAggregator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule8753); 
			pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8760);
			p=faParameterRule(fa.getParamList());
			state._fsp--;

			 fa.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:854:3: ( COMMA p= faParameterRule[fa.getParamList()] )*
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==COMMA) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:854:5: COMMA p= faParameterRule[fa.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8774); 
					pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8778);
					p=faParameterRule(fa.getParamList());
					state._fsp--;

					 fa.parameters.add (p);
					}
					break;

				default :
					break loop153;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:855:2: ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==PRECONDITION) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:855:4: PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule8797); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule8801);
					pc=jfOrConditionRule(fa.getParamList(), false);
					state._fsp--;

					 fa.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:856:2: ( SORT v= VERSUS )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==SORT) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:856:3: SORT v= VERSUS
					{
					match(input,SORT,FOLLOW_SORT_in_createFuzzyAggregatorRule8816); 
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_createFuzzyAggregatorRule8820); 
					 env.setVersusFuzzyAggregator(fa,v.getText());
					}
					break;

			}

			pushFollow(FOLLOW_forAllRule_in_createFuzzyAggregatorRule8840);
			fac=forAllRule(fa);
			state._fsp--;

			 fa.forAll.add(fac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:858:2: ( COMMA fac= forAllRule[fa] )*
			loop156:
			while (true) {
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==COMMA) ) {
					alt156=1;
				}

				switch (alt156) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:858:3: COMMA fac= forAllRule[fa]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8854); 
					pushFollow(FOLLOW_forAllRule_in_createFuzzyAggregatorRule8858);
					fac=forAllRule(fa);
					state._fsp--;

					 fa.forAll.add(fac);
					}
					break;

				default :
					break loop156;
				}
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyAggregatorRule8873); 
			pushFollow(FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule8877);
			e=faExpressionRule(fa, null);
			state._fsp--;

			 env.setEvaluateClause(fa, e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:2: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==POLYLINE) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:4: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyAggregatorRule8893); 
					match(input,LB,FOLLOW_LB_in_createFuzzyAggregatorRule8895); 
					match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule8900); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8904);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8906); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8910);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule8912); 
					 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:4: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt157=0;
					loop157:
					while (true) {
						int alt157=2;
						int LA157_0 = input.LA(1);
						if ( (LA157_0==COMMA) ) {
							alt157=1;
						}

						switch (alt157) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:6: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8924); 
							match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule8926); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8930);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8932); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8936);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule8938); 
							 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
							}
							break;

						default :
							if ( cnt157 >= 1 ) break loop157;
							EarlyExitException eee = new EarlyExitException(157, input);
							throw eee;
						}
						cnt157++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyAggregatorRule8950); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyAggregatorRule8956); 
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



	// $ANTLR start "withSpec"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:868:1: withSpec returns [String s] : WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM ) ;
	public final String withSpec() throws RecognitionException {
		String s = null;


		Token x=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:868:28: ( WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:3: WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM )
			{
			match(input,WITH,FOLLOW_WITH_in_withSpec8973); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:8: (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM )
			int alt159=6;
			switch ( input.LA(1) ) {
			case SUM:
				{
				alt159=1;
				}
				break;
			case PRODUCT:
				{
				alt159=2;
				}
				break;
			case DIVISION:
				{
				alt159=3;
				}
				break;
			case SUBTRACTION:
				{
				alt159=4;
				}
				break;
			case MINIMUM:
				{
				alt159=5;
				}
				break;
			case MAXIMUM:
				{
				alt159=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}
			switch (alt159) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:9: x= SUM
					{
					x=(Token)match(input,SUM,FOLLOW_SUM_in_withSpec8978); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:17: x= PRODUCT
					{
					x=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_withSpec8984); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:29: x= DIVISION
					{
					x=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_withSpec8990); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:42: x= SUBTRACTION
					{
					x=(Token)match(input,SUBTRACTION,FOLLOW_SUBTRACTION_in_withSpec8996); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:58: x= MINIMUM
					{
					x=(Token)match(input,MINIMUM,FOLLOW_MINIMUM_in_withSpec9002); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:70: x= MAXIMUM
					{
					x=(Token)match(input,MAXIMUM,FOLLOW_MAXIMUM_in_withSpec9008); 
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



	// $ANTLR start "forAllRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:1: forAllRule[FuzzyAggregator fa] returns [ForAllClause fac] : FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* ;
	public final ForAllClause forAllRule(FuzzyAggregator fa) throws RecognitionException {
		ForAllClause fac = null;


		Token array_id=null;
		Token id=null;
		Expression x1 =null;
		Expression x2 =null;
		Expression e =null;
		AggregateClause ac =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:58: ( FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:2: FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )*
			{
			match(input,FOR,FOLLOW_FOR_in_forAllRule9029); 
			match(input,ALL,FOLLOW_ALL_in_forAllRule9031); 
			array_id=(Token)match(input,ID,FOLLOW_ID_in_forAllRule9035); 
			fac = env.createForAllClause(array_id, fa);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:2: ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==IN) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:3: IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP
					{
					match(input,IN,FOLLOW_IN_in_forAllRule9048); 
					match(input,LP,FOLLOW_LP_in_forAllRule9050); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule9054);
					x1=faExpressionRule(fa, null);
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_forAllRule9058); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule9062);
					x2=faExpressionRule(fa, null);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_forAllRule9066); 
					fac.firstIndex = x1; fac.lastIndex=x2;
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:2: ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )*
			loop161:
			while (true) {
				int alt161=2;
				int LA161_0 = input.LA(1);
				if ( (LA161_0==LOCALLY) ) {
					alt161=1;
				}

				switch (alt161) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:3: LOCALLY e= faExpressionRule[fa, fac] AS id= ID
					{
					match(input,LOCALLY,FOLLOW_LOCALLY_in_forAllRule9076); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule9080);
					e=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,AS,FOLLOW_AS_in_forAllRule9084); 
					id=(Token)match(input,ID,FOLLOW_ID_in_forAllRule9088); 
					env.createLocallyClause(fac, id, e, fa);
					}
					break;

				default :
					break loop161;
				}
			}

			match(input,AGGREGATE,FOLLOW_AGGREGATE_in_forAllRule9099); 
			pushFollow(FOLLOW_aggSpecRule_in_forAllRule9103);
			ac=aggSpecRule(fa, fac);
			state._fsp--;

			 fac.aggregate.add(ac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:2: ( COMMA ac= aggSpecRule[fa, fac] )*
			loop162:
			while (true) {
				int alt162=2;
				int LA162_0 = input.LA(1);
				if ( (LA162_0==COMMA) ) {
					int LA162_1 = input.LA(2);
					if ( (LA162_1==ADD||LA162_1==APEX_VALUE||LA162_1==FLOAT||LA162_1==ID||LA162_1==INT||LA162_1==LP||LA162_1==POS||LA162_1==QUOTED_VALUE||LA162_1==SUB||LA162_1==WITH) ) {
						alt162=1;
					}

				}

				switch (alt162) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:4: COMMA ac= aggSpecRule[fa, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_forAllRule9115); 
					pushFollow(FOLLOW_aggSpecRule_in_forAllRule9119);
					ac=aggSpecRule(fa, fac);
					state._fsp--;

					 fac.aggregate.add(ac);
					}
					break;

				default :
					break loop162;
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
	// $ANTLR end "forAllRule"



	// $ANTLR start "faParameterRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:880:1: faParameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE (t= ID |t= ARRAY ) ;
	public final Parameter faParameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:2: (v= ID TYPE (t= ID |t= ARRAY ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:882:3: v= ID TYPE (t= ID |t= ARRAY )
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule9151); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_faParameterRule9167); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:883:8: (t= ID |t= ARRAY )
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==ID) ) {
				alt163=1;
			}
			else if ( (LA163_0==ARRAY) ) {
				alt163=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 163, 0, input);
				throw nvae;
			}

			switch (alt163) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:883:9: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule9172); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:883:14: t= ARRAY
					{
					t=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_faParameterRule9176); 
					}
					break;

			}

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
	// $ANTLR end "faParameterRule"



	// $ANTLR start "jfOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:888:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:889:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:890:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule9214);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:891:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop164:
			while (true) {
				int alt164=2;
				int LA164_0 = input.LA(1);
				if ( (LA164_0==OR) ) {
					alt164=1;
				}

				switch (alt164) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:891:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule9231); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule9235);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop164;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:897:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:898:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:899:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule9303);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop165:
			while (true) {
				int alt165=2;
				int LA165_0 = input.LA(1);
				if ( (LA165_0==AND) ) {
					alt165=1;
				}

				switch (alt165) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule9321); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule9325);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop165;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:905:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:906:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:907:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:907:5: (not= NOT )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==NOT) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:907:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule9393); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule9404);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:913:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:914:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:915:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule9442);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt167=3;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==EQ||LA167_0==GE||LA167_0==GT||LA167_0==LE||LA167_0==LT||LA167_0==NEQ) ) {
				alt167=1;
			}
			else if ( (LA167_0==INRANGE) ) {
				alt167=2;
			}
			switch (alt167) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule9462);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:917:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule9482);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:921:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:922:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:923:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule9529);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule9538);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:930:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:931:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:931:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==APEX_VALUE||LA169_0==FLOAT||LA169_0==ID||LA169_0==INT||LA169_0==LP||LA169_0==QUOTED_VALUE) ) {
				alt169=1;
			}
			else if ( (LA169_0==ADD||LA169_0==SUB) ) {
				alt169=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}

			switch (alt169) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:931:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9580);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:6: (s= ADD |s= SUB )
					int alt168=2;
					int LA168_0 = input.LA(1);
					if ( (LA168_0==ADD) ) {
						alt168=1;
					}
					else if ( (LA168_0==SUB) ) {
						alt168=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 168, 0, input);
						throw nvae;
					}

					switch (alt168) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule9603); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule9609); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9614);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop171:
			while (true) {
				int alt171=2;
				int LA171_0 = input.LA(1);
				if ( (LA171_0==ADD||LA171_0==SUB) ) {
					alt171=1;
				}

				switch (alt171) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:7: (s= ADD |s= SUB )
					int alt170=2;
					int LA170_0 = input.LA(1);
					if ( (LA170_0==ADD) ) {
						alt170=1;
					}
					else if ( (LA170_0==SUB) ) {
						alt170=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 170, 0, input);
						throw nvae;
					}

					switch (alt170) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule9632); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:933:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule9638); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9643);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop171;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:937:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:939:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:940:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule9683);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop173:
			while (true) {
				int alt173=2;
				int LA173_0 = input.LA(1);
				if ( (LA173_0==DIV||LA173_0==MUL) ) {
					alt173=1;
				}

				switch (alt173) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:7: (s= MUL |s= DIV )
					int alt172=2;
					int LA172_0 = input.LA(1);
					if ( (LA172_0==MUL) ) {
						alt172=1;
					}
					else if ( (LA172_0==DIV) ) {
						alt172=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 172, 0, input);
						throw nvae;
					}

					switch (alt172) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule9708); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule9714); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule9719);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop173;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? );
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		ArrayList<Expression> fp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:946:3: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt176=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt176=1;
				}
				break;
			case INT:
				{
				alt176=2;
				}
				break;
			case FLOAT:
				{
				alt176=3;
				}
				break;
			case APEX_VALUE:
				{
				alt176=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt176=5;
				}
				break;
			case ID:
				{
				alt176=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 176, 0, input);
				throw nvae;
			}
			switch (alt176) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:947:5: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule9759); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule9763);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule9767); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:948:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule9787); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:949:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule9825); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:950:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule9862); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:951:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule9896); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:952:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule9929); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:953:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt175=2;
					int LA175_0 = input.LA(1);
					if ( (LA175_0==LP) ) {
						alt175=1;
					}
					switch (alt175) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:953:7: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule9968); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:953:13: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt174=2;
							int LA174_0 = input.LA(1);
							if ( (LA174_0==ADD||LA174_0==APEX_VALUE||LA174_0==FLOAT||LA174_0==ID||LA174_0==INT||LA174_0==LP||LA174_0==QUOTED_VALUE||LA174_0==SUB) ) {
								alt174=1;
							}
							switch (alt174) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:953:14: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule9973);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule9979); 
							}
							break;

					}

					 expr = env.checkJFFactor(x, p1, fp, pl, jsCaller); 
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
	// $ANTLR end "jfFactorRule"



	// $ANTLR start "jfFunctionParamsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:957:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:959:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:960:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule10027);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:961:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop177:
			while (true) {
				int alt177=2;
				int LA177_0 = input.LA(1);
				if ( (LA177_0==COMMA) ) {
					alt177=1;
				}

				switch (alt177) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:961:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule10047); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule10051);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop177;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:1: faExpressionRule[FuzzyAggregator fa, ForAllClause fac] returns [Expression expr] : (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* ;
	public final Expression faExpressionRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:969:3: ( (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:970:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:970:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] )
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==APEX_VALUE||LA179_0==FLOAT||LA179_0==ID||LA179_0==INT||LA179_0==LP||LA179_0==POS||LA179_0==QUOTED_VALUE) ) {
				alt179=1;
			}
			else if ( (LA179_0==ADD||LA179_0==SUB) ) {
				alt179=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 179, 0, input);
				throw nvae;
			}

			switch (alt179) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:970:6: t= faTermRule[fa, fac]
					{
					pushFollow(FOLLOW_faTermRule_in_faExpressionRule10099);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:971:6: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:971:6: (s= ADD |s= SUB )
					int alt178=2;
					int LA178_0 = input.LA(1);
					if ( (LA178_0==ADD) ) {
						alt178=1;
					}
					else if ( (LA178_0==SUB) ) {
						alt178=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 178, 0, input);
						throw nvae;
					}

					switch (alt178) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:971:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule10120); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:971:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule10126); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule10131);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:972:5: ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			loop181:
			while (true) {
				int alt181=2;
				int LA181_0 = input.LA(1);
				if ( (LA181_0==ADD||LA181_0==SUB) ) {
					alt181=1;
				}

				switch (alt181) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:972:7: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:972:7: (s= ADD |s= SUB )
					int alt180=2;
					int LA180_0 = input.LA(1);
					if ( (LA180_0==ADD) ) {
						alt180=1;
					}
					else if ( (LA180_0==SUB) ) {
						alt180=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 180, 0, input);
						throw nvae;
					}

					switch (alt180) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:972:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule10148); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:972:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule10154); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule10159);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop181;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:1: faTermRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionTerm et] : f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* ;
	public final ExpressionTerm faTermRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:977:3: (f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:978:4: f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			{
			pushFollow(FOLLOW_faFactorRule_in_faTermRule10200);
			f=faFactorRule(fa, fac);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:5: ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			loop183:
			while (true) {
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==DIV||LA183_0==MUL) ) {
					alt183=1;
				}

				switch (alt183) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:7: (s= MUL |s= DIV ) f= faFactorRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:7: (s= MUL |s= DIV )
					int alt182=2;
					int LA182_0 = input.LA(1);
					if ( (LA182_0==MUL) ) {
						alt182=1;
					}
					else if ( (LA182_0==DIV) ) {
						alt182=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 182, 0, input);
						throw nvae;
					}

					switch (alt182) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_faTermRule10219); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_faTermRule10225); 
							}
							break;

					}

					pushFollow(FOLLOW_faFactorRule_in_faTermRule10230);
					f=faFactorRule(fa, fac);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop183;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:1: faFactorRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionFactor expr] : ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] )? );
	public final ExpressionFactor faFactorRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Expression op =null;
		ArrayReference ref =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:984:3: ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] )? )
			int alt185=7;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt185=1;
				}
				break;
			case INT:
				{
				alt185=2;
				}
				break;
			case FLOAT:
				{
				alt185=3;
				}
				break;
			case APEX_VALUE:
				{
				alt185=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt185=5;
				}
				break;
			case POS:
				{
				alt185=6;
				}
				break;
			case ID:
				{
				alt185=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 185, 0, input);
				throw nvae;
			}
			switch (alt185) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:985:4: LP op= faExpressionRule[fa, fac] RP
					{
					match(input,LP,FOLLOW_LP_in_faFactorRule10269); 
					pushFollow(FOLLOW_faExpressionRule_in_faFactorRule10274);
					op=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_faFactorRule10278); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:986:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_faFactorRule10293); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:987:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_faFactorRule10311); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:988:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_faFactorRule10329); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:989:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_faFactorRule10346); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText()));
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:990:6: v= POS
					{
					v=(Token)match(input,POS,FOLLOW_POS_in_faFactorRule10363); 
					 expr = new ExpressionFactor (new Value(Value.POS, v.getText()));
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:6: x= ID (ref= faArrayRefRule[x, fa] )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_faFactorRule10382); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:11: (ref= faArrayRefRule[x, fa] )?
					int alt184=2;
					int LA184_0 = input.LA(1);
					if ( (LA184_0==LB) ) {
						alt184=1;
					}
					switch (alt184) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:12: ref= faArrayRefRule[x, fa]
							{
							pushFollow(FOLLOW_faArrayRefRule_in_faFactorRule10387);
							ref=faArrayRefRule(x, fa);
							state._fsp--;

							}
							break;

					}

					 expr = env.setExprFromArrayRef(x, ref, fa, fac);
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
	// $ANTLR end "faFactorRule"



	// $ANTLR start "faArrayRefRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:996:1: faArrayRefRule[Token id, FuzzyAggregator fa] returns [ArrayReference ref] : LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? ;
	public final ArrayReference faArrayRefRule(Token id, FuzzyAggregator fa) throws RecognitionException {
		ArrayReference ref = null;


		Expression e =null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:996:75: ( LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:997:2: LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )?
			{
			match(input,LB,FOLLOW_LB_in_faArrayRefRule10453); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:997:5: (e= faExpressionRule[fa, null] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:997:6: e= faExpressionRule[fa, null]
			{
			pushFollow(FOLLOW_faExpressionRule_in_faArrayRefRule10458);
			e=faExpressionRule(fa, null);
			state._fsp--;

			}

			match(input,RB,FOLLOW_RB_in_faArrayRefRule10463); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:997:40: (f= fieldRefRule )?
			int alt186=2;
			int LA186_0 = input.LA(1);
			if ( (LA186_0==FIELD_NAME) ) {
				alt186=1;
			}
			switch (alt186) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:997:41: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_faArrayRefRule10470);
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



	// $ANTLR start "createFuzzySetTypeRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1005:1: createFuzzySetTypeRule : CREATE TYPE OF FUZZY SET t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[ft.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[ft.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[ft.getAllDegreesList(), false] )? (fo= ftOperator[ft] )* SC ;
	public final void createFuzzySetTypeRule() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token n=null;
		Expression e =null;
		Condition c =null;
		FuzzyOperatorDefinition fo =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1005:23: ( CREATE TYPE OF FUZZY SET t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[ft.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[ft.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[ft.getAllDegreesList(), false] )? (fo= ftOperator[ft] )* SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1006:3: CREATE TYPE OF FUZZY SET t= ID DEGREES p= ID ( COMMA p= ID )* ( DERIVED DEGREES n= ID AS e= ftExpressionRule[ft.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[ft.getDegreesList()] )* )? ( CONSTRAINT c= jfOrConditionRule[ft.getAllDegreesList(), false] )? (fo= ftOperator[ft] )* SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzySetTypeRule10490); 
			match(input,TYPE,FOLLOW_TYPE_in_createFuzzySetTypeRule10492); 
			match(input,OF,FOLLOW_OF_in_createFuzzySetTypeRule10494); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzySetTypeRule10496); 
			match(input,SET,FOLLOW_SET_in_createFuzzySetTypeRule10498); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetTypeRule10502); 
			 FuzzySetType ft = env.addFuzzySetType (t);	
			match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetTypeRule10511); 
			p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetTypeRule10517); 
			 env.addDegreeType(ft, p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1008:5: ( COMMA p= ID )*
			loop187:
			while (true) {
				int alt187=2;
				int LA187_0 = input.LA(1);
				if ( (LA187_0==COMMA) ) {
					alt187=1;
				}

				switch (alt187) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1008:7: COMMA p= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetTypeRule10536); 
					p=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetTypeRule10540); 
					 env.addDegreeType(ft, p); 
					}
					break;

				default :
					break loop187;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1009:3: ( DERIVED DEGREES n= ID AS e= ftExpressionRule[ft.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[ft.getDegreesList()] )* )?
			int alt189=2;
			int LA189_0 = input.LA(1);
			if ( (LA189_0==DERIVED) ) {
				alt189=1;
			}
			switch (alt189) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1009:5: DERIVED DEGREES n= ID AS e= ftExpressionRule[ft.getDegreesList()] ( COMMA n= ID AS e= ftExpressionRule[ft.getDegreesList()] )*
					{
					match(input,DERIVED,FOLLOW_DERIVED_in_createFuzzySetTypeRule10565); 
					match(input,DEGREES,FOLLOW_DEGREES_in_createFuzzySetTypeRule10567); 
					n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetTypeRule10571); 
					 env.checkDerivedDegree(ft, n);  
					match(input,AS,FOLLOW_AS_in_createFuzzySetTypeRule10583); 
					pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetTypeRule10587);
					e=ftExpressionRule(ft.getDegreesList());
					state._fsp--;

					 env.addDerivedDegree(ft, n, e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1011:5: ( COMMA n= ID AS e= ftExpressionRule[ft.getDegreesList()] )*
					loop188:
					while (true) {
						int alt188=2;
						int LA188_0 = input.LA(1);
						if ( (LA188_0==COMMA) ) {
							alt188=1;
						}

						switch (alt188) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1011:7: COMMA n= ID AS e= ftExpressionRule[ft.getDegreesList()]
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzySetTypeRule10600); 
							n=(Token)match(input,ID,FOLLOW_ID_in_createFuzzySetTypeRule10607); 
							 env.checkDerivedDegree(ft, n);  
							match(input,AS,FOLLOW_AS_in_createFuzzySetTypeRule10630); 
							pushFollow(FOLLOW_ftExpressionRule_in_createFuzzySetTypeRule10634);
							e=ftExpressionRule(ft.getDegreesList());
							state._fsp--;

							 env.addDerivedDegree(ft, n, e); 
							}
							break;

						default :
							break loop188;
						}
					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1014:3: ( CONSTRAINT c= jfOrConditionRule[ft.getAllDegreesList(), false] )?
			int alt190=2;
			int LA190_0 = input.LA(1);
			if ( (LA190_0==CONSTRAINT) ) {
				alt190=1;
			}
			switch (alt190) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1014:5: CONSTRAINT c= jfOrConditionRule[ft.getAllDegreesList(), false]
					{
					match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_createFuzzySetTypeRule10651); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzySetTypeRule10655);
					c=jfOrConditionRule(ft.getAllDegreesList(), false);
					state._fsp--;

					 ft.constraint=c; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1015:3: (fo= ftOperator[ft] )*
			loop191:
			while (true) {
				int alt191=2;
				int LA191_0 = input.LA(1);
				if ( (LA191_0==OPERATOR) ) {
					alt191=1;
				}

				switch (alt191) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1015:5: fo= ftOperator[ft]
					{
					pushFollow(FOLLOW_ftOperator_in_createFuzzySetTypeRule10671);
					fo=ftOperator(ft);
					state._fsp--;

					}
					break;

				default :
					break loop191;
				}
			}

			match(input,SC,FOLLOW_SC_in_createFuzzySetTypeRule10679); 
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
	// $ANTLR end "createFuzzySetTypeRule"



	// $ANTLR start "ftOperator"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1019:1: ftOperator[FuzzySetType ft] returns [FuzzyOperatorDefinition defOp] : OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[ft.getDegreesList(), isNot] )+ ;
	public final FuzzyOperatorDefinition ftOperator(FuzzySetType ft) throws RecognitionException {
		FuzzyOperatorDefinition defOp = null;


		Token o=null;
		Token x=null;
		Expression exp =null;

		 defOp = new FuzzyOperatorDefinition(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1020:49: ( OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[ft.getDegreesList(), isNot] )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1021:2: OPERATOR o= ( OR | AND | NOT ) ( EVALUATE x= ID AS exp= ftConditionExpressionRule[ft.getDegreesList(), isNot] )+
			{
			match(input,OPERATOR,FOLLOW_OPERATOR_in_ftOperator10700); 
			o=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==NOT||input.LA(1)==OR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
				boolean isNot = env.setFuzzyOperatorType(defOp,o);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1022:2: ( EVALUATE x= ID AS exp= ftConditionExpressionRule[ft.getDegreesList(), isNot] )+
			int cnt192=0;
			loop192:
			while (true) {
				int alt192=2;
				int LA192_0 = input.LA(1);
				if ( (LA192_0==EVALUATE) ) {
					alt192=1;
				}

				switch (alt192) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1022:4: EVALUATE x= ID AS exp= ftConditionExpressionRule[ft.getDegreesList(), isNot]
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_ftOperator10723); 
					x=(Token)match(input,ID,FOLLOW_ID_in_ftOperator10727); 
					match(input,AS,FOLLOW_AS_in_ftOperator10729); 
						env.checkOperatorDegree(defOp,x,ft.getDegreesList());		
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftOperator10746);
					exp=ftConditionExpressionRule(ft.getDegreesList(), isNot);
					state._fsp--;

						env.addOperatorDegree(defOp,x,exp,ft.getDegreesList());	
					}
					break;

				default :
					if ( cnt192 >= 1 ) break loop192;
					EarlyExitException eee = new EarlyExitException(192, input);
					throw eee;
				}
				cnt192++;
			}

			 env.addOperatorDefinition(ft,defOp,o); 
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
	// $ANTLR end "ftOperator"



	// $ANTLR start "createGenericFuzzySetOperatorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1027:1: createGenericFuzzySetOperatorRule : CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[fgo.getParamList()] ( COMMA p= parameterRule[fgo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fgo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[fgo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1027:34: ( CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[fgo.getParamList()] ( COMMA p= parameterRule[fgo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fgo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[fgo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1028:3: CREATE t= ID FUZZY OPERATOR n= ID PARAMETERS p= parameterRule[fgo.getParamList()] ( COMMA p= parameterRule[fgo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fgo.getParamList(), false] )? ( EVALUATE g= ID AS e= jfExpressionRule[fgo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+ SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule10774); 
			t=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule10778); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule10780); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule10782); 
			n=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule10786); 
			 GenericFuzzyOperator fgo = env.addGenericFuzzyOperator(t, n); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule10801); 
			pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule10805);
			p=parameterRule(fgo.getParamList());
			state._fsp--;

			 fgo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1030:4: ( COMMA p= parameterRule[fgo.getParamList()] )*
			loop193:
			while (true) {
				int alt193=2;
				int LA193_0 = input.LA(1);
				if ( (LA193_0==COMMA) ) {
					alt193=1;
				}

				switch (alt193) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1030:6: COMMA p= parameterRule[fgo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10825); 
					pushFollow(FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule10830);
					p=parameterRule(fgo.getParamList());
					state._fsp--;

					 fgo.parameters.add (p); 
					}
					break;

				default :
					break loop193;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1031:3: ( PRECONDITION pc= jfOrConditionRule[fgo.getParamList(), false] )?
			int alt194=2;
			int LA194_0 = input.LA(1);
			if ( (LA194_0==PRECONDITION) ) {
				alt194=1;
			}
			switch (alt194) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1031:5: PRECONDITION pc= jfOrConditionRule[fgo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule10852); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule10856);
					pc=jfOrConditionRule(fgo.getParamList(), false);
					state._fsp--;

					 fgo.precondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1032:3: ( EVALUATE g= ID AS e= jfExpressionRule[fgo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? )+
			int cnt197=0;
			loop197:
			while (true) {
				int alt197=2;
				int LA197_0 = input.LA(1);
				if ( (LA197_0==EVALUATE) ) {
					alt197=1;
				}

				switch (alt197) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1033:4: EVALUATE g= ID AS e= jfExpressionRule[fgo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					{
					match(input,EVALUATE,FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule10874); 
					g=(Token)match(input,ID,FOLLOW_ID_in_createGenericFuzzySetOperatorRule10878); 
					 Parameter ev = env.createFgoParameter (g); 
					match(input,AS,FOLLOW_AS_in_createGenericFuzzySetOperatorRule10906); 
					pushFollow(FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule10910);
					e=jfExpressionRule(fgo.getParamList(), false);
					state._fsp--;

					 FuzzyPolyline fp = env.manageEvaluate(fgo,ev,e); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1035:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
					int alt196=2;
					int LA196_0 = input.LA(1);
					if ( (LA196_0==POLYLINE) ) {
						alt196=1;
					}
					switch (alt196) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1036:5: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
							{
							match(input,POLYLINE,FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule10929); 
							match(input,LB,FOLLOW_LB_in_createGenericFuzzySetOperatorRule10931); 
							match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule10942); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10946);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10948); 
							pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10952);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule10954); 
							 env.addFuzzyPolylinePoint (fp, x, y); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1038:6: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
							int cnt195=0;
							loop195:
							while (true) {
								int alt195=2;
								int LA195_0 = input.LA(1);
								if ( (LA195_0==COMMA) ) {
									alt195=1;
								}

								switch (alt195) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1038:8: COMMA LP x= numericRule COMMA y= numericRule RP
									{
									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10970); 
									match(input,LP,FOLLOW_LP_in_createGenericFuzzySetOperatorRule10972); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10976);
									x=numericRule();
									state._fsp--;

									match(input,COMMA,FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10978); 
									pushFollow(FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10982);
									y=numericRule();
									state._fsp--;

									match(input,RP,FOLLOW_RP_in_createGenericFuzzySetOperatorRule10984); 
									 env.addFuzzyPolylinePoint (fp, x, y); 
									}
									break;

								default :
									if ( cnt195 >= 1 ) break loop195;
									EarlyExitException eee = new EarlyExitException(195, input);
									throw eee;
								}
								cnt195++;
							}

							match(input,RB,FOLLOW_RB_in_createGenericFuzzySetOperatorRule10996); 
							}
							break;

					}

					 fgo.polylines.add(fp); 
					}
					break;

				default :
					if ( cnt197 >= 1 ) break loop197;
					EarlyExitException eee = new EarlyExitException(197, input);
					throw eee;
				}
				cnt197++;
			}

			match(input,SC,FOLLOW_SC_in_createGenericFuzzySetOperatorRule11032); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1048:1: ftExpressionRule[ParamList pl] returns [Expression expr] : (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* ;
	public final Expression ftExpressionRule(ParamList pl) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1050:3: ( (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] ) ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:4: (t= ftTermRule[pl] | (s= ADD |s= SUB ) t= ftTermRule[pl] )
			int alt199=2;
			int LA199_0 = input.LA(1);
			if ( (LA199_0==ARRAY_FUNCTION||LA199_0==DEGREE||LA199_0==FLOAT||(LA199_0 >= ID && LA199_0 <= IF_ERROR)||LA199_0==INT||LA199_0==LP||LA199_0==MEMBERSHIP_TO||LA199_0==TRANSLATE) ) {
				alt199=1;
			}
			else if ( (LA199_0==ADD||LA199_0==SUB) ) {
				alt199=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 199, 0, input);
				throw nvae;
			}

			switch (alt199) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1051:6: t= ftTermRule[pl]
					{
					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule11066);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1052:6: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1052:6: (s= ADD |s= SUB )
					int alt198=2;
					int LA198_0 = input.LA(1);
					if ( (LA198_0==ADD) ) {
						alt198=1;
					}
					else if ( (LA198_0==SUB) ) {
						alt198=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 198, 0, input);
						throw nvae;
					}

					switch (alt198) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1052:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule11082); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1052:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule11088); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule11093);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1053:5: ( (s= ADD |s= SUB ) t= ftTermRule[pl] )*
			loop201:
			while (true) {
				int alt201=2;
				int LA201_0 = input.LA(1);
				if ( (LA201_0==ADD||LA201_0==SUB) ) {
					alt201=1;
				}

				switch (alt201) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1053:7: (s= ADD |s= SUB ) t= ftTermRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1053:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1053:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftExpressionRule11110); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1053:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftExpressionRule11116); 
							}
							break;

					}

					pushFollow(FOLLOW_ftTermRule_in_ftExpressionRule11121);
					t=ftTermRule(pl);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop201;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1056:1: ftTermRule[ParamList pl] returns [ExpressionTerm et] : f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* ;
	public final ExpressionTerm ftTermRule(ParamList pl) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:3: (f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1059:4: f= ftFactorRule[pl] ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			{
			pushFollow(FOLLOW_ftFactorRule_in_ftTermRule11159);
			f=ftFactorRule(pl);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:5: ( (s= MUL |s= DIV ) f= ftFactorRule[pl] )*
			loop203:
			while (true) {
				int alt203=2;
				int LA203_0 = input.LA(1);
				if ( (LA203_0==DIV||LA203_0==MUL) ) {
					alt203=1;
				}

				switch (alt203) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:7: (s= MUL |s= DIV ) f= ftFactorRule[pl]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:7: (s= MUL |s= DIV )
					int alt202=2;
					int LA202_0 = input.LA(1);
					if ( (LA202_0==MUL) ) {
						alt202=1;
					}
					else if ( (LA202_0==DIV) ) {
						alt202=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 202, 0, input);
						throw nvae;
					}

					switch (alt202) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftTermRule11176); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftTermRule11182); 
							}
							break;

					}

					pushFollow(FOLLOW_ftFactorRule_in_ftTermRule11187);
					f=ftFactorRule(pl);
					state._fsp--;

					 et.addFactor(f, s.getText());
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
		return et;
	}
	// $ANTLR end "ftTermRule"



	// $ANTLR start "ftFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:1: ftFactorRule[ParamList pl] returns [ExpressionFactor ef] : ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule );
	public final ExpressionFactor ftFactorRule(ParamList pl) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:57: ( LP op= ftExpressionRule[pl] RP |vl= ftValueRule |x= ID |x= ID LP (fp= ftFunctionParamsRule[pl] )? RP |e= specialFunctionRule )
			int alt205=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt205=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt205=2;
				}
				break;
			case ID:
				{
				int LA205_4 = input.LA(2);
				if ( (LA205_4==LP) ) {
					alt205=4;
				}
				else if ( (LA205_4==ADD||LA205_4==COMMA||LA205_4==CONSTRAINT||LA205_4==DIV||LA205_4==MUL||LA205_4==OPERATOR||LA205_4==RP||LA205_4==SC||LA205_4==SUB) ) {
					alt205=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 205, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case IF_ERROR:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt205=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 205, 0, input);
				throw nvae;
			}
			switch (alt205) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1064:5: LP op= ftExpressionRule[pl] RP
					{
					match(input,LP,FOLLOW_LP_in_ftFactorRule11219); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFactorRule11223);
					op=ftExpressionRule(pl);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftFactorRule11226); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:6: vl= ftValueRule
					{
					pushFollow(FOLLOW_ftValueRule_in_ftFactorRule11238);
					vl=ftValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1066:6: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule11252); 
					 ef = env.checkDegree(pl,x);	 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1067:6: x= ID LP (fp= ftFunctionParamsRule[pl] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftFactorRule11267); 
					match(input,LP,FOLLOW_LP_in_ftFactorRule11269); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1067:14: (fp= ftFunctionParamsRule[pl] )?
					int alt204=2;
					int LA204_0 = input.LA(1);
					if ( (LA204_0==ADD||LA204_0==ARRAY_FUNCTION||LA204_0==DEGREE||LA204_0==FLOAT||(LA204_0 >= ID && LA204_0 <= IF_ERROR)||LA204_0==INT||LA204_0==LP||LA204_0==MEMBERSHIP_TO||LA204_0==SUB||LA204_0==TRANSLATE) ) {
						alt204=1;
					}
					switch (alt204) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1067:15: fp= ftFunctionParamsRule[pl]
							{
							pushFollow(FOLLOW_ftFunctionParamsRule_in_ftFactorRule11274);
							fp=ftFunctionParamsRule(pl);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftFactorRule11279); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1068:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_ftFactorRule11294);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:1: ftValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:31: (n= INT |f= FLOAT )
			int alt206=2;
			int LA206_0 = input.LA(1);
			if ( (LA206_0==INT) ) {
				alt206=1;
			}
			else if ( (LA206_0==FLOAT) ) {
				alt206=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 206, 0, input);
				throw nvae;
			}

			switch (alt206) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1072:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftValueRule11319); 
					 vl = new Value (Value.INT, n.getText());   
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftValueRule11339); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1076:1: ftFunctionParamsRule[ParamList pl] returns [ArrayList<Expression> params] : e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* ;
	public final ArrayList<Expression> ftFunctionParamsRule(ParamList pl) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1078:3: (e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1079:4: e= ftExpressionRule[pl] ( COMMA e= ftExpressionRule[pl] )*
			{
			pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule11375);
			e=ftExpressionRule(pl);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:6: ( COMMA e= ftExpressionRule[pl] )*
			loop207:
			while (true) {
				int alt207=2;
				int LA207_0 = input.LA(1);
				if ( (LA207_0==COMMA) ) {
					alt207=1;
				}

				switch (alt207) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:8: COMMA e= ftExpressionRule[pl]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftFunctionParamsRule11396); 
					pushFollow(FOLLOW_ftExpressionRule_in_ftFunctionParamsRule11400);
					e=ftExpressionRule(pl);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop207;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1086:1: ftConditionExpressionRule[ParamList pl, boolean isNot] returns [Expression expr] : (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* ;
	public final Expression ftConditionExpressionRule(ParamList pl, boolean isNot) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1088:4: ( (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1089:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] ) ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1089:4: (t= ftConditionTermRule[pl,isNot] | (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )
			int alt209=2;
			int LA209_0 = input.LA(1);
			if ( (LA209_0==ARRAY_FUNCTION||LA209_0==DEGREE||LA209_0==FLOAT||(LA209_0 >= ID && LA209_0 <= IF_ERROR)||LA209_0==INT||LA209_0==LP||LA209_0==MEMBERSHIP_TO||LA209_0==TRANSLATE) ) {
				alt209=1;
			}
			else if ( (LA209_0==ADD||LA209_0==SUB) ) {
				alt209=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 209, 0, input);
				throw nvae;
			}

			switch (alt209) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1089:6: t= ftConditionTermRule[pl,isNot]
					{
					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule11450);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:6: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:6: (s= ADD |s= SUB )
					int alt208=2;
					int LA208_0 = input.LA(1);
					if ( (LA208_0==ADD) ) {
						alt208=1;
					}
					else if ( (LA208_0==SUB) ) {
						alt208=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 208, 0, input);
						throw nvae;
					}

					switch (alt208) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule11474); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule11480); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule11485);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:5: ( (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot] )*
			loop211:
			while (true) {
				int alt211=2;
				int LA211_0 = input.LA(1);
				if ( (LA211_0==ADD||LA211_0==SUB) ) {
					alt211=1;
				}

				switch (alt211) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:7: (s= ADD |s= SUB ) t= ftConditionTermRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:7: (s= ADD |s= SUB )
					int alt210=2;
					int LA210_0 = input.LA(1);
					if ( (LA210_0==ADD) ) {
						alt210=1;
					}
					else if ( (LA210_0==SUB) ) {
						alt210=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 210, 0, input);
						throw nvae;
					}

					switch (alt210) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_ftConditionExpressionRule11504); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_ftConditionExpressionRule11510); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule11515);
					t=ftConditionTermRule(pl, isNot);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop211;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1095:1: ftConditionTermRule[ParamList pl, boolean isNot] returns [ExpressionTerm et] : f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* ;
	public final ExpressionTerm ftConditionTermRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1097:4: (f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1098:4: f= ftConditionFactorRule[pl,isNot] ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule11549);
			f=ftConditionFactorRule(pl, isNot);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:5: ( (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot] )*
			loop213:
			while (true) {
				int alt213=2;
				int LA213_0 = input.LA(1);
				if ( (LA213_0==DIV||LA213_0==MUL) ) {
					alt213=1;
				}

				switch (alt213) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:7: (s= MUL |s= DIV ) f= ftConditionFactorRule[pl,isNot]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:7: (s= MUL |s= DIV )
					int alt212=2;
					int LA212_0 = input.LA(1);
					if ( (LA212_0==MUL) ) {
						alt212=1;
					}
					else if ( (LA212_0==DIV) ) {
						alt212=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 212, 0, input);
						throw nvae;
					}

					switch (alt212) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_ftConditionTermRule11566); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_ftConditionTermRule11572); 
							}
							break;

					}

					pushFollow(FOLLOW_ftConditionFactorRule_in_ftConditionTermRule11577);
					f=ftConditionFactorRule(pl, isNot);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop213;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1102:1: ftConditionFactorRule[ParamList pl, boolean isNot] returns [ExpressionFactor ef] : ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= specialFunctionRule );
	public final ExpressionFactor ftConditionFactorRule(ParamList pl, boolean isNot) throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Token f=null;
		Expression op =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1103:5: ( LP op= ftConditionExpressionRule[pl,isNot] RP |vl= ftConditionValueRule |x= ID f= FIELD_NAME |x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP |e= specialFunctionRule )
			int alt215=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt215=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt215=2;
				}
				break;
			case ID:
				{
				int LA215_4 = input.LA(2);
				if ( (LA215_4==FIELD_NAME) ) {
					alt215=3;
				}
				else if ( (LA215_4==LP) ) {
					alt215=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 215, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ARRAY_FUNCTION:
			case DEGREE:
			case IF_ERROR:
			case MEMBERSHIP_TO:
			case TRANSLATE:
				{
				alt215=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 215, 0, input);
				throw nvae;
			}
			switch (alt215) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1104:5: LP op= ftConditionExpressionRule[pl,isNot] RP
					{
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule11607); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule11611);
					op=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule11614); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1105:6: vl= ftConditionValueRule
					{
					pushFollow(FOLLOW_ftConditionValueRule_in_ftConditionFactorRule11625);
					vl=ftConditionValueRule();
					state._fsp--;

					 ef = new ExpressionFactor (vl); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:6: x= ID f= FIELD_NAME
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule11639); 
					f=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_ftConditionFactorRule11644); 
					 ef = env.makeExpDegree(x,f,isNot,pl); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1107:6: x= ID LP (fp= ftConditionFunctionParamsRule[pl,isNot] )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_ftConditionFactorRule11661); 
					match(input,LP,FOLLOW_LP_in_ftConditionFactorRule11663); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1107:14: (fp= ftConditionFunctionParamsRule[pl,isNot] )?
					int alt214=2;
					int LA214_0 = input.LA(1);
					if ( (LA214_0==ADD||LA214_0==ARRAY_FUNCTION||LA214_0==DEGREE||LA214_0==FLOAT||(LA214_0 >= ID && LA214_0 <= IF_ERROR)||LA214_0==INT||LA214_0==LP||LA214_0==MEMBERSHIP_TO||LA214_0==SUB||LA214_0==TRANSLATE) ) {
						alt214=1;
					}
					switch (alt214) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1107:15: fp= ftConditionFunctionParamsRule[pl,isNot]
							{
							pushFollow(FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule11668);
							fp=ftConditionFunctionParamsRule(pl, isNot);
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_ftConditionFactorRule11673); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_ftConditionFactorRule11688);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1112:1: ftConditionValueRule returns [Value vl] : (n= INT |f= FLOAT );
	public final Value ftConditionValueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1113:5: (n= INT |f= FLOAT )
			int alt216=2;
			int LA216_0 = input.LA(1);
			if ( (LA216_0==INT) ) {
				alt216=1;
			}
			else if ( (LA216_0==FLOAT) ) {
				alt216=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 216, 0, input);
				throw nvae;
			}

			switch (alt216) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1114:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_ftConditionValueRule11719); 
					 vl = new Value (Value.INT, n.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1115:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ftConditionValueRule11739); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1118:1: ftConditionFunctionParamsRule[ParamList pl, boolean isNot] returns [ArrayList<Expression> params] : e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* ;
	public final ArrayList<Expression> ftConditionFunctionParamsRule(ParamList pl, boolean isNot) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1120:3: (e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1121:4: e= ftConditionExpressionRule[pl,isNot] ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			{
			pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule11777);
			e=ftConditionExpressionRule(pl, isNot);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1122:6: ( COMMA e= ftConditionExpressionRule[pl,isNot] )*
			loop217:
			while (true) {
				int alt217=2;
				int LA217_0 = input.LA(1);
				if ( (LA217_0==COMMA) ) {
					alt217=1;
				}

				switch (alt217) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1122:8: COMMA e= ftConditionExpressionRule[pl,isNot]
					{
					match(input,COMMA,FOLLOW_COMMA_in_ftConditionFunctionParamsRule11796); 
					pushFollow(FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule11800);
					e=ftConditionExpressionRule(pl, isNot);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop217;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1133:1: createJavaFunctionRule : CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC ;
	public final void createJavaFunctionRule() throws RecognitionException {
		Token jfn=null;
		Token cl=null;
		Token imp=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1134:2: ( CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1135:4: CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaFunctionRule11836); 
			match(input,JAVA,FOLLOW_JAVA_in_createJavaFunctionRule11838); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaFunctionRule11840); 
			jfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule11848); 
			 JavaFunction jf = env.addJavaFunction (jfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaFunctionRule11880); 
			pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule11890);
			p=parameterRule(jf.getParamList());
			state._fsp--;

			 jf.parameters.add (p); 					
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:5: ( COMMA p= parameterRule[jf.getParamList()] )*
			loop218:
			while (true) {
				int alt218=2;
				int LA218_0 = input.LA(1);
				if ( (LA218_0==COMMA) ) {
					alt218=1;
				}

				switch (alt218) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:7: COMMA p= parameterRule[jf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaFunctionRule11914); 
					pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule11918);
					p=parameterRule(jf.getParamList());
					state._fsp--;

					 jf.parameters.add (p);					
					}
					break;

				default :
					break loop218;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1140:4: ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )?
			int alt219=2;
			int LA219_0 = input.LA(1);
			if ( (LA219_0==PRECONDITION) ) {
				alt219=1;
			}
			switch (alt219) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1140:6: PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaFunctionRule11941); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaFunctionRule11945);
					pc=jfOrConditionRule(jf.getParamList(), true);
					state._fsp--;

						jf.preCondition = pc; 					
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule11958); 
			cl=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule11962); 
				jf.setClass (cl.getText());		
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1142:4: ( IMPORT imp= QUOTED_VALUE )?
			int alt220=2;
			int LA220_0 = input.LA(1);
			if ( (LA220_0==IMPORT) ) {
				alt220=1;
			}
			switch (alt220) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1142:6: IMPORT imp= QUOTED_VALUE
					{
					match(input,IMPORT,FOLLOW_IMPORT_in_createJavaFunctionRule11996); 
					imp=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule12000); 
						jf.setImport (imp.getText()); 	
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule12029); 
			match(input,BODY,FOLLOW_BODY_in_createJavaFunctionRule12031); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaFunctionRule12044); 
			match(input,SC,FOLLOW_SC_in_createJavaFunctionRule12050); 
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



	public static final BitSet FOLLOW_getCollectionRule_in_start69 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_saveAsRule_in_start95 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start128 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_filterRule_in_start150 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_groupRule_in_start183 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_expandRule_in_start217 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start250 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start273 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start292 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_useDbRule_in_start312 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start346 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start365 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start380 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start392 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start410 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_createFuzzyAggregatorRule_in_start428 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_createFuzzySetTypeRule_in_start444 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_createGenericFuzzySetOperatorRule_in_start459 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_createJavaFunctionRule_in_start469 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_test_in_start484 = new BitSet(new long[]{0x0880000100000000L,0x0001020040800180L,0x0000400820201000L});
	public static final BitSet FOLLOW_EOF_in_start520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_test533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule557 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule571 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule635 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule675 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule729 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule740 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule761 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule765 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule806 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule820 = new BitSet(new long[]{0x240000100008A000L,0x000084100040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule991 = new BitSet(new long[]{0x0400000000000080L,0x8000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule1009 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1011 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1015 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule1017 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule1043 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1045 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1121 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1123 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_dropGeometryRule1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_GEOMETRY_in_dropGeometryRule1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1251 = new BitSet(new long[]{0x0001000000000002L,0x0000000080000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1323 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_DROP_in_othersRule1329 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1365 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1376 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1431 = new BitSet(new long[]{0x0002000801100402L,0x0000000100000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1448 = new BitSet(new long[]{0x0002000801100402L,0x0000000100000000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1465 = new BitSet(new long[]{0x0002000800100402L,0x0000000100000000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1496 = new BitSet(new long[]{0x0002000800100002L,0x0000000100000000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1534 = new BitSet(new long[]{0x0002000800000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1554 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_dropGeometryRule_in_generateSectionRule1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1633 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1648 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1652 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1709 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1725 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1729 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1791 = new BitSet(new long[]{0x250000100008A010L,0x000084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1847 = new BitSet(new long[]{0x0020000000000002L,0x0010082000200410L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule1959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule2005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule2041 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule2050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule2079 = new BitSet(new long[]{0x0000000000000000L,0x0000040800000000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule2085 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LP_in_inRangeRule2091 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2101 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule2103 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000840L});
	public static final BitSet FOLLOW_RP_in_inRangeRule2116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule2122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule2161 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2165 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2290 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2324 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2377 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2388 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2406 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2410 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2448 = new BitSet(new long[]{0x0400000000004000L,0x0000000000004040L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2463 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2469 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2475 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2496 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2519 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2523 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2569 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2592 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2598 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2603 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2621 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2627 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2632 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2670 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2693 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_DIV_in_termRule2699 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_factorRule_in_termRule2704 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2738 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_factorRule2744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2814 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2816 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100820L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_factorRule2825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule2897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule2916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule2930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_TO_in_specialFunctionRule2972 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEGREE_in_specialFunctionRule3012 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3022 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_FIELD_NAME_in_specialFunctionRule3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule3055 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3059 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3063 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3065 = new BitSet(new long[]{0x2000000000082000L,0x0000000000400000L,0x0000000000000020L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule3083 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule3087 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule3091 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule3097 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3116 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule3120 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3140 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule3145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule3172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3222 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3262 = new BitSet(new long[]{0x0400000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3291 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule3312 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3316 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3331 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3335 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule3359 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule3371 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3399 = new BitSet(new long[]{0x0400400000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3405 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3427 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3431 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule3463 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3486 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3490 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3509 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3513 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule3551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3586 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3609 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3615 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3620 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3638 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3644 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3649 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3687 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule3710 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule3716 = new BitSet(new long[]{0x240000100008A000L,0x000084000040C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3721 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3755 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule3776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule3800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule3825 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3827 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100820L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule3832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule3853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3896 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule3914 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3918 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule3962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule3972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule3982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule3992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule4002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule4012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule4052 = new BitSet(new long[]{0x2000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SUB_in_numericRule4058 = new BitSet(new long[]{0x2000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule4071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule4077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004008L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4121 = new BitSet(new long[]{0x0000000000000080L,0x0020040000014000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4126 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004008L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4189 = new BitSet(new long[]{0x0000000000000080L,0x0020040000014000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4193 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4222 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_faUsingPredicateRule4234 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_MEMBERSHIP_TO_in_faUsingPredicateRule4243 = new BitSet(new long[]{0x0000000000000200L,0x0000000800004000L});
	public static final BitSet FOLLOW_ALL_in_faUsingPredicateRule4264 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_faUsingPredicateRule4297 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_faUsingPredicateRule4301 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LB_in_faUsingPredicateRule4311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4315 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_faUsingPredicateRule4338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4342 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RB_in_faUsingPredicateRule4361 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_faUsingPredicateRule4376 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_faUsingPredicateRule4380 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_faUsingPredicateRule4393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4427 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule4442 = new BitSet(new long[]{0x0000000000000080L,0x0020040000014000L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4446 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4503 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule4519 = new BitSet(new long[]{0x0000000000000080L,0x0020040000014000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4523 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule4585 = new BitSet(new long[]{0x0000000000000080L,0x0000040000014000L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule4597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4629 = new BitSet(new long[]{0x0000000000000080L,0x0020040000014000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule4653 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4656 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100820L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule4661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_usingPredicateRule4686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_THROUGH_in_usingPredicateRule4688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_faUsingPredicateRule_in_usingPredicateRule4692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule4702 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4704 = new BitSet(new long[]{0x0000000000000080L,0x0020040000014000L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4712 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule4714 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule4718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule4742 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4747 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4753 = new BitSet(new long[]{0x0400000020000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule4757 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule4799 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4803 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4809 = new BitSet(new long[]{0x0400000020000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_alphaCutRule4813 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4870 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4888 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4915 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4933 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4966 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4985 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule5026 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_addFieldsRule5028 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LBR_in_addFieldsRule5055 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5063 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5065 = new BitSet(new long[]{0x240008100008A000L,0x0800C40000C8C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5069 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule5088 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule5092 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule5094 = new BitSet(new long[]{0x240008100008A000L,0x0800C40000C8C000L,0x0000000040000020L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule5098 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RBR_in_addFieldsRule5116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule5139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule5154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule5193 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5201 = new BitSet(new long[]{0x0020000000000002L,0x0010082000000410L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule5207 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule5235 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5237 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5243 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5249 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule5255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5260 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule5262 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule5283 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5285 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule5332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule5379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule5442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule5444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule5446 = new BitSet(new long[]{0x0000000000000000L,0x0000004080003800L,0x0000000000000400L});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule5454 = new BitSet(new long[]{0x0000000000000200L,0x0000004000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule5491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule5545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule5581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5612 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule5621 = new BitSet(new long[]{0x0000000000000000L,0x0000004000003800L,0x0000000000000400L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5623 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule5666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule5668 = new BitSet(new long[]{0x1000000000000800L,0x0200000400000000L});
	public static final BitSet FOLLOW_AND_in_resolvingRule5680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule5686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule5692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule5698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5730 = new BitSet(new long[]{0x0000000000000200L,0x0000000000004000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5736 = new BitSet(new long[]{0x0000000000000200L,0x0000000000004000L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule5747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5783 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule5822 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5826 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5842 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule5861 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5866 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5882 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule5912 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5917 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule5958 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule5960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004002L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5972 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule5976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_FROM_WEB_in_getCollectionRule6011 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule6016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule6022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule6035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule6056 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule6058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6069 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule6071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6075 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule6077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule6081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule6110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule6129 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule6131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6141 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_AT_in_saveAsRule6145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_saveAsRule6149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_saveAsRule6169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule6185 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FROM_in_lookupFromWebRule6187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_WEB_in_lookupFromWebRule6189 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule6205 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule6218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule6238 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule6240 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule6244 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule6249 = new BitSet(new long[]{0x240000100008A010L,0x000084000040C000L,0x0000000040100020L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule6253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule6276 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule6278 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6289 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule6293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6297 = new BitSet(new long[]{0x0000000000800040L,0x0080000000000000L,0x0000000000012100L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule6309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6311 = new BitSet(new long[]{0x0000080000000000L,0x0800400000880000L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6315 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000012100L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule6347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6349 = new BitSet(new long[]{0x0000000000000200L,0x0000004001000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule6355 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000012100L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule6361 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000012100L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule6367 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000012100L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule6373 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000012100L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule6393 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000000000012100L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6453 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule6495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule6544 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule6546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule6587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule6611 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule6623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule6641 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule6643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_filterRule6665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule6686 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule6711 = new BitSet(new long[]{0x0001000000000000L,0x4000000080000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_othersRule_in_groupRule6737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_groupRule6761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule6784 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule6788 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6801 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6805 = new BitSet(new long[]{0x0000000020000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6830 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6834 = new BitSet(new long[]{0x0000000020000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule6856 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6860 = new BitSet(new long[]{0x0001000000000002L,0x0400000000000020L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule6881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule6883 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule6885 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000020L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule6907 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6909 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6913 = new BitSet(new long[]{0x0000000020000002L,0x0000000080000020L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6930 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6934 = new BitSet(new long[]{0x0000000020000002L,0x0000000080000020L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule6953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule6955 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule6986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule7017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule7021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule7025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule7040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule7069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule7093 = new BitSet(new long[]{0x0001000000000000L,0x0000000080000000L,0x0000000400002000L});
	public static final BitSet FOLLOW_othersRule_in_expandRule7125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_expandRule7149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule7171 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule7176 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule7183 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_TO_in_unpackRule7194 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule7226 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule7228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7242 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule7264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7268 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule7289 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule7291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule7321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule7341 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule7343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7353 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule7355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule7371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule7393 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule7395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7403 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule7405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule7421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule7448 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7458 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7463 = new BitSet(new long[]{0x0000000020010000L,0x0080000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7469 = new BitSet(new long[]{0x0000000020010000L,0x0080000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7493 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7498 = new BitSet(new long[]{0x0000000020000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7504 = new BitSet(new long[]{0x0000000020000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule7585 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7587 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7592 = new BitSet(new long[]{0x0000000020010000L,0x0080000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7598 = new BitSet(new long[]{0x0000000020010000L,0x0080000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7621 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7626 = new BitSet(new long[]{0x0000000020000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7632 = new BitSet(new long[]{0x0000000020000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_ON_in_useDbRule7710 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule7722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7736 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7751 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L,0x0000000000002000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7757 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_useDbRule7781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_useDbRule7812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7837 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule7839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7849 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule7851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7855 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7871 = new BitSet(new long[]{0x0001000000000000L,0x4000000080000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule7911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule7953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule7981 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule7991 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule8012 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule8049 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule8060 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule8071 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule8073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule8077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule8080 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8084 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule8099 = new BitSet(new long[]{0x250000100008A010L,0x002084020040C000L,0x00000E0240100020L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule8103 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule8127 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8131 = new BitSet(new long[]{0x0000000000000022L,0x0004000000000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule8154 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule8158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule8160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule8162 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule8184 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule8236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule8252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_parameterRule8256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaScriptFunctionRule8280 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule8292 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8334 = new BitSet(new long[]{0x0000000020040000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule8359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8363 = new BitSet(new long[]{0x0000000020040000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8388 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8392 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule8406 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule8419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule8425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyOperatorRule8447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyOperatorRule8449 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_OPERATOR_in_createFuzzyOperatorRule8451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule8455 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8490 = new BitSet(new long[]{0x0040000020000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8519 = new BitSet(new long[]{0x0040000020000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8546 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8550 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule8564 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002001L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule8586 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule8589 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8601 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8605 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8607 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8613 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8635 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8637 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8641 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8643 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8649 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule8670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule8677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withSpec_in_aggSpecRule8703 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100022L});
	public static final BitSet FOLLOW_faExpressionRule_in_aggSpecRule8709 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_aggSpecRule8713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_aggSpecRule8717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyAggregatorRule8731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyAggregatorRule8733 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule8735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createFuzzyAggregatorRule8739 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule8753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8760 = new BitSet(new long[]{0x4000000020000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8778 = new BitSet(new long[]{0x4000000020000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule8797 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule8801 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_SORT_in_createFuzzyAggregatorRule8816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_VERSUS_in_createFuzzyAggregatorRule8820 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_forAllRule_in_createFuzzyAggregatorRule8840 = new BitSet(new long[]{0x0040000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8854 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_forAllRule_in_createFuzzyAggregatorRule8858 = new BitSet(new long[]{0x0040000020000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyAggregatorRule8873 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100022L});
	public static final BitSet FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule8877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002001L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyAggregatorRule8893 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyAggregatorRule8895 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule8900 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8904 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8906 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule8912 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8924 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule8926 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8930 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8932 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule8938 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RB_in_createFuzzyAggregatorRule8950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyAggregatorRule8956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withSpec8973 = new BitSet(new long[]{0x0000200000000000L,0x0002200000000000L,0x0000000000C00008L});
	public static final BitSet FOLLOW_SUM_in_withSpec8978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_withSpec8984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVISION_in_withSpec8990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACTION_in_withSpec8996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINIMUM_in_withSpec9002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAXIMUM_in_withSpec9008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forAllRule9029 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_forAllRule9031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_forAllRule9035 = new BitSet(new long[]{0x0000000000000080L,0x0000010000040000L});
	public static final BitSet FOLLOW_IN_in_forAllRule9048 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_forAllRule9050 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100022L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule9054 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_forAllRule9058 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100022L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule9062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_forAllRule9066 = new BitSet(new long[]{0x0000000000000080L,0x0000010000000000L});
	public static final BitSet FOLLOW_LOCALLY_in_forAllRule9076 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100022L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule9080 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_forAllRule9084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_forAllRule9088 = new BitSet(new long[]{0x0000000000000080L,0x0000010000000000L});
	public static final BitSet FOLLOW_AGGREGATE_in_forAllRule9099 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000020000100022L});
	public static final BitSet FOLLOW_aggSpecRule_in_forAllRule9103 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_forAllRule9115 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000020000100022L});
	public static final BitSet FOLLOW_aggSpecRule_in_forAllRule9119 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ID_in_faParameterRule9151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_TYPE_in_faParameterRule9167 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_faParameterRule9172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_faParameterRule9176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule9214 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule9231 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule9235 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule9303 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule9321 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule9325 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule9393 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule9404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule9442 = new BitSet(new long[]{0x0020000000000002L,0x0010082000200410L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule9462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule9482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule9529 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule9538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9580 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule9603 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule9609 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000020L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9614 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule9632 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule9638 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000020L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9643 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule9683 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule9708 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule9714 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000020L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule9719 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule9759 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule9763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule9767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule9787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule9825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule9862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule9896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule9929 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule9968 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100820L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule9973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule9979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule10027 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule10047 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule10051 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule10099 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule10120 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000022L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule10126 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000022L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule10131 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule10148 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000022L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule10154 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000022L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule10159 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule10200 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_MUL_in_faTermRule10219 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000022L});
	public static final BitSet FOLLOW_DIV_in_faTermRule10225 = new BitSet(new long[]{0x2000000000002000L,0x0000040000404000L,0x0000000000000022L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule10230 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_LP_in_faFactorRule10269 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100022L});
	public static final BitSet FOLLOW_faExpressionRule_in_faFactorRule10274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_faFactorRule10278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_faFactorRule10293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_faFactorRule10311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_faFactorRule10329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_faFactorRule10346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POS_in_faFactorRule10363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_faFactorRule10382 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_faArrayRefRule_in_faFactorRule10387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_faArrayRefRule10453 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100022L});
	public static final BitSet FOLLOW_faExpressionRule_in_faArrayRefRule10458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RB_in_faArrayRefRule10463 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_faArrayRefRule10470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzySetTypeRule10490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_TYPE_in_createFuzzySetTypeRule10492 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_OF_in_createFuzzySetTypeRule10494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzySetTypeRule10496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SET_in_createFuzzySetTypeRule10498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetTypeRule10502 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetTypeRule10511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetTypeRule10517 = new BitSet(new long[]{0x00000040A0000000L,0x0100000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetTypeRule10536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetTypeRule10540 = new BitSet(new long[]{0x00000040A0000000L,0x0100000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_DERIVED_in_createFuzzySetTypeRule10565 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DEGREES_in_createFuzzySetTypeRule10567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetTypeRule10571 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetTypeRule10583 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetTypeRule10587 = new BitSet(new long[]{0x00000000A0000000L,0x0100000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzySetTypeRule10600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createFuzzySetTypeRule10607 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createFuzzySetTypeRule10630 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_createFuzzySetTypeRule10634 = new BitSet(new long[]{0x00000000A0000000L,0x0100000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_CONSTRAINT_in_createFuzzySetTypeRule10651 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzySetTypeRule10655 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ftOperator_in_createFuzzySetTypeRule10671 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_createFuzzySetTypeRule10679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_ftOperator10700 = new BitSet(new long[]{0x0000000000000800L,0x0220000000000000L});
	public static final BitSet FOLLOW_set_in_ftOperator10704 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_ftOperator10723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_ftOperator10727 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_ftOperator10729 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftOperator10746 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createGenericFuzzySetOperatorRule10774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule10778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUZZY_in_createGenericFuzzySetOperatorRule10780 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_OPERATOR_in_createGenericFuzzySetOperatorRule10782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule10786 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createGenericFuzzySetOperatorRule10801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule10805 = new BitSet(new long[]{0x0040000020000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createGenericFuzzySetOperatorRule10830 = new BitSet(new long[]{0x0040000020000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_PRECONDITION_in_createGenericFuzzySetOperatorRule10852 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createGenericFuzzySetOperatorRule10856 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createGenericFuzzySetOperatorRule10874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createGenericFuzzySetOperatorRule10878 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_createGenericFuzzySetOperatorRule10906 = new BitSet(new long[]{0x2000000000002010L,0x0000040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createGenericFuzzySetOperatorRule10910 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000002001L});
	public static final BitSet FOLLOW_POLYLINE_in_createGenericFuzzySetOperatorRule10929 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LB_in_createGenericFuzzySetOperatorRule10931 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule10942 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10946 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10948 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule10954 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10970 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_createGenericFuzzySetOperatorRule10972 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10976 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_createGenericFuzzySetOperatorRule10978 = new BitSet(new long[]{0x2000000000000010L,0x0000000000400000L,0x0000000000100000L});
	public static final BitSet FOLLOW_numericRule_in_createGenericFuzzySetOperatorRule10982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_createGenericFuzzySetOperatorRule10984 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RB_in_createGenericFuzzySetOperatorRule10996 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_createGenericFuzzySetOperatorRule11032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule11066 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule11082 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule11088 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule11093 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_ftExpressionRule11110 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SUB_in_ftExpressionRule11116 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ftTermRule_in_ftExpressionRule11121 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule11159 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftTermRule11176 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_DIV_in_ftTermRule11182 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ftFactorRule_in_ftTermRule11187 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule11219 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFactorRule11223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule11226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftValueRule_in_ftFactorRule11238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule11252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftFactorRule11267 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_ftFactorRule11269 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100800L});
	public static final BitSet FOLLOW_ftFunctionParamsRule_in_ftFactorRule11274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_ftFactorRule11279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_ftFactorRule11294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftValueRule11319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftValueRule11339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule11375 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_ftFunctionParamsRule11396 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100000L});
	public static final BitSet FOLLOW_ftExpressionRule_in_ftFunctionParamsRule11400 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule11450 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule11474 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule11480 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule11485 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_ftConditionExpressionRule11504 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SUB_in_ftConditionExpressionRule11510 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ftConditionTermRule_in_ftConditionExpressionRule11515 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule11549 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_MUL_in_ftConditionTermRule11566 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_DIV_in_ftConditionTermRule11572 = new BitSet(new long[]{0x2000001000008000L,0x000084000040C000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ftConditionFactorRule_in_ftConditionTermRule11577 = new BitSet(new long[]{0x0000100000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule11607 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFactorRule11611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule11614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionValueRule_in_ftConditionFactorRule11625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule11639 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_ftConditionFactorRule11644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ftConditionFactorRule11661 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_ftConditionFactorRule11663 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100800L});
	public static final BitSet FOLLOW_ftConditionFunctionParamsRule_in_ftConditionFactorRule11668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_ftConditionFactorRule11673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_ftConditionFactorRule11688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ftConditionValueRule11719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_ftConditionValueRule11739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule11777 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_ftConditionFunctionParamsRule11796 = new BitSet(new long[]{0x2000001000008010L,0x000084000040C000L,0x0000000040100000L});
	public static final BitSet FOLLOW_ftConditionExpressionRule_in_ftConditionFunctionParamsRule11800 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaFunctionRule11836 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_JAVA_in_createJavaFunctionRule11838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaFunctionRule11840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule11848 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaFunctionRule11880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule11890 = new BitSet(new long[]{0x0000000022000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_createJavaFunctionRule11914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule11918 = new BitSet(new long[]{0x0000000022000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaFunctionRule11941 = new BitSet(new long[]{0x2000000000002010L,0x0020040000404000L,0x0000000000100020L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaFunctionRule11945 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule11958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule11962 = new BitSet(new long[]{0x0000000002000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_IMPORT_in_createJavaFunctionRule11996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule12000 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule12029 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaFunctionRule12031 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaFunctionRule12044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_createJavaFunctionRule12050 = new BitSet(new long[]{0x0000000000000002L});
}
