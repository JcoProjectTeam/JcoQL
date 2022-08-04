// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2022-08-04 03:57:18

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
		"ALL", "ALPHACUT", "AND", "APEX", "APEX_VALUE", "AREA", "ARRAY", "ARRAY_FUNCTION", 
		"AS", "AT", "BODY", "BOOLEAN", "BUILD", "BY", "CALL", "CASE", "CHECK_FOR", 
		"COLLECTION", "COLLECTIONS", "COLON", "COMMA", "COMMENT", "CREATE_FO", 
		"CREATE_JF", "DB", "DEFAULT", "DEFUZZIFY", "DICTIONARY", "DIGIT", "DIGIT0", 
		"DIRECTION", "DISTANCE", "DIV", "DOCUMENTS", "DOT", "DROP", "DROPPING", 
		"DUPLICATES", "EACH", "END_BODY", "EQ", "EVALUATE", "EXPAND", "FIELD", 
		"FIELDS", "FIELD_NAME", "FILTER", "FIRST", "FLOAT", "FOR", "FROM", "FUZZY", 
		"GE", "GENERATE", "GEOMETRY", "GET", "GROUP", "GROUPING", "GT", "HOWINCLUDE", 
		"HOWINTERSECT", "HOWMEET", "ID", "IF_ERROR", "IF_FAILS", "INCLUDED", "INPUT", 
		"INRANGE", "INT", "INTERSECT", "INTERSECTION", "INTO", "ISNOTNULL", "ISNULL", 
		"JOIN", "KEEP", "KEEPING", "KNOWN", "LAST", "LB", "LBR", "LE", "LEFT", 
		"LEN", "LETTER", "LOOKUP", "LP", "LT", "MATCHING", "MEET", "MEMBERSHIP_OF", 
		"MERGE", "MIN_SIMILARITY", "MUL", "NEQ", "NOT", "OF", "ON", "OR", "ORDER", 
		"ORIENTATION", "OTHERS", "PARAMETERS", "PARTITION", "POINT", "POLYLINE", 
		"PRECONDITION", "QUOTE", "QUOTED_VALUE", "RB", "RBR", "REMOVE", "RESOLVING", 
		"RIGHT", "RP", "SAVE", "SC", "SCAN_ERROR", "SERVER", "SET", "SETS", "SETTING", 
		"SUB", "SUBTRACT", "THRESHOLD", "TILDE", "TO", "TO_POLYLINE", "TRAJECTORY", 
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
	public static final int AREA=13;
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
	public static final int COLLECTION=25;
	public static final int COLLECTIONS=26;
	public static final int COLON=27;
	public static final int COMMA=28;
	public static final int COMMENT=29;
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
	public static final int DOCUMENTS=41;
	public static final int DOT=42;
	public static final int DROP=43;
	public static final int DROPPING=44;
	public static final int DUPLICATES=45;
	public static final int EACH=46;
	public static final int END_BODY=47;
	public static final int EQ=48;
	public static final int EVALUATE=49;
	public static final int EXPAND=50;
	public static final int FIELD=51;
	public static final int FIELDS=52;
	public static final int FIELD_NAME=53;
	public static final int FILTER=54;
	public static final int FIRST=55;
	public static final int FLOAT=56;
	public static final int FOR=57;
	public static final int FROM=58;
	public static final int FUZZY=59;
	public static final int GE=60;
	public static final int GENERATE=61;
	public static final int GEOMETRY=62;
	public static final int GET=63;
	public static final int GROUP=64;
	public static final int GROUPING=65;
	public static final int GT=66;
	public static final int HOWINCLUDE=67;
	public static final int HOWINTERSECT=68;
	public static final int HOWMEET=69;
	public static final int ID=70;
	public static final int IF_ERROR=71;
	public static final int IF_FAILS=72;
	public static final int INCLUDED=73;
	public static final int INPUT=74;
	public static final int INRANGE=75;
	public static final int INT=76;
	public static final int INTERSECT=77;
	public static final int INTERSECTION=78;
	public static final int INTO=79;
	public static final int ISNOTNULL=80;
	public static final int ISNULL=81;
	public static final int JOIN=82;
	public static final int KEEP=83;
	public static final int KEEPING=84;
	public static final int KNOWN=85;
	public static final int LAST=86;
	public static final int LB=87;
	public static final int LBR=88;
	public static final int LE=89;
	public static final int LEFT=90;
	public static final int LEN=91;
	public static final int LETTER=92;
	public static final int LOOKUP=93;
	public static final int LP=94;
	public static final int LT=95;
	public static final int MATCHING=96;
	public static final int MEET=97;
	public static final int MEMBERSHIP_OF=98;
	public static final int MERGE=99;
	public static final int MIN_SIMILARITY=100;
	public static final int MUL=101;
	public static final int NEQ=102;
	public static final int NOT=103;
	public static final int OF=104;
	public static final int ON=105;
	public static final int OR=106;
	public static final int ORDER=107;
	public static final int ORIENTATION=108;
	public static final int OTHERS=109;
	public static final int PARAMETERS=110;
	public static final int PARTITION=111;
	public static final int POINT=112;
	public static final int POLYLINE=113;
	public static final int PRECONDITION=114;
	public static final int QUOTE=115;
	public static final int QUOTED_VALUE=116;
	public static final int RB=117;
	public static final int RBR=118;
	public static final int REMOVE=119;
	public static final int RESOLVING=120;
	public static final int RIGHT=121;
	public static final int RP=122;
	public static final int SAVE=123;
	public static final int SC=124;
	public static final int SCAN_ERROR=125;
	public static final int SERVER=126;
	public static final int SET=127;
	public static final int SETS=128;
	public static final int SETTING=129;
	public static final int SUB=130;
	public static final int SUBTRACT=131;
	public static final int THRESHOLD=132;
	public static final int TILDE=133;
	public static final int TO=134;
	public static final int TO_POLYLINE=135;
	public static final int TRAJECTORY=136;
	public static final int TRANSLATE=137;
	public static final int TYPE=138;
	public static final int UNCOMPARABLE=139;
	public static final int UNKNOWN=140;
	public static final int UNPACK=141;
	public static final int USE=142;
	public static final int USING=143;
	public static final int VERSUS=144;
	public static final int WEB=145;
	public static final int WHERE=146;
	public static final int WHITE_SPACES=147;
	public static final int WITH=148;
	public static final int WITHIN=149;
	public static final int WITHOUT=150;
	public static final int WRT=151;
	public static final int WS=152;
	public static final int XXX=153;

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
	    



	// $ANTLR start "start"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:84:1: start : ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | test )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:3: ( ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | test )* EOF )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | test )* EOF
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:85:5: ( getCollectionRule | saveAsRule | joinOfCollectionsRule | filterRule | groupRule | expandRule | mergeCollectionsRule | intersectCollectionsRule | subtractCollectionsRule | useDbRule | trajectoryMatchingRule | createFuzzyOperatorRule | createJavaScriptFunctionRule | getDictionaryRule | lookupFromWebRule | test )*
			loop1:
			while (true) {
				int alt1=17;
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
				case XXX:
					{
					alt1=16;
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:100:7: test
					{
					pushFollow(FOLLOW_test_in_start356);
					test();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start387); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:105:1: test : XXX SC ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:105:5: ( XXX SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:105:7: XXX SC
			{
			match(input,XXX,FOLLOW_XXX_in_test398); 
			match(input,SC,FOLLOW_SC_in_test400); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:110:1: collectionReferenceRule returns [DbCollection cr] : name= ID ( AT db= ID )? ( AS alias= ID )? ;
	public final DbCollection collectionReferenceRule() throws RecognitionException {
		DbCollection cr = null;


		Token name=null;
		Token db=null;
		Token alias=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:111:3: (name= ID ( AT db= ID )? ( AS alias= ID )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:112:5: name= ID ( AT db= ID )? ( AS alias= ID )?
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule424); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:113:5: ( AT db= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:113:7: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_collectionReferenceRule434); 
					db=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule438); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:5: ( AS alias= ID )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:114:7: AS alias= ID
					{
					match(input,AS,FOLLOW_AS_in_collectionReferenceRule451); 
					alias=(Token)match(input,ID,FOLLOW_ID_in_collectionReferenceRule455); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:119:1: fieldRefRule returns [Field field] : (fd= FIELD_NAME )+ ;
	public final Field fieldRefRule() throws RecognitionException {
		Field field = null;


		Token fd=null;

			field = new Field (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:121:3: ( (fd= FIELD_NAME )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:5: (fd= FIELD_NAME )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:5: (fd= FIELD_NAME )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:122:7: fd= FIELD_NAME
					{
					fd=(Token)match(input,FIELD_NAME,FOLLOW_FIELD_NAME_in_fieldRefRule502); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:126:1: buildActionRule returns [BuildAction ga] : BUILD os= objectStructureRule[true] ;
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:128:3: ( BUILD os= objectStructureRule[true] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:129:5: BUILD os= objectStructureRule[true]
			{
			match(input,BUILD,FOLLOW_BUILD_in_buildActionRule542); 
			pushFollow(FOLLOW_objectStructureRule_in_buildActionRule560);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:135:1: objectStructureRule[boolean generateActionCaller] returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule(boolean generateActionCaller) throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:136:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:137:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule596); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule607);
			ofs=outputFieldSpecRule();
			state._fsp--;

			 obj = new ObjectStructure (ofs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:139:8: (t= COMMA ofs= outputFieldSpecRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:139:10: t= COMMA ofs= outputFieldSpecRule
					{
					t=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectStructureRule628); 
					pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule632);
					ofs=outputFieldSpecRule();
					state._fsp--;

					 env.addOutputFieldSpec (obj, ofs, generateActionCaller, t); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_objectStructureRule648); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:145:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:146:3: (fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:147:5: fr= fieldRefRule ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule673);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:5: ( COLON (os= objectStructureRule[false] |f= factorRule ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:7: COLON (os= objectStructureRule[false] |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule687); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:13: (os= objectStructureRule[false] |f= factorRule )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:15: os= objectStructureRule[false]
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule693);
							os=objectStructureRule(false);
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:11: f= factorRule
							{
							pushFollow(FOLLOW_factorRule_in_outputFieldSpecRule732);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:156:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | DROPPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:3: ( KEEPING GEOMETRY | DROPPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
			int alt9=3;
			switch ( input.LA(1) ) {
			case KEEPING:
				{
				alt9=1;
				}
				break;
			case DROPPING:
				{
				alt9=2;
				}
				break;
			case SETTING:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:159:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule822); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule824); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:160:6: DROPPING GEOMETRY
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_geometricOptionRule856); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule858); 
					 geo.setDropping (); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:161:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule890); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule892); 
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
							match(input,POINT,FOLLOW_POINT_in_geometricOptionRule910); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule912); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule916);
							lat=fieldRefRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_geometricOptionRule918); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule922);
							lon=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule924); 
							 geo.setPoint (lat, lon); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:163:16: AGGREGATE LP afr= fieldRefRule RP
							{
							match(input,AGGREGATE,FOLLOW_AGGREGATE_in_geometricOptionRule944); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule946); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule950);
							afr=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule952); 
							 geo.setAggregate (afr); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:164:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule984);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:165:16: TO_POLYLINE LP f= fieldRefRule RP
							{
							match(input,TO_POLYLINE,FOLLOW_TO_POLYLINE_in_geometricOptionRule1022); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1024); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1028);
							f=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1030); 
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



	// $ANTLR start "caseClauseRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:170:1: caseClauseRule returns [CaseClause cc] : CASE (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:171:3: ( CASE (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:172:5: CASE (wc= whereCaseRule )+ (oth= othersRule )?
			{
			match(input,CASE,FOLLOW_CASE_in_caseClauseRule1082); 
			 cc = new CaseClause (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:173:8: (wc= whereCaseRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:173:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1109);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:174:8: (oth= othersRule )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DROP||LA11_0==KEEP) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:174:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1138);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:179:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:6: (ot= KEEP |ot= DROP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1181); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:180:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1187); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1198); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:186:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:187:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:188:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1223); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1234);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:190:7: (gs= generateSectionRule[true] )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==GENERATE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:190:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1252);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:196:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:197:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:198:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1289); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:7: (go= geometricOptionRule )?
			int alt14=2;
			switch ( input.LA(1) ) {
				case KEEPING:
					{
					int LA14_1 = input.LA(2);
					if ( (LA14_1==GEOMETRY) ) {
						alt14=1;
					}
					}
					break;
				case DROPPING:
					{
					int LA14_2 = input.LA(2);
					if ( (LA14_2==GEOMETRY) ) {
						alt14=1;
					}
					}
					break;
				case SETTING:
					{
					alt14=1;
					}
					break;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:199:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1306);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:200:4: (cf= checkForFuzzySetRule[gs] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHECK_FOR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:200:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1323);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:201:4: (ac= alphaCutRule[gs] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ALPHACUT) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:201:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1354);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:202:7: (ga= buildActionRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BUILD) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:202:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1392);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:203:4: (df= keepDropFuzzySetsRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DEFUZZIFY||LA18_0==DROPPING||LA18_0==KEEPING) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:203:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1412);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:211:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:212:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:213:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1470);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:214:4: ( OR c2= andConditionRule )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==OR) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:214:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1485); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1489);
					c2=andConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop19;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:220:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:221:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1546);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:5: ( AND c2= notConditionRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==AND) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:222:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1562); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1566);
					c2=notConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop20;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:227:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:228:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:229:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:229:5: (not= NOT )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==NOT) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:229:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1628); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1640);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:236:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:237:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
			int alt23=5;
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
				alt23=1;
				}
				break;
			case FIELD:
				{
				alt23=2;
				}
				break;
			case WITH:
				{
				alt23=3;
				}
				break;
			case WITHOUT:
				{
				alt23=4;
				}
				break;
			case KNOWN:
			case UNKNOWN:
			case WITHIN:
				{
				alt23=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:238:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1684);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:239:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					int alt22=3;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EQ||LA22_0==GE||LA22_0==GT||LA22_0==LE||LA22_0==LT||LA22_0==NEQ) ) {
						alt22=1;
					}
					else if ( (LA22_0==INRANGE) ) {
						alt22=2;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:239:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule1712);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:240:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule1741);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:241:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule1773);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:242:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule1796);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:243:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule1822);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:244:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule1842);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:250:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule1878);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule1887);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:255:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:256:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:257:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule1916); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:257:11: (lp= LB |lp= LP )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LB) ) {
				alt24=1;
			}
			else if ( (LA24_0==LP) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:257:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule1922); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:257:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule1928); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule1938);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule1940); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule1944);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:3: (rp= RP |rp= RB )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==RP) ) {
				alt25=1;
			}
			else if ( (LA25_0==RB) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule1953); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:259:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule1959); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:263:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:264:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule1998); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2002);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:26: (n= ISNULL |n= ISNOTNULL )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ISNULL) ) {
				alt26=1;
			}
			else if ( (LA26_0==ISNOTNULL) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2008); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:265:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2014); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
			int alt27=3;
			switch ( input.LA(1) ) {
			case WITHIN:
				{
				alt27=1;
				}
				break;
			case KNOWN:
				{
				alt27=2;
				}
				break;
			case UNKNOWN:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2088); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2094); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:271:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2100); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2121); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2123); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2127); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:273:7: ( COMMA fs= ID )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==COMMA) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:273:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2157); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2161); 
					 env.addFuzzySet (wuk, fs); 
					}
					break;

				default :
					break loop28;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:280:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:281:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2214); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2225);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:7: ( COMMA fr= fieldRefRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMMA) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2243); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2247);
					fr=fieldRefRule();
					state._fsp--;

					 wp.addField (fr); 
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
		return wp;
	}
	// $ANTLR end "withoutPredicateRule"



	// $ANTLR start "withPredicateRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:288:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:290:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:291:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2285); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ARRAY||LA31_0==GEOMETRY||LA31_0==ID) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					int alt30=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt30=1;
						}
						break;
					case ARRAY:
						{
						alt30=2;
						}
						break;
					case GEOMETRY:
						{
						alt30=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}
					switch (alt30) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2300); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2306); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:292:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2312); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2333);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:294:6: ( COMMA fr= fieldRefRule )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==COMMA) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:294:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2356); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2360);
					fr=fieldRefRule();
					state._fsp--;

					 wp.addField (fr); 
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
		return wp;
	}
	// $ANTLR end "withPredicateRule"



	// $ANTLR start "expressionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:301:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==APEX_VALUE||LA34_0==ARRAY_FUNCTION||LA34_0==BOOLEAN||LA34_0==FIELD_NAME||LA34_0==FLOAT||(LA34_0 >= ID && LA34_0 <= IF_ERROR)||LA34_0==INT||LA34_0==LP||LA34_0==MEMBERSHIP_OF||LA34_0==QUOTED_VALUE||LA34_0==TRANSLATE) ) {
				alt34=1;
			}
			else if ( (LA34_0==ADD||LA34_0==SUB) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:302:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2406);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:6: (s= ADD |s= SUB )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ADD) ) {
						alt33=1;
					}
					else if ( (LA33_0==SUB) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2429); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:303:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2435); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2440);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ADD||LA36_0==SUB) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2458); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2464); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2469);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
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
		return expr;
	}
	// $ANTLR end "expressionRule"



	// $ANTLR start "termRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:310:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:311:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2507);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==DIV||LA38_0==MUL) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:7: (s= MUL |s= DIV )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==MUL) ) {
						alt37=1;
					}
					else if ( (LA37_0==DIV) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2530); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:312:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2536); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2541);
					f=factorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
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
		return et;
	}
	// $ANTLR end "termRule"



	// $ANTLR start "factorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:316:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor factorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Condition op =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:3: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
			int alt40=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt40=1;
				}
				break;
			case FIELD_NAME:
				{
				alt40=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt40=3;
				}
				break;
			case ID:
				{
				alt40=4;
				}
				break;
			case ARRAY_FUNCTION:
			case IF_ERROR:
			case MEMBERSHIP_OF:
			case TRANSLATE:
				{
				alt40=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:318:5: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2575); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2579);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2581); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:319:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2602);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:320:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2626);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2651); 
					match(input,LP,FOLLOW_LP_in_factorRule2653); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:14: (fp= functionParamsRule )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==ADD||LA39_0==APEX_VALUE||LA39_0==ARRAY_FUNCTION||LA39_0==BOOLEAN||LA39_0==FIELD_NAME||LA39_0==FLOAT||(LA39_0 >= ID && LA39_0 <= IF_ERROR)||LA39_0==INT||LA39_0==LP||LA39_0==MEMBERSHIP_OF||LA39_0==QUOTED_VALUE||LA39_0==SUB||LA39_0==TRANSLATE) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2658);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2662); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2677);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token a=null;
		Token q=null;
		Token b=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:3: (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN )
			int alt41=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt41=1;
				}
				break;
			case FLOAT:
				{
				alt41=2;
				}
				break;
			case APEX_VALUE:
				{
				alt41=3;
				}
				break;
			case QUOTED_VALUE:
				{
				alt41=4;
				}
				break;
			case BOOLEAN:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:328:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule2714); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:329:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule2734); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:330:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule2753); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule2767); 
					 vl = new Value (Value.QUOTED, q.getText());	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule2779); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:2: (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
			int alt45=4;
			switch ( input.LA(1) ) {
			case MEMBERSHIP_OF:
				{
				alt45=1;
				}
				break;
			case IF_ERROR:
				{
				alt45=2;
				}
				break;
			case TRANSLATE:
				{
				alt45=3;
				}
				break;
			case ARRAY_FUNCTION:
				{
				alt45=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:338:4: f= MEMBERSHIP_OF LP mo= ID RP
					{
					f=(Token)match(input,MEMBERSHIP_OF,FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2809); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2811); 
					mo=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2815); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule2817); 
						expr = env.buildMembershipOf (mo); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:339:5: f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					f=(Token)match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule2849); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2853); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2857);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2859); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule2863);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule2865); 
						expr = env.buildIfError (e, v); 	
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:340:5: f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					f=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule2877); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2881); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2885);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2887); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2891); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:15: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==COMMA) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:17: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2910); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule2914); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:16: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt43=2;
							int LA43_0 = input.LA(1);
							if ( (LA43_0==COMMA) ) {
								alt43=1;
							}
							switch (alt43) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:18: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2934); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:24: (d= APEX_VALUE |d= QUOTED_VALUE )
									int alt42=2;
									int LA42_0 = input.LA(1);
									if ( (LA42_0==APEX_VALUE) ) {
										alt42=1;
									}
									else if ( (LA42_0==QUOTED_VALUE) ) {
										alt42=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 42, 0, input);
										throw nvae;
									}

									switch (alt42) {
										case 1 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:25: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule2939); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:40: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule2945); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule2954); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:343:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule2966);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3016); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3056); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:350:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==FIELD_NAME) ) {
				alt47=1;
			}
			else if ( (LA47_0==LB) ) {
				alt47=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:350:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3085);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:351:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule3106); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3110);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:5: ( COMMA e= restrictedExpressionRule )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==COMMA) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3125); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3129);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop46;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule3153); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3161); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule3165); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==COMMA) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3193); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==FIELD_NAME) ) {
						alt50=1;
					}
					else if ( (LA50_0==DOCUMENTS) ) {
						alt50=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3199);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:9: ( COMMA fx= fieldRefRule )*
							loop48:
							while (true) {
								int alt48=2;
								int LA48_0 = input.LA(1);
								if ( (LA48_0==COMMA) ) {
									alt48=1;
								}

								switch (alt48) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3221); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3225);
									fx=fieldRefRule();
									state._fsp--;

										af.addSearchingField (fx); 	
									}
									break;

								default :
									break loop48;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:358:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule3257); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3280); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3284);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:360:9: ( COMMA fx= fieldRefRule )*
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( (LA49_0==COMMA) ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:360:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3303); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3307);
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

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule3345); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:373:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:375:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:376:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:376:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==APEX_VALUE||LA53_0==ARRAY_FUNCTION||LA53_0==BOOLEAN||LA53_0==FIELD_NAME||LA53_0==FLOAT||(LA53_0 >= ID && LA53_0 <= IF_ERROR)||LA53_0==INT||LA53_0==LP||LA53_0==MEMBERSHIP_OF||LA53_0==QUOTED_VALUE||LA53_0==TRANSLATE) ) {
				alt53=1;
			}
			else if ( (LA53_0==ADD||LA53_0==SUB) ) {
				alt53=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:376:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3380);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:377:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:377:5: (s= ADD |s= SUB )
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==ADD) ) {
						alt52=1;
					}
					else if ( (LA52_0==SUB) ) {
						alt52=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);
						throw nvae;
					}

					switch (alt52) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:377:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3403); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:377:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3409); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3414);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:378:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==ADD||LA55_0==SUB) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:378:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:378:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:378:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3432); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:378:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3438); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3443);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop55;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:384:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:385:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3481);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==DIV||LA57_0==MUL) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:7: (s= MUL |s= DIV )
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==MUL) ) {
						alt56=1;
					}
					else if ( (LA56_0==DIV) ) {
						alt56=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 56, 0, input);
						throw nvae;
					}

					switch (alt56) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule3504); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:386:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule3510); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3515);
					f=restrictedFactorRule();
					state._fsp--;

					 et.addFactor(f, s.getText());
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
		return et;
	}
	// $ANTLR end "restrictedTermRule"



	// $ANTLR start "restrictedFactorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor restrictedFactorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression ex =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
			int alt59=5;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt59=1;
				}
				break;
			case FIELD_NAME:
				{
				alt59=2;
				}
				break;
			case APEX_VALUE:
			case BOOLEAN:
			case FLOAT:
			case INT:
			case QUOTED_VALUE:
				{
				alt59=3;
				}
				break;
			case ID:
				{
				alt59=4;
				}
				break;
			case ARRAY_FUNCTION:
			case IF_ERROR:
			case MEMBERSHIP_OF:
			case TRANSLATE:
				{
				alt59=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:392:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3549); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3553);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3555); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:393:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule3570);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:394:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule3594);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule3619); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3621); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:14: (fp= functionParamsRule )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==ADD||LA58_0==APEX_VALUE||LA58_0==ARRAY_FUNCTION||LA58_0==BOOLEAN||LA58_0==FIELD_NAME||LA58_0==FLOAT||(LA58_0 >= ID && LA58_0 <= IF_ERROR)||LA58_0==INT||LA58_0==LP||LA58_0==MEMBERSHIP_OF||LA58_0==QUOTED_VALUE||LA58_0==SUB||LA58_0==TRANSLATE) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule3626);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3630); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:396:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule3647);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:400:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:402:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:403:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3690);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:6: ( COMMA e= restrictedExpressionRule )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==COMMA) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:404:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule3708); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3712);
					e=restrictedExpressionRule();
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop60;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:412:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:413:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			int alt61=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt61=1;
				}
				break;
			case NEQ:
				{
				alt61=2;
				}
				break;
			case LT:
				{
				alt61=3;
				}
				break;
			case GT:
				{
				alt61=4;
				}
				break;
			case LE:
				{
				alt61=5;
				}
				break;
			case GE:
				{
				alt61=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:414:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule3756); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:415:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule3766); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:416:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule3776); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:417:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule3786); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:418:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule3796); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:419:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule3806); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:426:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:427:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:4: (s= ADD |s= SUB )?
			int alt62=3;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==ADD) ) {
				alt62=1;
			}
			else if ( (LA62_0==SUB) ) {
				alt62=2;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule3846); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:428:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule3852); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:4: (n= FLOAT |n= INT )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==FLOAT) ) {
				alt63=1;
			}
			else if ( (LA63_0==INT) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule3865); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:429:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule3871); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:435:2: ( CHECK_FOR FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:436:3: CHECK_FOR FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule3898); 
			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule3900); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule3902); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule3906); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule3908); 
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3912);
			fe=usingOrConditionRule();
			state._fsp--;

			 env.addCheckForFuzzySet (gs, fs, fe); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:437:4: ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==COMMA) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:437:6: COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule3927); 
					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule3929); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule3931); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule3935); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule3937); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3941);
					fe=usingOrConditionRule();
					state._fsp--;

					 env.addCheckForFuzzySet (gs, fs, fe); 
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
	}
	// $ANTLR end "checkForFuzzySetRule"



	// $ANTLR start "usingOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:440:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:441:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule3976);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:4: ( OR c2= usingAndConditionRule )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==OR) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:443:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule3991); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule3995);
					c2=usingAndConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop65;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:449:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:450:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4052);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:5: ( AND c2= usingNotConditionRule )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==AND) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:451:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule4068); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4072);
					c2=usingNotConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop66;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:456:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:457:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:5: (not= NOT )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==NOT) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:458:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule4134); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule4146);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:464:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:465:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
			int alt70=3;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt70=1;
				}
				break;
			case ID:
				{
				alt70=2;
				}
				break;
			case IF_FAILS:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:466:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4178); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4182);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule4184); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule4202); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:9: ( LP (fp= functionParamsRule )? RP )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==LP) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule4205); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:13: (fp= functionParamsRule )?
							int alt68=2;
							int LA68_0 = input.LA(1);
							if ( (LA68_0==ADD||LA68_0==APEX_VALUE||LA68_0==ARRAY_FUNCTION||LA68_0==BOOLEAN||LA68_0==FIELD_NAME||LA68_0==FLOAT||(LA68_0 >= ID && LA68_0 <= IF_ERROR)||LA68_0==INT||LA68_0==LP||LA68_0==MEMBERSHIP_OF||LA68_0==QUOTED_VALUE||LA68_0==SUB||LA68_0==TRANSLATE) ) {
								alt68=1;
							}
							switch (alt68) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:467:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule4210);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule4214); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:468:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule4235); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4237); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4245);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule4247); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule4251);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule4259); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:474:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:475:2: ( ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:476:3: ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule4275); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule4280);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule4282); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4286); 
				env.addAlphaCut (gs, n, on); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:4: ( COMMA n= numericRule ON on= ID )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==COMMA) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:477:6: COMMA n= numericRule ON on= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule4298); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule4302);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule4304); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4308); 
					 env.addAlphaCut (gs, n, on); 
					}
					break;

				default :
					break loop71;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:486:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:488:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
			int alt74=5;
			switch ( input.LA(1) ) {
			case DEFUZZIFY:
				{
				alt74=1;
				}
				break;
			case DROPPING:
				{
				int LA74_2 = input.LA(2);
				if ( (LA74_2==ALL) ) {
					alt74=2;
				}
				else if ( (LA74_2==FUZZY) ) {
					alt74=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KEEPING:
				{
				int LA74_3 = input.LA(2);
				if ( (LA74_3==ALL) ) {
					alt74=3;
				}
				else if ( (LA74_3==FUZZY) ) {
					alt74=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:489:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4346); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:490:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4365); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4367); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4369); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4371); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:491:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4383); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4385); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4387); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4389); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:492:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4402); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4404); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4406); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4410); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:5: ( COMMA fs= ID )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==COMMA) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4424); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4428); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop72;
						}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:494:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4453); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4455); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4457); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4461); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:495:5: ( COMMA fs= ID )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==COMMA) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:495:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4476); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4480); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop73;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:500:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:501:2: ( ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:502:3: ADD_ST FIELDS LBR f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )* RBR
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule4521); 
			match(input,FIELDS,FOLLOW_FIELDS_in_addFieldsRule4523); 
			match(input,LBR,FOLLOW_LBR_in_addFieldsRule4550); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4558);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule4560); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4564);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:505:5: ( COMMA f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==COMMA) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:505:7: COMMA f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule4583); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4587);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule4589); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4593);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop75;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_addFieldsRule4611); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:510:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:511:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==AREA||LA76_0==DISTANCE||LA76_0==INCLUDED||LA76_0==INTERSECT||LA76_0==LEN||LA76_0==MEET||LA76_0==ORIENTATION) ) {
				alt76=1;
			}
			else if ( (LA76_0==APEX_VALUE||LA76_0==ARRAY_FUNCTION||LA76_0==BOOLEAN||LA76_0==FIELD_NAME||LA76_0==FLOAT||(LA76_0 >= ID && LA76_0 <= IF_ERROR)||LA76_0==INT||LA76_0==LP||LA76_0==MEMBERSHIP_OF||LA76_0==QUOTED_VALUE||LA76_0==TRANSLATE) ) {
				alt76=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:512:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule4634);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule4649);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:520:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | LEN LP u= ID RP (cp= comparatorRule n= numericRule )? | AREA LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:522:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | LEN LP u= ID RP (cp= comparatorRule n= numericRule )? | AREA LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
			int alt83=7;
			switch ( input.LA(1) ) {
			case DISTANCE:
				{
				alt83=1;
				}
				break;
			case LEN:
				{
				alt83=2;
				}
				break;
			case AREA:
				{
				alt83=3;
				}
				break;
			case ORIENTATION:
				{
				alt83=4;
				}
				break;
			case INCLUDED:
				{
				alt83=5;
				}
				break;
			case MEET:
				{
				alt83=6;
				}
				break;
			case INTERSECT:
				{
				alt83=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule4688); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4690); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4694); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4696); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:25: (cp= comparatorRule n= numericRule )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==EQ||LA77_0==GE||LA77_0==GT||LA77_0==LE||LA77_0==LT||LA77_0==NEQ) ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule4702);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4706);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:6: LEN LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,LEN,FOLLOW_LEN_in_spatialFunctionRule4730); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4732); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4736); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4738); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:21: (cp= comparatorRule n= numericRule )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==EQ||LA78_0==GE||LA78_0==GT||LA78_0==LE||LA78_0==LT||LA78_0==NEQ) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:524:23: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule4744);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4748);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setLength (sf, u, cp, n, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:6: AREA LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,AREA,FOLLOW_AREA_in_spatialFunctionRule4774); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4776); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4780); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4782); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:22: (cp= comparatorRule n= numericRule )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==EQ||LA79_0==GE||LA79_0==GT||LA79_0==LE||LA79_0==LT||LA79_0==NEQ) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:24: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule4788);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4792);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setArea (sf, u, cp, n, joinCaller);  
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule4818); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4820); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:21: (f= LEFT |f= RIGHT )
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==LEFT) ) {
						alt80=1;
					}
					else if ( (LA80_0==RIGHT) ) {
						alt80=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 80, 0, input);
						throw nvae;
					}

					switch (alt80) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule4826); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule4832); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:42: ( COMMA o= ID COLON d= numericRule )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==COMMA) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule4838); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4843); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule4845); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4849);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4854); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule4866); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4868); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:18: (i= LEFT |i= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule4874); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule4880); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4883); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule4915); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:529:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule4962); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:534:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:536:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule5025); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule5027); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule5029); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:538:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==KEEP) ) {
				alt88=1;
			}
			else if ( ((LA88_0 >= HOWINCLUDE && LA88_0 <= HOWMEET)||LA88_0==LEFT||LA88_0==RIGHT) ) {
				alt88=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:538:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule5037); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:539:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					int alt85=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt85=1;
						}
						break;
					case LEFT:
						{
						alt85=2;
						}
						break;
					case RIGHT:
						{
						alt85=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 85, 0, input);
						throw nvae;
					}
					switch (alt85) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:539:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule5074); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:540:7: ( resolvingRule[sfs] )?
							int alt84=2;
							int LA84_0 = input.LA(1);
							if ( (LA84_0==RESOLVING) ) {
								alt84=1;
							}
							switch (alt84) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:540:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5110);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule5128); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:542:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule5164); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:543:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5195);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:5: ( COMMA addFuzzySetRule[sfs] )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==COMMA) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule5204); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5206);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop86;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:5: ( resolvingRule[sfs] )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==RESOLVING) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5222);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:549:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:550:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule5249); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule5251); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:6: (t= AND |t= OR |t= FIRST |t= LAST )
			int alt89=4;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt89=1;
				}
				break;
			case OR:
				{
				alt89=2;
				}
				break;
			case FIRST:
				{
				alt89=3;
				}
				break;
			case LAST:
				{
				alt89=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule5263); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule5269); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule5275); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule5281); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:555:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
			int alt95=4;
			switch ( input.LA(1) ) {
			case LEFT:
			case RIGHT:
				{
				alt95=1;
				}
				break;
			case HOWINCLUDE:
				{
				alt95=2;
				}
				break;
			case HOWMEET:
				{
				alt95=3;
				}
				break;
			case HOWINTERSECT:
				{
				alt95=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:3: (s= LEFT |s= RIGHT )
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==LEFT) ) {
						alt90=1;
					}
					else if ( (LA90_0==RIGHT) ) {
						alt90=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 90, 0, input);
						throw nvae;
					}

					switch (alt90) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5313); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5319); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:4: ( ALL |fs= ID ( AS newFs= ID )? )
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==ALL) ) {
						alt92=1;
					}
					else if ( (LA92_0==ID) ) {
						alt92=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 92, 0, input);
						throw nvae;
					}

					switch (alt92) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule5330); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5366); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:12: ( AS newFs= ID )?
							int alt91=2;
							int LA91_0 = input.LA(1);
							if ( (LA91_0==AS) ) {
								alt91=1;
							}
							switch (alt91) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule5370); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5374); 
									}
									break;

							}

								sfs.add (s.getText(), fs.getText(), newFs.getText()); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule5405); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5409); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:22: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5415); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:561:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5421); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5425); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5427); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5431); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule5444); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5449); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:20: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5455); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5461); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5465); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5468); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5472); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule5495); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5498); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5500); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5513); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5517); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:570:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule5541); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule5543); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:6: (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==ID) ) {
				alt98=1;
			}
			else if ( (LA98_0==FROM) ) {
				alt98=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5555); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:16: ( AT db= ID )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==AT) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule5559); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5563); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:8: FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM,FOLLOW_FROM_in_getCollectionRule5594); 
					match(input,WEB,FOLLOW_WEB_in_getCollectionRule5596); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:17: (url= APEX_VALUE |url= QUOTED_VALUE )
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==APEX_VALUE) ) {
						alt97=1;
					}
					else if ( (LA97_0==QUOTED_VALUE) ) {
						alt97=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 97, 0, input);
						throw nvae;
					}

					switch (alt97) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule5601); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule5607); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule5620); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:579:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:580:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:581:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule5641); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule5643); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5654); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule5656); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5660); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule5662); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5666); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule5695); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:588:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:590:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule5714); 
			match(input,AS,FOLLOW_AS_in_saveAsRule5716); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5726); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:12: ( AT db= ID )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==AT) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule5730); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5734); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule5754); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:596:1: lookupFromWebRule : LOOKUP FROM WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:597:2: ( LOOKUP FROM WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:3: LOOKUP FROM WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule5770); 
			match(input,FROM,FOLLOW_FROM_in_lookupFromWebRule5772); 
			match(input,WEB,FOLLOW_WEB_in_lookupFromWebRule5774); 
				LookupFromWeb gfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:4: (fe= forEachRule )+
			int cnt100=0;
			loop100:
			while (true) {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==FOR) ) {
					alt100=1;
				}

				switch (alt100) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule5790);
					fe=forEachRule();
					state._fsp--;

						gfw.addForEach (fe);	
					}
					break;

				default :
					if ( cnt100 >= 1 ) break loop100;
					EarlyExitException eee = new EarlyExitException(100, input);
					throw eee;
				}
				cnt100++;
			}

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule5803); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:604:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule5823); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule5825); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule5829);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule5834); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule5838);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:611:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC ;
	public final void joinOfCollectionsRule() throws RecognitionException {
		Token tk=null;
		Token g=null;
		DbCollection c1 =null;
		DbCollection c2 =null;
		SpatialFunction nff =null;
		SetFuzzySets sfs =null;
		CaseClause cc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:612:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:613:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule5861); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule5863); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule5865); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5874);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule5878); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5882);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:615:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==ON) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:615:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule5894); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule5896); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule5900);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==SET) ) {
				int LA103_1 = input.LA(2);
				if ( (LA103_1==GEOMETRY) ) {
					alt103=1;
				}
			}
			switch (alt103) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule5932); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule5934); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					int alt102=4;
					switch ( input.LA(1) ) {
					case INTERSECTION:
						{
						alt102=1;
						}
						break;
					case RIGHT:
						{
						alt102=2;
						}
						break;
					case LEFT:
						{
						alt102=3;
						}
						break;
					case ALL:
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule5940); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule5946); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule5952); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule5958); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:7: ( addFieldsRule[jc] )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==ADD_ST) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule5978);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:618:7: (sfs= setFuzzySetsRule )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==SET) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:618:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6038);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:6: (cc= caseClauseRule )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==CASE) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule6080);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:7: ( REMOVE DUPLICATES )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==REMOVE) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule6129); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule6131); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule6172); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:625:1: filterRule : FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:626:3: ( FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:627:4: FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule6196); 
			pushFollow(FOLLOW_caseClauseRule_in_filterRule6208);
			fc=caseClauseRule();
			state._fsp--;

			 Filter f = env.addFilter (fc); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:7: ( REMOVE DUPLICATES )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==REMOVE) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:629:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule6226); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule6228); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule6250); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:634:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:635:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:636:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule6271); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:7: (p= groupPartitionRule )+
			int cnt109=0;
			loop109:
			while (true) {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==PARTITION) ) {
					alt109=1;
				}

				switch (alt109) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule6296);
					p=groupPartitionRule();
					state._fsp--;

					 g.addPartition (p); 
					}
					break;

				default :
					if ( cnt109 >= 1 ) break loop109;
					EarlyExitException eee = new EarlyExitException(109, input);
					throw eee;
				}
				cnt109++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:7: (oth= othersRule )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==DROP||LA110_0==KEEP) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule6322);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule6346); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:643:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:644:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule6369); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule6373);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule6386); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6390);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:647:10: ( COMMA fr= fieldRefRule )*
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==COMMA) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:647:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6415); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6419);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop111;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule6441); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6445);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:649:8: ( DROP GROUPING FIELDS )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==DROP) ) {
				int LA112_1 = input.LA(2);
				if ( (LA112_1==GROUPING) ) {
					alt112=1;
				}
			}
			switch (alt112) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:649:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule6466); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule6468); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule6470); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==ORDER) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule6492); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule6494); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6498);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:9: ( COMMA sf= sortingFieldRule )*
					loop113:
					while (true) {
						int alt113=2;
						int LA113_0 = input.LA(1);
						if ( (LA113_0==COMMA) ) {
							alt113=1;
						}

						switch (alt113) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6515); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6519);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop113;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:6: ( KEEP UNCOMPARABLE )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==KEEP) ) {
						int LA114_1 = input.LA(2);
						if ( (LA114_1==UNCOMPARABLE) ) {
							alt114=1;
						}
					}
					switch (alt114) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule6538); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule6540); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:654:7: (gs= generateSectionRule[false] )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==GENERATE) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:654:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule6571);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:658:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:659:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:660:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule6602);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule6606); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule6610); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:3: (v= VERSUS )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==VERSUS) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:662:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule6625); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:665:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule6654); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:7: (u= unpackRule )+
			int cnt118=0;
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==UNPACK) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule6678);
					u=unpackRule();
					state._fsp--;

					 e.addUnpack (u); 
					}
					break;

				default :
					if ( cnt118 >= 1 ) break loop118;
					EarlyExitException eee = new EarlyExitException(118, input);
					throw eee;
				}
				cnt118++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:669:7: (oth= othersRule )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==DROP||LA119_0==KEEP) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:669:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule6710);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule6734); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:674:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:675:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:676:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule6756); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule6761);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule6768); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule6772);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule6779); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule6783);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:682:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:6: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule6811); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule6813); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6827);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:9: ( COMMA cr= collectionReferenceRule )+
			int cnt120=0;
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==COMMA) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:686:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule6849); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6853);
					cr=collectionReferenceRule();
					state._fsp--;

					 mc.addCollection (cr); 
					}
					break;

				default :
					if ( cnt120 >= 1 ) break loop120;
					EarlyExitException eee = new EarlyExitException(120, input);
					throw eee;
				}
				cnt120++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:7: ( REMOVE DUPLICATES )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==REMOVE) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule6874); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule6876); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule6906); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:692:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:693:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:694:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule6926); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule6928); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6938);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule6940); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6944);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule6956); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:700:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:702:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule6978); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule6980); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6988);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule6990); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6994);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule7006); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:708:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:710:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:711:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule7033); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule7043); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:10: (d= ID |d= APEX_VALUE )
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==ID) ) {
				alt122=1;
			}
			else if ( (LA122_0==APEX_VALUE) ) {
				alt122=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}

			switch (alt122) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7048); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7054); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==AS) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule7078); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:13: (a= ID |a= APEX_VALUE )
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==ID) ) {
						alt123=1;
					}
					else if ( (LA123_0==APEX_VALUE) ) {
						alt123=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 123, 0, input);
						throw nvae;
					}

					switch (alt123) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7083); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7089); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop128:
			while (true) {
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==COMMA) ) {
					alt128=1;
				}

				switch (alt128) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule7170); 
					match(input,DB,FOLLOW_DB_in_useDbRule7172); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:20: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7177); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:716:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7183); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt127=2;
					int LA127_0 = input.LA(1);
					if ( (LA127_0==AS) ) {
						alt127=1;
					}
					switch (alt127) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule7206); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:21: (a= ID |a= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7211); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7217); 
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
					break loop128;
				}
			}

			match(input,ON,FOLLOW_ON_in_useDbRule7295); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==DEFAULT) ) {
				alt132=1;
			}
			else if ( (LA132_0==SERVER) ) {
				alt132=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:721:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule7307); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7309); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:722:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7321); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:723:10: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:723:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7336); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:723:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7342); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt131=2;
					int LA131_0 = input.LA(1);
					if ( (LA131_0==APEX_VALUE||LA131_0==ID) ) {
						alt131=1;
					}
					switch (alt131) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:12: (d= ID |d= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7366); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7372); 
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

			match(input,SC,FOLLOW_SC_in_useDbRule7397); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:730:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:731:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:732:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7422); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule7424); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7434);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule7436); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7440);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:734:7: (tp= trajectoryPartitionRule )+
			int cnt133=0;
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==PARTITION) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:734:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7456);
					tp=trajectoryPartitionRule();
					state._fsp--;

					 tm.addPartition (tp); 
					}
					break;

				default :
					if ( cnt133 >= 1 ) break loop133;
					EarlyExitException eee = new EarlyExitException(133, input);
					throw eee;
				}
				cnt133++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:7: (oth= othersRule )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==DROP||LA134_0==KEEP) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule7496);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule7538); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:740:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule7566); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule7576);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:744:6: (tpm= partitionMatchingRule )+
			int cnt135=0;
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==MATCHING) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:744:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7597);
					tpm=partitionMatchingRule();
					state._fsp--;

					 tp.addPartitionMatching (tpm);  
					}
					break;

				default :
					if ( cnt135 >= 1 ) break loop135;
					EarlyExitException eee = new EarlyExitException(135, input);
					throw eee;
				}
				cnt135++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:748:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule7634); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7638);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule7645); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7649);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule7656); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule7658); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule7662); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule7665); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule7669);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:753:6: ( WHERE wc= orConditionRule )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==WHERE) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:753:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule7684); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule7688);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule7712); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7716);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:755:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==ADDING) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:755:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule7739); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7743);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule7745); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule7747); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:6: ( MIN_SIMILARITY n= numericRule )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==MIN_SIMILARITY) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7769); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule7773);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:762:1: parameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:763:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule7821); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule7837); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule7841); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:769:1: createJavaScriptFunctionRule : CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:770:2: ( CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:771:3: CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE_JF,FOLLOW_CREATE_JF_in_createJavaScriptFunctionRule7866); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule7874); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule7907); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule7917);
			p=parameterRule(jsf.getParamList());
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:775:5: ( COMMA p= parameterRule[jsf.getParamList()] )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==COMMA) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:775:7: COMMA p= parameterRule[jsf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule7942); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule7946);
					p=parameterRule(jsf.getParamList());
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop139;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==PRECONDITION) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule7971); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule7975);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule7989); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule8002); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule8008); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:799:1: createFuzzyOperatorRule : CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )* RB SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:800:3: ( CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )* RB SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:801:4: CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )* RB SC
			{
			match(input,CREATE_FO,FOLLOW_CREATE_FO_in_createFuzzyOperatorRule8030); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule8034); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8063); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8073);
			p=parameterRule(fo.getParamList());
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:804:5: ( COMMA p= parameterRule[fo.getParamList()] )*
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==COMMA) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:804:7: COMMA p= parameterRule[fo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8098); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8102);
					p=parameterRule(fo.getParamList());
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop141;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==PRECONDITION) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8129); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8133);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule8147); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8151);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule8167); 
			match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule8170); 
			match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8181); 
			pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8185);
			x=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8187); 
			pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8191);
			y=numericRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8193); 
			 env.addFuzzyPolylinePoint (fo, x, y); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:809:10: ( COMMA LP x= numericRule COMMA y= numericRule RP )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==COMMA) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:809:12: COMMA LP x= numericRule COMMA y= numericRule RP
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8214); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8216); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8220);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8222); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8226);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8228); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					}
					break;

				default :
					break loop143;
				}
			}

			match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule8248); 
			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule8252); 
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



	// $ANTLR start "jfOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:816:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:817:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:818:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule8282);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:819:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop144:
			while (true) {
				int alt144=2;
				int LA144_0 = input.LA(1);
				if ( (LA144_0==OR) ) {
					alt144=1;
				}

				switch (alt144) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:819:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule8299); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule8303);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop144;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:825:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:826:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:827:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule8371);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:828:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop145:
			while (true) {
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==AND) ) {
					alt145=1;
				}

				switch (alt145) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:828:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule8389); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule8393);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop145;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:833:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:835:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:835:5: (not= NOT )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==NOT) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:835:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule8461); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule8472);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:841:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:842:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:843:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule8510);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:844:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt147=3;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==EQ||LA147_0==GE||LA147_0==GT||LA147_0==LE||LA147_0==LT||LA147_0==NEQ) ) {
				alt147=1;
			}
			else if ( (LA147_0==INRANGE) ) {
				alt147=2;
			}
			switch (alt147) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:844:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule8530);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:845:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule8550);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:849:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule8597);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule8606);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:856:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:858:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==APEX_VALUE||LA149_0==FLOAT||LA149_0==ID||LA149_0==INT||LA149_0==LP||LA149_0==QUOTED_VALUE) ) {
				alt149=1;
			}
			else if ( (LA149_0==ADD||LA149_0==SUB) ) {
				alt149=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}

			switch (alt149) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule8648);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:6: (s= ADD |s= SUB )
					int alt148=2;
					int LA148_0 = input.LA(1);
					if ( (LA148_0==ADD) ) {
						alt148=1;
					}
					else if ( (LA148_0==SUB) ) {
						alt148=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 148, 0, input);
						throw nvae;
					}

					switch (alt148) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule8671); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule8677); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule8682);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop151:
			while (true) {
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==ADD||LA151_0==SUB) ) {
					alt151=1;
				}

				switch (alt151) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:7: (s= ADD |s= SUB )
					int alt150=2;
					int LA150_0 = input.LA(1);
					if ( (LA150_0==ADD) ) {
						alt150=1;
					}
					else if ( (LA150_0==SUB) ) {
						alt150=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 150, 0, input);
						throw nvae;
					}

					switch (alt150) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule8700); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule8706); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule8711);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop151;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:865:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:867:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:868:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule8751);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==DIV||LA153_0==MUL) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:7: (s= MUL |s= DIV )
					int alt152=2;
					int LA152_0 = input.LA(1);
					if ( (LA152_0==MUL) ) {
						alt152=1;
					}
					else if ( (LA152_0==DIV) ) {
						alt152=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 152, 0, input);
						throw nvae;
					}

					switch (alt152) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule8776); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule8782); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule8787);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop153;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:873:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? );
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		ArrayList<Expression> fp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:3: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt156=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt156=1;
				}
				break;
			case INT:
				{
				alt156=2;
				}
				break;
			case FLOAT:
				{
				alt156=3;
				}
				break;
			case APEX_VALUE:
				{
				alt156=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt156=5;
				}
				break;
			case ID:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:5: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule8827); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule8831);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule8835); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule8855); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule8893); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule8930); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule8964); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:880:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule8997); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt155=2;
					int LA155_0 = input.LA(1);
					if ( (LA155_0==LP) ) {
						alt155=1;
					}
					switch (alt155) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:7: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule9036); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:13: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt154=2;
							int LA154_0 = input.LA(1);
							if ( (LA154_0==ADD||LA154_0==APEX_VALUE||LA154_0==FLOAT||LA154_0==ID||LA154_0==INT||LA154_0==LP||LA154_0==QUOTED_VALUE||LA154_0==SUB) ) {
								alt154=1;
							}
							switch (alt154) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:14: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule9041);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule9047); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:885:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:887:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:888:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9095);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:889:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==COMMA) ) {
					alt157=1;
				}

				switch (alt157) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:889:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule9115); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9119);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
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
		return params;
	}
	// $ANTLR end "jfFunctionParamsRule"

	// Delegated rules



	public static final BitSet FOLLOW_getCollectionRule_in_start62 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_saveAsRule_in_start83 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start111 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_filterRule_in_start128 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_groupRule_in_start156 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_expandRule_in_start185 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start213 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start231 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start245 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_useDbRule_in_start260 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start289 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start305 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start317 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start326 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start341 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_test_in_start356 = new BitSet(new long[]{0x80440000C0000000L,0x0800000820042001L,0x0000000002004108L});
	public static final BitSet FOLLOW_EOF_in_start387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test398 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_test400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule424 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule438 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule502 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule542 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule596 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule607 = new BitSet(new long[]{0x0000000010000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule628 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule632 = new BitSet(new long[]{0x0000000010000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule673 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule687 = new BitSet(new long[]{0x0120000000089000L,0x00100004410010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule822 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_geometricOptionRule856 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule890 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule892 = new BitSet(new long[]{0x0020000000000080L,0x0001000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule910 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule912 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule916 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule918 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule922 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule944 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule946 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule950 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1024 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1028 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1109 = new BitSet(new long[]{0x0000080000000002L,0x0000000000080000L,0x0000000000040000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1181 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_DROP_in_othersRule1187 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1223 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1234 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1289 = new BitSet(new long[]{0x0000100401100202L,0x0000000000100000L,0x0000000000000002L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1306 = new BitSet(new long[]{0x0000100401100202L,0x0000000000100000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1323 = new BitSet(new long[]{0x0000100400100202L,0x0000000000100000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1354 = new BitSet(new long[]{0x0000100400100002L,0x0000000000100000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1392 = new BitSet(new long[]{0x0000100400000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1470 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1485 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1489 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1546 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1562 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1566 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1628 = new BitSet(new long[]{0x0128000000089010L,0x00100004402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1684 = new BitSet(new long[]{0x1001000000000002L,0x0000004082000804L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule1741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule1773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule1878 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000040800000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule1922 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LP_in_inRangeRule1928 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule1938 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule1940 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule1944 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L});
	public static final BitSet FOLLOW_RP_in_inRangeRule1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule1959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule1998 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2088 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2094 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2100 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2127 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2161 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2214 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2225 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2243 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2247 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2285 = new BitSet(new long[]{0x4020000000004000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2300 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2306 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2312 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2333 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2356 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2360 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2406 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2429 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2435 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2440 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2458 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2464 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2469 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_factorRule_in_termRule2507 = new BitSet(new long[]{0x0000010000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2530 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_DIV_in_termRule2536 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_factorRule_in_termRule2541 = new BitSet(new long[]{0x0000010000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2575 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2579 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_factorRule2581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2651 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2653 = new BitSet(new long[]{0x0120000000089010L,0x04100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2658 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_factorRule2662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule2714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule2734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule2753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule2767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule2779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2809 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2815 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule2849 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2853 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2857 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2859 = new BitSet(new long[]{0x0100000000081000L,0x0010000000001000L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule2863 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule2877 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2881 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2885 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2891 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2910 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule2914 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2934 = new BitSet(new long[]{0x0000000000001000L,0x0010000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule2939 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule2945 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule2966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3056 = new BitSet(new long[]{0x0020000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3085 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule3106 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3110 = new BitSet(new long[]{0x0000000010000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3125 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3129 = new BitSet(new long[]{0x0000000010000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule3153 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule3165 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3193 = new BitSet(new long[]{0x0020020000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3199 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3221 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3225 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule3257 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3280 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3284 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3303 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3307 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule3345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3380 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3403 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3409 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3414 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3432 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3438 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3443 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3481 = new BitSet(new long[]{0x0000010000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule3504 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule3510 = new BitSet(new long[]{0x0120000000089000L,0x00100004400010C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3515 = new BitSet(new long[]{0x0000010000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3549 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3553 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule3570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule3594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule3619 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3621 = new BitSet(new long[]{0x0120000000089010L,0x04100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule3626 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule3647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3690 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule3708 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3712 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule3756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule3766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule3776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule3786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule3796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule3806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule3846 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SUB_in_numericRule3852 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule3865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule3871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule3898 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule3900 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule3902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule3906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule3908 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000140L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3912 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule3927 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule3929 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule3931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule3935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule3937 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000140L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3941 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule3976 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule3991 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000140L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule3995 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4052 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule4068 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000140L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4072 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000140L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule4146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4178 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000140L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4182 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule4202 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4205 = new BitSet(new long[]{0x0120000000089010L,0x04100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule4210 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule4235 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4237 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000140L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4245 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule4247 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule4251 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule4275 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4280 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4286 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule4298 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4302 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4308 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4365 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4367 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4383 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4385 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4402 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4410 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4428 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4453 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4461 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4480 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule4521 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_addFieldsRule4523 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LBR_in_addFieldsRule4550 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4558 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4560 = new BitSet(new long[]{0x012000800008B000L,0x00101006480032C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4564 = new BitSet(new long[]{0x0000000010000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule4583 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4587 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4589 = new BitSet(new long[]{0x012000800008B000L,0x00101006480032C0L,0x0000000000000200L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4593 = new BitSet(new long[]{0x0000000010000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RBR_in_addFieldsRule4611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule4634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule4649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule4688 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4694 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4696 = new BitSet(new long[]{0x1001000000000002L,0x0000004082000004L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule4702 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEN_in_spatialFunctionRule4730 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4736 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4738 = new BitSet(new long[]{0x1001000000000002L,0x0000004082000004L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule4744 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AREA_in_spatialFunctionRule4774 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4780 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4782 = new BitSet(new long[]{0x1001000000000002L,0x0000004082000004L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule4788 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule4818 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4820 = new BitSet(new long[]{0x0000000000000000L,0x0200000004000000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule4826 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule4832 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule4838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4843 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule4845 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4849 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule4866 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4868 = new BitSet(new long[]{0x0000000000000000L,0x0200000004000000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule4874 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule4880 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule4915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule4962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule5025 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule5027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule5029 = new BitSet(new long[]{0x0000000000000000L,0x0200000004080038L});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule5037 = new BitSet(new long[]{0x0000000000000100L,0x0200000004000000L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule5074 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule5128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule5164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5195 = new BitSet(new long[]{0x0000000010000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule5204 = new BitSet(new long[]{0x0000000000000000L,0x0200000004000038L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5206 = new BitSet(new long[]{0x0000000010000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule5249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule5251 = new BitSet(new long[]{0x0080000000000400L,0x0000040000400000L});
	public static final BitSet FOLLOW_AND_in_resolvingRule5263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule5269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule5275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule5281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5313 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5319 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule5330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5366 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule5405 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5409 = new BitSet(new long[]{0x0000000000000000L,0x0200000004000000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5415 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5421 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5425 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule5444 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5449 = new BitSet(new long[]{0x0000000000000000L,0x0200000004000000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5455 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5461 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5465 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5498 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5500 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule5541 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule5543 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5555 = new BitSet(new long[]{0x0000000000020000L,0x1000000000000000L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule5559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5563 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_FROM_in_getCollectionRule5594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_WEB_in_getCollectionRule5596 = new BitSet(new long[]{0x0000000000001000L,0x0010000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule5601 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule5607 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule5620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule5641 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule5643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5654 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule5656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5660 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5666 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule5695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule5714 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5726 = new BitSet(new long[]{0x0000000000020000L,0x1000000000000000L});
	public static final BitSet FOLLOW_AT_in_saveAsRule5730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5734 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_saveAsRule5754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule5770 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FROM_in_lookupFromWebRule5772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_WEB_in_lookupFromWebRule5774 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule5790 = new BitSet(new long[]{0x0200000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule5803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule5823 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule5825 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule5829 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule5834 = new BitSet(new long[]{0x0120000000089010L,0x00100004400010C0L,0x0000000000000204L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule5838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule5861 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule5863 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule5865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5874 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5882 = new BitSet(new long[]{0x0000000000800040L,0x9080020000000000L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule5894 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule5896 = new BitSet(new long[]{0x0000008000002000L,0x0000100208002200L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule5900 = new BitSet(new long[]{0x0000000000800040L,0x9080000000000000L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule5932 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule5934 = new BitSet(new long[]{0x0000000000000100L,0x0200000004004000L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule5940 = new BitSet(new long[]{0x0000000000800040L,0x9080000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule5946 = new BitSet(new long[]{0x0000000000800040L,0x9080000000000000L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule5952 = new BitSet(new long[]{0x0000000000800040L,0x9080000000000000L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule5958 = new BitSet(new long[]{0x0000000000800040L,0x9080000000000000L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule5978 = new BitSet(new long[]{0x0000000000800000L,0x9080000000000000L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule6038 = new BitSet(new long[]{0x0000000000800000L,0x1080000000000000L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule6080 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule6129 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule6131 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule6172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule6196 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule6208 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule6226 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule6228 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_filterRule6250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule6271 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule6296 = new BitSet(new long[]{0x0000080000000000L,0x1000800000080000L});
	public static final BitSet FOLLOW_othersRule_in_groupRule6322 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_groupRule6346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule6369 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule6373 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6386 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6390 = new BitSet(new long[]{0x0000000010000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6415 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6419 = new BitSet(new long[]{0x0000000010000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule6441 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6445 = new BitSet(new long[]{0x2000080000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule6466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule6468 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule6470 = new BitSet(new long[]{0x2000000000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule6492 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6494 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6498 = new BitSet(new long[]{0x2000000010000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6515 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6519 = new BitSet(new long[]{0x2000000010000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule6538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule6540 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule6571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule6602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule6606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule6610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule6625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule6654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule6678 = new BitSet(new long[]{0x0000080000000000L,0x1000000000080000L,0x0000000000002000L});
	public static final BitSet FOLLOW_othersRule_in_expandRule6710 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_expandRule6734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule6756 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule6761 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule6768 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule6772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_TO_in_unpackRule6779 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule6783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule6811 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule6813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6827 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule6849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6853 = new BitSet(new long[]{0x0000000010000000L,0x1080000000000000L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule6874 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule6876 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule6906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule6926 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule6928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6938 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule6940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6944 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule6956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule6978 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule6980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6988 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule6990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6994 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule7006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule7033 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7043 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_useDbRule7048 = new BitSet(new long[]{0x0000000010010000L,0x0000020000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7054 = new BitSet(new long[]{0x0000000010010000L,0x0000020000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7078 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_useDbRule7083 = new BitSet(new long[]{0x0000000010000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7089 = new BitSet(new long[]{0x0000000010000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule7170 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7172 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_useDbRule7177 = new BitSet(new long[]{0x0000000010010000L,0x0000020000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7183 = new BitSet(new long[]{0x0000000010010000L,0x0000020000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7206 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_useDbRule7211 = new BitSet(new long[]{0x0000000010000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7217 = new BitSet(new long[]{0x0000000010000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_ON_in_useDbRule7295 = new BitSet(new long[]{0x0000000200000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule7307 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7309 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7321 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_useDbRule7336 = new BitSet(new long[]{0x0000000000001000L,0x1000000000000040L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7342 = new BitSet(new long[]{0x0000000000001000L,0x1000000000000040L});
	public static final BitSet FOLLOW_ID_in_useDbRule7366 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7372 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_useDbRule7397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7422 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule7424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7434 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule7436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7440 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7456 = new BitSet(new long[]{0x0000080000000000L,0x1000800000080000L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule7496 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule7538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule7566 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule7576 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7597 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule7634 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule7645 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule7656 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule7658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule7662 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule7665 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule7669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule7684 = new BitSet(new long[]{0x0128000000089010L,0x00100084402010C0L,0x0000000000701204L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule7688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule7712 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7716 = new BitSet(new long[]{0x0000000000000022L,0x0000001000000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule7739 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule7745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule7747 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7769 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule7773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule7821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule7837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_parameterRule7841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_JF_in_createJavaScriptFunctionRule7866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule7874 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule7907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule7917 = new BitSet(new long[]{0x0000000010040000L,0x0004000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule7942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule7946 = new BitSet(new long[]{0x0000000010040000L,0x0004000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule7971 = new BitSet(new long[]{0x0100000000001010L,0x0010008040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule7975 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule7989 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule8002 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule8008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_FO_in_createFuzzyOperatorRule8030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule8034 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule8063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8073 = new BitSet(new long[]{0x0002000010000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8102 = new BitSet(new long[]{0x0002000010000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8129 = new BitSet(new long[]{0x0100000000001010L,0x0010008040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8133 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule8147 = new BitSet(new long[]{0x0100000000001010L,0x0010000040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8151 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule8167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule8170 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8181 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8185 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8187 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8191 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8193 = new BitSet(new long[]{0x0000000010000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8214 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8216 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8220 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8222 = new BitSet(new long[]{0x0100000000000010L,0x0000000000001000L,0x0000000000000004L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8226 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8228 = new BitSet(new long[]{0x0000000010000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule8248 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule8252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule8282 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule8299 = new BitSet(new long[]{0x0100000000001010L,0x0010008040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule8303 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule8371 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule8389 = new BitSet(new long[]{0x0100000000001010L,0x0010008040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule8393 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule8461 = new BitSet(new long[]{0x0100000000001010L,0x0010000040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule8472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule8510 = new BitSet(new long[]{0x1001000000000002L,0x0000004082000804L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule8530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule8550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule8597 = new BitSet(new long[]{0x0100000000001010L,0x0010000040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule8606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule8648 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule8671 = new BitSet(new long[]{0x0100000000001000L,0x0010000040001040L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule8677 = new BitSet(new long[]{0x0100000000001000L,0x0010000040001040L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule8682 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule8700 = new BitSet(new long[]{0x0100000000001000L,0x0010000040001040L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule8706 = new BitSet(new long[]{0x0100000000001000L,0x0010000040001040L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule8711 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule8751 = new BitSet(new long[]{0x0000010000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule8776 = new BitSet(new long[]{0x0100000000001000L,0x0010000040001040L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule8782 = new BitSet(new long[]{0x0100000000001000L,0x0010000040001040L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule8787 = new BitSet(new long[]{0x0000010000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule8827 = new BitSet(new long[]{0x0100000000001010L,0x0010008040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule8831 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule8835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule8855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule8893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule8930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule8964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule8997 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule9036 = new BitSet(new long[]{0x0100000000001010L,0x0410000040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule9041 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule9047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9095 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule9115 = new BitSet(new long[]{0x0100000000001010L,0x0010000040001040L,0x0000000000000004L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9119 = new BitSet(new long[]{0x0000000010000002L});
}
