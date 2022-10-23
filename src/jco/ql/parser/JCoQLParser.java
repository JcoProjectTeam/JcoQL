// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2022-10-14 00:13:25

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
		"COLLECTION", "COLLECTIONS", "COLON", "COMMA", "COMMENT", "CREATE_FO", 
		"CREATE_JF", "DB", "DEFAULT", "DEFUZZIFY", "DICTIONARY", "DIGIT", "DIGIT0", 
		"DIRECTION", "DISTANCE", "DIV", "DOCUMENTS", "DOT", "DROP", "DROPPING", 
		"DUPLICATES", "EACH", "END_BODY", "EQ", "EVALUATE", "EXPAND", "FIELD", 
		"FIELDS", "FIELD_NAME", "FILTER", "FIRST", "FLOAT", "FOR", "FROM", "FUZZY", 
		"GE", "GENERATE", "GEOMETRY", "GET", "GROUP", "GROUPING", "GT", "HOWINCLUDE", 
		"HOWINTERSECT", "HOWMEET", "ID", "IF_ERROR", "IF_FAILS", "INCLUDED", "INPUT", 
		"INRANGE", "INT", "INTERSECT", "INTERSECTION", "INTO", "ISNOTNULL", "ISNULL", 
		"JOIN", "KEEP", "KEEPING", "KNOWN", "LAST", "LB", "LBR", "LE", "LEFT", 
		"LETTER", "LOOKUP", "LP", "LT", "MATCHING", "MEET", "MEMBERSHIP_OF", "MERGE", 
		"MIN_SIMILARITY", "MUL", "NEQ", "NOT", "OF", "ON", "OR", "ORDER", "ORIENTATION", 
		"OTHERS", "PARAMETERS", "PARTITION", "POINT", "POLYLINE", "PRECONDITION", 
		"QUOTE", "QUOTED_VALUE", "RB", "RBR", "REMOVE", "RESOLVING", "RIGHT", 
		"RP", "SAVE", "SC", "SCAN_ERROR", "SERVER", "SET", "SETS", "SETTING", 
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
	public static final int CREATE_FO=29;
	public static final int CREATE_JF=30;
	public static final int DB=31;
	public static final int DEFAULT=32;
	public static final int DEFUZZIFY=33;
	public static final int DICTIONARY=34;
	public static final int DIGIT=35;
	public static final int DIGIT0=36;
	public static final int DIRECTION=37;
	public static final int DISTANCE=38;
	public static final int DIV=39;
	public static final int DOCUMENTS=40;
	public static final int DOT=41;
	public static final int DROP=42;
	public static final int DROPPING=43;
	public static final int DUPLICATES=44;
	public static final int EACH=45;
	public static final int END_BODY=46;
	public static final int EQ=47;
	public static final int EVALUATE=48;
	public static final int EXPAND=49;
	public static final int FIELD=50;
	public static final int FIELDS=51;
	public static final int FIELD_NAME=52;
	public static final int FILTER=53;
	public static final int FIRST=54;
	public static final int FLOAT=55;
	public static final int FOR=56;
	public static final int FROM=57;
	public static final int FUZZY=58;
	public static final int GE=59;
	public static final int GENERATE=60;
	public static final int GEOMETRY=61;
	public static final int GET=62;
	public static final int GROUP=63;
	public static final int GROUPING=64;
	public static final int GT=65;
	public static final int HOWINCLUDE=66;
	public static final int HOWINTERSECT=67;
	public static final int HOWMEET=68;
	public static final int ID=69;
	public static final int IF_ERROR=70;
	public static final int IF_FAILS=71;
	public static final int INCLUDED=72;
	public static final int INPUT=73;
	public static final int INRANGE=74;
	public static final int INT=75;
	public static final int INTERSECT=76;
	public static final int INTERSECTION=77;
	public static final int INTO=78;
	public static final int ISNOTNULL=79;
	public static final int ISNULL=80;
	public static final int JOIN=81;
	public static final int KEEP=82;
	public static final int KEEPING=83;
	public static final int KNOWN=84;
	public static final int LAST=85;
	public static final int LB=86;
	public static final int LBR=87;
	public static final int LE=88;
	public static final int LEFT=89;
	public static final int LETTER=90;
	public static final int LOOKUP=91;
	public static final int LP=92;
	public static final int LT=93;
	public static final int MATCHING=94;
	public static final int MEET=95;
	public static final int MEMBERSHIP_OF=96;
	public static final int MERGE=97;
	public static final int MIN_SIMILARITY=98;
	public static final int MUL=99;
	public static final int NEQ=100;
	public static final int NOT=101;
	public static final int OF=102;
	public static final int ON=103;
	public static final int OR=104;
	public static final int ORDER=105;
	public static final int ORIENTATION=106;
	public static final int OTHERS=107;
	public static final int PARAMETERS=108;
	public static final int PARTITION=109;
	public static final int POINT=110;
	public static final int POLYLINE=111;
	public static final int PRECONDITION=112;
	public static final int QUOTE=113;
	public static final int QUOTED_VALUE=114;
	public static final int RB=115;
	public static final int RBR=116;
	public static final int REMOVE=117;
	public static final int RESOLVING=118;
	public static final int RIGHT=119;
	public static final int RP=120;
	public static final int SAVE=121;
	public static final int SC=122;
	public static final int SCAN_ERROR=123;
	public static final int SERVER=124;
	public static final int SET=125;
	public static final int SETS=126;
	public static final int SETTING=127;
	public static final int SUB=128;
	public static final int SUBTRACT=129;
	public static final int THRESHOLD=130;
	public static final int TILDE=131;
	public static final int TO=132;
	public static final int TO_POLYLINE=133;
	public static final int TRAJECTORY=134;
	public static final int TRANSLATE=135;
	public static final int TYPE=136;
	public static final int UNCOMPARABLE=137;
	public static final int UNKNOWN=138;
	public static final int UNPACK=139;
	public static final int USE=140;
	public static final int USING=141;
	public static final int VERSUS=142;
	public static final int WEB=143;
	public static final int WHERE=144;
	public static final int WHITE_SPACES=145;
	public static final int WITH=146;
	public static final int WITHIN=147;
	public static final int WITHOUT=148;
	public static final int WRT=149;
	public static final int WS=150;
	public static final int XXX=151;

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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:126:1: buildActionRule returns [BuildAction ga] : BUILD os= objectStructureRule ;
	public final BuildAction buildActionRule() throws RecognitionException {
		BuildAction ga = null;


		ObjectStructure os =null;

		 ga = new BuildAction(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:128:3: ( BUILD os= objectStructureRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:129:5: BUILD os= objectStructureRule
			{
			match(input,BUILD,FOLLOW_BUILD_in_buildActionRule542); 
			pushFollow(FOLLOW_objectStructureRule_in_buildActionRule560);
			os=objectStructureRule();
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:135:1: objectStructureRule returns [ObjectStructure obj] : LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR ;
	public final ObjectStructure objectStructureRule() throws RecognitionException {
		ObjectStructure obj = null;


		Token t=null;
		OutputFieldSpec ofs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:136:3: ( LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:137:5: LBR ofs= outputFieldSpecRule (t= COMMA ofs= outputFieldSpecRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectStructureRule590); 
			pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule601);
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
					t=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectStructureRule622); 
					pushFollow(FOLLOW_outputFieldSpecRule_in_objectStructureRule626);
					ofs=outputFieldSpecRule();
					state._fsp--;

					 obj.addOutputFieldSpec(ofs); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_objectStructureRule642); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:145:1: outputFieldSpecRule returns [OutputFieldSpec ofs] : fr= fieldRefRule ( COLON (os= objectStructureRule |f= factorRule ) )? ;
	public final OutputFieldSpec outputFieldSpecRule() throws RecognitionException {
		OutputFieldSpec ofs = null;


		Field fr =null;
		ObjectStructure os =null;
		ExpressionFactor f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:146:3: (fr= fieldRefRule ( COLON (os= objectStructureRule |f= factorRule ) )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:147:5: fr= fieldRefRule ( COLON (os= objectStructureRule |f= factorRule ) )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_outputFieldSpecRule667);
			fr=fieldRefRule();
			state._fsp--;

			 ofs = new OutputFieldSpec (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:5: ( COLON (os= objectStructureRule |f= factorRule ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:7: COLON (os= objectStructureRule |f= factorRule )
					{
					match(input,COLON,FOLLOW_COLON_in_outputFieldSpecRule703); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:13: (os= objectStructureRule |f= factorRule )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:148:15: os= objectStructureRule
							{
							pushFollow(FOLLOW_objectStructureRule_in_outputFieldSpecRule709);
							os=objectStructureRule();
							state._fsp--;

							 ofs.setFieldSpec (os); 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:149:11: f= factorRule
							{
							pushFollow(FOLLOW_factorRule_in_outputFieldSpecRule750);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:156:1: geometricOptionRule returns [GeometricOption geo] : ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) );
	public final GeometricOption geometricOptionRule() throws RecognitionException {
		GeometricOption geo = null;


		Field lat =null;
		Field lon =null;
		Field afr =null;
		Field fr =null;
		Field f =null;

		 geo = new GeometricOption (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:158:3: ( KEEPING GEOMETRY | SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:159:6: KEEPING GEOMETRY
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_geometricOptionRule840); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule842); 
					 geo.setKeeping (); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:160:6: SETTING GEOMETRY ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
					{
					match(input,SETTING,FOLLOW_SETTING_in_geometricOptionRule874); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_geometricOptionRule876); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:161:14: ( POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP | AGGREGATE LP afr= fieldRefRule RP |fr= fieldRefRule | TO_POLYLINE LP f= fieldRefRule RP )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:161:16: POINT LP lat= fieldRefRule COMMA lon= fieldRefRule RP
							{
							match(input,POINT,FOLLOW_POINT_in_geometricOptionRule894); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule896); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule900);
							lat=fieldRefRule();
							state._fsp--;

							match(input,COMMA,FOLLOW_COMMA_in_geometricOptionRule902); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule906);
							lon=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule908); 
							 geo.setPoint (lat, lon); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:162:16: AGGREGATE LP afr= fieldRefRule RP
							{
							match(input,AGGREGATE,FOLLOW_AGGREGATE_in_geometricOptionRule928); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule930); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule934);
							afr=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule936); 
							 geo.setAggregate (afr); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:163:16: fr= fieldRefRule
							{
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule968);
							fr=fieldRefRule();
							state._fsp--;

							 geo.setField (fr); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:164:16: TO_POLYLINE LP f= fieldRefRule RP
							{
							match(input,TO_POLYLINE,FOLLOW_TO_POLYLINE_in_geometricOptionRule1006); 
							match(input,LP,FOLLOW_LP_in_geometricOptionRule1008); 
							pushFollow(FOLLOW_fieldRefRule_in_geometricOptionRule1012);
							f=fieldRefRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_geometricOptionRule1014); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:168:1: dropGeometryRule : DROPPING GEOMETRY ;
	public final void dropGeometryRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:169:3: ( DROPPING GEOMETRY )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:170:4: DROPPING GEOMETRY
			{
			match(input,DROPPING,FOLLOW_DROPPING_in_dropGeometryRule1060); 
			match(input,GEOMETRY,FOLLOW_GEOMETRY_in_dropGeometryRule1062); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:174:1: caseClauseRule returns [CaseClause cc] : CASE (wc= whereCaseRule )+ (oth= othersRule )? ;
	public final CaseClause caseClauseRule() throws RecognitionException {
		CaseClause cc = null;


		WhereCase wc =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:175:3: ( CASE (wc= whereCaseRule )+ (oth= othersRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:176:5: CASE (wc= whereCaseRule )+ (oth= othersRule )?
			{
			match(input,CASE,FOLLOW_CASE_in_caseClauseRule1109); 
			 cc = new CaseClause (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:8: (wc= whereCaseRule )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:177:10: wc= whereCaseRule
					{
					pushFollow(FOLLOW_whereCaseRule_in_caseClauseRule1136);
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:8: (oth= othersRule )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DROP||LA11_0==KEEP) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:178:10: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_caseClauseRule1165);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:182:1: othersRule returns [String oth] : (ot= KEEP |ot= DROP ) OTHERS ;
	public final String othersRule() throws RecognitionException {
		String oth = null;


		Token ot=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:183:3: ( (ot= KEEP |ot= DROP ) OTHERS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:184:6: (ot= KEEP |ot= DROP ) OTHERS
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:184:6: (ot= KEEP |ot= DROP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:184:8: ot= KEEP
					{
					ot=(Token)match(input,KEEP,FOLLOW_KEEP_in_othersRule1208); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:184:18: ot= DROP
					{
					ot=(Token)match(input,DROP,FOLLOW_DROP_in_othersRule1214); 
					}
					break;

			}

			 oth=ot.getText(); 
			match(input,OTHERS,FOLLOW_OTHERS_in_othersRule1225); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:190:1: whereCaseRule returns [WhereCase wc] : WHERE c= orConditionRule (gs= generateSectionRule[true] )? ;
	public final WhereCase whereCaseRule() throws RecognitionException {
		WhereCase wc = null;


		Condition c =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:191:3: ( WHERE c= orConditionRule (gs= generateSectionRule[true] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:192:5: WHERE c= orConditionRule (gs= generateSectionRule[true] )?
			{
			match(input,WHERE,FOLLOW_WHERE_in_whereCaseRule1250); 
			pushFollow(FOLLOW_orConditionRule_in_whereCaseRule1261);
			c=orConditionRule();
			state._fsp--;

			 wc = new WhereCase (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:194:7: (gs= generateSectionRule[true] )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==GENERATE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:194:9: gs= generateSectionRule[true]
					{
					pushFollow(FOLLOW_generateSectionRule_in_whereCaseRule1279);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:200:1: generateSectionRule[boolean complete] returns [GenerateSection gs] : g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? ;
	public final GenerateSection generateSectionRule(boolean complete) throws RecognitionException {
		GenerateSection gs = null;


		Token g=null;
		GeometricOption go =null;
		BuildAction ga =null;
		KeepingDroppingFuzzySets df =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:201:2: (g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:202:3: g= GENERATE (go= geometricOptionRule )? (cf= checkForFuzzySetRule[gs] )? (ac= alphaCutRule[gs] )? (ga= buildActionRule )? (df= keepDropFuzzySetsRule )? ( dropGeometryRule )?
			{
			g=(Token)match(input,GENERATE,FOLLOW_GENERATE_in_generateSectionRule1316); 
				gs = new GenerateSection (complete);	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:203:7: (go= geometricOptionRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:203:9: go= geometricOptionRule
					{
					pushFollow(FOLLOW_geometricOptionRule_in_generateSectionRule1333);
					go=geometricOptionRule();
					state._fsp--;

						gs.addGeometricOption (go); 	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:204:4: (cf= checkForFuzzySetRule[gs] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHECK_FOR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:204:6: cf= checkForFuzzySetRule[gs]
					{
					pushFollow(FOLLOW_checkForFuzzySetRule_in_generateSectionRule1350);
					checkForFuzzySetRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:4: (ac= alphaCutRule[gs] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ALPHACUT) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:205:6: ac= alphaCutRule[gs]
					{
					pushFollow(FOLLOW_alphaCutRule_in_generateSectionRule1381);
					alphaCutRule(gs);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:7: (ga= buildActionRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BUILD) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:206:9: ga= buildActionRule
					{
					pushFollow(FOLLOW_buildActionRule_in_generateSectionRule1419);
					ga=buildActionRule();
					state._fsp--;

					 gs.addBuildAction (ga); 			
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:4: (df= keepDropFuzzySetsRule )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:207:6: df= keepDropFuzzySetsRule
					{
					pushFollow(FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1439);
					df=keepDropFuzzySetsRule();
					state._fsp--;

					 gs.addKeepDropFuzzySets (df); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:7: ( dropGeometryRule )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DROPPING) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:208:9: dropGeometryRule
					{
					pushFollow(FOLLOW_dropGeometryRule_in_generateSectionRule1457);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:216:1: orConditionRule returns [Condition c] : c1= andConditionRule ( OR c2= andConditionRule )* ;
	public final Condition orConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:217:3: (c1= andConditionRule ( OR c2= andConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:218:5: c1= andConditionRule ( OR c2= andConditionRule )*
			{
			pushFollow(FOLLOW_andConditionRule_in_orConditionRule1518);
			c1=andConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:4: ( OR c2= andConditionRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==OR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:219:6: OR c2= andConditionRule
					{
					match(input,OR,FOLLOW_OR_in_orConditionRule1533); 
					pushFollow(FOLLOW_andConditionRule_in_orConditionRule1537);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:224:1: andConditionRule returns [Condition c] : c1= notConditionRule ( AND c2= notConditionRule )* ;
	public final Condition andConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:225:3: (c1= notConditionRule ( AND c2= notConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:226:5: c1= notConditionRule ( AND c2= notConditionRule )*
			{
			pushFollow(FOLLOW_notConditionRule_in_andConditionRule1594);
			c1=notConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:227:5: ( AND c2= notConditionRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:227:7: AND c2= notConditionRule
					{
					match(input,AND,FOLLOW_AND_in_andConditionRule1610); 
					pushFollow(FOLLOW_notConditionRule_in_andConditionRule1614);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:232:1: notConditionRule returns [Condition c] : (not= NOT )? p= predicateRule ;
	public final Condition notConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:233:3: ( (not= NOT )? p= predicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:5: (not= NOT )? p= predicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:5: (not= NOT )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NOT) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:234:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_notConditionRule1676); 
					}
					break;

			}

			pushFollow(FOLLOW_predicateRule_in_notConditionRule1688);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:241:1: predicateRule returns [Predicate p] : (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:242:3: (e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )? |np= nullPredicateRule |wp= withPredicateRule |wop= withoutPredicateRule |fp= wukFuzzyPredicateRule )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:243:7: e1= expressionRule (cp= compareRule[e1] |irp= inRangeRule[e1] )?
					{
					pushFollow(FOLLOW_expressionRule_in_predicateRule1732);
					e1=expressionRule();
					state._fsp--;

						p	=	e1; 	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:244:8: (cp= compareRule[e1] |irp= inRangeRule[e1] )?
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:244:10: cp= compareRule[e1]
							{
							pushFollow(FOLLOW_compareRule_in_predicateRule1760);
							cp=compareRule(e1);
							state._fsp--;

							 p = cp; 	
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:245:10: irp= inRangeRule[e1]
							{
							pushFollow(FOLLOW_inRangeRule_in_predicateRule1789);
							irp=inRangeRule(e1);
							state._fsp--;

							 p = irp; 	
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:246:7: np= nullPredicateRule
					{
					pushFollow(FOLLOW_nullPredicateRule_in_predicateRule1821);
					np=nullPredicateRule();
					state._fsp--;

						p = np;		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:247:7: wp= withPredicateRule
					{
					pushFollow(FOLLOW_withPredicateRule_in_predicateRule1844);
					wp=withPredicateRule();
					state._fsp--;

					 p = wp; 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:248:7: wop= withoutPredicateRule
					{
					pushFollow(FOLLOW_withoutPredicateRule_in_predicateRule1870);
					wop=withoutPredicateRule();
					state._fsp--;

					 p = wop;	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:249:5: fp= wukFuzzyPredicateRule
					{
					pushFollow(FOLLOW_wukFuzzyPredicateRule_in_predicateRule1890);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:253:1: compareRule[Expression e1] returns [Predicate p] : c= comparatorRule e2= expressionRule ;
	public final Predicate compareRule(Expression e1) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:254:2: (c= comparatorRule e2= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:255:5: c= comparatorRule e2= expressionRule
			{
			pushFollow(FOLLOW_comparatorRule_in_compareRule1926);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_expressionRule_in_compareRule1935);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:260:1: inRangeRule[Expression expr] returns [Predicate p] : INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) ;
	public final Predicate inRangeRule(Expression expr) throws RecognitionException {
		Predicate p = null;


		Token lp=null;
		Token rp=null;
		String n1 =null;
		String n2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:261:2: ( INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:3: INRANGE (lp= LB |lp= LP ) n1= numericRule COMMA n2= numericRule (rp= RP |rp= RB )
			{
			match(input,INRANGE,FOLLOW_INRANGE_in_inRangeRule1964); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:11: (lp= LB |lp= LP )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:13: lp= LB
					{
					lp=(Token)match(input,LB,FOLLOW_LB_in_inRangeRule1970); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:262:21: lp= LP
					{
					lp=(Token)match(input,LP,FOLLOW_LP_in_inRangeRule1976); 
					}
					break;

			}

			pushFollow(FOLLOW_numericRule_in_inRangeRule1986);
			n1=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_inRangeRule1988); 
			pushFollow(FOLLOW_numericRule_in_inRangeRule1992);
			n2=numericRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:264:3: (rp= RP |rp= RB )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:264:5: rp= RP
					{
					rp=(Token)match(input,RP,FOLLOW_RP_in_inRangeRule2001); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:264:13: rp= RB
					{
					rp=(Token)match(input,RB,FOLLOW_RB_in_inRangeRule2007); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:268:1: nullPredicateRule returns [NullPredicate np] : FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) ;
	public final NullPredicate nullPredicateRule() throws RecognitionException {
		NullPredicate np = null;


		Token n=null;
		Field f =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:269:2: ( FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:5: FIELD f= fieldRefRule (n= ISNULL |n= ISNOTNULL )
			{
			match(input,FIELD,FOLLOW_FIELD_in_nullPredicateRule2046); 
			pushFollow(FOLLOW_fieldRefRule_in_nullPredicateRule2050);
			f=fieldRefRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:26: (n= ISNULL |n= ISNOTNULL )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:28: n= ISNULL
					{
					n=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_nullPredicateRule2056); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:270:39: n= ISNOTNULL
					{
					n=(Token)match(input,ISNOTNULL,FOLLOW_ISNOTNULL_in_nullPredicateRule2062); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:274:1: wukFuzzyPredicateRule returns [WUKPredicate wuk] : (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* ;
	public final WUKPredicate wukFuzzyPredicateRule() throws RecognitionException {
		WUKPredicate wuk = null;


		Token t=null;
		Token fs=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:275:2: ( (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:3: (t= WITHIN |t= KNOWN |t= UNKNOWN ) FUZZY SETS fs= ID ( COMMA fs= ID )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:3: (t= WITHIN |t= KNOWN |t= UNKNOWN )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:5: t= WITHIN
					{
					t=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_wukFuzzyPredicateRule2136); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:16: t= KNOWN
					{
					t=(Token)match(input,KNOWN,FOLLOW_KNOWN_in_wukFuzzyPredicateRule2142); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:276:26: t= UNKNOWN
					{
					t=(Token)match(input,UNKNOWN,FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2148); 
					}
					break;

			}

			 wuk = env.createWUKPredicate(t); 
			match(input,FUZZY,FOLLOW_FUZZY_in_wukFuzzyPredicateRule2169); 
			match(input,SETS,FOLLOW_SETS_in_wukFuzzyPredicateRule2171); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2175); 
			 env.addFuzzySet (wuk, fs); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:7: ( COMMA fs= ID )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMMA) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:278:9: COMMA fs= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_wukFuzzyPredicateRule2205); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_wukFuzzyPredicateRule2209); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:283:1: withoutPredicateRule returns [WithoutPredicate wp] : WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithoutPredicate withoutPredicateRule() throws RecognitionException {
		WithoutPredicate wp = null;


		Field fr =null;

		 wp = new WithoutPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:285:3: ( WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:286:5: WITHOUT fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITHOUT,FOLLOW_WITHOUT_in_withoutPredicateRule2262); 
			pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2273);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:288:7: ( COMMA fr= fieldRefRule )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:288:9: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withoutPredicateRule2291); 
					pushFollow(FOLLOW_fieldRefRule_in_withoutPredicateRule2295);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:293:1: withPredicateRule returns [WithPredicate wp] : WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* ;
	public final WithPredicate withPredicateRule() throws RecognitionException {
		WithPredicate wp = null;


		Token ts=null;
		Field fr =null;

		 wp = new WithPredicate (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:295:3: ( WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:296:5: WITH ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )? fr= fieldRefRule ( COMMA fr= fieldRefRule )*
			{
			match(input,WITH,FOLLOW_WITH_in_withPredicateRule2333); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:7: ( (ts= ID |ts= ARRAY |ts= GEOMETRY ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ARRAY||LA32_0==GEOMETRY||LA32_0==ID) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:9: (ts= ID |ts= ARRAY |ts= GEOMETRY )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:11: ts= ID
							{
							ts=(Token)match(input,ID,FOLLOW_ID_in_withPredicateRule2348); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:19: ts= ARRAY
							{
							ts=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_withPredicateRule2354); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:297:30: ts= GEOMETRY
							{
							ts=(Token)match(input,GEOMETRY,FOLLOW_GEOMETRY_in_withPredicateRule2360); 
							}
							break;

					}

					 env.checkWithPredicateTypeSelector (wp, ts); 
					}
					break;

			}

			pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2381);
			fr=fieldRefRule();
			state._fsp--;

			 wp.addField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:6: ( COMMA fr= fieldRefRule )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:299:8: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_withPredicateRule2404); 
					pushFollow(FOLLOW_fieldRefRule_in_withPredicateRule2408);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:304:1: expressionRule returns [Expression expr] : (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* ;
	public final Expression expressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:306:3: ( (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:307:4: (t= termRule | (s= ADD |s= SUB ) t= termRule ) ( (s= ADD |s= SUB ) t= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:307:4: (t= termRule | (s= ADD |s= SUB ) t= termRule )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:307:6: t= termRule
					{
					pushFollow(FOLLOW_termRule_in_expressionRule2454);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:6: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:6: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2477); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:308:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2483); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2488);
					t=termRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:5: ( (s= ADD |s= SUB ) t= termRule )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ADD||LA37_0==SUB) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:7: (s= ADD |s= SUB ) t= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_expressionRule2506); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:309:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_expressionRule2512); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_expressionRule2517);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:313:1: termRule returns [ExpressionTerm et] : f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* ;
	public final ExpressionTerm termRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:315:3: (f= factorRule ( (s= MUL |s= DIV ) f= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:316:4: f= factorRule ( (s= MUL |s= DIV ) f= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule2555);
			f=factorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:5: ( (s= MUL |s= DIV ) f= factorRule )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==DIV||LA39_0==MUL) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:7: (s= MUL |s= DIV ) f= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:7: (s= MUL |s= DIV )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_termRule2578); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:317:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_termRule2584); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule2589);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:321:1: factorRule returns [ExpressionFactor ef] : ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor factorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Condition op =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:322:3: ( LP op= orConditionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:323:5: LP op= orConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule2623); 
					pushFollow(FOLLOW_orConditionRule_in_factorRule2627);
					op=orConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule2629); 
					 ef = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:324:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_factorRule2650);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:325:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_factorRule2674);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule2699); 
					match(input,LP,FOLLOW_LP_in_factorRule2701); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:14: (fp= functionParamsRule )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==ADD||LA40_0==APEX_VALUE||LA40_0==ARRAY_FUNCTION||LA40_0==BOOLEAN||LA40_0==FIELD_NAME||LA40_0==FLOAT||(LA40_0 >= ID && LA40_0 <= IF_ERROR)||LA40_0==INT||LA40_0==LP||LA40_0==MEMBERSHIP_OF||LA40_0==QUOTED_VALUE||LA40_0==SUB||LA40_0==TRANSLATE) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:326:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_factorRule2706);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_factorRule2710); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:327:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_factorRule2725);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:331:1: valueRule returns [Value vl] : (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN );
	public final Value valueRule() throws RecognitionException {
		Value vl = null;


		Token n=null;
		Token f=null;
		Token a=null;
		Token q=null;
		Token b=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:332:3: (n= INT |f= FLOAT |a= APEX_VALUE |q= QUOTED_VALUE |b= BOOLEAN )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:333:5: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_valueRule2762); 
					 vl = new Value (Value.INT, n.getText()); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:334:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_valueRule2782); 
					 vl = new Value (Value.FLOAT, f.getText());		
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:335:6: a= APEX_VALUE
					{
					a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_valueRule2801); 
					 vl = new Value (Value.APEX, a.getText()); 		
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:336:6: q= QUOTED_VALUE
					{
					q=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_valueRule2815); 
					 vl = new Value (Value.QUOTED, q.getText());	
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:337:6: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_valueRule2827); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:341:1: specialFunctionRule returns [SpecialFunctionFactor expr] : (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:342:2: (f= MEMBERSHIP_OF LP mo= ID RP |f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP |f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP |a= arrayFunctionRule )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:343:4: f= MEMBERSHIP_OF LP mo= ID RP
					{
					f=(Token)match(input,MEMBERSHIP_OF,FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2857); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2859); 
					mo=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2863); 
					match(input,RP,FOLLOW_RP_in_specialFunctionRule2865); 
						expr = env.buildMembershipOf (mo); 		
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:344:5: f= IF_ERROR LP e= restrictedExpressionRule COMMA v= valueRule RP
					{
					f=(Token)match(input,IF_ERROR,FOLLOW_IF_ERROR_in_specialFunctionRule2897); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2901); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2905);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2907); 
					pushFollow(FOLLOW_valueRule_in_specialFunctionRule2911);
					v=valueRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_specialFunctionRule2913); 
						expr = env.buildIfError (e, v); 	
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:345:5: f= TRANSLATE LP e= restrictedExpressionRule COMMA dict= ID ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )? RP
					{
					f=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_specialFunctionRule2925); 
					match(input,LP,FOLLOW_LP_in_specialFunctionRule2929); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_specialFunctionRule2933);
					e=restrictedExpressionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2935); 
					dict=(Token)match(input,ID,FOLLOW_ID_in_specialFunctionRule2939); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:15: ( COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )? )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==COMMA) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:346:17: COMMA cs= BOOLEAN ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2958); 
							cs=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_specialFunctionRule2962); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:16: ( COMMA (d= APEX_VALUE |d= QUOTED_VALUE ) )?
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==COMMA) ) {
								alt44=1;
							}
							switch (alt44) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:18: COMMA (d= APEX_VALUE |d= QUOTED_VALUE )
									{
									match(input,COMMA,FOLLOW_COMMA_in_specialFunctionRule2982); 
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:24: (d= APEX_VALUE |d= QUOTED_VALUE )
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
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:25: d= APEX_VALUE
											{
											d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_specialFunctionRule2987); 
											}
											break;
										case 2 :
											// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:347:40: d= QUOTED_VALUE
											{
											d=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_specialFunctionRule2993); 
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_specialFunctionRule3002); 
						expr = env.buildTranslate 	(e, dict, cs, d); 	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:348:5: a= arrayFunctionRule
					{
					pushFollow(FOLLOW_arrayFunctionRule_in_specialFunctionRule3014);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:352:1: arrayFunctionRule returns [ArrayFunctionFactor af] : (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP ;
	public final ArrayFunctionFactor arrayFunctionRule() throws RecognitionException {
		ArrayFunctionFactor af = null;


		Token fun=null;
		Token type=null;
		Token d=null;
		Field fr =null;
		Expression e =null;
		Field fx =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:2: ( (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:4: (fun= ARRAY_FUNCTION ) LP (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB ) COMMA type= ID ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )? RP
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:4: (fun= ARRAY_FUNCTION )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:353:6: fun= ARRAY_FUNCTION
			{
			fun=(Token)match(input,ARRAY_FUNCTION,FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3064); 
			}

				af = env.newArrayFunction (fun);	
			match(input,LP,FOLLOW_LP_in_arrayFunctionRule3104); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:4: (fr= fieldRefRule | LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:355:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3133);
					fr=fieldRefRule();
					state._fsp--;

					 af.setFieldArray (fr); 			
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:356:6: LB e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* RB
					{
					match(input,LB,FOLLOW_LB_in_arrayFunctionRule3154); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3158);
					e=restrictedExpressionRule();
					state._fsp--;

						af.addExpressionArray (e);	
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:5: ( COMMA e= restrictedExpressionRule )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==COMMA) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:357:7: COMMA e= restrictedExpressionRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3173); 
							pushFollow(FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3177);
							e=restrictedExpressionRule();
							state._fsp--;

								af.addExpressionArray (e);	
							}
							break;

						default :
							break loop47;
						}
					}

					match(input,RB,FOLLOW_RB_in_arrayFunctionRule3201); 
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3209); 
			type=(Token)match(input,ID,FOLLOW_ID_in_arrayFunctionRule3213); 
				env.setArrayFunctionType (af, type); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:4: ( COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* ) )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==COMMA) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:6: COMMA (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3241); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:12: (fx= fieldRefRule ( COMMA fx= fieldRefRule )* |d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )* )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:361:14: fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3247);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:362:9: ( COMMA fx= fieldRefRule )*
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( (LA49_0==COMMA) ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:362:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3269); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3273);
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:363:10: d= DOCUMENTS COMMA fx= fieldRefRule ( COMMA fx= fieldRefRule )*
							{
							d=(Token)match(input,DOCUMENTS,FOLLOW_DOCUMENTS_in_arrayFunctionRule3305); 
								env.setArrayFunctionSearcingType (af, d); 
							match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3328); 
							pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3332);
							fx=fieldRefRule();
							state._fsp--;

								af.addSearchingField (fx); 	
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:9: ( COMMA fx= fieldRefRule )*
							loop50:
							while (true) {
								int alt50=2;
								int LA50_0 = input.LA(1);
								if ( (LA50_0==COMMA) ) {
									alt50=1;
								}

								switch (alt50) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:365:11: COMMA fx= fieldRefRule
									{
									match(input,COMMA,FOLLOW_COMMA_in_arrayFunctionRule3351); 
									pushFollow(FOLLOW_fieldRefRule_in_arrayFunctionRule3355);
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

			match(input,RP,FOLLOW_RP_in_arrayFunctionRule3393); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:378:1: restrictedExpressionRule returns [Expression expr] : (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* ;
	public final Expression restrictedExpressionRule() throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:380:3: ( (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:381:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule ) ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:381:4: (t= restrictedTermRule | (s= ADD |s= SUB ) t= restrictedTermRule )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:381:6: t= restrictedTermRule
					{
					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3428);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:5: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:5: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:6: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3451); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:382:14: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3457); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3462);
					t=restrictedTermRule();
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:5: ( (s= ADD |s= SUB ) t= restrictedTermRule )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==ADD||LA56_0==SUB) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:7: (s= ADD |s= SUB ) t= restrictedTermRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:7: (s= ADD |s= SUB )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_restrictedExpressionRule3480); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:383:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_restrictedExpressionRule3486); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedTermRule_in_restrictedExpressionRule3491);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:387:1: restrictedTermRule returns [ExpressionTerm et] : f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* ;
	public final ExpressionTerm restrictedTermRule() throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:389:3: (f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:390:4: f= restrictedFactorRule ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			{
			pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3529);
			f=restrictedFactorRule();
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:5: ( (s= MUL |s= DIV ) f= restrictedFactorRule )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==DIV||LA58_0==MUL) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:7: (s= MUL |s= DIV ) f= restrictedFactorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:7: (s= MUL |s= DIV )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_restrictedTermRule3552); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:391:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_restrictedTermRule3558); 
							}
							break;

					}

					pushFollow(FOLLOW_restrictedFactorRule_in_restrictedTermRule3563);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:395:1: restrictedFactorRule returns [ExpressionFactor ef] : ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule );
	public final ExpressionFactor restrictedFactorRule() throws RecognitionException {
		ExpressionFactor ef = null;


		Token x=null;
		Expression ex =null;
		Field fr =null;
		Value vl =null;
		ArrayList<Expression> fp =null;
		SpecialFunctionFactor e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:396:3: ( LP ex= restrictedExpressionRule RP |fr= fieldRefRule |vl= valueRule |x= ID LP (fp= functionParamsRule )? RP |e= specialFunctionRule )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:397:5: LP ex= restrictedExpressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3597); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3601);
					ex=restrictedExpressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3603); 
					 ef = new ExpressionFactor (ex); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:398:6: fr= fieldRefRule
					{
					pushFollow(FOLLOW_fieldRefRule_in_restrictedFactorRule3618);
					fr=fieldRefRule();
					state._fsp--;

					 ef = new ExpressionFactor (fr); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:399:6: vl= valueRule
					{
					pushFollow(FOLLOW_valueRule_in_restrictedFactorRule3642);
					vl=valueRule();
					state._fsp--;

						ef = new ExpressionFactor (vl);	
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:400:6: x= ID LP (fp= functionParamsRule )? RP
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_restrictedFactorRule3667); 
					match(input,LP,FOLLOW_LP_in_restrictedFactorRule3669); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:400:14: (fp= functionParamsRule )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==ADD||LA59_0==APEX_VALUE||LA59_0==ARRAY_FUNCTION||LA59_0==BOOLEAN||LA59_0==FIELD_NAME||LA59_0==FLOAT||(LA59_0 >= ID && LA59_0 <= IF_ERROR)||LA59_0==INT||LA59_0==LP||LA59_0==MEMBERSHIP_OF||LA59_0==QUOTED_VALUE||LA59_0==SUB||LA59_0==TRANSLATE) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:400:15: fp= functionParamsRule
							{
							pushFollow(FOLLOW_functionParamsRule_in_restrictedFactorRule3674);
							fp=functionParamsRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_restrictedFactorRule3678); 
					 ef = env.buildFunction (x, fp); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:401:6: e= specialFunctionRule
					{
					pushFollow(FOLLOW_specialFunctionRule_in_restrictedFactorRule3695);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:405:1: functionParamsRule returns [ArrayList<Expression> params] : e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* ;
	public final ArrayList<Expression> functionParamsRule() throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:407:3: (e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:408:4: e= restrictedExpressionRule ( COMMA e= restrictedExpressionRule )*
			{
			pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3738);
			e=restrictedExpressionRule();
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:409:6: ( COMMA e= restrictedExpressionRule )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==COMMA) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:409:8: COMMA e= restrictedExpressionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParamsRule3756); 
					pushFollow(FOLLOW_restrictedExpressionRule_in_functionParamsRule3760);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:417:1: comparatorRule returns [Token op] : (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) ;
	public final Token comparatorRule() throws RecognitionException {
		Token op = null;


		Token o=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:418:3: ( (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:419:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:419:4: (o= EQ |o= NEQ |o= LT |o= GT |o= LE |o= GE )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:419:6: o= EQ
					{
					o=(Token)match(input,EQ,FOLLOW_EQ_in_comparatorRule3804); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:420:7: o= NEQ
					{
					o=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparatorRule3814); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:421:7: o= LT
					{
					o=(Token)match(input,LT,FOLLOW_LT_in_comparatorRule3824); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:422:7: o= GT
					{
					o=(Token)match(input,GT,FOLLOW_GT_in_comparatorRule3834); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:423:7: o= LE
					{
					o=(Token)match(input,LE,FOLLOW_LE_in_comparatorRule3844); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:424:7: o= GE
					{
					o=(Token)match(input,GE,FOLLOW_GE_in_comparatorRule3854); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:431:1: numericRule returns [String num] : (s= ADD |s= SUB )? (n= FLOAT |n= INT ) ;
	public final String numericRule() throws RecognitionException {
		String num = null;


		Token s=null;
		Token n=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:432:3: ( (s= ADD |s= SUB )? (n= FLOAT |n= INT ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:4: (s= ADD |s= SUB )? (n= FLOAT |n= INT )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:4: (s= ADD |s= SUB )?
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:6: s= ADD
					{
					s=(Token)match(input,ADD,FOLLOW_ADD_in_numericRule3894); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:433:14: s= SUB
					{
					s=(Token)match(input,SUB,FOLLOW_SUB_in_numericRule3900); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:4: (n= FLOAT |n= INT )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:6: n= FLOAT
					{
					n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numericRule3913); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:434:16: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_numericRule3919); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:439:1: checkForFuzzySetRule[GenerateSection gs] : CHECK_FOR FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* ;
	public final void checkForFuzzySetRule(GenerateSection gs) throws RecognitionException {
		Token fs=null;
		Condition fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:440:2: ( CHECK_FOR FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:441:3: CHECK_FOR FUZZY SET fs= ID USING fe= usingOrConditionRule ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			{
			match(input,CHECK_FOR,FOLLOW_CHECK_FOR_in_checkForFuzzySetRule3946); 
			match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule3948); 
			match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule3950); 
			fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule3954); 
			match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule3956); 
			pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3960);
			fe=usingOrConditionRule();
			state._fsp--;

			 env.addCheckForFuzzySet (gs, fs, fe); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:4: ( COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==COMMA) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:442:6: COMMA FUZZY SET fs= ID USING fe= usingOrConditionRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_checkForFuzzySetRule3975); 
					match(input,FUZZY,FOLLOW_FUZZY_in_checkForFuzzySetRule3977); 
					match(input,SET,FOLLOW_SET_in_checkForFuzzySetRule3979); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_checkForFuzzySetRule3983); 
					match(input,USING,FOLLOW_USING_in_checkForFuzzySetRule3985); 
					pushFollow(FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3989);
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



	// $ANTLR start "usingOrConditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:445:1: usingOrConditionRule returns [Condition c] : c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* ;
	public final Condition usingOrConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:446:3: (c1= usingAndConditionRule ( OR c2= usingAndConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:447:5: c1= usingAndConditionRule ( OR c2= usingAndConditionRule )*
			{
			pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4024);
			c1=usingAndConditionRule();
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:4: ( OR c2= usingAndConditionRule )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==OR) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:448:6: OR c2= usingAndConditionRule
					{
					match(input,OR,FOLLOW_OR_in_usingOrConditionRule4039); 
					pushFollow(FOLLOW_usingAndConditionRule_in_usingOrConditionRule4043);
					c2=usingAndConditionRule();
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop66;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:453:1: usingAndConditionRule returns [Condition c] : c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* ;
	public final Condition usingAndConditionRule() throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:454:3: (c1= usingNotConditionRule ( AND c2= usingNotConditionRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:455:5: c1= usingNotConditionRule ( AND c2= usingNotConditionRule )*
			{
			pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4100);
			c1=usingNotConditionRule();
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:456:5: ( AND c2= usingNotConditionRule )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==AND) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:456:7: AND c2= usingNotConditionRule
					{
					match(input,AND,FOLLOW_AND_in_usingAndConditionRule4116); 
					pushFollow(FOLLOW_usingNotConditionRule_in_usingAndConditionRule4120);
					c2=usingNotConditionRule();
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop67;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:461:1: usingNotConditionRule returns [Condition c] : (not= NOT )? p= usingPredicateRule ;
	public final Condition usingNotConditionRule() throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:462:3: ( (not= NOT )? p= usingPredicateRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:463:5: (not= NOT )? p= usingPredicateRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:463:5: (not= NOT )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==NOT) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:463:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_usingNotConditionRule4182); 
					}
					break;

			}

			pushFollow(FOLLOW_usingPredicateRule_in_usingNotConditionRule4194);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:469:1: usingPredicateRule returns [Predicate p] : ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP );
	public final Predicate usingPredicateRule() throws RecognitionException {
		Predicate p = null;


		Token x=null;
		Condition c =null;
		ArrayList<Expression> fp =null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:470:3: ( LP c= usingOrConditionRule RP |x= ID ( LP (fp= functionParamsRule )? RP )? | IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP )
			int alt71=3;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt71=1;
				}
				break;
			case ID:
				{
				alt71=2;
				}
				break;
			case IF_FAILS:
				{
				alt71=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:471:4: LP c= usingOrConditionRule RP
					{
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4226); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4230);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_usingPredicateRule4232); 
						p = new UsingPredicate (c); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:4: x= ID ( LP (fp= functionParamsRule )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_usingPredicateRule4250); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:9: ( LP (fp= functionParamsRule )? RP )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==LP) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:10: LP (fp= functionParamsRule )? RP
							{
							match(input,LP,FOLLOW_LP_in_usingPredicateRule4253); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:13: (fp= functionParamsRule )?
							int alt69=2;
							int LA69_0 = input.LA(1);
							if ( (LA69_0==ADD||LA69_0==APEX_VALUE||LA69_0==ARRAY_FUNCTION||LA69_0==BOOLEAN||LA69_0==FIELD_NAME||LA69_0==FLOAT||(LA69_0 >= ID && LA69_0 <= IF_ERROR)||LA69_0==INT||LA69_0==LP||LA69_0==MEMBERSHIP_OF||LA69_0==QUOTED_VALUE||LA69_0==SUB||LA69_0==TRANSLATE) ) {
								alt69=1;
							}
							switch (alt69) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:472:14: fp= functionParamsRule
									{
									pushFollow(FOLLOW_functionParamsRule_in_usingPredicateRule4258);
									fp=functionParamsRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_usingPredicateRule4262); 
							}
							break;

					}

						p = new UsingPredicate (x.getText(), fp); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:473:4: IF_FAILS LP c= usingOrConditionRule COMMA n= numericRule RP
					{
					match(input,IF_FAILS,FOLLOW_IF_FAILS_in_usingPredicateRule4283); 
					match(input,LP,FOLLOW_LP_in_usingPredicateRule4285); 
					pushFollow(FOLLOW_usingOrConditionRule_in_usingPredicateRule4293);
					c=usingOrConditionRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_usingPredicateRule4295); 
					pushFollow(FOLLOW_numericRule_in_usingPredicateRule4299);
					n=numericRule();
					state._fsp--;

					 p = new UsingPredicate (c, n); 
					match(input,RP,FOLLOW_RP_in_usingPredicateRule4307); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:479:1: alphaCutRule[GenerateSection gs] : ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* ;
	public final void alphaCutRule(GenerateSection gs) throws RecognitionException {
		Token on=null;
		String n =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:480:2: ( ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:481:3: ALPHACUT n= numericRule ON on= ID ( COMMA n= numericRule ON on= ID )*
			{
			match(input,ALPHACUT,FOLLOW_ALPHACUT_in_alphaCutRule4323); 
			pushFollow(FOLLOW_numericRule_in_alphaCutRule4328);
			n=numericRule();
			state._fsp--;

			match(input,ON,FOLLOW_ON_in_alphaCutRule4330); 
			on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4334); 
				env.addAlphaCut (gs, n, on); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:482:4: ( COMMA n= numericRule ON on= ID )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==COMMA) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:482:6: COMMA n= numericRule ON on= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_alphaCutRule4346); 
					pushFollow(FOLLOW_numericRule_in_alphaCutRule4350);
					n=numericRule();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_alphaCutRule4352); 
					on=(Token)match(input,ID,FOLLOW_ID_in_alphaCutRule4356); 
					 env.addAlphaCut (gs, n, on); 
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
	}
	// $ANTLR end "alphaCutRule"



	// $ANTLR start "keepDropFuzzySetsRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:491:1: keepDropFuzzySetsRule returns [KeepingDroppingFuzzySets dfs] : ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* );
	public final KeepingDroppingFuzzySets keepDropFuzzySetsRule() throws RecognitionException {
		KeepingDroppingFuzzySets dfs = null;


		Token fs=null;

		 dfs = new KeepingDroppingFuzzySets ();
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:493:2: ( DEFUZZIFY | DROPPING ALL FUZZY SETS | KEEPING ALL FUZZY SETS | DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )* | KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )* )
			int alt75=5;
			switch ( input.LA(1) ) {
			case DEFUZZIFY:
				{
				alt75=1;
				}
				break;
			case DROPPING:
				{
				int LA75_2 = input.LA(2);
				if ( (LA75_2==ALL) ) {
					alt75=2;
				}
				else if ( (LA75_2==FUZZY) ) {
					alt75=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KEEPING:
				{
				int LA75_3 = input.LA(2);
				if ( (LA75_3==ALL) ) {
					alt75=3;
				}
				else if ( (LA75_3==FUZZY) ) {
					alt75=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:494:4: DEFUZZIFY
					{
					match(input,DEFUZZIFY,FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4394); 
						dfs.setDefuzzify(); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:495:5: DROPPING ALL FUZZY SETS
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4413); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4415); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4417); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4419); 
						dfs.setDroppingAll(); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:496:5: KEEPING ALL FUZZY SETS
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4431); 
					match(input,ALL,FOLLOW_ALL_in_keepDropFuzzySetsRule4433); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4435); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4437); 
						dfs.setKeepingAll(); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:497:5: DROPPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,DROPPING,FOLLOW_DROPPING_in_keepDropFuzzySetsRule4450); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4452); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4454); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4458); 
						dfs.setDropping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:498:5: ( COMMA fs= ID )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==COMMA) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:498:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4472); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4476); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop73;
						}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:499:5: KEEPING FUZZY SETS fs= ID ( COMMA fs= ID )*
					{
					match(input,KEEPING,FOLLOW_KEEPING_in_keepDropFuzzySetsRule4501); 
					match(input,FUZZY,FOLLOW_FUZZY_in_keepDropFuzzySetsRule4503); 
					match(input,SETS,FOLLOW_SETS_in_keepDropFuzzySetsRule4505); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4509); 
						dfs.setKeeping(fs.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:500:5: ( COMMA fs= ID )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==COMMA) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:500:7: COMMA fs= ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_keepDropFuzzySetsRule4524); 
							fs=(Token)match(input,ID,FOLLOW_ID_in_keepDropFuzzySetsRule4528); 
							 dfs.addFuzzySet (fs.getText()); 
							}
							break;

						default :
							break loop74;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:505:1: addFieldsRule[JoinCollections jc] : ADD_ST FIELD f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA FIELD f= fieldRefRule COLON af= insertFieldRule[f] )* ;
	public final void addFieldsRule(JoinCollections jc) throws RecognitionException {
		Field f =null;
		AddField af =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:506:2: ( ADD_ST FIELD f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA FIELD f= fieldRefRule COLON af= insertFieldRule[f] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:507:3: ADD_ST FIELD f= fieldRefRule COLON af= insertFieldRule[f] ( COMMA FIELD f= fieldRefRule COLON af= insertFieldRule[f] )*
			{
			match(input,ADD_ST,FOLLOW_ADD_ST_in_addFieldsRule4569); 
			match(input,FIELD,FOLLOW_FIELD_in_addFieldsRule4575); 
			pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4579);
			f=fieldRefRule();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_addFieldsRule4581); 
			pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4585);
			af=insertFieldRule(f);
			state._fsp--;

			 jc.addAddField (af); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:509:5: ( COMMA FIELD f= fieldRefRule COLON af= insertFieldRule[f] )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==COMMA) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:509:7: COMMA FIELD f= fieldRefRule COLON af= insertFieldRule[f]
					{
					match(input,COMMA,FOLLOW_COMMA_in_addFieldsRule4604); 
					match(input,FIELD,FOLLOW_FIELD_in_addFieldsRule4606); 
					pushFollow(FOLLOW_fieldRefRule_in_addFieldsRule4610);
					f=fieldRefRule();
					state._fsp--;

					match(input,COLON,FOLLOW_COLON_in_addFieldsRule4612); 
					pushFollow(FOLLOW_insertFieldRule_in_addFieldsRule4616);
					af=insertFieldRule(f);
					state._fsp--;

					 jc.addAddField (af); 
					}
					break;

				default :
					break loop76;
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
	// $ANTLR end "addFieldsRule"



	// $ANTLR start "insertFieldRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:513:1: insertFieldRule[Field f] returns [AddField af] : (sf= spatialFunctionRule[false] |ef= restrictedFactorRule );
	public final AddField insertFieldRule(Field f) throws RecognitionException {
		AddField af = null;


		SpatialFunction sf =null;
		ExpressionFactor ef =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:514:2: (sf= spatialFunctionRule[false] |ef= restrictedFactorRule )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==DISTANCE||LA77_0==INCLUDED||LA77_0==INTERSECT||LA77_0==MEET||LA77_0==ORIENTATION) ) {
				alt77=1;
			}
			else if ( (LA77_0==APEX_VALUE||LA77_0==ARRAY_FUNCTION||LA77_0==BOOLEAN||LA77_0==FIELD_NAME||LA77_0==FLOAT||(LA77_0 >= ID && LA77_0 <= IF_ERROR)||LA77_0==INT||LA77_0==LP||LA77_0==MEMBERSHIP_OF||LA77_0==QUOTED_VALUE||LA77_0==TRANSLATE) ) {
				alt77=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:515:4: sf= spatialFunctionRule[false]
					{
					pushFollow(FOLLOW_spatialFunctionRule_in_insertFieldRule4652);
					sf=spatialFunctionRule(false);
					state._fsp--;

					 af = new AddField (f, sf); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:516:5: ef= restrictedFactorRule
					{
					pushFollow(FOLLOW_restrictedFactorRule_in_insertFieldRule4667);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:523:1: spatialFunctionRule[boolean joinCaller] returns [SpatialFunction sf] : ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT );
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:525:3: ( DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )? | ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP | INCLUDED LP (i= LEFT |i= RIGHT ) RP | MEET | INTERSECT )
			int alt82=5;
			switch ( input.LA(1) ) {
			case DISTANCE:
				{
				alt82=1;
				}
				break;
			case ORIENTATION:
				{
				alt82=2;
				}
				break;
			case INCLUDED:
				{
				alt82=3;
				}
				break;
			case MEET:
				{
				alt82=4;
				}
				break;
			case INTERSECT:
				{
				alt82=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:5: DISTANCE LP u= ID RP (cp= comparatorRule n= numericRule )?
					{
					match(input,DISTANCE,FOLLOW_DISTANCE_in_spatialFunctionRule4706); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4708); 
					u=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4712); 
					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4714); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:25: (cp= comparatorRule n= numericRule )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==EQ||LA78_0==GE||LA78_0==GT||LA78_0==LE||LA78_0==LT||LA78_0==NEQ) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:526:27: cp= comparatorRule n= numericRule
							{
							pushFollow(FOLLOW_comparatorRule_in_spatialFunctionRule4720);
							cp=comparatorRule();
							state._fsp--;

							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4724);
							n=numericRule();
							state._fsp--;

							}
							break;

					}

					 env.setDistance (sf, u, cp, n, joinCaller); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:6: ORIENTATION LP (f= LEFT |f= RIGHT ) ( COMMA o= ID COLON d= numericRule )? RP
					{
					match(input,ORIENTATION,FOLLOW_ORIENTATION_in_spatialFunctionRule4748); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4750); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:21: (f= LEFT |f= RIGHT )
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==LEFT) ) {
						alt79=1;
					}
					else if ( (LA79_0==RIGHT) ) {
						alt79=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 79, 0, input);
						throw nvae;
					}

					switch (alt79) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:23: f= LEFT
							{
							f=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule4756); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:32: f= RIGHT
							{
							f=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule4762); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:42: ( COMMA o= ID COLON d= numericRule )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==COMMA) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:527:44: COMMA o= ID COLON d= numericRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_spatialFunctionRule4768); 
							o=(Token)match(input,ID,FOLLOW_ID_in_spatialFunctionRule4773); 
							match(input,COLON,FOLLOW_COLON_in_spatialFunctionRule4775); 
							pushFollow(FOLLOW_numericRule_in_spatialFunctionRule4779);
							d=numericRule();
							state._fsp--;

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4784); 
					 env.setOrientation (sf, f, o, d, joinCaller);  
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:6: INCLUDED LP (i= LEFT |i= RIGHT ) RP
					{
					match(input,INCLUDED,FOLLOW_INCLUDED_in_spatialFunctionRule4796); 
					match(input,LP,FOLLOW_LP_in_spatialFunctionRule4798); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:18: (i= LEFT |i= RIGHT )
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==LEFT) ) {
						alt81=1;
					}
					else if ( (LA81_0==RIGHT) ) {
						alt81=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 81, 0, input);
						throw nvae;
					}

					switch (alt81) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:20: i= LEFT
							{
							i=(Token)match(input,LEFT,FOLLOW_LEFT_in_spatialFunctionRule4804); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:528:29: i= RIGHT
							{
							i=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_spatialFunctionRule4810); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_spatialFunctionRule4813); 
					 sf.setType (SpatialFunction.INCLUDED, i.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:529:6: MEET
					{
					match(input,MEET,FOLLOW_MEET_in_spatialFunctionRule4845); 
					 sf.setType (SpatialFunction.MEET); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:530:6: INTERSECT
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_spatialFunctionRule4892); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:535:1: setFuzzySetsRule returns [SetFuzzySets sfs] : SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) ;
	public final SetFuzzySets setFuzzySetsRule() throws RecognitionException {
		SetFuzzySets sfs = null;


		Token k=null;

		 sfs = new SetFuzzySets(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:537:2: ( SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:538:3: SET FUZZY SETS ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			{
			match(input,SET,FOLLOW_SET_in_setFuzzySetsRule4955); 
			match(input,FUZZY,FOLLOW_FUZZY_in_setFuzzySetsRule4957); 
			match(input,SETS,FOLLOW_SETS_in_setFuzzySetsRule4959); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:539:4: ( KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT ) | addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )? )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==KEEP) ) {
				alt87=1;
			}
			else if ( ((LA87_0 >= HOWINCLUDE && LA87_0 <= HOWMEET)||LA87_0==LEFT||LA87_0==RIGHT) ) {
				alt87=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:539:6: KEEP (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					{
					match(input,KEEP,FOLLOW_KEEP_in_setFuzzySetsRule4967); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:540:6: (k= ALL ( resolvingRule[sfs] )? |k= LEFT |k= RIGHT )
					int alt84=3;
					switch ( input.LA(1) ) {
					case ALL:
						{
						alt84=1;
						}
						break;
					case LEFT:
						{
						alt84=2;
						}
						break;
					case RIGHT:
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:540:8: k= ALL ( resolvingRule[sfs] )?
							{
							k=(Token)match(input,ALL,FOLLOW_ALL_in_setFuzzySetsRule5004); 
								sfs.setByKeep(k.getText()); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:7: ( resolvingRule[sfs] )?
							int alt83=2;
							int LA83_0 = input.LA(1);
							if ( (LA83_0==RESOLVING) ) {
								alt83=1;
							}
							switch (alt83) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:541:9: resolvingRule[sfs]
									{
									pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5040);
									resolvingRule(sfs);
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:542:8: k= LEFT
							{
							k=(Token)match(input,LEFT,FOLLOW_LEFT_in_setFuzzySetsRule5058); 
								sfs.setByKeep(k.getText()); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:543:8: k= RIGHT
							{
							k=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_setFuzzySetsRule5094); 
							}
							break;

					}

						sfs.setByKeep(k.getText()); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:544:6: addFuzzySetRule[sfs] ( COMMA addFuzzySetRule[sfs] )* ( resolvingRule[sfs] )?
					{
					pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5125);
					addFuzzySetRule(sfs);
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:5: ( COMMA addFuzzySetRule[sfs] )*
					loop85:
					while (true) {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==COMMA) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:545:7: COMMA addFuzzySetRule[sfs]
							{
							match(input,COMMA,FOLLOW_COMMA_in_setFuzzySetsRule5134); 
							pushFollow(FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5136);
							addFuzzySetRule(sfs);
							state._fsp--;

							}
							break;

						default :
							break loop85;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:546:5: ( resolvingRule[sfs] )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==RESOLVING) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:546:7: resolvingRule[sfs]
							{
							pushFollow(FOLLOW_resolvingRule_in_setFuzzySetsRule5152);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:550:1: resolvingRule[SetFuzzySets sfs] : RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) ;
	public final void resolvingRule(SetFuzzySets sfs) throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:551:2: ( RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:552:3: RESOLVING WITH (t= AND |t= OR |t= FIRST |t= LAST )
			{
			match(input,RESOLVING,FOLLOW_RESOLVING_in_resolvingRule5179); 
			match(input,WITH,FOLLOW_WITH_in_resolvingRule5181); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:6: (t= AND |t= OR |t= FIRST |t= LAST )
			int alt88=4;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt88=1;
				}
				break;
			case OR:
				{
				alt88=2;
				}
				break;
			case FIRST:
				{
				alt88=3;
				}
				break;
			case LAST:
				{
				alt88=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:7: t= AND
					{
					t=(Token)match(input,AND,FOLLOW_AND_in_resolvingRule5193); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:15: t= OR
					{
					t=(Token)match(input,OR,FOLLOW_OR_in_resolvingRule5199); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:22: t= FIRST
					{
					t=(Token)match(input,FIRST,FOLLOW_FIRST_in_resolvingRule5205); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:553:32: t= LAST
					{
					t=(Token)match(input,LAST,FOLLOW_LAST_in_resolvingRule5211); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:556:1: addFuzzySetRule[SetFuzzySets sfs] : ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID );
	public final void addFuzzySetRule(SetFuzzySets sfs) throws RecognitionException {
		Token s=null;
		Token fs=null;
		Token newFs=null;
		Token f=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:557:2: ( (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? ) |f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID |f= HOWINTERSECT LP RP AS fs= ID )
			int alt94=4;
			switch ( input.LA(1) ) {
			case LEFT:
			case RIGHT:
				{
				alt94=1;
				}
				break;
			case HOWINCLUDE:
				{
				alt94=2;
				}
				break;
			case HOWMEET:
				{
				alt94=3;
				}
				break;
			case HOWINTERSECT:
				{
				alt94=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:3: (s= LEFT |s= RIGHT ) ( ALL |fs= ID ( AS newFs= ID )? )
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:3: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:5: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5243); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:558:14: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5249); 
							}
							break;

					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:4: ( ALL |fs= ID ( AS newFs= ID )? )
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==ALL) ) {
						alt91=1;
					}
					else if ( (LA91_0==ID) ) {
						alt91=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 91, 0, input);
						throw nvae;
					}

					switch (alt91) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:559:6: ALL
							{
							match(input,ALL,FOLLOW_ALL_in_addFuzzySetRule5260); 
								sfs.add (s.getText()); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:6: fs= ID ( AS newFs= ID )?
							{
							fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5296); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:12: ( AS newFs= ID )?
							int alt90=2;
							int LA90_0 = input.LA(1);
							if ( (LA90_0==AS) ) {
								alt90=1;
							}
							switch (alt90) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:560:14: AS newFs= ID
									{
									match(input,AS,FOLLOW_AS_in_addFuzzySetRule5300); 
									newFs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5304); 
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:4: f= HOWINCLUDE LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWINCLUDE,FOLLOW_HOWINCLUDE_in_addFuzzySetRule5335); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5339); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:22: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:24: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5345); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:562:33: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5351); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5355); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5357); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5361); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:4: f= HOWMEET LP (s= LEFT |s= RIGHT ) RP AS fs= ID
					{
					f=(Token)match(input,HOWMEET,FOLLOW_HOWMEET_in_addFuzzySetRule5374); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5379); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:20: (s= LEFT |s= RIGHT )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:22: s= LEFT
							{
							s=(Token)match(input,LEFT,FOLLOW_LEFT_in_addFuzzySetRule5385); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:563:31: s= RIGHT
							{
							s=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_addFuzzySetRule5391); 
							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5395); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5398); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5402); 
						sfs.addFunction (f.getText(), s.getText(), fs.getText()); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:564:4: f= HOWINTERSECT LP RP AS fs= ID
					{
					f=(Token)match(input,HOWINTERSECT,FOLLOW_HOWINTERSECT_in_addFuzzySetRule5425); 
					match(input,LP,FOLLOW_LP_in_addFuzzySetRule5428); 
					match(input,RP,FOLLOW_RP_in_addFuzzySetRule5430); 
					match(input,AS,FOLLOW_AS_in_addFuzzySetRule5443); 
					fs=(Token)match(input,ID,FOLLOW_ID_in_addFuzzySetRule5447); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:571:1: getCollectionRule : GET COLLECTION (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC ;
	public final void getCollectionRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token url=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:572:3: ( GET COLLECTION (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:573:4: GET COLLECTION (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) ) SC
			{
			match(input,GET,FOLLOW_GET_in_getCollectionRule5471); 
			match(input,COLLECTION,FOLLOW_COLLECTION_in_getCollectionRule5473); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:6: (name= ID ( AT db= ID )? | FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE ) )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==ID) ) {
				alt97=1;
			}
			else if ( (LA97_0==FROM) ) {
				alt97=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:8: name= ID ( AT db= ID )?
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5485); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:16: ( AT db= ID )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==AT) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:574:18: AT db= ID
							{
							match(input,AT,FOLLOW_AT_in_getCollectionRule5489); 
							db=(Token)match(input,ID,FOLLOW_ID_in_getCollectionRule5493); 
							}
							break;

					}

					 env.addGetCollection (name, db, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:8: FROM WEB (url= APEX_VALUE |url= QUOTED_VALUE )
					{
					match(input,FROM,FOLLOW_FROM_in_getCollectionRule5524); 
					match(input,WEB,FOLLOW_WEB_in_getCollectionRule5526); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:17: (url= APEX_VALUE |url= QUOTED_VALUE )
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==APEX_VALUE) ) {
						alt96=1;
					}
					else if ( (LA96_0==QUOTED_VALUE) ) {
						alt96=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);
						throw nvae;
					}

					switch (alt96) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:18: url= APEX_VALUE
							{
							url=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_getCollectionRule5531); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:575:35: url= QUOTED_VALUE
							{
							url=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_getCollectionRule5537); 
							}
							break;

					}

					 env.addGetCollection (url); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_getCollectionRule5550); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:580:1: getDictionaryRule : GET DICTIONARY name= ID AT db= ID AS dict= ID SC ;
	public final void getDictionaryRule() throws RecognitionException {
		Token name=null;
		Token db=null;
		Token dict=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:581:3: ( GET DICTIONARY name= ID AT db= ID AS dict= ID SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:582:4: GET DICTIONARY name= ID AT db= ID AS dict= ID SC
			{
			match(input,GET,FOLLOW_GET_in_getDictionaryRule5571); 
			match(input,DICTIONARY,FOLLOW_DICTIONARY_in_getDictionaryRule5573); 
			name=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5584); 
			match(input,AT,FOLLOW_AT_in_getDictionaryRule5586); 
			db=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5590); 
			match(input,AS,FOLLOW_AS_in_getDictionaryRule5592); 
			dict=(Token)match(input,ID,FOLLOW_ID_in_getDictionaryRule5596); 
			 env.addGetDictionary (name, db, dict); 
			match(input,SC,FOLLOW_SC_in_getDictionaryRule5625); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:589:1: saveAsRule : SAVE AS cn= ID ( AT db= ID )? SC ;
	public final void saveAsRule() throws RecognitionException {
		Token cn=null;
		Token db=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:590:3: ( SAVE AS cn= ID ( AT db= ID )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:591:4: SAVE AS cn= ID ( AT db= ID )? SC
			{
			match(input,SAVE,FOLLOW_SAVE_in_saveAsRule5644); 
			match(input,AS,FOLLOW_AS_in_saveAsRule5646); 
			cn=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5656); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:12: ( AT db= ID )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==AT) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:592:14: AT db= ID
					{
					match(input,AT,FOLLOW_AT_in_saveAsRule5660); 
					db=(Token)match(input,ID,FOLLOW_ID_in_saveAsRule5664); 
					}
					break;

			}

			 env.addSaveAs (cn, db); 
			match(input,SC,FOLLOW_SC_in_saveAsRule5684); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:597:1: lookupFromWebRule : LOOKUP FROM WEB (fe= forEachRule )+ SC ;
	public final void lookupFromWebRule() throws RecognitionException {
		ForEach fe =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:598:2: ( LOOKUP FROM WEB (fe= forEachRule )+ SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:599:3: LOOKUP FROM WEB (fe= forEachRule )+ SC
			{
			match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupFromWebRule5700); 
			match(input,FROM,FOLLOW_FROM_in_lookupFromWebRule5702); 
			match(input,WEB,FOLLOW_WEB_in_lookupFromWebRule5704); 
				LookupFromWeb gfw = env.addLookupFromWeb ();	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:600:4: (fe= forEachRule )+
			int cnt99=0;
			loop99:
			while (true) {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==FOR) ) {
					alt99=1;
				}

				switch (alt99) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:600:6: fe= forEachRule
					{
					pushFollow(FOLLOW_forEachRule_in_lookupFromWebRule5720);
					fe=forEachRule();
					state._fsp--;

						gfw.addForEach (fe);	
					}
					break;

				default :
					if ( cnt99 >= 1 ) break loop99;
					EarlyExitException eee = new EarlyExitException(99, input);
					throw eee;
				}
				cnt99++;
			}

			match(input,SC,FOLLOW_SC_in_lookupFromWebRule5733); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:605:1: forEachRule returns [ForEach fe] : FOR EACH c= orConditionRule CALL e= expressionRule ;
	public final ForEach forEachRule() throws RecognitionException {
		ForEach fe = null;


		Condition c =null;
		Expression e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:606:2: ( FOR EACH c= orConditionRule CALL e= expressionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:607:3: FOR EACH c= orConditionRule CALL e= expressionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forEachRule5753); 
			match(input,EACH,FOLLOW_EACH_in_forEachRule5755); 
			pushFollow(FOLLOW_orConditionRule_in_forEachRule5759);
			c=orConditionRule();
			state._fsp--;

			match(input,CALL,FOLLOW_CALL_in_forEachRule5764); 
			pushFollow(FOLLOW_expressionRule_in_forEachRule5768);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:612:1: joinOfCollectionsRule : JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC ;
	public final void joinOfCollectionsRule() throws RecognitionException {
		Token tk=null;
		Token g=null;
		DbCollection c1 =null;
		DbCollection c2 =null;
		SpatialFunction nff =null;
		SetFuzzySets sfs =null;
		CaseClause cc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:613:3: ( JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:614:5: JOIN OF COLLECTIONS c1= collectionReferenceRule tk= COMMA c2= collectionReferenceRule ( ON GEOMETRY nff= spatialFunctionRule[true] )? ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )? ( addFieldsRule[jc] )? (sfs= setFuzzySetsRule )? (cc= caseClauseRule )? ( REMOVE DUPLICATES )? SC
			{
			match(input,JOIN,FOLLOW_JOIN_in_joinOfCollectionsRule5791); 
			match(input,OF,FOLLOW_OF_in_joinOfCollectionsRule5793); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_joinOfCollectionsRule5795); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5804);
			c1=collectionReferenceRule();
			state._fsp--;

			tk=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinOfCollectionsRule5808); 
			pushFollow(FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5812);
			c2=collectionReferenceRule();
			state._fsp--;

			 JoinCollections jc = env.addJoin (c1, c2, tk); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:6: ( ON GEOMETRY nff= spatialFunctionRule[true] )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==ON) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:616:8: ON GEOMETRY nff= spatialFunctionRule[true]
					{
					match(input,ON,FOLLOW_ON_in_joinOfCollectionsRule5824); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule5826); 
					pushFollow(FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule5830);
					nff=spatialFunctionRule(true);
					state._fsp--;

					 jc.setCondition (nff); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:6: ( SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL ) )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==SET) ) {
				int LA102_1 = input.LA(2);
				if ( (LA102_1==GEOMETRY) ) {
					alt102=1;
				}
			}
			switch (alt102) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:8: SET GEOMETRY (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					{
					match(input,SET,FOLLOW_SET_in_joinOfCollectionsRule5862); 
					match(input,GEOMETRY,FOLLOW_GEOMETRY_in_joinOfCollectionsRule5864); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:21: (g= INTERSECTION |g= RIGHT |g= LEFT |g= ALL )
					int alt101=4;
					switch ( input.LA(1) ) {
					case INTERSECTION:
						{
						alt101=1;
						}
						break;
					case RIGHT:
						{
						alt101=2;
						}
						break;
					case LEFT:
						{
						alt101=3;
						}
						break;
					case ALL:
						{
						alt101=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 101, 0, input);
						throw nvae;
					}
					switch (alt101) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:23: g= INTERSECTION
							{
							g=(Token)match(input,INTERSECTION,FOLLOW_INTERSECTION_in_joinOfCollectionsRule5870); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:40: g= RIGHT
							{
							g=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinOfCollectionsRule5876); 
							}
							break;
						case 3 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:50: g= LEFT
							{
							g=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinOfCollectionsRule5882); 
							}
							break;
						case 4 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:617:59: g= ALL
							{
							g=(Token)match(input,ALL,FOLLOW_ALL_in_joinOfCollectionsRule5888); 
							}
							break;

					}

					 jc.setSetGeometry (g.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:618:7: ( addFieldsRule[jc] )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==ADD_ST) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:618:9: addFieldsRule[jc]
					{
					pushFollow(FOLLOW_addFieldsRule_in_joinOfCollectionsRule5908);
					addFieldsRule(jc);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:7: (sfs= setFuzzySetsRule )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==SET) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:619:9: sfs= setFuzzySetsRule
					{
					pushFollow(FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule5968);
					sfs=setFuzzySetsRule();
					state._fsp--;

					 jc.setSetFuzzySets (sfs);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:6: (cc= caseClauseRule )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==CASE) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:620:8: cc= caseClauseRule
					{
					pushFollow(FOLLOW_caseClauseRule_in_joinOfCollectionsRule6010);
					cc=caseClauseRule();
					state._fsp--;

					 jc.setCaseClause (cc); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:621:7: ( REMOVE DUPLICATES )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==REMOVE) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:621:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_joinOfCollectionsRule6059); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_joinOfCollectionsRule6061); 
						jc.setRemoveDuplicates();	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_joinOfCollectionsRule6102); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:626:1: filterRule : FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC ;
	public final void filterRule() throws RecognitionException {
		CaseClause fc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:627:3: ( FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:628:4: FILTER fc= caseClauseRule ( REMOVE DUPLICATES )? SC
			{
			match(input,FILTER,FOLLOW_FILTER_in_filterRule6126); 
			pushFollow(FOLLOW_caseClauseRule_in_filterRule6138);
			fc=caseClauseRule();
			state._fsp--;

			 Filter f = env.addFilter (fc); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:630:7: ( REMOVE DUPLICATES )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==REMOVE) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:630:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_filterRule6156); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_filterRule6158); 
						f.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_filterRule6180); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:635:1: groupRule : GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC ;
	public final void groupRule() throws RecognitionException {
		Partition p =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:636:3: ( GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:637:4: GROUP (p= groupPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,GROUP,FOLLOW_GROUP_in_groupRule6201); 
			 Group g = env.addGroup (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:7: (p= groupPartitionRule )+
			int cnt108=0;
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==PARTITION) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:638:9: p= groupPartitionRule
					{
					pushFollow(FOLLOW_groupPartitionRule_in_groupRule6226);
					p=groupPartitionRule();
					state._fsp--;

					 g.addPartition (p); 
					}
					break;

				default :
					if ( cnt108 >= 1 ) break loop108;
					EarlyExitException eee = new EarlyExitException(108, input);
					throw eee;
				}
				cnt108++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:639:7: (oth= othersRule )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==DROP||LA109_0==KEEP) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:639:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_groupRule6252);
					oth=othersRule();
					state._fsp--;

					 g.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_groupRule6276); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:644:1: groupPartitionRule returns [Partition p] : PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? ;
	public final Partition groupPartitionRule() throws RecognitionException {
		Partition p = null;


		Condition c =null;
		Field fr =null;
		SortField sf =null;
		GenerateSection gs =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:645:3: ( PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:646:5: PARTITION c= orConditionRule BY fr= fieldRefRule ( COMMA fr= fieldRefRule )* INTO fr= fieldRefRule ( DROP GROUPING FIELDS )? ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )? (gs= generateSectionRule[false] )?
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_groupPartitionRule6299); 
			pushFollow(FOLLOW_orConditionRule_in_groupPartitionRule6303);
			c=orConditionRule();
			state._fsp--;

			 p = new Partition (c); 
			match(input,BY,FOLLOW_BY_in_groupPartitionRule6316); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6320);
			fr=fieldRefRule();
			state._fsp--;

			 p.addByField (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:648:10: ( COMMA fr= fieldRefRule )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==COMMA) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:648:12: COMMA fr= fieldRefRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6345); 
					pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6349);
					fr=fieldRefRule();
					state._fsp--;

					 p.addByField (fr); 
					}
					break;

				default :
					break loop110;
				}
			}

			match(input,INTO,FOLLOW_INTO_in_groupPartitionRule6371); 
			pushFollow(FOLLOW_fieldRefRule_in_groupPartitionRule6375);
			fr=fieldRefRule();
			state._fsp--;

			 p.setInto (fr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:8: ( DROP GROUPING FIELDS )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==DROP) ) {
				int LA111_1 = input.LA(2);
				if ( (LA111_1==GROUPING) ) {
					alt111=1;
				}
			}
			switch (alt111) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:650:10: DROP GROUPING FIELDS
					{
					match(input,DROP,FOLLOW_DROP_in_groupPartitionRule6396); 
					match(input,GROUPING,FOLLOW_GROUPING_in_groupPartitionRule6398); 
					match(input,FIELDS,FOLLOW_FIELDS_in_groupPartitionRule6400); 
						p.setDropGroupingFields (); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:7: ( ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )? )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==ORDER) ) {
				alt114=1;
			}
			switch (alt114) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:651:9: ORDER BY sf= sortingFieldRule ( COMMA sf= sortingFieldRule )* ( KEEP UNCOMPARABLE )?
					{
					match(input,ORDER,FOLLOW_ORDER_in_groupPartitionRule6422); 
					match(input,BY,FOLLOW_BY_in_groupPartitionRule6424); 
					pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6428);
					sf=sortingFieldRule();
					state._fsp--;

					 p.addSortingField (sf); 		
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:9: ( COMMA sf= sortingFieldRule )*
					loop112:
					while (true) {
						int alt112=2;
						int LA112_0 = input.LA(1);
						if ( (LA112_0==COMMA) ) {
							alt112=1;
						}

						switch (alt112) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:652:11: COMMA sf= sortingFieldRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_groupPartitionRule6445); 
							pushFollow(FOLLOW_sortingFieldRule_in_groupPartitionRule6449);
							sf=sortingFieldRule();
							state._fsp--;

							 p.addSortingField (sf); 		
							}
							break;

						default :
							break loop112;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:653:6: ( KEEP UNCOMPARABLE )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==KEEP) ) {
						int LA113_1 = input.LA(2);
						if ( (LA113_1==UNCOMPARABLE) ) {
							alt113=1;
						}
					}
					switch (alt113) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:653:8: KEEP UNCOMPARABLE
							{
							match(input,KEEP,FOLLOW_KEEP_in_groupPartitionRule6468); 
							match(input,UNCOMPARABLE,FOLLOW_UNCOMPARABLE_in_groupPartitionRule6470); 
							 p.setKeepUncomparable ();		
							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:655:7: (gs= generateSectionRule[false] )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==GENERATE) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:655:9: gs= generateSectionRule[false]
					{
					pushFollow(FOLLOW_generateSectionRule_in_groupPartitionRule6501);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:659:1: sortingFieldRule returns [SortField sf] : fr= fieldRefRule TYPE t= ID (v= VERSUS )? ;
	public final SortField sortingFieldRule() throws RecognitionException {
		SortField sf = null;


		Token t=null;
		Token v=null;
		Field fr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:660:2: (fr= fieldRefRule TYPE t= ID (v= VERSUS )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:661:3: fr= fieldRefRule TYPE t= ID (v= VERSUS )?
			{
			pushFollow(FOLLOW_fieldRefRule_in_sortingFieldRule6532);
			fr=fieldRefRule();
			state._fsp--;

			match(input,TYPE,FOLLOW_TYPE_in_sortingFieldRule6536); 
			t=(Token)match(input,ID,FOLLOW_ID_in_sortingFieldRule6540); 
				sf = env.createSortField (fr, t); 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:3: (v= VERSUS )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==VERSUS) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:663:5: v= VERSUS
					{
					v=(Token)match(input,VERSUS,FOLLOW_VERSUS_in_sortingFieldRule6555); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:666:1: expandRule : EXPAND (u= unpackRule )+ (oth= othersRule )? SC ;
	public final void expandRule() throws RecognitionException {
		Unpack u =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:667:3: ( EXPAND (u= unpackRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:668:5: EXPAND (u= unpackRule )+ (oth= othersRule )? SC
			{
			match(input,EXPAND,FOLLOW_EXPAND_in_expandRule6584); 
			 Expand e = env.addExpand (); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:669:7: (u= unpackRule )+
			int cnt117=0;
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==UNPACK) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:669:9: u= unpackRule
					{
					pushFollow(FOLLOW_unpackRule_in_expandRule6608);
					u=unpackRule();
					state._fsp--;

					 e.addUnpack (u); 
					}
					break;

				default :
					if ( cnt117 >= 1 ) break loop117;
					EarlyExitException eee = new EarlyExitException(117, input);
					throw eee;
				}
				cnt117++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:670:7: (oth= othersRule )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==DROP||LA118_0==KEEP) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:670:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_expandRule6640);
					oth=othersRule();
					state._fsp--;

					 e.setOthers(oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_expandRule6664); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:675:1: unpackRule returns [Unpack u] : UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule ;
	public final Unpack unpackRule() throws RecognitionException {
		Unpack u = null;


		Condition p =null;
		Field fr1 =null;
		Field fr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:676:3: ( UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:677:5: UNPACK p= orConditionRule ARRAY fr1= fieldRefRule TO fr2= fieldRefRule
			{
			match(input,UNPACK,FOLLOW_UNPACK_in_unpackRule6686); 
			pushFollow(FOLLOW_orConditionRule_in_unpackRule6691);
			p=orConditionRule();
			state._fsp--;

			match(input,ARRAY,FOLLOW_ARRAY_in_unpackRule6698); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule6702);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,TO,FOLLOW_TO_in_unpackRule6709); 
			pushFollow(FOLLOW_fieldRefRule_in_unpackRule6713);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:683:1: mergeCollectionsRule : MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC ;
	public final void mergeCollectionsRule() throws RecognitionException {
		DbCollection cr =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:684:3: ( MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:685:6: MERGE COLLECTIONS cr= collectionReferenceRule ( COMMA cr= collectionReferenceRule )+ ( REMOVE DUPLICATES )? SC
			{
			match(input,MERGE,FOLLOW_MERGE_in_mergeCollectionsRule6741); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_mergeCollectionsRule6743); 
			pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6757);
			cr=collectionReferenceRule();
			state._fsp--;

			 MergeCollections mc = env.addMergeCollections (cr); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:9: ( COMMA cr= collectionReferenceRule )+
			int cnt119=0;
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==COMMA) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:687:11: COMMA cr= collectionReferenceRule
					{
					match(input,COMMA,FOLLOW_COMMA_in_mergeCollectionsRule6779); 
					pushFollow(FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6783);
					cr=collectionReferenceRule();
					state._fsp--;

					 mc.addCollection (cr); 
					}
					break;

				default :
					if ( cnt119 >= 1 ) break loop119;
					EarlyExitException eee = new EarlyExitException(119, input);
					throw eee;
				}
				cnt119++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:7: ( REMOVE DUPLICATES )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==REMOVE) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:688:9: REMOVE DUPLICATES
					{
					match(input,REMOVE,FOLLOW_REMOVE_in_mergeCollectionsRule6804); 
					match(input,DUPLICATES,FOLLOW_DUPLICATES_in_mergeCollectionsRule6806); 
						mc.setRemoveDuplicates(); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_mergeCollectionsRule6836); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:693:1: intersectCollectionsRule : INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void intersectCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:694:3: ( INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:695:5: INTERSECT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,INTERSECT,FOLLOW_INTERSECT_in_intersectCollectionsRule6856); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_intersectCollectionsRule6858); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6868);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_intersectCollectionsRule6870); 
			pushFollow(FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6874);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addInstersectCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_intersectCollectionsRule6886); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:701:1: subtractCollectionsRule : SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC ;
	public final void subtractCollectionsRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:702:3: ( SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:703:5: SUBTRACT COLLECTIONS cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule SC
			{
			match(input,SUBTRACT,FOLLOW_SUBTRACT_in_subtractCollectionsRule6908); 
			match(input,COLLECTIONS,FOLLOW_COLLECTIONS_in_subtractCollectionsRule6910); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6918);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_subtractCollectionsRule6920); 
			pushFollow(FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6924);
			cr2=collectionReferenceRule();
			state._fsp--;

			 env.addSubtractCollections (cr1, cr2); 
			match(input,SC,FOLLOW_SC_in_subtractCollectionsRule6936); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:709:1: useDbRule : USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC ;
	public final void useDbRule() throws RecognitionException {
		Token d=null;
		Token a=null;

		 DbName db = null; 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:711:3: ( USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:712:5: USE DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )* ON ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? ) SC
			{
			match(input,USE,FOLLOW_USE_in_useDbRule6963); 
			 UseDb ud = env.addUseDb (); 
			match(input,DB,FOLLOW_DB_in_useDbRule6973); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:10: (d= ID |d= APEX_VALUE )
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==ID) ) {
				alt121=1;
			}
			else if ( (LA121_0==APEX_VALUE) ) {
				alt121=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}

			switch (alt121) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:11: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule6978); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:713:18: d= APEX_VALUE
					{
					d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule6984); 
					}
					break;

			}

			 db = new DbName (d.getText()); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:9: ( AS (a= ID |a= APEX_VALUE ) )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==AS) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:10: AS (a= ID |a= APEX_VALUE )
					{
					match(input,AS,FOLLOW_AS_in_useDbRule7008); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:13: (a= ID |a= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:14: a= ID
							{
							a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7013); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:714:21: a= APEX_VALUE
							{
							a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7019); 
							}
							break;

					}

					 db.setAlias (a.getText()); 
					}
					break;

			}

			 ud.addDb (db); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:9: ( COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )? )*
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==COMMA) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:11: COMMA DB (d= ID |d= APEX_VALUE ) ( AS (a= ID |a= APEX_VALUE ) )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_useDbRule7100); 
					match(input,DB,FOLLOW_DB_in_useDbRule7102); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:20: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:21: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7107); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:717:28: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7113); 
							}
							break;

					}

					 db = new DbName (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:16: ( AS (a= ID |a= APEX_VALUE ) )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( (LA126_0==AS) ) {
						alt126=1;
					}
					switch (alt126) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:18: AS (a= ID |a= APEX_VALUE )
							{
							match(input,AS,FOLLOW_AS_in_useDbRule7136); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:21: (a= ID |a= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:22: a= ID
									{
									a=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7141); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:718:29: a= APEX_VALUE
									{
									a=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7147); 
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
					break loop127;
				}
			}

			match(input,ON,FOLLOW_ON_in_useDbRule7225); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:722:8: ( DEFAULT SERVER | SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )? )
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==DEFAULT) ) {
				alt131=1;
			}
			else if ( (LA131_0==SERVER) ) {
				alt131=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:722:10: DEFAULT SERVER
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_useDbRule7237); 
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7239); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:723:10: SERVER (d= ID |d= APEX_VALUE ) ( (d= ID |d= APEX_VALUE ) )?
					{
					match(input,SERVER,FOLLOW_SERVER_in_useDbRule7251); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:10: (d= ID |d= APEX_VALUE )
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:11: d= ID
							{
							d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7266); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:724:18: d= APEX_VALUE
							{
							d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7272); 
							}
							break;

					}

					 ud.setServer (d.getText()); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:725:10: ( (d= ID |d= APEX_VALUE ) )?
					int alt130=2;
					int LA130_0 = input.LA(1);
					if ( (LA130_0==APEX_VALUE||LA130_0==ID) ) {
						alt130=1;
					}
					switch (alt130) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:725:12: (d= ID |d= APEX_VALUE )
							{
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:725:12: (d= ID |d= APEX_VALUE )
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
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:725:13: d= ID
									{
									d=(Token)match(input,ID,FOLLOW_ID_in_useDbRule7296); 
									}
									break;
								case 2 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:725:20: d= APEX_VALUE
									{
									d=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_useDbRule7302); 
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

			match(input,SC,FOLLOW_SC_in_useDbRule7327); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:731:1: trajectoryMatchingRule : TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC ;
	public final void trajectoryMatchingRule() throws RecognitionException {
		DbCollection cr1 =null;
		DbCollection cr2 =null;
		TrajectoryPartition tp =null;
		String oth =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:732:3: ( TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:733:5: TRAJECTORY MATCHING cr1= collectionReferenceRule COMMA cr2= collectionReferenceRule (tp= trajectoryPartitionRule )+ (oth= othersRule )? SC
			{
			match(input,TRAJECTORY,FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7352); 
			match(input,MATCHING,FOLLOW_MATCHING_in_trajectoryMatchingRule7354); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7364);
			cr1=collectionReferenceRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_trajectoryMatchingRule7366); 
			pushFollow(FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7370);
			cr2=collectionReferenceRule();
			state._fsp--;

			 TrajectoryMatching tm = env.addTrajectoryMatching (cr1, cr2); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:7: (tp= trajectoryPartitionRule )+
			int cnt132=0;
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==PARTITION) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:735:9: tp= trajectoryPartitionRule
					{
					pushFollow(FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7386);
					tp=trajectoryPartitionRule();
					state._fsp--;

					 tm.addPartition (tp); 
					}
					break;

				default :
					if ( cnt132 >= 1 ) break loop132;
					EarlyExitException eee = new EarlyExitException(132, input);
					throw eee;
				}
				cnt132++;
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:7: (oth= othersRule )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==DROP||LA133_0==KEEP) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:736:9: oth= othersRule
					{
					pushFollow(FOLLOW_othersRule_in_trajectoryMatchingRule7426);
					oth=othersRule();
					state._fsp--;

					 tm.setOthers (oth); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_trajectoryMatchingRule7468); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:741:1: trajectoryPartitionRule returns [TrajectoryPartition tp] : PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ ;
	public final TrajectoryPartition trajectoryPartitionRule() throws RecognitionException {
		TrajectoryPartition tp = null;


		Condition c =null;
		PartitionMatching tpm =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:742:3: ( PARTITION c= orConditionRule (tpm= partitionMatchingRule )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:743:5: PARTITION c= orConditionRule (tpm= partitionMatchingRule )+
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_trajectoryPartitionRule7496); 
			pushFollow(FOLLOW_orConditionRule_in_trajectoryPartitionRule7506);
			c=orConditionRule();
			state._fsp--;

			 tp = new TrajectoryPartition (c); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:745:6: (tpm= partitionMatchingRule )+
			int cnt134=0;
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==MATCHING) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:745:8: tpm= partitionMatchingRule
					{
					pushFollow(FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7527);
					tpm=partitionMatchingRule();
					state._fsp--;

					 tp.addPartitionMatching (tpm);  
					}
					break;

				default :
					if ( cnt134 >= 1 ) break loop134;
					EarlyExitException eee = new EarlyExitException(134, input);
					throw eee;
				}
				cnt134++;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:749:1: partitionMatchingRule returns [PartitionMatching pt] : MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? ;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:750:3: ( MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:751:5: MATCHING fr1= fieldRefRule WRT fr2= fieldRefRule THRESHOLD LP u= ID RP v= numericRule ( WHERE wc= orConditionRule )? INTO fr3= fieldRefRule ( ADDING fr4= fieldRefRule TO INPUT )? ( MIN_SIMILARITY n= numericRule )?
			{
			match(input,MATCHING,FOLLOW_MATCHING_in_partitionMatchingRule7564); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7568);
			fr1=fieldRefRule();
			state._fsp--;

			match(input,WRT,FOLLOW_WRT_in_partitionMatchingRule7575); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7579);
			fr2=fieldRefRule();
			state._fsp--;

			match(input,THRESHOLD,FOLLOW_THRESHOLD_in_partitionMatchingRule7586); 
			match(input,LP,FOLLOW_LP_in_partitionMatchingRule7588); 
			u=(Token)match(input,ID,FOLLOW_ID_in_partitionMatchingRule7592); 
			match(input,RP,FOLLOW_RP_in_partitionMatchingRule7595); 
			pushFollow(FOLLOW_numericRule_in_partitionMatchingRule7599);
			v=numericRule();
			state._fsp--;

			 pt = env.setThreshold (fr1, fr2, u, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:6: ( WHERE wc= orConditionRule )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==WHERE) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:754:8: WHERE wc= orConditionRule
					{
					match(input,WHERE,FOLLOW_WHERE_in_partitionMatchingRule7614); 
					pushFollow(FOLLOW_orConditionRule_in_partitionMatchingRule7618);
					wc=orConditionRule();
					state._fsp--;

					 pt.setWhereCondition (wc); 
					}
					break;

			}

			match(input,INTO,FOLLOW_INTO_in_partitionMatchingRule7642); 
			pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7646);
			fr3=fieldRefRule();
			state._fsp--;

			 pt.setInto (fr3); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:6: ( ADDING fr4= fieldRefRule TO INPUT )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==ADDING) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:756:8: ADDING fr4= fieldRefRule TO INPUT
					{
					match(input,ADDING,FOLLOW_ADDING_in_partitionMatchingRule7669); 
					pushFollow(FOLLOW_fieldRefRule_in_partitionMatchingRule7673);
					fr4=fieldRefRule();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_partitionMatchingRule7675); 
					match(input,INPUT,FOLLOW_INPUT_in_partitionMatchingRule7677); 
					 pt.setPathToInput (fr4);	
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:6: ( MIN_SIMILARITY n= numericRule )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==MIN_SIMILARITY) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:757:8: MIN_SIMILARITY n= numericRule
					{
					match(input,MIN_SIMILARITY,FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7699); 
					pushFollow(FOLLOW_numericRule_in_partitionMatchingRule7703);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:763:1: parameterRule[ParamList pl] returns [Parameter p] : v= ID TYPE t= ID ;
	public final Parameter parameterRule(ParamList pl) throws RecognitionException {
		Parameter p = null;


		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:764:2: (v= ID TYPE t= ID )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:765:3: v= ID TYPE t= ID
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_parameterRule7751); 
				env.checkParameterDeclaration (v, pl); 
			match(input,TYPE,FOLLOW_TYPE_in_parameterRule7767); 
			t=(Token)match(input,ID,FOLLOW_ID_in_parameterRule7771); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:770:1: createJavaScriptFunctionRule : CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC ;
	public final void createJavaScriptFunctionRule() throws RecognitionException {
		Token jsfn=null;
		Parameter p =null;
		Condition pc =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:771:2: ( CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:772:3: CREATE_JF jsfn= ID PARAMETERS p= parameterRule[jsf.getParamList()] ( COMMA p= parameterRule[jsf.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )? BODY END_BODY SC
			{
			match(input,CREATE_JF,FOLLOW_CREATE_JF_in_createJavaScriptFunctionRule7796); 
			jsfn=(Token)match(input,ID,FOLLOW_ID_in_createJavaScriptFunctionRule7804); 
			 JavascriptFunction jsf = env.addJavascriptFunction (jsfn); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule7837); 
			pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule7847);
			p=parameterRule(jsf.getParamList());
			state._fsp--;

			 jsf.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:5: ( COMMA p= parameterRule[jsf.getParamList()] )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==COMMA) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:776:7: COMMA p= parameterRule[jsf.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createJavaScriptFunctionRule7872); 
					pushFollow(FOLLOW_parameterRule_in_createJavaScriptFunctionRule7876);
					p=parameterRule(jsf.getParamList());
					state._fsp--;

					 jsf.parameters.add (p);
					}
					break;

				default :
					break loop138;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:777:4: ( PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true] )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==PRECONDITION) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:777:6: PRECONDITION pc= jfOrConditionRule[jsf.getParamList(), true]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule7901); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule7905);
					pc=jfOrConditionRule(jsf.getParamList(), true);
					state._fsp--;

						jsf.preCondition = pc; 
					}
					break;

			}

			match(input,BODY,FOLLOW_BODY_in_createJavaScriptFunctionRule7919); 
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
								
			match(input,END_BODY,FOLLOW_END_BODY_in_createJavaScriptFunctionRule7932); 
			match(input,SC,FOLLOW_SC_in_createJavaScriptFunctionRule7938); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:800:1: createFuzzyOperatorRule : CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )* RB SC ;
	public final void createFuzzyOperatorRule() throws RecognitionException {
		Token f=null;
		Parameter p =null;
		Condition pc =null;
		Expression e =null;
		String x =null;
		String y =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:801:3: ( CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )* RB SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:802:4: CREATE_FO f= ID PARAMETERS p= parameterRule[fo.getParamList()] ( COMMA p= parameterRule[fo.getParamList()] )* ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )? EVALUATE e= jfExpressionRule[fo.getParamList(), false] POLYLINE LB LP x= numericRule COMMA y= numericRule RP ( COMMA LP x= numericRule COMMA y= numericRule RP )* RB SC
			{
			match(input,CREATE_FO,FOLLOW_CREATE_FO_in_createFuzzyOperatorRule7960); 
			f=(Token)match(input,ID,FOLLOW_ID_in_createFuzzyOperatorRule7964); 
			 FuzzyOperator fo = env.addFuzzyOperator (f); 
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_createFuzzyOperatorRule7993); 
			pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8003);
			p=parameterRule(fo.getParamList());
			state._fsp--;

			 fo.parameters.add (p); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:5: ( COMMA p= parameterRule[fo.getParamList()] )*
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==COMMA) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:805:7: COMMA p= parameterRule[fo.getParamList()]
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8028); 
					pushFollow(FOLLOW_parameterRule_in_createFuzzyOperatorRule8032);
					p=parameterRule(fo.getParamList());
					state._fsp--;

					 fo.parameters.add (p);
					}
					break;

				default :
					break loop140;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:806:4: ( PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false] )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==PRECONDITION) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:806:6: PRECONDITION pc= jfOrConditionRule[fo.getParamList(), false]
					{
					match(input,PRECONDITION,FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8059); 
					pushFollow(FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8063);
					pc=jfOrConditionRule(fo.getParamList(), false);
					state._fsp--;

					 fo.preCondition = pc; 
					}
					break;

			}

			match(input,EVALUATE,FOLLOW_EVALUATE_in_createFuzzyOperatorRule8077); 
			pushFollow(FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8081);
			e=jfExpressionRule(fo.getParamList(), false);
			state._fsp--;

			 fo.evaluate = e; 
			match(input,POLYLINE,FOLLOW_POLYLINE_in_createFuzzyOperatorRule8097); 
			match(input,LB,FOLLOW_LB_in_createFuzzyOperatorRule8100); 
			match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8111); 
			pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8115);
			x=numericRule();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8117); 
			pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8121);
			y=numericRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8123); 
			 env.addFuzzyPolylinePoint (fo, x, y); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:810:10: ( COMMA LP x= numericRule COMMA y= numericRule RP )*
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==COMMA) ) {
					alt142=1;
				}

				switch (alt142) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:810:12: COMMA LP x= numericRule COMMA y= numericRule RP
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8144); 
					match(input,LP,FOLLOW_LP_in_createFuzzyOperatorRule8146); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8150);
					x=numericRule();
					state._fsp--;

					match(input,COMMA,FOLLOW_COMMA_in_createFuzzyOperatorRule8152); 
					pushFollow(FOLLOW_numericRule_in_createFuzzyOperatorRule8156);
					y=numericRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_createFuzzyOperatorRule8158); 
					 env.addFuzzyPolylinePoint (fo, x, y); 
					}
					break;

				default :
					break loop142;
				}
			}

			match(input,RB,FOLLOW_RB_in_createFuzzyOperatorRule8178); 
			match(input,SC,FOLLOW_SC_in_createFuzzyOperatorRule8182); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:817:1: jfOrConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* ;
	public final Condition jfOrConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:818:3: (c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:819:5: c1= jfAndConditionRule[pl, jsCaller] ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule8212);
			c1=jfAndConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionOr (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:820:4: ( OR c2= jfAndConditionRule[pl, jsCaller] )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==OR) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:820:6: OR c2= jfAndConditionRule[pl, jsCaller]
					{
					match(input,OR,FOLLOW_OR_in_jfOrConditionRule8229); 
					pushFollow(FOLLOW_jfAndConditionRule_in_jfOrConditionRule8233);
					c2=jfAndConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionOr)c).addCondition (c2); 
					}
					break;

				default :
					break loop143;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:826:1: jfAndConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* ;
	public final Condition jfAndConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Condition c1 =null;
		Condition c2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:827:3: (c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:828:5: c1= jfNotConditionRule[pl, jsCaller] ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule8301);
			c1=jfNotConditionRule(pl, jsCaller);
			state._fsp--;

			 c = new ConditionAnd (c1); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:829:5: ( AND c2= jfNotConditionRule[pl, jsCaller] )*
			loop144:
			while (true) {
				int alt144=2;
				int LA144_0 = input.LA(1);
				if ( (LA144_0==AND) ) {
					alt144=1;
				}

				switch (alt144) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:829:7: AND c2= jfNotConditionRule[pl, jsCaller]
					{
					match(input,AND,FOLLOW_AND_in_jfAndConditionRule8319); 
					pushFollow(FOLLOW_jfNotConditionRule_in_jfAndConditionRule8323);
					c2=jfNotConditionRule(pl, jsCaller);
					state._fsp--;

					 ((ConditionAnd)c).addCondition (c2); 
					}
					break;

				default :
					break loop144;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:834:1: jfNotConditionRule[ParamList pl, boolean jsCaller] returns [Condition c] : (not= NOT )? p= jsfPredicateRule[pl, jsCaller] ;
	public final Condition jfNotConditionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Condition c = null;


		Token not=null;
		Predicate p =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:835:3: ( (not= NOT )? p= jsfPredicateRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:836:5: (not= NOT )? p= jsfPredicateRule[pl, jsCaller]
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:836:5: (not= NOT )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==NOT) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:836:7: not= NOT
					{
					not=(Token)match(input,NOT,FOLLOW_NOT_in_jfNotConditionRule8391); 
					}
					break;

			}

			pushFollow(FOLLOW_jsfPredicateRule_in_jfNotConditionRule8402);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:842:1: jsfPredicateRule[ParamList pl, boolean jsCaller] returns [Predicate p] : e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? ;
	public final Predicate jsfPredicateRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Expression e1 =null;
		Predicate cp =null;
		Predicate irp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:843:3: (e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:844:4: e1= jfExpressionRule[pl, jsCaller] (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jsfPredicateRule8440);
			e1=jfExpressionRule(pl, jsCaller);
			state._fsp--;

				p	=	e1; 	
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:845:6: (cp= jfCompareRule[e1, pl, jsCaller] |irp= inRangeRule[e1] )?
			int alt146=3;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==EQ||LA146_0==GE||LA146_0==GT||LA146_0==LE||LA146_0==LT||LA146_0==NEQ) ) {
				alt146=1;
			}
			else if ( (LA146_0==INRANGE) ) {
				alt146=2;
			}
			switch (alt146) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:845:8: cp= jfCompareRule[e1, pl, jsCaller]
					{
					pushFollow(FOLLOW_jfCompareRule_in_jsfPredicateRule8460);
					cp=jfCompareRule(e1, pl, jsCaller);
					state._fsp--;

					 p = cp; 	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:846:9: irp= inRangeRule[e1]
					{
					pushFollow(FOLLOW_inRangeRule_in_jsfPredicateRule8480);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:850:1: jfCompareRule[Expression e1, ParamList pl, boolean jsCaller] returns [Predicate p] : c= comparatorRule e2= jfExpressionRule[pl, jsCaller] ;
	public final Predicate jfCompareRule(Expression e1, ParamList pl, boolean jsCaller) throws RecognitionException {
		Predicate p = null;


		Token c =null;
		Expression e2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:851:2: (c= comparatorRule e2= jfExpressionRule[pl, jsCaller] )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:852:5: c= comparatorRule e2= jfExpressionRule[pl, jsCaller]
			{
			pushFollow(FOLLOW_comparatorRule_in_jfCompareRule8527);
			c=comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_jfExpressionRule_in_jfCompareRule8536);
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:857:1: jfExpressionRule[ParamList pl, boolean jsCaller] returns [Expression expr] : (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* ;
	public final Expression jfExpressionRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		Expression expr = null;


		Token s=null;
		ExpressionTerm t =null;

		 expr = new Expression (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:859:3: ( (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] ) ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:4: (t= jfTermRule[pl, jsCaller] | (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==APEX_VALUE||LA148_0==FLOAT||LA148_0==ID||LA148_0==INT||LA148_0==LP||LA148_0==QUOTED_VALUE) ) {
				alt148=1;
			}
			else if ( (LA148_0==ADD||LA148_0==SUB) ) {
				alt148=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}

			switch (alt148) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:860:6: t= jfTermRule[pl, jsCaller]
					{
					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule8578);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, null); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:6: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:6: (s= ADD |s= SUB )
					int alt147=2;
					int LA147_0 = input.LA(1);
					if ( (LA147_0==ADD) ) {
						alt147=1;
					}
					else if ( (LA147_0==SUB) ) {
						alt147=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 147, 0, input);
						throw nvae;
					}

					switch (alt147) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:7: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule8601); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:861:15: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule8607); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule8612);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:5: ( (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller] )*
			loop150:
			while (true) {
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==ADD||LA150_0==SUB) ) {
					alt150=1;
				}

				switch (alt150) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:7: (s= ADD |s= SUB ) t= jfTermRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:7: (s= ADD |s= SUB )
					int alt149=2;
					int LA149_0 = input.LA(1);
					if ( (LA149_0==ADD) ) {
						alt149=1;
					}
					else if ( (LA149_0==SUB) ) {
						alt149=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 149, 0, input);
						throw nvae;
					}

					switch (alt149) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:8: s= ADD
							{
							s=(Token)match(input,ADD,FOLLOW_ADD_in_jfExpressionRule8630); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:862:16: s= SUB
							{
							s=(Token)match(input,SUB,FOLLOW_SUB_in_jfExpressionRule8636); 
							}
							break;

					}

					pushFollow(FOLLOW_jfTermRule_in_jfExpressionRule8641);
					t=jfTermRule(pl, jsCaller);
					state._fsp--;

					 expr.addTerm (t, s.getText()); 
					}
					break;

				default :
					break loop150;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:866:1: jfTermRule[ParamList pl, boolean jsCaller] returns [ExpressionTerm et] : f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* ;
	public final ExpressionTerm jfTermRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionTerm et = null;


		Token s=null;
		ExpressionFactor f =null;

		 et = new ExpressionTerm (); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:868:3: (f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:869:4: f= jfFactorRule[pl, jsCaller] ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfFactorRule_in_jfTermRule8681);
			f=jfFactorRule(pl, jsCaller);
			state._fsp--;

			 et.addFactor(f, null);
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:5: ( (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller] )*
			loop152:
			while (true) {
				int alt152=2;
				int LA152_0 = input.LA(1);
				if ( (LA152_0==DIV||LA152_0==MUL) ) {
					alt152=1;
				}

				switch (alt152) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:7: (s= MUL |s= DIV ) f= jfFactorRule[pl, jsCaller]
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:7: (s= MUL |s= DIV )
					int alt151=2;
					int LA151_0 = input.LA(1);
					if ( (LA151_0==MUL) ) {
						alt151=1;
					}
					else if ( (LA151_0==DIV) ) {
						alt151=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 151, 0, input);
						throw nvae;
					}

					switch (alt151) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:8: s= MUL
							{
							s=(Token)match(input,MUL,FOLLOW_MUL_in_jfTermRule8706); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:870:16: s= DIV
							{
							s=(Token)match(input,DIV,FOLLOW_DIV_in_jfTermRule8712); 
							}
							break;

					}

					pushFollow(FOLLOW_jfFactorRule_in_jfTermRule8717);
					f=jfFactorRule(pl, jsCaller);
					state._fsp--;

					 et.addFactor(f, s.getText());
					}
					break;

				default :
					break loop152;
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:874:1: jfFactorRule[ParamList pl, boolean jsCaller] returns [ExpressionFactor expr] : ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? );
	public final ExpressionFactor jfFactorRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ExpressionFactor expr = null;


		Token v=null;
		Token x=null;
		Token p1=null;
		Condition op =null;
		ArrayList<Expression> fp =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:875:3: ( LP op= jfOrConditionRule[pl, jsCaller] RP |v= INT |v= FLOAT |v= APEX_VALUE |v= QUOTED_VALUE |x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )? )
			int alt155=6;
			switch ( input.LA(1) ) {
			case LP:
				{
				alt155=1;
				}
				break;
			case INT:
				{
				alt155=2;
				}
				break;
			case FLOAT:
				{
				alt155=3;
				}
				break;
			case APEX_VALUE:
				{
				alt155=4;
				}
				break;
			case QUOTED_VALUE:
				{
				alt155=5;
				}
				break;
			case ID:
				{
				alt155=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 155, 0, input);
				throw nvae;
			}
			switch (alt155) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:876:5: LP op= jfOrConditionRule[pl, jsCaller] RP
					{
					match(input,LP,FOLLOW_LP_in_jfFactorRule8757); 
					pushFollow(FOLLOW_jfOrConditionRule_in_jfFactorRule8761);
					op=jfOrConditionRule(pl, jsCaller);
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_jfFactorRule8765); 
					 expr = new ExpressionFactor (op); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:877:6: v= INT
					{
					v=(Token)match(input,INT,FOLLOW_INT_in_jfFactorRule8785); 
					 expr = new ExpressionFactor (new Value(Value.INT, v.getText())); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:878:6: v= FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_jfFactorRule8823); 
					 expr = new ExpressionFactor (new Value(Value.FLOAT, v.getText())); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:879:6: v= APEX_VALUE
					{
					v=(Token)match(input,APEX_VALUE,FOLLOW_APEX_VALUE_in_jfFactorRule8860); 
					 expr = new ExpressionFactor (new Value(Value.APEX, v.getText())); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:880:6: v= QUOTED_VALUE
					{
					v=(Token)match(input,QUOTED_VALUE,FOLLOW_QUOTED_VALUE_in_jfFactorRule8894); 
					 expr = new ExpressionFactor (new Value(Value.QUOTED, v.getText())); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:881:6: x= ID (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_jfFactorRule8927); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:882:6: (p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP )?
					int alt154=2;
					int LA154_0 = input.LA(1);
					if ( (LA154_0==LP) ) {
						alt154=1;
					}
					switch (alt154) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:882:7: p1= LP (fp= jfFunctionParamsRule[pl, jsCaller] )? RP
							{
							p1=(Token)match(input,LP,FOLLOW_LP_in_jfFactorRule8966); 
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:882:13: (fp= jfFunctionParamsRule[pl, jsCaller] )?
							int alt153=2;
							int LA153_0 = input.LA(1);
							if ( (LA153_0==ADD||LA153_0==APEX_VALUE||LA153_0==FLOAT||LA153_0==ID||LA153_0==INT||LA153_0==LP||LA153_0==QUOTED_VALUE||LA153_0==SUB) ) {
								alt153=1;
							}
							switch (alt153) {
								case 1 :
									// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:882:14: fp= jfFunctionParamsRule[pl, jsCaller]
									{
									pushFollow(FOLLOW_jfFunctionParamsRule_in_jfFactorRule8971);
									fp=jfFunctionParamsRule(pl, jsCaller);
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_jfFactorRule8977); 
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
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:886:1: jfFunctionParamsRule[ParamList pl, boolean jsCaller] returns [ArrayList<Expression> params] : e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* ;
	public final ArrayList<Expression> jfFunctionParamsRule(ParamList pl, boolean jsCaller) throws RecognitionException {
		ArrayList<Expression> params = null;


		Expression e =null;

		 params = new ArrayList<Expression>(); 
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:888:3: (e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:889:4: e= jfExpressionRule[pl, jsCaller] ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			{
			pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9025);
			e=jfExpressionRule(pl, jsCaller);
			state._fsp--;

			 params.add(e); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:890:6: ( COMMA e= jfExpressionRule[pl, jsCaller] )*
			loop156:
			while (true) {
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==COMMA) ) {
					alt156=1;
				}

				switch (alt156) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:890:8: COMMA e= jfExpressionRule[pl, jsCaller]
					{
					match(input,COMMA,FOLLOW_COMMA_in_jfFunctionParamsRule9045); 
					pushFollow(FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9049);
					e=jfExpressionRule(pl, jsCaller);
					state._fsp--;

					 params.add(e); 
					}
					break;

				default :
					break loop156;
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



	public static final BitSet FOLLOW_getCollectionRule_in_start62 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_saveAsRule_in_start83 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_joinOfCollectionsRule_in_start111 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_filterRule_in_start128 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_groupRule_in_start156 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_expandRule_in_start185 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_mergeCollectionsRule_in_start213 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_intersectCollectionsRule_in_start231 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_subtractCollectionsRule_in_start245 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_useDbRule_in_start260 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_trajectoryMatchingRule_in_start289 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_createFuzzyOperatorRule_in_start305 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_createJavaScriptFunctionRule_in_start317 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_getDictionaryRule_in_start326 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_lookupFromWebRule_in_start341 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_test_in_start356 = new BitSet(new long[]{0xC022000060000000L,0x0200000208021000L,0x0000000000801042L});
	public static final BitSet FOLLOW_EOF_in_start387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XXX_in_test398 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_test400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule424 = new BitSet(new long[]{0x0000000000018002L});
	public static final BitSet FOLLOW_AT_in_collectionReferenceRule434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule438 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_AS_in_collectionReferenceRule451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_collectionReferenceRule455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_NAME_in_fieldRefRule502 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_BUILD_in_buildActionRule542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_objectStructureRule_in_buildActionRule560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectStructureRule590 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule601 = new BitSet(new long[]{0x0000000008000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_COMMA_in_objectStructureRule622 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_outputFieldSpecRule_in_objectStructureRule626 = new BitSet(new long[]{0x0000000008000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_RBR_in_objectStructureRule642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_outputFieldSpecRule667 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COLON_in_outputFieldSpecRule703 = new BitSet(new long[]{0x0090000000045000L,0x0004000110800860L,0x0000000000000080L});
	public static final BitSet FOLLOW_objectStructureRule_in_outputFieldSpecRule709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorRule_in_outputFieldSpecRule750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_geometricOptionRule840 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETTING_in_geometricOptionRule874 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_geometricOptionRule876 = new BitSet(new long[]{0x0010000000000080L,0x0000400000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_POINT_in_geometricOptionRule894 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule896 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule900 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_geometricOptionRule902 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule906 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_geometricOptionRule928 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule930 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule934 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_POLYLINE_in_geometricOptionRule1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_geometricOptionRule1008 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_geometricOptionRule1012 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_geometricOptionRule1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_dropGeometryRule1060 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_dropGeometryRule1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseClauseRule1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_whereCaseRule_in_caseClauseRule1136 = new BitSet(new long[]{0x0000040000000002L,0x0000000000040000L,0x0000000000010000L});
	public static final BitSet FOLLOW_othersRule_in_caseClauseRule1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEP_in_othersRule1208 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_DROP_in_othersRule1214 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_OTHERS_in_othersRule1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereCaseRule1250 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_orConditionRule_in_whereCaseRule1261 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_generateSectionRule_in_whereCaseRule1279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERATE_in_generateSectionRule1316 = new BitSet(new long[]{0x0000080200880202L,0x8000000000080000L});
	public static final BitSet FOLLOW_geometricOptionRule_in_generateSectionRule1333 = new BitSet(new long[]{0x0000080200880202L,0x0000000000080000L});
	public static final BitSet FOLLOW_checkForFuzzySetRule_in_generateSectionRule1350 = new BitSet(new long[]{0x0000080200080202L,0x0000000000080000L});
	public static final BitSet FOLLOW_alphaCutRule_in_generateSectionRule1381 = new BitSet(new long[]{0x0000080200080002L,0x0000000000080000L});
	public static final BitSet FOLLOW_buildActionRule_in_generateSectionRule1419 = new BitSet(new long[]{0x0000080200000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_keepDropFuzzySetsRule_in_generateSectionRule1439 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_dropGeometryRule_in_generateSectionRule1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1518 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_OR_in_orConditionRule1533 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_andConditionRule_in_orConditionRule1537 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1594 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_andConditionRule1610 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_notConditionRule_in_andConditionRule1614 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_notConditionRule1676 = new BitSet(new long[]{0x0094000000045010L,0x0004000110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_predicateRule_in_notConditionRule1688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_predicateRule1732 = new BitSet(new long[]{0x0800800000000002L,0x0000001021000402L});
	public static final BitSet FOLLOW_compareRule_in_predicateRule1760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_predicateRule1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullPredicateRule_in_predicateRule1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withPredicateRule_in_predicateRule1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutPredicateRule_in_predicateRule1870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wukFuzzyPredicateRule_in_predicateRule1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_compareRule1926 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_expressionRule_in_compareRule1935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INRANGE_in_inRangeRule1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000010400000L});
	public static final BitSet FOLLOW_LB_in_inRangeRule1970 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_LP_in_inRangeRule1976 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule1986 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_inRangeRule1988 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_inRangeRule1992 = new BitSet(new long[]{0x0000000000000000L,0x0108000000000000L});
	public static final BitSet FOLLOW_RP_in_inRangeRule2001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RB_in_inRangeRule2007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_in_nullPredicateRule2046 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_nullPredicateRule2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
	public static final BitSet FOLLOW_ISNULL_in_nullPredicateRule2056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISNOTNULL_in_nullPredicateRule2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHIN_in_wukFuzzyPredicateRule2136 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_KNOWN_in_wukFuzzyPredicateRule2142 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_UNKNOWN_in_wukFuzzyPredicateRule2148 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_wukFuzzyPredicateRule2169 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SETS_in_wukFuzzyPredicateRule2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2175 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_wukFuzzyPredicateRule2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_wukFuzzyPredicateRule2209 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_WITHOUT_in_withoutPredicateRule2262 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2273 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_withoutPredicateRule2291 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withoutPredicateRule2295 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_WITH_in_withPredicateRule2333 = new BitSet(new long[]{0x2010000000002000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_withPredicateRule2348 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_ARRAY_in_withPredicateRule2354 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_withPredicateRule2360 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2381 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_withPredicateRule2404 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_withPredicateRule2408 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2454 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2477 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2483 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2488 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ADD_in_expressionRule2506 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_SUB_in_expressionRule2512 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_termRule_in_expressionRule2517 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_factorRule_in_termRule2555 = new BitSet(new long[]{0x0000008000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_MUL_in_termRule2578 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_DIV_in_termRule2584 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_factorRule_in_termRule2589 = new BitSet(new long[]{0x0000008000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2623 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_orConditionRule_in_factorRule2627 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_factorRule2629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_factorRule2650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_factorRule2674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_factorRule2701 = new BitSet(new long[]{0x0090000000045010L,0x0104000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_functionParamsRule_in_factorRule2706 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_factorRule2710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_factorRule2725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valueRule2762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valueRule2782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_valueRule2801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_valueRule2815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_valueRule2827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBERSHIP_OF_in_specialFunctionRule2857 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2863 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_ERROR_in_specialFunctionRule2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2901 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2905 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2907 = new BitSet(new long[]{0x0080000000041000L,0x0004000000000800L});
	public static final BitSet FOLLOW_valueRule_in_specialFunctionRule2911 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule2913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSLATE_in_specialFunctionRule2925 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_specialFunctionRule2929 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_specialFunctionRule2933 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_specialFunctionRule2939 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2958 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_BOOLEAN_in_specialFunctionRule2962 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_COMMA_in_specialFunctionRule2982 = new BitSet(new long[]{0x0000000000001000L,0x0004000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_specialFunctionRule2987 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_specialFunctionRule2993 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_specialFunctionRule3002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayFunctionRule_in_specialFunctionRule3014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_FUNCTION_in_arrayFunctionRule3064 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_arrayFunctionRule3104 = new BitSet(new long[]{0x0010000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3133 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LB_in_arrayFunctionRule3154 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3158 = new BitSet(new long[]{0x0000000008000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3173 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_arrayFunctionRule3177 = new BitSet(new long[]{0x0000000008000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RB_in_arrayFunctionRule3201 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_arrayFunctionRule3213 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3241 = new BitSet(new long[]{0x0010010000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3247 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3269 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3273 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_DOCUMENTS_in_arrayFunctionRule3305 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3328 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3332 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayFunctionRule3351 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_arrayFunctionRule3355 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_arrayFunctionRule3393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3428 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3451 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3457 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3462 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ADD_in_restrictedExpressionRule3480 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_SUB_in_restrictedExpressionRule3486 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_restrictedTermRule_in_restrictedExpressionRule3491 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3529 = new BitSet(new long[]{0x0000008000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_MUL_in_restrictedTermRule3552 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_DIV_in_restrictedTermRule3558 = new BitSet(new long[]{0x0090000000045000L,0x0004000110000860L,0x0000000000000080L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_restrictedTermRule3563 = new BitSet(new long[]{0x0000008000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3597 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_restrictedFactorRule3601 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_restrictedFactorRule3618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRule_in_restrictedFactorRule3642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_restrictedFactorRule3667 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_restrictedFactorRule3669 = new BitSet(new long[]{0x0090000000045010L,0x0104000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_functionParamsRule_in_restrictedFactorRule3674 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_restrictedFactorRule3678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialFunctionRule_in_restrictedFactorRule3695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3738 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParamsRule3756 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_restrictedExpressionRule_in_functionParamsRule3760 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_EQ_in_comparatorRule3804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_comparatorRule3814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_comparatorRule3824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_comparatorRule3834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_comparatorRule3844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_comparatorRule3854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_numericRule3894 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SUB_in_numericRule3900 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_FLOAT_in_numericRule3913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_numericRule3919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHECK_FOR_in_checkForFuzzySetRule3946 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule3948 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule3950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule3954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule3956 = new BitSet(new long[]{0x0000000000000000L,0x00000020100000A0L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3960 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_checkForFuzzySetRule3975 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_checkForFuzzySetRule3977 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_SET_in_checkForFuzzySetRule3979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_checkForFuzzySetRule3983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_USING_in_checkForFuzzySetRule3985 = new BitSet(new long[]{0x0000000000000000L,0x00000020100000A0L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_checkForFuzzySetRule3989 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4024 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_OR_in_usingOrConditionRule4039 = new BitSet(new long[]{0x0000000000000000L,0x00000020100000A0L});
	public static final BitSet FOLLOW_usingAndConditionRule_in_usingOrConditionRule4043 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4100 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_usingAndConditionRule4116 = new BitSet(new long[]{0x0000000000000000L,0x00000020100000A0L});
	public static final BitSet FOLLOW_usingNotConditionRule_in_usingAndConditionRule4120 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_usingNotConditionRule4182 = new BitSet(new long[]{0x0000000000000000L,0x00000000100000A0L});
	public static final BitSet FOLLOW_usingPredicateRule_in_usingNotConditionRule4194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4226 = new BitSet(new long[]{0x0000000000000000L,0x00000020100000A0L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4230 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_usingPredicateRule4250 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4253 = new BitSet(new long[]{0x0090000000045010L,0x0104000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_functionParamsRule_in_usingPredicateRule4258 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_FAILS_in_usingPredicateRule4283 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_usingPredicateRule4285 = new BitSet(new long[]{0x0000000000000000L,0x00000020100000A0L});
	public static final BitSet FOLLOW_usingOrConditionRule_in_usingPredicateRule4293 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_usingPredicateRule4295 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_usingPredicateRule4299 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_usingPredicateRule4307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHACUT_in_alphaCutRule4323 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4328 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4334 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_alphaCutRule4346 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_alphaCutRule4350 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_ON_in_alphaCutRule4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_alphaCutRule4356 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_DEFUZZIFY_in_keepDropFuzzySetsRule4394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4413 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4415 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4417 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4431 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ALL_in_keepDropFuzzySetsRule4433 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4435 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROPPING_in_keepDropFuzzySetsRule4450 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4452 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4458 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4476 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_KEEPING_in_keepDropFuzzySetsRule4501 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_keepDropFuzzySetsRule4503 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SETS_in_keepDropFuzzySetsRule4505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4509 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_keepDropFuzzySetsRule4524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_keepDropFuzzySetsRule4528 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_ADD_ST_in_addFieldsRule4569 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_FIELD_in_addFieldsRule4575 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4579 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4581 = new BitSet(new long[]{0x0090004000045000L,0x0004040190001960L,0x0000000000000080L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4585 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_addFieldsRule4604 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_FIELD_in_addFieldsRule4606 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_addFieldsRule4610 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_addFieldsRule4612 = new BitSet(new long[]{0x0090004000045000L,0x0004040190001960L,0x0000000000000080L});
	public static final BitSet FOLLOW_insertFieldRule_in_addFieldsRule4616 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_insertFieldRule4652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restrictedFactorRule_in_insertFieldRule4667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTANCE_in_spatialFunctionRule4706 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4712 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4714 = new BitSet(new long[]{0x0800800000000002L,0x0000001021000002L});
	public static final BitSet FOLLOW_comparatorRule_in_spatialFunctionRule4720 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORIENTATION_in_spatialFunctionRule4748 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4750 = new BitSet(new long[]{0x0000000000000000L,0x0080000002000000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule4756 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule4762 = new BitSet(new long[]{0x0000000008000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_COMMA_in_spatialFunctionRule4768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_spatialFunctionRule4773 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_spatialFunctionRule4775 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_spatialFunctionRule4779 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDED_in_spatialFunctionRule4796 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_spatialFunctionRule4798 = new BitSet(new long[]{0x0000000000000000L,0x0080000002000000L});
	public static final BitSet FOLLOW_LEFT_in_spatialFunctionRule4804 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_spatialFunctionRule4810 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_spatialFunctionRule4813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEET_in_spatialFunctionRule4845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_spatialFunctionRule4892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setFuzzySetsRule4955 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FUZZY_in_setFuzzySetsRule4957 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SETS_in_setFuzzySetsRule4959 = new BitSet(new long[]{0x0000000000000000L,0x008000000204001CL});
	public static final BitSet FOLLOW_KEEP_in_setFuzzySetsRule4967 = new BitSet(new long[]{0x0000000000000100L,0x0080000002000000L});
	public static final BitSet FOLLOW_ALL_in_setFuzzySetsRule5004 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_setFuzzySetsRule5058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_setFuzzySetsRule5094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5125 = new BitSet(new long[]{0x0000000008000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_COMMA_in_setFuzzySetsRule5134 = new BitSet(new long[]{0x0000000000000000L,0x008000000200001CL});
	public static final BitSet FOLLOW_addFuzzySetRule_in_setFuzzySetsRule5136 = new BitSet(new long[]{0x0000000008000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_resolvingRule_in_setFuzzySetsRule5152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOLVING_in_resolvingRule5179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_WITH_in_resolvingRule5181 = new BitSet(new long[]{0x0040000000000400L,0x0000010000200000L});
	public static final BitSet FOLLOW_AND_in_resolvingRule5193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_resolvingRule5199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_resolvingRule5205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_resolvingRule5211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5243 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000020L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5249 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_addFuzzySetRule5260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5296 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINCLUDE_in_addFuzzySetRule5335 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5339 = new BitSet(new long[]{0x0000000000000000L,0x0080000002000000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5345 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5351 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5355 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWMEET_in_addFuzzySetRule5374 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5379 = new BitSet(new long[]{0x0000000000000000L,0x0080000002000000L});
	public static final BitSet FOLLOW_LEFT_in_addFuzzySetRule5385 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_addFuzzySetRule5391 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5395 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOWINTERSECT_in_addFuzzySetRule5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_addFuzzySetRule5428 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_addFuzzySetRule5430 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_addFuzzySetRule5443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_addFuzzySetRule5447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getCollectionRule5471 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLLECTION_in_getCollectionRule5473 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5485 = new BitSet(new long[]{0x0000000000010000L,0x0400000000000000L});
	public static final BitSet FOLLOW_AT_in_getCollectionRule5489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_getCollectionRule5493 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_FROM_in_getCollectionRule5524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_WEB_in_getCollectionRule5526 = new BitSet(new long[]{0x0000000000001000L,0x0004000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_getCollectionRule5531 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_getCollectionRule5537 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_getCollectionRule5550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getDictionaryRule5571 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_DICTIONARY_in_getDictionaryRule5573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5584 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AT_in_getDictionaryRule5586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5590 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_getDictionaryRule5592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_getDictionaryRule5596 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_getDictionaryRule5625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAVE_in_saveAsRule5644 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_AS_in_saveAsRule5646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5656 = new BitSet(new long[]{0x0000000000010000L,0x0400000000000000L});
	public static final BitSet FOLLOW_AT_in_saveAsRule5660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_saveAsRule5664 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_saveAsRule5684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookupFromWebRule5700 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_FROM_in_lookupFromWebRule5702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_WEB_in_lookupFromWebRule5704 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_forEachRule_in_lookupFromWebRule5720 = new BitSet(new long[]{0x0100000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_lookupFromWebRule5733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forEachRule5753 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachRule5755 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_orConditionRule_in_forEachRule5759 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_CALL_in_forEachRule5764 = new BitSet(new long[]{0x0090000000045010L,0x0004000110000860L,0x0000000000000081L});
	public static final BitSet FOLLOW_expressionRule_in_forEachRule5768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_joinOfCollectionsRule5791 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_OF_in_joinOfCollectionsRule5793 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_joinOfCollectionsRule5795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5804 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_joinOfCollectionsRule5808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_joinOfCollectionsRule5812 = new BitSet(new long[]{0x0000000000400040L,0x2420008000000000L});
	public static final BitSet FOLLOW_ON_in_joinOfCollectionsRule5824 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule5826 = new BitSet(new long[]{0x0000004000000000L,0x0000040080001100L});
	public static final BitSet FOLLOW_spatialFunctionRule_in_joinOfCollectionsRule5830 = new BitSet(new long[]{0x0000000000400040L,0x2420000000000000L});
	public static final BitSet FOLLOW_SET_in_joinOfCollectionsRule5862 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_GEOMETRY_in_joinOfCollectionsRule5864 = new BitSet(new long[]{0x0000000000000100L,0x0080000002002000L});
	public static final BitSet FOLLOW_INTERSECTION_in_joinOfCollectionsRule5870 = new BitSet(new long[]{0x0000000000400040L,0x2420000000000000L});
	public static final BitSet FOLLOW_RIGHT_in_joinOfCollectionsRule5876 = new BitSet(new long[]{0x0000000000400040L,0x2420000000000000L});
	public static final BitSet FOLLOW_LEFT_in_joinOfCollectionsRule5882 = new BitSet(new long[]{0x0000000000400040L,0x2420000000000000L});
	public static final BitSet FOLLOW_ALL_in_joinOfCollectionsRule5888 = new BitSet(new long[]{0x0000000000400040L,0x2420000000000000L});
	public static final BitSet FOLLOW_addFieldsRule_in_joinOfCollectionsRule5908 = new BitSet(new long[]{0x0000000000400000L,0x2420000000000000L});
	public static final BitSet FOLLOW_setFuzzySetsRule_in_joinOfCollectionsRule5968 = new BitSet(new long[]{0x0000000000400000L,0x0420000000000000L});
	public static final BitSet FOLLOW_caseClauseRule_in_joinOfCollectionsRule6010 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L});
	public static final BitSet FOLLOW_REMOVE_in_joinOfCollectionsRule6059 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_joinOfCollectionsRule6061 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_joinOfCollectionsRule6102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_filterRule6126 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_caseClauseRule_in_filterRule6138 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L});
	public static final BitSet FOLLOW_REMOVE_in_filterRule6156 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_filterRule6158 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_filterRule6180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupRule6201 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_groupPartitionRule_in_groupRule6226 = new BitSet(new long[]{0x0000040000000000L,0x0400200000040000L});
	public static final BitSet FOLLOW_othersRule_in_groupRule6252 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_groupRule6276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_groupPartitionRule6299 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_orConditionRule_in_groupPartitionRule6303 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6316 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6320 = new BitSet(new long[]{0x0000000008000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6345 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6349 = new BitSet(new long[]{0x0000000008000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_INTO_in_groupPartitionRule6371 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_groupPartitionRule6375 = new BitSet(new long[]{0x1000040000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_DROP_in_groupPartitionRule6396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_GROUPING_in_groupPartitionRule6398 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_FIELDS_in_groupPartitionRule6400 = new BitSet(new long[]{0x1000000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_ORDER_in_groupPartitionRule6422 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BY_in_groupPartitionRule6424 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6428 = new BitSet(new long[]{0x1000000008000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_groupPartitionRule6445 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_sortingFieldRule_in_groupPartitionRule6449 = new BitSet(new long[]{0x1000000008000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_KEEP_in_groupPartitionRule6468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_UNCOMPARABLE_in_groupPartitionRule6470 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_generateSectionRule_in_groupPartitionRule6501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRefRule_in_sortingFieldRule6532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_TYPE_in_sortingFieldRule6536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_sortingFieldRule6540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VERSUS_in_sortingFieldRule6555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_expandRule6584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_unpackRule_in_expandRule6608 = new BitSet(new long[]{0x0000040000000000L,0x0400000000040000L,0x0000000000000800L});
	public static final BitSet FOLLOW_othersRule_in_expandRule6640 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_expandRule6664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNPACK_in_unpackRule6686 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_orConditionRule_in_unpackRule6691 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ARRAY_in_unpackRule6698 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule6702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_TO_in_unpackRule6709 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_unpackRule6713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MERGE_in_mergeCollectionsRule6741 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_mergeCollectionsRule6743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6757 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_mergeCollectionsRule6779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_mergeCollectionsRule6783 = new BitSet(new long[]{0x0000000008000000L,0x0420000000000000L});
	public static final BitSet FOLLOW_REMOVE_in_mergeCollectionsRule6804 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DUPLICATES_in_mergeCollectionsRule6806 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_mergeCollectionsRule6836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_intersectCollectionsRule6856 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_intersectCollectionsRule6858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6868 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_intersectCollectionsRule6870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_intersectCollectionsRule6874 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_intersectCollectionsRule6886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBTRACT_in_subtractCollectionsRule6908 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COLLECTIONS_in_subtractCollectionsRule6910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6918 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_subtractCollectionsRule6920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_subtractCollectionsRule6924 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_subtractCollectionsRule6936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useDbRule6963 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule6973 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_useDbRule6978 = new BitSet(new long[]{0x0000000008008000L,0x0000008000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule6984 = new BitSet(new long[]{0x0000000008008000L,0x0000008000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7008 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_useDbRule7013 = new BitSet(new long[]{0x0000000008000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7019 = new BitSet(new long[]{0x0000000008000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_COMMA_in_useDbRule7100 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_DB_in_useDbRule7102 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_useDbRule7107 = new BitSet(new long[]{0x0000000008008000L,0x0000008000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7113 = new BitSet(new long[]{0x0000000008008000L,0x0000008000000000L});
	public static final BitSet FOLLOW_AS_in_useDbRule7136 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_useDbRule7141 = new BitSet(new long[]{0x0000000008000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7147 = new BitSet(new long[]{0x0000000008000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_ON_in_useDbRule7225 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_DEFAULT_in_useDbRule7237 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7239 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SERVER_in_useDbRule7251 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_useDbRule7266 = new BitSet(new long[]{0x0000000000001000L,0x0400000000000020L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7272 = new BitSet(new long[]{0x0000000000001000L,0x0400000000000020L});
	public static final BitSet FOLLOW_ID_in_useDbRule7296 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_APEX_VALUE_in_useDbRule7302 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_useDbRule7327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAJECTORY_in_trajectoryMatchingRule7352 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_MATCHING_in_trajectoryMatchingRule7354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7364 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_trajectoryMatchingRule7366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_collectionReferenceRule_in_trajectoryMatchingRule7370 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_trajectoryPartitionRule_in_trajectoryMatchingRule7386 = new BitSet(new long[]{0x0000040000000000L,0x0400200000040000L});
	public static final BitSet FOLLOW_othersRule_in_trajectoryMatchingRule7426 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_trajectoryMatchingRule7468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_trajectoryPartitionRule7496 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_orConditionRule_in_trajectoryPartitionRule7506 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_partitionMatchingRule_in_trajectoryPartitionRule7527 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_MATCHING_in_partitionMatchingRule7564 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WRT_in_partitionMatchingRule7575 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_THRESHOLD_in_partitionMatchingRule7586 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_partitionMatchingRule7588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_partitionMatchingRule7592 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_partitionMatchingRule7595 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule7599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000010000L});
	public static final BitSet FOLLOW_WHERE_in_partitionMatchingRule7614 = new BitSet(new long[]{0x0094000000045010L,0x0004002110100860L,0x00000000001C0481L});
	public static final BitSet FOLLOW_orConditionRule_in_partitionMatchingRule7618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_INTO_in_partitionMatchingRule7642 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7646 = new BitSet(new long[]{0x0000000000000022L,0x0000000400000000L});
	public static final BitSet FOLLOW_ADDING_in_partitionMatchingRule7669 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_fieldRefRule_in_partitionMatchingRule7673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_TO_in_partitionMatchingRule7675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_INPUT_in_partitionMatchingRule7677 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_MIN_SIMILARITY_in_partitionMatchingRule7699 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_partitionMatchingRule7703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameterRule7751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_TYPE_in_parameterRule7767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_parameterRule7771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_JF_in_createJavaScriptFunctionRule7796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_createJavaScriptFunctionRule7804 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createJavaScriptFunctionRule7837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule7847 = new BitSet(new long[]{0x0000000008020000L,0x0001000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createJavaScriptFunctionRule7872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_parameterRule_in_createJavaScriptFunctionRule7876 = new BitSet(new long[]{0x0000000008020000L,0x0001000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createJavaScriptFunctionRule7901 = new BitSet(new long[]{0x0080000000001010L,0x0004002010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createJavaScriptFunctionRule7905 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_BODY_in_createJavaScriptFunctionRule7919 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_END_BODY_in_createJavaScriptFunctionRule7932 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_createJavaScriptFunctionRule7938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_FO_in_createFuzzyOperatorRule7960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_createFuzzyOperatorRule7964 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_createFuzzyOperatorRule7993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8003 = new BitSet(new long[]{0x0001000008000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_parameterRule_in_createFuzzyOperatorRule8032 = new BitSet(new long[]{0x0001000008000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_PRECONDITION_in_createFuzzyOperatorRule8059 = new BitSet(new long[]{0x0080000000001010L,0x0004002010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_createFuzzyOperatorRule8063 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_EVALUATE_in_createFuzzyOperatorRule8077 = new BitSet(new long[]{0x0080000000001010L,0x0004000010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfExpressionRule_in_createFuzzyOperatorRule8081 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_POLYLINE_in_createFuzzyOperatorRule8097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LB_in_createFuzzyOperatorRule8100 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8111 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8115 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8117 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8121 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8123 = new BitSet(new long[]{0x0000000008000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8144 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_createFuzzyOperatorRule8146 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8150 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_createFuzzyOperatorRule8152 = new BitSet(new long[]{0x0080000000000010L,0x0000000000000800L,0x0000000000000001L});
	public static final BitSet FOLLOW_numericRule_in_createFuzzyOperatorRule8156 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_createFuzzyOperatorRule8158 = new BitSet(new long[]{0x0000000008000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RB_in_createFuzzyOperatorRule8178 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_SC_in_createFuzzyOperatorRule8182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule8212 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_OR_in_jfOrConditionRule8229 = new BitSet(new long[]{0x0080000000001010L,0x0004002010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfAndConditionRule_in_jfOrConditionRule8233 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule8301 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_jfAndConditionRule8319 = new BitSet(new long[]{0x0080000000001010L,0x0004002010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfNotConditionRule_in_jfAndConditionRule8323 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NOT_in_jfNotConditionRule8391 = new BitSet(new long[]{0x0080000000001010L,0x0004000010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jsfPredicateRule_in_jfNotConditionRule8402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jsfPredicateRule8440 = new BitSet(new long[]{0x0800800000000002L,0x0000001021000402L});
	public static final BitSet FOLLOW_jfCompareRule_in_jsfPredicateRule8460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inRangeRule_in_jsfPredicateRule8480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparatorRule_in_jfCompareRule8527 = new BitSet(new long[]{0x0080000000001010L,0x0004000010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfCompareRule8536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule8578 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule8601 = new BitSet(new long[]{0x0080000000001000L,0x0004000010000820L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule8607 = new BitSet(new long[]{0x0080000000001000L,0x0004000010000820L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule8612 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ADD_in_jfExpressionRule8630 = new BitSet(new long[]{0x0080000000001000L,0x0004000010000820L});
	public static final BitSet FOLLOW_SUB_in_jfExpressionRule8636 = new BitSet(new long[]{0x0080000000001000L,0x0004000010000820L});
	public static final BitSet FOLLOW_jfTermRule_in_jfExpressionRule8641 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule8681 = new BitSet(new long[]{0x0000008000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_MUL_in_jfTermRule8706 = new BitSet(new long[]{0x0080000000001000L,0x0004000010000820L});
	public static final BitSet FOLLOW_DIV_in_jfTermRule8712 = new BitSet(new long[]{0x0080000000001000L,0x0004000010000820L});
	public static final BitSet FOLLOW_jfFactorRule_in_jfTermRule8717 = new BitSet(new long[]{0x0000008000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule8757 = new BitSet(new long[]{0x0080000000001010L,0x0004002010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfOrConditionRule_in_jfFactorRule8761 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule8765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_jfFactorRule8785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_jfFactorRule8823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APEX_VALUE_in_jfFactorRule8860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_VALUE_in_jfFactorRule8894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_jfFactorRule8927 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_LP_in_jfFactorRule8966 = new BitSet(new long[]{0x0080000000001010L,0x0104000010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfFunctionParamsRule_in_jfFactorRule8971 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_jfFactorRule8977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9025 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_jfFunctionParamsRule9045 = new BitSet(new long[]{0x0080000000001010L,0x0004000010000820L,0x0000000000000001L});
	public static final BitSet FOLLOW_jfExpressionRule_in_jfFunctionParamsRule9049 = new BitSet(new long[]{0x0000000008000002L});
}
