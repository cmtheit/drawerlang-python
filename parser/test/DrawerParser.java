// Generated from Drawer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DrawerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INT=15, WS=16;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_originStat = 2, RULE_rotStat = 3, RULE_scaleStat = 4, 
		RULE_forStat = 5, RULE_drawStat = 6, RULE_value = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "originStat", "rotStat", "scaleStat", "forStat", "drawStat", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'origin'", "'is'", "'('", "','", "')'", "'rot'", "'scale'", 
			"'for'", "'from'", "'to'", "'step'", "'draw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Drawer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
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
				setState(16);
				stat();
				setState(17);
				match(T__0);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10116L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public OriginStatContext originStat() {
			return getRuleContext(OriginStatContext.class,0);
		}
		public RotStatContext rotStat() {
			return getRuleContext(RotStatContext.class,0);
		}
		public ScaleStatContext scaleStat() {
			return getRuleContext(ScaleStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public DrawStatContext drawStat() {
			return getRuleContext(DrawStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				originStat();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				rotStat();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				scaleStat();
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				forStat();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				drawStat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OriginStatContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawerParser.INT, i);
		}
		public OriginStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterOriginStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitOriginStat(this);
		}
	}

	public final OriginStatContext originStat() throws RecognitionException {
		OriginStatContext _localctx = new OriginStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_originStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__1);
			setState(31);
			match(T__2);
			setState(32);
			match(T__3);
			setState(33);
			match(INT);
			setState(34);
			match(T__4);
			setState(35);
			match(INT);
			setState(36);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RotStatContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DrawerParser.INT, 0); }
		public RotStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterRotStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitRotStat(this);
		}
	}

	public final RotStatContext rotStat() throws RecognitionException {
		RotStatContext _localctx = new RotStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rotStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__6);
			setState(39);
			match(T__2);
			setState(40);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScaleStatContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawerParser.INT, i);
		}
		public ScaleStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterScaleStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitScaleStat(this);
		}
	}

	public final ScaleStatContext scaleStat() throws RecognitionException {
		ScaleStatContext _localctx = new ScaleStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scaleStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__7);
			setState(43);
			match(T__2);
			setState(44);
			match(T__3);
			setState(45);
			match(INT);
			setState(46);
			match(T__4);
			setState(47);
			match(INT);
			setState(48);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawerParser.INT, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode ID() { return getToken(DrawerParser.ID, 0); }
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitForStat(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(50);
				match(T__8);
				setState(51);
				match(ID);
				}
			}

			setState(54);
			match(T__9);
			setState(55);
			match(INT);
			setState(56);
			match(T__10);
			setState(57);
			match(INT);
			setState(58);
			match(T__11);
			setState(59);
			match(INT);
			setState(60);
			match(T__12);
			setState(61);
			match(T__3);
			setState(62);
			value();
			setState(63);
			match(T__4);
			setState(64);
			value();
			setState(65);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DrawStatContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawerParser.INT, i);
		}
		public DrawStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterDrawStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitDrawStat(this);
		}
	}

	public final DrawStatContext drawStat() throws RecognitionException {
		DrawStatContext _localctx = new DrawStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_drawStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__12);
			setState(68);
			match(T__3);
			setState(69);
			match(INT);
			setState(70);
			match(T__4);
			setState(71);
			match(INT);
			setState(72);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DrawerParser.INT, 0); }
		public TerminalNode ID() { return getToken(DrawerParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawerListener ) ((DrawerListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001\u0010M\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f"+
		"\u0000\u0015\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u00055\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001"+
		"\u0001\u0000\u000e\u000fJ\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u001c"+
		"\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000\u0006&\u0001"+
		"\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000"+
		"\fC\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0014"+
		"\u0001\u0000\u0000\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u001d"+
		"\u0003\u0004\u0002\u0000\u0018\u001d\u0003\u0006\u0003\u0000\u0019\u001d"+
		"\u0003\b\u0004\u0000\u001a\u001d\u0003\n\u0005\u0000\u001b\u001d\u0003"+
		"\f\u0006\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u0018\u0001\u0000"+
		"\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f \u0005\u0003\u0000"+
		"\u0000 !\u0005\u0004\u0000\u0000!\"\u0005\u000f\u0000\u0000\"#\u0005\u0005"+
		"\u0000\u0000#$\u0005\u000f\u0000\u0000$%\u0005\u0006\u0000\u0000%\u0005"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0007\u0000\u0000\'(\u0005\u0003\u0000"+
		"\u0000()\u0005\u000f\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0005"+
		"\b\u0000\u0000+,\u0005\u0003\u0000\u0000,-\u0005\u0004\u0000\u0000-.\u0005"+
		"\u000f\u0000\u0000./\u0005\u0005\u0000\u0000/0\u0005\u000f\u0000\u0000"+
		"01\u0005\u0006\u0000\u00001\t\u0001\u0000\u0000\u000023\u0005\t\u0000"+
		"\u000035\u0005\u000e\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0005\n\u0000\u000078\u0005\u000f"+
		"\u0000\u000089\u0005\u000b\u0000\u00009:\u0005\u000f\u0000\u0000:;\u0005"+
		"\f\u0000\u0000;<\u0005\u000f\u0000\u0000<=\u0005\r\u0000\u0000=>\u0005"+
		"\u0004\u0000\u0000>?\u0003\u000e\u0007\u0000?@\u0005\u0005\u0000\u0000"+
		"@A\u0003\u000e\u0007\u0000AB\u0005\u0006\u0000\u0000B\u000b\u0001\u0000"+
		"\u0000\u0000CD\u0005\r\u0000\u0000DE\u0005\u0004\u0000\u0000EF\u0005\u000f"+
		"\u0000\u0000FG\u0005\u0005\u0000\u0000GH\u0005\u000f\u0000\u0000HI\u0005"+
		"\u0006\u0000\u0000I\r\u0001\u0000\u0000\u0000JK\u0007\u0000\u0000\u0000"+
		"K\u000f\u0001\u0000\u0000\u0000\u0003\u0015\u001c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}