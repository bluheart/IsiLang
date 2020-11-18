// Generated from IsiLang.g4 by ANTLR 4.8
package com.caio.isilanguage.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SE=6, ENTAO=7, SENAO=8, ENQ=9, 
		FACA=10, FDP=11, FIM=12, ATTR=13, AP=14, FP=15, AC=16, FC=17, OP_SS=18, 
		OP_DM=19, OP_REL=20, TEXTO=21, NUM=22, ID=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "SE", "ENTAO", "SENAO", "ENQ", 
			"FACA", "FDP", "FIM", "ATTR", "AP", "FP", "AC", "FC", "OP_SS", "OP_DM", 
			"OP_REL", "TEXTO", "NUM", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'declare'", "','", "'leia'", "'escreva'", "'se'", 
			"'entao'", "'senao'", "'enquanto'", "'fa\u00E7a'", "'fimprog.'", "'.'", 
			"':='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "SE", "ENTAO", "SENAO", "ENQ", "FACA", 
			"FDP", "FIM", "ATTR", "AP", "FP", "AC", "FC", "OP_SS", "OP_DM", "OP_REL", 
			"TEXTO", "NUM", "ID", "WS"
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


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0094\n\25\3\26\3\26\6\26\u0098\n\26\r\26\16\26\u0099\3\26\3\26"+
		"\3\27\5\27\u009f\n\27\3\27\6\27\u00a2\n\27\r\27\16\27\u00a3\3\27\3\27"+
		"\6\27\u00a8\n\27\r\27\16\27\u00a9\5\27\u00ac\n\27\3\30\3\30\7\30\u00b0"+
		"\n\30\f\30\16\30\u00b3\13\30\3\31\6\31\u00b6\n\31\r\31\16\31\u00b7\3\31"+
		"\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\n\4\2--"+
		"//\4\2,,\61\61\4\2>>@@\7\2\"\"))\62;C\\c|\3\2\62;\5\2C\\aac|\6\2\62;C"+
		"\\aac|\5\2\13\f\17\17\"\"\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5<\3\2\2"+
		"\2\7D\3\2\2\2\tF\3\2\2\2\13K\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2\21\\\3\2\2"+
		"\2\23b\3\2\2\2\25k\3\2\2\2\27p\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35~\3\2"+
		"\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0086\3\2\2\2\'\u0088"+
		"\3\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u009e\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\64\7r\2\2\64\65\7t\2\2\65\66\7q\2\2\66\67\7i\2\2\67"+
		"8\7t\2\289\7c\2\29:\7o\2\2:;\7c\2\2;\4\3\2\2\2<=\7f\2\2=>\7g\2\2>?\7e"+
		"\2\2?@\7n\2\2@A\7c\2\2AB\7t\2\2BC\7g\2\2C\6\3\2\2\2DE\7.\2\2E\b\3\2\2"+
		"\2FG\7n\2\2GH\7g\2\2HI\7k\2\2IJ\7c\2\2J\n\3\2\2\2KL\7g\2\2LM\7u\2\2MN"+
		"\7e\2\2NO\7t\2\2OP\7g\2\2PQ\7x\2\2QR\7c\2\2R\f\3\2\2\2ST\7u\2\2TU\7g\2"+
		"\2U\16\3\2\2\2VW\7g\2\2WX\7p\2\2XY\7v\2\2YZ\7c\2\2Z[\7q\2\2[\20\3\2\2"+
		"\2\\]\7u\2\2]^\7g\2\2^_\7p\2\2_`\7c\2\2`a\7q\2\2a\22\3\2\2\2bc\7g\2\2"+
		"cd\7p\2\2de\7s\2\2ef\7w\2\2fg\7c\2\2gh\7p\2\2hi\7v\2\2ij\7q\2\2j\24\3"+
		"\2\2\2kl\7h\2\2lm\7c\2\2mn\7\u00e9\2\2no\7c\2\2o\26\3\2\2\2pq\7h\2\2q"+
		"r\7k\2\2rs\7o\2\2st\7r\2\2tu\7t\2\2uv\7q\2\2vw\7i\2\2wx\7\60\2\2x\30\3"+
		"\2\2\2yz\7\60\2\2z\32\3\2\2\2{|\7<\2\2|}\7?\2\2}\34\3\2\2\2~\177\7*\2"+
		"\2\177\36\3\2\2\2\u0080\u0081\7+\2\2\u0081 \3\2\2\2\u0082\u0083\7}\2\2"+
		"\u0083\"\3\2\2\2\u0084\u0085\7\177\2\2\u0085$\3\2\2\2\u0086\u0087\t\2"+
		"\2\2\u0087&\3\2\2\2\u0088\u0089\t\3\2\2\u0089(\3\2\2\2\u008a\u0094\t\4"+
		"\2\2\u008b\u008c\7>\2\2\u008c\u0094\7?\2\2\u008d\u008e\7@\2\2\u008e\u0094"+
		"\7?\2\2\u008f\u0090\7#\2\2\u0090\u0094\7?\2\2\u0091\u0092\7?\2\2\u0092"+
		"\u0094\7?\2\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008d\3\2"+
		"\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094*\3\2\2\2\u0095\u0097"+
		"\7$\2\2\u0096\u0098\t\5\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7$"+
		"\2\2\u009c,\3\2\2\2\u009d\u009f\7/\2\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\t\6\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ab\3\2"+
		"\2\2\u00a5\u00a7\7\60\2\2\u00a6\u00a8\t\6\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac.\3\2\2\2\u00ad\u00b1"+
		"\t\7\2\2\u00ae\u00b0\t\b\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\60\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b6\t\t\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\31\2\2"+
		"\u00ba\62\3\2\2\2\13\2\u0093\u0099\u009e\u00a3\u00a9\u00ab\u00b1\u00b7"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}