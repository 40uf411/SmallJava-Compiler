// Generated from C:/Users/ali25/SmallJava/grammar\Sj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SjLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, INT=31, FLOAT=32, 
		STRING=33, ID=34, INTEGER_VAL=35, FLOAT_VAL=36, STRING_VAL=37, BOOL_T=38, 
		BOOL_F=39, COMMENT=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "INT", "FLOAT", "STRING", 
			"ID", "INTEGER_VAL", "FLOAT_VAL", "STRING_VAL", "BOOL_T", "BOOL_F", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'main'", "'}'", "'import'", "'.'", "';'", "'public'", 
			"'protected'", "','", "'Si'", "'('", "')'", "'Alors'", "'Sinon Si'", 
			"'Sinon'", "'='", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'=='", 
			"'!='", "'<='", "'<'", "'!'", "'&&'", "'||'", "'int'", "'float'", "'String'", 
			null, null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "FLOAT", "STRING", "ID", 
			"INTEGER_VAL", "FLOAT_VAL", "STRING_VAL", "BOOL_T", "BOOL_F", "COMMENT", 
			"WS"
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


	public SjLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sj.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u012a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00d4\n#\f"+
		"#\16#\u00d7\13#\3$\5$\u00da\n$\3$\3$\7$\u00de\n$\f$\16$\u00e1\13$\3%\3"+
		"%\3%\7%\u00e6\n%\f%\16%\u00e9\13%\3&\3&\3&\3&\7&\u00ef\n&\f&\16&\u00f2"+
		"\13&\3&\3&\3&\3&\3&\7&\u00f9\n&\f&\16&\u00fc\13&\3&\5&\u00ff\n&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0110\n)\f)\16)\u0113"+
		"\13)\3)\3)\3)\3)\7)\u0119\n)\f)\16)\u011c\13)\3)\3)\5)\u0120\n)\3)\3)"+
		"\3*\6*\u0125\n*\r*\16*\u0126\3*\3*\3\u011a\2+\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+\3\2\r\4\2C\\c|\5\2\62;C\\c|\4\2--//\3\2\63;\3\2\62;\3\2$$\6\2\f\f\17"+
		"\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\17\17\"\"\2\u0136"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3"+
		"U\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2\rk\3\2\2\2\17m"+
		"\3\2\2\2\21o\3\2\2\2\23v\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31"+
		"\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008f\3\2\2\2!\u0098"+
		"\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a4\3\2\2\2"+
		"+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00aa\3\2\2\2\61\u00ad\3\2\2\2\63\u00b0"+
		"\3\2\2\2\65\u00b3\3\2\2\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00ba\3\2\2"+
		"\2=\u00bd\3\2\2\2?\u00c0\3\2\2\2A\u00c4\3\2\2\2C\u00ca\3\2\2\2E\u00d1"+
		"\3\2\2\2G\u00d9\3\2\2\2I\u00e2\3\2\2\2K\u00fe\3\2\2\2M\u0100\3\2\2\2O"+
		"\u0105\3\2\2\2Q\u011f\3\2\2\2S\u0124\3\2\2\2UV\7e\2\2VW\7n\2\2WX\7c\2"+
		"\2XY\7u\2\2YZ\7u\2\2Z\4\3\2\2\2[\\\7}\2\2\\\6\3\2\2\2]^\7o\2\2^_\7c\2"+
		"\2_`\7k\2\2`a\7p\2\2a\b\3\2\2\2bc\7\177\2\2c\n\3\2\2\2de\7k\2\2ef\7o\2"+
		"\2fg\7r\2\2gh\7q\2\2hi\7t\2\2ij\7v\2\2j\f\3\2\2\2kl\7\60\2\2l\16\3\2\2"+
		"\2mn\7=\2\2n\20\3\2\2\2op\7r\2\2pq\7w\2\2qr\7d\2\2rs\7n\2\2st\7k\2\2t"+
		"u\7e\2\2u\22\3\2\2\2vw\7r\2\2wx\7t\2\2xy\7q\2\2yz\7v\2\2z{\7g\2\2{|\7"+
		"e\2\2|}\7v\2\2}~\7g\2\2~\177\7f\2\2\177\24\3\2\2\2\u0080\u0081\7.\2\2"+
		"\u0081\26\3\2\2\2\u0082\u0083\7U\2\2\u0083\u0084\7k\2\2\u0084\30\3\2\2"+
		"\2\u0085\u0086\7*\2\2\u0086\32\3\2\2\2\u0087\u0088\7+\2\2\u0088\34\3\2"+
		"\2\2\u0089\u008a\7C\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7u\2\2\u008e\36\3\2\2\2\u008f\u0090\7U\2\2\u0090\u0091"+
		"\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7\"\2\2\u0095\u0096\7U\2\2\u0096\u0097\7k\2\2\u0097 \3\2\2\2\u0098"+
		"\u0099\7U\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7q\2\2"+
		"\u009c\u009d\7p\2\2\u009d\"\3\2\2\2\u009e\u009f\7?\2\2\u009f$\3\2\2\2"+
		"\u00a0\u00a1\7,\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3(\3\2\2\2"+
		"\u00a4\u00a5\7-\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7,\3\2\2\2\u00a8"+
		"\u00a9\7@\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\60\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7?\2\2\u00af\62\3\2\2\2\u00b0"+
		"\u00b1\7#\2\2\u00b1\u00b2\7?\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7>\2\2\u00b78\3\2\2\2\u00b8"+
		"\u00b9\7#\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7(\2\2\u00bb\u00bc\7(\2\2\u00bc"+
		"<\3\2\2\2\u00bd\u00be\7~\2\2\u00be\u00bf\7~\2\2\u00bf>\3\2\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3@\3\2\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7U\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7i\2\2"+
		"\u00d0D\3\2\2\2\u00d1\u00d5\t\2\2\2\u00d2\u00d4\t\3\2\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"F\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\t\4\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\t\5\2\2\u00dc\u00de"+
		"\t\6\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0H\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5G$\2\u00e3"+
		"\u00e7\7\60\2\2\u00e4\u00e6\t\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8J\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00f0\t\7\2\2\u00eb\u00ef\n\b\2\2\u00ec\u00ed\7^\2\2\u00ed"+
		"\u00ef\n\t\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00ff\t\7\2\2\u00f4\u00fa\t\n\2\2\u00f5\u00f9\n\13"+
		"\2\2\u00f6\u00f7\7^\2\2\u00f7\u00f9\n\t\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\t\n\2\2\u00fe"+
		"\u00ea\3\2\2\2\u00fe\u00f4\3\2\2\2\u00ffL\3\2\2\2\u0100\u0101\7v\2\2\u0101"+
		"\u0102\7t\2\2\u0102\u0103\7w\2\2\u0103\u0104\7g\2\2\u0104N\3\2\2\2\u0105"+
		"\u0106\7h\2\2\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2\u0108\u0109\7u\2\2"+
		"\u0109\u010a\7g\2\2\u010aP\3\2\2\2\u010b\u010c\7\61\2\2\u010c\u010d\7"+
		"\61\2\2\u010d\u0111\3\2\2\2\u010e\u0110\n\t\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0120\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116\7,\2\2\u0116"+
		"\u011a\3\2\2\2\u0117\u0119\13\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\7,\2\2\u011e\u0120\7\61\2\2\u011f\u010b\3\2"+
		"\2\2\u011f\u0114\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b)\2\2\u0122"+
		"R\3\2\2\2\u0123\u0125\t\f\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\b*\2\2\u0129T\3\2\2\2\20\2\u00d5\u00d9\u00df\u00e7\u00ee\u00f0\u00f8"+
		"\u00fa\u00fe\u0111\u011a\u011f\u0126\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}