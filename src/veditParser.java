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
		FORMAT=21, FORMAT_TYPE=22, SEPARATOR=23, FILEPATH=24, NUMBER=25, TEXT=26, 
		COMMENT=27, WHITESPACE=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'edit'", "'convert'", "'scale'", "'speedup'", "'slowdown'", 
		"'write'", "'watermark'", "'padding'", "'volume_boost'", "'vflip'", "'hflip'", 
		"'rotate'", "'cut'", "'to'", "'from'", "'{'", "'}'", "':'", "TIME", "DIRECTION", 
		"FORMAT", "FORMAT_TYPE", "'/'", "FILEPATH", "NUMBER", "TEXT", "COMMENT", 
		"WHITESPACE"
	};
	public static final int
		RULE_script = 0, RULE_commands = 1, RULE_command = 2, RULE_cutting = 3, 
		RULE_editing = 4, RULE_clauses = 5, RULE_clause = 6;
	public static final String[] ruleNames = {
		"script", "commands", "command", "cutting", "editing", "clauses", "clause"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); commands();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); command();
				}
				}
				setState(19); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(23);
			switch (_input.LA(1)) {
			case EDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); editing();
				}
				break;
			case CUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); cutting();
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
		public List<TerminalNode> TIME() { return getTokens(veditParser.TIME); }
		public TerminalNode TO(int i) {
			return getToken(veditParser.TO, i);
		}
		public TerminalNode CUT() { return getToken(veditParser.CUT, 0); }
		public List<TerminalNode> TO() { return getTokens(veditParser.TO); }
		public TerminalNode FROM() { return getToken(veditParser.FROM, 0); }
		public TerminalNode TIME(int i) {
			return getToken(veditParser.TIME, i);
		}
		public List<TerminalNode> FILEPATH() { return getTokens(veditParser.FILEPATH); }
		public TerminalNode FILEPATH(int i) {
			return getToken(veditParser.FILEPATH, i);
		}
		public CuttingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cutting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).enterCutting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).exitCutting(this);
		}
	}

	public final CuttingContext cutting() throws RecognitionException {
		CuttingContext _localctx = new CuttingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cutting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(CUT);
			setState(26); match(FILEPATH);
			setState(27); match(TO);
			setState(28); match(FILEPATH);
			setState(29); match(FROM);
			setState(30); match(TIME);
			setState(31); match(TO);
			setState(32); match(TIME);
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
		public TerminalNode RIGHTBRACKET() { return getToken(veditParser.RIGHTBRACKET, 0); }
		public ClausesContext clauses(int i) {
			return getRuleContext(ClausesContext.class,i);
		}
		public TerminalNode EDIT() { return getToken(veditParser.EDIT, 0); }
		public List<ClausesContext> clauses() {
			return getRuleContexts(ClausesContext.class);
		}
		public TerminalNode FILEPATH() { return getToken(veditParser.FILEPATH, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(veditParser.LEFTBRACKET, 0); }
		public EditingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).enterEditing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).exitEditing(this);
		}
	}

	public final EditingContext editing() throws RecognitionException {
		EditingContext _localctx = new EditingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_editing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(EDIT);
			setState(35); match(FILEPATH);
			setState(36); match(LEFTBRACKET);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONVERT) | (1L << SCALE) | (1L << SPEEDUP) | (1L << SLOWDOWN) | (1L << WRITE) | (1L << WATERMARK) | (1L << PADDING) | (1L << VOLUME_BOOST) | (1L << VFLIP) | (1L << HFLIP) | (1L << ROTATE) | (1L << FROM))) != 0)) {
				{
				{
				setState(37); clauses();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43); match(RIGHTBRACKET);
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
		public TerminalNode RIGHTBRACKET() { return getToken(veditParser.RIGHTBRACKET, 0); }
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public List<TerminalNode> TIME() { return getTokens(veditParser.TIME); }
		public TerminalNode FROM() { return getToken(veditParser.FROM, 0); }
		public TerminalNode TIME(int i) {
			return getToken(veditParser.TIME, i);
		}
		public TerminalNode TO() { return getToken(veditParser.TO, 0); }
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public TerminalNode LEFTBRACKET() { return getToken(veditParser.LEFTBRACKET, 0); }
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).enterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).exitClauses(this);
		}
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_clauses);
		int _la;
		try {
			setState(58);
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
				setState(45); clause();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); match(FROM);
				setState(47); match(TIME);
				setState(48); match(TO);
				setState(49); match(TIME);
				setState(50); match(LEFTBRACKET);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONVERT) | (1L << SCALE) | (1L << SPEEDUP) | (1L << SLOWDOWN) | (1L << WRITE) | (1L << WATERMARK) | (1L << PADDING) | (1L << VOLUME_BOOST) | (1L << VFLIP) | (1L << HFLIP) | (1L << ROTATE))) != 0)) {
					{
					{
					setState(51); clause();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57); match(RIGHTBRACKET);
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
		public TerminalNode NUMBER(int i) {
			return getToken(veditParser.NUMBER, i);
		}
		public TerminalNode WRITE() { return getToken(veditParser.WRITE, 0); }
		public TerminalNode TO() { return getToken(veditParser.TO, 0); }
		public TerminalNode PADDING() { return getToken(veditParser.PADDING, 0); }
		public TerminalNode VFLIP() { return getToken(veditParser.VFLIP, 0); }
		public TerminalNode FILEPATH() { return getToken(veditParser.FILEPATH, 0); }
		public TerminalNode VOLUME_BOOST() { return getToken(veditParser.VOLUME_BOOST, 0); }
		public TerminalNode SLOWDOWN() { return getToken(veditParser.SLOWDOWN, 0); }
		public TerminalNode SCALE() { return getToken(veditParser.SCALE, 0); }
		public TerminalNode SPEEDUP() { return getToken(veditParser.SPEEDUP, 0); }
		public TerminalNode TEXT() { return getToken(veditParser.TEXT, 0); }
		public TerminalNode WATERMARK() { return getToken(veditParser.WATERMARK, 0); }
		public TerminalNode HFLIP() { return getToken(veditParser.HFLIP, 0); }
		public TerminalNode CONVERT() { return getToken(veditParser.CONVERT, 0); }
		public TerminalNode FORMAT() { return getToken(veditParser.FORMAT, 0); }
		public TerminalNode ROTATE() { return getToken(veditParser.ROTATE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(veditParser.NUMBER); }
		public TerminalNode DIRECTION() { return getToken(veditParser.DIRECTION, 0); }
		public TerminalNode COLLON() { return getToken(veditParser.COLLON, 0); }
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof veditListener ) ((veditListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clause);
		int _la;
		try {
			setState(107);
			switch (_input.LA(1)) {
			case CONVERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); match(CONVERT);
				setState(61); match(TO);
				setState(62); match(FORMAT);
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(SCALE);
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64); match(NUMBER);
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(69); match(COLLON);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70); match(NUMBER);
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case SPEEDUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(75); match(SPEEDUP);
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76); match(NUMBER);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case SLOWDOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); match(SLOWDOWN);
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82); match(NUMBER);
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(87); match(WRITE);
				setState(88); match(TEXT);
				}
				break;
			case WATERMARK:
				enterOuterAlt(_localctx, 6);
				{
				setState(89); match(WATERMARK);
				setState(90); match(FILEPATH);
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 7);
				{
				setState(91); match(PADDING);
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92); match(NUMBER);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case VOLUME_BOOST:
				enterOuterAlt(_localctx, 8);
				{
				setState(97); match(VOLUME_BOOST);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98); match(NUMBER);
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case HFLIP:
				enterOuterAlt(_localctx, 9);
				{
				setState(103); match(HFLIP);
				}
				break;
			case VFLIP:
				enterOuterAlt(_localctx, 10);
				{
				setState(104); match(VFLIP);
				}
				break;
			case ROTATE:
				enterOuterAlt(_localctx, 11);
				{
				setState(105); match(ROTATE);
				setState(106); match(DIRECTION);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\36p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\6\3\24\n\3\r\3"+
		"\16\3\25\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\7\6)\n\6\f\6\16\6,\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\67\n\7\f\7\16\7:\13\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\6\bD\n\b\r"+
		"\b\16\bE\3\b\3\b\6\bJ\n\b\r\b\16\bK\3\b\3\b\6\bP\n\b\r\b\16\bQ\3\b\3\b"+
		"\6\bV\n\b\r\b\16\bW\3\b\3\b\3\b\3\b\3\b\3\b\6\b`\n\b\r\b\16\ba\3\b\3\b"+
		"\6\bf\n\b\r\b\16\bg\3\b\3\b\3\b\3\b\5\bn\n\b\3\b\2\t\2\4\6\b\n\f\16\2"+
		"\2}\2\20\3\2\2\2\4\23\3\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n$\3\2\2\2\f<"+
		"\3\2\2\2\16m\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\24\5\6\4\2\23\22\3"+
		"\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\32\5"+
		"\n\6\2\30\32\5\b\5\2\31\27\3\2\2\2\31\30\3\2\2\2\32\7\3\2\2\2\33\34\7"+
		"\17\2\2\34\35\7\32\2\2\35\36\7\20\2\2\36\37\7\32\2\2\37 \7\21\2\2 !\7"+
		"\25\2\2!\"\7\20\2\2\"#\7\25\2\2#\t\3\2\2\2$%\7\3\2\2%&\7\32\2\2&*\7\22"+
		"\2\2\')\5\f\7\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3"+
		"\2\2\2-.\7\23\2\2.\13\3\2\2\2/=\5\16\b\2\60\61\7\21\2\2\61\62\7\25\2\2"+
		"\62\63\7\20\2\2\63\64\7\25\2\2\648\7\22\2\2\65\67\5\16\b\2\66\65\3\2\2"+
		"\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;=\7\23\2\2</"+
		"\3\2\2\2<\60\3\2\2\2=\r\3\2\2\2>?\7\4\2\2?@\7\20\2\2@n\7\27\2\2AC\7\5"+
		"\2\2BD\7\33\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\7"+
		"\24\2\2HJ\7\33\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2Ln\3\2\2\2M"+
		"O\7\6\2\2NP\7\33\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2Rn\3\2\2\2"+
		"SU\7\7\2\2TV\7\33\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xn\3\2\2"+
		"\2YZ\7\b\2\2Zn\7\34\2\2[\\\7\t\2\2\\n\7\32\2\2]_\7\n\2\2^`\7\33\2\2_^"+
		"\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bn\3\2\2\2ce\7\13\2\2df\7\33\2\2"+
		"ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hn\3\2\2\2in\7\r\2\2jn\7\f\2\2"+
		"kl\7\16\2\2ln\7\26\2\2m>\3\2\2\2mA\3\2\2\2mM\3\2\2\2mS\3\2\2\2mY\3\2\2"+
		"\2m[\3\2\2\2m]\3\2\2\2mc\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2n\17\3\2"+
		"\2\2\16\25\31*8<EKQWagm";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}