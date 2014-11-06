// Generated from /home/raul/estudos/cc2/trab2/vedit_compiler/src/vedit.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class veditLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EDIT=1, CONVERT=2, SCALE=3, SPEEDUP=4, SLOWDOWN=5, WRITE=6, WATERMARK=7, 
		PADDING=8, VOLUME_BOOST=9, VFLIP=10, HFLIP=11, ROTATE=12, CUT=13, TO=14, 
		FROM=15, LEFTBRACKET=16, RIGHTBRACKET=17, COLLON=18, TIME=19, DIRECTION=20, 
		FORMAT=21, FORMAT_TYPE=22, SEPARATOR=23, FILENAME=24, FILEORFOLDER=25, 
		HOMEFOLDER=26, FILEPATH=27, NUMBER=28, CHARACTER=29, TEXT=30, COMMENT=31, 
		WHITESPACE=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'edit'", "'convert'", "'scale'", "'speedup'", "'slowdown'", "'write'", 
		"'watermark'", "'padding'", "'volume_boost'", "'vflip'", "'hflip'", "'rotate'", 
		"'cut'", "'to'", "'from'", "'{'", "'}'", "':'", "TIME", "DIRECTION", "FORMAT", 
		"FORMAT_TYPE", "'/'", "FILENAME", "FILEORFOLDER", "'~'", "FILEPATH", "NUMBER", 
		"CHARACTER", "TEXT", "COMMENT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"EDIT", "CONVERT", "SCALE", "SPEEDUP", "SLOWDOWN", "WRITE", "WATERMARK", 
		"PADDING", "VOLUME_BOOST", "VFLIP", "HFLIP", "ROTATE", "CUT", "TO", "FROM", 
		"LEFTBRACKET", "RIGHTBRACKET", "COLLON", "TIME", "DIRECTION", "FORMAT", 
		"FORMAT_TYPE", "SEPARATOR", "FILENAME", "FILEORFOLDER", "HOMEFOLDER", 
		"FILEPATH", "NUMBER", "CHARACTER", "TEXT", "COMMENT", "WHITESPACE"
	};


	public veditLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "vedit.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 30: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 31: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\"\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00c4\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00dc\n\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00e4\n\31\f\31\16\31\u00e7\13\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00f0\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\5\34\u00f8\n\34\3\34\3\34\3\34\7\34\u00fd\n\34\f\34\16\34\u0100"+
		"\13\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u010d"+
		"\n\37\f\37\16\37\u0110\13\37\3\37\3\37\3 \3 \7 \u0116\n \f \16 \u0119"+
		"\13 \3 \3 \3!\6!\u011e\n!\r!\16!\u011f\3!\3!\2\"\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\2A\"\3\3\2\6\4\2C\\c|\5\2\f"+
		"\f\17\17$$\6\2\f\f\17\17))\177\177\5\2\13\f\16\17\"\"\u0133\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5H\3\2\2\2\7P\3\2\2\2\tV\3\2\2"+
		"\2\13^\3\2\2\2\rg\3\2\2\2\17m\3\2\2\2\21w\3\2\2\2\23\177\3\2\2\2\25\u008c"+
		"\3\2\2\2\27\u0092\3\2\2\2\31\u0098\3\2\2\2\33\u009f\3\2\2\2\35\u00a3\3"+
		"\2\2\2\37\u00a6\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af\3\2\2\2\'"+
		"\u00b1\3\2\2\2)\u00c3\3\2\2\2+\u00c5\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2"+
		"\2\2\61\u00df\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f3\3\2\2"+
		"\29\u0104\3\2\2\2;\u0106\3\2\2\2=\u0108\3\2\2\2?\u0113\3\2\2\2A\u011d"+
		"\3\2\2\2CD\7g\2\2DE\7f\2\2EF\7k\2\2FG\7v\2\2G\4\3\2\2\2HI\7e\2\2IJ\7q"+
		"\2\2JK\7p\2\2KL\7x\2\2LM\7g\2\2MN\7t\2\2NO\7v\2\2O\6\3\2\2\2PQ\7u\2\2"+
		"QR\7e\2\2RS\7c\2\2ST\7n\2\2TU\7g\2\2U\b\3\2\2\2VW\7u\2\2WX\7r\2\2XY\7"+
		"g\2\2YZ\7g\2\2Z[\7f\2\2[\\\7w\2\2\\]\7r\2\2]\n\3\2\2\2^_\7u\2\2_`\7n\2"+
		"\2`a\7q\2\2ab\7y\2\2bc\7f\2\2cd\7q\2\2de\7y\2\2ef\7p\2\2f\f\3\2\2\2gh"+
		"\7y\2\2hi\7t\2\2ij\7k\2\2jk\7v\2\2kl\7g\2\2l\16\3\2\2\2mn\7y\2\2no\7c"+
		"\2\2op\7v\2\2pq\7g\2\2qr\7t\2\2rs\7o\2\2st\7c\2\2tu\7t\2\2uv\7m\2\2v\20"+
		"\3\2\2\2wx\7r\2\2xy\7c\2\2yz\7f\2\2z{\7f\2\2{|\7k\2\2|}\7p\2\2}~\7i\2"+
		"\2~\22\3\2\2\2\177\u0080\7x\2\2\u0080\u0081\7q\2\2\u0081\u0082\7n\2\2"+
		"\u0082\u0083\7w\2\2\u0083\u0084\7o\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7a\2\2\u0086\u0087\7d\2\2\u0087\u0088\7q\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b\24\3\2\2\2\u008c\u008d\7x\2\2\u008d"+
		"\u008e\7h\2\2\u008e\u008f\7n\2\2\u008f\u0090\7k\2\2\u0090\u0091\7r\2\2"+
		"\u0091\26\3\2\2\2\u0092\u0093\7j\2\2\u0093\u0094\7h\2\2\u0094\u0095\7"+
		"n\2\2\u0095\u0096\7k\2\2\u0096\u0097\7r\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7q\2\2\u009a\u009b\7v\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\32\3\2\2\2\u009f\u00a0\7e\2\2\u00a0"+
		"\u00a1\7w\2\2\u00a1\u00a2\7v\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7o\2\2\u00aa \3\2\2\2\u00ab\u00ac\7}\2\2\u00ac"+
		"\"\3\2\2\2\u00ad\u00ae\7\177\2\2\u00ae$\3\2\2\2\u00af\u00b0\7<\2\2\u00b0"+
		"&\3\2\2\2\u00b1\u00b2\59\35\2\u00b2\u00b3\59\35\2\u00b3\u00b4\7<\2\2\u00b4"+
		"\u00b5\59\35\2\u00b5\u00b6\59\35\2\u00b6\u00b7\7<\2\2\u00b7\u00b8\59\35"+
		"\2\u00b8\u00b9\59\35\2\u00b9(\3\2\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7"+
		"g\2\2\u00bc\u00bd\7h\2\2\u00bd\u00c4\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c4\7v\2\2\u00c3"+
		"\u00ba\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6"+
		"\u00c7\5-\27\2\u00c7\u00c8\7$\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7o\2\2\u00ca"+
		"\u00cb\7r\2\2\u00cb\u00dc\7\66\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7x\2"+
		"\2\u00ce\u00dc\7k\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7r\2\2\u00d1\u00dc"+
		"\7i\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7m\2\2\u00d4\u00dc\7x\2\2\u00d5"+
		"\u00d6\7l\2\2\u00d6\u00d7\7r\2\2\u00d7\u00dc\7i\2\2\u00d8\u00d9\7r\2\2"+
		"\u00d9\u00da\7p\2\2\u00da\u00dc\7i\2\2\u00db\u00c9\3\2\2\2\u00db\u00cc"+
		"\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d5\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00dc.\3\2\2\2\u00dd\u00de\7\61\2\2\u00de\60\3\2\2\2\u00df"+
		"\u00e5\5;\36\2\u00e0\u00e4\5;\36\2\u00e1\u00e4\59\35\2\u00e2\u00e4\7a"+
		"\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\60\2\2\u00e9\u00ea\5-\27\2\u00ea"+
		"\62\3\2\2\2\u00eb\u00f0\7\60\2\2\u00ec\u00ed\7\60\2\2\u00ed\u00f0\7\60"+
		"\2\2\u00ee\u00f0\5\61\31\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7\u0080\2\2\u00f2\66\3\2\2"+
		"\2\u00f3\u00f7\7$\2\2\u00f4\u00f5\5\65\33\2\u00f5\u00f6\5/\30\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fe\3\2"+
		"\2\2\u00f9\u00fa\5\63\32\2\u00fa\u00fb\5/\30\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\5\61\31\2\u0102"+
		"\u0103\7$\2\2\u01038\3\2\2\2\u0104\u0105\4\62;\2\u0105:\3\2\2\2\u0106"+
		"\u0107\t\2\2\2\u0107<\3\2\2\2\u0108\u010e\7$\2\2\u0109\u010d\n\3\2\2\u010a"+
		"\u010b\7$\2\2\u010b\u010d\7$\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2"+
		"\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7$\2\2\u0112>\3\2\2\2\u0113\u0117"+
		"\7%\2\2\u0114\u0116\n\4\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\b \2\2\u011b@\3\2\2\2\u011c\u011e\t\5\2\2\u011d\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\b!\3\2\u0122B\3\2\2\2\16\2\u00c3\u00db\u00e3"+
		"\u00e5\u00ef\u00f7\u00fe\u010c\u010e\u0117\u011f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}