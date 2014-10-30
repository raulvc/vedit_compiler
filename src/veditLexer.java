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
		FORMAT=21, FORMAT_TYPE=22, SEPARATOR=23, FILEPATH=24, NUMBER=25, TEXT=26, 
		COMMENT=27, WHITESPACE=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'edit'", "'convert'", "'scale'", "'speedup'", "'slowdown'", "'write'", 
		"'watermark'", "'padding'", "'volume_boost'", "'vflip'", "'hflip'", "'rotate'", 
		"'cut'", "'to'", "'from'", "'{'", "'}'", "':'", "TIME", "DIRECTION", "FORMAT", 
		"FORMAT_TYPE", "'/'", "FILEPATH", "NUMBER", "TEXT", "COMMENT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"EDIT", "CONVERT", "SCALE", "SPEEDUP", "SLOWDOWN", "WRITE", "WATERMARK", 
		"PADDING", "VOLUME_BOOST", "VFLIP", "HFLIP", "ROTATE", "CUT", "TO", "FROM", 
		"LEFTBRACKET", "RIGHTBRACKET", "COLLON", "TIME", "DIRECTION", "FORMAT", 
		"FORMAT_TYPE", "SEPARATOR", "FILEPATH", "NUMBER", "TEXT", "COMMENT", "WHITESPACE"
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
		case 26: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 27: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u00fd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00bc\n\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00cb\n\27\3\30"+
		"\3\30\3\31\3\31\5\31\u00d1\n\31\3\31\3\31\7\31\u00d5\n\31\f\31\16\31\u00d8"+
		"\13\31\7\31\u00da\n\31\f\31\16\31\u00dd\13\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\7\33\u00e7\n\33\f\33\16\33\u00ea\13\33\3\33\3\33\3\34"+
		"\3\34\7\34\u00f0\n\34\f\34\16\34\u00f3\13\34\3\34\3\34\3\35\6\35\u00f8"+
		"\n\35\r\35\16\35\u00f9\3\35\3\35\2\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\29\36\3\3\2\5\5\2\f\f\17\17$$\6\2\f\f\17\17))\177\177\5\2"+
		"\13\f\16\17\"\"\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\3;\3\2\2\2\5@\3\2\2\2\7H\3\2\2\2\tN\3\2\2\2\13V\3\2"+
		"\2\2\r_\3\2\2\2\17e\3\2\2\2\21o\3\2\2\2\23w\3\2\2\2\25\u0084\3\2\2\2\27"+
		"\u008a\3\2\2\2\31\u0090\3\2\2\2\33\u0097\3\2\2\2\35\u009b\3\2\2\2\37\u009e"+
		"\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9\3\2\2\2"+
		")\u00bb\3\2\2\2+\u00bd\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce"+
		"\3\2\2\2\63\u00e0\3\2\2\2\65\u00e2\3\2\2\2\67\u00ed\3\2\2\29\u00f7\3\2"+
		"\2\2;<\7g\2\2<=\7f\2\2=>\7k\2\2>?\7v\2\2?\4\3\2\2\2@A\7e\2\2AB\7q\2\2"+
		"BC\7p\2\2CD\7x\2\2DE\7g\2\2EF\7t\2\2FG\7v\2\2G\6\3\2\2\2HI\7u\2\2IJ\7"+
		"e\2\2JK\7c\2\2KL\7n\2\2LM\7g\2\2M\b\3\2\2\2NO\7u\2\2OP\7r\2\2PQ\7g\2\2"+
		"QR\7g\2\2RS\7f\2\2ST\7w\2\2TU\7r\2\2U\n\3\2\2\2VW\7u\2\2WX\7n\2\2XY\7"+
		"q\2\2YZ\7y\2\2Z[\7f\2\2[\\\7q\2\2\\]\7y\2\2]^\7p\2\2^\f\3\2\2\2_`\7y\2"+
		"\2`a\7t\2\2ab\7k\2\2bc\7v\2\2cd\7g\2\2d\16\3\2\2\2ef\7y\2\2fg\7c\2\2g"+
		"h\7v\2\2hi\7g\2\2ij\7t\2\2jk\7o\2\2kl\7c\2\2lm\7t\2\2mn\7m\2\2n\20\3\2"+
		"\2\2op\7r\2\2pq\7c\2\2qr\7f\2\2rs\7f\2\2st\7k\2\2tu\7p\2\2uv\7i\2\2v\22"+
		"\3\2\2\2wx\7x\2\2xy\7q\2\2yz\7n\2\2z{\7w\2\2{|\7o\2\2|}\7g\2\2}~\7a\2"+
		"\2~\177\7d\2\2\177\u0080\7q\2\2\u0080\u0081\7q\2\2\u0081\u0082\7u\2\2"+
		"\u0082\u0083\7v\2\2\u0083\24\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086\7"+
		"h\2\2\u0086\u0087\7n\2\2\u0087\u0088\7k\2\2\u0088\u0089\7r\2\2\u0089\26"+
		"\3\2\2\2\u008a\u008b\7j\2\2\u008b\u008c\7h\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7r\2\2\u008f\30\3\2\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7v\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7g\2\2\u0096\32\3\2\2\2\u0097\u0098\7e\2\2\u0098\u0099\7"+
		"w\2\2\u0099\u009a\7v\2\2\u009a\34\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d"+
		"\7q\2\2\u009d\36\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1"+
		"\7q\2\2\u00a1\u00a2\7o\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\"\3"+
		"\2\2\2\u00a5\u00a6\7\177\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7<\2\2\u00a8&"+
		"\3\2\2\2\u00a9\u00aa\5\63\32\2\u00aa\u00ab\5\63\32\2\u00ab\u00ac\7<\2"+
		"\2\u00ac\u00ad\5\63\32\2\u00ad\u00ae\5\63\32\2\u00ae\u00af\7<\2\2\u00af"+
		"\u00b0\5\63\32\2\u00b0\u00b1\5\63\32\2\u00b1(\3\2\2\2\u00b2\u00b3\7n\2"+
		"\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7h\2\2\u00b5\u00bc\7v\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7j\2\2\u00ba"+
		"\u00bc\7v\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bc*\3\2\2\2\u00bd"+
		"\u00be\7$\2\2\u00be\u00bf\5-\27\2\u00bf\u00c0\7$\2\2\u00c0,\3\2\2\2\u00c1"+
		"\u00c2\7o\2\2\u00c2\u00c3\7r\2\2\u00c3\u00cb\7\66\2\2\u00c4\u00c5\7c\2"+
		"\2\u00c5\u00c6\7x\2\2\u00c6\u00cb\7k\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9"+
		"\7r\2\2\u00c9\u00cb\7i\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\60\3\2\2\2\u00ce"+
		"\u00d0\7$\2\2\u00cf\u00d1\7\60\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00db\3\2\2\2\u00d2\u00d6\5/\30\2\u00d3\u00d5\n\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d2\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7$\2\2\u00df\62\3\2\2\2\u00e0\u00e1"+
		"\4\62;\2\u00e1\64\3\2\2\2\u00e2\u00e8\7$\2\2\u00e3\u00e7\n\2\2\2\u00e4"+
		"\u00e5\7$\2\2\u00e5\u00e7\7$\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2"+
		"\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7$\2\2\u00ec\66\3\2\2\2\u00ed"+
		"\u00f1\7%\2\2\u00ee\u00f0\n\3\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\b\34\2\2\u00f58\3\2\2\2\u00f6\u00f8\t\4\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b\35\3\2\u00fc:\3\2\2\2\f\2\u00bb"+
		"\u00ca\u00d0\u00d6\u00db\u00e6\u00e8\u00f1\u00f9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}