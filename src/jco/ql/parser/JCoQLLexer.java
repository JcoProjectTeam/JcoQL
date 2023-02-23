// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2023-01-30 18:46:20

  package jco.ql.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JCoQLLexer extends Lexer {
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

	  Environment env;

	  void setEnvironment (Environment e) {
	    env = e;
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JCoQLLexer() {} 
	public JCoQLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JCoQLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1044:17: ( 'A' .. 'Z' | 'a' .. 'z' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT0"
	public final void mDIGIT0() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1045:17: ( '1' .. '9' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT0"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1046:17: ( '0' .. '9' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1048:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1048:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1048:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:5: ( 'AND' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1058:7: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1059:5: ( 'OR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1059:7: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:5: ( 'NOT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1060:7: 'NOT'
			{
			match("NOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ADDING"
	public final void mADDING() throws RecognitionException {
		try {
			int _type = ADDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:12: ( 'ADDING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1063:14: 'ADDING'
			{
			match("ADDING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDING"

	// $ANTLR start "ADD_ST"
	public final void mADD_ST() throws RecognitionException {
		try {
			int _type = ADD_ST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1064:14: ( 'ADD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1064:16: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_ST"

	// $ANTLR start "AGGREGATE"
	public final void mAGGREGATE() throws RecognitionException {
		try {
			int _type = AGGREGATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:16: ( 'AGGREGATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1065:18: 'AGGREGATE'
			{
			match("AGGREGATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AGGREGATE"

	// $ANTLR start "AGGREGATOR"
	public final void mAGGREGATOR() throws RecognitionException {
		try {
			int _type = AGGREGATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1066:14: ( 'AGGREGATOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1066:16: 'AGGREGATOR'
			{
			match("AGGREGATOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AGGREGATOR"

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1067:16: ( 'ALL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1067:18: 'ALL'
			{
			match("ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALL"

	// $ANTLR start "ALPHACUT"
	public final void mALPHACUT() throws RecognitionException {
		try {
			int _type = ALPHACUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1068:13: ( 'ALPHACUT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1068:15: 'ALPHACUT'
			{
			match("ALPHACUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHACUT"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1069:16: ( 'ARRAY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1069:18: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "ARRAY_FUNCTION"
	public final void mARRAY_FUNCTION() throws RecognitionException {
		try {
			int _type = ARRAY_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:16: ( ( 'MIN' | 'MAX' | 'AVG' | 'SUM' ) '_ARRAY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:18: ( 'MIN' | 'MAX' | 'AVG' | 'SUM' ) '_ARRAY'
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:18: ( 'MIN' | 'MAX' | 'AVG' | 'SUM' )
			int alt2=4;
			switch ( input.LA(1) ) {
			case 'M':
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='I') ) {
					alt2=1;
				}
				else if ( (LA2_1=='A') ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'A':
				{
				alt2=3;
				}
				break;
			case 'S':
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:20: 'MIN'
					{
					match("MIN"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:28: 'MAX'
					{
					match("MAX"); 

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:36: 'AVG'
					{
					match("AVG"); 

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1070:44: 'SUM'
					{
					match("SUM"); 

					}
					break;

			}

			match("_ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY_FUNCTION"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:16: ( 'AS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1071:18: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "BODY"
	public final void mBODY() throws RecognitionException {
		try {
			int _type = BODY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1072:11: ( 'BODY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1072:13: 'BODY'
			{
			match("BODY"); 

				env.disableScannerError();	
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BODY"

	// $ANTLR start "END_BODY"
	public final void mEND_BODY() throws RecognitionException {
		try {
			int _type = END_BODY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:13: ( 'END' WS 'BODY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1073:15: 'END' WS 'BODY'
			{
			match("END"); 

			mWS(); 

			match("BODY"); 

				env.enableScannerError();		
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_BODY"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1074:16: ( 'TRUE' | 'FALSE' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='T') ) {
				alt3=1;
			}
			else if ( (LA3_0=='F') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1074:18: 'TRUE'
					{
					match("TRUE"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1074:27: 'FALSE'
					{
					match("FALSE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "BUILD"
	public final void mBUILD() throws RecognitionException {
		try {
			int _type = BUILD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1075:12: ( 'BUILD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1075:14: 'BUILD'
			{
			match("BUILD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BUILD"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1076:16: ( 'BY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1076:18: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "CALL"
	public final void mCALL() throws RecognitionException {
		try {
			int _type = CALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1077:16: ( 'CALL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1077:18: 'CALL'
			{
			match("CALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CALL"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1078:16: ( 'CASE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1078:18: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CHECK_FOR"
	public final void mCHECK_FOR() throws RecognitionException {
		try {
			int _type = CHECK_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1079:14: ( 'CHECK' WS 'FOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1079:16: 'CHECK' WS 'FOR'
			{
			match("CHECK"); 

			mWS(); 

			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHECK_FOR"

	// $ANTLR start "CHECK_FOR_E"
	public final void mCHECK_FOR_E() throws RecognitionException {
		try {
			int _type = CHECK_FOR_E;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:15: ( 'CECCK' WS 'FOR' WS 'EXTENDED' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1080:17: 'CECCK' WS 'FOR' WS 'EXTENDED'
			{
			match("CECCK"); 

			mWS(); 

			match("FOR"); 

			mWS(); 

			match("EXTENDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHECK_FOR_E"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1081:12: ( 'CLASS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1081:14: 'CLASS'
			{
			match("CLASS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "COLLECTION"
	public final void mCOLLECTION() throws RecognitionException {
		try {
			int _type = COLLECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1082:16: ( 'COLLECTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1082:18: 'COLLECTION'
			{
			match("COLLECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLLECTION"

	// $ANTLR start "COLLECTIONS"
	public final void mCOLLECTIONS() throws RecognitionException {
		try {
			int _type = COLLECTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1083:16: ( 'COLLECTIONS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1083:18: 'COLLECTIONS'
			{
			match("COLLECTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLLECTIONS"

	// $ANTLR start "CREATE"
	public final void mCREATE() throws RecognitionException {
		try {
			int _type = CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1084:12: ( 'CREATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1084:14: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREATE"

	// $ANTLR start "DB"
	public final void mDB() throws RecognitionException {
		try {
			int _type = DB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1085:16: ( 'DB' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1085:18: 'DB'
			{
			match("DB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DB"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1086:13: ( 'DEFAULT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1086:15: 'DEFAULT'
			{
			match("DEFAULT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DEFUZZIFY"
	public final void mDEFUZZIFY() throws RecognitionException {
		try {
			int _type = DEFUZZIFY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1087:14: ( 'DEFUZZIFY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1087:16: 'DEFUZZIFY'
			{
			match("DEFUZZIFY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFUZZIFY"

	// $ANTLR start "DICTIONARY"
	public final void mDICTIONARY() throws RecognitionException {
		try {
			int _type = DICTIONARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1088:14: ( 'DICTIONARY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1088:16: 'DICTIONARY'
			{
			match("DICTIONARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DICTIONARY"

	// $ANTLR start "DIRECTION"
	public final void mDIRECTION() throws RecognitionException {
		try {
			int _type = DIRECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1089:14: ( 'DIRECTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1089:16: 'DIRECTION'
			{
			match("DIRECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIRECTION"

	// $ANTLR start "DISTANCE"
	public final void mDISTANCE() throws RecognitionException {
		try {
			int _type = DISTANCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:13: ( 'DISTANCE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1090:15: 'DISTANCE'
			{
			match("DISTANCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISTANCE"

	// $ANTLR start "DIVISION"
	public final void mDIVISION() throws RecognitionException {
		try {
			int _type = DIVISION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:14: ( 'DIVISION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1091:16: 'DIVISION'
			{
			match("DIVISION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVISION"

	// $ANTLR start "DOCUMENTS"
	public final void mDOCUMENTS() throws RecognitionException {
		try {
			int _type = DOCUMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1092:14: ( 'DOCUMENTS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1092:16: 'DOCUMENTS'
			{
			match("DOCUMENTS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOCUMENTS"

	// $ANTLR start "DROP"
	public final void mDROP() throws RecognitionException {
		try {
			int _type = DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1093:16: ( 'DROP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1093:18: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROP"

	// $ANTLR start "DROPPING"
	public final void mDROPPING() throws RecognitionException {
		try {
			int _type = DROPPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1094:16: ( 'DROPPING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1094:18: 'DROPPING'
			{
			match("DROPPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROPPING"

	// $ANTLR start "DUPLICATES"
	public final void mDUPLICATES() throws RecognitionException {
		try {
			int _type = DUPLICATES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1095:16: ( 'DUPLICATES' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1095:18: 'DUPLICATES'
			{
			match("DUPLICATES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DUPLICATES"

	// $ANTLR start "EACH"
	public final void mEACH() throws RecognitionException {
		try {
			int _type = EACH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1096:11: ( 'EACH' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1096:13: 'EACH'
			{
			match("EACH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EACH"

	// $ANTLR start "EXPAND"
	public final void mEXPAND() throws RecognitionException {
		try {
			int _type = EXPAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1097:16: ( 'EXPAND' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1097:18: 'EXPAND'
			{
			match("EXPAND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPAND"

	// $ANTLR start "EVALUATE"
	public final void mEVALUATE() throws RecognitionException {
		try {
			int _type = EVALUATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1098:13: ( 'EVALUATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1098:15: 'EVALUATE'
			{
			match("EVALUATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EVALUATE"

	// $ANTLR start "FIELD"
	public final void mFIELD() throws RecognitionException {
		try {
			int _type = FIELD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:12: ( 'FIELD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1099:14: 'FIELD'
			{
			match("FIELD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIELD"

	// $ANTLR start "FIELDS"
	public final void mFIELDS() throws RecognitionException {
		try {
			int _type = FIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:12: ( 'FIELDS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1100:14: 'FIELDS'
			{
			match("FIELDS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIELDS"

	// $ANTLR start "FILTER"
	public final void mFILTER() throws RecognitionException {
		try {
			int _type = FILTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:16: ( 'FILTER' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1101:18: 'FILTER'
			{
			match("FILTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILTER"

	// $ANTLR start "FIRST"
	public final void mFIRST() throws RecognitionException {
		try {
			int _type = FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1102:16: ( 'FIRST' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1102:18: 'FIRST'
			{
			match("FIRST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIRST"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1103:11: ( 'FOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1103:13: 'FOR'
			{
			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1104:11: ( 'FROM' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1104:13: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "FROM_WEB"
	public final void mFROM_WEB() throws RecognitionException {
		try {
			int _type = FROM_WEB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1105:14: ( 'FROM WEB' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1105:17: 'FROM WEB'
			{
			match("FROM WEB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM_WEB"

	// $ANTLR start "FROM_ARRAY"
	public final void mFROM_ARRAY() throws RecognitionException {
		try {
			int _type = FROM_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:14: ( 'FROM ARRAY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1106:16: 'FROM ARRAY'
			{
			match("FROM ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM_ARRAY"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1107:13: ( 'FUNCTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1107:15: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "FUZZY"
	public final void mFUZZY() throws RecognitionException {
		try {
			int _type = FUZZY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:12: ( 'FUZZY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1108:14: 'FUZZY'
			{
			match("FUZZY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUZZY"

	// $ANTLR start "GENERATE"
	public final void mGENERATE() throws RecognitionException {
		try {
			int _type = GENERATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1109:13: ( 'GENERATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1109:15: 'GENERATE'
			{
			match("GENERATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GENERATE"

	// $ANTLR start "GEOMETRY"
	public final void mGEOMETRY() throws RecognitionException {
		try {
			int _type = GEOMETRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1110:16: ( 'GEOMETRY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1110:18: 'GEOMETRY'
			{
			match("GEOMETRY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GEOMETRY"

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1111:16: ( 'GET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1111:18: 'GET'
			{
			match("GET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GET"

	// $ANTLR start "GROUP"
	public final void mGROUP() throws RecognitionException {
		try {
			int _type = GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1112:16: ( 'GROUP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1112:18: 'GROUP'
			{
			match("GROUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP"

	// $ANTLR start "GROUPING"
	public final void mGROUPING() throws RecognitionException {
		try {
			int _type = GROUPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1113:16: ( 'GROUPING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1113:18: 'GROUPING'
			{
			match("GROUPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUPING"

	// $ANTLR start "HOWINCLUDE"
	public final void mHOWINCLUDE() throws RecognitionException {
		try {
			int _type = HOWINCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1114:14: ( 'HOW_INCLUDE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1114:16: 'HOW_INCLUDE'
			{
			match("HOW_INCLUDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOWINCLUDE"

	// $ANTLR start "HOWINTERSECT"
	public final void mHOWINTERSECT() throws RecognitionException {
		try {
			int _type = HOWINTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1115:15: ( 'HOW_INTERSECT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1115:17: 'HOW_INTERSECT'
			{
			match("HOW_INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOWINTERSECT"

	// $ANTLR start "HOWMEET"
	public final void mHOWMEET() throws RecognitionException {
		try {
			int _type = HOWMEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1116:13: ( 'HOW_MEET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1116:15: 'HOW_MEET'
			{
			match("HOW_MEET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOWMEET"

	// $ANTLR start "IF_ERROR"
	public final void mIF_ERROR() throws RecognitionException {
		try {
			int _type = IF_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1117:13: ( 'IF_ERROR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1117:15: 'IF_ERROR'
			{
			match("IF_ERROR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_ERROR"

	// $ANTLR start "IF_FAILS"
	public final void mIF_FAILS() throws RecognitionException {
		try {
			int _type = IF_FAILS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1118:13: ( 'IF_FAILS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1118:15: 'IF_FAILS'
			{
			match("IF_FAILS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_FAILS"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1119:12: ( 'IMPORT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1119:14: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPORT"

	// $ANTLR start "INCLUDED"
	public final void mINCLUDED() throws RecognitionException {
		try {
			int _type = INCLUDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1120:16: ( 'INCLUDED' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1120:18: 'INCLUDED'
			{
			match("INCLUDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDED"

	// $ANTLR start "INPUT"
	public final void mINPUT() throws RecognitionException {
		try {
			int _type = INPUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1121:15: ( 'INPUT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1121:17: 'INPUT'
			{
			match("INPUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INPUT"

	// $ANTLR start "INRANGE"
	public final void mINRANGE() throws RecognitionException {
		try {
			int _type = INRANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1122:16: ( 'IN_RANGE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1122:18: 'IN_RANGE'
			{
			match("IN_RANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INRANGE"

	// $ANTLR start "INTERSECT"
	public final void mINTERSECT() throws RecognitionException {
		try {
			int _type = INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1123:14: ( 'INTERSECT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1123:16: 'INTERSECT'
			{
			match("INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERSECT"

	// $ANTLR start "INTERSECTION"
	public final void mINTERSECTION() throws RecognitionException {
		try {
			int _type = INTERSECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1124:16: ( 'INTERSECTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1124:18: 'INTERSECTION'
			{
			match("INTERSECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERSECTION"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1125:10: ( 'IN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1125:12: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1126:16: ( 'INTO' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1126:18: 'INTO'
			{
			match("INTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTO"

	// $ANTLR start "ISNULL"
	public final void mISNULL() throws RecognitionException {
		try {
			int _type = ISNULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1127:12: ( 'IS' WS 'NULL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1127:14: 'IS' WS 'NULL'
			{
			match("IS"); 

			mWS(); 

			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISNULL"

	// $ANTLR start "ISNOTNULL"
	public final void mISNOTNULL() throws RecognitionException {
		try {
			int _type = ISNOTNULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1128:14: ( 'IS' WS 'NOT' WS 'NULL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1128:16: 'IS' WS 'NOT' WS 'NULL'
			{
			match("IS"); 

			mWS(); 

			match("NOT"); 

			mWS(); 

			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISNOTNULL"

	// $ANTLR start "JOIN"
	public final void mJOIN() throws RecognitionException {
		try {
			int _type = JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1129:16: ( 'JOIN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1129:18: 'JOIN'
			{
			match("JOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOIN"

	// $ANTLR start "JAVA"
	public final void mJAVA() throws RecognitionException {
		try {
			int _type = JAVA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1130:11: ( 'JAVA' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1130:13: 'JAVA'
			{
			match("JAVA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JAVA"

	// $ANTLR start "JAVASCRIPT"
	public final void mJAVASCRIPT() throws RecognitionException {
		try {
			int _type = JAVASCRIPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1131:14: ( 'JAVASCRIPT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1131:16: 'JAVASCRIPT'
			{
			match("JAVASCRIPT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JAVASCRIPT"

	// $ANTLR start "KEEP"
	public final void mKEEP() throws RecognitionException {
		try {
			int _type = KEEP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1132:16: ( 'KEEP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1132:18: 'KEEP'
			{
			match("KEEP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEEP"

	// $ANTLR start "KEEPING"
	public final void mKEEPING() throws RecognitionException {
		try {
			int _type = KEEPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1133:16: ( 'KEEPING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1133:18: 'KEEPING'
			{
			match("KEEPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEEPING"

	// $ANTLR start "KNOWN"
	public final void mKNOWN() throws RecognitionException {
		try {
			int _type = KNOWN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1134:12: ( 'KNOWN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1134:14: 'KNOWN'
			{
			match("KNOWN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KNOWN"

	// $ANTLR start "LAST"
	public final void mLAST() throws RecognitionException {
		try {
			int _type = LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1135:16: ( 'LAST' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1135:18: 'LAST'
			{
			match("LAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAST"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1136:16: ( 'LEFT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1136:18: 'LEFT'
			{
			match("LEFT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT"

	// $ANTLR start "LOCALLY"
	public final void mLOCALLY() throws RecognitionException {
		try {
			int _type = LOCALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1137:13: ( 'LOCALLY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1137:15: 'LOCALLY'
			{
			match("LOCALLY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCALLY"

	// $ANTLR start "LOOKUP"
	public final void mLOOKUP() throws RecognitionException {
		try {
			int _type = LOOKUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1138:13: ( 'LOOKUP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1138:15: 'LOOKUP'
			{
			match("LOOKUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOOKUP"

	// $ANTLR start "MATCHING"
	public final void mMATCHING() throws RecognitionException {
		try {
			int _type = MATCHING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:16: ( 'MATCHING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1139:18: 'MATCHING'
			{
			match("MATCHING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MATCHING"

	// $ANTLR start "MAXIMUM"
	public final void mMAXIMUM() throws RecognitionException {
		try {
			int _type = MAXIMUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1140:13: ( 'MAXIMUM' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1140:15: 'MAXIMUM'
			{
			match("MAXIMUM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAXIMUM"

	// $ANTLR start "MEET"
	public final void mMEET() throws RecognitionException {
		try {
			int _type = MEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1141:16: ( 'MEET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1141:18: 'MEET'
			{
			match("MEET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEET"

	// $ANTLR start "MEMBERSHIP_OF"
	public final void mMEMBERSHIP_OF() throws RecognitionException {
		try {
			int _type = MEMBERSHIP_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1142:16: ( 'MEMBERSHIP_OF' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1142:18: 'MEMBERSHIP_OF'
			{
			match("MEMBERSHIP_OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEMBERSHIP_OF"

	// $ANTLR start "MERGE"
	public final void mMERGE() throws RecognitionException {
		try {
			int _type = MERGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1143:16: ( 'MERGE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1143:18: 'MERGE'
			{
			match("MERGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MERGE"

	// $ANTLR start "MIN_SIMILARITY"
	public final void mMIN_SIMILARITY() throws RecognitionException {
		try {
			int _type = MIN_SIMILARITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:16: ( 'MIN' WS 'SIMILARITY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1144:18: 'MIN' WS 'SIMILARITY'
			{
			match("MIN"); 

			mWS(); 

			match("SIMILARITY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN_SIMILARITY"

	// $ANTLR start "MINIMUM"
	public final void mMINIMUM() throws RecognitionException {
		try {
			int _type = MINIMUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1145:13: ( 'MINIMUM' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1145:15: 'MINIMUM'
			{
			match("MINIMUM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINIMUM"

	// $ANTLR start "OF"
	public final void mOF() throws RecognitionException {
		try {
			int _type = OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1146:16: ( 'OF' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1146:18: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OF"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1147:16: ( 'ON' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1147:18: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "OPERATOR"
	public final void mOPERATOR() throws RecognitionException {
		try {
			int _type = OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1148:14: ( 'OPERATOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1148:16: 'OPERATOR'
			{
			match("OPERATOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERATOR"

	// $ANTLR start "ORIENTATION"
	public final void mORIENTATION() throws RecognitionException {
		try {
			int _type = ORIENTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1149:17: ( 'ORIENTATION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1149:19: 'ORIENTATION'
			{
			match("ORIENTATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORIENTATION"

	// $ANTLR start "OTHERS"
	public final void mOTHERS() throws RecognitionException {
		try {
			int _type = OTHERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1150:12: ( 'OTHERS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1150:14: 'OTHERS'
			{
			match("OTHERS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHERS"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:12: ( 'ORDER' | 'SORTED' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='O') ) {
				alt4=1;
			}
			else if ( (LA4_0=='S') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:14: 'ORDER'
					{
					match("ORDER"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1151:24: 'SORTED'
					{
					match("SORTED"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDER"

	// $ANTLR start "PARAMETERS"
	public final void mPARAMETERS() throws RecognitionException {
		try {
			int _type = PARAMETERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1152:14: ( 'PARAMETERS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1152:16: 'PARAMETERS'
			{
			match("PARAMETERS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARAMETERS"

	// $ANTLR start "PARTITION"
	public final void mPARTITION() throws RecognitionException {
		try {
			int _type = PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1153:14: ( 'PARTITION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1153:16: 'PARTITION'
			{
			match("PARTITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARTITION"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1154:12: ( 'POINT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1154:14: 'POINT'
			{
			match("POINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "POLYLINE"
	public final void mPOLYLINE() throws RecognitionException {
		try {
			int _type = POLYLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1155:13: ( 'POLYLINE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1155:15: 'POLYLINE'
			{
			match("POLYLINE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POLYLINE"

	// $ANTLR start "POS"
	public final void mPOS() throws RecognitionException {
		try {
			int _type = POS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1156:7: ( 'POS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1156:9: 'POS'
			{
			match("POS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POS"

	// $ANTLR start "PRECONDITION"
	public final void mPRECONDITION() throws RecognitionException {
		try {
			int _type = PRECONDITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1157:15: ( 'PRECONDITION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1157:17: 'PRECONDITION'
			{
			match("PRECONDITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRECONDITION"

	// $ANTLR start "PRODUCT"
	public final void mPRODUCT() throws RecognitionException {
		try {
			int _type = PRODUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:11: ( 'PRODUCT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1158:13: 'PRODUCT'
			{
			match("PRODUCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRODUCT"

	// $ANTLR start "RESOLVING"
	public final void mRESOLVING() throws RecognitionException {
		try {
			int _type = RESOLVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1159:14: ( 'RESOLVING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1159:16: 'RESOLVING'
			{
			match("RESOLVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESOLVING"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1160:16: ( 'RIGHT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1160:18: 'RIGHT'
			{
			match("RIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT"

	// $ANTLR start "REMOVE"
	public final void mREMOVE() throws RecognitionException {
		try {
			int _type = REMOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1161:16: ( 'REMOVE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1161:18: 'REMOVE'
			{
			match("REMOVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REMOVE"

	// $ANTLR start "SAVE"
	public final void mSAVE() throws RecognitionException {
		try {
			int _type = SAVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1162:16: ( 'SAVE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1162:18: 'SAVE'
			{
			match("SAVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SAVE"

	// $ANTLR start "SERVER"
	public final void mSERVER() throws RecognitionException {
		try {
			int _type = SERVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1163:16: ( 'SERVER' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1163:18: 'SERVER'
			{
			match("SERVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SERVER"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1164:16: ( 'SET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1164:18: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "SETS"
	public final void mSETS() throws RecognitionException {
		try {
			int _type = SETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1165:16: ( 'SETS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1165:18: 'SETS'
			{
			match("SETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETS"

	// $ANTLR start "SETTING"
	public final void mSETTING() throws RecognitionException {
		try {
			int _type = SETTING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1166:16: ( 'SETTING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1166:18: 'SETTING'
			{
			match("SETTING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETTING"

	// $ANTLR start "SORT"
	public final void mSORT() throws RecognitionException {
		try {
			int _type = SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1167:8: ( 'SORT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1167:10: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SORT"

	// $ANTLR start "SUBTRACT"
	public final void mSUBTRACT() throws RecognitionException {
		try {
			int _type = SUBTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1168:16: ( 'SUBTRACT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1168:18: 'SUBTRACT'
			{
			match("SUBTRACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBTRACT"

	// $ANTLR start "SUBTRACTION"
	public final void mSUBTRACTION() throws RecognitionException {
		try {
			int _type = SUBTRACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1169:14: ( 'SUBTRACTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1169:16: 'SUBTRACTION'
			{
			match("SUBTRACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBTRACTION"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1170:7: ( 'SUM' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1170:9: 'SUM'
			{
			match("SUM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1171:16: ( 'TO' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1171:18: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "TO_POLYLINE"
	public final void mTO_POLYLINE() throws RecognitionException {
		try {
			int _type = TO_POLYLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1172:16: ( 'TO_POLYLINE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1172:18: 'TO_POLYLINE'
			{
			match("TO_POLYLINE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO_POLYLINE"

	// $ANTLR start "THRESHOLD"
	public final void mTHRESHOLD() throws RecognitionException {
		try {
			int _type = THRESHOLD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1173:16: ( 'THRESHOLD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1173:18: 'THRESHOLD'
			{
			match("THRESHOLD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THRESHOLD"

	// $ANTLR start "THROUGH"
	public final void mTHROUGH() throws RecognitionException {
		try {
			int _type = THROUGH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1174:11: ( 'THROUGH' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1174:13: 'THROUGH'
			{
			match("THROUGH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROUGH"

	// $ANTLR start "TRANSLATE"
	public final void mTRANSLATE() throws RecognitionException {
		try {
			int _type = TRANSLATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1175:14: ( 'TRANSLATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1175:16: 'TRANSLATE'
			{
			match("TRANSLATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSLATE"

	// $ANTLR start "TRAJECTORY"
	public final void mTRAJECTORY() throws RecognitionException {
		try {
			int _type = TRAJECTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1176:16: ( 'TRAJECTORY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1176:18: 'TRAJECTORY'
			{
			match("TRAJECTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRAJECTORY"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1177:11: ( 'TYPE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1177:13: 'TYPE'
			{
			match("TYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "UNCOMPARABLE"
	public final void mUNCOMPARABLE() throws RecognitionException {
		try {
			int _type = UNCOMPARABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1178:15: ( 'UNCOMPARABLE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1178:17: 'UNCOMPARABLE'
			{
			match("UNCOMPARABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNCOMPARABLE"

	// $ANTLR start "UNKNOWN"
	public final void mUNKNOWN() throws RecognitionException {
		try {
			int _type = UNKNOWN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1179:13: ( 'UNKNOWN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1179:15: 'UNKNOWN'
			{
			match("UNKNOWN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNKNOWN"

	// $ANTLR start "UNPACK"
	public final void mUNPACK() throws RecognitionException {
		try {
			int _type = UNPACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1180:16: ( 'UNPACK' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1180:18: 'UNPACK'
			{
			match("UNPACK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNPACK"

	// $ANTLR start "USE"
	public final void mUSE() throws RecognitionException {
		try {
			int _type = USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:16: ( 'USE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1181:18: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USE"

	// $ANTLR start "USING"
	public final void mUSING() throws RecognitionException {
		try {
			int _type = USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:16: ( 'USING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1182:18: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USING"

	// $ANTLR start "VERSUS"
	public final void mVERSUS() throws RecognitionException {
		try {
			int _type = VERSUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:16: ( 'DESC' | 'ASC' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='D') ) {
				alt5=1;
			}
			else if ( (LA5_0=='A') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:18: 'DESC'
					{
					match("DESC"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1183:27: 'ASC'
					{
					match("ASC"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERSUS"

	// $ANTLR start "WEB"
	public final void mWEB() throws RecognitionException {
		try {
			int _type = WEB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1184:11: ( 'WEB' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1184:13: 'WEB'
			{
			match("WEB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WEB"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1185:17: ( 'WHERE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1185:19: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "WITH"
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1186:16: ( 'WITH' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1186:18: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITH"

	// $ANTLR start "WITHIN"
	public final void mWITHIN() throws RecognitionException {
		try {
			int _type = WITHIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1187:16: ( 'WITHIN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1187:18: 'WITHIN'
			{
			match("WITHIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITHIN"

	// $ANTLR start "WITHOUT"
	public final void mWITHOUT() throws RecognitionException {
		try {
			int _type = WITHOUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1188:16: ( 'WITHOUT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1188:18: 'WITHOUT'
			{
			match("WITHOUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITHOUT"

	// $ANTLR start "WRT"
	public final void mWRT() throws RecognitionException {
		try {
			int _type = WRT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1189:16: ( 'WRT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1189:18: 'WRT'
			{
			match("WRT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1191:7: ( '0' | DIGIT0 ( DIGIT )* )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1191:9: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1191:15: DIGIT0 ( DIGIT )*
					{
					mDIGIT0(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1191:22: ( DIGIT )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1192:8: ( DIGIT0 ( DIGIT )* DOT ( DIGIT )+ | '0' DOT ( DIGIT )+ )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= '1' && LA11_0 <= '9')) ) {
				alt11=1;
			}
			else if ( (LA11_0=='0') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1192:10: DIGIT0 ( DIGIT )* DOT ( DIGIT )+
					{
					mDIGIT0(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1192:17: ( DIGIT )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop8;
						}
					}

					mDOT(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1192:28: ( DIGIT )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1192:37: '0' DOT ( DIGIT )+
					{
					match('0'); 
					mDOT(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1192:45: ( DIGIT )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1194:6: ( LETTER ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1194:8: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1194:15: ( LETTER | DIGIT | '_' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FIELD_NAME"
	public final void mFIELD_NAME() throws RecognitionException {
		try {
			int _type = FIELD_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1196:13: ( DOT ( LETTER | DIGIT | TILDE | '_' )+ | DOT '\"' (~ ( '\"' ) )* '\"' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='.') ) {
				int LA15_1 = input.LA(2);
				if ( ((LA15_1 >= '0' && LA15_1 <= '9')||(LA15_1 >= 'A' && LA15_1 <= 'Z')||LA15_1=='_'||(LA15_1 >= 'a' && LA15_1 <= 'z')||LA15_1=='~') ) {
					alt15=1;
				}
				else if ( (LA15_1=='\"') ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1196:15: DOT ( LETTER | DIGIT | TILDE | '_' )+
					{
					mDOT(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1196:19: ( LETTER | DIGIT | TILDE | '_' )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')||LA13_0=='~') ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1197:16: DOT '\"' (~ ( '\"' ) )* '\"'
					{
					mDOT(); 

					match('\"'); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1197:24: (~ ( '\"' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop14;
						}
					}

					match('\"'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIELD_NAME"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1202:7: ( '@' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1202:9: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1203:7: ( '=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1203:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1204:7: ( '!=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1204:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1205:7: ( '<=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1205:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:7: ( '>=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1206:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1207:7: ( '<' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1207:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1208:7: ( '>' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1208:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1209:7: ( '.' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1209:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1210:7: ( '+' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1210:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1211:7: ( '-' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1211:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1212:7: ( '*' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1212:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:7: ( '/' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1213:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:7: ( ',' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1214:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1215:7: ( ':' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1215:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1216:7: ( ';' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1216:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1217:7: ( '(' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1217:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1218:7: ( ')' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1218:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1219:7: ( '[' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1219:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1220:7: ( ']' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1220:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "LBR"
	public final void mLBR() throws RecognitionException {
		try {
			int _type = LBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1221:7: ( '{' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1221:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBR"

	// $ANTLR start "RBR"
	public final void mRBR() throws RecognitionException {
		try {
			int _type = RBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:7: ( '}' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1222:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBR"

	// $ANTLR start "APEX"
	public final void mAPEX() throws RecognitionException {
		try {
			int _type = APEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1223:7: ( '\\'' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1223:9: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APEX"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1224:7: ( '\"' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1224:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1225:7: ( '~' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1225:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "XXX"
	public final void mXXX() throws RecognitionException {
		try {
			int _type = XXX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1226:7: ( '###TEST***' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1226:9: '###TEST***'
			{
			match("###TEST***"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XXX"

	// $ANTLR start "WHITE_SPACES"
	public final void mWHITE_SPACES() throws RecognitionException {
		try {
			int _type = WHITE_SPACES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1231:3: ( WS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1231:5: WS
			{
			mWS(); 

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITE_SPACES"

	// $ANTLR start "APEX_VALUE"
	public final void mAPEX_VALUE() throws RecognitionException {
		try {
			int _type = APEX_VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1234:3: ( '\\'' (~ ( '\\'' ) )* '\\'' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1234:6: '\\'' (~ ( '\\'' ) )* '\\''
			{
			match('\''); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1234:11: (~ ( '\\'' ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\u0000' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APEX_VALUE"

	// $ANTLR start "QUOTED_VALUE"
	public final void mQUOTED_VALUE() throws RecognitionException {
		try {
			int _type = QUOTED_VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1237:3: ( '\"' (~ ( '\"' ) )* '\"' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1237:6: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1237:10: (~ ( '\"' ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '\u0000' && LA17_0 <= '!')||(LA17_0 >= '#' && LA17_0 <= '\uFFFF')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTED_VALUE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1240:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='/') ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1=='/') ) {
					alt21=1;
				}
				else if ( (LA21_1=='*') ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1240:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1240:14: (~ ( '\\n' | '\\r' ) )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\t')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '\uFFFF')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop18;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1240:28: ( '\\r' )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='\r') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1240:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
						_channel = HIDDEN;	
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1241:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1241:14: ( options {greedy=false; } : . )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0=='*') ) {
							int LA20_1 = input.LA(2);
							if ( (LA20_1=='/') ) {
								alt20=2;
							}
							else if ( ((LA20_1 >= '\u0000' && LA20_1 <= '.')||(LA20_1 >= '0' && LA20_1 <= '\uFFFF')) ) {
								alt20=1;
							}

						}
						else if ( ((LA20_0 >= '\u0000' && LA20_0 <= ')')||(LA20_0 >= '+' && LA20_0 <= '\uFFFF')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1241:46: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop20;
						}
					}

					match("*/"); 

						_channel = HIDDEN;	
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1246:3: ( . )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1246:5: .
			{
			matchAny(); 
			 env.myScannerErrorHandler(getLine(), getCharPositionInLine(), getText());	
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:8: ( AND | OR | NOT | ADDING | ADD_ST | AGGREGATE | AGGREGATOR | ALL | ALPHACUT | ARRAY | ARRAY_FUNCTION | AS | BODY | END_BODY | BOOLEAN | BUILD | BY | CALL | CASE | CHECK_FOR | CHECK_FOR_E | CLASS | COLLECTION | COLLECTIONS | CREATE | DB | DEFAULT | DEFUZZIFY | DICTIONARY | DIRECTION | DISTANCE | DIVISION | DOCUMENTS | DROP | DROPPING | DUPLICATES | EACH | EXPAND | EVALUATE | FIELD | FIELDS | FILTER | FIRST | FOR | FROM | FROM_WEB | FROM_ARRAY | FUNCTION | FUZZY | GENERATE | GEOMETRY | GET | GROUP | GROUPING | HOWINCLUDE | HOWINTERSECT | HOWMEET | IF_ERROR | IF_FAILS | IMPORT | INCLUDED | INPUT | INRANGE | INTERSECT | INTERSECTION | IN | INTO | ISNULL | ISNOTNULL | JOIN | JAVA | JAVASCRIPT | KEEP | KEEPING | KNOWN | LAST | LEFT | LOCALLY | LOOKUP | MATCHING | MAXIMUM | MEET | MEMBERSHIP_OF | MERGE | MIN_SIMILARITY | MINIMUM | OF | ON | OPERATOR | ORIENTATION | OTHERS | ORDER | PARAMETERS | PARTITION | POINT | POLYLINE | POS | PRECONDITION | PRODUCT | RESOLVING | RIGHT | REMOVE | SAVE | SERVER | SET | SETS | SETTING | SORT | SUBTRACT | SUBTRACTION | SUM | TO | TO_POLYLINE | THRESHOLD | THROUGH | TRANSLATE | TRAJECTORY | TYPE | UNCOMPARABLE | UNKNOWN | UNPACK | USE | USING | VERSUS | WEB | WHERE | WITH | WITHIN | WITHOUT | WRT | INT | FLOAT | ID | FIELD_NAME | AT | EQ | NEQ | LE | GE | LT | GT | DOT | ADD | SUB | MUL | DIV | COMMA | COLON | SC | LP | RP | LB | RB | LBR | RBR | APEX | QUOTE | TILDE | XXX | WHITE_SPACES | APEX_VALUE | QUOTED_VALUE | COMMENT | SCAN_ERROR )
		int alt22=164;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:14: OR
				{
				mOR(); 

				}
				break;
			case 3 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:17: NOT
				{
				mNOT(); 

				}
				break;
			case 4 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:21: ADDING
				{
				mADDING(); 

				}
				break;
			case 5 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:28: ADD_ST
				{
				mADD_ST(); 

				}
				break;
			case 6 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:35: AGGREGATE
				{
				mAGGREGATE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:45: AGGREGATOR
				{
				mAGGREGATOR(); 

				}
				break;
			case 8 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:56: ALL
				{
				mALL(); 

				}
				break;
			case 9 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:60: ALPHACUT
				{
				mALPHACUT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:69: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 11 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:75: ARRAY_FUNCTION
				{
				mARRAY_FUNCTION(); 

				}
				break;
			case 12 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:90: AS
				{
				mAS(); 

				}
				break;
			case 13 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:93: BODY
				{
				mBODY(); 

				}
				break;
			case 14 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:98: END_BODY
				{
				mEND_BODY(); 

				}
				break;
			case 15 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:107: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 16 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:115: BUILD
				{
				mBUILD(); 

				}
				break;
			case 17 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:121: BY
				{
				mBY(); 

				}
				break;
			case 18 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:124: CALL
				{
				mCALL(); 

				}
				break;
			case 19 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:129: CASE
				{
				mCASE(); 

				}
				break;
			case 20 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:134: CHECK_FOR
				{
				mCHECK_FOR(); 

				}
				break;
			case 21 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:144: CHECK_FOR_E
				{
				mCHECK_FOR_E(); 

				}
				break;
			case 22 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:156: CLASS
				{
				mCLASS(); 

				}
				break;
			case 23 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:162: COLLECTION
				{
				mCOLLECTION(); 

				}
				break;
			case 24 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:173: COLLECTIONS
				{
				mCOLLECTIONS(); 

				}
				break;
			case 25 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:185: CREATE
				{
				mCREATE(); 

				}
				break;
			case 26 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:192: DB
				{
				mDB(); 

				}
				break;
			case 27 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:195: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 28 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:203: DEFUZZIFY
				{
				mDEFUZZIFY(); 

				}
				break;
			case 29 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:213: DICTIONARY
				{
				mDICTIONARY(); 

				}
				break;
			case 30 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:224: DIRECTION
				{
				mDIRECTION(); 

				}
				break;
			case 31 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:234: DISTANCE
				{
				mDISTANCE(); 

				}
				break;
			case 32 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:243: DIVISION
				{
				mDIVISION(); 

				}
				break;
			case 33 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:252: DOCUMENTS
				{
				mDOCUMENTS(); 

				}
				break;
			case 34 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:262: DROP
				{
				mDROP(); 

				}
				break;
			case 35 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:267: DROPPING
				{
				mDROPPING(); 

				}
				break;
			case 36 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:276: DUPLICATES
				{
				mDUPLICATES(); 

				}
				break;
			case 37 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:287: EACH
				{
				mEACH(); 

				}
				break;
			case 38 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:292: EXPAND
				{
				mEXPAND(); 

				}
				break;
			case 39 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:299: EVALUATE
				{
				mEVALUATE(); 

				}
				break;
			case 40 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:308: FIELD
				{
				mFIELD(); 

				}
				break;
			case 41 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:314: FIELDS
				{
				mFIELDS(); 

				}
				break;
			case 42 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:321: FILTER
				{
				mFILTER(); 

				}
				break;
			case 43 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:328: FIRST
				{
				mFIRST(); 

				}
				break;
			case 44 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:334: FOR
				{
				mFOR(); 

				}
				break;
			case 45 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:338: FROM
				{
				mFROM(); 

				}
				break;
			case 46 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:343: FROM_WEB
				{
				mFROM_WEB(); 

				}
				break;
			case 47 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:352: FROM_ARRAY
				{
				mFROM_ARRAY(); 

				}
				break;
			case 48 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:363: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 49 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:372: FUZZY
				{
				mFUZZY(); 

				}
				break;
			case 50 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:378: GENERATE
				{
				mGENERATE(); 

				}
				break;
			case 51 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:387: GEOMETRY
				{
				mGEOMETRY(); 

				}
				break;
			case 52 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:396: GET
				{
				mGET(); 

				}
				break;
			case 53 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:400: GROUP
				{
				mGROUP(); 

				}
				break;
			case 54 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:406: GROUPING
				{
				mGROUPING(); 

				}
				break;
			case 55 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:415: HOWINCLUDE
				{
				mHOWINCLUDE(); 

				}
				break;
			case 56 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:426: HOWINTERSECT
				{
				mHOWINTERSECT(); 

				}
				break;
			case 57 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:439: HOWMEET
				{
				mHOWMEET(); 

				}
				break;
			case 58 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:447: IF_ERROR
				{
				mIF_ERROR(); 

				}
				break;
			case 59 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:456: IF_FAILS
				{
				mIF_FAILS(); 

				}
				break;
			case 60 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:465: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 61 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:472: INCLUDED
				{
				mINCLUDED(); 

				}
				break;
			case 62 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:481: INPUT
				{
				mINPUT(); 

				}
				break;
			case 63 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:487: INRANGE
				{
				mINRANGE(); 

				}
				break;
			case 64 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:495: INTERSECT
				{
				mINTERSECT(); 

				}
				break;
			case 65 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:505: INTERSECTION
				{
				mINTERSECTION(); 

				}
				break;
			case 66 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:518: IN
				{
				mIN(); 

				}
				break;
			case 67 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:521: INTO
				{
				mINTO(); 

				}
				break;
			case 68 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:526: ISNULL
				{
				mISNULL(); 

				}
				break;
			case 69 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:533: ISNOTNULL
				{
				mISNOTNULL(); 

				}
				break;
			case 70 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:543: JOIN
				{
				mJOIN(); 

				}
				break;
			case 71 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:548: JAVA
				{
				mJAVA(); 

				}
				break;
			case 72 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:553: JAVASCRIPT
				{
				mJAVASCRIPT(); 

				}
				break;
			case 73 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:564: KEEP
				{
				mKEEP(); 

				}
				break;
			case 74 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:569: KEEPING
				{
				mKEEPING(); 

				}
				break;
			case 75 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:577: KNOWN
				{
				mKNOWN(); 

				}
				break;
			case 76 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:583: LAST
				{
				mLAST(); 

				}
				break;
			case 77 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:588: LEFT
				{
				mLEFT(); 

				}
				break;
			case 78 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:593: LOCALLY
				{
				mLOCALLY(); 

				}
				break;
			case 79 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:601: LOOKUP
				{
				mLOOKUP(); 

				}
				break;
			case 80 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:608: MATCHING
				{
				mMATCHING(); 

				}
				break;
			case 81 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:617: MAXIMUM
				{
				mMAXIMUM(); 

				}
				break;
			case 82 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:625: MEET
				{
				mMEET(); 

				}
				break;
			case 83 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:630: MEMBERSHIP_OF
				{
				mMEMBERSHIP_OF(); 

				}
				break;
			case 84 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:644: MERGE
				{
				mMERGE(); 

				}
				break;
			case 85 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:650: MIN_SIMILARITY
				{
				mMIN_SIMILARITY(); 

				}
				break;
			case 86 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:665: MINIMUM
				{
				mMINIMUM(); 

				}
				break;
			case 87 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:673: OF
				{
				mOF(); 

				}
				break;
			case 88 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:676: ON
				{
				mON(); 

				}
				break;
			case 89 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:679: OPERATOR
				{
				mOPERATOR(); 

				}
				break;
			case 90 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:688: ORIENTATION
				{
				mORIENTATION(); 

				}
				break;
			case 91 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:700: OTHERS
				{
				mOTHERS(); 

				}
				break;
			case 92 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:707: ORDER
				{
				mORDER(); 

				}
				break;
			case 93 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:713: PARAMETERS
				{
				mPARAMETERS(); 

				}
				break;
			case 94 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:724: PARTITION
				{
				mPARTITION(); 

				}
				break;
			case 95 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:734: POINT
				{
				mPOINT(); 

				}
				break;
			case 96 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:740: POLYLINE
				{
				mPOLYLINE(); 

				}
				break;
			case 97 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:749: POS
				{
				mPOS(); 

				}
				break;
			case 98 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:753: PRECONDITION
				{
				mPRECONDITION(); 

				}
				break;
			case 99 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:766: PRODUCT
				{
				mPRODUCT(); 

				}
				break;
			case 100 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:774: RESOLVING
				{
				mRESOLVING(); 

				}
				break;
			case 101 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:784: RIGHT
				{
				mRIGHT(); 

				}
				break;
			case 102 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:790: REMOVE
				{
				mREMOVE(); 

				}
				break;
			case 103 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:797: SAVE
				{
				mSAVE(); 

				}
				break;
			case 104 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:802: SERVER
				{
				mSERVER(); 

				}
				break;
			case 105 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:809: SET
				{
				mSET(); 

				}
				break;
			case 106 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:813: SETS
				{
				mSETS(); 

				}
				break;
			case 107 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:818: SETTING
				{
				mSETTING(); 

				}
				break;
			case 108 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:826: SORT
				{
				mSORT(); 

				}
				break;
			case 109 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:831: SUBTRACT
				{
				mSUBTRACT(); 

				}
				break;
			case 110 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:840: SUBTRACTION
				{
				mSUBTRACTION(); 

				}
				break;
			case 111 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:852: SUM
				{
				mSUM(); 

				}
				break;
			case 112 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:856: TO
				{
				mTO(); 

				}
				break;
			case 113 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:859: TO_POLYLINE
				{
				mTO_POLYLINE(); 

				}
				break;
			case 114 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:871: THRESHOLD
				{
				mTHRESHOLD(); 

				}
				break;
			case 115 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:881: THROUGH
				{
				mTHROUGH(); 

				}
				break;
			case 116 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:889: TRANSLATE
				{
				mTRANSLATE(); 

				}
				break;
			case 117 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:899: TRAJECTORY
				{
				mTRAJECTORY(); 

				}
				break;
			case 118 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:910: TYPE
				{
				mTYPE(); 

				}
				break;
			case 119 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:915: UNCOMPARABLE
				{
				mUNCOMPARABLE(); 

				}
				break;
			case 120 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:928: UNKNOWN
				{
				mUNKNOWN(); 

				}
				break;
			case 121 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:936: UNPACK
				{
				mUNPACK(); 

				}
				break;
			case 122 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:943: USE
				{
				mUSE(); 

				}
				break;
			case 123 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:947: USING
				{
				mUSING(); 

				}
				break;
			case 124 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:953: VERSUS
				{
				mVERSUS(); 

				}
				break;
			case 125 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:960: WEB
				{
				mWEB(); 

				}
				break;
			case 126 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:964: WHERE
				{
				mWHERE(); 

				}
				break;
			case 127 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:970: WITH
				{
				mWITH(); 

				}
				break;
			case 128 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:975: WITHIN
				{
				mWITHIN(); 

				}
				break;
			case 129 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:982: WITHOUT
				{
				mWITHOUT(); 

				}
				break;
			case 130 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:990: WRT
				{
				mWRT(); 

				}
				break;
			case 131 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:994: INT
				{
				mINT(); 

				}
				break;
			case 132 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:998: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 133 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1004: ID
				{
				mID(); 

				}
				break;
			case 134 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1007: FIELD_NAME
				{
				mFIELD_NAME(); 

				}
				break;
			case 135 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1018: AT
				{
				mAT(); 

				}
				break;
			case 136 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1021: EQ
				{
				mEQ(); 

				}
				break;
			case 137 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1024: NEQ
				{
				mNEQ(); 

				}
				break;
			case 138 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1028: LE
				{
				mLE(); 

				}
				break;
			case 139 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1031: GE
				{
				mGE(); 

				}
				break;
			case 140 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1034: LT
				{
				mLT(); 

				}
				break;
			case 141 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1037: GT
				{
				mGT(); 

				}
				break;
			case 142 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1040: DOT
				{
				mDOT(); 

				}
				break;
			case 143 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1044: ADD
				{
				mADD(); 

				}
				break;
			case 144 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1048: SUB
				{
				mSUB(); 

				}
				break;
			case 145 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1052: MUL
				{
				mMUL(); 

				}
				break;
			case 146 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1056: DIV
				{
				mDIV(); 

				}
				break;
			case 147 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1060: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 148 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1066: COLON
				{
				mCOLON(); 

				}
				break;
			case 149 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1072: SC
				{
				mSC(); 

				}
				break;
			case 150 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1075: LP
				{
				mLP(); 

				}
				break;
			case 151 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1078: RP
				{
				mRP(); 

				}
				break;
			case 152 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1081: LB
				{
				mLB(); 

				}
				break;
			case 153 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1084: RB
				{
				mRB(); 

				}
				break;
			case 154 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1087: LBR
				{
				mLBR(); 

				}
				break;
			case 155 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1091: RBR
				{
				mRBR(); 

				}
				break;
			case 156 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1095: APEX
				{
				mAPEX(); 

				}
				break;
			case 157 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1100: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 158 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1106: TILDE
				{
				mTILDE(); 

				}
				break;
			case 159 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1112: XXX
				{
				mXXX(); 

				}
				break;
			case 160 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1116: WHITE_SPACES
				{
				mWHITE_SPACES(); 

				}
				break;
			case 161 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1129: APEX_VALUE
				{
				mAPEX_VALUE(); 

				}
				break;
			case 162 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1140: QUOTED_VALUE
				{
				mQUOTED_VALUE(); 

				}
				break;
			case 163 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1153: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 164 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1161: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA22_eotS =
		"\1\uffff\25\71\2\174\1\uffff\1\177\2\uffff\1\61\1\u0085\1\u0087\3\uffff"+
		"\1\u008c\11\uffff\1\u0096\1\u0098\1\uffff\1\61\2\uffff\6\71\1\u00a5\1"+
		"\uffff\1\u00a8\1\u00a9\1\u00aa\14\71\1\u00bc\5\71\1\u00c4\15\71\1\u00d6"+
		"\12\71\1\u00eb\23\71\2\uffff\1\174\36\uffff\1\u0107\1\u0109\1\71\1\u010b"+
		"\3\71\1\u010f\1\uffff\2\71\3\uffff\2\71\1\u0114\6\71\1\u011c\4\71\1\u0123"+
		"\2\71\1\uffff\7\71\1\uffff\6\71\1\u0135\12\71\1\uffff\13\71\1\u014c\10"+
		"\71\2\uffff\13\71\1\u0164\10\71\1\u016d\1\71\1\u016f\2\71\1\u0172\1\uffff"+
		"\1\71\1\uffff\1\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1\uffff\2\71"+
		"\1\u017f\2\71\1\uffff\1\71\1\u0184\1\u0185\1\71\1\u0187\1\71\1\uffff\1"+
		"\u0189\1\71\1\uffff\1\u018b\2\71\1\u018e\5\71\1\u0194\4\71\1\uffff\1\u019a"+
		"\2\71\1\u019d\1\u019e\7\71\1\u010f\5\71\1\u01ac\3\71\1\uffff\11\71\1\u01ba"+
		"\1\uffff\1\u01bd\1\u01bf\1\u01c1\1\71\1\u01c3\1\u01c4\6\71\1\uffff\10"+
		"\71\1\uffff\1\71\1\uffff\1\71\1\u01d7\1\uffff\3\71\1\u01db\2\71\1\u01de"+
		"\5\71\1\uffff\1\71\1\u01e5\2\71\2\uffff\1\71\1\uffff\1\71\1\uffff\1\u01ea"+
		"\1\uffff\2\71\1\uffff\5\71\1\uffff\1\u018e\1\u01f3\1\71\1\u01f5\2\uffff"+
		"\1\71\1\u01f9\2\uffff\2\71\1\u01fc\12\71\1\uffff\3\71\1\u020b\6\71\1\u0212"+
		"\2\71\4\uffff\1\71\1\uffff\1\71\1\uffff\1\u0217\2\uffff\4\71\1\u021c\5"+
		"\71\1\u0222\3\71\1\u0226\1\u0227\2\71\1\uffff\1\u022a\2\71\1\uffff\2\71"+
		"\1\uffff\1\71\1\u0230\4\71\1\uffff\1\71\1\u01de\1\u0236\1\71\1\uffff\1"+
		"\u0238\6\71\1\u023f\1\uffff\1\u0240\3\uffff\1\71\4\uffff\1\71\1\u0243"+
		"\14\71\1\uffff\4\71\1\u0255\1\71\1\uffff\4\71\1\uffff\1\71\1\u025c\2\71"+
		"\1\uffff\4\71\1\u0263\1\uffff\2\71\1\u0266\2\uffff\1\u0267\1\71\1\uffff"+
		"\5\71\1\uffff\1\u026e\1\u026f\3\71\1\uffff\1\u0273\1\uffff\5\71\1\u0279"+
		"\2\uffff\2\71\1\uffff\1\u027c\20\71\1\uffff\4\71\1\u0291\1\u0292\1\uffff"+
		"\4\71\1\u0297\1\71\1\uffff\1\71\1\u029a\2\uffff\1\u029b\1\71\1\u029e\2"+
		"\71\1\u02a1\2\uffff\1\u02a2\1\71\1\u02a5\1\uffff\1\u02a6\4\71\1\uffff"+
		"\1\u02ab\1\71\1\uffff\3\71\1\u02b0\1\u02b1\1\71\1\u02b3\1\71\1\u02b5\1"+
		"\u02b6\1\u02b7\2\71\1\u02ba\1\u02bb\1\u02bc\1\u02bd\1\u02be\2\71\2\uffff"+
		"\2\71\1\u02c3\1\71\1\uffff\2\71\2\uffff\1\u02c7\1\71\1\uffff\1\u02c9\1"+
		"\71\2\uffff\2\71\2\uffff\1\u02cd\2\71\1\u02d0\1\uffff\1\71\1\u02d2\1\71"+
		"\1\u02d4\2\uffff\1\u02d5\1\uffff\1\71\3\uffff\2\71\5\uffff\1\u02da\2\71"+
		"\1\u02dd\1\uffff\1\71\1\u02df\1\71\1\uffff\1\u02e1\1\uffff\3\71\1\uffff"+
		"\1\u02e5\1\71\1\uffff\1\u02e8\1\uffff\1\u02e9\2\uffff\1\u02ea\3\71\1\uffff"+
		"\1\u02ee\1\u02ef\1\uffff\1\71\1\uffff\1\71\1\uffff\1\u02f2\1\71\1\u02f4"+
		"\1\uffff\1\u02f5\1\u02f6\3\uffff\1\u02f7\2\71\2\uffff\2\71\1\uffff\1\71"+
		"\4\uffff\1\71\1\u02fe\1\u02ff\1\u0300\1\u0301\1\u0302\5\uffff";
	static final String DFA22_eofS =
		"\u0303\uffff";
	static final String DFA22_minS =
		"\1\0\1\104\1\106\1\117\2\101\1\117\1\101\1\110\2\101\1\102\1\105\1\117"+
		"\1\106\1\101\1\105\2\101\1\105\1\116\1\105\2\56\1\uffff\1\42\2\uffff\3"+
		"\75\3\uffff\1\52\11\uffff\2\0\1\uffff\1\43\2\uffff\2\104\1\107\1\114\1"+
		"\122\1\107\1\60\1\uffff\3\60\1\105\1\110\1\124\1\116\1\124\1\105\1\102"+
		"\1\122\1\126\1\122\1\104\1\111\1\60\1\104\1\103\1\120\2\101\1\60\1\122"+
		"\1\120\1\114\1\105\1\122\1\117\1\116\1\114\1\105\1\103\1\101\1\114\1\105"+
		"\1\60\1\106\2\103\1\117\1\120\1\116\1\117\1\127\1\137\1\120\1\60\1\11"+
		"\1\111\1\126\1\105\1\117\1\123\1\106\1\103\1\122\1\111\1\105\1\115\1\107"+
		"\1\103\1\105\1\102\1\105\2\124\2\uffff\1\56\36\uffff\2\60\1\122\1\60\1"+
		"\110\1\101\1\137\1\60\1\uffff\2\105\3\uffff\1\122\1\105\1\60\1\11\1\111"+
		"\1\103\1\124\1\102\1\107\1\60\2\124\1\105\1\126\1\60\1\131\1\114\1\uffff"+
		"\1\11\1\110\1\101\1\114\1\105\1\112\1\120\1\uffff\2\105\1\123\1\114\1"+
		"\124\1\123\1\60\1\115\1\103\1\132\1\114\1\105\2\103\1\123\1\114\1\101"+
		"\1\uffff\1\101\1\103\1\124\1\105\1\124\1\111\1\125\1\120\1\114\1\105\1"+
		"\115\1\60\1\125\1\137\1\105\1\117\1\114\1\125\1\122\1\105\1\uffff\1\11"+
		"\1\116\1\101\1\120\1\127\2\124\1\101\1\113\1\101\1\116\1\131\1\60\1\103"+
		"\1\104\2\117\1\110\1\117\1\116\1\101\1\60\1\116\1\60\1\122\1\110\1\60"+
		"\1\uffff\1\116\1\uffff\1\105\1\uffff\1\101\1\131\1\101\1\uffff\1\116\1"+
		"\122\1\101\1\122\1\uffff\1\115\1\uffff\1\115\1\110\1\60\2\105\1\uffff"+
		"\1\122\2\60\1\105\1\60\1\111\1\uffff\1\60\1\104\1\uffff\1\60\1\116\1\125"+
		"\1\60\1\123\1\105\1\117\1\123\1\125\1\60\1\105\1\104\1\105\1\124\1\uffff"+
		"\1\40\1\124\1\131\2\60\2\113\1\123\1\105\1\124\1\125\1\132\1\60\1\111"+
		"\1\103\1\101\1\123\1\115\1\60\1\111\1\122\1\105\1\uffff\1\120\1\111\1"+
		"\122\1\101\1\122\1\125\1\124\1\101\1\122\1\60\1\117\3\60\1\116\2\60\1"+
		"\114\1\125\1\115\1\111\1\124\1\114\1\uffff\1\117\1\125\1\114\1\126\1\124"+
		"\1\115\1\117\1\103\1\uffff\1\107\1\uffff\1\105\1\60\1\uffff\2\107\1\103"+
		"\1\60\1\122\1\124\1\60\1\124\1\123\2\125\1\111\1\uffff\1\122\1\60\1\101"+
		"\1\104\2\uffff\1\122\1\uffff\1\116\1\uffff\1\60\1\uffff\1\104\1\101\1"+
		"\uffff\1\114\1\103\1\114\1\110\1\107\1\uffff\2\60\1\122\1\60\1\101\1\uffff"+
		"\1\111\1\60\2\uffff\2\11\1\60\1\103\1\105\1\114\1\132\1\117\1\124\1\116"+
		"\1\111\1\105\1\111\1\uffff\1\103\1\101\1\124\1\60\1\116\1\105\1\122\1"+
		"\111\1\124\1\104\1\60\1\116\1\123\4\uffff\1\103\1\uffff\1\116\1\uffff"+
		"\1\60\2\uffff\1\114\1\120\1\105\1\124\1\60\1\111\1\116\1\103\1\126\1\105"+
		"\1\60\1\120\1\127\1\113\2\60\1\116\1\125\1\uffff\1\60\1\101\1\125\1\uffff"+
		"\1\122\1\101\1\uffff\1\117\1\60\2\115\1\116\1\123\1\uffff\1\103\2\60\1"+
		"\107\1\uffff\1\60\1\124\1\101\1\124\1\131\1\117\1\110\1\60\1\uffff\1\60"+
		"\3\uffff\1\117\4\uffff\1\124\1\60\1\124\1\111\1\116\1\111\1\103\1\117"+
		"\2\116\1\101\1\124\1\122\1\116\1\uffff\1\103\1\105\1\117\1\114\1\60\1"+
		"\105\1\uffff\1\107\1\105\1\122\1\107\1\uffff\1\131\1\60\1\124\1\111\1"+
		"\uffff\1\116\1\104\1\124\1\111\1\60\1\uffff\1\101\1\116\1\60\2\uffff\1"+
		"\60\1\124\1\uffff\2\124\1\101\1\124\1\122\1\uffff\2\60\1\107\1\110\1\124"+
		"\1\uffff\1\60\1\uffff\1\105\1\124\1\117\2\114\1\60\2\uffff\1\116\1\111"+
		"\1\uffff\1\60\1\106\1\101\1\117\1\105\1\116\1\124\1\107\1\124\1\105\1"+
		"\131\1\107\1\114\1\105\1\124\1\122\1\123\1\uffff\1\104\1\105\1\103\1\111"+
		"\2\60\1\uffff\1\105\1\117\1\105\1\111\1\60\1\116\1\uffff\1\122\1\60\2"+
		"\uffff\1\60\1\105\1\60\1\131\1\111\1\60\2\uffff\1\60\1\111\1\60\1\uffff"+
		"\1\60\1\105\1\122\1\111\1\104\1\uffff\1\60\1\117\1\uffff\1\131\1\122\1"+
		"\116\2\60\1\123\1\60\1\105\3\60\1\125\1\122\5\60\1\124\1\120\2\uffff\1"+
		"\122\1\116\1\60\1\124\1\uffff\1\107\1\101\2\uffff\1\60\1\122\1\uffff\1"+
		"\60\1\117\2\uffff\1\120\1\117\2\uffff\1\60\1\131\1\116\1\60\1\uffff\1"+
		"\116\1\60\1\131\1\60\2\uffff\1\60\1\uffff\1\123\3\uffff\1\104\1\123\5"+
		"\uffff\1\60\1\124\1\123\1\60\1\uffff\1\111\1\60\1\102\1\uffff\1\60\1\uffff"+
		"\1\116\1\137\1\116\1\uffff\1\60\1\105\1\uffff\1\60\1\uffff\1\60\2\uffff"+
		"\1\60\2\105\1\117\1\uffff\2\60\1\uffff\1\117\1\uffff\1\114\1\uffff\1\60"+
		"\1\117\1\60\1\uffff\2\60\3\uffff\1\60\1\103\1\116\2\uffff\1\116\1\105"+
		"\1\uffff\1\106\4\uffff\1\124\5\60\5\uffff";
	static final String DFA22_maxS =
		"\1\uffff\1\126\1\124\1\117\1\111\1\125\1\131\1\130\1\131\1\125\1\122\1"+
		"\125\1\122\1\117\1\123\1\117\1\116\1\117\1\122\1\111\1\123\1\122\1\56"+
		"\1\71\1\uffff\1\176\2\uffff\3\75\3\uffff\1\57\11\uffff\2\uffff\1\uffff"+
		"\1\43\2\uffff\2\104\1\107\1\120\1\122\1\107\1\172\1\uffff\3\172\1\105"+
		"\1\110\1\124\1\116\1\130\1\122\1\115\1\122\1\126\1\124\1\104\1\111\1\172"+
		"\1\104\1\103\1\120\1\101\1\125\1\172\1\122\1\120\1\114\2\122\1\117\1\132"+
		"\1\123\1\105\1\103\1\101\1\114\1\105\1\172\1\123\1\126\1\103\1\117\1\120"+
		"\1\124\1\117\1\127\1\137\1\120\1\172\1\40\1\111\1\126\1\105\1\117\1\123"+
		"\1\106\1\117\1\122\1\123\1\117\1\123\1\107\1\120\1\111\1\102\1\105\2\124"+
		"\2\uffff\1\71\36\uffff\2\172\1\122\1\172\1\110\1\101\1\137\1\172\1\uffff"+
		"\2\105\3\uffff\1\122\1\105\1\172\2\137\1\103\1\124\1\102\1\107\1\172\2"+
		"\124\1\105\1\126\1\172\1\131\1\114\1\uffff\1\40\1\110\1\101\1\114\1\105"+
		"\1\116\1\120\1\uffff\1\117\1\105\1\123\1\114\1\124\1\123\1\172\1\115\1"+
		"\103\1\132\1\114\1\105\2\103\1\123\1\114\1\101\1\uffff\1\125\1\103\1\124"+
		"\1\105\1\124\1\111\1\125\1\120\1\114\1\105\1\115\1\172\1\125\1\137\1\106"+
		"\1\117\1\114\1\125\1\122\1\117\1\uffff\2\116\1\101\1\120\1\127\2\124\1"+
		"\101\1\113\1\124\1\116\1\131\1\172\1\103\1\104\2\117\1\110\1\117\1\116"+
		"\1\101\1\172\1\116\1\172\1\122\1\110\1\172\1\uffff\1\116\1\uffff\1\105"+
		"\1\uffff\1\101\1\131\1\101\1\uffff\1\116\1\122\1\101\1\122\1\uffff\1\115"+
		"\1\uffff\1\115\1\110\1\172\2\105\1\uffff\1\122\2\172\1\105\1\172\1\111"+
		"\1\uffff\1\172\1\104\1\uffff\1\172\1\116\1\125\1\172\1\123\1\105\1\117"+
		"\1\123\1\125\1\172\1\105\1\104\1\105\1\124\1\uffff\1\172\1\124\1\131\2"+
		"\172\2\113\1\123\1\105\1\124\1\125\1\132\1\172\1\111\1\103\1\101\1\123"+
		"\1\115\1\172\1\111\1\122\1\105\1\uffff\1\120\1\115\1\122\1\101\1\122\1"+
		"\125\1\124\1\101\1\122\1\172\1\125\3\172\1\116\2\172\1\114\1\125\1\115"+
		"\1\111\1\124\1\114\1\uffff\1\117\1\125\1\114\1\126\1\124\1\115\1\117\1"+
		"\103\1\uffff\1\107\1\uffff\1\105\1\172\1\uffff\2\107\1\103\1\172\1\122"+
		"\1\124\1\172\1\124\1\123\2\125\1\111\1\uffff\1\122\1\172\1\101\1\104\2"+
		"\uffff\1\122\1\uffff\1\116\1\uffff\1\172\1\uffff\1\104\1\101\1\uffff\1"+
		"\114\1\103\1\114\1\110\1\107\1\uffff\2\172\1\122\1\172\1\127\1\uffff\1"+
		"\111\1\172\2\uffff\2\40\1\172\1\103\1\105\1\114\1\132\1\117\1\124\1\116"+
		"\1\111\1\105\1\111\1\uffff\1\103\1\101\1\124\1\172\1\116\1\105\1\122\1"+
		"\111\1\124\1\104\1\172\1\116\1\123\4\uffff\1\103\1\uffff\1\116\1\uffff"+
		"\1\172\2\uffff\1\114\1\120\1\105\1\124\1\172\1\111\1\116\1\103\1\126\1"+
		"\105\1\172\1\120\1\127\1\113\2\172\1\116\1\125\1\uffff\1\172\1\101\1\125"+
		"\1\uffff\1\122\1\101\1\uffff\1\117\1\172\2\115\1\116\1\123\1\uffff\1\103"+
		"\2\172\1\107\1\uffff\1\172\1\124\1\101\1\124\1\131\1\117\1\110\1\172\1"+
		"\uffff\1\172\3\uffff\1\117\4\uffff\1\124\1\172\1\124\1\111\1\116\1\111"+
		"\1\103\1\117\2\116\1\101\1\124\1\122\1\116\1\uffff\1\124\1\105\1\117\1"+
		"\114\1\172\1\105\1\uffff\1\107\1\105\1\122\1\107\1\uffff\1\131\1\172\1"+
		"\124\1\111\1\uffff\1\116\1\104\1\124\1\111\1\172\1\uffff\1\101\1\116\1"+
		"\172\2\uffff\1\172\1\124\1\uffff\2\124\1\101\1\124\1\122\1\uffff\2\172"+
		"\1\107\1\110\1\124\1\uffff\1\172\1\uffff\1\105\1\124\1\117\2\114\1\172"+
		"\2\uffff\1\116\1\111\1\uffff\1\172\1\106\1\101\1\117\1\105\1\116\1\124"+
		"\1\107\1\124\1\105\1\131\1\107\1\114\1\105\1\124\1\122\1\123\1\uffff\1"+
		"\104\1\105\1\103\1\111\2\172\1\uffff\1\105\1\117\1\105\1\111\1\172\1\116"+
		"\1\uffff\1\122\1\172\2\uffff\1\172\1\117\1\172\1\131\1\111\1\172\2\uffff"+
		"\1\172\1\111\1\172\1\uffff\1\172\1\105\1\122\1\111\1\104\1\uffff\1\172"+
		"\1\117\1\uffff\1\131\1\122\1\116\2\172\1\123\1\172\1\105\3\172\1\125\1"+
		"\122\5\172\1\124\1\120\2\uffff\1\122\1\116\1\172\1\124\1\uffff\1\107\1"+
		"\101\2\uffff\1\172\1\122\1\uffff\1\172\1\117\2\uffff\1\120\1\117\2\uffff"+
		"\1\172\1\131\1\116\1\172\1\uffff\1\116\1\172\1\131\1\172\2\uffff\1\172"+
		"\1\uffff\1\123\3\uffff\1\104\1\123\5\uffff\1\172\1\124\1\123\1\172\1\uffff"+
		"\1\111\1\172\1\102\1\uffff\1\172\1\uffff\1\116\1\137\1\116\1\uffff\1\172"+
		"\1\105\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172\2\105\1\117\1\uffff\2"+
		"\172\1\uffff\1\117\1\uffff\1\114\1\uffff\1\172\1\117\1\172\1\uffff\2\172"+
		"\3\uffff\1\172\1\103\1\116\2\uffff\1\116\1\105\1\uffff\1\106\4\uffff\1"+
		"\124\5\172\5\uffff";
	static final String DFA22_acceptS =
		"\30\uffff\1\u0085\1\uffff\1\u0087\1\u0088\3\uffff\1\u008f\1\u0090\1\u0091"+
		"\1\uffff\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a"+
		"\1\u009b\2\uffff\1\u009e\1\uffff\1\u00a0\1\u00a4\7\uffff\1\u0085\102\uffff"+
		"\1\u0083\1\u0084\1\uffff\1\u008e\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a"+
		"\1\u008c\1\u008b\1\u008d\1\u008f\1\u0090\1\u0091\1\u00a3\1\u0092\1\u0093"+
		"\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
		"\1\u00a1\1\u009d\1\u00a2\1\u009e\1\u009f\1\u00a0\10\uffff\1\14\2\uffff"+
		"\1\2\1\127\1\130\21\uffff\1\21\7\uffff\1\160\21\uffff\1\32\24\uffff\1"+
		"\102\33\uffff\1\1\1\uffff\1\5\1\uffff\1\10\3\uffff\1\174\4\uffff\1\3\1"+
		"\uffff\1\125\5\uffff\1\157\6\uffff\1\151\2\uffff\1\16\16\uffff\1\54\26"+
		"\uffff\1\64\27\uffff\1\141\10\uffff\1\172\1\uffff\1\175\2\uffff\1\u0082"+
		"\14\uffff\1\122\4\uffff\1\154\1\147\1\uffff\1\152\1\uffff\1\15\1\uffff"+
		"\1\45\2\uffff\1\17\5\uffff\1\166\5\uffff\1\55\2\uffff\1\22\1\23\15\uffff"+
		"\1\42\15\uffff\1\103\1\104\1\105\1\106\1\uffff\1\107\1\uffff\1\111\1\uffff"+
		"\1\114\1\115\22\uffff\1\177\3\uffff\1\12\2\uffff\1\134\6\uffff\1\124\4"+
		"\uffff\1\20\10\uffff\1\50\1\uffff\1\53\1\56\1\57\1\uffff\1\61\1\24\1\25"+
		"\1\26\16\uffff\1\65\6\uffff\1\76\4\uffff\1\113\4\uffff\1\137\5\uffff\1"+
		"\145\3\uffff\1\173\1\176\2\uffff\1\4\5\uffff\1\133\5\uffff\1\150\1\uffff"+
		"\1\46\6\uffff\1\51\1\52\2\uffff\1\31\21\uffff\1\74\6\uffff\1\117\6\uffff"+
		"\1\146\2\uffff\1\171\1\u0080\6\uffff\1\126\1\121\3\uffff\1\153\5\uffff"+
		"\1\163\2\uffff\1\33\24\uffff\1\112\1\116\4\uffff\1\143\2\uffff\1\170\1"+
		"\u0081\2\uffff\1\11\2\uffff\1\131\1\120\2\uffff\1\155\1\47\4\uffff\1\60"+
		"\4\uffff\1\37\1\40\1\uffff\1\43\1\uffff\1\62\1\63\1\66\2\uffff\1\71\1"+
		"\72\1\73\1\75\1\77\4\uffff\1\140\3\uffff\1\6\1\uffff\1\13\3\uffff\1\164"+
		"\2\uffff\1\162\1\uffff\1\34\1\uffff\1\36\1\41\4\uffff\1\100\2\uffff\1"+
		"\136\1\uffff\1\144\1\uffff\1\7\3\uffff\1\165\2\uffff\1\27\1\35\1\44\3"+
		"\uffff\1\110\1\135\2\uffff\1\132\1\uffff\1\156\1\161\1\30\1\67\6\uffff"+
		"\1\101\1\142\1\167\1\123\1\70";
	static final String DFA22_specialS =
		"\1\2\53\uffff\1\0\1\1\u02d5\uffff}>";
	static final String[] DFA22_transitionS = {
			"\11\61\2\60\2\61\1\60\22\61\1\60\1\34\1\55\1\57\3\61\1\54\1\46\1\47\1"+
			"\41\1\37\1\43\1\40\1\31\1\42\1\26\11\27\1\44\1\45\1\35\1\33\1\36\1\61"+
			"\1\32\1\1\1\6\1\12\1\13\1\7\1\11\1\14\1\15\1\16\1\17\1\20\1\21\1\4\1"+
			"\3\1\2\1\22\1\30\1\23\1\5\1\10\1\24\1\30\1\25\3\30\1\50\1\61\1\51\3\61"+
			"\32\30\1\52\1\61\1\53\1\56\uff81\61",
			"\1\63\2\uffff\1\64\4\uffff\1\65\1\uffff\1\62\3\uffff\1\66\1\70\2\uffff"+
			"\1\67",
			"\1\73\7\uffff\1\74\1\uffff\1\75\1\uffff\1\72\1\uffff\1\76",
			"\1\77",
			"\1\101\3\uffff\1\102\3\uffff\1\100",
			"\1\105\3\uffff\1\106\11\uffff\1\104\5\uffff\1\103",
			"\1\107\5\uffff\1\110\3\uffff\1\111",
			"\1\113\14\uffff\1\112\7\uffff\1\115\1\uffff\1\114",
			"\1\120\6\uffff\1\117\2\uffff\1\116\6\uffff\1\121",
			"\1\122\7\uffff\1\123\5\uffff\1\124\2\uffff\1\125\2\uffff\1\126",
			"\1\127\3\uffff\1\131\2\uffff\1\130\3\uffff\1\132\2\uffff\1\133\2\uffff"+
			"\1\134",
			"\1\135\2\uffff\1\136\3\uffff\1\137\5\uffff\1\140\2\uffff\1\141\2\uffff"+
			"\1\142",
			"\1\143\14\uffff\1\144",
			"\1\145",
			"\1\146\6\uffff\1\147\1\150\4\uffff\1\151",
			"\1\153\15\uffff\1\152",
			"\1\154\10\uffff\1\155",
			"\1\156\3\uffff\1\157\11\uffff\1\160",
			"\1\161\15\uffff\1\162\2\uffff\1\163",
			"\1\164\3\uffff\1\165",
			"\1\166\4\uffff\1\167",
			"\1\170\2\uffff\1\171\1\172\10\uffff\1\173",
			"\1\175",
			"\1\175\1\uffff\12\176",
			"",
			"\1\u0080\15\uffff\12\u0080\7\uffff\32\u0080\4\uffff\1\u0080\1\uffff"+
			"\32\u0080\3\uffff\1\u0080",
			"",
			"",
			"\1\u0083",
			"\1\u0084",
			"\1\u0086",
			"",
			"",
			"",
			"\1\u008b\4\uffff\1\u008b",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\0\u0097",
			"\0\u0099",
			"",
			"\1\u009b",
			"",
			"",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0\3\uffff\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\12\71\7\uffff\2\71\1\u00a4\27\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\12\71\7\uffff\3\71\1\u00a7\4\71\1\u00a6\21\71\4\uffff\1\71\1\uffff"+
			"\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00b0\3\uffff\1\u00af",
			"\1\u00b1\7\uffff\1\u00b2\4\uffff\1\u00b3",
			"\1\u00b5\12\uffff\1\u00b4",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8\1\uffff\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c2\23\uffff\1\u00c1",
			"\12\71\7\uffff\32\71\4\uffff\1\u00c3\1\uffff\32\71",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8\6\uffff\1\u00c9\5\uffff\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd\13\uffff\1\u00ce",
			"\1\u00cf\6\uffff\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u00d7\14\uffff\1\u00d8",
			"\1\u00d9\16\uffff\1\u00da\1\u00db\2\uffff\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0\1\u00e1\4\uffff\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\12\71\7\uffff\2\71\1\u00e7\14\71\1\u00e8\3\71\1\u00ea\6\71\4\uffff"+
			"\1\u00e9\1\uffff\32\71",
			"\2\u00ec\2\uffff\1\u00ec\22\uffff\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3\13\uffff\1\u00f4",
			"\1\u00f5",
			"\1\u00f6\2\uffff\1\u00f7\6\uffff\1\u00f8",
			"\1\u00f9\11\uffff\1\u00fa",
			"\1\u00fc\5\uffff\1\u00fb",
			"\1\u00fd",
			"\1\u00fe\7\uffff\1\u00ff\4\uffff\1\u0100",
			"\1\u0101\3\uffff\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"",
			"",
			"\1\175\1\uffff\12\176",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\10\71\1\u0108\21\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u010a",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u0110",
			"\1\u0111",
			"",
			"",
			"",
			"\1\u0112",
			"\1\u0113",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\2\u0116\2\uffff\1\u0116\22\uffff\1\u0116\50\uffff\1\u0115\25\uffff"+
			"\1\u010e",
			"\1\u0117\25\uffff\1\u010e",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\12\71\7\uffff\32\71\4\uffff\1\u010e\1\uffff\32\71",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\12\71\7\uffff\22\71\1\u0121\1\u0122\6\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0124",
			"\1\u0125",
			"",
			"\2\u0126\2\uffff\1\u0126\22\uffff\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012c\3\uffff\1\u012b",
			"\1\u012d",
			"",
			"\1\u012e\11\uffff\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"",
			"\1\u0140\23\uffff\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155\11\uffff\1\u0156",
			"",
			"\2\u00ec\2\uffff\1\u00ec\22\uffff\1\u00ec\55\uffff\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160\22\uffff\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u016e",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0170",
			"\1\u0171",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u0173",
			"",
			"\1\u0174",
			"",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"",
			"\1\u017c",
			"",
			"\1\u017d",
			"\1\u017e",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0180",
			"\1\u0181",
			"",
			"\1\u0182",
			"\12\71\7\uffff\4\71\1\u0183\25\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0186",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0188",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u018a",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u018c",
			"\1\u018d",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"",
			"\1\u0199\17\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u019b",
			"\1\u019c",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\12\71\7\uffff\17\71\1\u01ab\12\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"",
			"\1\u01b0",
			"\1\u01b1\3\uffff\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01bc\5\uffff\1\u01bb",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\22\71\1\u01be\7\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\10\71\1\u01c0\21\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01c2",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"",
			"\1\u01d3",
			"",
			"\1\u01d4",
			"\12\71\7\uffff\10\71\1\u01d5\5\71\1\u01d6\13\71\4\uffff\1\71\1\uffff"+
			"\32\71",
			"",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01dc",
			"\1\u01dd",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"",
			"\1\u01e4",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01e6",
			"\1\u01e7",
			"",
			"",
			"\1\u01e8",
			"",
			"\1\u01e9",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u01eb",
			"\1\u01ec",
			"",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\22\71\1\u01f2\7\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01f4",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01f7\25\uffff\1\u01f6",
			"",
			"\1\u01f8",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\2\u01fa\2\uffff\1\u01fa\22\uffff\1\u01fa",
			"\2\u01fb\2\uffff\1\u01fb\22\uffff\1\u01fb",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\12\71\7\uffff\10\71\1\u020a\21\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0213",
			"\1\u0214",
			"",
			"",
			"",
			"",
			"\1\u0215",
			"",
			"\1\u0216",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0228",
			"\1\u0229",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u022b",
			"\1\u022c",
			"",
			"\1\u022d",
			"\1\u022e",
			"",
			"\1\u022f",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"",
			"\1\u0235",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0237",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"",
			"\1\u0241",
			"",
			"",
			"",
			"",
			"\1\u0242",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"",
			"\1\u0250\20\uffff\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0256",
			"",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"",
			"\1\u025b",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u025d",
			"\1\u025e",
			"",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u0264",
			"\1\u0265",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0268",
			"",
			"\1\u0269",
			"\1\u026a",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0270",
			"\1\u0271",
			"\1\u0272",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\1\u027a",
			"\1\u027b",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u0298",
			"",
			"\1\u0299",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u029c\11\uffff\1\u029d",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u029f",
			"\1\u02a0",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02a3",
			"\12\71\7\uffff\10\71\1\u02a4\21\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02aa",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02ac",
			"",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02b2",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02b4",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02b8",
			"\1\u02b9",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02bf",
			"\1\u02c0",
			"",
			"",
			"\1\u02c1",
			"\1\u02c2",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02c4",
			"",
			"\1\u02c5",
			"\1\u02c6",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02c8",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02ca",
			"",
			"",
			"\1\u02cb",
			"\1\u02cc",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02ce",
			"\1\u02cf",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u02d1",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02d3",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u02d6",
			"",
			"",
			"",
			"\1\u02d7",
			"\1\u02d8",
			"",
			"",
			"",
			"",
			"",
			"\12\71\7\uffff\10\71\1\u02d9\21\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02db",
			"\1\u02dc",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u02de",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02e0",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02e6",
			"",
			"\12\71\7\uffff\22\71\1\u02e7\7\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02eb",
			"\1\u02ec",
			"\1\u02ed",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\1\u02f0",
			"",
			"\1\u02f1",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02f3",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\1\u02f8",
			"\1\u02f9",
			"",
			"",
			"\1\u02fa",
			"\1\u02fb",
			"",
			"\1\u02fc",
			"",
			"",
			"",
			"",
			"\1\u02fd",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | OR | NOT | ADDING | ADD_ST | AGGREGATE | AGGREGATOR | ALL | ALPHACUT | ARRAY | ARRAY_FUNCTION | AS | BODY | END_BODY | BOOLEAN | BUILD | BY | CALL | CASE | CHECK_FOR | CHECK_FOR_E | CLASS | COLLECTION | COLLECTIONS | CREATE | DB | DEFAULT | DEFUZZIFY | DICTIONARY | DIRECTION | DISTANCE | DIVISION | DOCUMENTS | DROP | DROPPING | DUPLICATES | EACH | EXPAND | EVALUATE | FIELD | FIELDS | FILTER | FIRST | FOR | FROM | FROM_WEB | FROM_ARRAY | FUNCTION | FUZZY | GENERATE | GEOMETRY | GET | GROUP | GROUPING | HOWINCLUDE | HOWINTERSECT | HOWMEET | IF_ERROR | IF_FAILS | IMPORT | INCLUDED | INPUT | INRANGE | INTERSECT | INTERSECTION | IN | INTO | ISNULL | ISNOTNULL | JOIN | JAVA | JAVASCRIPT | KEEP | KEEPING | KNOWN | LAST | LEFT | LOCALLY | LOOKUP | MATCHING | MAXIMUM | MEET | MEMBERSHIP_OF | MERGE | MIN_SIMILARITY | MINIMUM | OF | ON | OPERATOR | ORIENTATION | OTHERS | ORDER | PARAMETERS | PARTITION | POINT | POLYLINE | POS | PRECONDITION | PRODUCT | RESOLVING | RIGHT | REMOVE | SAVE | SERVER | SET | SETS | SETTING | SORT | SUBTRACT | SUBTRACTION | SUM | TO | TO_POLYLINE | THRESHOLD | THROUGH | TRANSLATE | TRAJECTORY | TYPE | UNCOMPARABLE | UNKNOWN | UNPACK | USE | USING | VERSUS | WEB | WHERE | WITH | WITHIN | WITHOUT | WRT | INT | FLOAT | ID | FIELD_NAME | AT | EQ | NEQ | LE | GE | LT | GT | DOT | ADD | SUB | MUL | DIV | COMMA | COLON | SC | LP | RP | LB | RB | LBR | RBR | APEX | QUOTE | TILDE | XXX | WHITE_SPACES | APEX_VALUE | QUOTED_VALUE | COMMENT | SCAN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_44 = input.LA(1);
						s = -1;
						if ( ((LA22_44 >= '\u0000' && LA22_44 <= '\uFFFF')) ) {s = 151;}
						else s = 150;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA22_45 = input.LA(1);
						s = -1;
						if ( ((LA22_45 >= '\u0000' && LA22_45 <= '\uFFFF')) ) {s = 153;}
						else s = 152;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA22_0 = input.LA(1);
						s = -1;
						if ( (LA22_0=='A') ) {s = 1;}
						else if ( (LA22_0=='O') ) {s = 2;}
						else if ( (LA22_0=='N') ) {s = 3;}
						else if ( (LA22_0=='M') ) {s = 4;}
						else if ( (LA22_0=='S') ) {s = 5;}
						else if ( (LA22_0=='B') ) {s = 6;}
						else if ( (LA22_0=='E') ) {s = 7;}
						else if ( (LA22_0=='T') ) {s = 8;}
						else if ( (LA22_0=='F') ) {s = 9;}
						else if ( (LA22_0=='C') ) {s = 10;}
						else if ( (LA22_0=='D') ) {s = 11;}
						else if ( (LA22_0=='G') ) {s = 12;}
						else if ( (LA22_0=='H') ) {s = 13;}
						else if ( (LA22_0=='I') ) {s = 14;}
						else if ( (LA22_0=='J') ) {s = 15;}
						else if ( (LA22_0=='K') ) {s = 16;}
						else if ( (LA22_0=='L') ) {s = 17;}
						else if ( (LA22_0=='P') ) {s = 18;}
						else if ( (LA22_0=='R') ) {s = 19;}
						else if ( (LA22_0=='U') ) {s = 20;}
						else if ( (LA22_0=='W') ) {s = 21;}
						else if ( (LA22_0=='0') ) {s = 22;}
						else if ( ((LA22_0 >= '1' && LA22_0 <= '9')) ) {s = 23;}
						else if ( (LA22_0=='Q'||LA22_0=='V'||(LA22_0 >= 'X' && LA22_0 <= 'Z')||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {s = 24;}
						else if ( (LA22_0=='.') ) {s = 25;}
						else if ( (LA22_0=='@') ) {s = 26;}
						else if ( (LA22_0=='=') ) {s = 27;}
						else if ( (LA22_0=='!') ) {s = 28;}
						else if ( (LA22_0=='<') ) {s = 29;}
						else if ( (LA22_0=='>') ) {s = 30;}
						else if ( (LA22_0=='+') ) {s = 31;}
						else if ( (LA22_0=='-') ) {s = 32;}
						else if ( (LA22_0=='*') ) {s = 33;}
						else if ( (LA22_0=='/') ) {s = 34;}
						else if ( (LA22_0==',') ) {s = 35;}
						else if ( (LA22_0==':') ) {s = 36;}
						else if ( (LA22_0==';') ) {s = 37;}
						else if ( (LA22_0=='(') ) {s = 38;}
						else if ( (LA22_0==')') ) {s = 39;}
						else if ( (LA22_0=='[') ) {s = 40;}
						else if ( (LA22_0==']') ) {s = 41;}
						else if ( (LA22_0=='{') ) {s = 42;}
						else if ( (LA22_0=='}') ) {s = 43;}
						else if ( (LA22_0=='\'') ) {s = 44;}
						else if ( (LA22_0=='\"') ) {s = 45;}
						else if ( (LA22_0=='~') ) {s = 46;}
						else if ( (LA22_0=='#') ) {s = 47;}
						else if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 48;}
						else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\b')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\u001F')||(LA22_0 >= '$' && LA22_0 <= '&')||LA22_0=='?'||LA22_0=='\\'||(LA22_0 >= '^' && LA22_0 <= '`')||LA22_0=='|'||(LA22_0 >= '\u007F' && LA22_0 <= '\uFFFF')) ) {s = 49;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
