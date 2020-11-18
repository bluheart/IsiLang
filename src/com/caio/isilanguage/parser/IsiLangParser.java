// Generated from IsiLang.g4 by ANTLR 4.8
package com.caio.isilanguage.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SE=6, ENTAO=7, SENAO=8, ENQ=9, 
		FACA=10, FDP=11, FIM=12, ATTR=13, AP=14, FP=15, AC=16, FC=17, OP_SS=18, 
		OP_DM=19, OP_REL=20, TEXTO=21, NUM=22, ID=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_declara = 1, RULE_bloco = 2, RULE_cmd = 3, RULE_cmdLeitura = 4, 
		RULE_cmdEscrita = 5, RULE_escreveID = 6, RULE_escreveTexto = 7, RULE_cmdIf = 8, 
		RULE_cmdEnq = 9, RULE_cmdExpr = 10, RULE_compara = 11, RULE_expr = 12, 
		RULE_in_termo = 13, RULE_termo = 14, RULE_in_fator = 15, RULE_fator = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declara", "bloco", "cmd", "cmdLeitura", "cmdEscrita", "escreveID", 
			"escreveTexto", "cmdIf", "cmdEnq", "cmdExpr", "compara", "expr", "in_termo", 
			"termo", "in_fator", "fator"
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

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FDP() { return getToken(IsiLangParser.FDP, 0); }
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(35);
				declara();
				}
			}

			setState(38);
			bloco();
			setState(39);
			match(FDP);
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

	public static class DeclaraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode FIM() { return getToken(IsiLangParser.FIM, 0); }
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitDeclara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__1);
			setState(42);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(43);
				match(T__2);
				setState(44);
				match(ID);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(FIM);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				cmd();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << SE) | (1L << ENQ) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdExprContext cmdExpr() {
			return getRuleContext(CmdExprContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdEnqContext cmdEnq() {
			return getRuleContext(CmdEnqContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				cmdLeitura();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				cmdEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				cmdExpr();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				cmdIf();
				}
				break;
			case ENQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				cmdEnq();
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

	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode FIM() { return getToken(IsiLangParser.FIM, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
			setState(65);
			match(AP);
			setState(66);
			match(ID);
			setState(67);
			match(FP);
			setState(68);
			match(FIM);
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

	public static class CmdEscritaContext extends ParserRuleContext {
		public EscreveIDContext escreveID() {
			return getRuleContext(EscreveIDContext.class,0);
		}
		public EscreveTextoContext escreveTexto() {
			return getRuleContext(EscreveTextoContext.class,0);
		}
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdEscrita);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				escreveID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				escreveTexto();
				}
				break;
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

	public static class EscreveIDContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode FIM() { return getToken(IsiLangParser.FIM, 0); }
		public EscreveIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreveID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterEscreveID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitEscreveID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitEscreveID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscreveIDContext escreveID() throws RecognitionException {
		EscreveIDContext _localctx = new EscreveIDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_escreveID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__4);
			setState(75);
			match(AP);
			setState(76);
			match(ID);
			setState(77);
			match(FP);
			setState(78);
			match(FIM);
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

	public static class EscreveTextoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode TEXTO() { return getToken(IsiLangParser.TEXTO, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode FIM() { return getToken(IsiLangParser.FIM, 0); }
		public EscreveTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreveTexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterEscreveTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitEscreveTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitEscreveTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscreveTextoContext escreveTexto() throws RecognitionException {
		EscreveTextoContext _localctx = new EscreveTextoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escreveTexto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__4);
			setState(81);
			match(AP);
			setState(82);
			match(TEXTO);
			setState(83);
			match(FP);
			setState(84);
			match(FIM);
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

	public static class CmdIfContext extends ParserRuleContext {
		public BlocoContext ifBody;
		public BlocoContext elseBody;
		public TerminalNode SE() { return getToken(IsiLangParser.SE, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ComparaContext compara() {
			return getRuleContext(ComparaContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode ENTAO() { return getToken(IsiLangParser.ENTAO, 0); }
		public List<TerminalNode> AC() { return getTokens(IsiLangParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(IsiLangParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(IsiLangParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(IsiLangParser.FC, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(IsiLangParser.SENAO, 0); }
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(SE);
			setState(87);
			match(AP);
			setState(88);
			compara();
			setState(89);
			match(FP);
			setState(90);
			match(ENTAO);
			setState(91);
			match(AC);
			setState(92);
			((CmdIfContext)_localctx).ifBody = bloco();
			setState(93);
			match(FC);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(94);
				match(SENAO);
				setState(95);
				match(AC);
				setState(96);
				((CmdIfContext)_localctx).elseBody = bloco();
				setState(97);
				match(FC);
				}
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

	public static class CmdEnqContext extends ParserRuleContext {
		public TerminalNode ENQ() { return getToken(IsiLangParser.ENQ, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ComparaContext compara() {
			return getRuleContext(ComparaContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode FACA() { return getToken(IsiLangParser.FACA, 0); }
		public TerminalNode AC() { return getToken(IsiLangParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(IsiLangParser.FC, 0); }
		public CmdEnqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdEnq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdEnq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdEnq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEnqContext cmdEnq() throws RecognitionException {
		CmdEnqContext _localctx = new CmdEnqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdEnq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ENQ);
			setState(102);
			match(AP);
			setState(103);
			compara();
			setState(104);
			match(FP);
			setState(105);
			match(FACA);
			setState(106);
			match(AC);
			setState(107);
			bloco();
			setState(108);
			match(FC);
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

	public static class CmdExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FIM() { return getToken(IsiLangParser.FIM, 0); }
		public CmdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdExprContext cmdExpr() throws RecognitionException {
		CmdExprContext _localctx = new CmdExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(ATTR);
			setState(112);
			expr();
			setState(113);
			match(FIM);
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

	public static class ComparaContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OP_REL() { return getToken(IsiLangParser.OP_REL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCompara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCompara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCompara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparaContext compara() throws RecognitionException {
		ComparaContext _localctx = new ComparaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((ComparaContext)_localctx).left = expr();
			setState(116);
			match(OP_REL);
			setState(117);
			((ComparaContext)_localctx).right = expr();
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

	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<In_termoContext> in_termo() {
			return getRuleContexts(In_termoContext.class);
		}
		public In_termoContext in_termo(int i) {
			return getRuleContext(In_termoContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			termo();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SS) {
				{
				{
				setState(120);
				in_termo();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class In_termoContext extends ParserRuleContext {
		public TerminalNode OP_SS() { return getToken(IsiLangParser.OP_SS, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public In_termoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterIn_termo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitIn_termo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitIn_termo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_termoContext in_termo() throws RecognitionException {
		In_termoContext _localctx = new In_termoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_in_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(OP_SS);
			setState(127);
			termo();
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public List<In_fatorContext> in_fator() {
			return getRuleContexts(In_fatorContext.class);
		}
		public In_fatorContext in_fator(int i) {
			return getRuleContext(In_fatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			fator();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_DM) {
				{
				{
				setState(130);
				in_fator();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class In_fatorContext extends ParserRuleContext {
		public TerminalNode OP_DM() { return getToken(IsiLangParser.OP_DM, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public In_fatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterIn_fator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitIn_fator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitIn_fator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_fatorContext in_fator() throws RecognitionException {
		In_fatorContext _localctx = new In_fatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_in_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OP_DM);
			setState(137);
			fator();
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IsiLangParser.NUM, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fator);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ID);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(AP);
				setState(142);
				expr();
				setState(143);
				match(FP);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\4\6\48\n\4\r\4\16\49\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\7\16|\n\16\f\16\16\16\177\13\16\3\17\3\17"+
		"\3\17\3\20\3\20\7\20\u0086\n\20\f\20\16\20\u0089\13\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0094\n\22\3\22\2\2\23\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"\2\2\2\u0091\2$\3\2\2\2\4+\3\2\2\2\6\67"+
		"\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fJ\3\2\2\2\16L\3\2\2\2\20R\3\2\2\2\22X"+
		"\3\2\2\2\24g\3\2\2\2\26p\3\2\2\2\30u\3\2\2\2\32y\3\2\2\2\34\u0080\3\2"+
		"\2\2\36\u0083\3\2\2\2 \u008a\3\2\2\2\"\u0093\3\2\2\2$&\7\3\2\2%\'\5\4"+
		"\3\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\5\6\4\2)*\7\r\2\2*\3\3\2\2\2+,"+
		"\7\4\2\2,\61\7\31\2\2-.\7\5\2\2.\60\7\31\2\2/-\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\16\2\2\65"+
		"\5\3\2\2\2\668\5\b\5\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:"+
		"\7\3\2\2\2;A\5\n\6\2<A\5\f\7\2=A\5\26\f\2>A\5\22\n\2?A\5\24\13\2@;\3\2"+
		"\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\t\3\2\2\2BC\7\6\2\2CD\7"+
		"\20\2\2DE\7\31\2\2EF\7\21\2\2FG\7\16\2\2G\13\3\2\2\2HK\5\16\b\2IK\5\20"+
		"\t\2JH\3\2\2\2JI\3\2\2\2K\r\3\2\2\2LM\7\7\2\2MN\7\20\2\2NO\7\31\2\2OP"+
		"\7\21\2\2PQ\7\16\2\2Q\17\3\2\2\2RS\7\7\2\2ST\7\20\2\2TU\7\27\2\2UV\7\21"+
		"\2\2VW\7\16\2\2W\21\3\2\2\2XY\7\b\2\2YZ\7\20\2\2Z[\5\30\r\2[\\\7\21\2"+
		"\2\\]\7\t\2\2]^\7\22\2\2^_\5\6\4\2_e\7\23\2\2`a\7\n\2\2ab\7\22\2\2bc\5"+
		"\6\4\2cd\7\23\2\2df\3\2\2\2e`\3\2\2\2ef\3\2\2\2f\23\3\2\2\2gh\7\13\2\2"+
		"hi\7\20\2\2ij\5\30\r\2jk\7\21\2\2kl\7\f\2\2lm\7\22\2\2mn\5\6\4\2no\7\23"+
		"\2\2o\25\3\2\2\2pq\7\31\2\2qr\7\17\2\2rs\5\32\16\2st\7\16\2\2t\27\3\2"+
		"\2\2uv\5\32\16\2vw\7\26\2\2wx\5\32\16\2x\31\3\2\2\2y}\5\36\20\2z|\5\34"+
		"\17\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\33\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0081\7\24\2\2\u0081\u0082\5\36\20\2\u0082\35\3\2\2\2\u0083"+
		"\u0087\5\"\22\2\u0084\u0086\5 \21\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\37\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\25\2\2\u008b\u008c\5\"\22\2\u008c!\3\2\2"+
		"\2\u008d\u0094\7\30\2\2\u008e\u0094\7\31\2\2\u008f\u0090\7\20\2\2\u0090"+
		"\u0091\5\32\16\2\u0091\u0092\7\21\2\2\u0092\u0094\3\2\2\2\u0093\u008d"+
		"\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0094#\3\2\2\2\13&\61"+
		"9@Je}\u0087\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}