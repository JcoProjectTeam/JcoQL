// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2022-12-23 02:22:56

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
		"ALL", "ALPHACUT", "AND", "APEX", "APEX_VALUE", "ARRAY", "ARRAY_FUNCTION", 
		"AS", "AT", "BODY", "BOOLEAN", "BUILD", "BY", "CALL", "CASE", "CHECK_FOR", 
		"COLLECTION", "COLLECTIONS", "COLON", "COMMA", "COMMENT", "CREATE_FA", 
		"CREATE_FO", "CREATE_JF", "DB", "DEFAULT", "DEFUZZIFY", "DICTIONARY", 
		"DIGIT", "DIGIT0", "DIRECTION", "DISTANCE", "DIV", "DIVISION", "DOCUMENTS", 
		"DOT", "DROP", "DROPPING", "DUPLICATES", "EACH", "END_BODY", "EQ", "EVALUATE", 
		"EXPAND", "FIELD", "FIELDS", "FIELD_NAME", "FILTER", "FIRST", "FLOAT", 
		"FOR", "FROM", "FROM_ARRAY", "FROM_WEB", "FUZZY", "GE", "GENERATE", "GEOMETRY", 
		"GET", "GROUP", "GROUPING", "GT", "HOWINCLUDE", "HOWINTERSECT", "HOWMEET", 
		"ID", "IF_ERROR", "IF_FAILS", "IN", "INCLUDED", "INPUT", "INRANGE", "INT", 
		"INTERSECT", "INTERSECTION", "INTO", "ISNOTNULL", "ISNULL", "JOIN", "KEEP", 
		"KEEPING", "KNOWN", "LAST", "LB", "LBR", "LE", "LEFT", "LETTER", "LOCALLY", 
		"LOOKUP", "LP", "LT", "MATCHING", "MAXIMUM", "MEET", "MEMBERSHIP_OF", 
		"MERGE", "MINIMUM", "MIN_SIMILARITY", "MUL", "NEQ", "NOT", "OF", "ON", 
		"OR", "ORDER", "ORIENTATION", "OTHERS", "PARAMETERS", "PARTITION", "POINT", 
		"POLYLINE", "POS", "PRECONDITION", "PRODUCT", "QUOTE", "QUOTED_VALUE", 
		"RB", "RBR", "REMOVE", "RESOLVING", "RIGHT", "RP", "SAVE", "SC", "SCAN_ERROR", 
		"SERVER", "SET", "SETS", "SETTING", "SORT", "SUB", "SUBTRACT", "SUBTRACTION", 
		"SUM", "THRESHOLD", "THROUGH", "TILDE", "TO", "TO_POLYLINE", "TRAJECTORY", 
		"TRANSLATE", "TYPE", "UNCOMPARABLE", "UNKNOWN", "UNPACK", "USE", "USING", 
		"VERSUS", "WEB", "WHERE", "WHITE_SPACES", "WITH", "WITHIN", "WITHOUT", 
		"WRT", "WS", "XXX"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int ADDING=5;
	public static final int ADD_ST=6;
	public static final int AGGREGATE=7;
	public static final int ALL=8;
	public static final int ALPHACUT=9;
	public static final int AND=10;
	public static final int APEX=11;
	public static final int APEX_VALUE=12;
	public static final int ARRAY=13;
	public static final int ARRAY_FUNCTION=14;
	public static final int AS=15;
	public static final int AT=16;
	public static final int BODY=17;
	public static final int BOOLEAN=18;
	public static final int BUILD=19;
	public static final int BY=20;
	public static final int CALL=21;
	public static final int CASE=22;
	public static final int CHECK_FOR=23;
	public static final int COLLECTION=24;
	public static final int COLLECTIONS=25;
	public static final int COLON=26;
	public static final int COMMA=27;
	public static final int COMMENT=28;
	public static final int CREATE_FA=29;
	public static final int CREATE_FO=30;
	public static final int CREATE_JF=31;
	public static final int DB=32;
	public static final int DEFAULT=33;
	public static final int DEFUZZIFY=34;
	public static final int DICTIONARY=35;
	public static final int DIGIT=36;
	public static final int DIGIT0=37;
	public static final int DIRECTION=38;
	public static final int DISTANCE=39;
	public static final int DIV=40;
	public static final int DIVISION=41;
	public static final int DOCUMENTS=42;
	public static final int DOT=43;
	public static final int DROP=44;
	public static final int DROPPING=45;
	public static final int DUPLICATES=46;
	public static final int EACH=47;
	public static final int END_BODY=48;
	public static final int EQ=49;
	public static final int EVALUATE=50;
	public static final int EXPAND=51;
	public static final int FIELD=52;
	public static final int FIELDS=53;
	public static final int FIELD_NAME=54;
	public static final int FILTER=55;
	public static final int FIRST=56;
	public static final int FLOAT=57;
	public static final int FOR=58;
	public static final int FROM=59;
	public static final int FROM_ARRAY=60;
	public static final int FROM_WEB=61;
	public static final int FUZZY=62;
	public static final int GE=63;
	public static final int GENERATE=64;
	public static final int GEOMETRY=65;
	public static final int GET=66;
	public static final int GROUP=67;
	public static final int GROUPING=68;
	public static final int GT=69;
	public static final int HOWINCLUDE=70;
	public static final int HOWINTERSECT=71;
	public static final int HOWMEET=72;
	public static final int ID=73;
	public static final int IF_ERROR=74;
	public static final int IF_FAILS=75;
	public static final int IN=76;
	public static final int INCLUDED=77;
	public static final int INPUT=78;
	public static final int INRANGE=79;
	public static final int INT=80;
	public static final int INTERSECT=81;
	public static final int INTERSECTION=82;
	public static final int INTO=83;
	public static final int ISNOTNULL=84;
	public static final int ISNULL=85;
	public static final int JOIN=86;
	public static final int KEEP=87;
	public static final int KEEPING=88;
	public static final int KNOWN=89;
	public static final int LAST=90;
	public static final int LB=91;
	public static final int LBR=92;
	public static final int LE=93;
	public static final int LEFT=94;
	public static final int LETTER=95;
	public static final int LOCALLY=96;
	public static final int LOOKUP=97;
	public static final int LP=98;
	public static final int LT=99;
	public static final int MATCHING=100;
	public static final int MAXIMUM=101;
	public static final int MEET=102;
	public static final int MEMBERSHIP_OF=103;
	public static final int MERGE=104;
	public static final int MINIMUM=105;
	public static final int MIN_SIMILARITY=106;
	public static final int MUL=107;
	public static final int NEQ=108;
	public static final int NOT=109;
	public static final int OF=110;
	public static final int ON=111;
	public static final int OR=112;
	public static final int ORDER=113;
	public static final int ORIENTATION=114;
	public static final int OTHERS=115;
	public static final int PARAMETERS=116;
	public static final int PARTITION=117;
	public static final int POINT=118;
	public static final int POLYLINE=119;
	public static final int POS=120;
	public static final int PRECONDITION=121;
	public static final int PRODUCT=122;
	public static final int QUOTE=123;
	public static final int QUOTED_VALUE=124;
	public static final int RB=125;
	public static final int RBR=126;
	public static final int REMOVE=127;
	public static final int RESOLVING=128;
	public static final int RIGHT=129;
	public static final int RP=130;
	public static final int SAVE=131;
	public static final int SC=132;
	public static final int SCAN_ERROR=133;
	public static final int SERVER=134;
	public static final int SET=135;
	public static final int SETS=136;
	public static final int SETTING=137;
	public static final int SORT=138;
	public static final int SUB=139;
	public static final int SUBTRACT=140;
	public static final int SUBTRACTION=141;
	public static final int SUM=142;
	public static final int THRESHOLD=143;
	public static final int THROUGH=144;
	public static final int TILDE=145;
	public static final int TO=146;
	public static final int TO_POLYLINE=147;
	public static final int TRAJECTORY=148;
	public static final int TRANSLATE=149;
	public static final int TYPE=150;
	public static final int UNCOMPARABLE=151;
	public static final int UNKNOWN=152;
	public static final int UNPACK=153;
	public static final int USE=154;
	public static final int USING=155;
	public static final int VERSUS=156;
	public static final int WEB=157;
	public static final int WHERE=158;
	public static final int WHITE_SPACES=159;
	public static final int WITH=160;
	public static final int WITHIN=161;
	public static final int WITHOUT=162;
	public static final int WRT=163;
	public static final int WS=164;
	public static final int XXX=165;

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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:84:1: start : ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | test )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:3: ( ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | test )* EOF )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | test )* EOF
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | createFuzzyAggregatorRule | test )*
			loop1:
			while (true) {
				int alt1=18;
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
				case CREATE_FO:
					{
					alt1=12;
					}
					break;
				case CREATE_JF:
					{
					alt1=13;
					}
					break;
				case LOOKUP:
					{
					alt1=15;
					}
					break;
				case CREATE_FA:
					{
					alt1=16;
					}
					break;
				case XXX:
					{
					alt1=17;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:7: getCollectionRule
					{
					pushFollow(FOLLOW_getCollectionRule_in_start62);
					getCollectionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:86:7: saveAsRule
					{
					pushFollow(FOLLOW_saveAsRule_in_start83);
					saveAsRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:87:7: joinOfCollectionsRule
					{
					pushFollow(FOLLOW_joinOfCollectionsRule_in_start111);
					joinOfCollectionsRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:88:7: filterRule
					{
					pushFollow(FOLLOW_filterRule_in_start128);
					filterRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:89:7: groupRule
					{
					pushFollow(FOLLOW_groupRule_in_start156);
					groupRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:90:7: expandRule
					{
					pushFollow(FOLLOW_expandRule_in_start185);
					expandRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:91:7: mergeCollectionsRule
					{
					pushFollow(FOLLOW_mergeCollectionsRule_in_start213);
					mergeCollectionsRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:92:7: intersectCollectionsRule
					{
					pushFollow(FOLLOW_intersectCollectionsRule_in_start231);
					intersectCollectionsRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:93:7: subtractCollectionsRule
					{
					pushFollow(FOLLOW_subtractCollectionsRule_in_start245);
					subtractCollectionsRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:94:7: useDbRule
					{
					pushFollow(FOLLOW_useDbRule_in_start260);
					useDbRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:95:7: trajectoryMatchingRule
					{
					pushFollow(FOLLOW_trajectoryMatchingRule_in_start289);
					trajectoryMatchingRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:96:7: createFuzzyOperatorRule
					{
					pushFollow(FOLLOW_createFuzzyOperatorRule_in_start305);
					createFuzzyOperatorRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:97:7: createJavaScriptFunctionRule
					{
					pushFollow(FOLLOW_createJavaScriptFunctionRule_in_start317);
					createJavaScriptFunctionRule();
					state._fsp--;

					}
					break;
				case 14 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:98:7: getDictionaryRule
					{
					pushFollow(FOLLOW_getDictionaryRule_in_start326);
					getDictionaryRule();
					state._fsp--;

					}
					break;
				case 15 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:99:7: lookupFromWebRule
					{
					pushFollow(FOLLOW_lookupFromWebRule_in_start341);
					lookupFromWebRule();
					state._fsp--;

					}
					break;
				case 16 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:100:7: createFuzzyAggregatorRule
					{
					pushFollow(FOLLOW_createFuzzyAggregatorRule_in_start356);
					createFuzzyAggregatorRule();
					state._fsp--;

					}
					break;
				case 17 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:101:7: test
					{
					pushFollow(FOLLOW_test_in_start369);
					test();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start400); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:106:1: test : XXX SC ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:106:5: ( XXX SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:106:7: XXX SC
			{
			match(input,XXX,FOLLOW_XXX_in_test411); 
			match(input,SC,FOLLOW_SC_in_test413); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:111:1: collectionReferenceRule returns [DbCollection cr] : name= ID ( AT db= ID )? ( AS alias= ID )? ;
	public final DbCollection collectionReferenceRule() throws RecognitionException {
		DbCollection cr = null;


		Token name=null;
		Token db=null;
		Token alias=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:112:3: (name= ID ( AT db= ID )? ( AS alias= ID )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:113:5: name= ID ( AT db= ID )? ( AS alias= ID )?
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule437); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:5: ( AT db= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:7: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_collectionReferenceRule447); 
					db=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule451); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:5: ( AS alias= ID )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:115:7: AS alias= ID
					{
					match(input,AS,FOLLOW_AS_in_collectionReferenceRule464); 
					alias=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule468); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:120:1: fieldRefRule returns [Field field] : (fd= FIELD_NAME )+ ;
	public final Field fieldRefRule() throws RecognitionException {
		Field field = null;


		Token fd=null;

			field = new Field (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:3: ( (fd= FIELD_NAME )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:5: (fd= FIELD_NAME )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:5: (fd= FIELD_NAME )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:123:7: fd= FIELD_NAME
					{
					fd=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_fieldRefRule515); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:127:1: buildActionRule returns [BuildAction ga] : BUILD os= objectStructureRule[true] ;
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:129:3: ( BUILD os= objectStructureRule[true] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:130:5: BUILD os= objectStructureRule[true]
			{
			match(input,BUILD,FOLLOW_BUILD_in_buildActionRule555); 
			pushFollow(FOLLOW_objectStructureRule_in_buildActionRule573);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:136:1: objectStructureRule[boolean generateActionCaller] returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule(boolean generateActionCaller) throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:137:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:138:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule609); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule620);
			ofs=outputFieldSpecRule();
			state._fsp--;

			 obj = new ObjectStructure (ofs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:140:8: (t= COMMA ofs= outputFieldSpecRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:140:10: t= COMMA ofs= outputFieldSpecRule
					{
					t=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectStructureRule641); 
					pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule645);
					ofs=outputFieldSpecRule();
					state._fsp--;

					 env.addOutputFieldSpec (obj, ofs, generateActionCaller, t); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_objectStructureRule661); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:146:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:147:3: (fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:5: fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule686);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:5: ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:7: COLON (os= objectStructureRule[false] |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule700); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:13: (os= objectStructureRule[false] |f= factorRule )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:15: os= objectStructureRule[false]
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule706);
							os=objectStructureRule(false);
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:150:11: f= factorRule
							{
							pushFollow(FOLLOW_factorRule_in_outputFieldSpecRule745);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:157:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:159:3: ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:160:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule835); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule837); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:161:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule869); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule871); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:162:14: ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:162:16: POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP
							{
							match(input,POINT,FOLLOW_POINT_in_geometricOptionRule889); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule891); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule895);
							lat=fieldRefRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_geometricOptionRule897); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule901);
							lon=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule903); 
							 geo.setPoint (lat, lon); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:163:16: AGGREGATE LP afr= fieldRefRule RP
							{
							match(input,AGGREGATE,FOLLOW_AGGREGATE_in_geometricOptionRule923); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule925); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule929);
							afr=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule931); 
							 geo.setAggregate (afr); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:164:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule963);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:165:16: TO_POLYLINE LP f= fieldRefRule RP
							{
							match(input,TO_POLYLINE,FOLLOW_TO_POLYLINE_in_geometricOptionRule1001); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1003); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1007);
							f=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1009); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:169:1: dropGeometryRule : DROPPING GEOMETRY ;
	public final void dropGeometryRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:170:3: ( DROPPING GEOMETRY )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:171:4: DROPPING GEOMETRY
			{
			match(input,DROPPING,FOLLOW_DROPPING_in_dropGeometryRule1055); 
			match(input,GEOMETRY,FOLLOW_GEOMETRY_in_dropGeometryRule1057); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:175:1: caseClauseRule returns [CaseClause cc] : CASE (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:176:3: ( CASE (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:5: CASE (wc= whereCaseRule )+ (oth= othersRule )?
			{
			match(input,CASE,FOLLOW_CASE_in_caseClauseRule1104); 
			 cc = new CaseClause (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:8: (wc= whereCaseRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1131);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:179:8: (oth= othersRule )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DROP||LA11_0==KEEP) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:179:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1160);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:183:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:184:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:6: (ot= KEEP |ot= DROP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1203); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:185:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1209); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1220); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:191:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:192:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:193:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1245); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1256);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:195:7: (gs= generateSectionRule[true] )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==GENERATE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:195:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1274);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:201:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:202:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:203:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1311); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:204:7: (go= geometricOptionRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:204:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1328);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:4: (cf= checkForFuzzySetRule[gs] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHECK_FOR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1345);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:4: (ac= alphaCutRule[gs] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ALPHACUT) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1376);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:7: (ga= buildActionRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BUILD) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1414);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:4: (df= keepDropFuzzySetsRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1434);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:7: ( dropGeometryRule )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DROPPING) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:209:9: dropGeometryRule
					{
					pushFollow(FOLLOW_dropGeometryRule_in_generateSectionRule1452);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:217:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:218:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1513);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:4: ( OR c2= andConditionRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==OR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1528); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1532);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:225:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:226:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:227:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1589);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:228:5: ( AND c2= notConditionRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:228:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1605); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1609);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:233:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:235:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:235:5: (not= NOT )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NOT) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:235:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1671); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1683);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:242:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:243:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
			int alt24=5;
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:244:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1727);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:245:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:245:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule1755);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:246:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule1784);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:247:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule1816);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule1839);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule1865);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:250:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule1885);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:254:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:255:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:256:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule1921);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule1930);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:261:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule1959); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:11: (lp= LB |lp= LP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule1965); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule1971); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule1981);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule1983); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule1987);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:3: (rp= RP |rp= RB )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule1996); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule2002); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule2041); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2045);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:26: (n= ISNULL |n= ISNOTNULL )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2051); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2057); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2131); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2137); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:277:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2143); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2164); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2166); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2170); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:279:7: ( COMMA fs= ID )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMMA) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:279:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2200); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2204); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:284:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:286:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:287:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2257); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2268);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:289:7: ( COMMA fr= fieldRefRule )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:289:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2286); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2290);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:294:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:296:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2328); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ARRAY||LA32_0==GEOMETRY||LA32_0==ID) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2343); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2349); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:298:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2355); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2376);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:300:6: ( COMMA fr= fieldRefRule )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:300:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2399); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2403);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:305:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:307:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==APEX_VALUE||LA35_0==ARRAY_FUNCTION||LA35_0==BOOLEAN||LA35_0==FIELD_NAME||LA35_0==FLOAT||(LA35_0 >= ID && LA35_0 <= IF_ERROR)||LA35_0==INT||LA35_0==LP||LA35_0==MEMBERSHIP_OF||LA35_0==QUOTED_VALUE||LA35_0==TRANSLATE) ) {
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2449);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:6: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2472); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2478); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2483);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ADD||LA37_0==SUB) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2501); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2507); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2512);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:314:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:316:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2550);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==DIV||LA39_0==MUL) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:7: (s= MUL |s= DIV )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2573); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2579); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2584);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor factorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Condition op =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:3: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
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
			case IF_ERROR:
			case MEMBERSHIP_OF:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:5: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2618); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2622);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2624); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:325:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2645);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2669);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2694); 
					match(input,LP,FOLLOW_LP_in_factorRule2696); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:14: (fp= functionParamsRule )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==ADD||LA40_0==APEX_VALUE||LA40_0==ARRAY_FUNCTION||LA40_0==BOOLEAN||LA40_0==FIELD_NAME||LA40_0==FLOAT||(LA40_0 >= ID && LA40_0 <= IF_ERROR)||LA40_0==INT||LA40_0==LP||LA40_0==MEMBERSHIP_OF||LA40_0==QUOTED_VALUE||LA40_0==SUB||LA40_0==TRANSLATE) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2701);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2705); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:328:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2720);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token a=null;
		Token q=null;
		Token b=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:333:3: (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:334:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule2757); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:335:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule2777); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule2796); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule2810); 
					 vl = new Value (Value.QUOTED, q.getText());	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule2822); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:343:2: (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
			int alt46=4;
			switch ( input.LA(1) ) {
			case MEMBERSHIP_OF:
				{
				alt46=1;
				}
				break;
			case IF_ERROR:
				{
				alt46=2;
				}
				break;
			case TRANSLATE:
				{
				alt46=3;
				}
				break;
			case ARRAY_FUNCTION:
				{
				alt46=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:344:4: f= MEMBERSHIP_OF LP mo= ID RP
					{
					f=(Token)match(input,MEMBERSHIP_OF,FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2852); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2854); 
					mo=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2858); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule2860); 
						expr = env.buildMembershipOf (mo); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:345:5: f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					f=(Token)match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule2892); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2896); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2900);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2902); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule2906);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule2908); 
						expr = env.buildIfError (e, v); 	
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:5: f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					f=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule2920); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2924); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2928);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2930); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2934); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:15: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==COMMA) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:17: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2953); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule2957); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:16: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==COMMA) ) {
								alt44=1;
							}
							switch (alt44) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:18: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2977); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:24: (d= APEX_VALUE |d= QUOTED_VALUE )
									int alt43=2;
									int LA43_0 = input.LA(1);
									if ( (LA43_0==APEX_VALUE) ) {
										alt43=1;
									}
									else if ( (LA43_0==QUOTED_VALUE) ) {
										alt43=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 43, 0, input);
										throw nvae;
									}

									switch (alt43) {
										case 1 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:25: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule2982); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:40: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule2988); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule2997); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:349:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule3009);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:354:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3059); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3099); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==FIELD_NAME) ) {
				alt48=1;
			}
			else if ( (LA48_0==LB) ) {
				alt48=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3128);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule3149); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3153);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:5: ( COMMA e= restrictedExpressionRule )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==COMMA) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3168); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3172);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop47;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule3196); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3204); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule3208); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:362:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==COMMA) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:362:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3236); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:362:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==FIELD_NAME) ) {
						alt51=1;
					}
					else if ( (LA51_0==DOCUMENTS) ) {
						alt51=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}

					switch (alt51) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:362:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3242);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:363:9: ( COMMA fx= fieldRefRule )*
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( (LA49_0==COMMA) ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:363:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3264); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3268);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop49;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:364:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule3300); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3323); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3327);
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
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3346); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3350);
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

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule3388); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:379:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:381:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==APEX_VALUE||LA54_0==ARRAY_FUNCTION||LA54_0==BOOLEAN||LA54_0==FIELD_NAME||LA54_0==FLOAT||(LA54_0 >= ID && LA54_0 <= IF_ERROR)||LA54_0==INT||LA54_0==LP||LA54_0==MEMBERSHIP_OF||LA54_0==QUOTED_VALUE||LA54_0==TRANSLATE) ) {
				alt54=1;
			}
			else if ( (LA54_0==ADD||LA54_0==SUB) ) {
				alt54=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3423);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:5: (s= ADD |s= SUB )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==ADD) ) {
						alt53=1;
					}
					else if ( (LA53_0==SUB) ) {
						alt53=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3446); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3452); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3457);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==ADD||LA56_0==SUB) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:7: (s= ADD |s= SUB )
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==ADD) ) {
						alt55=1;
					}
					else if ( (LA55_0==SUB) ) {
						alt55=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 55, 0, input);
						throw nvae;
					}

					switch (alt55) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3475); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3481); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3486);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop56;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:388:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3524);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==DIV||LA58_0==MUL) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:7: (s= MUL |s= DIV )
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==MUL) ) {
						alt57=1;
					}
					else if ( (LA57_0==DIV) ) {
						alt57=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}

					switch (alt57) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule3547); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule3553); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3558);
					f=restrictedFactorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop58;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:396:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor restrictedFactorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression ex =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
			int alt60=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt60=1;
				}
				break;
			case FIELD_NAME:
				{
				alt60=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt60=3;
				}
				break;
			case ID:
				{
				alt60=4;
				}
				break;
			case ARRAY_FUNCTION:
			case IF_ERROR:
			case MEMBERSHIP_OF:
			case TRANSLATE:
				{
				alt60=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:398:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3592); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3596);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3598); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:399:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule3613);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:400:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule3637);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:401:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule3662); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3664); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:401:14: (fp= functionParamsRule )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==ADD||LA59_0==APEX_VALUE||LA59_0==ARRAY_FUNCTION||LA59_0==BOOLEAN||LA59_0==FIELD_NAME||LA59_0==FLOAT||(LA59_0 >= ID && LA59_0 <= IF_ERROR)||LA59_0==INT||LA59_0==LP||LA59_0==MEMBERSHIP_OF||LA59_0==QUOTED_VALUE||LA59_0==SUB||LA59_0==TRANSLATE) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:401:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule3669);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3673); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:402:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule3690);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:406:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:408:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:409:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3733);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:410:6: ( COMMA e= restrictedExpressionRule )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==COMMA) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:410:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule3751); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3755);
					e=restrictedExpressionRule();
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop61;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:418:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:419:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			int alt62=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt62=1;
				}
				break;
			case NEQ:
				{
				alt62=2;
				}
				break;
			case LT:
				{
				alt62=3;
				}
				break;
			case GT:
				{
				alt62=4;
				}
				break;
			case LE:
				{
				alt62=5;
				}
				break;
			case GE:
				{
				alt62=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule3799); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:421:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule3809); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:422:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule3819); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:423:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule3829); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule3839); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:425:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule3849); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:432:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:4: (s= ADD |s= SUB )?
			int alt63=3;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==ADD) ) {
				alt63=1;
			}
			else if ( (LA63_0==SUB) ) {
				alt63=2;
			}
			switch (alt63) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule3889); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule3895); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:4: (n= FLOAT |n= INT )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==FLOAT) ) {
				alt64=1;
			}
			else if ( (LA64_0==INT) ) {
				alt64=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule3908); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule3914); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:441:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:2: ( CHECK_FOR FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:3: CHECK_FOR FUZZY SET fs= ID USING (fe= usingOrConditionRule ) ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule3943); 
			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule3945); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule3947); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule3951); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule3953); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:34: (fe= usingOrConditionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:36: fe= usingOrConditionRule
			{
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3958);
			fe=usingOrConditionRule();
			state._fsp--;

			}

			 env.addCheckForFuzzySet (gs, fs, fe); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:445:4: ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==COMMA) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:445:6: COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule3973); 
					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule3975); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule3977); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule3981); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule3983); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3987);
					fe=usingOrConditionRule();
					state._fsp--;

					 env.addCheckForFuzzySet (gs, fs, fe); 
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
	}
	// $ANTLR end "checkForFuzzySetRule"



	// $ANTLR start "faUsingPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:450:1: faUsingPredicateRule returns [UsingAggregatorPredicate p] : id= ID LP ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( ',' exp= restrictedExpressionRule )* RP ;
	public final UsingAggregatorPredicate faUsingPredicateRule() throws RecognitionException {
		UsingAggregatorPredicate p = null;


		Token id=null;
		Token fuzzySet=null;
		Token array=null;
		Expression exp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:3: (id= ID LP ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( ',' exp= restrictedExpressionRule )* RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:452:4: id= ID LP ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) ) ( ',' exp= restrictedExpressionRule )* RP
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4022); 
			 p = env.createUsingAggregatorPredicate(id); 
			match(input,LP,FOLLOW_LP_in_faUsingPredicateRule4033); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:2: ( MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:3: MEMBERSHIP_OF ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB )
			{
			match(input,MEMBERSHIP_OF,FOLLOW_MEMBERSHIP_OF_in_faUsingPredicateRule4038); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:455:2: ( ALL |fuzzySet= ID FROM_ARRAY array= FIELD_NAME | LB fuzzySet= ID ( ',' fuzzySet= ID )* RB )
			int alt67=3;
			switch ( input.LA(1) ) {
			case ALL:
				{
				alt67=1;
				}
				break;
			case ID:
				{
				alt67=2;
				}
				break;
			case LB:
				{
				alt67=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:455:3: ALL
					{
					match(input,ALL,FOLLOW_ALL_in_faUsingPredicateRule4043); 
					p.aggregatorType =  UsingAggregatorPredicate.ALL_MEMBERSHIP_IN_DOCUMENT;
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:456:3: fuzzySet= ID FROM_ARRAY array= FIELD_NAME
					{
					fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4058); 
					match(input,FROM_ARRAY,FOLLOW_FROM_ARRAY_in_faUsingPredicateRule4060); 
					array=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_faUsingPredicateRule4064); 
					env.setUsingAggregateFromArray(p, fuzzySet, array);
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:4: LB fuzzySet= ID ( ',' fuzzySet= ID )* RB
					{
					match(input,LB,FOLLOW_LB_in_faUsingPredicateRule4071); 
					fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4075); 
					p.aggregatorType =  UsingAggregatorPredicate.SELECTED_FUZZY_SET_IN_DOCUMENT; env.setUsingAggregateInDocument(p, fuzzySet);
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:2: ( ',' fuzzySet= ID )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==COMMA) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:3: ',' fuzzySet= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_faUsingPredicateRule4086); 
							fuzzySet=(Token)match(input,ID,FOLLOW_ID_in_faUsingPredicateRule4090); 
							env.setUsingAggregateInDocument(p, fuzzySet);
							}
							break;

						default :
							break loop66;
						}
					}

					match(input,RB,FOLLOW_RB_in_faUsingPredicateRule4100); 
					}
					break;

			}

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:460:2: ( ',' exp= restrictedExpressionRule )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==COMMA) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:460:3: ',' exp= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_faUsingPredicateRule4110); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_faUsingPredicateRule4114);
					exp=restrictedExpressionRule();
					state._fsp--;

					p.parameters.add(exp);
					}
					break;

				default :
					break loop68;
				}
			}

			match(input,RP,FOLLOW_RP_in_faUsingPredicateRule4125); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:466:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:468:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4159);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:469:4: ( OR c2= usingAndConditionRule )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==OR) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:469:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule4174); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4178);
					c2=usingAndConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop69;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:474:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:475:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:476:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4235);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:5: ( AND c2= usingNotConditionRule )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==AND) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule4251); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4255);
					c2=usingNotConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop70;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:482:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:483:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:484:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:484:5: (not= NOT )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==NOT) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:484:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule4317); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule4329);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:490:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | AGGREGATE THROUGH fe= faUsingPredicateRule | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		UsingAggregatorPredicate fe =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:491:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | AGGREGATE THROUGH fe= faUsingPredicateRule | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
			int alt74=4;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt74=1;
				}
				break;
			case ID:
				{
				alt74=2;
				}
				break;
			case AGGREGATE:
				{
				alt74=3;
				}
				break;
			case IF_FAILS:
				{
				alt74=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:492:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4361); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4365);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule4367); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule4385); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:9: ( LP (fp= functionParamsRule )? RP )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==LP) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule4388); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:13: (fp= functionParamsRule )?
							int alt72=2;
							int LA72_0 = input.LA(1);
							if ( (LA72_0==ADD||LA72_0==APEX_VALUE||LA72_0==ARRAY_FUNCTION||LA72_0==BOOLEAN||LA72_0==FIELD_NAME||LA72_0==FLOAT||(LA72_0 >= ID && LA72_0 <= IF_ERROR)||LA72_0==INT||LA72_0==LP||LA72_0==MEMBERSHIP_OF||LA72_0==QUOTED_VALUE||LA72_0==SUB||LA72_0==TRANSLATE) ) {
								alt72=1;
							}
							switch (alt72) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule4393);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule4397); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:494:4: AGGREGATE THROUGH fe= faUsingPredicateRule
					{
					match(input,AGGREGATE,FOLLOW_AGGREGATE_in_usingPredicateRule4418); 
					match(input,THROUGH,FOLLOW_THROUGH_in_usingPredicateRule4420); 
					pushFollow(FOLLOW_faUsingPredicateRule_in_usingPredicateRule4424);
					fe=faUsingPredicateRule();
					state._fsp--;

					p = fe;
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:495:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule4434); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4436); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4444);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule4446); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule4450);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule4458); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:501:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:2: ( ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:503:3: ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule4474); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule4479);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule4481); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4485); 
				env.addAlphaCut (gs, n, on); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:504:4: ( COMMA n= numericRule ON on= ID )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==COMMA) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:504:6: COMMA n= numericRule ON on= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule4497); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule4501);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule4503); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4507); 
					 env.addAlphaCut (gs, n, on); 
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
	// $ANTLR end "alphaCutRule"



	// $ANTLR start "keepDropFuzzySetsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:515:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
			int alt78=5;
			switch ( input.LA(1) ) {
			case DEFUZZIFY:
				{
				alt78=1;
				}
				break;
			case DROPPING:
				{
				int LA78_2 = input.LA(2);
				if ( (LA78_2==ALL) ) {
					alt78=2;
				}
				else if ( (LA78_2==FUZZY) ) {
					alt78=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KEEPING:
				{
				int LA78_3 = input.LA(2);
				if ( (LA78_3==ALL) ) {
					alt78=3;
				}
				else if ( (LA78_3==FUZZY) ) {
					alt78=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:516:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4545); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:517:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4564); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4566); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4568); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4570); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:518:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4582); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4584); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4586); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4588); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:519:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4601); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4603); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4605); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4609); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:520:5: ( COMMA fs= ID )*
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==COMMA) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:520:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4623); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4627); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop76;
						}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:521:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4652); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4654); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4656); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4660); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:522:5: ( COMMA fs= ID )*
					loop77:
					while (true) {
						int alt77=2;
						int LA77_0 = input.LA(1);
						if ( (LA77_0==COMMA) ) {
							alt77=1;
						}

						switch (alt77) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:522:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4675); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4679); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop77;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:2: ( ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:529:3: ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule4720); 
			match(input,FIELDS,FOLLOW_FIELDS_in_addFieldsRule4722); 
			match(input,LBR,FOLLOW_LBR_in_addFieldsRule4749); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4757);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule4759); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4763);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:532:5: ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==COMMA) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:532:7: COMMA f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule4782); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4786);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule4788); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4792);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop79;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_addFieldsRule4810); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:538:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==DISTANCE||LA80_0==INCLUDED||LA80_0==INTERSECT||LA80_0==MEET||LA80_0==ORIENTATION) ) {
				alt80=1;
			}
			else if ( (LA80_0==APEX_VALUE||LA80_0==ARRAY_FUNCTION||LA80_0==BOOLEAN||LA80_0==FIELD_NAME||LA80_0==FLOAT||(LA80_0 >= ID && LA80_0 <= IF_ERROR)||LA80_0==INT||LA80_0==LP||LA80_0==MEMBERSHIP_OF||LA80_0==QUOTED_VALUE||LA80_0==TRANSLATE) ) {
				alt80=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:539:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule4833);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:540:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule4848);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:547:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:549:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
			int alt85=5;
			switch ( input.LA(1) ) {
			case DISTANCE:
				{
				alt85=1;
				}
				break;
			case ORIENTATION:
				{
				alt85=2;
				}
				break;
			case INCLUDED:
				{
				alt85=3;
				}
				break;
			case MEET:
				{
				alt85=4;
				}
				break;
			case INTERSECT:
				{
				alt85=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:550:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule4887); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4889); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4893); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4895); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:550:25: (cp= comparatorRule n= numericRule )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==EQ||LA81_0==GE||LA81_0==GT||LA81_0==LE||LA81_0==LT||LA81_0==NEQ) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:550:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule4901);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4905);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule4929); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4931); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:21: (f= LEFT |f= RIGHT )
					int alt82=2;
					int LA82_0 = input.LA(1);
					if ( (LA82_0==LEFT) ) {
						alt82=1;
					}
					else if ( (LA82_0==RIGHT) ) {
						alt82=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 82, 0, input);
						throw nvae;
					}

					switch (alt82) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule4937); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule4943); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:42: ( COMMA o= ID COLON d= numericRule )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==COMMA) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule4949); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4954); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule4956); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4960);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4965); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule4977); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4979); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:18: (i= LEFT |i= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule4985); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule4991); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4994); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule5026); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:554:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule5073); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule5136); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule5138); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule5140); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==KEEP) ) {
				alt90=1;
			}
			else if ( ((LA90_0 >= HOWINCLUDE && LA90_0 <= HOWMEET)||LA90_0==LEFT||LA90_0==RIGHT) ) {
				alt90=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}

			switch (alt90) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule5148); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:564:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					int alt87=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt87=1;
						}
						break;
					case LEFT:
						{
						alt87=2;
						}
						break;
					case RIGHT:
						{
						alt87=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 87, 0, input);
						throw nvae;
					}
					switch (alt87) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:564:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule5185); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:565:7: ( resolvingRule[sfs] )?
							int alt86=2;
							int LA86_0 = input.LA(1);
							if ( (LA86_0==RESOLVING) ) {
								alt86=1;
							}
							switch (alt86) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:565:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5221);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:566:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule5239); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:567:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule5275); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:568:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5306);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:569:5: ( COMMA addFuzzySetRule[sfs] )*
					loop88:
					while (true) {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==COMMA) ) {
							alt88=1;
						}

						switch (alt88) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:569:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule5315); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5317);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop88;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:5: ( resolvingRule[sfs] )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==RESOLVING) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5333);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:576:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule5360); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule5362); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:577:6: (t= AND |t= OR |t= FIRST |t= LAST )
			int alt91=4;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt91=1;
				}
				break;
			case OR:
				{
				alt91=2;
				}
				break;
			case FIRST:
				{
				alt91=3;
				}
				break;
			case LAST:
				{
				alt91=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:577:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule5374); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:577:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule5380); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:577:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule5386); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:577:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule5392); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:580:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:581:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
			int alt97=4;
			switch ( input.LA(1) ) {
			case LEFT:
			case RIGHT:
				{
				alt97=1;
				}
				break;
			case HOWINCLUDE:
				{
				alt97=2;
				}
				break;
			case HOWMEET:
				{
				alt97=3;
				}
				break;
			case HOWINTERSECT:
				{
				alt97=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:3: (s= LEFT |s= RIGHT )
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==LEFT) ) {
						alt92=1;
					}
					else if ( (LA92_0==RIGHT) ) {
						alt92=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 92, 0, input);
						throw nvae;
					}

					switch (alt92) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5424); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5430); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:583:4: ( ALL |fs= ID ( AS newFs= ID )? )
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==ALL) ) {
						alt94=1;
					}
					else if ( (LA94_0==ID) ) {
						alt94=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 94, 0, input);
						throw nvae;
					}

					switch (alt94) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:583:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule5441); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:584:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5477); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:584:12: ( AS newFs= ID )?
							int alt93=2;
							int LA93_0 = input.LA(1);
							if ( (LA93_0==AS) ) {
								alt93=1;
							}
							switch (alt93) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:584:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule5481); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5485); 
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule5516); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5520); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:22: (s= LEFT |s= RIGHT )
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==LEFT) ) {
						alt95=1;
					}
					else if ( (LA95_0==RIGHT) ) {
						alt95=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 95, 0, input);
						throw nvae;
					}

					switch (alt95) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5526); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:586:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5532); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5536); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5538); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5542); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule5555); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5560); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:20: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5566); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:587:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5572); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5576); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5579); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5583); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:588:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule5606); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5609); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5611); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5624); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5628); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:595:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:597:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule5652); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule5654); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:6: (name= ID ( AT db= ID )? | FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==ID) ) {
				alt100=1;
			}
			else if ( (LA100_0==FROM_WEB) ) {
				alt100=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5666); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:16: ( AT db= ID )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==AT) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule5670); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5674); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:8: FROM_WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM_WEB,FOLLOW_FROM_WEB_in_getCollectionRule5705); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:17: (url= APEX_VALUE |url= QUOTED_VALUE )
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==APEX_VALUE) ) {
						alt99=1;
					}
					else if ( (LA99_0==QUOTED_VALUE) ) {
						alt99=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 99, 0, input);
						throw nvae;
					}

					switch (alt99) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule5710); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule5716); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule5729); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule5750); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule5752); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5763); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule5765); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5769); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule5771); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5775); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule5804); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:613:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:614:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:615:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule5823); 
			match(input,AS,FOLLOW_AS_in_saveAsRule5825); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5835); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:12: ( AT db= ID )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==AT) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule5839); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5843); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule5863); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:621:1: lookupFromWebRule : LOOKUP FROM WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:622:2: ( LOOKUP FROM WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:623:3: LOOKUP FROM WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule5879); 
			match(input,FROM,FOLLOW_FROM_in_lookupFromWebRule5881); 
			match(input,WEB,FOLLOW_WEB_in_lookupFromWebRule5883); 
				LookupFromWeb gfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:624:4: (fe= forEachRule )+
			int cnt102=0;
			loop102:
			while (true) {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==FOR) ) {
					alt102=1;
				}

				switch (alt102) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:624:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule5899);
					fe=forEachRule();
					state._fsp--;

						gfw.addForEach (fe);	
					}
					break;

				default :
					if ( cnt102 >= 1 ) break loop102;
					EarlyExitException eee = new EarlyExitException(102, input);
					throw eee;
				}
				cnt102++;
			}

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule5912); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:630:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:631:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule5932); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule5934); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule5938);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule5943); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule5947);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:636:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC ;
	public final void joinOfCollectionsRule() throws RecognitionException {
		Token tk=null;
		Token g=null;
		DbCollection c1 =null;
		DbCollection c2 =null;
		SpatialFunction nff =null;
		SetFuzzySets sfs =null;
		CaseClause cc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule5970); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule5972); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule5974); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5983);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule5987); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5991);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==ON) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:640:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule6003); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6005); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6009);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==SET) ) {
				int LA105_1 = input.LA(2);
				if ( (LA105_1==GEOMETRY) ) {
					alt105=1;
				}
			}
			switch (alt105) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule6041); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule6043); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					int alt104=4;
					switch ( input.LA(1) ) {
					case INTERSECTION:
						{
						alt104=1;
						}
						break;
					case RIGHT:
						{
						alt104=2;
						}
						break;
					case LEFT:
						{
						alt104=3;
						}
						break;
					case ALL:
						{
						alt104=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 104, 0, input);
						throw nvae;
					}
					switch (alt104) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule6049); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule6055); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule6061); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:641:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule6067); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:642:7: ( addFieldsRule[jc] )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==ADD_ST) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:642:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule6087);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:643:7: (sfs= setFuzzySetsRule )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==SET) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:643:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6147);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:644:6: (cc= caseClauseRule )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==CASE) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:644:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule6189);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:7: ( REMOVE DUPLICATES )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==REMOVE) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule6238); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule6240); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule6281); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:1: filterRule : FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:3: ( FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:4: FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule6305); 
			pushFollow(FOLLOW_caseClauseRule_in_filterRule6317);
			fc=caseClauseRule();
			state._fsp--;

			 Filter f = env.addFilter (fc); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:654:7: ( REMOVE DUPLICATES )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==REMOVE) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:654:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule6335); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule6337); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule6359); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:659:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:660:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:661:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule6380); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:7: (p= groupPartitionRule )+
			int cnt111=0;
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==PARTITION) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule6405);
					p=groupPartitionRule();
					state._fsp--;

					 g.addPartition (p); 
					}
					break;

				default :
					if ( cnt111 >= 1 ) break loop111;
					EarlyExitException eee = new EarlyExitException(111, input);
					throw eee;
				}
				cnt111++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:7: (oth= othersRule )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==DROP||LA112_0==KEEP) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule6431);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule6455); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:669:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:670:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule6478); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule6482);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule6495); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6499);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:672:10: ( COMMA fr= fieldRefRule )*
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==COMMA) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:672:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6524); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6528);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop113;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule6550); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6554);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:674:8: ( DROP GROUPING FIELDS )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==DROP) ) {
				int LA114_1 = input.LA(2);
				if ( (LA114_1==GROUPING) ) {
					alt114=1;
				}
			}
			switch (alt114) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:674:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule6575); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule6577); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule6579); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:675:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==ORDER) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:675:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule6601); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule6603); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6607);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:676:9: ( COMMA sf= sortingFieldRule )*
					loop115:
					while (true) {
						int alt115=2;
						int LA115_0 = input.LA(1);
						if ( (LA115_0==COMMA) ) {
							alt115=1;
						}

						switch (alt115) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:676:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6624); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6628);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop115;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:6: ( KEEP UNCOMPARABLE )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==KEEP) ) {
						int LA116_1 = input.LA(2);
						if ( (LA116_1==UNCOMPARABLE) ) {
							alt116=1;
						}
					}
					switch (alt116) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule6647); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule6649); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:7: (gs= generateSectionRule[false] )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==GENERATE) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:679:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule6680);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:685:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule6711);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule6715); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule6719); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:3: (v= VERSUS )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==VERSUS) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule6734); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:690:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:691:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:692:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule6763); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:693:7: (u= unpackRule )+
			int cnt120=0;
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==UNPACK) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:693:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule6787);
					u=unpackRule();
					state._fsp--;

					 e.addUnpack (u); 
					}
					break;

				default :
					if ( cnt120 >= 1 ) break loop120;
					EarlyExitException eee = new EarlyExitException(120, input);
					throw eee;
				}
				cnt120++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:694:7: (oth= othersRule )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==DROP||LA121_0==KEEP) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:694:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule6819);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule6843); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:699:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:700:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule6865); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule6870);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule6877); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule6881);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule6888); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule6892);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:707:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:708:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:709:6: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule6920); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule6922); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6936);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:711:9: ( COMMA cr= collectionReferenceRule )+
			int cnt122=0;
			loop122:
			while (true) {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==COMMA) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:711:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule6958); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6962);
					cr=collectionReferenceRule();
					state._fsp--;

					 mc.addCollection (cr); 
					}
					break;

				default :
					if ( cnt122 >= 1 ) break loop122;
					EarlyExitException eee = new EarlyExitException(122, input);
					throw eee;
				}
				cnt122++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:7: ( REMOVE DUPLICATES )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==REMOVE) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule6983); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule6985); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule7015); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:719:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule7035); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule7037); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7047);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule7049); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7053);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule7065); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:725:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:726:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:727:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule7087); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule7089); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7097);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule7099); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7103);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule7115); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:733:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule7142); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule7152); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:737:10: (d= ID |d= APEX_VALUE )
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==ID) ) {
				alt124=1;
			}
			else if ( (LA124_0==APEX_VALUE) ) {
				alt124=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}

			switch (alt124) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:737:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7157); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:737:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7163); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==AS) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule7187); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:13: (a= ID |a= APEX_VALUE )
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==ID) ) {
						alt125=1;
					}
					else if ( (LA125_0==APEX_VALUE) ) {
						alt125=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 125, 0, input);
						throw nvae;
					}

					switch (alt125) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7192); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:738:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7198); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==COMMA) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule7279); 
					match(input,DB,FOLLOW_DB_in_useDbRule7281); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:20: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7286); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7292); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==AS) ) {
						alt129=1;
					}
					switch (alt129) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule7315); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:21: (a= ID |a= APEX_VALUE )
							int alt128=2;
							int LA128_0 = input.LA(1);
							if ( (LA128_0==ID) ) {
								alt128=1;
							}
							else if ( (LA128_0==APEX_VALUE) ) {
								alt128=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 128, 0, input);
								throw nvae;
							}

							switch (alt128) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7320); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7326); 
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
					break loop130;
				}
			}

			match(input,ON,FOLLOW_ON_in_useDbRule7404); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==DEFAULT) ) {
				alt134=1;
			}
			else if ( (LA134_0==SERVER) ) {
				alt134=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}

			switch (alt134) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:746:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule7416); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7418); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:747:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7430); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:748:10: (d= ID |d= APEX_VALUE )
					int alt131=2;
					int LA131_0 = input.LA(1);
					if ( (LA131_0==ID) ) {
						alt131=1;
					}
					else if ( (LA131_0==APEX_VALUE) ) {
						alt131=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 131, 0, input);
						throw nvae;
					}

					switch (alt131) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:748:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7445); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:748:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7451); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt133=2;
					int LA133_0 = input.LA(1);
					if ( (LA133_0==APEX_VALUE||LA133_0==ID) ) {
						alt133=1;
					}
					switch (alt133) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:12: (d= ID |d= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7475); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7481); 
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

			match(input,SC,FOLLOW_SC_in_useDbRule7506); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:755:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7531); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule7533); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7543);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule7545); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7549);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:759:7: (tp= trajectoryPartitionRule )+
			int cnt135=0;
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==PARTITION) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:759:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7565);
					tp=trajectoryPartitionRule();
					state._fsp--;

					 tm.addPartition (tp); 
					}
					break;

				default :
					if ( cnt135 >= 1 ) break loop135;
					EarlyExitException eee = new EarlyExitException(135, input);
					throw eee;
				}
				cnt135++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:760:7: (oth= othersRule )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==DROP||LA136_0==KEEP) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:760:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule7605);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule7647); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:766:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:767:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule7675); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule7685);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:6: (tpm= partitionMatchingRule )+
			int cnt137=0;
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==MATCHING) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7706);
					tpm=partitionMatchingRule();
					state._fsp--;

					 tp.addPartitionMatching (tpm);  
					}
					break;

				default :
					if ( cnt137 >= 1 ) break loop137;
					EarlyExitException eee = new EarlyExitException(137, input);
					throw eee;
				}
				cnt137++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:773:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:774:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:775:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule7743); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7747);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule7754); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7758);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule7765); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule7767); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule7771); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule7774); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule7778);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:778:6: ( WHERE wc= orConditionRule )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==WHERE) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:778:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule7793); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule7797);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule7821); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7825);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:780:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==ADDING) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:780:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule7848); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7852);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule7854); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule7856); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:781:6: ( MIN_SIMILARITY n= numericRule )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==MIN_SIMILARITY) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:781:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7878); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule7882);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:787:1: parameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:788:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:789:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule7930); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule7946); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule7950); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:794:1: createJavaScriptFunctionRule : CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:795:2: ( CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:796:3: CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE_JF,FOLLOW_CREATE_JF_in_createJavaScriptFunctionRule7975); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule7983); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8016); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8026);
			p=parameterRule(jsf.getParamList());
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:800:5: ( COMMA p= parameterRule[jsf.getParamList()] )*
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==COMMA) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:800:7: COMMA p= parameterRule[jsf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule8051); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule8055);
					p=parameterRule(jsf.getParamList());
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop141;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:801:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==PRECONDITION) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:801:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8080); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8084);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule8098); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule8111); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule8117); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:824:1: createFuzzyOperatorRule : CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:825:3: ( CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:826:4: CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE_FO,FOLLOW_CREATE_FO_in_createFuzzyOperatorRule8139); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule8143); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8172); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8182);
			p=parameterRule(fo.getParamList());
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:829:5: ( COMMA p= parameterRule[fo.getParamList()] )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==COMMA) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:829:7: COMMA p= parameterRule[fo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8207); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8211);
					p=parameterRule(fo.getParamList());
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop143;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:830:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==PRECONDITION) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:830:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8238); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8242);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule8256); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8260);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:832:4: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==POLYLINE) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:832:6: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule8278); 
					match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule8281); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8293); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8297);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8299); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8303);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8305); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:11: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt145=0;
					loop145:
					while (true) {
						int alt145=2;
						int LA145_0 = input.LA(1);
						if ( (LA145_0==COMMA) ) {
							alt145=1;
						}

						switch (alt145) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:13: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8327); 
							match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8329); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8333);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8335); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8339);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8341); 
							 env.addFuzzyPolylinePoint (fo, x, y); 
							}
							break;

						default :
							if ( cnt145 >= 1 ) break loop145;
							EarlyExitException eee = new EarlyExitException(145, input);
							throw eee;
						}
						cnt145++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule8362); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule8369); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:841:1: aggSpecRule[FuzzyAggregator fa, ForAllClause fac] returns [AggregateClause ac] : (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID ;
	public final AggregateClause aggSpecRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		AggregateClause ac = null;


		Token alias=null;
		String with_type =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:841:80: ( (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:842:2: (with_type= withSpec )? e= faExpressionRule[fa, fac] AS alias= ID
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:842:2: (with_type= withSpec )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==WITH) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:842:3: with_type= withSpec
					{
					pushFollow(FOLLOW_withSpec_in_aggSpecRule8395);
					with_type=withSpec();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_faExpressionRule_in_aggSpecRule8401);
			e=faExpressionRule(fa, fac);
			state._fsp--;

			match(input,AS,FOLLOW_AS_in_aggSpecRule8405); 
			alias=(Token)match(input,ID,FOLLOW_ID_in_aggSpecRule8409); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:844:1: createFuzzyAggregatorRule : CREATE_FA f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:845:2: ( CREATE_FA f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:846:2: CREATE_FA f= ID PARAMETERS p= faParameterRule[fa.getParamList()] ( COMMA p= faParameterRule[fa.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )? ( SORT v= VERSUS )? fac= forAllRule[fa] ( COMMA fac= forAllRule[fa] )* EVALUATE e= faExpressionRule[fa, null] ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )? SC
			{
			match(input,CREATE_FA,FOLLOW_CREATE_FA_in_createFuzzyAggregatorRule8423); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyAggregatorRule8427); 
			 FuzzyAggregator fa = env.addFuzzyAggregator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule8441); 
			pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8448);
			p=faParameterRule(fa.getParamList());
			state._fsp--;

			 fa.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:849:3: ( COMMA p= faParameterRule[fa.getParamList()] )*
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==COMMA) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:849:5: COMMA p= faParameterRule[fa.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8462); 
					pushFollow(FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8466);
					p=faParameterRule(fa.getParamList());
					state._fsp--;

					 fa.parameters.add (p);
					}
					break;

				default :
					break loop148;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:2: ( PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false] )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==PRECONDITION) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:4: PRECONDITION pc= jfOrConditionRule[fa.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule8485); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule8489);
					pc=jfOrConditionRule(fa.getParamList(), false);
					state._fsp--;

					 fa.preCondition = pc; 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:2: ( SORT v= VERSUS )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==SORT) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:3: SORT v= VERSUS
					{
					match(input,SORT,FOLLOW_SORT_in_createFuzzyAggregatorRule8504); 
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_createFuzzyAggregatorRule8508); 
					 env.setVersusFuzzyAggregator(fa,v.getText());
					}
					break;

			}

			pushFollow(FOLLOW_forAllRule_in_createFuzzyAggregatorRule8528);
			fac=forAllRule(fa);
			state._fsp--;

			 fa.forAll.add(fac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:853:2: ( COMMA fac= forAllRule[fa] )*
			loop151:
			while (true) {
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==COMMA) ) {
					alt151=1;
				}

				switch (alt151) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:853:3: COMMA fac= forAllRule[fa]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8542); 
					pushFollow(FOLLOW_forAllRule_in_createFuzzyAggregatorRule8546);
					fac=forAllRule(fa);
					state._fsp--;

					 fa.forAll.add(fac);
					}
					break;

				default :
					break loop151;
				}
			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyAggregatorRule8561); 
			pushFollow(FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule8565);
			e=faExpressionRule(fa, null);
			state._fsp--;

			 env.setEvaluateClause(fa, e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:855:2: ( POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==POLYLINE) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:855:4: POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )+ RB
					{
					match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyAggregatorRule8581); 
					match(input,LB,FOLLOW_LB_in_createFuzzyAggregatorRule8583); 
					match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule8588); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8592);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8594); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8598);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule8600); 
					 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:857:4: ( COMMA LP x= numericRule COMMA y= numericRule RP )+
					int cnt152=0;
					loop152:
					while (true) {
						int alt152=2;
						int LA152_0 = input.LA(1);
						if ( (LA152_0==COMMA) ) {
							alt152=1;
						}

						switch (alt152) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:857:6: COMMA LP x= numericRule COMMA y= numericRule RP
							{
							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8612); 
							match(input,LP,FOLLOW_LP_in_createFuzzyAggregatorRule8614); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8618);
							x=numericRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_createFuzzyAggregatorRule8620); 
							pushFollow(FOLLOW_numericRule_in_createFuzzyAggregatorRule8624);
							y=numericRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_createFuzzyAggregatorRule8626); 
							 env.addFuzzyAggregatorPolylinePoint (fa, x, y); 
							}
							break;

						default :
							if ( cnt152 >= 1 ) break loop152;
							EarlyExitException eee = new EarlyExitException(152, input);
							throw eee;
						}
						cnt152++;
					}

					match(input,RB,FOLLOW_RB_in_createFuzzyAggregatorRule8638); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_createFuzzyAggregatorRule8644); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:863:1: withSpec returns [String s] : WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM ) ;
	public final String withSpec() throws RecognitionException {
		String s = null;


		Token x=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:863:28: ( WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:3: WITH (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM )
			{
			match(input,WITH,FOLLOW_WITH_in_withSpec8661); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:8: (x= SUM |x= PRODUCT |x= DIVISION |x= SUBTRACTION |x= MINIMUM |x= MAXIMUM )
			int alt154=6;
			switch ( input.LA(1) ) {
			case SUM:
				{
				alt154=1;
				}
				break;
			case PRODUCT:
				{
				alt154=2;
				}
				break;
			case DIVISION:
				{
				alt154=3;
				}
				break;
			case SUBTRACTION:
				{
				alt154=4;
				}
				break;
			case MINIMUM:
				{
				alt154=5;
				}
				break;
			case MAXIMUM:
				{
				alt154=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}
			switch (alt154) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:9: x= SUM
					{
					x=(Token)match(input,SUM,FOLLOW_SUM_in_withSpec8666); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:17: x= PRODUCT
					{
					x=(Token)match(input,PRODUCT,FOLLOW_PRODUCT_in_withSpec8672); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:29: x= DIVISION
					{
					x=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_withSpec8678); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:42: x= SUBTRACTION
					{
					x=(Token)match(input,SUBTRACTION,FOLLOW_SUBTRACTION_in_withSpec8684); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:58: x= MINIMUM
					{
					x=(Token)match(input,MINIMUM,FOLLOW_MINIMUM_in_withSpec8690); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:864:70: x= MAXIMUM
					{
					x=(Token)match(input,MAXIMUM,FOLLOW_MAXIMUM_in_withSpec8696); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:867:1: forAllRule[FuzzyAggregator fa] returns [ForAllClause fac] : FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* ;
	public final ForAllClause forAllRule(FuzzyAggregator fa) throws RecognitionException {
		ForAllClause fac = null;


		Token array_id=null;
		Token id=null;
		Expression x1 =null;
		Expression x2 =null;
		Expression e =null;
		AggregateClause ac =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:867:58: ( FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:868:2: FOR ALL array_id= ID ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )? ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )* AGGREGATE ac= aggSpecRule[fa, fac] ( COMMA ac= aggSpecRule[fa, fac] )*
			{
			match(input,FOR,FOLLOW_FOR_in_forAllRule8717); 
			match(input,ALL,FOLLOW_ALL_in_forAllRule8719); 
			array_id=(Token)match(input,ID,FOLLOW_ID_in_forAllRule8723); 
			fac = env.createForAllClause(array_id, fa);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:2: ( IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==IN) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:3: IN LP x1= faExpressionRule[fa, null] COMMA x2= faExpressionRule[fa, null] RP
					{
					match(input,IN,FOLLOW_IN_in_forAllRule8736); 
					match(input,LP,FOLLOW_LP_in_forAllRule8738); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule8742);
					x1=faExpressionRule(fa, null);
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_forAllRule8746); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule8750);
					x2=faExpressionRule(fa, null);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_forAllRule8754); 
					fac.firstIndex = x1; fac.lastIndex=x2;
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:2: ( LOCALLY e= faExpressionRule[fa, fac] AS id= ID )*
			loop156:
			while (true) {
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==LOCALLY) ) {
					alt156=1;
				}

				switch (alt156) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:3: LOCALLY e= faExpressionRule[fa, fac] AS id= ID
					{
					match(input,LOCALLY,FOLLOW_LOCALLY_in_forAllRule8764); 
					pushFollow(FOLLOW_faExpressionRule_in_forAllRule8768);
					e=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,AS,FOLLOW_AS_in_forAllRule8772); 
					id=(Token)match(input,ID,FOLLOW_ID_in_forAllRule8776); 
					env.createLocallyClause(fac, id, e, fa);
					}
					break;

				default :
					break loop156;
				}
			}

			match(input,AGGREGATE,FOLLOW_AGGREGATE_in_forAllRule8787); 
			pushFollow(FOLLOW_aggSpecRule_in_forAllRule8791);
			ac=aggSpecRule(fa, fac);
			state._fsp--;

			 fac.aggregate.add(ac);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:2: ( COMMA ac= aggSpecRule[fa, fac] )*
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==COMMA) ) {
					int LA157_1 = input.LA(2);
					if ( (LA157_1==ADD||LA157_1==APEX_VALUE||LA157_1==FLOAT||LA157_1==ID||LA157_1==INT||LA157_1==LP||LA157_1==POS||LA157_1==QUOTED_VALUE||LA157_1==SUB||LA157_1==WITH) ) {
						alt157=1;
					}

				}

				switch (alt157) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:872:4: COMMA ac= aggSpecRule[fa, fac]
					{
					match(input,COMMA,FOLLOW_COMMA_in_forAllRule8803); 
					pushFollow(FOLLOW_aggSpecRule_in_forAllRule8807);
					ac=aggSpecRule(fa, fac);
					state._fsp--;

					 fac.aggregate.add(ac);
					}
					break;

				default :
					break loop157;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:1: faParameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE (t= ID |t= ARRAY ) ;
	public final Parameter faParameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:2: (v= ID TYPE (t= ID |t= ARRAY ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:3: v= ID TYPE (t= ID |t= ARRAY )
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule8839); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_faParameterRule8855); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:8: (t= ID |t= ARRAY )
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==ID) ) {
				alt158=1;
			}
			else if ( (LA158_0==ARRAY) ) {
				alt158=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}

			switch (alt158) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:9: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_faParameterRule8860); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:14: t= ARRAY
					{
					t=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_faParameterRule8864); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:883:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:884:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:885:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule8902);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:886:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop159:
			while (true) {
				int alt159=2;
				int LA159_0 = input.LA(1);
				if ( (LA159_0==OR) ) {
					alt159=1;
				}

				switch (alt159) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:886:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule8919); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule8923);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop159;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:892:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:893:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:894:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule8991);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:895:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop160:
			while (true) {
				int alt160=2;
				int LA160_0 = input.LA(1);
				if ( (LA160_0==AND) ) {
					alt160=1;
				}

				switch (alt160) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:895:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule9009); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule9013);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop160;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:900:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:901:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:902:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:902:5: (not= NOT )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==NOT) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:902:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule9081); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule9092);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:908:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:909:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:910:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule9130);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt162=3;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==EQ||LA162_0==GE||LA162_0==GT||LA162_0==LE||LA162_0==LT||LA162_0==NEQ) ) {
				alt162=1;
			}
			else if ( (LA162_0==INRANGE) ) {
				alt162=2;
			}
			switch (alt162) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:911:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule9150);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:912:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule9170);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:916:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:917:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:918:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule9217);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule9226);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:923:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:925:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:926:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:926:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==APEX_VALUE||LA164_0==FLOAT||LA164_0==ID||LA164_0==INT||LA164_0==LP||LA164_0==QUOTED_VALUE) ) {
				alt164=1;
			}
			else if ( (LA164_0==ADD||LA164_0==SUB) ) {
				alt164=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:926:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9268);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:927:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:927:6: (s= ADD |s= SUB )
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( (LA163_0==ADD) ) {
						alt163=1;
					}
					else if ( (LA163_0==SUB) ) {
						alt163=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 163, 0, input);
						throw nvae;
					}

					switch (alt163) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:927:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule9291); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:927:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule9297); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9302);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==ADD||LA166_0==SUB) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule9320); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:928:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule9326); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule9331);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
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
		return expr;
	}
	// $ANTLR end "jfExpressionRule"



	// $ANTLR start "jfTermRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:932:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:934:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:935:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule9371);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop168:
			while (true) {
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==DIV||LA168_0==MUL) ) {
					alt168=1;
				}

				switch (alt168) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:7: (s= MUL |s= DIV )
					int alt167=2;
					int LA167_0 = input.LA(1);
					if ( (LA167_0==MUL) ) {
						alt167=1;
					}
					else if ( (LA167_0==DIV) ) {
						alt167=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 167, 0, input);
						throw nvae;
					}

					switch (alt167) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule9396); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:936:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule9402); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule9407);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
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
		return et;
	}
	// $ANTLR end "jfTermRule"



	// $ANTLR start "jfFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:940:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? );
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		ArrayList<Expression> fp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:941:3: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt171=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt171=1;
				}
				break;
			case INT:
				{
				alt171=2;
				}
				break;
			case FLOAT:
				{
				alt171=3;
				}
				break;
			case APEX_VALUE:
				{
				alt171=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt171=5;
				}
				break;
			case ID:
				{
				alt171=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 171, 0, input);
				throw nvae;
			}
			switch (alt171) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:942:5: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule9447); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule9451);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule9455); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:943:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule9475); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:944:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule9513); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:945:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule9550); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:946:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule9584); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:947:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule9617); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:948:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt170=2;
					int LA170_0 = input.LA(1);
					if ( (LA170_0==LP) ) {
						alt170=1;
					}
					switch (alt170) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:948:7: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule9656); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:948:13: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt169=2;
							int LA169_0 = input.LA(1);
							if ( (LA169_0==ADD||LA169_0==APEX_VALUE||LA169_0==FLOAT||LA169_0==ID||LA169_0==INT||LA169_0==LP||LA169_0==QUOTED_VALUE||LA169_0==SUB) ) {
								alt169=1;
							}
							switch (alt169) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:948:14: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule9661);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule9667); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:952:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:954:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:955:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9715);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:956:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop172:
			while (true) {
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==COMMA) ) {
					alt172=1;
				}

				switch (alt172) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:956:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule9735); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9739);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
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
		return params;
	}
	// $ANTLR end "jfFunctionParamsRule"



	// $ANTLR start "faExpressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:962:1: faExpressionRule[FuzzyAggregator fa, ForAllClause fac] returns [Expression expr] : (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* ;
	public final Expression faExpressionRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:964:3: ( (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] ) ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:4: (t= faTermRule[fa, fac] | (s= ADD |s= SUB ) t= faTermRule[fa, fac] )
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==APEX_VALUE||LA174_0==FLOAT||LA174_0==ID||LA174_0==INT||LA174_0==LP||LA174_0==POS||LA174_0==QUOTED_VALUE) ) {
				alt174=1;
			}
			else if ( (LA174_0==ADD||LA174_0==SUB) ) {
				alt174=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 174, 0, input);
				throw nvae;
			}

			switch (alt174) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:965:6: t= faTermRule[fa, fac]
					{
					pushFollow(FOLLOW_faTermRule_in_faExpressionRule9787);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:6: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:6: (s= ADD |s= SUB )
					int alt173=2;
					int LA173_0 = input.LA(1);
					if ( (LA173_0==ADD) ) {
						alt173=1;
					}
					else if ( (LA173_0==SUB) ) {
						alt173=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 173, 0, input);
						throw nvae;
					}

					switch (alt173) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule9808); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:966:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule9814); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule9819);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:5: ( (s= ADD |s= SUB ) t= faTermRule[fa, fac] )*
			loop176:
			while (true) {
				int alt176=2;
				int LA176_0 = input.LA(1);
				if ( (LA176_0==ADD||LA176_0==SUB) ) {
					alt176=1;
				}

				switch (alt176) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:7: (s= ADD |s= SUB ) t= faTermRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_faExpressionRule9836); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:967:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_faExpressionRule9842); 
							}
							break;

					}

					pushFollow(FOLLOW_faTermRule_in_faExpressionRule9847);
					t=faTermRule(fa, fac);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop176;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:970:1: faTermRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionTerm et] : f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* ;
	public final ExpressionTerm faTermRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:972:3: (f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:973:4: f= faFactorRule[fa, fac] ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			{
			pushFollow(FOLLOW_faFactorRule_in_faTermRule9888);
			f=faFactorRule(fa, fac);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:5: ( (s= MUL |s= DIV ) f= faFactorRule[fa, fac] )*
			loop178:
			while (true) {
				int alt178=2;
				int LA178_0 = input.LA(1);
				if ( (LA178_0==DIV||LA178_0==MUL) ) {
					alt178=1;
				}

				switch (alt178) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:7: (s= MUL |s= DIV ) f= faFactorRule[fa, fac]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:7: (s= MUL |s= DIV )
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==MUL) ) {
						alt177=1;
					}
					else if ( (LA177_0==DIV) ) {
						alt177=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 177, 0, input);
						throw nvae;
					}

					switch (alt177) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_faTermRule9907); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:974:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_faTermRule9913); 
							}
							break;

					}

					pushFollow(FOLLOW_faFactorRule_in_faTermRule9918);
					f=faFactorRule(fa, fac);
					state._fsp--;

					 et.addFactor(f, s.getText());
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
		return et;
	}
	// $ANTLR end "faTermRule"



	// $ANTLR start "faFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:978:1: faFactorRule[FuzzyAggregator fa, ForAllClause fac] returns [ExpressionFactor expr] : ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] )? );
	public final ExpressionFactor faFactorRule(FuzzyAggregator fa, ForAllClause fac) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Expression op =null;
		ArrayReference ref =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:979:3: ( LP op= faExpressionRule[fa, fac] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |v= POS |x= ID (ref= faArrayRefRule[x, fa] )? )
			int alt180=7;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt180=1;
				}
				break;
			case INT:
				{
				alt180=2;
				}
				break;
			case FLOAT:
				{
				alt180=3;
				}
				break;
			case APEX_VALUE:
				{
				alt180=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt180=5;
				}
				break;
			case POS:
				{
				alt180=6;
				}
				break;
			case ID:
				{
				alt180=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 180, 0, input);
				throw nvae;
			}
			switch (alt180) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:980:4: LP op= faExpressionRule[fa, fac] RP
					{
					match(input,LP,FOLLOW_LP_in_faFactorRule9957); 
					pushFollow(FOLLOW_faExpressionRule_in_faFactorRule9962);
					op=faExpressionRule(fa, fac);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_faFactorRule9966); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:981:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_faFactorRule9981); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:982:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_faFactorRule9999); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:983:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_faFactorRule10017); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:984:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_faFactorRule10034); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText()));
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:985:6: v= POS
					{
					v=(Token)match(input,POS,FOLLOW_POS_in_faFactorRule10051); 
					 expr = new ExpressionFactor (new Value(Value.POS, v.getText()));
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:986:6: x= ID (ref= faArrayRefRule[x, fa] )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_faFactorRule10070); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:986:11: (ref= faArrayRefRule[x, fa] )?
					int alt179=2;
					int LA179_0 = input.LA(1);
					if ( (LA179_0==LB) ) {
						alt179=1;
					}
					switch (alt179) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:986:12: ref= faArrayRefRule[x, fa]
							{
							pushFollow(FOLLOW_faArrayRefRule_in_faFactorRule10075);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:1: faArrayRefRule[Token id, FuzzyAggregator fa] returns [ArrayReference ref] : LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? ;
	public final ArrayReference faArrayRefRule(Token id, FuzzyAggregator fa) throws RecognitionException {
		ArrayReference ref = null;


		Expression e =null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:991:75: ( LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:2: LB (e= faExpressionRule[fa, null] ) RB (f= fieldRefRule )?
			{
			match(input,LB,FOLLOW_LB_in_faArrayRefRule10141); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:5: (e= faExpressionRule[fa, null] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:6: e= faExpressionRule[fa, null]
			{
			pushFollow(FOLLOW_faExpressionRule_in_faArrayRefRule10146);
			e=faExpressionRule(fa, null);
			state._fsp--;

			}

			match(input,RB,FOLLOW_RB_in_faArrayRefRule10151); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:40: (f= fieldRefRule )?
			int alt181=2;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==FIELD_NAME) ) {
				alt181=1;
			}
			switch (alt181) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:992:41: f= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_faArrayRefRule10158);
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

	// Delegated rules



	public static final BitSet FOLLOW_getCollectionRule_in_start62 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_saveAsRule_in_start83 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start111 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_filterRule_in_start128 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_groupRule_in_start156 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_expandRule_in_start185 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start213 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start231 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start245 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_useDbRule_in_start260 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start289 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start305 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start317 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start326 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start341 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_createFuzzyAggregatorRule_in_start356 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_test_in_start369 = new BitSet(new long[]{0x00880000E0000000L,0x000001020042000CL,0x0000002004101008L});
	public static final BitSet FOLLOW_EOF_in_start400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_test413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule437 = new BitSet(new long[]{0x0000000000018002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule451 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule515 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule555 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule609 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule620 = new BitSet(new long[]{0x0000000008000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule641 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule645 = new BitSet(new long[]{0x0000000008000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule686 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule700 = new BitSet(new long[]{0x0240000000045000L,0x1000008410010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule871 = new BitSet(new long[]{0x0040000000000080L,0x0040000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule889 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule891 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule895 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule897 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule923 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule925 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1003 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_dropGeometryRule1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_GEOMETRY_in_dropGeometryRule1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1131 = new BitSet(new long[]{0x0000100000000002L,0x0000000000800000L,0x0000000040000000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1203 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_DROP_in_othersRule1209 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1245 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1311 = new BitSet(new long[]{0x0000200400880202L,0x0000000001000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1328 = new BitSet(new long[]{0x0000200400880202L,0x0000000001000000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1345 = new BitSet(new long[]{0x0000200400080202L,0x0000000001000000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1376 = new BitSet(new long[]{0x0000200400080002L,0x0000000001000000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1414 = new BitSet(new long[]{0x0000200400000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1434 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_dropGeometryRule_in_generateSectionRule1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1513 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1528 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1532 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1589 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1605 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1609 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1671 = new BitSet(new long[]{0x0250000000045010L,0x1000008402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1727 = new BitSet(new long[]{0x8002000000000002L,0x0000100820008020L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule1816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule1885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule1921 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000408000000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule1965 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LP_in_inRangeRule1971 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule1981 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule1983 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule1987 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_inRangeRule1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule2002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule2041 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2131 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2137 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2143 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2170 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2204 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2257 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2268 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2286 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2290 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2328 = new BitSet(new long[]{0x0040000000002000L,0x0000000000000202L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2343 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2349 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2355 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2376 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2399 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2403 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2449 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2472 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2478 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2483 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2501 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2507 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2512 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_factorRule_in_termRule2550 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2573 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_DIV_in_termRule2579 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_factorRule_in_termRule2584 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2618 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_factorRule2624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2696 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200804L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_factorRule2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule2757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule2796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule2810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule2822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2852 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule2892 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2896 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2900 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2902 = new BitSet(new long[]{0x0200000000041000L,0x1000000000010000L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule2906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2924 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2928 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2934 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2953 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule2957 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2977 = new BitSet(new long[]{0x0000000000001000L,0x1000000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule2982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule2988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule3009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3059 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3099 = new BitSet(new long[]{0x0040000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3128 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule3149 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3153 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3168 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3172 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule3196 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule3208 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3236 = new BitSet(new long[]{0x0040040000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3242 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3264 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3268 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule3300 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3323 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3327 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3346 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3350 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule3388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3423 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3446 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3452 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3457 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3475 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3481 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3486 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3524 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule3547 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule3553 = new BitSet(new long[]{0x0240000000045000L,0x1000008400010600L,0x0000000000200000L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3558 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3592 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule3613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule3637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule3662 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3664 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200804L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule3669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule3690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3733 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule3751 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3755 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule3799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule3809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule3819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule3829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule3839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule3889 = new BitSet(new long[]{0x0200000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SUB_in_numericRule3895 = new BitSet(new long[]{0x0200000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule3908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule3914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule3943 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule3945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule3947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule3953 = new BitSet(new long[]{0x0000000000000080L,0x0000200400000A00L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3958 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule3973 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule3975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule3977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule3981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule3983 = new BitSet(new long[]{0x0000000000000080L,0x0000200400000A00L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3987 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4022 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_faUsingPredicateRule4033 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_MEMBERSHIP_OF_in_faUsingPredicateRule4038 = new BitSet(new long[]{0x0000000000000100L,0x0000000008000200L});
	public static final BitSet FOLLOW_ALL_in_faUsingPredicateRule4043 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4058 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_FROM_ARRAY_in_faUsingPredicateRule4060 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_FIELD_NAME_in_faUsingPredicateRule4064 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LB_in_faUsingPredicateRule4071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4075 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_faUsingPredicateRule4086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_faUsingPredicateRule4090 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RB_in_faUsingPredicateRule4100 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_faUsingPredicateRule4110 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_faUsingPredicateRule4114 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_faUsingPredicateRule4125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4159 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule4174 = new BitSet(new long[]{0x0000000000000080L,0x0000200400000A00L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4178 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4235 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule4251 = new BitSet(new long[]{0x0000000000000080L,0x0000200400000A00L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4255 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule4317 = new BitSet(new long[]{0x0000000000000080L,0x0000000400000A00L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule4329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4361 = new BitSet(new long[]{0x0000000000000080L,0x0000200400000A00L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule4385 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4388 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200804L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule4393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_usingPredicateRule4418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_THROUGH_in_usingPredicateRule4420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_faUsingPredicateRule_in_usingPredicateRule4424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule4434 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4436 = new BitSet(new long[]{0x0000000000000080L,0x0000200400000A00L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4444 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule4446 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule4450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule4474 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4479 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4485 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule4497 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4501 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4507 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4564 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4566 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4582 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4584 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4601 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4609 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4627 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4652 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4660 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4679 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule4720 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_addFieldsRule4722 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LBR_in_addFieldsRule4749 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4757 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4759 = new BitSet(new long[]{0x0240008000045000L,0x100400C400032600L,0x0000000000200000L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4763 = new BitSet(new long[]{0x0000000008000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule4782 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4786 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4788 = new BitSet(new long[]{0x0240008000045000L,0x100400C400032600L,0x0000000000200000L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4792 = new BitSet(new long[]{0x0000000008000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RBR_in_addFieldsRule4810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule4833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule4848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule4887 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4895 = new BitSet(new long[]{0x8002000000000002L,0x0000100820000020L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule4901 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule4929 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4931 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule4937 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule4943 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule4949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4954 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule4956 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule4977 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4979 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule4985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule4991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule5026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule5073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule5136 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule5138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule5140 = new BitSet(new long[]{0x0000000000000000L,0x00000000408001C0L,0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule5148 = new BitSet(new long[]{0x0000000000000100L,0x0000000040000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule5185 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule5239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule5275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5306 = new BitSet(new long[]{0x0000000008000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule5315 = new BitSet(new long[]{0x0000000000000000L,0x00000000400001C0L,0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5317 = new BitSet(new long[]{0x0000000008000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule5360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule5362 = new BitSet(new long[]{0x0100000000000400L,0x0001000004000000L});
	public static final BitSet FOLLOW_AND_in_resolvingRule5374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule5380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule5386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule5392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5424 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000200L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5430 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000200L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule5441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5477 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule5516 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5520 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5536 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule5555 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5560 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5576 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule5606 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5611 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule5652 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule5654 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5666 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule5670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_FROM_WEB_in_getCollectionRule5705 = new BitSet(new long[]{0x0000000000001000L,0x1000000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule5710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule5729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule5750 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule5752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5763 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule5765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5769 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule5771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule5804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule5823 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule5825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5835 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_AT_in_saveAsRule5839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_saveAsRule5863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule5879 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FROM_in_lookupFromWebRule5881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_WEB_in_lookupFromWebRule5883 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule5899 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule5912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule5932 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule5934 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule5938 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule5943 = new BitSet(new long[]{0x0240000000045010L,0x1000008400010600L,0x0000000000200800L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule5947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule5970 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule5972 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule5974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5983 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule5987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5991 = new BitSet(new long[]{0x0000000000400040L,0x8000800000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule6003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6005 = new BitSet(new long[]{0x0000008000000000L,0x0004004000022000L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule6009 = new BitSet(new long[]{0x0000000000400040L,0x8000000000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule6041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule6043 = new BitSet(new long[]{0x0000000000000100L,0x0000000040040000L,0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule6049 = new BitSet(new long[]{0x0000000000400040L,0x8000000000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule6055 = new BitSet(new long[]{0x0000000000400040L,0x8000000000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule6061 = new BitSet(new long[]{0x0000000000400040L,0x8000000000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule6067 = new BitSet(new long[]{0x0000000000400040L,0x8000000000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule6087 = new BitSet(new long[]{0x0000000000400000L,0x8000000000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6147 = new BitSet(new long[]{0x0000000000400000L,0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule6189 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule6238 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule6240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule6281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule6305 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule6317 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule6335 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule6337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_filterRule6359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule6380 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule6405 = new BitSet(new long[]{0x0000100000000000L,0x0020000000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_othersRule_in_groupRule6431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_groupRule6455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule6478 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule6482 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6495 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6499 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6524 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6528 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule6550 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6554 = new BitSet(new long[]{0x0000100000000002L,0x0002000000000001L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule6575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule6577 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule6579 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000001L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule6601 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6603 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6607 = new BitSet(new long[]{0x0000000008000002L,0x0000000000800001L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6624 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6628 = new BitSet(new long[]{0x0000000008000002L,0x0000000000800001L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule6647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule6649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule6680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule6711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule6715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule6719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule6734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule6763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule6787 = new BitSet(new long[]{0x0000100000000000L,0x0000000000800000L,0x0000000002000010L});
	public static final BitSet FOLLOW_othersRule_in_expandRule6819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_expandRule6843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule6865 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule6870 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule6877 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule6881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_TO_in_unpackRule6888 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule6892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule6920 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule6922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6936 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule6958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6962 = new BitSet(new long[]{0x0000000008000000L,0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule6983 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule6985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule7015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule7035 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule7037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7047 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule7049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule7053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule7065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule7087 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule7089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7097 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule7099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule7103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule7115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule7142 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7152 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_useDbRule7157 = new BitSet(new long[]{0x0000000008008000L,0x0000800000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7163 = new BitSet(new long[]{0x0000000008008000L,0x0000800000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7187 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_useDbRule7192 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7198 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule7279 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7281 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_useDbRule7286 = new BitSet(new long[]{0x0000000008008000L,0x0000800000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7292 = new BitSet(new long[]{0x0000000008008000L,0x0000800000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7315 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_useDbRule7320 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7326 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_ON_in_useDbRule7404 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule7416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7430 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_useDbRule7445 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000200L,0x0000000000000010L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7451 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000200L,0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_useDbRule7475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_useDbRule7506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7531 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule7533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7543 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule7545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7549 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7565 = new BitSet(new long[]{0x0000100000000000L,0x0020000000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule7605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule7647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule7675 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule7685 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7706 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule7743 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule7754 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule7765 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule7767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule7771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule7774 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule7778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000040000000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule7793 = new BitSet(new long[]{0x0250000000045010L,0x1000208402010600L,0x0000000701200800L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule7797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule7821 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7825 = new BitSet(new long[]{0x0000000000000022L,0x0000040000000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule7848 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule7854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule7856 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7878 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule7882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule7930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule7946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_parameterRule7950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_JF_in_createJavaScriptFunctionRule7975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule7983 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule8016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8026 = new BitSet(new long[]{0x0000000008020000L,0x0200000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule8051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule8055 = new BitSet(new long[]{0x0000000008020000L,0x0200000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule8080 = new BitSet(new long[]{0x0200000000001010L,0x1000200400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule8084 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule8098 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule8111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule8117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_FO_in_createFuzzyOperatorRule8139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule8143 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8182 = new BitSet(new long[]{0x0004000008000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8211 = new BitSet(new long[]{0x0004000008000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8238 = new BitSet(new long[]{0x0200000000001010L,0x1000200400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8242 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule8256 = new BitSet(new long[]{0x0200000000001010L,0x1000000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8260 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule8278 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule8281 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8293 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8297 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8299 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8305 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8327 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8329 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8333 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8335 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8341 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule8362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule8369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withSpec_in_aggSpecRule8395 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_faExpressionRule_in_aggSpecRule8401 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_aggSpecRule8405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_aggSpecRule8409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_FA_in_createFuzzyAggregatorRule8423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_createFuzzyAggregatorRule8427 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyAggregatorRule8441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8448 = new BitSet(new long[]{0x0400000008000000L,0x0200000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_faParameterRule_in_createFuzzyAggregatorRule8466 = new BitSet(new long[]{0x0400000008000000L,0x0200000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyAggregatorRule8485 = new BitSet(new long[]{0x0200000000001010L,0x1000200400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyAggregatorRule8489 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SORT_in_createFuzzyAggregatorRule8504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_VERSUS_in_createFuzzyAggregatorRule8508 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_forAllRule_in_createFuzzyAggregatorRule8528 = new BitSet(new long[]{0x0004000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8542 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_forAllRule_in_createFuzzyAggregatorRule8546 = new BitSet(new long[]{0x0004000008000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyAggregatorRule8561 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_faExpressionRule_in_createFuzzyAggregatorRule8565 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyAggregatorRule8581 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyAggregatorRule8583 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule8588 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8592 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8594 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule8600 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8612 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyAggregatorRule8614 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8618 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyAggregatorRule8620 = new BitSet(new long[]{0x0200000000000010L,0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyAggregatorRule8624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_createFuzzyAggregatorRule8626 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyAggregatorRule8638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_createFuzzyAggregatorRule8644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withSpec8661 = new BitSet(new long[]{0x0000020000000000L,0x0400022000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_SUM_in_withSpec8666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRODUCT_in_withSpec8672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVISION_in_withSpec8678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACTION_in_withSpec8684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINIMUM_in_withSpec8690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAXIMUM_in_withSpec8696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forAllRule8717 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ALL_in_forAllRule8719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_forAllRule8723 = new BitSet(new long[]{0x0000000000000080L,0x0000000100001000L});
	public static final BitSet FOLLOW_IN_in_forAllRule8736 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_forAllRule8738 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule8742 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_forAllRule8746 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule8750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_forAllRule8754 = new BitSet(new long[]{0x0000000000000080L,0x0000000100000000L});
	public static final BitSet FOLLOW_LOCALLY_in_forAllRule8764 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_faExpressionRule_in_forAllRule8768 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_forAllRule8772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_forAllRule8776 = new BitSet(new long[]{0x0000000000000080L,0x0000000100000000L});
	public static final BitSet FOLLOW_AGGREGATE_in_forAllRule8787 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000100000800L});
	public static final BitSet FOLLOW_aggSpecRule_in_forAllRule8791 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_forAllRule8803 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000100000800L});
	public static final BitSet FOLLOW_aggSpecRule_in_forAllRule8807 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_ID_in_faParameterRule8839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_TYPE_in_faParameterRule8855 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_faParameterRule8860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_faParameterRule8864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule8902 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule8919 = new BitSet(new long[]{0x0200000000001010L,0x1000200400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule8923 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule8991 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule9009 = new BitSet(new long[]{0x0200000000001010L,0x1000200400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule9013 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule9081 = new BitSet(new long[]{0x0200000000001010L,0x1000000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule9092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule9130 = new BitSet(new long[]{0x8002000000000002L,0x0000100820008020L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule9150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule9170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule9217 = new BitSet(new long[]{0x0200000000001010L,0x1000000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule9226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9268 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule9291 = new BitSet(new long[]{0x0200000000001000L,0x1000000400010200L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule9297 = new BitSet(new long[]{0x0200000000001000L,0x1000000400010200L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9302 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule9320 = new BitSet(new long[]{0x0200000000001000L,0x1000000400010200L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule9326 = new BitSet(new long[]{0x0200000000001000L,0x1000000400010200L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule9331 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule9371 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule9396 = new BitSet(new long[]{0x0200000000001000L,0x1000000400010200L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule9402 = new BitSet(new long[]{0x0200000000001000L,0x1000000400010200L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule9407 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule9447 = new BitSet(new long[]{0x0200000000001010L,0x1000200400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule9451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule9455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule9475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule9513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule9550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule9584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule9617 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule9656 = new BitSet(new long[]{0x0200000000001010L,0x1000000400010200L,0x0000000000000804L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule9661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule9667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9715 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule9735 = new BitSet(new long[]{0x0200000000001010L,0x1000000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9739 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule9787 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule9808 = new BitSet(new long[]{0x0200000000001000L,0x1100000400010200L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule9814 = new BitSet(new long[]{0x0200000000001000L,0x1100000400010200L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule9819 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ADD_in_faExpressionRule9836 = new BitSet(new long[]{0x0200000000001000L,0x1100000400010200L});
	public static final BitSet FOLLOW_SUB_in_faExpressionRule9842 = new BitSet(new long[]{0x0200000000001000L,0x1100000400010200L});
	public static final BitSet FOLLOW_faTermRule_in_faExpressionRule9847 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule9888 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_MUL_in_faTermRule9907 = new BitSet(new long[]{0x0200000000001000L,0x1100000400010200L});
	public static final BitSet FOLLOW_DIV_in_faTermRule9913 = new BitSet(new long[]{0x0200000000001000L,0x1100000400010200L});
	public static final BitSet FOLLOW_faFactorRule_in_faTermRule9918 = new BitSet(new long[]{0x0000010000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_faFactorRule9957 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_faExpressionRule_in_faFactorRule9962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RP_in_faFactorRule9966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_faFactorRule9981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_faFactorRule9999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_faFactorRule10017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_faFactorRule10034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POS_in_faFactorRule10051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_faFactorRule10070 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_faArrayRefRule_in_faFactorRule10075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_faArrayRefRule10141 = new BitSet(new long[]{0x0200000000001010L,0x1100000400010200L,0x0000000000000800L});
	public static final BitSet FOLLOW_faExpressionRule_in_faArrayRefRule10146 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RB_in_faArrayRefRule10151 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_faArrayRefRule10158 = new BitSet(new long[]{0x0000000000000002L});
}
