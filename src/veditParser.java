// Generated from /home/raul/estudos/cc2/trab2/vedit_compiler/src/vedit.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class veditParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'edit'", "'convert'", "'scale'", "'speedup'", "'slowdown'", 
		"'write'", "'watermark'", "'padding'", "'volume_boost'", "'vflip'", "'hflip'", 
		"'rotate'", "'cut'", "'to'", "'from'", "'{'", "'}'", "':'", "TIME", "DIRECTION", 
		"FORMAT", "FORMAT_TYPE", "'/'", "FILENAME", "FILEORFOLDER", "'~'", "FILEPATH", 
		"NUMBER", "CHARACTER", "TEXT", "COMMENT", "WHITESPACE"
	};
	public static final int
		RULE_script = 0, RULE_commands = 1, RULE_command = 2, RULE_cutting = 3, 
		RULE_editing = 4, RULE_clauses = 5, RULE_clause = 6, RULE_convert_clause = 7;
	public static final String[] ruleNames = {
		"script", "commands", "command", "cutting", "editing", "clauses", "clause", 
		"convert_clause"
	};

	@Override
	public String getGrammarFileName() { return "vedit.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public veditParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); commands();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); command();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EDIT || _la==CUT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CuttingContext cutting() {
			return getRuleContext(CuttingContext.class,0);
		}
		public EditingContext editing() {
			return getRuleContext(EditingContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(25);
			switch (_input.LA(1)) {
			case EDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); editing();
				}
				break;
			case CUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); cutting();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CuttingContext extends ParserRuleContext {
		public TerminalNode FILEPATH(int i) {
			return getToken(veditParser.FILEPATH, i);
		}
		public TerminalNode CUT() { return getToken(veditParser.CUT, 0); }
		public List<TerminalNode> TIME() { return getTokens(veditParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(veditParser.TIME, i);
		}
		public List<TerminalNode> FILEPATH() { return getTokens(veditParser.FILEPATH); }
		public TerminalNode TO(int i) {
			return getToken(veditParser.TO, i);
		}
		public List<TerminalNode> TO() { return getTokens(veditParser.TO); }
		public TerminalNode FROM() { return getToken(veditParser.FROM, 0); }
		public CuttingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cutting; }
	}

	public final CuttingContext cutting() throws RecognitionException {
		CuttingContext _localctx = new CuttingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cutting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(CUT);
			setState(28); match(FILEPATH);
			setState(29); match(TO);
			setState(30); match(FILEPATH);
			setState(31); match(FROM);
			setState(32); match(TIME);
			setState(33); match(TO);
			setState(34); match(TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EditingContext extends ParserRuleContext {
		public ClausesContext clauses(int i) {
			return getRuleContext(ClausesContext.class,i);
		}
		public TerminalNode LEFTBRACKET() { return getToken(veditParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(veditParser.RIGHTBRACKET, 0); }
		public TerminalNode FILEPATH() { return getToken(veditParser.FILEPATH, 0); }
		public TerminalNode EDIT() { return getToken(veditParser.EDIT, 0); }
		public List<ClausesContext> clauses() {
			return getRuleContexts(ClausesContext.class);
		}
		public EditingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editing; }
	}

	public final EditingContext editing() throws RecognitionException {
		EditingContext _localctx = new EditingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_editing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(EDIT);
			setState(37); match(FILEPATH);
			setState(38); match(LEFTBRACKET);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39); clauses();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONVERT) | (1L << SCALE) | (1L << SPEEDUP) | (1L << SLOWDOWN) | (1L << WRITE) | (1L << WATERMARK) | (1L << PADDING) | (1L << VOLUME_BOOST) | (1L << VFLIP) | (1L << HFLIP) | (1L << ROTATE) | (1L << FROM))) != 0) );
			setState(44); match(RIGHTBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClausesContext extends ParserRuleContext {
		public Convert_clauseContext convert_clause() {
			return getRuleContext(Convert_clauseContext.class,0);
		}
		public TerminalNode LEFTBRACKET() { return getToken(veditParser.LEFTBRACKET, 0); }
		public List<TerminalNode> TIME() { return getTokens(veditParser.TIME); }
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(veditParser.RIGHTBRACKET, 0); }
		public TerminalNode TIME(int i) {
			return getToken(veditParser.TIME, i);
		}
		public TerminalNode TO() { return getToken(veditParser.TO, 0); }
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public TerminalNode FROM() { return getToken(veditParser.FROM, 0); }
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_clauses);
		int _la;
		try {
			setState(62);
			switch (_input.LA(1)) {
			case CONVERT:
			case SCALE:
			case SPEEDUP:
			case SLOWDOWN:
			case WRITE:
			case WATERMARK:
			case PADDING:
			case VOLUME_BOOST:
			case VFLIP:
			case HFLIP:
			case ROTATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				switch (_input.LA(1)) {
				case SCALE:
				case SPEEDUP:
				case SLOWDOWN:
				case WRITE:
				case WATERMARK:
				case PADDING:
				case VOLUME_BOOST:
				case VFLIP:
				case HFLIP:
				case ROTATE:
					{
					setState(46); clause();
					}
					break;
				case CONVERT:
					{
					setState(47); convert_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(FROM);
				setState(51); match(TIME);
				setState(52); match(TO);
				setState(53); match(TIME);
				setState(54); match(LEFTBRACKET);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCALE) | (1L << SPEEDUP) | (1L << SLOWDOWN) | (1L << WRITE) | (1L << WATERMARK) | (1L << PADDING) | (1L << VOLUME_BOOST) | (1L << VFLIP) | (1L << HFLIP) | (1L << ROTATE))) != 0)) {
					{
					{
					setState(55); clause();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61); match(RIGHTBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public TerminalNode SLOWDOWN() { return getToken(veditParser.SLOWDOWN, 0); }
		public TerminalNode TEXT() { return getToken(veditParser.TEXT, 0); }
		public TerminalNode VOLUME_BOOST() { return getToken(veditParser.VOLUME_BOOST, 0); }
		public TerminalNode VFLIP() { return getToken(veditParser.VFLIP, 0); }
		public TerminalNode DIRECTION() { return getToken(veditParser.DIRECTION, 0); }
		public TerminalNode HFLIP() { return getToken(veditParser.HFLIP, 0); }
		public TerminalNode PADDING() { return getToken(veditParser.PADDING, 0); }
		public TerminalNode COLLON() { return getToken(veditParser.COLLON, 0); }
		public TerminalNode SCALE() { return getToken(veditParser.SCALE, 0); }
		public TerminalNode ROTATE() { return getToken(veditParser.ROTATE, 0); }
		public TerminalNode WATERMARK() { return getToken(veditParser.WATERMARK, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(veditParser.NUMBER, i);
		}
		public TerminalNode FILEPATH() { return getToken(veditParser.FILEPATH, 0); }
		public TerminalNode WRITE() { return getToken(veditParser.WRITE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(veditParser.NUMBER); }
		public TerminalNode SPEEDUP() { return getToken(veditParser.SPEEDUP, 0); }
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clause);
		int _la;
		try {
			setState(108);
			switch (_input.LA(1)) {
			case SCALE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(SCALE);
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65); match(NUMBER);
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(70); match(COLLON);
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(71); match(NUMBER);
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case SPEEDUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(SPEEDUP);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77); match(NUMBER);
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case SLOWDOWN:
				enterOuterAlt(_localctx, 3);
				{
				setState(82); match(SLOWDOWN);
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83); match(NUMBER);
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); match(WRITE);
				setState(89); match(TEXT);
				}
				break;
			case WATERMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(90); match(WATERMARK);
				setState(91); match(FILEPATH);
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(92); match(PADDING);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93); match(NUMBER);
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case VOLUME_BOOST:
				enterOuterAlt(_localctx, 7);
				{
				setState(98); match(VOLUME_BOOST);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99); match(NUMBER);
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case HFLIP:
				enterOuterAlt(_localctx, 8);
				{
				setState(104); match(HFLIP);
				}
				break;
			case VFLIP:
				enterOuterAlt(_localctx, 9);
				{
				setState(105); match(VFLIP);
				}
				break;
			case ROTATE:
				enterOuterAlt(_localctx, 10);
				{
				setState(106); match(ROTATE);
				setState(107); match(DIRECTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Convert_clauseContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(veditParser.FORMAT, 0); }
		public TerminalNode CONVERT() { return getToken(veditParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(veditParser.TO, 0); }
		public Convert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convert_clause; }
	}

	public final Convert_clauseContext convert_clause() throws RecognitionException {
		Convert_clauseContext _localctx = new Convert_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_convert_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(CONVERT);
			setState(111); match(TO);
			setState(112); match(FORMAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\"u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\6\3\26"+
		"\n\3\r\3\16\3\27\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\6\6+\n\6\r\6\16\6,\3\6\3\6\3\7\3\7\5\7\63\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\5\7A\n\7\3\b\3\b\6\bE\n"+
		"\b\r\b\16\bF\3\b\3\b\6\bK\n\b\r\b\16\bL\3\b\3\b\6\bQ\n\b\r\b\16\bR\3\b"+
		"\3\b\6\bW\n\b\r\b\16\bX\3\b\3\b\3\b\3\b\3\b\3\b\6\ba\n\b\r\b\16\bb\3\b"+
		"\3\b\6\bg\n\b\r\b\16\bh\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3\t\2"+
		"\n\2\4\6\b\n\f\16\20\2\2\u0081\2\22\3\2\2\2\4\25\3\2\2\2\6\33\3\2\2\2"+
		"\b\35\3\2\2\2\n&\3\2\2\2\f@\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22\23\5\4"+
		"\3\2\23\3\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\34\5\n\6\2\32\34\5\b\5\2\33\31\3\2"+
		"\2\2\33\32\3\2\2\2\34\7\3\2\2\2\35\36\7\17\2\2\36\37\7\35\2\2\37 \7\20"+
		"\2\2 !\7\35\2\2!\"\7\21\2\2\"#\7\25\2\2#$\7\20\2\2$%\7\25\2\2%\t\3\2\2"+
		"\2&\'\7\3\2\2\'(\7\35\2\2(*\7\22\2\2)+\5\f\7\2*)\3\2\2\2+,\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\23\2\2/\13\3\2\2\2\60\63\5\16\b\2\61\63"+
		"\5\20\t\2\62\60\3\2\2\2\62\61\3\2\2\2\63A\3\2\2\2\64\65\7\21\2\2\65\66"+
		"\7\25\2\2\66\67\7\20\2\2\678\7\25\2\28<\7\22\2\29;\5\16\b\2:9\3\2\2\2"+
		";>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?A\7\23\2\2@\62\3\2"+
		"\2\2@\64\3\2\2\2A\r\3\2\2\2BD\7\5\2\2CE\7\36\2\2DC\3\2\2\2EF\3\2\2\2F"+
		"D\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\7\24\2\2IK\7\36\2\2JI\3\2\2\2KL\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2Mo\3\2\2\2NP\7\6\2\2OQ\7\36\2\2PO\3\2\2\2QR\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2So\3\2\2\2TV\7\7\2\2UW\7\36\2\2VU\3\2\2\2WX\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Yo\3\2\2\2Z[\7\b\2\2[o\7 \2\2\\]\7\t\2\2]o\7"+
		"\35\2\2^`\7\n\2\2_a\7\36\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c"+
		"o\3\2\2\2df\7\13\2\2eg\7\36\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2io\3\2\2\2jo\7\r\2\2ko\7\f\2\2lm\7\16\2\2mo\7\26\2\2nB\3\2\2\2nN\3\2"+
		"\2\2nT\3\2\2\2nZ\3\2\2\2n\\\3\2\2\2n^\3\2\2\2nd\3\2\2\2nj\3\2\2\2nk\3"+
		"\2\2\2nl\3\2\2\2o\17\3\2\2\2pq\7\4\2\2qr\7\20\2\2rs\7\27\2\2s\21\3\2\2"+
		"\2\17\27\33,\62<@FLRXbhn";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}