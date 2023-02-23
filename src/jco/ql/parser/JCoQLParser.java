// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2023-01-30 18:46:20

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
		"CASE", "CHECK_FOR", "CHECK_FOR_E", "CLASS", "COLLECTION", "COLLECTIONS", 
		"COLON", "COMMA", "COMMENT", "CREATE", "DB", "DEFAULT", "DEFUZZIFY", "DICTIONARY", 
		"DIGIT", "DIGIT0", "DIRECTION", "DISTANCE", "DIV", "DIVISION", "DOCUMENTS", 
		"DOT", "DROP", "DROPPING", "DUPLICATES", "EACH", "END_BODY", "EQ", "EVALUATE", 
		"EXPAND", "FIELD", "FIELDS", "FIELD_NAME", "FILTER", "FIRST", "FLOAT", 
		"FOR", "FROM", "FROM_ARRAY", "FROM_WEB", "FUNCTION", "FUZZY", "GE", "GENERATE", 
		"GEOMETRY", "GET", "GROUP", "GROUPING", "GT", "HOWINCLUDE", "HOWINTERSECT", 
		"HOWMEET", "ID", "IF_ERROR", "IF_FAILS", "IMPORT", "IN", "INCLUDED", "INPUT", 
		"INRANGE", "INT", "INTERSECT", "INTERSECTION", "INTO", "ISNOTNULL", "ISNULL", 
		"JAVA", "JAVASCRIPT", "JOIN", "KEEP", "KEEPING", "KNOWN", "LAST", "LB", 
		"LBR", "LE", "LEFT", "LETTER", "LOCALLY", "LOOKUP", "LP", "LT", "MATCHING", 
		"MAXIMUM", "MEET", "MEMBERSHIP_OF", "MERGE", "MINIMUM", "MIN_SIMILARITY", 
		"MUL", "NEQ", "NOT", "OF", "ON", "OPERATOR", "OR", "ORDER", "ORIENTATION", 
		"OTHERS", "PARAMETERS", "PARTITION", "POINT", "POLYLINE", "POS", "PRECONDITION", 
		"PRODUCT", "QUOTE", "QUOTED_VALUE", "RB", "RBR", "REMOVE", "RESOLVING", 
		"RIGHT", "RP", "SAVE", "SC", "SCAN_ERROR", "SERVER", "SET", "SETS", "SETTING", 
		"SORT", "SUB", "SUBTRACT", "SUBTRACTION", "SUM", "THRESHOLD", "THROUGH", 
		"TILDE", "TO", "TO_POLYLINE", "TRAJECTORY", "TRANSLATE", "TYPE", "UNCOMPARABLE", 
		"UNKNOWN", "UNPACK", "USE", "USING", "VERSUS", "WEB", "WHERE", "WHITE_SPACES", 
		"WITH", "WITHIN", "WITHOUT", "WRT", "WS", "XXX"
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
	public static final int CHECK_FOR_E=25;
	public static final int CLASS=26;
	public static final int COLLECTION=27;
	public static final int COLLECTIONS=28;
	public static final int COLON=29;
	public static final int COMMA=30;
	public static final int COMMENT=31;
	public static final int CREATE=32;
	public static final int DB=33;
	public static final int DEFAULT=34;
	public static final int DEFUZZIFY=35;
	public static final int DICTIONARY=36;
	public static final int DIGIT=37;
	public static final int DIGIT0=38;
	public static final int DIRECTION=39;
	public static final int DISTANCE=40;
	public static final int DIV=41;
	public static final int DIVISION=42;
	public static final int DOCUMENTS=43;
	public static final int DOT=44;
	public static final int DROP=45;
	public static final int DROPPING=46;
	public static final int DUPLICATES=47;
	public static final int EACH=48;
	public static final int END_BODY=49;
	public static final int EQ=50;
	public static final int EVALUATE=51;
	public static final int EXPAND=52;
	public static final int FIELD=53;
	public static final int FIELDS=54;
	public static final int FIELD_NAME=55;
	public static final int FILTER=56;
	public static final int FIRST=57;
	public static final int FLOAT=58;
	public static final int FOR=59;
	public static final int FROM=60;
	public static final int FROM_ARRAY=61;
	public static final int FROM_WEB=62;
	public static final int FUNCTION=63;
	public static final int FUZZY=64;
	public static final int GE=65;
	public static final int GENERATE=66;
	public static final int GEOMETRY=67;
	public static final int GET=68;
	public static final int GROUP=69;
	public static final int GROUPING=70;
	public static final int GT=71;
	public static final int HOWINCLUDE=72;
	public static final int HOWINTERSECT=73;
	public static final int HOWMEET=74;
	public static final int ID=75;
	public static final int IF_ERROR=76;
	public static final int IF_FAILS=77;
	public static final int IMPORT=78;
	public static final int IN=79;
	public static final int INCLUDED=80;
	public static final int INPUT=81;
	public static final int INRANGE=82;
	public static final int INT=83;
	public static final int INTERSECT=84;
	public static final int INTERSECTION=85;
	public static final int INTO=86;
	public static final int ISNOTNULL=87;
	public static final int ISNULL=88;
	public static final int JAVA=89;
	public static final int JAVASCRIPT=90;
	public static final int JOIN=91;
	public static final int KEEP=92;
	public static final int KEEPING=93;
	public static final int KNOWN=94;
	public static final int LAST=95;
	public static final int LB=96;
	public static final int LBR=97;
	public static final int LE=98;
	public static final int LEFT=99;
	public static final int LETTER=100;
	public static final int LOCALLY=101;
	public static final int LOOKUP=102;
	public static final int LP=103;
	public static final int LT=104;
	public static final int MATCHING=105;
	public static final int MAXIMUM=106;
	public static final int MEET=107;
	public static final int MEMBERSHIP_OF=108;
	public static final int MERGE=109;
	public static final int MINIMUM=110;
	public static final int MIN_SIMILARITY=111;
	public static final int MUL=112;
	public static final int NEQ=113;
	public static final int NOT=114;
	public static final int OF=115;
	public static final int ON=116;
	public static final int OPERATOR=117;
	public static final int OR=118;
	public static final int ORDER=119;
	public static final int ORIENTATION=120;
	public static final int OTHERS=121;
	public static final int PARAMETERS=122;
	public static final int PARTITION=123;
	public static final int POINT=124;
	public static final int POLYLINE=125;
	public static final int POS=126;
	public static final int PRECONDITION=127;
	public static final int PRODUCT=128;
	public static final int QUOTE=129;
	public static final int QUOTED_VALUE=130;
	public static final int RB=131;
	public static final int RBR=132;
	public static final int REMOVE=133;
	public static final int RESOLVING=134;
	public static final int RIGHT=135;
	public static final int RP=136;
	public static final int SAVE=137;
	public static final int SC=138;
	public static final int SCAN_ERROR=139;
	public static final int SERVER=140;
	public static final int SET=141;
	public static final int SETS=142;
	public static final int SETTING=143;
	public static final int SORT=144;
	public static final int SUB=145;
	public static final int SUBTRACT=146;
	public static final int SUBTRACTION=147;
	public static final int SUM=148;
	public static final int THRESHOLD=149;
	public static final int THROUGH=150;
	public static final int TILDE=151;
	public static final int TO=152;
	public static final int TO_POLYLINE=153;
	public static final int TRAJECTORY=154;
	public static final int TRANSLATE=155;
	public static final int TYPE=156;
	public static final int UNCOMPARABLE=157;
	public static final int UNKNOWN=158;
	public static final int UNPACK=159;
	public static final int USE=160;
	public static final int USING=161;
	public static final int VERSUS=162;
	public static final int WEB=163;
	public static final int WHERE=164;
	public static final int WHITE_SPACES=165;
	public static final int WITH=166;
	public static final int WITHIN=167;
	public static final int WITHOUT=168;
	public static final int WRT=169;
	public static final int WS=170;
	public static final int XXX=171;

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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:1: start : ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createJavaFunctionRule | test )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:3: ( ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createJavaFunctionRule | test )* EOF )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createJavaFunctionRule | test )* EOF
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | createJavaFunctionRule | test )*
			loop1:
			while (true) {
				int alt1=19;
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
					case JAVA:
						{
						alt1=17;
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
					alt1=18;
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
					pushFollow(FOLLOW_saveAsRule_in_start90);
					saveAsRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:88:7: joinOfCollectionsRule
					{
					pushFollow(FOLLOW_joinOfCollectionsRule_in_start118);
					joinOfCollectionsRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:89:7: filterRule
					{
					pushFollow(FOLLOW_filterRule_in_start135);
					filterRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:7: groupRule
					{
					pushFollow(FOLLOW_groupRule_in_start163);
					groupRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:91:7: expandRule
					{
					pushFollow(FOLLOW_expandRule_in_start192);
					expandRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:92:7: mergeCollectionsRule
					{
					pushFollow(FOLLOW_mergeCollectionsRule_in_start220);
					mergeCollectionsRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:93:7: intersectCollectionsRule
					{
					pushFollow(FOLLOW_intersectCollectionsRule_in_start238);
					intersectCollectionsRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:94:7: subtractCollectionsRule
					{
					pushFollow(FOLLOW_subtractCollectionsRule_in_start252);
					subtractCollectionsRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:7: useDbRule
					{
					pushFollow(FOLLOW_useDbRule_in_start267);
					useDbRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:96:7: trajectoryMatchingRule
					{
					pushFollow(FOLLOW_trajectoryMatchingRule_in_start296);
					trajectoryMatchingRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:97:7: createFuzzyOperatorRule
					{
					pushFollow(FOLLOW_createFuzzyOperatorRule_in_start312);
					createFuzzyOperatorRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:98:7: createJavaScriptFunctionRule
					{
					pushFollow(FOLLOW_createJavaScriptFunctionRule_in_start324);
					createJavaScriptFunctionRule();
					state._fsp--;

					}
					break;
				case 14 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:99:7: getDictionaryRule
					{
					pushFollow(FOLLOW_getDictionaryRule_in_start333);
					getDictionaryRule();
					state._fsp--;

					}
					break;
				case 15 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:100:7: lookupFromWebRule
					{
					pushFollow(FOLLOW_lookupFromWebRule_in_start348);
					lookupFromWebRule();
					state._fsp--;

					}
					break;
				case 16 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:101:7: createFuzzyAggregatorRule
					{
					pushFollow(FOLLOW_createFuzzyAggregatorRule_in_start363);
					createFuzzyAggregatorRule();
					state._fsp--;

					}
					break;
				case 17 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:102:7: createJavaFunctionRule
					{
					pushFollow(FOLLOW_createJavaFunctionRule_in_start376);
					createJavaFunctionRule();
					state._fsp--;

					}
					break;
				case 18 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:103:7: test
					{
					pushFollow(FOLLOW_test_in_start388);
					test();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start419); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:108:1: test : XXX SC ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:108:5: ( XXX SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:108:7: XXX SC
			{
			match(input,XXX,FOLLOW_XXX_in_test430); 
			match(input,SC,FOLLOW_SC_in_test432); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:113:1: collectionReferenceRule returns [DbCollection cr] : name= ID ( AT db= ID )? ( AS alias= ID )? ;
	public final DbCollection collectionReferenceRule() throws RecognitionException {
		DbCollection cr = null;


		Token name=null;
		Token db=null;
		Token alias=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:3: (name= ID ( AT db= ID )? ( AS alias= ID )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:5: name= ID ( AT db= ID )? ( AS alias= ID )?
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule456); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:116:5: ( AT db= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:116:7: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_collectionReferenceRule466); 
					db=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule470); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:117:5: ( AS alias= ID )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:117:7: AS alias= ID
					{
					match(input,AS,FOLLOW_AS_in_collectionReferenceRule483); 
					alias=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule487); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:1: fieldRefRule returns [Field field] : (fd= FIELD_NAME )+ ;
	public final Field fieldRefRule() throws RecognitionException {
		Field field = null;


		Token fd=null;

			field = new Field (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:124:3: ( (fd= FIELD_NAME )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:125:5: (fd= FIELD_NAME )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:125:5: (fd= FIELD_NAME )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:125:7: fd= FIELD_NAME
					{
					fd=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_fieldRefRule534); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:129:1: buildActionRule returns [BuildAction ga] : BUILD os= objectStructureRule[true] ;
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:131:3: ( BUILD os= objectStructureRule[true] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:132:5: BUILD os= objectStructureRule[true]
			{
			match(input,BUILD,FOLLOW_BUILD_in_buildActionRule574); 
			pushFollow(FOLLOW_objectStructureRule_in_buildActionRule592);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:138:1: objectStructureRule[boolean generateActionCaller] returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule(boolean generateActionCaller) throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:139:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:140:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule628); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule639);
			ofs=outputFieldSpecRule();
			state._fsp--;

			 obj = new ObjectStructure (ofs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:142:8: (t= COMMA ofs= outputFieldSpecRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:142:10: t= COMMA ofs= outputFieldSpecRule
					{
					t=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectStructureRule660); 
					pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule664);
					ofs=outputFieldSpecRule();
					state._fsp--;

					 env.addOutputFieldSpec (obj, ofs, generateActionCaller, t); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_objectStructureRule680); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:3: (fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:150:5: fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule705);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:151:5: ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:151:7: COLON (os= objectStructureRule[false] |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule719); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:151:13: (os= objectStructureRule[false] |f= factorRule )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==LBR) ) {
						alt6=1;
					}
					else if ( (LA6_0==APEX_VALUE||LA6_0==ARRAY_FUNCTION||LA6_0==BOOLEAN||LA6_0==FIELD_NAME||LA6_0==FLOAT||(LA6_0 >= ID && LA6_0 <= IF_ERROR)||LA6_0==INT||LA6_0==LP||LA6_0==MEMBERSHIP_OF||LA6_0==QUOTED_VALUE||LA6_0==TRANSLATE) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:151:15: os= objectStructureRule[false]
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule725);
							os=objectStructureRule(false);
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:152:11: f= factorRule
							{
							pushFollow(FOLLOW_factorRule_in_outputFieldSpecRule764);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:159:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:161:3: ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:162:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule854); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule856); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:163:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule888); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule890); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:164:14: ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:164:16: POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP
							{
							match(input,POINT,FOLLOW_POINT_in_geometricOptionRule908); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule910); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule914);
							lat=fieldRefRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_geometricOptionRule916); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule920);
							lon=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule922); 
							 geo.setPoint (lat, lon); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:165:16: AGGREGATE LP afr= fieldRefRule RP
							{
							match(input,AGGREGATE,FOLLOW_AGGREGATE_in_geometricOptionRule942); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule944); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule948);
							afr=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule950); 
							 geo.setAggregate (afr); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:166:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule982);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:167:16: TO_POLYLINE LP f= fieldRefRule RP
							{
							match(input,TO_POLYLINE,FOLLOW_TO_POLYLINE_in_geometricOptionRule1020); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1022); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1026);
							f=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1028); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:171:1: dropGeometryRule : DROPPING GEOMETRY ;
	public final void dropGeometryRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:172:3: ( DROPPING GEOMETRY )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:173:4: DROPPING GEOMETRY
			{
			match(input,DROPPING,FOLLOW_DROPPING_in_dropGeometryRule1074); 
			match(input,GEOMETRY,FOLLOW_GEOMETRY_in_dropGeometryRule1076); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:1: caseClauseRule returns [CaseClause cc] : CASE (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:3: ( CASE (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:179:5: CASE (wc= whereCaseRule )+ (oth= othersRule )?
			{
			match(input,CASE,FOLLOW_CASE_in_caseClauseRule1123); 
			 cc = new CaseClause (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:8: (wc= whereCaseRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1150);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:181:8: (oth= othersRule )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DROP||LA11_0==KEEP) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:181:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1179);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:6: (ot= KEEP |ot= DROP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1222); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1228); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1239); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:193:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:194:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:195:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1264); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1275);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:197:7: (gs= generateSectionRule[true] )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==GENERATE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:197:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1293);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:203:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (cf= checkForExtendedFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:204:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (cf= checkForExtendedFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (cf= checkForExtendedFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1330); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:7: (go= geometricOptionRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1347);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:4: (cf= checkForFuzzySetRule[gs] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHECK_FOR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1364);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:4: (cf= checkForExtendedFuzzySetRule[gs] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CHECK_FOR_E) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:6: cf= checkForExtendedFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForExtendedFuzzySetRule_in_generateSectionRule1395);
					checkForExtendedFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:4: (ac= alphaCutRule[gs] )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ALPHACUT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1426);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:210:7: (ga= buildActionRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BUILD) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:210:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1464);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:211:4: (df= keepDropFuzzySetsRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:211:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1484);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:212:7: ( dropGeometryRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==DROPPING) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:212:9: dropGeometryRule
					{
					pushFollow(FOLLOW_dropGeometryRule_in_generateSectionRule1502);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1563);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:223:4: ( OR c2= andConditionRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==OR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:223:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1578); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1582);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:228:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:229:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:230:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1639);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:231:5: ( AND c2= notConditionRule )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==AND) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:231:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1655); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1659);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:236:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:237:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:238:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:238:5: (not= NOT )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NOT) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:238:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1721); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1733);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:245:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:246:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
			int alt25=5;
			switch ( input.LA(1) ) {
			case ADD:
			case APEX_VALUE:
			case ARRAY_FUNCTION:
			case BOOLEAN:
			case FIELD_NAME:
			case FLOAT:
			case ID:
			case IF_ERROR:
			case INT:
			case LP:
			case MEMBERSHIP_OF:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:247:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1777);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule1805);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule1834);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:250:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule1866);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:251:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule1889);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:252:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule1915);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:253:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule1935);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:257:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:258:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule1971);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule1980);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:264:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:266:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule2009); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:266:11: (lp= LB |lp= LP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:266:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule2015); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:266:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule2021); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule2031);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule2033); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule2037);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:268:3: (rp= RP |rp= RB )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:268:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule2046); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:268:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule2052); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:272:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:273:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule2091); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2095);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:26: (n= ISNULL |n= ISNOTNULL )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2101); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2107); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:279:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:280:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:280:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:280:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2181); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:280:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2187); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:280:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2193); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2214); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2216); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2220); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:282:7: ( COMMA fs= ID )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:282:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2250); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2254); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:287:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:289:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2307); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2318);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:7: ( COMMA fr= fieldRefRule )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==COMMA) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2336); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2340);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:300:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2378); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ARRAY||LA33_0==GEOMETRY||LA33_0==ID) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2393); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2399); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2405); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2426);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:6: ( COMMA fr= fieldRefRule )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==COMMA) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2449); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2453);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==APEX_VALUE||LA36_0==ARRAY_FUNCTION||LA36_0==BOOLEAN||LA36_0==FIELD_NAME||LA36_0==FLOAT||(LA36_0 >= ID && LA36_0 <= IF_ERROR)||LA36_0==INT||LA36_0==LP||LA36_0==MEMBERSHIP_OF||LA36_0==QUOTED_VALUE||LA36_0==TRANSLATE) ) {
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2499);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:6: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2522); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2528); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2533);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==ADD||LA38_0==SUB) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2551); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2557); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2562);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:319:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:320:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2600);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==DIV||LA40_0==MUL) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:7: (s= MUL |s= DIV )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2623); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2629); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2634);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:325:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor factorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Condition op =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:3: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
			int alt42=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt42=1;
				}
				break;
			case FIELD_NAME:
				{
				alt42=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt42=3;
				}
				break;
			case ID:
				{
				alt42=4;
				}
				break;
			case ARRAY_FUNCTION:
			case IF_ERROR:
			case MEMBERSHIP_OF:
			case TRANSLATE:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:5: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2668); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2672);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2674); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:328:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2695);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:329:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2719);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:330:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2744); 
					match(input,LP,FOLLOW_LP_in_factorRule2746); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:330:14: (fp= functionParamsRule )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==ADD||LA41_0==APEX_VALUE||LA41_0==ARRAY_FUNCTION||LA41_0==BOOLEAN||LA41_0==FIELD_NAME||LA41_0==FLOAT||(LA41_0 >= ID && LA41_0 <= IF_ERROR)||LA41_0==INT||LA41_0==LP||LA41_0==MEMBERSHIP_OF||LA41_0==QUOTED_VALUE||LA41_0==SUB||LA41_0==TRANSLATE) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:330:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2751);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2755); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2770);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:335:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token a=null;
		Token q=null;
		Token b=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:3: (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN )
			int alt43=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt43=1;
				}
				break;
			case FLOAT:
				{
				alt43=2;
				}
				break;
			case APEX_VALUE:
				{
				alt43=3;
				}
				break;
			case QUOTED_VALUE:
				{
				alt43=4;
				}
				break;
			case BOOLEAN:
				{
				alt43=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule2807); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule2827); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:339:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule2846); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:340:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule2860); 
					 vl = new Value (Value.QUOTED, q.getText());	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule2872); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:345:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
	public final SpecialFunctionFactor specialFunctionRule() throws RecognitionException {
		SpecialFunctionFactor expr = null;


		Token f=null;
		Token mo=null;
		Token dict=null;
		Token cs=null;
		Token d=null;
		Expression e =null;
		Value v =null;
		ArrayFunctionFactor a =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:2: (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
			int alt47=4;
			switch ( input.LA(1) ) {
			case MEMBERSHIP_OF:
				{
				alt47=1;
				}
				break;
			case IF_ERROR:
				{
				alt47=2;
				}
				break;
			case TRANSLATE:
				{
				alt47=3;
				}
				break;
			case ARRAY_FUNCTION:
				{
				alt47=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:4: f= MEMBERSHIP_OF LP mo= ID RP
					{
					f=(Token)match(input,MEMBERSHIP_OF,FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2902); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2904); 
					mo=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2908); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule2910); 
						expr = env.buildMembershipOf (mo); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:5: f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					f=(Token)match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule2942); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2946); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2950);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2952); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule2956);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule2958); 
						expr = env.buildIfError (e, v); 	
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:349:5: f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					f=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule2970); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2974); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2978);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2980); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2984); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:350:15: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==COMMA) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:350:17: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3003); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule3007); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:16: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==COMMA) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:18: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule3027); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:24: (d= APEX_VALUE |d= QUOTED_VALUE )
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
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:25: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule3032); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:40: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule3038); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3047); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule3059);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3109); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3149); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:359:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3178);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:360:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule3199); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3203);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:5: ( COMMA e= restrictedExpressionRule )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==COMMA) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3218); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3222);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop48;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule3246); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3254); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule3258); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==COMMA) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3286); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3292);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:9: ( COMMA fx= fieldRefRule )*
							loop50:
							while (true) {
								int alt50=2;
								int LA50_0 = input.LA(1);
								if ( (LA50_0==COMMA) ) {
									alt50=1;
								}

								switch (alt50) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:366:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3314); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3318);
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:367:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule3350); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3373); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3377);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:369:9: ( COMMA fx= fieldRefRule )*
							loop51:
							while (true) {
								int alt51=2;
								int LA51_0 = input.LA(1);
								if ( (LA51_0==COMMA) ) {
									alt51=1;
								}

								switch (alt51) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:369:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3396); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3400);
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

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule3438); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==APEX_VALUE||LA55_0==ARRAY_FUNCTION||LA55_0==BOOLEAN||LA55_0==FIELD_NAME||LA55_0==FLOAT||(LA55_0 >= ID && LA55_0 <= IF_ERROR)||LA55_0==INT||LA55_0==LP||LA55_0==MEMBERSHIP_OF||LA55_0==QUOTED_VALUE||LA55_0==TRANSLATE) ) {
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3473);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:5: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3496); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3502); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3507);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==ADD||LA57_0==SUB) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3525); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3531); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3536);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:393:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3574);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==DIV||LA59_0==MUL) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:7: (s= MUL |s= DIV )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule3597); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule3603); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3608);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:399:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor restrictedFactorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression ex =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:400:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
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
			case IF_ERROR:
			case MEMBERSHIP_OF:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:401:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3642); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3646);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3648); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:402:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule3663);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:403:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule3687);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule3712); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3714); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:14: (fp= functionParamsRule )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==ADD||LA60_0==APEX_VALUE||LA60_0==ARRAY_FUNCTION||LA60_0==BOOLEAN||LA60_0==FIELD_NAME||LA60_0==FLOAT||(LA60_0 >= ID && LA60_0 <= IF_ERROR)||LA60_0==INT||LA60_0==LP||LA60_0==MEMBERSHIP_OF||LA60_0==QUOTED_VALUE||LA60_0==SUB||LA60_0==TRANSLATE) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule3719);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3723); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:405:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule3740);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:409:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:411:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3783);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:413:6: ( COMMA e= restrictedExpressionRule )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==COMMA) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:413:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule3801); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3805);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:421:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:422:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:423:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:423:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:423:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule3849); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule3859); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:425:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule3869); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:426:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule3879); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:427:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule3889); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule3899); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:436:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:437:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:437:4: (s= ADD |s= SUB )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:437:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule3939); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:437:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule3945); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:438:4: (n= FLOAT |n= INT )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:438:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule3958); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:438:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule3964); 
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



	// $ANTLR start "checkForExtendedFuzzySetRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:444:1: checkForExtendedFuzzySetRule[GenerateSection gs] : CHECK_FOR_E FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForExtendedFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:445:2: ( CHECK_FOR_E FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:446:3: CHECK_FOR_E FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR_E,FOLLOW_CHECK_FOR_E_in_checkForExtendedFuzzySetRule3993); 
			match(input,FUZZY,FOLLOW_FUZZY_in_checkForExtendedFuzzySetRule3995); 
			match(input,SET,FOLLOW_SET_in_checkForExtendedFuzzySetRule3997); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForExtendedFuzzySetRule4001); 
			match(input,USING,FOLLOW_USING_in_checkForExtendedFuzzySetRule4003); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:446:36: (fe= usingOrConditionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:446:38: fe= usingOrConditionRule
			{
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForExtendedFuzzySetRule4008);
			fe=usingOrConditionRule();
			state._fsp--;

			}

			 env.addCheckForFuzzySet (gs, fs, fe); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:4: ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==COMMA) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:6: COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_checkForExtendedFuzzySetRule4023); 
					match(input,FUZZY,FOLLOW_FUZZY_in_checkForExtendedFuzzySetRule4025); 
					match(input,SET,FOLLOW_SET_in_checkForExtendedFuzzySetRule4027); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForExtendedFuzzySetRule4031); 
					match(input,USING,FOLLOW_USING_in_checkForExtendedFuzzySetRule4033); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForExtendedFuzzySetRule4037);
					fe=usingOrConditionRule();
					state._fsp--;

					 env.addCheckForFuzzySet (gs, fs, fe); 
					}
					break;

				default :
					break loop66;
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
	// $ANTLR end "checkForExtendedFuzzySetRule"



	// $ANTLR start "checkForFuzzySetRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:450:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:2: ( CHECK_FOR FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:452:3: CHECK_FOR FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4063); 
			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4065); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4067); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4071); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4073); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:452:34: (fe= usingOrConditionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:452:36: fe= usingOrConditionRule
			{
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4078);
			fe=usingOrConditionRule();
			state._fsp--;

			}

			 env.addCheckForFuzzySet (gs, fs, fe); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:4: ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==COMMA) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:6: COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule4093); 
					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule4095); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule4097); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule4101); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule4103); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4107);
					fe=usingOrConditionRule();
					state._fsp--;

					 env.addCheckForFuzzySet (gs, fs, fe); 
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
	}
	// $ANTLR end "checkForFuzzySetRule"



	// $ANTLR start "faUsingPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:459:1: faUsingPredicateRule returns [UsingAggregatorPredicate p] : id= ID LP ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( ',' exp= restrictedExpressionRule )* RP ;
	public final UsingAggregatorPredicate faUsingPredicateRule() throws RecognitionException {
		UsingAggregatorPredicate p = null;


		Token id=null;
		Token fuzzySet=null;
		Token array=null;
		Expression exp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:460:3: (id= ID LP ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( ',' exp= restrictedExpressionRule )* RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:461:4: id= ID LP ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( ',' exp= restrictedExpressionRule )* RP
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4142); 
			 p = env.createUsingAggregatorPredicate(id); 
			match(input,LP,FOLLOW_LP_in_faUsingPredicateRule4153); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:463:2: ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:463:3: MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB )
			{
			match(input,MEMBERSHIP_OF,FOLLOW_MEMBERSHIP_OF_in_faUsingPredicateRule4158); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:464:2: ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB )
			int alt69=3;
			switch ( input.LA(1) ) {
			case ALL:
				{
				alt69=1;
				}
				break;
			case ID:
				{
				alt69=2;
				}
				break;
			case LB:
				{
				alt69=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:464:3: ALL
					{
					match(input,ALL,FOLLOW_ALL_in_faUsingPredicateRule4163); 
					p.aggregatorType =  UsingAggregatorPredicate.ALL_MEMBERSHIP_IN_DOCUMENT;
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:465:3: fuzzySet= ID FROM_ARRAY array= FIELD_NAME
					{
					fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4178); 
					match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_faUsingPredicateRule4180); 
					array=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_faUsingPredicateRule4184); 
					env.setUsingAggregateFromArray(p, fuzzySet, array);
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:466:4: LB fuzzySet= ID ( ',' fuzzySet= ID )* RB
					{
					match(input,LB,FOLLOW_LB_in_faUsingPredicateRule4191); 
					fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4195); 
					p.aggregatorType =  UsingAggregatorPredicate.SELECTED_FUZZY_SET_IN_DOCUMENT; env.setUsingAggregateInDocument(p, fuzzySet);
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:2: ( ',' fuzzySet= ID )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==COMMA) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:3: ',' fuzzySet= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_faUsingPredicateRule4206); 
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4210); 
							env.setUsingAggregateInDocument(p, fuzzySet);
							}
							break;

						default :
							break loop68;
						}
					}

					match(input,RB,FOLLOW_RB_in_faUsingPredicateRule4220); 
					}
					break;

			}

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:469:2: ( ',' exp= restrictedExpressionRule )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==COMMA) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:469:3: ',' exp= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_faUsingPredicateRule4230); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_faUsingPredicateRule4234);
					exp=restrictedExpressionRule();
					state._fsp--;

					p.parameters.add(exp);
					}
					break;

				default :
					break loop70;
				}
			}

			match(input,RP,FOLLOW_RP_in_faUsingPredicateRule4245); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:475:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:476:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4279);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:478:4: ( OR c2= usingAndConditionRule )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==OR) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:478:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule4294); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4298);
					c2=usingAndConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop71;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:483:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:484:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:485:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4355);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:486:5: ( AND c2= usingNotConditionRule )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==AND) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:486:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule4371); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4375);
					c2=usingNotConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop72;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:491:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:492:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:5: (not= NOT )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==NOT) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule4437); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule4449);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:499:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | AGGREGATE THROUGH fe= faUsingPredicateRule | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		UsingAggregatorPredicate fe =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:500:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | AGGREGATE THROUGH fe= faUsingPredicateRule | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
			int alt76=4;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt76=1;
				}
				break;
			case ID:
				{
				alt76=2;
				}
				break;
			case AGGREGATE:
				{
				alt76=3;
				}
				break;
			case IF_FAILS:
				{
				alt76=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}
			switch (alt76) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:501:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4481); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4485);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule4487); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule4505); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:9: ( LP (fp= functionParamsRule )? RP )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==LP) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule4508); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:13: (fp= functionParamsRule )?
							int alt74=2;
							int LA74_0 = input.LA(1);
							if ( (LA74_0==ADD||LA74_0==APEX_VALUE||LA74_0==ARRAY_FUNCTION||LA74_0==BOOLEAN||LA74_0==FIELD_NAME||LA74_0==FLOAT||(LA74_0 >= ID && LA74_0 <= IF_ERROR)||LA74_0==INT||LA74_0==LP||LA74_0==MEMBERSHIP_OF||LA74_0==QUOTED_VALUE||LA74_0==SUB||LA74_0==TRANSLATE) ) {
								alt74=1;
							}
							switch (alt74) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule4513);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule4517); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:503:4: AGGREGATE THROUGH fe= faUsingPredicateRule
					{
					match(input,AGGREGATE,FOLLOW_AGGREGATE_in_usingPredicateRule4538); 
					match(input,THROUGH,FOLLOW_THROUGH_in_usingPredicateRule4540); 
					pushFollow(FOLLOW_faUsingPredicateRule_in_usingPredicateRule4544);
					fe=faUsingPredicateRule();
					state._fsp--;

					p = fe;
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:504:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule4554); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4556); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4564);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule4566); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule4570);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule4578); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:510:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:511:2: ( ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:512:3: ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule4594); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule4599);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule4601); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4605); 
				env.addAlphaCut (gs, n, on); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:4: ( COMMA n= numericRule ON on= ID )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==COMMA) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:6: COMMA n= numericRule ON on= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule4617); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule4621);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule4623); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4627); 
					 env.addAlphaCut (gs, n, on); 
					}
					break;

				default :
					break loop77;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:522:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
			int alt80=5;
			switch ( input.LA(1) ) {
			case DEFUZZIFY:
				{
				alt80=1;
				}
				break;
			case DROPPING:
				{
				int LA80_2 = input.LA(2);
				if ( (LA80_2==ALL) ) {
					alt80=2;
				}
				else if ( (LA80_2==FUZZY) ) {
					alt80=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KEEPING:
				{
				int LA80_3 = input.LA(2);
				if ( (LA80_3==ALL) ) {
					alt80=3;
				}
				else if ( (LA80_3==FUZZY) ) {
					alt80=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}
			switch (alt80) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4665); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4684); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4686); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4688); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4690); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4702); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4704); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4706); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4708); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4721); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4723); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4725); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4729); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:529:5: ( COMMA fs= ID )*
					loop78:
					while (true) {
						int alt78=2;
						int LA78_0 = input.LA(1);
						if ( (LA78_0==COMMA) ) {
							alt78=1;
						}

						switch (alt78) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:529:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4743); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4747); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop78;
						}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:530:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4772); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4774); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4776); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4780); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:531:5: ( COMMA fs= ID )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==COMMA) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:531:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4795); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4799); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop79;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:536:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:2: ( ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:538:3: ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule4840); 
			match(input,FIELDS,FOLLOW_FIELDS_in_addFieldsRule4842); 
			match(input,LBR,FOLLOW_LBR_in_addFieldsRule4869); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4877);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule4879); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4883);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:5: ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==COMMA) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:7: COMMA f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule4902); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4906);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule4908); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4912);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop81;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_addFieldsRule4930); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:546:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:547:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==DISTANCE||LA82_0==INCLUDED||LA82_0==INTERSECT||LA82_0==MEET||LA82_0==ORIENTATION) ) {
				alt82=1;
			}
			else if ( (LA82_0==APEX_VALUE||LA82_0==ARRAY_FUNCTION||LA82_0==BOOLEAN||LA82_0==FIELD_NAME||LA82_0==FLOAT||(LA82_0 >= ID && LA82_0 <= IF_ERROR)||LA82_0==INT||LA82_0==LP||LA82_0==MEMBERSHIP_OF||LA82_0==QUOTED_VALUE||LA82_0==TRANSLATE) ) {
				alt82=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:548:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule4953);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:549:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule4968);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
			int alt87=5;
			switch ( input.LA(1) ) {
			case DISTANCE:
				{
				alt87=1;
				}
				break;
			case ORIENTATION:
				{
				alt87=2;
				}
				break;
			case INCLUDED:
				{
				alt87=3;
				}
				break;
			case MEET:
				{
				alt87=4;
				}
				break;
			case INTERSECT:
				{
				alt87=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule5007); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5009); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5013); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5015); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:25: (cp= comparatorRule n= numericRule )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==EQ||LA83_0==GE||LA83_0==GT||LA83_0==LE||LA83_0==LT||LA83_0==NEQ) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule5021);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5025);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule5049); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5051); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:21: (f= LEFT |f= RIGHT )
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==LEFT) ) {
						alt84=1;
					}
					else if ( (LA84_0==RIGHT) ) {
						alt84=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 84, 0, input);
						throw nvae;
					}

					switch (alt84) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5057); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5063); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:42: ( COMMA o= ID COLON d= numericRule )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==COMMA) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule5069); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule5074); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule5076); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule5080);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5085); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule5097); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule5099); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:18: (i= LEFT |i= RIGHT )
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==LEFT) ) {
						alt86=1;
					}
					else if ( (LA86_0==RIGHT) ) {
						alt86=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 86, 0, input);
						throw nvae;
					}

					switch (alt86) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule5105); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule5111); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule5114); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule5146); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule5193); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:568:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule5256); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule5258); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule5260); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==KEEP) ) {
				alt92=1;
			}
			else if ( ((LA92_0 >= HOWINCLUDE && LA92_0 <= HOWMEET)||LA92_0==LEFT||LA92_0==RIGHT) ) {
				alt92=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule5268); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					int alt89=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt89=1;
						}
						break;
					case LEFT:
						{
						alt89=2;
						}
						break;
					case RIGHT:
						{
						alt89=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 89, 0, input);
						throw nvae;
					}
					switch (alt89) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule5305); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:7: ( resolvingRule[sfs] )?
							int alt88=2;
							int LA88_0 = input.LA(1);
							if ( (LA88_0==RESOLVING) ) {
								alt88=1;
							}
							switch (alt88) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5341);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule5359); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:576:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule5395); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:577:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5426);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:578:5: ( COMMA addFuzzySetRule[sfs] )*
					loop90:
					while (true) {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==COMMA) ) {
							alt90=1;
						}

						switch (alt90) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:578:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule5435); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5437);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop90;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:579:5: ( resolvingRule[sfs] )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==RESOLVING) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:579:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5453);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:583:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:584:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:585:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule5480); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule5482); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:6: (t= AND |t= OR |t= FIRST |t= LAST )
			int alt93=4;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt93=1;
				}
				break;
			case OR:
				{
				alt93=2;
				}
				break;
			case FIRST:
				{
				alt93=3;
				}
				break;
			case LAST:
				{
				alt93=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule5494); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule5500); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule5506); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule5512); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:590:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
			int alt99=4;
			switch ( input.LA(1) ) {
			case LEFT:
			case RIGHT:
				{
				alt99=1;
				}
				break;
			case HOWINCLUDE:
				{
				alt99=2;
				}
				break;
			case HOWMEET:
				{
				alt99=3;
				}
				break;
			case HOWINTERSECT:
				{
				alt99=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:3: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5544); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5550); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:4: ( ALL |fs= ID ( AS newFs= ID )? )
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==ALL) ) {
						alt96=1;
					}
					else if ( (LA96_0==ID) ) {
						alt96=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);
						throw nvae;
					}

					switch (alt96) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule5561); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5597); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:12: ( AS newFs= ID )?
							int alt95=2;
							int LA95_0 = input.LA(1);
							if ( (LA95_0==AS) ) {
								alt95=1;
							}
							switch (alt95) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:593:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule5601); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5605); 
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:595:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule5636); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5640); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:595:22: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:595:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5646); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:595:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5652); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5656); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5658); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5662); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule5675); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5680); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:20: (s= LEFT |s= RIGHT )
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==LEFT) ) {
						alt98=1;
					}
					else if ( (LA98_0==RIGHT) ) {
						alt98=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);
						throw nvae;
					}

					switch (alt98) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5686); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5692); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5696); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5699); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5703); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:597:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule5726); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5729); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5731); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5744); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5748); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule5772); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule5774); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:6: (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==ID) ) {
				alt102=1;
			}
			else if ( (LA102_0==FROM_WEB) ) {
				alt102=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5786); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:16: ( AT db= ID )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==AT) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule5790); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5794); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:8: FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM_WEB,FOLLOW_FROM_WEB_in_getCollectionRule5825); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:17: (url= APEX_VALUE |url= QUOTED_VALUE )
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==APEX_VALUE) ) {
						alt101=1;
					}
					else if ( (LA101_0==QUOTED_VALUE) ) {
						alt101=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 101, 0, input);
						throw nvae;
					}

					switch (alt101) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule5830); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:608:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule5836); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule5849); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:613:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:614:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:615:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule5870); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule5872); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5883); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule5885); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5889); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule5891); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5895); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule5924); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:622:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:623:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:624:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule5943); 
			match(input,AS,FOLLOW_AS_in_saveAsRule5945); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5955); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:625:12: ( AT db= ID )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==AT) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:625:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule5959); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5963); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule5983); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:630:1: lookupFromWebRule : LOOKUP FROM WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:631:2: ( LOOKUP FROM WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:632:3: LOOKUP FROM WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule5999); 
			match(input,FROM,FOLLOW_FROM_in_lookupFromWebRule6001); 
			match(input,WEB,FOLLOW_WEB_in_lookupFromWebRule6003); 
				LookupFromWeb gfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:633:4: (fe= forEachRule )+
			int cnt104=0;
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==FOR) ) {
					alt104=1;
				}

				switch (alt104) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:633:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule6019);
					fe=forEachRule();
					state._fsp--;

						gfw.addForEach (fe);	
					}
					break;

				default :
					if ( cnt104 >= 1 ) break loop104;
					EarlyExitException eee = new EarlyExitException(104, input);
					throw eee;
				}
				cnt104++;
			}

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule6032); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:639:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule6052); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule6054); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule6058);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule6063); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule6067);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC ;
	public final void joinOfCollectionsRule() throws RecognitionException {
		Token tk=null;
		Token g=null;
		DbCollection c1 =null;
		DbCollection c2 =null;
		SpatialFunction nff =null;
		SetFuzzySets sfs =null;
		CaseClause cc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:647:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule6090); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule6092); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6094); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6103);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule6107); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6111);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:649:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==ON) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:649:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule6123); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6125); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6129);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==SET) ) {
				int LA107_1 = input.LA(2);
				if ( (LA107_1==GEOMETRY) ) {
					alt107=1;
				}
			}
			switch (alt107) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule6161); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6163); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					int alt106=4;
					switch ( input.LA(1) ) {
					case INTERSECTION:
						{
						alt106=1;
						}
						break;
					case RIGHT:
						{
						alt106=2;
						}
						break;
					case LEFT:
						{
						alt106=3;
						}
						break;
					case ALL:
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule6169); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule6175); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule6181); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule6187); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:7: ( addFieldsRule[jc] )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==ADD_ST) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule6207);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:7: (sfs= setFuzzySetsRule )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==SET) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6267);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:653:6: (cc= caseClauseRule )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==CASE) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:653:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule6309);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:654:7: ( REMOVE DUPLICATES )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==REMOVE) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:654:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule6358); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule6360); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule6401); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:659:1: filterRule : FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:660:3: ( FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:661:4: FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule6425); 
			pushFollow(FOLLOW_caseClauseRule_in_filterRule6437);
			fc=caseClauseRule();
			state._fsp--;

			 Filter f = env.addFilter (fc); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:7: ( REMOVE DUPLICATES )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==REMOVE) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule6455); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule6457); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule6479); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:669:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:670:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule6500); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:671:7: (p= groupPartitionRule )+
			int cnt113=0;
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==PARTITION) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:671:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule6525);
					p=groupPartitionRule();
					state._fsp--;

					 g.addPartition (p); 
					}
					break;

				default :
					if ( cnt113 >= 1 ) break loop113;
					EarlyExitException eee = new EarlyExitException(113, input);
					throw eee;
				}
				cnt113++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:672:7: (oth= othersRule )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==DROP||LA114_0==KEEP) ) {
				alt114=1;
			}
			switch (alt114) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:672:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule6551);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule6575); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:678:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule6598); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule6602);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule6615); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6619);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:681:10: ( COMMA fr= fieldRefRule )*
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==COMMA) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:681:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6644); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6648);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop115;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule6670); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6674);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:8: ( DROP GROUPING FIELDS )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==DROP) ) {
				int LA116_1 = input.LA(2);
				if ( (LA116_1==GROUPING) ) {
					alt116=1;
				}
			}
			switch (alt116) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule6695); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule6697); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule6699); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==ORDER) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule6721); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule6723); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6727);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:685:9: ( COMMA sf= sortingFieldRule )*
					loop117:
					while (true) {
						int alt117=2;
						int LA117_0 = input.LA(1);
						if ( (LA117_0==COMMA) ) {
							alt117=1;
						}

						switch (alt117) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:685:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6744); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6748);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop117;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:6: ( KEEP UNCOMPARABLE )?
					int alt118=2;
					int LA118_0 = input.LA(1);
					if ( (LA118_0==KEEP) ) {
						int LA118_1 = input.LA(2);
						if ( (LA118_1==UNCOMPARABLE) ) {
							alt118=1;
						}
					}
					switch (alt118) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule6767); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule6769); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:7: (gs= generateSectionRule[false] )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==GENERATE) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule6800);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:692:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:693:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:694:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule6831);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule6835); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule6839); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:696:3: (v= VERSUS )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==VERSUS) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:696:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule6854); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:700:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule6883); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:702:7: (u= unpackRule )+
			int cnt122=0;
			loop122:
			while (true) {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==UNPACK) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:702:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule6907);
					u=unpackRule();
					state._fsp--;

					 e.addUnpack (u); 
					}
					break;

				default :
					if ( cnt122 >= 1 ) break loop122;
					EarlyExitException eee = new EarlyExitException(122, input);
					throw eee;
				}
				cnt122++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:703:7: (oth= othersRule )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==DROP||LA123_0==KEEP) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:703:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule6939);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule6963); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:708:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:709:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:710:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule6985); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule6990);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule6997); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7001);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule7008); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule7012);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:6: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule7040); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule7042); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7056);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:720:9: ( COMMA cr= collectionReferenceRule )+
			int cnt124=0;
			loop124:
			while (true) {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==COMMA) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:720:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule7078); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7082);
					cr=collectionReferenceRule();
					state._fsp--;

					 mc.addCollection (cr); 
					}
					break;

				default :
					if ( cnt124 >= 1 ) break loop124;
					EarlyExitException eee = new EarlyExitException(124, input);
					throw eee;
				}
				cnt124++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:7: ( REMOVE DUPLICATES )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==REMOVE) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule7103); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule7105); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule7135); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:726:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:727:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:728:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule7155); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule7157); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7167);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule7169); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7173);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule7185); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:734:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule7207); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule7209); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7217);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule7219); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7223);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule7235); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:744:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:745:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule7262); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule7272); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:10: (d= ID |d= APEX_VALUE )
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==ID) ) {
				alt126=1;
			}
			else if ( (LA126_0==APEX_VALUE) ) {
				alt126=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}

			switch (alt126) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7277); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7283); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==AS) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule7307); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:13: (a= ID |a= APEX_VALUE )
					int alt127=2;
					int LA127_0 = input.LA(1);
					if ( (LA127_0==ID) ) {
						alt127=1;
					}
					else if ( (LA127_0==APEX_VALUE) ) {
						alt127=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 127, 0, input);
						throw nvae;
					}

					switch (alt127) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7312); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7318); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==COMMA) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule7399); 
					match(input,DB,FOLLOW_DB_in_useDbRule7401); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:20: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7406); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7412); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt131=2;
					int LA131_0 = input.LA(1);
					if ( (LA131_0==AS) ) {
						alt131=1;
					}
					switch (alt131) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule7435); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:21: (a= ID |a= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7440); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7446); 
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
					break loop132;
				}
			}

			match(input,ON,FOLLOW_ON_in_useDbRule7524); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:755:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==DEFAULT) ) {
				alt136=1;
			}
			else if ( (LA136_0==SERVER) ) {
				alt136=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 136, 0, input);
				throw nvae;
			}

			switch (alt136) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:755:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule7536); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7538); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7550); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:10: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7565); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7571); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:758:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt135=2;
					int LA135_0 = input.LA(1);
					if ( (LA135_0==APEX_VALUE||LA135_0==ID) ) {
						alt135=1;
					}
					switch (alt135) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:758:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:758:12: (d= ID |d= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:758:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7595); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:758:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7601); 
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

			match(input,SC,FOLLOW_SC_in_useDbRule7626); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:766:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7651); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule7653); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7663);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule7665); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7669);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:768:7: (tp= trajectoryPartitionRule )+
			int cnt137=0;
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==PARTITION) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:768:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7685);
					tp=trajectoryPartitionRule();
					state._fsp--;

					 tm.addPartition (tp); 
					}
					break;

				default :
					if ( cnt137 >= 1 ) break loop137;
					EarlyExitException eee = new EarlyExitException(137, input);
					throw eee;
				}
				cnt137++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:7: (oth= othersRule )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==DROP||LA138_0==KEEP) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule7725);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule7767); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:774:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:775:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule7795); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule7805);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:778:6: (tpm= partitionMatchingRule )+
			int cnt139=0;
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==MATCHING) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:778:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7826);
					tpm=partitionMatchingRule();
					state._fsp--;

					 tp.addPartitionMatching (tpm);  
					}
					break;

				default :
					if ( cnt139 >= 1 ) break loop139;
					EarlyExitException eee = new EarlyExitException(139, input);
					throw eee;
				}
				cnt139++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:782:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:783:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:784:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule7863); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7867);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule7874); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7878);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule7885); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule7887); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule7891); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule7894); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule7898);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:6: ( WHERE wc= orConditionRule )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==WHERE) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule7913); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule7917);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule7941); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7945);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:789:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==ADDING) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:789:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule7968); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7972);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule7974); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule7976); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:790:6: ( MIN_SIMILARITY n= numericRule )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==MIN_SIMILARITY) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:790:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7998); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule8002);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:796:1: parameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:797:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:798:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8050); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule8066); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule8070); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:803:1: createJavaScriptFunctionRule : CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:804:2: ( CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:4: CREATE JAVASCRIPT FUNCTION jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaScriptFunctionRule8094); 
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8096); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8098); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule8106); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8138); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8148);
			p=parameterRule(jsf.getParamList());
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:809:5: ( COMMA p= parameterRule[jsf.getParamList()] )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==COMMA) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:809:7: COMMA p= parameterRule[jsf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule8173); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8177);
					p=parameterRule(jsf.getParamList());
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop143;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:810:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==PRECONDITION) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:810:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8202); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8206);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule8220); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule8233); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule8239); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:833:1: createFuzzyOperatorRule : CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:3: ( CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:835:4: CREATE FUZZY OPERATOR f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyOperatorRule8261); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyOperatorRule8263); 
			match(input,OPERATOR,FOLLOW_OPERATOR_in_createFuzzyOperatorRule8265); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule8269); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8294); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8304);
			p=parameterRule(fo.getParamList());
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:838:5: ( COMMA p= parameterRule[fo.getParamList()] )*
			loop145:
			while (true) {
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==COMMA) ) {
					alt145=1;
				}

				switch (alt145) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:838:7: COMMA p= parameterRule[fo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8329); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8333);
					p=parameterRule(fo.getParamList());
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop145;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:839:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==PRECONDITION) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:839:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8360); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8364);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule8378); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8382);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:841:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==POLYLINE) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:841:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule8400); 
					match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule8403); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8415); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8419);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8421); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8425);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8427); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:843:11: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt147=0;
					loop147:
					while (true) {
						int alt147=2;
						int LA147_0 = input.LA(1);
						if ( (LA147_0==COMMA) ) {
							alt147=1;
						}

						switch (alt147) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:843:13: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8449); 
							match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8451); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8455);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8457); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8461);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8463); 
							 env.addFuzzyPolylinePoint (fo, x, y); 
							}
							break;

						default :
							if ( cnt147 >= 1 ) break loop147;
							EarlyExitException eee = new EarlyExitException(147, input);
							throw eee;
						}
						cnt147++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule8484); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule8491); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:1: aggSpecRule[FuzzyAggregator fa, ForAllClause fac] returns [AggregateClause ac] : (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID ;
	public final AggregateClause aggSpecRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		AggregateClause ac = null;


		Token alias=null;
		String with_type =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:80: ( (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:2: (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:2: (with_type= withSpec )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==WITH) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:3: with_type= withSpec
					{
					pushFollow(FOLLOW_withSpec_in_aggSpecRule8517);
					with_type=withSpec();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_faExpressionRule_in_aggSpecRule8523);
			e=faExpressionRule(fa, fac);
			state._fsp--;

			match(input,AS,FOLLOW_AS_in_aggSpecRule8527); 
			alias=(Token)match(input,ID,FOLLOW_ID_in_aggSpecRule8531); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:853:1: createFuzzyAggregatorRule : CREATE FUZZY AGGREGATOR f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:854:2: ( CREATE FUZZY AGGREGATOR f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:855:2: CREATE FUZZY AGGREGATOR f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createFuzzyAggregatorRule8545); 
			match(input,FUZZY,FOLLOW_FUZZY_in_createFuzzyAggregatorRule8547); 
			match(input,AGGREGATOR,FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule8549); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyAggregatorRule8553); 
			 FuzzyAggregator fa = env.addFuzzyAggregator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule8567); 
			pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8574);
			p=faParameterRule(fa.getParamList());
			state._fsp--;

			 fa.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:858:3: ( COMMA p= faParameterRule[fa.getParamList()] )*
			loop150:
			while (true) {
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==COMMA) ) {
					alt150=1;
				}

				switch (alt150) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:858:5: COMMA p= faParameterRule[fa.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8588); 
					pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8592);
					p=faParameterRule(fa.getParamList());
					state._fsp--;

					 fa.parameters.add (p);
					}
					break;

				default :
					break loop150;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:2: ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==PRECONDITION) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:4: PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule8611); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule8615);
					pc=jfOrConditionRule(fa.getParamList(), false);
					state._fsp--;

					 fa.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:2: ( SORT v= VERSUS )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==SORT) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:3: SORT v= VERSUS
					{
					match(input,SORT,FOLLOW_SORT_in_createFuzzyAggregatorRule8630); 
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_createFuzzyAggregatorRule8634); 
					 env.setVersusFuzzyAggregator(fa,v.getText());
					}
					break;

			}

			pushFollow(FOLLOW_forAllRule_in_createFuzzyAggregatorRule8654);
			fac=forAllRule(fa);
			state._fsp--;

			 fa.forAll.add(fac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:2: ( COMMA fac= forAllRule[fa] )*
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==COMMA) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:3: COMMA fac= forAllRule[fa]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8668); 
					pushFollow(FOLLOW_forAllRule_in_createFuzzyAggregatorRule8672);
					fac=forAllRule(fa);
					state._fsp--;

					 fa.forAll.add(fac);
					}
					break;

				default :
					break loop153;
				}
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyAggregatorRule8687); 
			pushFollow(FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule8691);
			e=faExpressionRule(fa, null);
			state._fsp--;

			 env.setEvaluateClause(fa, e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:2: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==POLYLINE) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:4: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyAggregatorRule8707); 
					match(input,LB,FOLLOW_LB_in_createFuzzyAggregatorRule8709); 
					match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule8714); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8718);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8720); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8724);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule8726); 
					 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:866:4: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt154=0;
					loop154:
					while (true) {
						int alt154=2;
						int LA154_0 = input.LA(1);
						if ( (LA154_0==COMMA) ) {
							alt154=1;
						}

						switch (alt154) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:866:6: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8738); 
							match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule8740); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8744);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8746); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8750);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule8752); 
							 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
							}
							break;

						default :
							if ( cnt154 >= 1 ) break loop154;
							EarlyExitException eee = new EarlyExitException(154, input);
							throw eee;
						}
						cnt154++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyAggregatorRule8764); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyAggregatorRule8770); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:1: withSpec returns [String s] : WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM ) ;
	public final String withSpec() throws RecognitionException {
		String s = null;


		Token x=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:28: ( WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:3: WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM )
			{
			match(input,WITH,FOLLOW_WITH_in_withSpec8787); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:8: (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM )
			int alt156=6;
			switch ( input.LA(1) ) {
			case SUM:
				{
				alt156=1;
				}
				break;
			case PRODUCT:
				{
				alt156=2;
				}
				break;
			case DIVISION:
				{
				alt156=3;
				}
				break;
			case SUBTRACTION:
				{
				alt156=4;
				}
				break;
			case MINIMUM:
				{
				alt156=5;
				}
				break;
			case MAXIMUM:
				{
				alt156=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}
			switch (alt156) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:9: x= SUM
					{
					x=(Token)match(input,SUM,FOLLOW_SUM_in_withSpec8792); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:17: x= PRODUCT
					{
					x=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_withSpec8798); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:29: x= DIVISION
					{
					x=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_withSpec8804); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:42: x= SUBTRACTION
					{
					x=(Token)match(input,SUBTRACTION,FOLLOW_SUBTRACTION_in_withSpec8810); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:58: x= MINIMUM
					{
					x=(Token)match(input,MINIMUM,FOLLOW_MINIMUM_in_withSpec8816); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:70: x= MAXIMUM
					{
					x=(Token)match(input,MAXIMUM,FOLLOW_MAXIMUM_in_withSpec8822); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:1: forAllRule[FuzzyAggregator fa] returns [ForAllClause fac] : FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* ;
	public final ForAllClause forAllRule(FuzzyAggregator fa) throws RecognitionException {
		ForAllClause fac = null;


		Token array_id=null;
		Token id=null;
		Expression x1 =null;
		Expression x2 =null;
		Expression e =null;
		AggregateClause ac =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:58: ( FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:2: FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )*
			{
			match(input,FOR,FOLLOW_FOR_in_forAllRule8843); 
			match(input,ALL,FOLLOW_ALL_in_forAllRule8845); 
			array_id=(Token)match(input,ID,FOLLOW_ID_in_forAllRule8849); 
			fac = env.createForAllClause(array_id, fa);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:2: ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==IN) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:3: IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP
					{
					match(input,IN,FOLLOW_IN_in_forAllRule8862); 
					match(input,LP,FOLLOW_LP_in_forAllRule8864); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule8868);
					x1=faExpressionRule(fa, null);
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_forAllRule8872); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule8876);
					x2=faExpressionRule(fa, null);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_forAllRule8880); 
					fac.firstIndex = x1; fac.lastIndex=x2;
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:2: ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )*
			loop158:
			while (true) {
				int alt158=2;
				int LA158_0 = input.LA(1);
				if ( (LA158_0==LOCALLY) ) {
					alt158=1;
				}

				switch (alt158) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:3: LOCALLY e= faExpressionRule[fa, fac] AS id= ID
					{
					match(input,LOCALLY,FOLLOW_LOCALLY_in_forAllRule8890); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule8894);
					e=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,AS,FOLLOW_AS_in_forAllRule8898); 
					id=(Token)match(input,ID,FOLLOW_ID_in_forAllRule8902); 
					env.createLocallyClause(fac, id, e, fa);
					}
					break;

				default :
					break loop158;
				}
			}

			match(input,AGGREGATE,FOLLOW_AGGREGATE_in_forAllRule8913); 
			pushFollow(FOLLOW_aggSpecRule_in_forAllRule8917);
			ac=aggSpecRule(fa, fac);
			state._fsp--;

			 fac.aggregate.add(ac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:2: ( COMMA ac= aggSpecRule[fa, fac] )*
			loop159:
			while (true) {
				int alt159=2;
				int LA159_0 = input.LA(1);
				if ( (LA159_0==COMMA) ) {
					int LA159_1 = input.LA(2);
					if ( (LA159_1==ADD||LA159_1==APEX_VALUE||LA159_1==FLOAT||LA159_1==ID||LA159_1==INT||LA159_1==LP||LA159_1==POS||LA159_1==QUOTED_VALUE||LA159_1==SUB||LA159_1==WITH) ) {
						alt159=1;
					}

				}

				switch (alt159) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:4: COMMA ac= aggSpecRule[fa, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_forAllRule8929); 
					pushFollow(FOLLOW_aggSpecRule_in_forAllRule8933);
					ac=aggSpecRule(fa, fac);
					state._fsp--;

					 fac.aggregate.add(ac);
					}
					break;

				default :
					break loop159;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:884:1: faParameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE (t= ID |t= ARRAY ) ;
	public final Parameter faParameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:885:2: (v= ID TYPE (t= ID |t= ARRAY ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:886:3: v= ID TYPE (t= ID |t= ARRAY )
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule8965); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_faParameterRule8981); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:887:8: (t= ID |t= ARRAY )
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==ID) ) {
				alt160=1;
			}
			else if ( (LA160_0==ARRAY) ) {
				alt160=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}

			switch (alt160) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:887:9: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule8986); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:887:14: t= ARRAY
					{
					t=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_faParameterRule8990); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:892:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:893:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:894:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule9028);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:895:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop161:
			while (true) {
				int alt161=2;
				int LA161_0 = input.LA(1);
				if ( (LA161_0==OR) ) {
					alt161=1;
				}

				switch (alt161) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:895:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule9045); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule9049);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop161;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:901:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:902:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:903:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule9117);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:904:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop162:
			while (true) {
				int alt162=2;
				int LA162_0 = input.LA(1);
				if ( (LA162_0==AND) ) {
					alt162=1;
				}

				switch (alt162) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:904:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule9135); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule9139);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop162;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:909:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:910:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:5: (not= NOT )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==NOT) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule9207); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule9218);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:917:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:918:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:919:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule9256);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:920:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt164=3;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==EQ||LA164_0==GE||LA164_0==GT||LA164_0==LE||LA164_0==LT||LA164_0==NEQ) ) {
				alt164=1;
			}
			else if ( (LA164_0==INRANGE) ) {
				alt164=2;
			}
			switch (alt164) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:920:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule9276);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:921:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule9296);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:925:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:926:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:927:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule9343);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule9352);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:935:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:935:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==APEX_VALUE||LA166_0==FLOAT||LA166_0==ID||LA166_0==INT||LA166_0==LP||LA166_0==QUOTED_VALUE) ) {
				alt166=1;
			}
			else if ( (LA166_0==ADD||LA166_0==SUB) ) {
				alt166=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}

			switch (alt166) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:935:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9394);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:6: (s= ADD |s= SUB )
					int alt165=2;
					int LA165_0 = input.LA(1);
					if ( (LA165_0==ADD) ) {
						alt165=1;
					}
					else if ( (LA165_0==SUB) ) {
						alt165=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 165, 0, input);
						throw nvae;
					}

					switch (alt165) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule9417); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule9423); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9428);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:937:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop168:
			while (true) {
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==ADD||LA168_0==SUB) ) {
					alt168=1;
				}

				switch (alt168) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:937:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:937:7: (s= ADD |s= SUB )
					int alt167=2;
					int LA167_0 = input.LA(1);
					if ( (LA167_0==ADD) ) {
						alt167=1;
					}
					else if ( (LA167_0==SUB) ) {
						alt167=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 167, 0, input);
						throw nvae;
					}

					switch (alt167) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:937:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule9446); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:937:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule9452); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9457);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop168;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:943:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:944:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule9497);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop170:
			while (true) {
				int alt170=2;
				int LA170_0 = input.LA(1);
				if ( (LA170_0==DIV||LA170_0==MUL) ) {
					alt170=1;
				}

				switch (alt170) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:7: (s= MUL |s= DIV )
					int alt169=2;
					int LA169_0 = input.LA(1);
					if ( (LA169_0==MUL) ) {
						alt169=1;
					}
					else if ( (LA169_0==DIV) ) {
						alt169=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 169, 0, input);
						throw nvae;
					}

					switch (alt169) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule9522); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule9528); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule9533);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop170;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:949:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? );
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		ArrayList<Expression> fp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:950:3: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt173=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt173=1;
				}
				break;
			case INT:
				{
				alt173=2;
				}
				break;
			case FLOAT:
				{
				alt173=3;
				}
				break;
			case APEX_VALUE:
				{
				alt173=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt173=5;
				}
				break;
			case ID:
				{
				alt173=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 173, 0, input);
				throw nvae;
			}
			switch (alt173) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:951:5: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule9573); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule9577);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule9581); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:952:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule9601); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:953:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule9639); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:954:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule9676); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:955:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule9710); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:956:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule9743); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:957:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt172=2;
					int LA172_0 = input.LA(1);
					if ( (LA172_0==LP) ) {
						alt172=1;
					}
					switch (alt172) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:957:7: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule9782); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:957:13: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt171=2;
							int LA171_0 = input.LA(1);
							if ( (LA171_0==ADD||LA171_0==APEX_VALUE||LA171_0==FLOAT||LA171_0==ID||LA171_0==INT||LA171_0==LP||LA171_0==QUOTED_VALUE||LA171_0==SUB) ) {
								alt171=1;
							}
							switch (alt171) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:957:14: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule9787);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule9793); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:961:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:963:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:964:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9841);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop174:
			while (true) {
				int alt174=2;
				int LA174_0 = input.LA(1);
				if ( (LA174_0==COMMA) ) {
					alt174=1;
				}

				switch (alt174) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule9861); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9865);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
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
		return params;
	}
	// $ANTLR end "jfFunctionParamsRule"



	// $ANTLR start "faExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:971:1: faExpressionRule[FuzzyAggregator fa, ForAllClause fac] returns [Expression expr] : (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* ;
	public final Expression faExpressionRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:973:3: ( (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] )
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==APEX_VALUE||LA176_0==FLOAT||LA176_0==ID||LA176_0==INT||LA176_0==LP||LA176_0==POS||LA176_0==QUOTED_VALUE) ) {
				alt176=1;
			}
			else if ( (LA176_0==ADD||LA176_0==SUB) ) {
				alt176=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 176, 0, input);
				throw nvae;
			}

			switch (alt176) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:6: t= faTermRule[fa, fac]
					{
					pushFollow(FOLLOW_faTermRule_in_faExpressionRule9913);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:6: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:6: (s= ADD |s= SUB )
					int alt175=2;
					int LA175_0 = input.LA(1);
					if ( (LA175_0==ADD) ) {
						alt175=1;
					}
					else if ( (LA175_0==SUB) ) {
						alt175=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 175, 0, input);
						throw nvae;
					}

					switch (alt175) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule9934); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:975:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule9940); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule9945);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:976:5: ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			loop178:
			while (true) {
				int alt178=2;
				int LA178_0 = input.LA(1);
				if ( (LA178_0==ADD||LA178_0==SUB) ) {
					alt178=1;
				}

				switch (alt178) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:976:7: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:976:7: (s= ADD |s= SUB )
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==ADD) ) {
						alt177=1;
					}
					else if ( (LA177_0==SUB) ) {
						alt177=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 177, 0, input);
						throw nvae;
					}

					switch (alt177) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:976:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule9962); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:976:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule9968); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule9973);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop178;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:1: faTermRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionTerm et] : f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* ;
	public final ExpressionTerm faTermRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:981:3: (f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:982:4: f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			{
			pushFollow(FOLLOW_faFactorRule_in_faTermRule10014);
			f=faFactorRule(fa, fac);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:5: ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			loop180:
			while (true) {
				int alt180=2;
				int LA180_0 = input.LA(1);
				if ( (LA180_0==DIV||LA180_0==MUL) ) {
					alt180=1;
				}

				switch (alt180) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:7: (s= MUL |s= DIV ) f= faFactorRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:7: (s= MUL |s= DIV )
					int alt179=2;
					int LA179_0 = input.LA(1);
					if ( (LA179_0==MUL) ) {
						alt179=1;
					}
					else if ( (LA179_0==DIV) ) {
						alt179=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 179, 0, input);
						throw nvae;
					}

					switch (alt179) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_faTermRule10033); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_faTermRule10039); 
							}
							break;

					}

					pushFollow(FOLLOW_faFactorRule_in_faTermRule10044);
					f=faFactorRule(fa, fac);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop180;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:987:1: faFactorRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionFactor expr] : ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] )? );
	public final ExpressionFactor faFactorRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Expression op =null;
		ArrayReference ref =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:988:3: ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] )? )
			int alt182=7;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt182=1;
				}
				break;
			case INT:
				{
				alt182=2;
				}
				break;
			case FLOAT:
				{
				alt182=3;
				}
				break;
			case APEX_VALUE:
				{
				alt182=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt182=5;
				}
				break;
			case POS:
				{
				alt182=6;
				}
				break;
			case ID:
				{
				alt182=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}
			switch (alt182) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:989:4: LP op= faExpressionRule[fa, fac] RP
					{
					match(input,LP,FOLLOW_LP_in_faFactorRule10083); 
					pushFollow(FOLLOW_faExpressionRule_in_faFactorRule10088);
					op=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_faFactorRule10092); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:990:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_faFactorRule10107); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_faFactorRule10125); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_faFactorRule10143); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:993:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_faFactorRule10160); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText()));
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:994:6: v= POS
					{
					v=(Token)match(input,POS,FOLLOW_POS_in_faFactorRule10177); 
					 expr = new ExpressionFactor (new Value(Value.POS, v.getText()));
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:995:6: x= ID (ref= faArrayRefRule[x, fa] )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_faFactorRule10196); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:995:11: (ref= faArrayRefRule[x, fa] )?
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==LB) ) {
						alt181=1;
					}
					switch (alt181) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:995:12: ref= faArrayRefRule[x, fa]
							{
							pushFollow(FOLLOW_faArrayRefRule_in_faFactorRule10201);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1000:1: faArrayRefRule[Token id, FuzzyAggregator fa] returns [ArrayReference ref] : LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? ;
	public final ArrayReference faArrayRefRule(Token id, FuzzyAggregator fa) throws RecognitionException {
		ArrayReference ref = null;


		Expression e =null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1000:75: ( LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1001:2: LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )?
			{
			match(input,LB,FOLLOW_LB_in_faArrayRefRule10267); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1001:5: (e= faExpressionRule[fa, null] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1001:6: e= faExpressionRule[fa, null]
			{
			pushFollow(FOLLOW_faExpressionRule_in_faArrayRefRule10272);
			e=faExpressionRule(fa, null);
			state._fsp--;

			}

			match(input,RB,FOLLOW_RB_in_faArrayRefRule10277); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1001:40: (f= fieldRefRule )?
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==FIELD_NAME) ) {
				alt183=1;
			}
			switch (alt183) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1001:41: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_faArrayRefRule10284);
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



	// $ANTLR start "createJavaFunctionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1006:1: createJavaFunctionRule : CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC ;
	public final void createJavaFunctionRule() throws RecognitionException {
		Token jfn=null;
		Token cl=null;
		Token imp=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1007:2: ( CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1008:4: CREATE JAVA FUNCTION jfn= ID PARAMETERS p= parameterRule[jf.getParamList()] ( COMMA p= parameterRule[jf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )? CLASS cl= ID ( IMPORT imp= QUOTED_VALUE )? CLASS BODY END_BODY SC
			{
			match(input,CREATE,FOLLOW_CREATE_in_createJavaFunctionRule10307); 
			match(input,JAVA,FOLLOW_JAVA_in_createJavaFunctionRule10309); 
			match(input,FUNCTION,FOLLOW_FUNCTION_in_createJavaFunctionRule10311); 
			jfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule10319); 
			 JavaFunction jf = env.addJavaFunction (jfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaFunctionRule10351); 
			pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule10361);
			p=parameterRule(jf.getParamList());
			state._fsp--;

			 jf.parameters.add (p); 					
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1012:5: ( COMMA p= parameterRule[jf.getParamList()] )*
			loop184:
			while (true) {
				int alt184=2;
				int LA184_0 = input.LA(1);
				if ( (LA184_0==COMMA) ) {
					alt184=1;
				}

				switch (alt184) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1012:7: COMMA p= parameterRule[jf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaFunctionRule10385); 
					pushFollow(FOLLOW_parameterRule_in_createJavaFunctionRule10389);
					p=parameterRule(jf.getParamList());
					state._fsp--;

					 jf.parameters.add (p);					
					}
					break;

				default :
					break loop184;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1013:4: ( PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true] )?
			int alt185=2;
			int LA185_0 = input.LA(1);
			if ( (LA185_0==PRECONDITION) ) {
				alt185=1;
			}
			switch (alt185) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1013:6: PRECONDITION pc= jfOrConditionRule[jf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaFunctionRule10412); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaFunctionRule10416);
					pc=jfOrConditionRule(jf.getParamList(), true);
					state._fsp--;

						jf.preCondition = pc; 					
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule10429); 
			cl=(Token)match(input,ID,FOLLOW_ID_in_createJavaFunctionRule10433); 
				jf.setClass (cl.getText());		
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1015:4: ( IMPORT imp= QUOTED_VALUE )?
			int alt186=2;
			int LA186_0 = input.LA(1);
			if ( (LA186_0==IMPORT) ) {
				alt186=1;
			}
			switch (alt186) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1015:6: IMPORT imp= QUOTED_VALUE
					{
					match(input,IMPORT,FOLLOW_IMPORT_in_createJavaFunctionRule10467); 
					imp=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule10471); 
						jf.setImport (imp.getText()); 	
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_createJavaFunctionRule10500); 
			match(input,BODY,FOLLOW_BODY_in_createJavaFunctionRule10502); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaFunctionRule10515); 
			match(input,SC,FOLLOW_SC_in_createJavaFunctionRule10521); 
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



	public static final BitSet FOLLOW_getCollectionRule_in_start69 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_saveAsRule_in_start90 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start118 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_filterRule_in_start135 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_groupRule_in_start163 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_expandRule_in_start192 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start220 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start238 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start252 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_useDbRule_in_start267 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start296 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start312 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start324 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start333 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start348 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_createFuzzyAggregatorRule_in_start363 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_createJavaFunctionRule_in_start376 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_test_in_start388 = new BitSet(new long[]{0x0110000100000000L,0x0000204008100030L,0x0000080104040200L});
	public static final BitSet FOLLOW_EOF_in_start419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_test432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule456 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule470 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule534 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule574 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule628 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule639 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule660 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule664 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule705 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule719 = new BitSet(new long[]{0x048000000008A000L,0x0000108200081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule890 = new BitSet(new long[]{0x0080000000000080L,0x1000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule908 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule910 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule914 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule916 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule942 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule944 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1020 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1022 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_dropGeometryRule1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_GEOMETRY_in_dropGeometryRule1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1150 = new BitSet(new long[]{0x0000200000000002L,0x0000000010000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1222 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_DROP_in_othersRule1228 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1264 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1330 = new BitSet(new long[]{0x0000400803100402L,0x0000000020000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1347 = new BitSet(new long[]{0x0000400803100402L,0x0000000020000000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1364 = new BitSet(new long[]{0x0000400802100402L,0x0000000020000000L});
	public static final BitSet FOLLOW_checkForExtendedFuzzySetRule_in_generateSectionRule1395 = new BitSet(new long[]{0x0000400800100402L,0x0000000020000000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1426 = new BitSet(new long[]{0x0000400800100002L,0x0000000020000000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1464 = new BitSet(new long[]{0x0000400800000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1484 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_dropGeometryRule_in_generateSectionRule1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1563 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1578 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1582 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1639 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1655 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1659 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1721 = new BitSet(new long[]{0x04A000000008A010L,0x0000108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1777 = new BitSet(new long[]{0x0004000000000002L,0x0002010400040082L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule1935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule1971 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule2009 = new BitSet(new long[]{0x0000000000000000L,0x0000008100000000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule2015 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LP_in_inRangeRule2021 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2031 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule2033 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000108L});
	public static final BitSet FOLLOW_RP_in_inRangeRule2046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule2091 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2220 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2254 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2307 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2318 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2336 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2340 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2378 = new BitSet(new long[]{0x0080000000004000L,0x0000000000000808L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2393 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2399 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2405 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2426 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2449 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2453 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2499 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2522 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2528 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2533 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2551 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2557 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2562 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2600 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2623 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_DIV_in_termRule2629 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_factorRule_in_termRule2634 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2668 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_factorRule2674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2744 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2746 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020104L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_factorRule2755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule2827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule2846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule2872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2902 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule2942 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2946 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2950 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2952 = new BitSet(new long[]{0x0400000000082000L,0x0000000000080000L,0x0000000000000004L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule2956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule2970 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2974 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2978 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2984 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3003 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule3007 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule3027 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule3032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule3038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule3059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3109 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3149 = new BitSet(new long[]{0x0080000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3178 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule3199 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3203 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3218 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3222 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule3246 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule3258 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3286 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3292 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3314 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3318 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule3350 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3373 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3377 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3396 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3400 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule3438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3473 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3496 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3502 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3507 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3525 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3531 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3536 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3574 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule3597 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule3603 = new BitSet(new long[]{0x048000000008A000L,0x0000108000081800L,0x0000000008000004L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3608 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3642 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule3663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule3687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule3712 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3714 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020104L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule3719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule3740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3783 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule3801 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3805 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule3859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule3879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule3889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule3899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule3939 = new BitSet(new long[]{0x0400000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_SUB_in_numericRule3945 = new BitSet(new long[]{0x0400000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule3958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule3964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_E_in_checkForExtendedFuzzySetRule3993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_checkForExtendedFuzzySetRule3995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SET_in_checkForExtendedFuzzySetRule3997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_checkForExtendedFuzzySetRule4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_USING_in_checkForExtendedFuzzySetRule4003 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForExtendedFuzzySetRule4008 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForExtendedFuzzySetRule4023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_checkForExtendedFuzzySetRule4025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SET_in_checkForExtendedFuzzySetRule4027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_checkForExtendedFuzzySetRule4031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_USING_in_checkForExtendedFuzzySetRule4033 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForExtendedFuzzySetRule4037 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule4063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4073 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4078 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule4093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule4095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule4097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule4101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule4103 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule4107 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4142 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_faUsingPredicateRule4153 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_MEMBERSHIP_OF_in_faUsingPredicateRule4158 = new BitSet(new long[]{0x0000000000000200L,0x0000000100000800L});
	public static final BitSet FOLLOW_ALL_in_faUsingPredicateRule4163 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4178 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_faUsingPredicateRule4180 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_faUsingPredicateRule4184 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LB_in_faUsingPredicateRule4191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4195 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_faUsingPredicateRule4206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4210 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RB_in_faUsingPredicateRule4220 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_faUsingPredicateRule4230 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_faUsingPredicateRule4234 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_faUsingPredicateRule4245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4279 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule4294 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4298 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4355 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule4371 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4375 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule4437 = new BitSet(new long[]{0x0000000000000080L,0x0000008000002800L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule4449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4481 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule4505 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4508 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020104L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule4513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_usingPredicateRule4538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_THROUGH_in_usingPredicateRule4540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_faUsingPredicateRule_in_usingPredicateRule4544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule4554 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4556 = new BitSet(new long[]{0x0000000000000080L,0x0004008000002800L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4564 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule4566 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule4570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule4594 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4599 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4605 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule4617 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4621 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4627 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4684 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4702 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4729 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4747 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4780 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4799 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule4840 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_addFieldsRule4842 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBR_in_addFieldsRule4869 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4877 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4879 = new BitSet(new long[]{0x048001000008A000L,0x0100188000191800L,0x0000000008000004L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4883 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule4902 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4906 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4908 = new BitSet(new long[]{0x048001000008A000L,0x0100188000191800L,0x0000000008000004L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4912 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBR_in_addFieldsRule4930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule4953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule4968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule5007 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5015 = new BitSet(new long[]{0x0004000000000002L,0x0002010400000082L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule5021 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule5049 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5051 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5057 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5063 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule5069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule5074 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule5076 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule5080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule5097 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule5099 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule5105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule5114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule5146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule5193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule5256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule5258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000810000700L,0x0000000000000080L});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule5268 = new BitSet(new long[]{0x0000000000000200L,0x0000000800000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule5305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule5359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule5395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5426 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule5435 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000700L,0x0000000000000080L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5437 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule5480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule5482 = new BitSet(new long[]{0x0200000000000800L,0x0040000080000000L});
	public static final BitSet FOLLOW_AND_in_resolvingRule5494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule5500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule5506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule5512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5544 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000800L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5550 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000800L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule5561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5597 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule5636 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5640 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5656 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule5675 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5680 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5696 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule5726 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5731 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule5772 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule5774 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5786 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_FROM_WEB_in_getCollectionRule5825 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule5830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule5836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule5849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule5870 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule5872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5883 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5889 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule5891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule5924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule5943 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule5945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5955 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_AT_in_saveAsRule5959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_saveAsRule5983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule5999 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_FROM_in_lookupFromWebRule6001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_WEB_in_lookupFromWebRule6003 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule6019 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule6032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule6052 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule6054 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule6058 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule6063 = new BitSet(new long[]{0x048000000008A010L,0x0000108000081800L,0x0000000008020004L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule6067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule6090 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule6092 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule6094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6103 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule6107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule6111 = new BitSet(new long[]{0x0000000000800040L,0x0010000000000000L,0x0000000000002420L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule6123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6125 = new BitSet(new long[]{0x0000010000000000L,0x0100080000110000L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6129 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000002420L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule6161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6163 = new BitSet(new long[]{0x0000000000000200L,0x0000000800200000L,0x0000000000000080L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule6169 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000002420L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule6175 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000002420L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule6181 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000002420L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule6187 = new BitSet(new long[]{0x0000000000800040L,0x0000000000000000L,0x0000000000002420L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule6207 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000000000002420L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6267 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000000000000420L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule6309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule6358 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule6360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule6401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule6425 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule6437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule6455 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule6457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_filterRule6479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule6500 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule6525 = new BitSet(new long[]{0x0000200000000000L,0x0800000010000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_othersRule_in_groupRule6551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_groupRule6575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule6598 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule6602 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6615 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6619 = new BitSet(new long[]{0x0000000040000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6644 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6648 = new BitSet(new long[]{0x0000000040000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule6670 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6674 = new BitSet(new long[]{0x0000200000000002L,0x0080000000000004L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule6695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule6697 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule6699 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000004L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule6721 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6723 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6727 = new BitSet(new long[]{0x0000000040000002L,0x0000000010000004L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6744 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6748 = new BitSet(new long[]{0x0000000040000002L,0x0000000010000004L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule6767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule6769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule6800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule6831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule6835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule6839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule6854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule6883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule6907 = new BitSet(new long[]{0x0000200000000000L,0x0000000010000000L,0x0000000080000400L});
	public static final BitSet FOLLOW_othersRule_in_expandRule6939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_expandRule6963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule6985 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule6990 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule6997 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TO_in_unpackRule7008 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule7012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule7040 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule7042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7056 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule7078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule7082 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000420L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule7103 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule7105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule7135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule7155 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule7157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7167 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule7169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule7185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule7207 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule7209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7217 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule7219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule7235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule7262 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7272 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_useDbRule7277 = new BitSet(new long[]{0x0000000040010000L,0x0010000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7283 = new BitSet(new long[]{0x0000000040010000L,0x0010000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7307 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_useDbRule7312 = new BitSet(new long[]{0x0000000040000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7318 = new BitSet(new long[]{0x0000000040000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule7399 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7401 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_useDbRule7406 = new BitSet(new long[]{0x0000000040010000L,0x0010000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7412 = new BitSet(new long[]{0x0000000040010000L,0x0010000000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7435 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_useDbRule7440 = new BitSet(new long[]{0x0000000040000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7446 = new BitSet(new long[]{0x0000000040000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_ON_in_useDbRule7524 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule7536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7550 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_useDbRule7565 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L,0x0000000000000400L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7571 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L,0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_useDbRule7595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_useDbRule7626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7651 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule7653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7663 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule7665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7669 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7685 = new BitSet(new long[]{0x0000200000000000L,0x0800000010000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule7725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule7767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule7795 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule7805 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7826 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule7863 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule7874 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule7885 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule7887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule7891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule7894 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule7898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000001000000000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule7913 = new BitSet(new long[]{0x04A000000008A010L,0x0004108040081800L,0x000001C048020004L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule7917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule7941 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7945 = new BitSet(new long[]{0x0000000000000022L,0x0000800000000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule7968 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule7974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule7976 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7998 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule8002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule8050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule8066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_parameterRule8070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaScriptFunctionRule8094 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_createJavaScriptFunctionRule8096 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaScriptFunctionRule8098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule8106 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8148 = new BitSet(new long[]{0x0000000040040000L,0x8000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule8173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8177 = new BitSet(new long[]{0x0000000040040000L,0x8000000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8202 = new BitSet(new long[]{0x0400000000002010L,0x0004008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8206 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule8220 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule8233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule8239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyOperatorRule8261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyOperatorRule8263 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_OPERATOR_in_createFuzzyOperatorRule8265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule8269 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8304 = new BitSet(new long[]{0x0008000040000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8333 = new BitSet(new long[]{0x0008000040000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8360 = new BitSet(new long[]{0x0400000000002010L,0x0004008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8364 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule8378 = new BitSet(new long[]{0x0400000000002010L,0x0000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8382 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule8400 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule8403 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8415 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8419 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8421 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8427 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8449 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8451 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8455 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8457 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8463 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule8484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule8491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withSpec_in_aggSpecRule8517 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_faExpressionRule_in_aggSpecRule8523 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_aggSpecRule8527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_aggSpecRule8531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createFuzzyAggregatorRule8545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_FUZZY_in_createFuzzyAggregatorRule8547 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_AGGREGATOR_in_createFuzzyAggregatorRule8549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_createFuzzyAggregatorRule8553 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule8567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8574 = new BitSet(new long[]{0x0800000040000000L,0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8592 = new BitSet(new long[]{0x0800000040000000L,0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule8611 = new BitSet(new long[]{0x0400000000002010L,0x0004008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule8615 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SORT_in_createFuzzyAggregatorRule8630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_VERSUS_in_createFuzzyAggregatorRule8634 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_forAllRule_in_createFuzzyAggregatorRule8654 = new BitSet(new long[]{0x0008000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8668 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_forAllRule_in_createFuzzyAggregatorRule8672 = new BitSet(new long[]{0x0008000040000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyAggregatorRule8687 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule8691 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyAggregatorRule8707 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyAggregatorRule8709 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule8714 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8718 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8720 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule8726 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8738 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule8740 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8744 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8746 = new BitSet(new long[]{0x0400000000000010L,0x0000000000080000L,0x0000000000020000L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule8752 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RB_in_createFuzzyAggregatorRule8764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_createFuzzyAggregatorRule8770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withSpec8787 = new BitSet(new long[]{0x0000040000000000L,0x0000440000000000L,0x0000000000180001L});
	public static final BitSet FOLLOW_SUM_in_withSpec8792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_withSpec8798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVISION_in_withSpec8804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACTION_in_withSpec8810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINIMUM_in_withSpec8816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAXIMUM_in_withSpec8822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forAllRule8843 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_forAllRule8845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_forAllRule8849 = new BitSet(new long[]{0x0000000000000080L,0x0000002000008000L});
	public static final BitSet FOLLOW_IN_in_forAllRule8862 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_forAllRule8864 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule8868 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_forAllRule8872 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule8876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_forAllRule8880 = new BitSet(new long[]{0x0000000000000080L,0x0000002000000000L});
	public static final BitSet FOLLOW_LOCALLY_in_forAllRule8890 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule8894 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_forAllRule8898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_forAllRule8902 = new BitSet(new long[]{0x0000000000000080L,0x0000002000000000L});
	public static final BitSet FOLLOW_AGGREGATE_in_forAllRule8913 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000004000020004L});
	public static final BitSet FOLLOW_aggSpecRule_in_forAllRule8917 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_forAllRule8929 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000004000020004L});
	public static final BitSet FOLLOW_aggSpecRule_in_forAllRule8933 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ID_in_faParameterRule8965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_TYPE_in_faParameterRule8981 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_faParameterRule8986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_faParameterRule8990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule9028 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule9045 = new BitSet(new long[]{0x0400000000002010L,0x0004008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule9049 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule9117 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule9135 = new BitSet(new long[]{0x0400000000002010L,0x0004008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule9139 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule9207 = new BitSet(new long[]{0x0400000000002010L,0x0000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule9218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule9256 = new BitSet(new long[]{0x0004000000000002L,0x0002010400040082L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule9276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule9296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule9343 = new BitSet(new long[]{0x0400000000002010L,0x0000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule9352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9394 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule9417 = new BitSet(new long[]{0x0400000000002000L,0x0000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule9423 = new BitSet(new long[]{0x0400000000002000L,0x0000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9428 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule9446 = new BitSet(new long[]{0x0400000000002000L,0x0000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule9452 = new BitSet(new long[]{0x0400000000002000L,0x0000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9457 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule9497 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule9522 = new BitSet(new long[]{0x0400000000002000L,0x0000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule9528 = new BitSet(new long[]{0x0400000000002000L,0x0000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule9533 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule9573 = new BitSet(new long[]{0x0400000000002010L,0x0004008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule9577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule9581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule9601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule9639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule9676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule9710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule9743 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule9782 = new BitSet(new long[]{0x0400000000002010L,0x0000008000080800L,0x0000000000020104L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule9787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule9793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9841 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule9861 = new BitSet(new long[]{0x0400000000002010L,0x0000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9865 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule9913 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule9934 = new BitSet(new long[]{0x0400000000002000L,0x4000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule9940 = new BitSet(new long[]{0x0400000000002000L,0x4000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule9945 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule9962 = new BitSet(new long[]{0x0400000000002000L,0x4000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule9968 = new BitSet(new long[]{0x0400000000002000L,0x4000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule9973 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule10014 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_MUL_in_faTermRule10033 = new BitSet(new long[]{0x0400000000002000L,0x4000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_DIV_in_faTermRule10039 = new BitSet(new long[]{0x0400000000002000L,0x4000008000080800L,0x0000000000000004L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule10044 = new BitSet(new long[]{0x0000020000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_LP_in_faFactorRule10083 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_faExpressionRule_in_faFactorRule10088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RP_in_faFactorRule10092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_faFactorRule10107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_faFactorRule10125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_faFactorRule10143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_faFactorRule10160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POS_in_faFactorRule10177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_faFactorRule10196 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_faArrayRefRule_in_faFactorRule10201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_faArrayRefRule10267 = new BitSet(new long[]{0x0400000000002010L,0x4000008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_faExpressionRule_in_faArrayRefRule10272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RB_in_faArrayRefRule10277 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_faArrayRefRule10284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_createJavaFunctionRule10307 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_JAVA_in_createJavaFunctionRule10309 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_FUNCTION_in_createJavaFunctionRule10311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule10319 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaFunctionRule10351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule10361 = new BitSet(new long[]{0x0000000044000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createJavaFunctionRule10385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaFunctionRule10389 = new BitSet(new long[]{0x0000000044000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaFunctionRule10412 = new BitSet(new long[]{0x0400000000002010L,0x0004008000080800L,0x0000000000020004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaFunctionRule10416 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule10429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_createJavaFunctionRule10433 = new BitSet(new long[]{0x0000000004000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_IMPORT_in_createJavaFunctionRule10467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_createJavaFunctionRule10471 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_in_createJavaFunctionRule10500 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaFunctionRule10502 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaFunctionRule10515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_createJavaFunctionRule10521 = new BitSet(new long[]{0x0000000000000002L});
}
