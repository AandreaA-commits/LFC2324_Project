// $ANTLR 3.5.1 C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g 2024-10-08 17:45:38

	package myCompilerPackage; 	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class UmlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AADD=4;
	public static final int ABSTRACT=5;
	public static final int ADD=6;
	public static final int ATTRIBUTE=7;
	public static final int BOOLEAN_TYPE=8;
	public static final int BYTE=9;
	public static final int CHAR=10;
	public static final int CHAR_TYPE=11;
	public static final int CLASS=12;
	public static final int COMMA=13;
	public static final int COMMENT=14;
	public static final int COMP=15;
	public static final int COMPOSED=16;
	public static final int CONST=17;
	public static final int DIV=18;
	public static final int DOT=19;
	public static final int DOUBLE_TYPE=20;
	public static final int DP=21;
	public static final int DXREL=22;
	public static final int ENUM=23;
	public static final int EQ=24;
	public static final int ERROR_TOKEN=25;
	public static final int ESC_SEQ=26;
	public static final int EXPONENT=27;
	public static final int EXTENDS=28;
	public static final int FALSE=29;
	public static final int FINAL=30;
	public static final int FLOAT=31;
	public static final int FLOAT_TYPE=32;
	public static final int GTE=33;
	public static final int HEX_DIGIT=34;
	public static final int ID=35;
	public static final int IMPLEMENTS=36;
	public static final int INHERITS=37;
	public static final int INT=38;
	public static final int INTERFACE=39;
	public static final int INT_TYPE=40;
	public static final int LB=41;
	public static final int LBR=42;
	public static final int LIST=43;
	public static final int LONG_TYPE=44;
	public static final int LP=45;
	public static final int LTE=46;
	public static final int MAX=47;
	public static final int MIN=48;
	public static final int MOD=49;
	public static final int MUL=50;
	public static final int MULTISET=51;
	public static final int NEQ=52;
	public static final int NONUNIQUE=53;
	public static final int NULL=54;
	public static final int OCTAL_ESC=55;
	public static final int OPERATION=56;
	public static final int ORDER=57;
	public static final int ORDEREDSET=58;
	public static final int PACKAGE=59;
	public static final int PRIVATE=60;
	public static final int PROTECTED=61;
	public static final int PUBLIC=62;
	public static final int RB=63;
	public static final int RBR=64;
	public static final int READONLY=65;
	public static final int RELATIONS=66;
	public static final int RP=67;
	public static final int SC=68;
	public static final int SET=69;
	public static final int SHARED=70;
	public static final int SHORT=71;
	public static final int SSUB=72;
	public static final int STATIC=73;
	public static final int STRING=74;
	public static final int STRING_TYPE=75;
	public static final int SXREL=76;
	public static final int THROWS=77;
	public static final int TRUE=78;
	public static final int UNDREL=79;
	public static final int UNICODE_ESC=80;
	public static final int UNIQUE=81;
	public static final int UNORDERED=82;
	public static final int VOID=83;
	public static final int WS=84;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public UmlLexer() {} 
	public UmlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public UmlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g"; }

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:176:4: ( '=' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:176:6: '='
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

	// $ANTLR start "COMP"
	public final void mCOMP() throws RecognitionException {
		try {
			int _type = COMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:177:6: ( '==' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:177:8: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:178:5: ( '!=' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:178:7: '!='
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

	// $ANTLR start "SXREL"
	public final void mSXREL() throws RecognitionException {
		try {
			int _type = SXREL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:179:7: ( '<' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:179:9: '<'
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
	// $ANTLR end "SXREL"

	// $ANTLR start "DXREL"
	public final void mDXREL() throws RecognitionException {
		try {
			int _type = DXREL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:180:7: ( '>' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:180:9: '>'
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
	// $ANTLR end "DXREL"

	// $ANTLR start "LTE"
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:181:5: ( '<=' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:181:7: '<='
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
	// $ANTLR end "LTE"

	// $ANTLR start "GTE"
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:182:5: ( '>=' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:182:7: '>='
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
	// $ANTLR end "GTE"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:183:5: ( '%' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:183:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:184:5: ( '+' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:184:7: '+'
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

	// $ANTLR start "UNDREL"
	public final void mUNDREL() throws RecognitionException {
		try {
			int _type = UNDREL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:185:8: ( '-' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:185:10: '-'
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
	// $ANTLR end "UNDREL"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:186:5: ( '*' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:186:7: '*'
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
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:187:5: ( '/' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:187:7: '/'
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

	// $ANTLR start "AADD"
	public final void mAADD() throws RecognitionException {
		try {
			int _type = AADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:188:6: ( '++' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:188:8: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AADD"

	// $ANTLR start "SSUB"
	public final void mSSUB() throws RecognitionException {
		try {
			int _type = SSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:189:6: ( '--' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:189:8: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SSUB"

	// $ANTLR start "DP"
	public final void mDP() throws RecognitionException {
		try {
			int _type = DP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:191:4: ( ':' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:191:6: ':'
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
	// $ANTLR end "DP"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:192:4: ( ';' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:192:6: ';'
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

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:193:5: ( '.' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:193:7: '.'
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

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:194:7: ( ',' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:194:9: ','
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

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:195:4: ( '(' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:195:6: '('
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
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:196:4: ( ')' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:196:6: ')'
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

	// $ANTLR start "LBR"
	public final void mLBR() throws RecognitionException {
		try {
			int _type = LBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:197:5: ( '{' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:197:7: '{'
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
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:198:5: ( '}' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:198:7: '}'
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

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:199:4: ( '[' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:199:6: '['
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
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:200:4: ( ']' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:200:6: ']'
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

	// $ANTLR start "ABSTRACT"
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:202:10: ( 'abstract' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:202:12: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABSTRACT"

	// $ANTLR start "BOOLEAN_TYPE"
	public final void mBOOLEAN_TYPE() throws RecognitionException {
		try {
			int _type = BOOLEAN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:203:14: ( 'boolean' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:203:16: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN_TYPE"

	// $ANTLR start "BYTE"
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:204:6: ( 'byte' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:204:8: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:205:11: ( 'char' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:205:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:206:7: ( 'class' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:206:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:207:7: ( 'const' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:207:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:208:13: ( 'double' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:208:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:209:6: ( 'enum' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:209:8: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:210:9: ( 'extends' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:210:11: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:211:7: ( 'false' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:211:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FINAL"
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:212:7: ( 'final' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:212:9: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINAL"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:213:12: ( 'float' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:213:14: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "IMPLEMENTS"
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:214:12: ( 'implements' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:214:14: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLEMENTS"

	// $ANTLR start "INHERITS"
	public final void mINHERITS() throws RecognitionException {
		try {
			int _type = INHERITS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:215:10: ( 'inherits' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:215:12: 'inherits'
			{
			match("inherits"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INHERITS"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:216:10: ( 'int' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:216:12: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "INTERFACE"
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:217:11: ( 'interface' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:217:13: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERFACE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:218:11: ( 'long' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:218:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "NONUNIQUE"
	public final void mNONUNIQUE() throws RecognitionException {
		try {
			int _type = NONUNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:219:11: ( 'non-unique' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:219:14: 'non-unique'
			{
			match("non-unique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NONUNIQUE"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:220:6: ( 'null' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:220:8: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:221:7: ( 'ordered' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:221:10: 'ordered'
			{
			match("ordered"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDER"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:222:9: ( 'private' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:222:11: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:223:11: ( 'protected' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:223:13: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:224:8: ( 'public' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:224:10: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:225:9: ( 'package' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:225:11: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "READONLY"
	public final void mREADONLY() throws RecognitionException {
		try {
			int _type = READONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:226:9: ( 'readOnly' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:226:11: 'readOnly'
			{
			match("readOnly"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READONLY"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:227:6: ( 'Set' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:227:9: 'Set'
			{
			match("Set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "MULTISET"
	public final void mMULTISET() throws RecognitionException {
		try {
			int _type = MULTISET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:228:11: ( 'Multi-set' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:228:14: 'Multi-set'
			{
			match("Multi-set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTISET"

	// $ANTLR start "ORDEREDSET"
	public final void mORDEREDSET() throws RecognitionException {
		try {
			int _type = ORDEREDSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:229:13: ( 'Ordered-set' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:229:16: 'Ordered-set'
			{
			match("Ordered-set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDEREDSET"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:230:6: ( 'List' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:230:8: 'List'
			{
			match("List"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:231:7: ( 'short' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:231:9: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:232:8: ( 'static' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:232:10: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "THROWS"
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:233:8: ( 'throws' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:233:10: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROWS"

	// $ANTLR start "STRING_TYPE"
	public final void mSTRING_TYPE() throws RecognitionException {
		try {
			int _type = STRING_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:234:13: ( 'String' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:234:15: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_TYPE"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:235:6: ( 'true' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:235:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "UNIQUE"
	public final void mUNIQUE() throws RecognitionException {
		try {
			int _type = UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:236:8: ( 'unique' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:236:11: 'unique'
			{
			match("unique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIQUE"

	// $ANTLR start "UNORDERED"
	public final void mUNORDERED() throws RecognitionException {
		try {
			int _type = UNORDERED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:237:11: ( 'unordered' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:237:13: 'unordered'
			{
			match("unordered"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNORDERED"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:238:6: ( 'void' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:238:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "SHARED"
	public final void mSHARED() throws RecognitionException {
		try {
			int _type = SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:239:8: ( 'shared' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:239:10: 'shared'
			{
			match("shared"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHARED"

	// $ANTLR start "COMPOSED"
	public final void mCOMPOSED() throws RecognitionException {
		try {
			int _type = COMPOSED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:240:10: ( 'composed' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:240:12: 'composed'
			{
			match("composed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPOSED"

	// $ANTLR start "ATTRIBUTE"
	public final void mATTRIBUTE() throws RecognitionException {
		try {
			int _type = ATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:241:11: ( 'attribute' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:241:13: 'attribute'
			{
			match("attribute"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATTRIBUTE"

	// $ANTLR start "RELATIONS"
	public final void mRELATIONS() throws RecognitionException {
		try {
			int _type = RELATIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:242:11: ( 'relations' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:242:13: 'relations'
			{
			match("relations"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELATIONS"

	// $ANTLR start "OPERATION"
	public final void mOPERATION() throws RecognitionException {
		try {
			int _type = OPERATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:243:11: ( 'operation' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:243:13: 'operation'
			{
			match("operation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERATION"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:244:6: ( 'min' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:244:8: 'min'
			{
			match("min"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "MAX"
	public final void mMAX() throws RecognitionException {
		try {
			int _type = MAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:245:6: ( 'max' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:245:8: 'max'
			{
			match("max"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:247:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:247:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:247:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
					break loop1;
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:250:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:250:7: ( '0' .. '9' )+
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:250:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

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
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:254:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:254:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:254:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:254:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
							break loop4;
						}
					}

					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:254:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:254:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:255:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:255:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:255:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:255:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:256:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:256:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:260:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:260:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:260:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
							break loop10;
						}
					}

					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:260:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:260:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:261:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:261:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:261:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:264:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:264:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:272:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:272:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:272:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:272:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:272:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:275:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:275:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:275:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:275:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:275:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

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
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:281:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:281:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:281:22: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:281:33: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:284:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:288:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt18=1;
					}
					break;
				case 'u':
					{
					alt18=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt18=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:288:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:289:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:290:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:295:6: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
					int LA19_2 = input.LA(3);
					if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
						int LA19_4 = input.LA(4);
						if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						alt19=3;
					}

				}
				else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
					int LA19_3 = input.LA(3);
					if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
						alt19=2;
					}

					else {
						alt19=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:295:11: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:296:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:297:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:302:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:302:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "ERROR_TOKEN"
	public final void mERROR_TOKEN() throws RecognitionException {
		try {
			int _type = ERROR_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:305:2: ( . )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:305:4: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TOKEN"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:8: ( EQ | COMP | NEQ | SXREL | DXREL | LTE | GTE | MOD | ADD | UNDREL | MUL | DIV | AADD | SSUB | DP | SC | DOT | COMMA | LP | RP | LBR | RBR | LB | RB | ABSTRACT | BOOLEAN_TYPE | BYTE | CHAR_TYPE | CLASS | CONST | DOUBLE_TYPE | ENUM | EXTENDS | FALSE | FINAL | FLOAT_TYPE | IMPLEMENTS | INHERITS | INT_TYPE | INTERFACE | LONG_TYPE | NONUNIQUE | NULL | ORDER | PRIVATE | PROTECTED | PUBLIC | PACKAGE | READONLY | SET | MULTISET | ORDEREDSET | LIST | SHORT | STATIC | THROWS | STRING_TYPE | TRUE | UNIQUE | UNORDERED | VOID | SHARED | COMPOSED | ATTRIBUTE | RELATIONS | OPERATION | MIN | MAX | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | ERROR_TOKEN )
		int alt20=76;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:10: EQ
				{
				mEQ(); 

				}
				break;
			case 2 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:13: COMP
				{
				mCOMP(); 

				}
				break;
			case 3 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:18: NEQ
				{
				mNEQ(); 

				}
				break;
			case 4 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:22: SXREL
				{
				mSXREL(); 

				}
				break;
			case 5 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:28: DXREL
				{
				mDXREL(); 

				}
				break;
			case 6 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:34: LTE
				{
				mLTE(); 

				}
				break;
			case 7 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:38: GTE
				{
				mGTE(); 

				}
				break;
			case 8 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:42: MOD
				{
				mMOD(); 

				}
				break;
			case 9 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:46: ADD
				{
				mADD(); 

				}
				break;
			case 10 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:50: UNDREL
				{
				mUNDREL(); 

				}
				break;
			case 11 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:57: MUL
				{
				mMUL(); 

				}
				break;
			case 12 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:61: DIV
				{
				mDIV(); 

				}
				break;
			case 13 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:65: AADD
				{
				mAADD(); 

				}
				break;
			case 14 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:70: SSUB
				{
				mSSUB(); 

				}
				break;
			case 15 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:75: DP
				{
				mDP(); 

				}
				break;
			case 16 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:78: SC
				{
				mSC(); 

				}
				break;
			case 17 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:81: DOT
				{
				mDOT(); 

				}
				break;
			case 18 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:85: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 19 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:91: LP
				{
				mLP(); 

				}
				break;
			case 20 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:94: RP
				{
				mRP(); 

				}
				break;
			case 21 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:97: LBR
				{
				mLBR(); 

				}
				break;
			case 22 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:101: RBR
				{
				mRBR(); 

				}
				break;
			case 23 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:105: LB
				{
				mLB(); 

				}
				break;
			case 24 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:108: RB
				{
				mRB(); 

				}
				break;
			case 25 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:111: ABSTRACT
				{
				mABSTRACT(); 

				}
				break;
			case 26 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:120: BOOLEAN_TYPE
				{
				mBOOLEAN_TYPE(); 

				}
				break;
			case 27 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:133: BYTE
				{
				mBYTE(); 

				}
				break;
			case 28 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:138: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 29 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:148: CLASS
				{
				mCLASS(); 

				}
				break;
			case 30 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:154: CONST
				{
				mCONST(); 

				}
				break;
			case 31 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:160: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 32 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:172: ENUM
				{
				mENUM(); 

				}
				break;
			case 33 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:177: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 34 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:185: FALSE
				{
				mFALSE(); 

				}
				break;
			case 35 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:191: FINAL
				{
				mFINAL(); 

				}
				break;
			case 36 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:197: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 37 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:208: IMPLEMENTS
				{
				mIMPLEMENTS(); 

				}
				break;
			case 38 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:219: INHERITS
				{
				mINHERITS(); 

				}
				break;
			case 39 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:228: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 40 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:237: INTERFACE
				{
				mINTERFACE(); 

				}
				break;
			case 41 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:247: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 42 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:257: NONUNIQUE
				{
				mNONUNIQUE(); 

				}
				break;
			case 43 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:267: NULL
				{
				mNULL(); 

				}
				break;
			case 44 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:272: ORDER
				{
				mORDER(); 

				}
				break;
			case 45 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:278: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 46 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:286: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 47 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:296: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 48 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:303: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 49 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:311: READONLY
				{
				mREADONLY(); 

				}
				break;
			case 50 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:320: SET
				{
				mSET(); 

				}
				break;
			case 51 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:324: MULTISET
				{
				mMULTISET(); 

				}
				break;
			case 52 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:333: ORDEREDSET
				{
				mORDEREDSET(); 

				}
				break;
			case 53 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:344: LIST
				{
				mLIST(); 

				}
				break;
			case 54 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:349: SHORT
				{
				mSHORT(); 

				}
				break;
			case 55 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:355: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 56 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:362: THROWS
				{
				mTHROWS(); 

				}
				break;
			case 57 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:369: STRING_TYPE
				{
				mSTRING_TYPE(); 

				}
				break;
			case 58 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:381: TRUE
				{
				mTRUE(); 

				}
				break;
			case 59 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:386: UNIQUE
				{
				mUNIQUE(); 

				}
				break;
			case 60 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:393: UNORDERED
				{
				mUNORDERED(); 

				}
				break;
			case 61 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:403: VOID
				{
				mVOID(); 

				}
				break;
			case 62 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:408: SHARED
				{
				mSHARED(); 

				}
				break;
			case 63 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:415: COMPOSED
				{
				mCOMPOSED(); 

				}
				break;
			case 64 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:424: ATTRIBUTE
				{
				mATTRIBUTE(); 

				}
				break;
			case 65 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:434: RELATIONS
				{
				mRELATIONS(); 

				}
				break;
			case 66 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:444: OPERATION
				{
				mOPERATION(); 

				}
				break;
			case 67 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:454: MIN
				{
				mMIN(); 

				}
				break;
			case 68 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:458: MAX
				{
				mMAX(); 

				}
				break;
			case 69 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:462: ID
				{
				mID(); 

				}
				break;
			case 70 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:465: INT
				{
				mINT(); 

				}
				break;
			case 71 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:469: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 72 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:475: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 73 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:483: WS
				{
				mWS(); 

				}
				break;
			case 74 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:486: STRING
				{
				mSTRING(); 

				}
				break;
			case 75 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:493: CHAR
				{
				mCHAR(); 

				}
				break;
			case 76 :
				// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:1:498: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "253:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\1\uffff\1\60\1\56\1\63\1\65\1\uffff\1\70\1\72\1\uffff\1\75\2\uffff\1"+
		"\100\7\uffff\25\113\1\uffff\1\157\1\uffff\2\56\33\uffff\2\113\1\uffff"+
		"\43\113\1\uffff\1\157\3\uffff\20\113\1\u00b0\13\113\1\u00bc\14\113\1\u00c9"+
		"\1\u00ca\3\113\1\u00ce\1\u00cf\4\113\1\u00d4\7\113\1\uffff\1\u00dc\1\uffff"+
		"\1\u00dd\10\113\1\uffff\3\113\1\u00e9\4\113\1\u00ee\2\113\1\u00f1\2\uffff"+
		"\3\113\2\uffff\1\u00f5\1\u00f6\2\113\1\uffff\1\113\1\u00fa\1\u00fb\1\u00fc"+
		"\3\113\2\uffff\13\113\1\uffff\1\u010b\3\113\1\uffff\2\113\1\uffff\3\113"+
		"\2\uffff\1\113\1\u0115\1\113\3\uffff\7\113\1\u011e\3\113\1\u0122\1\uffff"+
		"\1\113\1\uffff\1\u0124\1\u0125\1\u0126\1\u0127\3\113\1\u012b\1\113\1\uffff"+
		"\1\u012d\3\113\1\u0131\1\113\1\u0133\1\113\1\uffff\1\u0135\2\113\1\uffff"+
		"\1\113\4\uffff\1\113\1\u013a\1\113\1\uffff\1\u013c\1\uffff\1\113\1\u013e"+
		"\1\113\1\uffff\1\113\1\uffff\1\113\1\uffff\1\u0142\1\113\1\uffff\1\113"+
		"\1\uffff\1\u0145\1\uffff\1\113\1\uffff\1\u0147\1\u0148\1\u0149\1\uffff"+
		"\1\u014a\1\u014b\1\uffff\1\u014c\6\uffff";
	static final String DFA20_eofS =
		"\u014d\uffff";
	static final String DFA20_minS =
		"\1\0\4\75\1\uffff\1\53\1\55\1\uffff\1\52\2\uffff\1\60\7\uffff\1\142\1"+
		"\157\1\150\1\157\1\156\1\141\1\155\2\157\1\160\1\141\2\145\1\165\1\162"+
		"\1\151\2\150\1\156\1\157\1\141\1\uffff\1\56\1\uffff\2\0\33\uffff\1\163"+
		"\1\164\1\uffff\1\157\1\164\2\141\1\155\2\165\1\164\1\154\1\156\1\157\1"+
		"\160\1\150\2\156\1\154\1\144\1\145\1\151\1\142\1\143\1\141\1\164\1\162"+
		"\1\154\1\144\1\163\2\141\1\162\1\165\2\151\1\156\1\170\1\uffff\1\56\3"+
		"\uffff\1\164\1\162\1\154\1\145\1\162\2\163\1\160\1\142\1\155\1\145\1\163"+
		"\2\141\1\154\1\145\1\60\1\147\1\55\1\154\1\145\1\162\1\166\1\164\1\154"+
		"\1\153\1\144\1\141\1\60\1\151\1\164\1\145\1\164\2\162\1\164\1\157\1\145"+
		"\1\161\1\162\1\144\2\60\1\162\1\151\1\145\2\60\1\163\1\164\1\157\1\154"+
		"\1\60\1\156\1\145\1\154\1\164\1\145\2\162\1\uffff\1\60\1\uffff\1\60\1"+
		"\162\2\141\1\145\1\151\1\141\1\117\1\164\1\uffff\1\156\1\151\1\162\1\60"+
		"\1\164\1\145\1\151\1\167\1\60\1\165\1\144\1\60\2\uffff\1\141\1\142\1\141"+
		"\2\uffff\2\60\1\163\1\145\1\uffff\1\144\3\60\1\155\1\151\1\146\2\uffff"+
		"\1\145\2\164\2\143\1\147\1\156\1\151\1\147\1\55\1\145\1\uffff\1\60\1\144"+
		"\1\143\1\163\1\uffff\2\145\1\uffff\1\143\1\165\1\156\2\uffff\1\145\1\60"+
		"\1\163\3\uffff\1\145\1\164\1\141\1\144\1\151\1\145\1\164\1\60\1\145\1"+
		"\154\1\157\1\60\1\uffff\1\144\1\uffff\4\60\1\162\2\164\1\60\1\144\1\uffff"+
		"\1\60\1\156\1\163\1\143\1\60\1\157\1\60\1\145\1\uffff\1\60\1\171\1\156"+
		"\1\uffff\1\55\4\uffff\1\145\1\60\1\145\1\uffff\1\60\1\uffff\1\164\1\60"+
		"\1\145\1\uffff\1\156\1\uffff\1\144\1\uffff\1\60\1\163\1\uffff\1\144\1"+
		"\uffff\1\60\1\uffff\1\163\1\uffff\3\60\1\uffff\2\60\1\uffff\1\60\6\uffff";
	static final String DFA20_maxS =
		"\1\uffff\4\75\1\uffff\1\53\1\55\1\uffff\1\57\2\uffff\1\71\7\uffff\1\164"+
		"\1\171\2\157\1\170\1\154\1\156\1\157\1\165\1\162\1\165\1\145\1\164\1\165"+
		"\1\162\1\151\1\164\1\162\1\156\1\157\1\151\1\uffff\1\145\1\uffff\2\uffff"+
		"\33\uffff\1\163\1\164\1\uffff\1\157\1\164\2\141\1\156\2\165\1\164\1\154"+
		"\1\156\1\157\1\160\1\164\2\156\1\154\1\144\1\145\1\157\1\142\1\143\1\154"+
		"\1\164\1\162\1\154\1\144\1\163\1\157\1\141\1\162\1\165\1\157\1\151\1\156"+
		"\1\170\1\uffff\1\145\3\uffff\1\164\1\162\1\154\1\145\1\162\2\163\1\160"+
		"\1\142\1\155\1\145\1\163\2\141\1\154\1\145\1\172\1\147\1\55\1\154\1\145"+
		"\1\162\1\166\1\164\1\154\1\153\1\144\1\141\1\172\1\151\1\164\1\145\1\164"+
		"\2\162\1\164\1\157\1\145\1\161\1\162\1\144\2\172\1\162\1\151\1\145\2\172"+
		"\1\163\1\164\1\157\1\154\1\172\1\156\1\145\1\154\1\164\1\145\2\162\1\uffff"+
		"\1\172\1\uffff\1\172\1\162\2\141\1\145\1\151\1\141\1\117\1\164\1\uffff"+
		"\1\156\1\151\1\162\1\172\1\164\1\145\1\151\1\167\1\172\1\165\1\144\1\172"+
		"\2\uffff\1\141\1\142\1\141\2\uffff\2\172\1\163\1\145\1\uffff\1\144\3\172"+
		"\1\155\1\151\1\146\2\uffff\1\145\2\164\2\143\1\147\1\156\1\151\1\147\1"+
		"\55\1\145\1\uffff\1\172\1\144\1\143\1\163\1\uffff\2\145\1\uffff\1\143"+
		"\1\165\1\156\2\uffff\1\145\1\172\1\163\3\uffff\1\145\1\164\1\141\1\144"+
		"\1\151\1\145\1\164\1\172\1\145\1\154\1\157\1\172\1\uffff\1\144\1\uffff"+
		"\4\172\1\162\2\164\1\172\1\144\1\uffff\1\172\1\156\1\163\1\143\1\172\1"+
		"\157\1\172\1\145\1\uffff\1\172\1\171\1\156\1\uffff\1\55\4\uffff\1\145"+
		"\1\172\1\145\1\uffff\1\172\1\uffff\1\164\1\172\1\145\1\uffff\1\156\1\uffff"+
		"\1\144\1\uffff\1\172\1\163\1\uffff\1\144\1\uffff\1\172\1\uffff\1\163\1"+
		"\uffff\3\172\1\uffff\2\172\1\uffff\1\172\6\uffff";
	static final String DFA20_acceptS =
		"\5\uffff\1\10\2\uffff\1\13\1\uffff\1\17\1\20\1\uffff\1\22\1\23\1\24\1"+
		"\25\1\26\1\27\1\30\25\uffff\1\105\1\uffff\1\111\2\uffff\1\114\1\2\1\1"+
		"\1\3\1\6\1\4\1\7\1\5\1\10\1\15\1\11\1\16\1\12\1\13\1\110\1\14\1\17\1\20"+
		"\1\21\1\107\1\22\1\23\1\24\1\25\1\26\1\27\1\30\2\uffff\1\105\43\uffff"+
		"\1\106\1\uffff\1\111\1\112\1\113\74\uffff\1\47\1\uffff\1\52\11\uffff\1"+
		"\62\14\uffff\1\103\1\104\3\uffff\1\33\1\34\4\uffff\1\40\7\uffff\1\51\1"+
		"\53\13\uffff\1\65\4\uffff\1\72\2\uffff\1\75\3\uffff\1\35\1\36\3\uffff"+
		"\1\42\1\43\1\44\14\uffff\1\63\1\uffff\1\66\11\uffff\1\37\10\uffff\1\57"+
		"\3\uffff\1\71\1\uffff\1\76\1\67\1\70\1\73\3\uffff\1\32\1\uffff\1\41\3"+
		"\uffff\1\54\1\uffff\1\55\1\uffff\1\60\2\uffff\1\64\1\uffff\1\31\1\uffff"+
		"\1\77\1\uffff\1\46\3\uffff\1\61\2\uffff\1\100\1\uffff\1\50\1\102\1\56"+
		"\1\101\1\74\1\45";
	static final String DFA20_specialS =
		"\1\1\53\uffff\1\2\1\0\u011f\uffff}>";
	static final String[] DFA20_transitionS = {
			"\11\56\2\53\2\56\1\53\22\56\1\53\1\2\1\54\2\56\1\5\1\56\1\55\1\16\1\17"+
			"\1\10\1\6\1\15\1\7\1\14\1\11\12\52\1\12\1\13\1\3\1\1\1\4\2\56\13\51\1"+
			"\43\1\41\1\51\1\42\3\51\1\40\7\51\1\22\1\56\1\23\1\56\1\51\1\56\1\24"+
			"\1\25\1\26\1\27\1\30\1\31\2\51\1\32\2\51\1\33\1\50\1\34\1\35\1\36\1\51"+
			"\1\37\1\44\1\45\1\46\1\47\4\51\1\20\1\56\1\21\uff82\56",
			"\1\57",
			"\1\61",
			"\1\62",
			"\1\64",
			"",
			"\1\67",
			"\1\71",
			"",
			"\1\74\4\uffff\1\74",
			"",
			"",
			"\12\101",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\111\21\uffff\1\112",
			"\1\114\11\uffff\1\115",
			"\1\116\3\uffff\1\117\2\uffff\1\120",
			"\1\121",
			"\1\122\11\uffff\1\123",
			"\1\124\7\uffff\1\125\2\uffff\1\126",
			"\1\127\1\130",
			"\1\131",
			"\1\132\5\uffff\1\133",
			"\1\135\1\uffff\1\134",
			"\1\140\20\uffff\1\136\2\uffff\1\137",
			"\1\141",
			"\1\142\16\uffff\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147\13\uffff\1\150",
			"\1\151\11\uffff\1\152",
			"\1\153",
			"\1\154",
			"\1\156\7\uffff\1\155",
			"",
			"\1\101\1\uffff\12\160\13\uffff\1\101\37\uffff\1\101",
			"",
			"\0\162",
			"\47\163\1\uffff\uffd8\163",
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
			"\1\164",
			"\1\165",
			"",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\173\1\172",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083\13\uffff\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a\5\uffff\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e\12\uffff\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0096\15\uffff\1\u0095",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a\5\uffff\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"",
			"\1\101\1\uffff\12\160\13\uffff\1\101\37\uffff\1\101",
			"",
			"",
			"",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00af\25\113",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00ef",
			"\1\u00f0",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00f7",
			"\1\u00f8",
			"",
			"\1\u00f9",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"",
			"",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"",
			"\1\u010f",
			"\1\u0110",
			"",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"",
			"",
			"\1\u0114",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u0116",
			"",
			"",
			"",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\1\u0123",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u012c",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u0132",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u0134",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u0136",
			"\1\u0137",
			"",
			"\1\u0138",
			"",
			"",
			"",
			"",
			"\1\u0139",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u013b",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\1\u013d",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u013f",
			"",
			"\1\u0140",
			"",
			"\1\u0141",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\u0143",
			"",
			"\1\u0144",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\1\u0146",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EQ | COMP | NEQ | SXREL | DXREL | LTE | GTE | MOD | ADD | UNDREL | MUL | DIV | AADD | SSUB | DP | SC | DOT | COMMA | LP | RP | LBR | RBR | LB | RB | ABSTRACT | BOOLEAN_TYPE | BYTE | CHAR_TYPE | CLASS | CONST | DOUBLE_TYPE | ENUM | EXTENDS | FALSE | FINAL | FLOAT_TYPE | IMPLEMENTS | INHERITS | INT_TYPE | INTERFACE | LONG_TYPE | NONUNIQUE | NULL | ORDER | PRIVATE | PROTECTED | PUBLIC | PACKAGE | READONLY | SET | MULTISET | ORDEREDSET | LIST | SHORT | STATIC | THROWS | STRING_TYPE | TRUE | UNIQUE | UNORDERED | VOID | SHARED | COMPOSED | ATTRIBUTE | RELATIONS | OPERATION | MIN | MAX | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA20_45 = input.LA(1);
						s = -1;
						if ( ((LA20_45 >= '\u0000' && LA20_45 <= '&')||(LA20_45 >= '(' && LA20_45 <= '\uFFFF')) ) {s = 115;}
						else s = 46;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA20_0 = input.LA(1);
						s = -1;
						if ( (LA20_0=='=') ) {s = 1;}
						else if ( (LA20_0=='!') ) {s = 2;}
						else if ( (LA20_0=='<') ) {s = 3;}
						else if ( (LA20_0=='>') ) {s = 4;}
						else if ( (LA20_0=='%') ) {s = 5;}
						else if ( (LA20_0=='+') ) {s = 6;}
						else if ( (LA20_0=='-') ) {s = 7;}
						else if ( (LA20_0=='*') ) {s = 8;}
						else if ( (LA20_0=='/') ) {s = 9;}
						else if ( (LA20_0==':') ) {s = 10;}
						else if ( (LA20_0==';') ) {s = 11;}
						else if ( (LA20_0=='.') ) {s = 12;}
						else if ( (LA20_0==',') ) {s = 13;}
						else if ( (LA20_0=='(') ) {s = 14;}
						else if ( (LA20_0==')') ) {s = 15;}
						else if ( (LA20_0=='{') ) {s = 16;}
						else if ( (LA20_0=='}') ) {s = 17;}
						else if ( (LA20_0=='[') ) {s = 18;}
						else if ( (LA20_0==']') ) {s = 19;}
						else if ( (LA20_0=='a') ) {s = 20;}
						else if ( (LA20_0=='b') ) {s = 21;}
						else if ( (LA20_0=='c') ) {s = 22;}
						else if ( (LA20_0=='d') ) {s = 23;}
						else if ( (LA20_0=='e') ) {s = 24;}
						else if ( (LA20_0=='f') ) {s = 25;}
						else if ( (LA20_0=='i') ) {s = 26;}
						else if ( (LA20_0=='l') ) {s = 27;}
						else if ( (LA20_0=='n') ) {s = 28;}
						else if ( (LA20_0=='o') ) {s = 29;}
						else if ( (LA20_0=='p') ) {s = 30;}
						else if ( (LA20_0=='r') ) {s = 31;}
						else if ( (LA20_0=='S') ) {s = 32;}
						else if ( (LA20_0=='M') ) {s = 33;}
						else if ( (LA20_0=='O') ) {s = 34;}
						else if ( (LA20_0=='L') ) {s = 35;}
						else if ( (LA20_0=='s') ) {s = 36;}
						else if ( (LA20_0=='t') ) {s = 37;}
						else if ( (LA20_0=='u') ) {s = 38;}
						else if ( (LA20_0=='v') ) {s = 39;}
						else if ( (LA20_0=='m') ) {s = 40;}
						else if ( ((LA20_0 >= 'A' && LA20_0 <= 'K')||LA20_0=='N'||(LA20_0 >= 'P' && LA20_0 <= 'R')||(LA20_0 >= 'T' && LA20_0 <= 'Z')||LA20_0=='_'||(LA20_0 >= 'g' && LA20_0 <= 'h')||(LA20_0 >= 'j' && LA20_0 <= 'k')||LA20_0=='q'||(LA20_0 >= 'w' && LA20_0 <= 'z')) ) {s = 41;}
						else if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {s = 42;}
						else if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 43;}
						else if ( (LA20_0=='\"') ) {s = 44;}
						else if ( (LA20_0=='\'') ) {s = 45;}
						else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\b')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '\u001F')||(LA20_0 >= '#' && LA20_0 <= '$')||LA20_0=='&'||(LA20_0 >= '?' && LA20_0 <= '@')||LA20_0=='\\'||LA20_0=='^'||LA20_0=='`'||LA20_0=='|'||(LA20_0 >= '~' && LA20_0 <= '\uFFFF')) ) {s = 46;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA20_44 = input.LA(1);
						s = -1;
						if ( ((LA20_44 >= '\u0000' && LA20_44 <= '\uFFFF')) ) {s = 114;}
						else s = 46;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 20, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
