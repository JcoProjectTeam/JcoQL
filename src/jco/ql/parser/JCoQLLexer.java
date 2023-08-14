// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g 2023-08-11 18:42:29

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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1263:17: ( 'A' .. 'Z' | 'a' .. 'z' )
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1264:17: ( '1' .. '9' )
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1265:17: ( '0' .. '9' )
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1267:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1267:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1267:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1277:5: ( 'AND' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1277:7: 'AND'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1278:5: ( 'OR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1278:7: 'OR'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1279:5: ( 'NOT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1279:7: 'NOT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1282:13: ( 'ADDING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1282:15: 'ADDING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1283:15: ( 'ADD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1283:17: 'ADD'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1284:17: ( 'AGGREGATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1284:19: 'AGGREGATE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1285:15: ( 'AGGREGATOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1285:17: 'AGGREGATOR'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1286:17: ( 'ALL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1286:19: 'ALL'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1287:14: ( 'ALPHACUT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1287:16: 'ALPHACUT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1288:17: ( 'ARRAY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1288:19: 'ARRAY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1289:17: ( ( 'MIN' | 'MAX' | 'AVG' | 'SUM' ) '_ARRAY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1289:19: ( 'MIN' | 'MAX' | 'AVG' | 'SUM' ) '_ARRAY'
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1289:19: ( 'MIN' | 'MAX' | 'AVG' | 'SUM' )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1289:21: 'MIN'
					{
					match("MIN"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1289:29: 'MAX'
					{
					match("MAX"); 

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1289:37: 'AVG'
					{
					match("AVG"); 

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1289:45: 'SUM'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1290:18: ( 'AS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1290:20: 'AS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1291:12: ( 'BODY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1291:14: 'BODY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1292:14: ( 'END' WS 'BODY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1292:16: 'END' WS 'BODY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1293:17: ( 'TRUE' | 'FALSE' )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1293:19: 'TRUE'
					{
					match("TRUE"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1293:28: 'FALSE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1294:13: ( 'BUILD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1294:15: 'BUILD'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1295:17: ( 'BY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1295:19: 'BY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1296:17: ( 'CALL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1296:19: 'CALL'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1297:18: ( 'CASE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1297:20: 'CASE'
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

	// $ANTLR start "CASES"
	public final void mCASES() throws RecognitionException {
		try {
			int _type = CASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1298:18: ( 'CASES' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1298:20: 'CASES'
			{
			match("CASES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASES"

	// $ANTLR start "CHECK_FOR"
	public final void mCHECK_FOR() throws RecognitionException {
		try {
			int _type = CHECK_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1299:15: ( 'CHECK' WS 'FOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1299:17: 'CHECK' WS 'FOR'
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

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1300:13: ( 'CLASS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1300:15: 'CLASS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1301:17: ( 'COLLECTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1301:19: 'COLLECTION'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1302:17: ( 'COLLECTIONS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1302:19: 'COLLECTIONS'
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

	// $ANTLR start "CONSTRAINT"
	public final void mCONSTRAINT() throws RecognitionException {
		try {
			int _type = CONSTRAINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1303:15: ( 'CONSTRAINT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1303:17: 'CONSTRAINT'
			{
			match("CONSTRAINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONSTRAINT"

	// $ANTLR start "CREATE"
	public final void mCREATE() throws RecognitionException {
		try {
			int _type = CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1304:13: ( 'CREATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1304:15: 'CREATE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1305:17: ( 'DB' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1305:19: 'DB'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1306:14: ( 'DEFAULT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1306:16: 'DEFAULT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1307:15: ( 'DEFUZZIFY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1307:17: 'DEFUZZIFY'
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

	// $ANTLR start "DEGREE"
	public final void mDEGREE() throws RecognitionException {
		try {
			int _type = DEGREE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1308:13: ( 'DEGREE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1308:15: 'DEGREE'
			{
			match("DEGREE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEGREE"

	// $ANTLR start "DEGREES"
	public final void mDEGREES() throws RecognitionException {
		try {
			int _type = DEGREES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1309:14: ( 'DEGREES' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1309:16: 'DEGREES'
			{
			match("DEGREES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEGREES"

	// $ANTLR start "DERIVE"
	public final void mDERIVE() throws RecognitionException {
		try {
			int _type = DERIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1310:13: ( 'DERIVE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1310:15: 'DERIVE'
			{
			match("DERIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DERIVE"

	// $ANTLR start "DERIVED"
	public final void mDERIVED() throws RecognitionException {
		try {
			int _type = DERIVED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1311:14: ( 'DERIVED' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1311:16: 'DERIVED'
			{
			match("DERIVED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DERIVED"

	// $ANTLR start "DICTIONARY"
	public final void mDICTIONARY() throws RecognitionException {
		try {
			int _type = DICTIONARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1312:15: ( 'DICTIONARY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1312:17: 'DICTIONARY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1313:15: ( 'DIRECTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1313:17: 'DIRECTION'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1314:14: ( 'DISTANCE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1314:16: 'DISTANCE'
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

	// $ANTLR start "DOCUMENTS"
	public final void mDOCUMENTS() throws RecognitionException {
		try {
			int _type = DOCUMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1315:15: ( 'DOCUMENTS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1315:17: 'DOCUMENTS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1316:17: ( 'DROP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1316:19: 'DROP'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1317:17: ( 'DROPPING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1317:19: 'DROPPING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1318:17: ( 'DUPLICATES' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1318:19: 'DUPLICATES'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1319:12: ( 'EACH' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1319:14: 'EACH'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1320:17: ( 'EXPAND' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1320:19: 'EXPAND'
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

	// $ANTLR start "EXTENT"
	public final void mEXTENT() throws RecognitionException {
		try {
			int _type = EXTENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1321:17: ( 'EXTENT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1321:19: 'EXTENT'
			{
			match("EXTENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENT"

	// $ANTLR start "EVALUATE"
	public final void mEVALUATE() throws RecognitionException {
		try {
			int _type = EVALUATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1322:14: ( 'EVALUATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1322:16: 'EVALUATE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1323:13: ( 'FIELD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1323:15: 'FIELD'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1324:13: ( 'FIELDS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1324:15: 'FIELDS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1325:17: ( 'FILTER' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1325:19: 'FILTER'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1326:17: ( 'FIRST' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1326:19: 'FIRST'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1327:12: ( 'FOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1327:14: 'FOR'
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

	// $ANTLR start "FROM_WEB"
	public final void mFROM_WEB() throws RecognitionException {
		try {
			int _type = FROM_WEB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1328:15: ( 'FROM' WS 'WEB' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1328:17: 'FROM' WS 'WEB'
			{
			match("FROM"); 

			mWS(); 

			match("WEB"); 

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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1329:15: ( 'FROM' WS 'ARRAY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1329:17: 'FROM' WS 'ARRAY'
			{
			match("FROM"); 

			mWS(); 

			match("ARRAY"); 

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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1330:14: ( 'FUNCTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1330:16: 'FUNCTION'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1331:13: ( 'FUZZY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1331:15: 'FUZZY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1332:14: ( 'GENERATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1332:16: 'GENERATE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1333:17: ( 'GEOMETRY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1333:19: 'GEOMETRY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1334:17: ( 'GET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1334:19: 'GET'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1335:17: ( 'GROUP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1335:19: 'GROUP'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1336:17: ( 'GROUPING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1336:19: 'GROUPING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1337:15: ( 'HOW_INCLUDE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1337:17: 'HOW_INCLUDE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1338:16: ( 'HOW_INTERSECT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1338:18: 'HOW_INTERSECT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1339:14: ( 'HOW_MEET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1339:16: 'HOW_MEET'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1340:14: ( 'IF_ERROR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1340:16: 'IF_ERROR'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1341:14: ( 'IF_FAILS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1341:16: 'IF_FAILS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1342:13: ( 'IMPORT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1342:15: 'IMPORT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1343:17: ( 'INCLUDED' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1343:19: 'INCLUDED'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1344:16: ( 'INPUT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1344:18: 'INPUT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1345:17: ( 'IN_RANGE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1345:19: 'IN_RANGE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1346:15: ( 'INTERSECT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1346:17: 'INTERSECT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1347:17: ( 'INTERSECTION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1347:19: 'INTERSECTION'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1348:11: ( 'IN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1348:13: 'IN'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1349:17: ( 'INTO' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1349:19: 'INTO'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1350:13: ( 'IS' WS 'NULL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1350:15: 'IS' WS 'NULL'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1351:15: ( 'IS' WS 'NOT' WS 'NULL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1351:17: 'IS' WS 'NOT' WS 'NULL'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1352:17: ( 'JOIN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1352:19: 'JOIN'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1353:12: ( 'JAVA' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1353:14: 'JAVA'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1354:15: ( 'JAVASCRIPT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1354:17: 'JAVASCRIPT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1355:17: ( 'KEEP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1355:19: 'KEEP'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1356:18: ( 'KEEPING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1356:20: 'KEEPING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1357:13: ( 'KNOWN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1357:15: 'KNOWN'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1358:16: ( 'LAST' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1358:18: 'LAST'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1359:17: ( 'LEFT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1359:19: 'LEFT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1360:14: ( 'LOCALLY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1360:16: 'LOCALLY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1361:14: ( 'LOOKUP' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1361:16: 'LOOKUP'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1362:17: ( 'MATCHING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1362:19: 'MATCHING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1363:14: ( 'MAXIMUM' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1363:16: 'MAXIMUM'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1364:17: ( 'MEET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1364:19: 'MEET'
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

	// $ANTLR start "MEMBERSHIP_ARRAY"
	public final void mMEMBERSHIP_ARRAY() throws RecognitionException {
		try {
			int _type = MEMBERSHIP_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1365:19: ( 'MEMBERSHIP_ARRAY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1365:21: 'MEMBERSHIP_ARRAY'
			{
			match("MEMBERSHIP_ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEMBERSHIP_ARRAY"

	// $ANTLR start "MEMBERSHIP_TO"
	public final void mMEMBERSHIP_TO() throws RecognitionException {
		try {
			int _type = MEMBERSHIP_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1366:18: ( 'MEMBERSHIP_TO' | 'MEMBERSHIP_OF' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='M') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='E') ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2=='M') ) {
						int LA4_3 = input.LA(4);
						if ( (LA4_3=='B') ) {
							int LA4_4 = input.LA(5);
							if ( (LA4_4=='E') ) {
								int LA4_5 = input.LA(6);
								if ( (LA4_5=='R') ) {
									int LA4_6 = input.LA(7);
									if ( (LA4_6=='S') ) {
										int LA4_7 = input.LA(8);
										if ( (LA4_7=='H') ) {
											int LA4_8 = input.LA(9);
											if ( (LA4_8=='I') ) {
												int LA4_9 = input.LA(10);
												if ( (LA4_9=='P') ) {
													int LA4_10 = input.LA(11);
													if ( (LA4_10=='_') ) {
														int LA4_11 = input.LA(12);
														if ( (LA4_11=='T') ) {
															alt4=1;
														}
														else if ( (LA4_11=='O') ) {
															alt4=2;
														}

														else {
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++) {
																	input.consume();
																}
																NoViableAltException nvae =
																	new NoViableAltException("", 4, 11, input);
																throw nvae;
															} finally {
																input.rewind(nvaeMark);
															}
														}

													}

													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 4, 10, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 4, 9, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 4, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 4, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 4, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 4, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 4, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1366:20: 'MEMBERSHIP_TO'
					{
					match("MEMBERSHIP_TO"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1366:38: 'MEMBERSHIP_OF'
					{
					match("MEMBERSHIP_OF"); 

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
	// $ANTLR end "MEMBERSHIP_TO"

	// $ANTLR start "MERGE"
	public final void mMERGE() throws RecognitionException {
		try {
			int _type = MERGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1367:17: ( 'MERGE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1367:19: 'MERGE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1368:17: ( 'MIN' WS 'SIMILARITY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1368:19: 'MIN' WS 'SIMILARITY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1369:14: ( 'MINIMUM' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1369:16: 'MINIMUM'
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

	// $ANTLR start "MODEL"
	public final void mMODEL() throws RecognitionException {
		try {
			int _type = MODEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1370:13: ( 'MODEL' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1370:15: 'MODEL'
			{
			match("MODEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODEL"

	// $ANTLR start "OF"
	public final void mOF() throws RecognitionException {
		try {
			int _type = OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1371:17: ( 'OF' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1371:19: 'OF'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1372:17: ( 'ON' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1372:19: 'ON'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1373:15: ( 'OPERATOR' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1373:17: 'OPERATOR'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1374:18: ( 'ORIENTATION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1374:20: 'ORIENTATION'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1375:13: ( 'OTHERS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1375:15: 'OTHERS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1376:13: ( 'ORDER' | 'SORTED' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='O') ) {
				alt5=1;
			}
			else if ( (LA5_0=='S') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1376:15: 'ORDER'
					{
					match("ORDER"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1376:25: 'SORTED'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1377:15: ( 'PARAMETERS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1377:17: 'PARAMETERS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1378:15: ( 'PARTITION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1378:17: 'PARTITION'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1379:13: ( 'POINT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1379:15: 'POINT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1380:14: ( 'POLYLINE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1380:16: 'POLYLINE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1381:12: ( 'POS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1381:14: 'POS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1382:16: ( 'PRECONDITION' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1382:18: 'PRECONDITION'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1383:15: ( 'PRODUCT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1383:17: 'PRODUCT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1384:15: ( 'RESOLVING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1384:17: 'RESOLVING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1385:17: ( 'RIGHT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1385:19: 'RIGHT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1386:17: ( 'REMOVE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1386:19: 'REMOVE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1387:17: ( 'SAVE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1387:19: 'SAVE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1388:17: ( 'SERVER' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1388:19: 'SERVER'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1389:17: ( 'SET' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1389:19: 'SET'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1390:17: ( 'SETS' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1390:19: 'SETS'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1391:17: ( 'SETTING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1391:19: 'SETTING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1392:12: ( 'SORT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1392:14: 'SORT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1393:17: ( 'SUBTRACT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1393:19: 'SUBTRACT'
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

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1394:12: ( 'SUM' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1394:14: 'SUM'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1395:18: ( 'TO' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1395:20: 'TO'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1396:17: ( 'TO_POLYLINE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1396:19: 'TO_POLYLINE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1397:17: ( 'THRESHOLD' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1397:19: 'THRESHOLD'
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

	// $ANTLR start "TRANSLATE"
	public final void mTRANSLATE() throws RecognitionException {
		try {
			int _type = TRANSLATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1398:15: ( 'TRANSLATE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1398:17: 'TRANSLATE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1399:17: ( 'TRAJECTORY' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1399:19: 'TRAJECTORY'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1400:12: ( 'TYPE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1400:14: 'TYPE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1401:16: ( 'UNCOMPARABLE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1401:18: 'UNCOMPARABLE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1402:14: ( 'UNKNOWN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1402:16: 'UNKNOWN'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1403:17: ( 'UNPACK' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1403:19: 'UNPACK'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1404:17: ( 'USE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1404:19: 'USE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1405:17: ( 'USING' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1405:19: 'USING'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1406:17: ( 'DESC' | 'ASC' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='D') ) {
				alt6=1;
			}
			else if ( (LA6_0=='A') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1406:19: 'DESC'
					{
					match("DESC"); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1406:28: 'ASC'
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

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1407:18: ( 'WHERE' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1407:20: 'WHERE'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1408:17: ( 'WITH' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1408:19: 'WITH'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1409:17: ( 'WITHIN' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1409:19: 'WITHIN'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1410:17: ( 'WITHOUT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1410:19: 'WITHOUT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1411:17: ( 'WRT' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1411:19: 'WRT'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1413:7: ( '0' | DIGIT0 ( DIGIT )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='0') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1413:9: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1413:15: DIGIT0 ( DIGIT )*
					{
					mDIGIT0(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1413:22: ( DIGIT )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
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
							break loop7;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1414:8: ( DIGIT0 ( DIGIT )* DOT ( DIGIT )+ | '0' DOT ( DIGIT )+ )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= '1' && LA12_0 <= '9')) ) {
				alt12=1;
			}
			else if ( (LA12_0=='0') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1414:10: DIGIT0 ( DIGIT )* DOT ( DIGIT )+
					{
					mDIGIT0(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1414:17: ( DIGIT )*
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
							break loop9;
						}
					}

					mDOT(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1414:28: ( DIGIT )+
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
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1414:37: '0' DOT ( DIGIT )+
					{
					match('0'); 
					mDOT(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1414:45: ( DIGIT )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
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
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1416:6: ( LETTER ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1416:8: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1416:15: ( LETTER | DIGIT | '_' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
					alt13=1;
				}

				switch (alt13) {
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
					break loop13;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1418:13: ( DOT ( LETTER | DIGIT | TILDE | '_' )+ | DOT '\"' (~ ( '\"' ) )* '\"' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='.') ) {
				int LA16_1 = input.LA(2);
				if ( ((LA16_1 >= '0' && LA16_1 <= '9')||(LA16_1 >= 'A' && LA16_1 <= 'Z')||LA16_1=='_'||(LA16_1 >= 'a' && LA16_1 <= 'z')||LA16_1=='~') ) {
					alt16=1;
				}
				else if ( (LA16_1=='\"') ) {
					alt16=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1418:15: DOT ( LETTER | DIGIT | TILDE | '_' )+
					{
					mDOT(); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1418:19: ( LETTER | DIGIT | TILDE | '_' )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '0' && LA14_0 <= '9')||(LA14_0 >= 'A' && LA14_0 <= 'Z')||LA14_0=='_'||(LA14_0 >= 'a' && LA14_0 <= 'z')||LA14_0=='~') ) {
							alt14=1;
						}

						switch (alt14) {
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
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1419:16: DOT '\"' (~ ( '\"' ) )* '\"'
					{
					mDOT(); 

					match('\"'); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1419:24: (~ ( '\"' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
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
							break loop15;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1424:7: ( '@' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1424:9: '@'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1425:7: ( '=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1425:9: '='
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1426:7: ( '!=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1426:9: '!='
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1427:7: ( '<=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1427:9: '<='
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1428:7: ( '>=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1428:9: '>='
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1429:7: ( '<' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1429:9: '<'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1430:7: ( '>' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1430:9: '>'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1431:7: ( '.' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1431:9: '.'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1432:7: ( '+' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1432:9: '+'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1433:7: ( '-' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1433:9: '-'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1434:7: ( '*' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1434:9: '*'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1435:7: ( '/' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1435:9: '/'
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

	// $ANTLR start "EXP"
	public final void mEXP() throws RecognitionException {
		try {
			int _type = EXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1436:7: ( '^' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1436:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1437:7: ( ',' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1437:9: ','
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1438:7: ( ':' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1438:9: ':'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1439:7: ( ';' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1439:9: ';'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1440:7: ( '(' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1440:9: '('
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1441:7: ( ')' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1441:10: ')'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1442:7: ( '[' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1442:9: '['
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1443:7: ( ']' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1443:9: ']'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1444:7: ( '{' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1444:9: '{'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1445:7: ( '}' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1445:9: '}'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1446:7: ( '\\'' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1446:9: '\\''
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1447:7: ( '\"' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1447:9: '\"'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1448:7: ( '~' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1448:9: '~'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1449:7: ( '###TEST***' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1449:9: '###TEST***'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1454:3: ( WS )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1454:5: WS
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1457:3: ( '\\'' (~ ( '\\'' ) )* '\\'' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1457:6: '\\'' (~ ( '\\'' ) )* '\\''
			{
			match('\''); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1457:11: (~ ( '\\'' ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '\uFFFF')) ) {
					alt17=1;
				}

				switch (alt17) {
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
					break loop17;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1460:3: ( '\"' (~ ( '\"' ) )* '\"' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1460:6: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1460:10: (~ ( '\"' ) )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\u0000' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '\uFFFF')) ) {
					alt18=1;
				}

				switch (alt18) {
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
					break loop18;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1463:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='/') ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1=='/') ) {
					alt22=1;
				}
				else if ( (LA22_1=='*') ) {
					alt22=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1463:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1463:14: (~ ( '\\n' | '\\r' ) )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF')) ) {
							alt19=1;
						}

						switch (alt19) {
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
							break loop19;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1463:28: ( '\\r' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0=='\r') ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1463:28: '\\r'
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1464:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1464:14: ( options {greedy=false; } : . )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0=='*') ) {
							int LA21_1 = input.LA(2);
							if ( (LA21_1=='/') ) {
								alt21=2;
							}
							else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '.')||(LA21_1 >= '0' && LA21_1 <= '\uFFFF')) ) {
								alt21=1;
							}

						}
						else if ( ((LA21_0 >= '\u0000' && LA21_0 <= ')')||(LA21_0 >= '+' && LA21_0 <= '\uFFFF')) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1464:46: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop21;
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1469:3: ( . )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1469:5: .
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
		// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:8: ( AND | OR | NOT | ADDING | ADD_ST | AGGREGATE | AGGREGATOR | ALL | ALPHACUT | ARRAY | ARRAY_FUNCTION | AS | BODY | END_BODY | BOOLEAN | BUILD | BY | CALL | CASE | CASES | CHECK_FOR | CLASS | COLLECTION | COLLECTIONS | CONSTRAINT | CREATE | DB | DEFAULT | DEFUZZIFY | DEGREE | DEGREES | DERIVE | DERIVED | DICTIONARY | DIRECTION | DISTANCE | DOCUMENTS | DROP | DROPPING | DUPLICATES | EACH | EXPAND | EXTENT | EVALUATE | FIELD | FIELDS | FILTER | FIRST | FOR | FROM_WEB | FROM_ARRAY | FUNCTION | FUZZY | GENERATE | GEOMETRY | GET | GROUP | GROUPING | HOWINCLUDE | HOWINTERSECT | HOWMEET | IF_ERROR | IF_FAILS | IMPORT | INCLUDED | INPUT | INRANGE | INTERSECT | INTERSECTION | IN | INTO | ISNULL | ISNOTNULL | JOIN | JAVA | JAVASCRIPT | KEEP | KEEPING | KNOWN | LAST | LEFT | LOCALLY | LOOKUP | MATCHING | MAXIMUM | MEET | MEMBERSHIP_ARRAY | MEMBERSHIP_TO | MERGE | MIN_SIMILARITY | MINIMUM | MODEL | OF | ON | OPERATOR | ORIENTATION | OTHERS | ORDER | PARAMETERS | PARTITION | POINT | POLYLINE | POS | PRECONDITION | PRODUCT | RESOLVING | RIGHT | REMOVE | SAVE | SERVER | SET | SETS | SETTING | SORT | SUBTRACT | SUM | TO | TO_POLYLINE | THRESHOLD | TRANSLATE | TRAJECTORY | TYPE | UNCOMPARABLE | UNKNOWN | UNPACK | USE | USING | VERSUS | WHERE | WITH | WITHIN | WITHOUT | WRT | INT | FLOAT | ID | FIELD_NAME | AT | EQ | NEQ | LE | GE | LT | GT | DOT | ADD | SUB | MUL | DIV | EXP | COMMA | COLON | SC | LP | RP | LB | RB | LBR | RBR | APEX | QUOTE | TILDE | XXX | WHITE_SPACES | APEX_VALUE | QUOTED_VALUE | COMMENT | SCAN_ERROR )
		int alt23=168;
		alt23 = dfa23.predict(input);
		switch (alt23) {
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
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:134: CASES
				{
				mCASES(); 

				}
				break;
			case 21 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:140: CHECK_FOR
				{
				mCHECK_FOR(); 

				}
				break;
			case 22 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:150: CLASS
				{
				mCLASS(); 

				}
				break;
			case 23 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:156: COLLECTION
				{
				mCOLLECTION(); 

				}
				break;
			case 24 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:167: COLLECTIONS
				{
				mCOLLECTIONS(); 

				}
				break;
			case 25 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:179: CONSTRAINT
				{
				mCONSTRAINT(); 

				}
				break;
			case 26 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:190: CREATE
				{
				mCREATE(); 

				}
				break;
			case 27 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:197: DB
				{
				mDB(); 

				}
				break;
			case 28 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:200: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 29 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:208: DEFUZZIFY
				{
				mDEFUZZIFY(); 

				}
				break;
			case 30 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:218: DEGREE
				{
				mDEGREE(); 

				}
				break;
			case 31 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:225: DEGREES
				{
				mDEGREES(); 

				}
				break;
			case 32 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:233: DERIVE
				{
				mDERIVE(); 

				}
				break;
			case 33 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:240: DERIVED
				{
				mDERIVED(); 

				}
				break;
			case 34 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:248: DICTIONARY
				{
				mDICTIONARY(); 

				}
				break;
			case 35 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:259: DIRECTION
				{
				mDIRECTION(); 

				}
				break;
			case 36 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:269: DISTANCE
				{
				mDISTANCE(); 

				}
				break;
			case 37 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:278: DOCUMENTS
				{
				mDOCUMENTS(); 

				}
				break;
			case 38 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:288: DROP
				{
				mDROP(); 

				}
				break;
			case 39 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:293: DROPPING
				{
				mDROPPING(); 

				}
				break;
			case 40 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:302: DUPLICATES
				{
				mDUPLICATES(); 

				}
				break;
			case 41 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:313: EACH
				{
				mEACH(); 

				}
				break;
			case 42 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:318: EXPAND
				{
				mEXPAND(); 

				}
				break;
			case 43 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:325: EXTENT
				{
				mEXTENT(); 

				}
				break;
			case 44 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:332: EVALUATE
				{
				mEVALUATE(); 

				}
				break;
			case 45 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:341: FIELD
				{
				mFIELD(); 

				}
				break;
			case 46 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:347: FIELDS
				{
				mFIELDS(); 

				}
				break;
			case 47 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:354: FILTER
				{
				mFILTER(); 

				}
				break;
			case 48 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:361: FIRST
				{
				mFIRST(); 

				}
				break;
			case 49 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:367: FOR
				{
				mFOR(); 

				}
				break;
			case 50 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:371: FROM_WEB
				{
				mFROM_WEB(); 

				}
				break;
			case 51 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:380: FROM_ARRAY
				{
				mFROM_ARRAY(); 

				}
				break;
			case 52 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:391: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 53 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:400: FUZZY
				{
				mFUZZY(); 

				}
				break;
			case 54 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:406: GENERATE
				{
				mGENERATE(); 

				}
				break;
			case 55 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:415: GEOMETRY
				{
				mGEOMETRY(); 

				}
				break;
			case 56 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:424: GET
				{
				mGET(); 

				}
				break;
			case 57 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:428: GROUP
				{
				mGROUP(); 

				}
				break;
			case 58 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:434: GROUPING
				{
				mGROUPING(); 

				}
				break;
			case 59 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:443: HOWINCLUDE
				{
				mHOWINCLUDE(); 

				}
				break;
			case 60 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:454: HOWINTERSECT
				{
				mHOWINTERSECT(); 

				}
				break;
			case 61 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:467: HOWMEET
				{
				mHOWMEET(); 

				}
				break;
			case 62 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:475: IF_ERROR
				{
				mIF_ERROR(); 

				}
				break;
			case 63 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:484: IF_FAILS
				{
				mIF_FAILS(); 

				}
				break;
			case 64 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:493: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 65 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:500: INCLUDED
				{
				mINCLUDED(); 

				}
				break;
			case 66 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:509: INPUT
				{
				mINPUT(); 

				}
				break;
			case 67 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:515: INRANGE
				{
				mINRANGE(); 

				}
				break;
			case 68 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:523: INTERSECT
				{
				mINTERSECT(); 

				}
				break;
			case 69 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:533: INTERSECTION
				{
				mINTERSECTION(); 

				}
				break;
			case 70 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:546: IN
				{
				mIN(); 

				}
				break;
			case 71 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:549: INTO
				{
				mINTO(); 

				}
				break;
			case 72 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:554: ISNULL
				{
				mISNULL(); 

				}
				break;
			case 73 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:561: ISNOTNULL
				{
				mISNOTNULL(); 

				}
				break;
			case 74 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:571: JOIN
				{
				mJOIN(); 

				}
				break;
			case 75 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:576: JAVA
				{
				mJAVA(); 

				}
				break;
			case 76 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:581: JAVASCRIPT
				{
				mJAVASCRIPT(); 

				}
				break;
			case 77 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:592: KEEP
				{
				mKEEP(); 

				}
				break;
			case 78 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:597: KEEPING
				{
				mKEEPING(); 

				}
				break;
			case 79 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:605: KNOWN
				{
				mKNOWN(); 

				}
				break;
			case 80 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:611: LAST
				{
				mLAST(); 

				}
				break;
			case 81 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:616: LEFT
				{
				mLEFT(); 

				}
				break;
			case 82 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:621: LOCALLY
				{
				mLOCALLY(); 

				}
				break;
			case 83 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:629: LOOKUP
				{
				mLOOKUP(); 

				}
				break;
			case 84 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:636: MATCHING
				{
				mMATCHING(); 

				}
				break;
			case 85 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:645: MAXIMUM
				{
				mMAXIMUM(); 

				}
				break;
			case 86 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:653: MEET
				{
				mMEET(); 

				}
				break;
			case 87 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:658: MEMBERSHIP_ARRAY
				{
				mMEMBERSHIP_ARRAY(); 

				}
				break;
			case 88 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:675: MEMBERSHIP_TO
				{
				mMEMBERSHIP_TO(); 

				}
				break;
			case 89 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:689: MERGE
				{
				mMERGE(); 

				}
				break;
			case 90 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:695: MIN_SIMILARITY
				{
				mMIN_SIMILARITY(); 

				}
				break;
			case 91 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:710: MINIMUM
				{
				mMINIMUM(); 

				}
				break;
			case 92 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:718: MODEL
				{
				mMODEL(); 

				}
				break;
			case 93 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:724: OF
				{
				mOF(); 

				}
				break;
			case 94 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:727: ON
				{
				mON(); 

				}
				break;
			case 95 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:730: OPERATOR
				{
				mOPERATOR(); 

				}
				break;
			case 96 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:739: ORIENTATION
				{
				mORIENTATION(); 

				}
				break;
			case 97 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:751: OTHERS
				{
				mOTHERS(); 

				}
				break;
			case 98 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:758: ORDER
				{
				mORDER(); 

				}
				break;
			case 99 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:764: PARAMETERS
				{
				mPARAMETERS(); 

				}
				break;
			case 100 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:775: PARTITION
				{
				mPARTITION(); 

				}
				break;
			case 101 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:785: POINT
				{
				mPOINT(); 

				}
				break;
			case 102 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:791: POLYLINE
				{
				mPOLYLINE(); 

				}
				break;
			case 103 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:800: POS
				{
				mPOS(); 

				}
				break;
			case 104 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:804: PRECONDITION
				{
				mPRECONDITION(); 

				}
				break;
			case 105 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:817: PRODUCT
				{
				mPRODUCT(); 

				}
				break;
			case 106 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:825: RESOLVING
				{
				mRESOLVING(); 

				}
				break;
			case 107 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:835: RIGHT
				{
				mRIGHT(); 

				}
				break;
			case 108 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:841: REMOVE
				{
				mREMOVE(); 

				}
				break;
			case 109 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:848: SAVE
				{
				mSAVE(); 

				}
				break;
			case 110 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:853: SERVER
				{
				mSERVER(); 

				}
				break;
			case 111 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:860: SET
				{
				mSET(); 

				}
				break;
			case 112 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:864: SETS
				{
				mSETS(); 

				}
				break;
			case 113 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:869: SETTING
				{
				mSETTING(); 

				}
				break;
			case 114 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:877: SORT
				{
				mSORT(); 

				}
				break;
			case 115 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:882: SUBTRACT
				{
				mSUBTRACT(); 

				}
				break;
			case 116 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:891: SUM
				{
				mSUM(); 

				}
				break;
			case 117 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:895: TO
				{
				mTO(); 

				}
				break;
			case 118 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:898: TO_POLYLINE
				{
				mTO_POLYLINE(); 

				}
				break;
			case 119 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:910: THRESHOLD
				{
				mTHRESHOLD(); 

				}
				break;
			case 120 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:920: TRANSLATE
				{
				mTRANSLATE(); 

				}
				break;
			case 121 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:930: TRAJECTORY
				{
				mTRAJECTORY(); 

				}
				break;
			case 122 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:941: TYPE
				{
				mTYPE(); 

				}
				break;
			case 123 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:946: UNCOMPARABLE
				{
				mUNCOMPARABLE(); 

				}
				break;
			case 124 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:959: UNKNOWN
				{
				mUNKNOWN(); 

				}
				break;
			case 125 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:967: UNPACK
				{
				mUNPACK(); 

				}
				break;
			case 126 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:974: USE
				{
				mUSE(); 

				}
				break;
			case 127 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:978: USING
				{
				mUSING(); 

				}
				break;
			case 128 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:984: VERSUS
				{
				mVERSUS(); 

				}
				break;
			case 129 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:991: WHERE
				{
				mWHERE(); 

				}
				break;
			case 130 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:997: WITH
				{
				mWITH(); 

				}
				break;
			case 131 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1002: WITHIN
				{
				mWITHIN(); 

				}
				break;
			case 132 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1009: WITHOUT
				{
				mWITHOUT(); 

				}
				break;
			case 133 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1017: WRT
				{
				mWRT(); 

				}
				break;
			case 134 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1021: INT
				{
				mINT(); 

				}
				break;
			case 135 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1025: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 136 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1031: ID
				{
				mID(); 

				}
				break;
			case 137 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1034: FIELD_NAME
				{
				mFIELD_NAME(); 

				}
				break;
			case 138 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1045: AT
				{
				mAT(); 

				}
				break;
			case 139 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1048: EQ
				{
				mEQ(); 

				}
				break;
			case 140 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1051: NEQ
				{
				mNEQ(); 

				}
				break;
			case 141 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1055: LE
				{
				mLE(); 

				}
				break;
			case 142 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1058: GE
				{
				mGE(); 

				}
				break;
			case 143 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1061: LT
				{
				mLT(); 

				}
				break;
			case 144 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1064: GT
				{
				mGT(); 

				}
				break;
			case 145 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1067: DOT
				{
				mDOT(); 

				}
				break;
			case 146 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1071: ADD
				{
				mADD(); 

				}
				break;
			case 147 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1075: SUB
				{
				mSUB(); 

				}
				break;
			case 148 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1079: MUL
				{
				mMUL(); 

				}
				break;
			case 149 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1083: DIV
				{
				mDIV(); 

				}
				break;
			case 150 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1087: EXP
				{
				mEXP(); 

				}
				break;
			case 151 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1091: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 152 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1097: COLON
				{
				mCOLON(); 

				}
				break;
			case 153 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1103: SC
				{
				mSC(); 

				}
				break;
			case 154 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1106: LP
				{
				mLP(); 

				}
				break;
			case 155 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1109: RP
				{
				mRP(); 

				}
				break;
			case 156 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1112: LB
				{
				mLB(); 

				}
				break;
			case 157 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1115: RB
				{
				mRB(); 

				}
				break;
			case 158 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1118: LBR
				{
				mLBR(); 

				}
				break;
			case 159 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1122: RBR
				{
				mRBR(); 

				}
				break;
			case 160 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1126: APEX
				{
				mAPEX(); 

				}
				break;
			case 161 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1131: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 162 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1137: TILDE
				{
				mTILDE(); 

				}
				break;
			case 163 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1143: XXX
				{
				mXXX(); 

				}
				break;
			case 164 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1147: WHITE_SPACES
				{
				mWHITE_SPACES(); 

				}
				break;
			case 165 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1160: APEX_VALUE
				{
				mAPEX_VALUE(); 

				}
				break;
			case 166 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1171: QUOTED_VALUE
				{
				mQUOTED_VALUE(); 

				}
				break;
			case 167 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1184: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 168 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS Geco\\GecoProject 4.0\\src\\jco\\ql\\parser\\JCoQL.g:1:1192: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA23_eotS =
		"\1\uffff\25\72\2\174\1\uffff\1\177\2\uffff\1\62\1\u0085\1\u0087\3\uffff"+
		"\1\u008c\12\uffff\1\u0097\1\u0099\1\uffff\1\62\2\uffff\6\72\1\u00a6\1"+
		"\uffff\1\u00a9\1\u00aa\1\u00ab\15\72\1\u00be\5\72\1\u00c7\14\72\1\u00d9"+
		"\12\72\1\u00ef\22\72\2\uffff\1\174\37\uffff\1\u010a\1\u010c\1\72\1\u010e"+
		"\3\72\1\u0112\1\uffff\2\72\3\uffff\2\72\1\u0117\7\72\1\u0120\4\72\1\u0127"+
		"\2\72\1\uffff\10\72\1\uffff\6\72\1\u0139\12\72\1\uffff\14\72\1\u0151\10"+
		"\72\2\uffff\13\72\1\u0169\10\72\1\u0172\3\72\1\u0176\1\uffff\1\72\1\uffff"+
		"\1\72\1\uffff\3\72\1\uffff\4\72\1\uffff\1\72\1\uffff\2\72\1\u0183\3\72"+
		"\1\uffff\1\72\1\u0189\1\u018a\1\72\1\u018c\1\72\1\uffff\1\u018e\1\72\1"+
		"\uffff\1\u0190\3\72\1\u0194\4\72\1\u0199\4\72\1\uffff\3\72\1\u01a1\1\u01a3"+
		"\11\72\1\u0112\4\72\1\u01b2\3\72\1\uffff\11\72\1\u01c0\1\uffff\1\u01c3"+
		"\1\u01c5\1\u01c7\1\72\1\u01c9\1\u01ca\6\72\1\uffff\10\72\1\uffff\2\72"+
		"\1\u01dd\1\uffff\3\72\1\u01e1\2\72\1\u01e4\5\72\1\uffff\1\72\1\u01eb\1"+
		"\u01ec\2\72\2\uffff\1\72\1\uffff\1\72\1\uffff\1\u01f1\1\uffff\3\72\1\uffff"+
		"\4\72\1\uffff\1\u0194\1\u01fa\1\72\1\u01fc\1\uffff\1\72\1\u0200\1\uffff"+
		"\1\u0201\1\uffff\1\72\1\u0203\14\72\1\uffff\3\72\1\u0214\6\72\1\u021b"+
		"\2\72\4\uffff\1\72\1\uffff\1\72\1\uffff\1\u0220\2\uffff\4\72\1\u0225\5"+
		"\72\1\u022b\3\72\1\u022f\1\u0230\2\72\1\uffff\1\u0233\2\72\1\uffff\2\72"+
		"\1\uffff\1\72\1\u0239\4\72\2\uffff\1\72\1\u01e4\1\u023f\1\72\1\uffff\1"+
		"\u0241\1\u0242\5\72\1\u0248\1\uffff\1\u0249\3\uffff\1\72\4\uffff\2\72"+
		"\1\u024d\2\72\1\u0251\1\u0253\11\72\1\uffff\4\72\1\u0262\1\72\1\uffff"+
		"\4\72\1\uffff\1\72\1\u0269\2\72\1\uffff\4\72\1\u0270\1\uffff\2\72\1\u0273"+
		"\2\uffff\1\u0274\1\72\1\uffff\5\72\1\uffff\1\u027b\1\u027c\3\72\1\uffff"+
		"\1\u0280\2\uffff\5\72\2\uffff\3\72\1\uffff\1\u0289\1\72\1\u028b\1\uffff"+
		"\1\u028c\1\uffff\16\72\1\uffff\4\72\1\u029f\1\u02a0\1\uffff\4\72\1\u02a5"+
		"\1\72\1\uffff\1\72\1\u02a8\2\uffff\1\u02a9\1\72\1\u02ac\2\72\1\u02af\2"+
		"\uffff\1\u02b0\1\72\1\u02b2\1\uffff\1\u02b3\4\72\1\u02b8\2\72\1\uffff"+
		"\1\72\2\uffff\2\72\1\u02be\1\72\1\u02c0\1\72\1\u02c2\1\u02c3\1\u02c4\2"+
		"\72\1\u02c7\1\u02c8\1\u02c9\1\u02ca\1\u02cb\2\72\2\uffff\2\72\1\u02d0"+
		"\1\72\1\uffff\2\72\2\uffff\1\u02d4\1\72\1\uffff\1\u02d6\1\72\2\uffff\1"+
		"\72\2\uffff\1\u02d9\2\72\1\u02dc\1\uffff\2\72\1\u02df\1\72\1\u02e1\1\uffff"+
		"\1\u02e2\1\uffff\1\72\3\uffff\2\72\5\uffff\1\u02e7\2\72\1\u02ea\1\uffff"+
		"\1\72\1\u02ec\1\72\1\uffff\1\u02ee\1\uffff\2\72\1\uffff\1\u02f1\1\72\1"+
		"\uffff\1\u02f4\1\u02f5\1\uffff\1\u02f6\2\uffff\1\u02f7\3\72\1\uffff\1"+
		"\u02fb\1\u02fc\1\uffff\1\72\1\uffff\1\72\1\uffff\1\u02ff\1\72\1\uffff"+
		"\1\u0303\1\u0304\4\uffff\1\u0305\2\72\2\uffff\2\72\1\uffff\3\72\3\uffff"+
		"\1\72\1\u030e\1\u030f\1\u0310\1\72\2\u0312\1\u0313\3\uffff\1\72\2\uffff"+
		"\1\72\1\u0316\1\uffff";
	static final String DFA23_eofS =
		"\u0317\uffff";
	static final String DFA23_minS =
		"\1\0\1\104\1\106\1\117\2\101\1\117\1\101\1\110\2\101\1\102\1\105\1\117"+
		"\1\106\1\101\1\105\2\101\1\105\1\116\1\110\2\56\1\uffff\1\42\2\uffff\3"+
		"\75\3\uffff\1\52\12\uffff\2\0\1\uffff\1\43\2\uffff\2\104\1\107\1\114\1"+
		"\122\1\107\1\60\1\uffff\3\60\1\105\1\110\1\124\1\116\1\124\1\105\1\104"+
		"\1\102\1\122\1\126\1\122\1\104\1\111\1\60\1\104\1\103\1\120\2\101\1\60"+
		"\1\122\1\120\1\114\1\105\1\122\1\117\1\116\1\114\1\105\1\101\1\114\1\105"+
		"\1\60\1\106\2\103\1\117\1\120\1\116\1\117\1\127\1\137\1\120\1\60\1\11"+
		"\1\111\1\126\1\105\1\117\1\123\1\106\1\103\1\122\1\111\1\105\1\115\1\107"+
		"\1\103\2\105\2\124\2\uffff\1\56\37\uffff\2\60\1\122\1\60\1\110\1\101\1"+
		"\137\1\60\1\uffff\2\105\3\uffff\1\122\1\105\1\60\1\11\1\111\1\103\1\124"+
		"\1\102\1\107\1\105\1\60\2\124\1\105\1\126\1\60\1\131\1\114\1\uffff\1\11"+
		"\1\110\1\101\1\105\1\114\1\105\1\112\1\120\1\uffff\2\105\1\123\1\114\1"+
		"\124\1\123\1\60\1\115\1\103\1\132\1\114\1\105\1\103\1\123\1\114\1\123"+
		"\1\101\1\uffff\1\101\1\122\1\111\1\103\1\124\1\105\1\124\1\125\1\120\1"+
		"\114\1\105\1\115\1\60\1\125\1\137\1\105\1\117\1\114\1\125\1\122\1\105"+
		"\1\uffff\1\11\1\116\1\101\1\120\1\127\2\124\1\101\1\113\1\101\1\116\1"+
		"\131\1\60\1\103\1\104\2\117\1\110\1\117\1\116\1\101\1\60\1\116\1\122\1"+
		"\110\1\60\1\uffff\1\116\1\uffff\1\105\1\uffff\1\101\1\131\1\101\1\uffff"+
		"\1\116\1\122\1\101\1\122\1\uffff\1\115\1\uffff\1\115\1\110\1\60\2\105"+
		"\1\114\1\uffff\1\122\2\60\1\105\1\60\1\111\1\uffff\1\60\1\104\1\uffff"+
		"\1\60\2\116\1\125\1\60\1\123\1\105\1\117\1\123\1\60\1\105\1\104\1\105"+
		"\1\124\1\uffff\1\11\1\124\1\131\2\60\1\113\1\123\1\105\2\124\1\125\1\132"+
		"\1\105\1\126\1\60\1\111\1\103\1\101\1\115\1\60\1\111\1\122\1\105\1\uffff"+
		"\1\120\1\111\1\122\1\101\1\122\1\125\1\124\1\101\1\122\1\60\1\117\3\60"+
		"\1\116\2\60\1\114\1\125\1\115\1\111\1\124\1\114\1\uffff\1\117\1\125\1"+
		"\114\1\126\1\124\1\115\1\117\1\103\1\uffff\1\107\1\105\1\60\1\uffff\2"+
		"\107\1\103\1\60\1\122\1\124\1\60\1\124\1\123\2\125\1\111\1\uffff\1\122"+
		"\2\60\1\101\1\104\2\uffff\1\122\1\uffff\1\116\1\uffff\1\60\1\uffff\1\104"+
		"\1\124\1\101\1\uffff\1\114\1\103\1\114\1\110\1\uffff\2\60\1\122\1\60\1"+
		"\11\1\111\1\60\1\uffff\1\60\1\uffff\1\11\1\60\1\103\1\122\1\105\1\114"+
		"\1\132\2\105\1\117\1\124\1\116\1\105\1\111\1\uffff\1\103\1\101\1\124\1"+
		"\60\1\116\1\105\1\122\1\111\1\124\1\104\1\60\1\116\1\123\4\uffff\1\103"+
		"\1\uffff\1\116\1\uffff\1\60\2\uffff\1\114\1\120\1\105\1\124\1\60\1\111"+
		"\1\116\1\103\1\126\1\105\1\60\1\120\1\127\1\113\2\60\1\116\1\125\1\uffff"+
		"\1\60\1\101\1\125\1\uffff\1\122\1\101\1\uffff\1\117\1\60\2\115\1\116\1"+
		"\123\2\uffff\1\103\2\60\1\107\1\uffff\2\60\1\124\1\101\1\124\1\131\1\117"+
		"\1\60\1\uffff\1\60\3\uffff\1\117\4\uffff\1\124\1\101\1\60\1\124\1\111"+
		"\2\60\1\116\1\111\1\103\2\116\1\101\1\124\1\122\1\116\1\uffff\1\103\1"+
		"\105\1\117\1\114\1\60\1\105\1\uffff\1\107\1\105\1\122\1\107\1\uffff\1"+
		"\131\1\60\1\124\1\111\1\uffff\1\116\1\104\1\124\1\111\1\60\1\uffff\1\101"+
		"\1\116\1\60\2\uffff\1\60\1\124\1\uffff\2\124\1\101\1\124\1\122\1\uffff"+
		"\2\60\1\107\1\110\1\124\1\uffff\1\60\2\uffff\1\105\1\124\1\117\2\114\2"+
		"\uffff\1\116\2\111\1\uffff\1\60\1\106\1\60\1\uffff\1\60\1\uffff\1\101"+
		"\1\117\1\105\1\124\1\107\1\124\1\105\1\131\1\107\1\114\1\105\1\124\1\122"+
		"\1\123\1\uffff\1\104\1\105\1\103\1\111\2\60\1\uffff\1\105\1\117\1\105"+
		"\1\111\1\60\1\116\1\uffff\1\122\1\60\2\uffff\1\60\1\105\1\60\1\131\1\111"+
		"\1\60\2\uffff\1\60\1\111\1\60\1\uffff\1\60\1\105\1\122\1\111\1\104\1\60"+
		"\1\117\1\116\1\uffff\1\131\2\uffff\1\122\1\116\1\60\1\123\1\60\1\105\3"+
		"\60\1\125\1\122\5\60\1\124\1\120\2\uffff\1\122\1\116\1\60\1\124\1\uffff"+
		"\1\107\1\101\2\uffff\1\60\1\122\1\uffff\1\60\1\117\2\uffff\1\120\2\uffff"+
		"\1\60\1\131\1\116\1\60\1\uffff\1\116\1\124\1\60\1\131\1\60\1\uffff\1\60"+
		"\1\uffff\1\123\3\uffff\1\104\1\123\5\uffff\1\60\1\124\1\123\1\60\1\uffff"+
		"\1\111\1\60\1\102\1\uffff\1\60\1\uffff\1\116\1\137\1\uffff\1\60\1\105"+
		"\1\uffff\2\60\1\uffff\1\60\2\uffff\1\60\2\105\1\117\1\uffff\2\60\1\uffff"+
		"\1\117\1\uffff\1\114\1\uffff\1\60\1\101\1\uffff\2\60\4\uffff\1\60\1\103"+
		"\1\116\2\uffff\1\116\1\105\1\uffff\1\122\1\117\1\106\3\uffff\1\124\3\60"+
		"\1\122\3\60\3\uffff\1\101\2\uffff\1\131\1\60\1\uffff";
	static final String DFA23_maxS =
		"\1\uffff\1\126\1\124\2\117\1\125\1\131\1\130\1\131\1\125\1\122\1\125\1"+
		"\122\1\117\1\123\1\117\1\116\1\117\1\122\1\111\1\123\1\122\1\56\1\71\1"+
		"\uffff\1\176\2\uffff\3\75\3\uffff\1\57\12\uffff\2\uffff\1\uffff\1\43\2"+
		"\uffff\2\104\1\107\1\120\1\122\1\107\1\172\1\uffff\3\172\1\105\1\110\1"+
		"\124\1\116\1\130\1\122\1\104\1\115\1\122\1\126\1\124\1\104\1\111\1\172"+
		"\1\104\1\103\1\124\1\101\1\125\1\172\1\122\1\120\1\114\2\122\1\117\1\132"+
		"\1\123\1\105\1\101\1\116\1\105\1\172\2\123\1\103\1\117\1\120\1\124\1\117"+
		"\1\127\1\137\1\120\1\172\1\40\1\111\1\126\1\105\1\117\1\123\1\106\1\117"+
		"\1\122\1\123\1\117\1\123\1\107\1\120\1\111\1\105\2\124\2\uffff\1\71\37"+
		"\uffff\2\172\1\122\1\172\1\110\1\101\1\137\1\172\1\uffff\2\105\3\uffff"+
		"\1\122\1\105\1\172\2\137\1\103\1\124\1\102\1\107\1\105\1\172\2\124\1\105"+
		"\1\126\1\172\1\131\1\114\1\uffff\1\40\1\110\1\101\1\105\1\114\1\105\1"+
		"\116\1\120\1\uffff\2\105\1\123\1\114\1\124\1\123\1\172\1\115\1\103\1\132"+
		"\1\114\1\105\1\103\1\123\1\114\1\123\1\101\1\uffff\1\125\1\122\1\111\1"+
		"\103\1\124\1\105\1\124\1\125\1\120\1\114\1\105\1\115\1\172\1\125\1\137"+
		"\1\106\1\117\1\114\1\125\1\122\1\117\1\uffff\2\116\1\101\1\120\1\127\2"+
		"\124\1\101\1\113\1\124\1\116\1\131\1\172\1\103\1\104\2\117\1\110\1\117"+
		"\1\116\1\101\1\172\1\116\1\122\1\110\1\172\1\uffff\1\116\1\uffff\1\105"+
		"\1\uffff\1\101\1\131\1\101\1\uffff\1\116\1\122\1\101\1\122\1\uffff\1\115"+
		"\1\uffff\1\115\1\110\1\172\2\105\1\114\1\uffff\1\122\2\172\1\105\1\172"+
		"\1\111\1\uffff\1\172\1\104\1\uffff\1\172\2\116\1\125\1\172\1\123\1\105"+
		"\1\117\1\123\1\172\1\105\1\104\1\105\1\124\1\uffff\1\40\1\124\1\131\2"+
		"\172\1\113\1\123\1\105\2\124\1\125\1\132\1\105\1\126\1\172\1\111\1\103"+
		"\1\101\1\115\1\172\1\111\1\122\1\105\1\uffff\1\120\1\115\1\122\1\101\1"+
		"\122\1\125\1\124\1\101\1\122\1\172\1\125\3\172\1\116\2\172\1\114\1\125"+
		"\1\115\1\111\1\124\1\114\1\uffff\1\117\1\125\1\114\1\126\1\124\1\115\1"+
		"\117\1\103\1\uffff\1\107\1\105\1\172\1\uffff\2\107\1\103\1\172\1\122\1"+
		"\124\1\172\1\124\1\123\2\125\1\111\1\uffff\1\122\2\172\1\101\1\104\2\uffff"+
		"\1\122\1\uffff\1\116\1\uffff\1\172\1\uffff\1\104\1\124\1\101\1\uffff\1"+
		"\114\1\103\1\114\1\110\1\uffff\2\172\1\122\1\172\1\127\1\111\1\172\1\uffff"+
		"\1\172\1\uffff\1\40\1\172\1\103\1\122\1\105\1\114\1\132\2\105\1\117\1"+
		"\124\1\116\1\105\1\111\1\uffff\1\103\1\101\1\124\1\172\1\116\1\105\1\122"+
		"\1\111\1\124\1\104\1\172\1\116\1\123\4\uffff\1\103\1\uffff\1\116\1\uffff"+
		"\1\172\2\uffff\1\114\1\120\1\105\1\124\1\172\1\111\1\116\1\103\1\126\1"+
		"\105\1\172\1\120\1\127\1\113\2\172\1\116\1\125\1\uffff\1\172\1\101\1\125"+
		"\1\uffff\1\122\1\101\1\uffff\1\117\1\172\2\115\1\116\1\123\2\uffff\1\103"+
		"\2\172\1\107\1\uffff\2\172\1\124\1\101\1\124\1\131\1\117\1\172\1\uffff"+
		"\1\172\3\uffff\1\117\4\uffff\1\124\1\101\1\172\1\124\1\111\2\172\1\116"+
		"\1\111\1\103\2\116\1\101\1\124\1\122\1\116\1\uffff\1\124\1\105\1\117\1"+
		"\114\1\172\1\105\1\uffff\1\107\1\105\1\122\1\107\1\uffff\1\131\1\172\1"+
		"\124\1\111\1\uffff\1\116\1\104\1\124\1\111\1\172\1\uffff\1\101\1\116\1"+
		"\172\2\uffff\1\172\1\124\1\uffff\2\124\1\101\1\124\1\122\1\uffff\2\172"+
		"\1\107\1\110\1\124\1\uffff\1\172\2\uffff\1\105\1\124\1\117\2\114\2\uffff"+
		"\1\116\2\111\1\uffff\1\172\1\106\1\172\1\uffff\1\172\1\uffff\1\101\1\117"+
		"\1\105\1\124\1\107\1\124\1\105\1\131\1\107\1\114\1\105\1\124\1\122\1\123"+
		"\1\uffff\1\104\1\105\1\103\1\111\2\172\1\uffff\1\105\1\117\1\105\1\111"+
		"\1\172\1\116\1\uffff\1\122\1\172\2\uffff\1\172\1\117\1\172\1\131\1\111"+
		"\1\172\2\uffff\1\172\1\111\1\172\1\uffff\1\172\1\105\1\122\1\111\1\104"+
		"\1\172\1\117\1\116\1\uffff\1\131\2\uffff\1\122\1\116\1\172\1\123\1\172"+
		"\1\105\3\172\1\125\1\122\5\172\1\124\1\120\2\uffff\1\122\1\116\1\172\1"+
		"\124\1\uffff\1\107\1\101\2\uffff\1\172\1\122\1\uffff\1\172\1\117\2\uffff"+
		"\1\120\2\uffff\1\172\1\131\1\116\1\172\1\uffff\1\116\1\124\1\172\1\131"+
		"\1\172\1\uffff\1\172\1\uffff\1\123\3\uffff\1\104\1\123\5\uffff\1\172\1"+
		"\124\1\123\1\172\1\uffff\1\111\1\172\1\102\1\uffff\1\172\1\uffff\1\116"+
		"\1\137\1\uffff\1\172\1\105\1\uffff\2\172\1\uffff\1\172\2\uffff\1\172\2"+
		"\105\1\117\1\uffff\2\172\1\uffff\1\117\1\uffff\1\114\1\uffff\1\172\1\124"+
		"\1\uffff\2\172\4\uffff\1\172\1\103\1\116\2\uffff\1\116\1\105\1\uffff\1"+
		"\122\1\117\1\106\3\uffff\1\124\3\172\1\122\3\172\3\uffff\1\101\2\uffff"+
		"\1\131\1\172\1\uffff";
	static final String DFA23_acceptS =
		"\30\uffff\1\u0088\1\uffff\1\u008a\1\u008b\3\uffff\1\u0092\1\u0093\1\u0094"+
		"\1\uffff\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d"+
		"\1\u009e\1\u009f\2\uffff\1\u00a2\1\uffff\1\u00a4\1\u00a8\7\uffff\1\u0088"+
		"\101\uffff\1\u0086\1\u0087\1\uffff\1\u0091\1\u0089\1\u008a\1\u008b\1\u008c"+
		"\1\u008d\1\u008f\1\u008e\1\u0090\1\u0092\1\u0093\1\u0094\1\u00a7\1\u0095"+
		"\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e"+
		"\1\u009f\1\u00a0\1\u00a5\1\u00a1\1\u00a6\1\u00a2\1\u00a3\1\u00a4\10\uffff"+
		"\1\14\2\uffff\1\2\1\135\1\136\22\uffff\1\21\10\uffff\1\165\21\uffff\1"+
		"\33\25\uffff\1\106\32\uffff\1\1\1\uffff\1\5\1\uffff\1\10\3\uffff\1\u0080"+
		"\4\uffff\1\3\1\uffff\1\132\6\uffff\1\164\6\uffff\1\157\2\uffff\1\16\16"+
		"\uffff\1\61\27\uffff\1\70\27\uffff\1\147\10\uffff\1\176\3\uffff\1\u0085"+
		"\14\uffff\1\126\5\uffff\1\162\1\155\1\uffff\1\160\1\uffff\1\15\1\uffff"+
		"\1\51\3\uffff\1\17\4\uffff\1\172\7\uffff\1\22\1\uffff\1\23\16\uffff\1"+
		"\46\15\uffff\1\107\1\110\1\111\1\112\1\uffff\1\113\1\uffff\1\115\1\uffff"+
		"\1\120\1\121\22\uffff\1\u0082\3\uffff\1\12\2\uffff\1\142\6\uffff\1\131"+
		"\1\134\4\uffff\1\20\10\uffff\1\55\1\uffff\1\60\1\62\1\63\1\uffff\1\65"+
		"\1\24\1\25\1\26\20\uffff\1\71\6\uffff\1\102\4\uffff\1\117\4\uffff\1\145"+
		"\5\uffff\1\153\3\uffff\1\177\1\u0081\2\uffff\1\4\5\uffff\1\141\5\uffff"+
		"\1\156\1\uffff\1\52\1\53\5\uffff\1\56\1\57\3\uffff\1\32\3\uffff\1\36\1"+
		"\uffff\1\40\16\uffff\1\100\6\uffff\1\123\6\uffff\1\154\2\uffff\1\175\1"+
		"\u0083\6\uffff\1\133\1\125\3\uffff\1\161\10\uffff\1\34\1\uffff\1\37\1"+
		"\41\22\uffff\1\116\1\122\4\uffff\1\151\2\uffff\1\174\1\u0084\2\uffff\1"+
		"\11\2\uffff\1\137\1\124\1\uffff\1\163\1\54\4\uffff\1\64\5\uffff\1\44\1"+
		"\uffff\1\47\1\uffff\1\66\1\67\1\72\2\uffff\1\75\1\76\1\77\1\101\1\103"+
		"\4\uffff\1\146\3\uffff\1\6\1\uffff\1\13\2\uffff\1\170\2\uffff\1\167\2"+
		"\uffff\1\35\1\uffff\1\43\1\45\4\uffff\1\104\2\uffff\1\144\1\uffff\1\152"+
		"\1\uffff\1\7\2\uffff\1\171\2\uffff\1\27\1\31\1\42\1\50\3\uffff\1\114\1"+
		"\143\2\uffff\1\140\3\uffff\1\166\1\30\1\73\10\uffff\1\105\1\150\1\173"+
		"\1\uffff\1\130\1\74\2\uffff\1\127";
	static final String DFA23_specialS =
		"\1\0\54\uffff\1\1\1\2\u02e8\uffff}>";
	static final String[] DFA23_transitionS = {
			"\11\62\2\61\2\62\1\61\22\62\1\61\1\34\1\56\1\60\3\62\1\55\1\47\1\50\1"+
			"\41\1\37\1\44\1\40\1\31\1\42\1\26\11\27\1\45\1\46\1\35\1\33\1\36\1\62"+
			"\1\32\1\1\1\6\1\12\1\13\1\7\1\11\1\14\1\15\1\16\1\17\1\20\1\21\1\4\1"+
			"\3\1\2\1\22\1\30\1\23\1\5\1\10\1\24\1\30\1\25\3\30\1\51\1\62\1\52\1\43"+
			"\2\62\32\30\1\53\1\62\1\54\1\57\uff81\62",
			"\1\64\2\uffff\1\65\4\uffff\1\66\1\uffff\1\63\3\uffff\1\67\1\71\2\uffff"+
			"\1\70",
			"\1\74\7\uffff\1\75\1\uffff\1\76\1\uffff\1\73\1\uffff\1\77",
			"\1\100",
			"\1\102\3\uffff\1\103\3\uffff\1\101\5\uffff\1\104",
			"\1\107\3\uffff\1\110\11\uffff\1\106\5\uffff\1\105",
			"\1\111\5\uffff\1\112\3\uffff\1\113",
			"\1\115\14\uffff\1\114\7\uffff\1\117\1\uffff\1\116",
			"\1\122\6\uffff\1\121\2\uffff\1\120\6\uffff\1\123",
			"\1\124\7\uffff\1\125\5\uffff\1\126\2\uffff\1\127\2\uffff\1\130",
			"\1\131\6\uffff\1\132\3\uffff\1\133\2\uffff\1\134\2\uffff\1\135",
			"\1\136\2\uffff\1\137\3\uffff\1\140\5\uffff\1\141\2\uffff\1\142\2\uffff"+
			"\1\143",
			"\1\144\14\uffff\1\145",
			"\1\146",
			"\1\147\6\uffff\1\150\1\151\4\uffff\1\152",
			"\1\154\15\uffff\1\153",
			"\1\155\10\uffff\1\156",
			"\1\157\3\uffff\1\160\11\uffff\1\161",
			"\1\162\15\uffff\1\163\2\uffff\1\164",
			"\1\165\3\uffff\1\166",
			"\1\167\4\uffff\1\170",
			"\1\171\1\172\10\uffff\1\173",
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
			"",
			"\0\u0098",
			"\0\u009a",
			"",
			"\1\u009c",
			"",
			"",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1\3\uffff\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\12\72\7\uffff\2\72\1\u00a5\27\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\3\72\1\u00a8\4\72\1\u00a7\21\72\4\uffff\1\72\1\uffff"+
			"\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b1\3\uffff\1\u00b0",
			"\1\u00b2\7\uffff\1\u00b3\4\uffff\1\u00b4",
			"\1\u00b5",
			"\1\u00b7\12\uffff\1\u00b6",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba\1\uffff\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1\3\uffff\1\u00c2",
			"\1\u00c3",
			"\1\u00c5\23\uffff\1\u00c4",
			"\12\72\7\uffff\32\72\4\uffff\1\u00c6\1\uffff\32\72",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb\6\uffff\1\u00cc\5\uffff\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0\13\uffff\1\u00d1",
			"\1\u00d2\6\uffff\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6\1\uffff\1\u00d7",
			"\1\u00d8",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u00da\1\u00db\12\uffff\1\u00dc\1\u00dd",
			"\1\u00de\16\uffff\1\u00df\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4\1\u00e5\4\uffff\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\12\72\7\uffff\2\72\1\u00eb\14\72\1\u00ec\3\72\1\u00ee\6\72\4\uffff"+
			"\1\u00ed\1\uffff\32\72",
			"\2\u00f0\2\uffff\1\u00f0\22\uffff\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7\13\uffff\1\u00f8",
			"\1\u00f9",
			"\1\u00fa\2\uffff\1\u00fb\6\uffff\1\u00fc",
			"\1\u00fd\11\uffff\1\u00fe",
			"\1\u0100\5\uffff\1\u00ff",
			"\1\u0101",
			"\1\u0102\7\uffff\1\u0103\4\uffff\1\u0104",
			"\1\u0105\3\uffff\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
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
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\10\72\1\u010b\21\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u010d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u0113",
			"\1\u0114",
			"",
			"",
			"",
			"\1\u0115",
			"\1\u0116",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\2\u0119\2\uffff\1\u0119\22\uffff\1\u0119\50\uffff\1\u0118\25\uffff"+
			"\1\u0111",
			"\1\u011a\25\uffff\1\u0111",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\12\72\7\uffff\32\72\4\uffff\1\u0111\1\uffff\32\72",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\12\72\7\uffff\22\72\1\u0125\1\u0126\6\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0128",
			"\1\u0129",
			"",
			"\2\u012a\2\uffff\1\u012a\22\uffff\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0131\3\uffff\1\u0130",
			"\1\u0132",
			"",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"",
			"\1\u0144\23\uffff\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a\11\uffff\1\u015b",
			"",
			"\2\u00f0\2\uffff\1\u00f0\22\uffff\1\u00f0\55\uffff\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165\22\uffff\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u0177",
			"",
			"\1\u0178",
			"",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"",
			"\1\u0180",
			"",
			"\1\u0181",
			"\1\u0182",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"",
			"\1\u0187",
			"\12\72\7\uffff\4\72\1\u0188\25\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u018b",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u018d",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u018f",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"",
			"\2\u019e\2\uffff\1\u019e\22\uffff\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\22\72\1\u01a2\7\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\12\72\7\uffff\17\72\1\u01b1\12\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"",
			"\1\u01b6",
			"\1\u01b7\3\uffff\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01c2\5\uffff\1\u01c1",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\22\72\1\u01c4\7\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\10\72\1\u01c6\21\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01c8",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"",
			"\1\u01d9",
			"\1\u01da",
			"\12\72\7\uffff\10\72\1\u01db\5\72\1\u01dc\13\72\4\uffff\1\72\1\uffff"+
			"\32\72",
			"",
			"\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01e2",
			"\1\u01e3",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"",
			"\1\u01ea",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01ed",
			"\1\u01ee",
			"",
			"",
			"\1\u01ef",
			"",
			"\1\u01f0",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\22\72\1\u01f9\7\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01fb",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\2\u019e\2\uffff\1\u019e\22\uffff\1\u019e\40\uffff\1\u01fe\25\uffff"+
			"\1\u01fd",
			"\1\u01ff",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\2\u0202\2\uffff\1\u0202\22\uffff\1\u0202",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\12\72\7\uffff\10\72\1\u0213\21\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u021c",
			"\1\u021d",
			"",
			"",
			"",
			"",
			"\1\u021e",
			"",
			"\1\u021f",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0231",
			"\1\u0232",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0234",
			"\1\u0235",
			"",
			"\1\u0236",
			"\1\u0237",
			"",
			"\1\u0238",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"",
			"",
			"\1\u023e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0240",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"",
			"\1\u024a",
			"",
			"",
			"",
			"",
			"\1\u024b",
			"\1\u024c",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u024e",
			"\1\u024f",
			"\12\72\7\uffff\22\72\1\u0250\7\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\3\72\1\u0252\26\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"",
			"\1\u025d\20\uffff\1\u025e",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0263",
			"",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"",
			"\1\u0268",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u026a",
			"\1\u026b",
			"",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u0271",
			"\1\u0272",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0275",
			"",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"",
			"",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u028a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"\1\u02a4",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02a6",
			"",
			"\1\u02a7",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02aa\11\uffff\1\u02ab",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02ad",
			"\1\u02ae",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02b1",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02b9",
			"\1\u02ba",
			"",
			"\1\u02bb",
			"",
			"",
			"\1\u02bc",
			"\1\u02bd",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02bf",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02c1",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02c5",
			"\1\u02c6",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02cc",
			"\1\u02cd",
			"",
			"",
			"\1\u02ce",
			"\1\u02cf",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02d1",
			"",
			"\1\u02d2",
			"\1\u02d3",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02d5",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02d7",
			"",
			"",
			"\1\u02d8",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02da",
			"\1\u02db",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u02dd",
			"\1\u02de",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02e0",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u02e3",
			"",
			"",
			"",
			"\1\u02e4",
			"\1\u02e5",
			"",
			"",
			"",
			"",
			"",
			"\12\72\7\uffff\10\72\1\u02e6\21\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02e8",
			"\1\u02e9",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u02eb",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02ed",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u02ef",
			"\1\u02f0",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02f2",
			"",
			"\12\72\7\uffff\22\72\1\u02f3\7\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u02fd",
			"",
			"\1\u02fe",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0300\15\uffff\1\u0302\4\uffff\1\u0301",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0306",
			"\1\u0307",
			"",
			"",
			"\1\u0308",
			"\1\u0309",
			"",
			"\1\u030a",
			"\1\u030b",
			"\1\u030c",
			"",
			"",
			"",
			"\1\u030d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0311",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"",
			"\1\u0314",
			"",
			"",
			"\1\u0315",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | OR | NOT | ADDING | ADD_ST | AGGREGATE | AGGREGATOR | ALL | ALPHACUT | ARRAY | ARRAY_FUNCTION | AS | BODY | END_BODY | BOOLEAN | BUILD | BY | CALL | CASE | CASES | CHECK_FOR | CLASS | COLLECTION | COLLECTIONS | CONSTRAINT | CREATE | DB | DEFAULT | DEFUZZIFY | DEGREE | DEGREES | DERIVE | DERIVED | DICTIONARY | DIRECTION | DISTANCE | DOCUMENTS | DROP | DROPPING | DUPLICATES | EACH | EXPAND | EXTENT | EVALUATE | FIELD | FIELDS | FILTER | FIRST | FOR | FROM_WEB | FROM_ARRAY | FUNCTION | FUZZY | GENERATE | GEOMETRY | GET | GROUP | GROUPING | HOWINCLUDE | HOWINTERSECT | HOWMEET | IF_ERROR | IF_FAILS | IMPORT | INCLUDED | INPUT | INRANGE | INTERSECT | INTERSECTION | IN | INTO | ISNULL | ISNOTNULL | JOIN | JAVA | JAVASCRIPT | KEEP | KEEPING | KNOWN | LAST | LEFT | LOCALLY | LOOKUP | MATCHING | MAXIMUM | MEET | MEMBERSHIP_ARRAY | MEMBERSHIP_TO | MERGE | MIN_SIMILARITY | MINIMUM | MODEL | OF | ON | OPERATOR | ORIENTATION | OTHERS | ORDER | PARAMETERS | PARTITION | POINT | POLYLINE | POS | PRECONDITION | PRODUCT | RESOLVING | RIGHT | REMOVE | SAVE | SERVER | SET | SETS | SETTING | SORT | SUBTRACT | SUM | TO | TO_POLYLINE | THRESHOLD | TRANSLATE | TRAJECTORY | TYPE | UNCOMPARABLE | UNKNOWN | UNPACK | USE | USING | VERSUS | WHERE | WITH | WITHIN | WITHOUT | WRT | INT | FLOAT | ID | FIELD_NAME | AT | EQ | NEQ | LE | GE | LT | GT | DOT | ADD | SUB | MUL | DIV | EXP | COMMA | COLON | SC | LP | RP | LB | RB | LBR | RBR | APEX | QUOTE | TILDE | XXX | WHITE_SPACES | APEX_VALUE | QUOTED_VALUE | COMMENT | SCAN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_0 = input.LA(1);
						s = -1;
						if ( (LA23_0=='A') ) {s = 1;}
						else if ( (LA23_0=='O') ) {s = 2;}
						else if ( (LA23_0=='N') ) {s = 3;}
						else if ( (LA23_0=='M') ) {s = 4;}
						else if ( (LA23_0=='S') ) {s = 5;}
						else if ( (LA23_0=='B') ) {s = 6;}
						else if ( (LA23_0=='E') ) {s = 7;}
						else if ( (LA23_0=='T') ) {s = 8;}
						else if ( (LA23_0=='F') ) {s = 9;}
						else if ( (LA23_0=='C') ) {s = 10;}
						else if ( (LA23_0=='D') ) {s = 11;}
						else if ( (LA23_0=='G') ) {s = 12;}
						else if ( (LA23_0=='H') ) {s = 13;}
						else if ( (LA23_0=='I') ) {s = 14;}
						else if ( (LA23_0=='J') ) {s = 15;}
						else if ( (LA23_0=='K') ) {s = 16;}
						else if ( (LA23_0=='L') ) {s = 17;}
						else if ( (LA23_0=='P') ) {s = 18;}
						else if ( (LA23_0=='R') ) {s = 19;}
						else if ( (LA23_0=='U') ) {s = 20;}
						else if ( (LA23_0=='W') ) {s = 21;}
						else if ( (LA23_0=='0') ) {s = 22;}
						else if ( ((LA23_0 >= '1' && LA23_0 <= '9')) ) {s = 23;}
						else if ( (LA23_0=='Q'||LA23_0=='V'||(LA23_0 >= 'X' && LA23_0 <= 'Z')||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {s = 24;}
						else if ( (LA23_0=='.') ) {s = 25;}
						else if ( (LA23_0=='@') ) {s = 26;}
						else if ( (LA23_0=='=') ) {s = 27;}
						else if ( (LA23_0=='!') ) {s = 28;}
						else if ( (LA23_0=='<') ) {s = 29;}
						else if ( (LA23_0=='>') ) {s = 30;}
						else if ( (LA23_0=='+') ) {s = 31;}
						else if ( (LA23_0=='-') ) {s = 32;}
						else if ( (LA23_0=='*') ) {s = 33;}
						else if ( (LA23_0=='/') ) {s = 34;}
						else if ( (LA23_0=='^') ) {s = 35;}
						else if ( (LA23_0==',') ) {s = 36;}
						else if ( (LA23_0==':') ) {s = 37;}
						else if ( (LA23_0==';') ) {s = 38;}
						else if ( (LA23_0=='(') ) {s = 39;}
						else if ( (LA23_0==')') ) {s = 40;}
						else if ( (LA23_0=='[') ) {s = 41;}
						else if ( (LA23_0==']') ) {s = 42;}
						else if ( (LA23_0=='{') ) {s = 43;}
						else if ( (LA23_0=='}') ) {s = 44;}
						else if ( (LA23_0=='\'') ) {s = 45;}
						else if ( (LA23_0=='\"') ) {s = 46;}
						else if ( (LA23_0=='~') ) {s = 47;}
						else if ( (LA23_0=='#') ) {s = 48;}
						else if ( ((LA23_0 >= '\t' && LA23_0 <= '\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 49;}
						else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\b')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\u001F')||(LA23_0 >= '$' && LA23_0 <= '&')||LA23_0=='?'||LA23_0=='\\'||(LA23_0 >= '_' && LA23_0 <= '`')||LA23_0=='|'||(LA23_0 >= '\u007F' && LA23_0 <= '\uFFFF')) ) {s = 50;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_45 = input.LA(1);
						s = -1;
						if ( ((LA23_45 >= '\u0000' && LA23_45 <= '\uFFFF')) ) {s = 152;}
						else s = 151;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA23_46 = input.LA(1);
						s = -1;
						if ( ((LA23_46 >= '\u0000' && LA23_46 <= '\uFFFF')) ) {s = 154;}
						else s = 153;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
