// Generated from Drawer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DrawerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "INT", "WS"
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


	public DrawerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Drawer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\rU\b\r\u000b"+
		"\r\f\rV\u0001\u000e\u0004\u000eZ\b\u000e\u000b\u000e\f\u000e[\u0001\u000f"+
		"\u0004\u000f_\b\u000f\u000b\u000f\f\u000f`\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0013\u0002\u0000OOoo\u0002"+
		"\u0000RRrr\u0002\u0000IIii\u0002\u0000GGgg\u0002\u0000NNnn\u0002\u0000"+
		"SSss\u0002\u0000TTtt\u0002\u0000CCcc\u0002\u0000AAaa\u0002\u0000LLll\u0002"+
		"\u0000EEee\u0002\u0000FFff\u0002\u0000MMmm\u0002\u0000PPpp\u0002\u0000"+
		"DDdd\u0002\u0000WWww\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r"+
		"  f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005*\u0001"+
		"\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000"+
		"\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f"+
		"7\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013A\u0001"+
		"\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000"+
		"\u0000\u0019N\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001d"+
		"Y\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!\"\u0005;\u0000"+
		"\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$%\u0007"+
		"\u0001\u0000\u0000%&\u0007\u0002\u0000\u0000&\'\u0007\u0003\u0000\u0000"+
		"\'(\u0007\u0002\u0000\u0000()\u0007\u0004\u0000\u0000)\u0004\u0001\u0000"+
		"\u0000\u0000*+\u0007\u0002\u0000\u0000+,\u0007\u0005\u0000\u0000,\u0006"+
		"\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\b\u0001\u0000\u0000\u0000"+
		"/0\u0005,\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005)\u0000\u0000"+
		"2\f\u0001\u0000\u0000\u000034\u0007\u0001\u0000\u000045\u0007\u0000\u0000"+
		"\u000056\u0007\u0006\u0000\u00006\u000e\u0001\u0000\u0000\u000078\u0007"+
		"\u0005\u0000\u000089\u0007\u0007\u0000\u00009:\u0007\b\u0000\u0000:;\u0007"+
		"\t\u0000\u0000;<\u0007\n\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>"+
		"\u0007\u000b\u0000\u0000>?\u0007\u0000\u0000\u0000?@\u0007\u0001\u0000"+
		"\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0007\u000b\u0000\u0000BC\u0007"+
		"\u0001\u0000\u0000CD\u0007\u0000\u0000\u0000DE\u0007\f\u0000\u0000E\u0014"+
		"\u0001\u0000\u0000\u0000FG\u0007\u0006\u0000\u0000GH\u0007\u0000\u0000"+
		"\u0000H\u0016\u0001\u0000\u0000\u0000IJ\u0007\u0005\u0000\u0000JK\u0007"+
		"\u0006\u0000\u0000KL\u0007\n\u0000\u0000LM\u0007\r\u0000\u0000M\u0018"+
		"\u0001\u0000\u0000\u0000NO\u0007\u000e\u0000\u0000OP\u0007\u0001\u0000"+
		"\u0000PQ\u0007\b\u0000\u0000QR\u0007\u000f\u0000\u0000R\u001a\u0001\u0000"+
		"\u0000\u0000SU\u0007\u0010\u0000\u0000TS\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\u001c\u0001\u0000\u0000\u0000XZ\u0007\u0011\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u001e\u0001\u0000\u0000\u0000]_\u0007\u0012\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006"+
		"\u000f\u0000\u0000c \u0001\u0000\u0000\u0000\u0004\u0000V[`\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}