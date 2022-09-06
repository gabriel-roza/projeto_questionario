// Generated from br/ufscar/dc/compiladores/quest.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class questParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PALAVRA_CHAVE=12, IDENT=13, CADEIA=14, NUM_INT=15, 
		NUM_REAL=16, DELIM=17, VIRGULA=18, CADEIA_ERR=19, ERRO=20;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl = 2, RULE_tipo = 3, 
		RULE_perguntas = 4, RULE_declaracoes_perguntas = 5, RULE_decl_perguntas = 6, 
		RULE_tipo_perguntas = 7, RULE_alternativa = 8, RULE_alternativas = 9, 
		RULE_declaracoes_alternativas = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl", "tipo", "perguntas", "declaracoes_perguntas", 
			"decl_perguntas", "tipo_perguntas", "alternativa", "alternativas", "declaracoes_alternativas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio_form'", "'fim_form'", "'titulo'", "'descricao'", "'autor'", 
			"'inicio_pergunta'", "'fim_pergunta'", "'pergunta'", "'resposta'", "'\\n'", 
			"'alternativas'", null, null, null, null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PALAVRA_CHAVE", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "DELIM", "VIRGULA", 
			"CADEIA_ERR", "ERRO"
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
	public String getGrammarFileName() { return "quest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public questParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public PerguntasContext perguntas() {
			return getRuleContext(PerguntasContext.class,0);
		}
		public TerminalNode EOF() { return getToken(questParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			declaracoes();
			setState(23);
			match(T__0);
			setState(24);
			perguntas();
			setState(25);
			match(T__1);
			setState(26);
			match(EOF);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(28);
				decl();
				}
				}
				setState(33);
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

	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(questParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			tipo();
			setState(35);
			match(DELIM);
			setState(36);
			match(CADEIA);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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

	public static class PerguntasContext extends ParserRuleContext {
		public Declaracoes_perguntasContext declaracoes_perguntas() {
			return getRuleContext(Declaracoes_perguntasContext.class,0);
		}
		public PerguntasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perguntas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterPerguntas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitPerguntas(this);
		}
	}

	public final PerguntasContext perguntas() throws RecognitionException {
		PerguntasContext _localctx = new PerguntasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_perguntas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__5);
			setState(41);
			declaracoes_perguntas();
			setState(42);
			match(T__6);
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

	public static class Declaracoes_perguntasContext extends ParserRuleContext {
		public List<Decl_perguntasContext> decl_perguntas() {
			return getRuleContexts(Decl_perguntasContext.class);
		}
		public Decl_perguntasContext decl_perguntas(int i) {
			return getRuleContext(Decl_perguntasContext.class,i);
		}
		public Declaracoes_perguntasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_perguntas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterDeclaracoes_perguntas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitDeclaracoes_perguntas(this);
		}
	}

	public final Declaracoes_perguntasContext declaracoes_perguntas() throws RecognitionException {
		Declaracoes_perguntasContext _localctx = new Declaracoes_perguntasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracoes_perguntas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__10))) != 0)) {
				{
				{
				setState(44);
				decl_perguntas();
				}
				}
				setState(49);
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

	public static class Decl_perguntasContext extends ParserRuleContext {
		public Tipo_perguntasContext tipo_perguntas() {
			return getRuleContext(Tipo_perguntasContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(questParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public Decl_perguntasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_perguntas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterDecl_perguntas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitDecl_perguntas(this);
		}
	}

	public final Decl_perguntasContext decl_perguntas() throws RecognitionException {
		Decl_perguntasContext _localctx = new Decl_perguntasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_perguntas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			tipo_perguntas();
			setState(51);
			match(DELIM);
			setState(52);
			match(CADEIA);
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

	public static class Tipo_perguntasContext extends ParserRuleContext {
		public Declaracoes_alternativasContext declaracoes_alternativas() {
			return getRuleContext(Declaracoes_alternativasContext.class,0);
		}
		public Tipo_perguntasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_perguntas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterTipo_perguntas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitTipo_perguntas(this);
		}
	}

	public final Tipo_perguntasContext tipo_perguntas() throws RecognitionException {
		Tipo_perguntasContext _localctx = new Tipo_perguntasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_perguntas);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__7);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				declaracoes_alternativas();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__8);
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

	public static class AlternativaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public AlternativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterAlternativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitAlternativa(this);
		}
	}

	public final AlternativaContext alternativa() throws RecognitionException {
		AlternativaContext _localctx = new AlternativaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alternativa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(CADEIA);
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

	public static class AlternativasContext extends ParserRuleContext {
		public List<AlternativaContext> alternativa() {
			return getRuleContexts(AlternativaContext.class);
		}
		public AlternativaContext alternativa(int i) {
			return getRuleContext(AlternativaContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(questParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(questParser.VIRGULA, i);
		}
		public AlternativasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterAlternativas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitAlternativas(this);
		}
	}

	public final AlternativasContext alternativas() throws RecognitionException {
		AlternativasContext _localctx = new AlternativasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alternativas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			alternativa();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(62);
				match(VIRGULA);
				setState(63);
				alternativa();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__9);
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

	public static class Declaracoes_alternativasContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(questParser.DELIM, 0); }
		public AlternativasContext alternativas() {
			return getRuleContext(AlternativasContext.class,0);
		}
		public Declaracoes_alternativasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_alternativas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterDeclaracoes_alternativas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitDeclaracoes_alternativas(this);
		}
	}

	public final Declaracoes_alternativasContext declaracoes_alternativas() throws RecognitionException {
		Declaracoes_alternativasContext _localctx = new Declaracoes_alternativasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracoes_alternativas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__10);
			setState(72);
			match(DELIM);
			setState(73);
			alternativas();
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
		"\u0004\u0001\u0014L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001e"+
		"\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0005\u0005.\b\u0005\n\u0005\f\u00051\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007:\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\tA\b\t\n\t\f\tD\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0001\u0001\u0000\u0003\u0005E\u0000\u0016\u0001\u0000"+
		"\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000"+
		"\u0000\u0006&\u0001\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n/\u0001"+
		"\u0000\u0000\u0000\f2\u0001\u0000\u0000\u0000\u000e9\u0001\u0000\u0000"+
		"\u0000\u0010;\u0001\u0000\u0000\u0000\u0012=\u0001\u0000\u0000\u0000\u0014"+
		"G\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018"+
		"\u0005\u0001\u0000\u0000\u0018\u0019\u0003\b\u0004\u0000\u0019\u001a\u0005"+
		"\u0002\u0000\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0005\u0011"+
		"\u0000\u0000$%\u0005\u000e\u0000\u0000%\u0005\u0001\u0000\u0000\u0000"+
		"&\'\u0007\u0000\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0005\u0006"+
		"\u0000\u0000)*\u0003\n\u0005\u0000*+\u0005\u0007\u0000\u0000+\t\u0001"+
		"\u0000\u0000\u0000,.\u0003\f\u0006\u0000-,\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\u000b\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0003\u000e"+
		"\u0007\u000034\u0005\u0011\u0000\u000045\u0005\u000e\u0000\u00005\r\u0001"+
		"\u0000\u0000\u00006:\u0005\b\u0000\u00007:\u0003\u0014\n\u00008:\u0005"+
		"\t\u0000\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001"+
		"\u0000\u0000\u0000:\u000f\u0001\u0000\u0000\u0000;<\u0005\u000e\u0000"+
		"\u0000<\u0011\u0001\u0000\u0000\u0000=B\u0003\u0010\b\u0000>?\u0005\u0012"+
		"\u0000\u0000?A\u0003\u0010\b\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\n\u0000\u0000F\u0013"+
		"\u0001\u0000\u0000\u0000GH\u0005\u000b\u0000\u0000HI\u0005\u0011\u0000"+
		"\u0000IJ\u0003\u0012\t\u0000J\u0015\u0001\u0000\u0000\u0000\u0004\u001f"+
		"/9B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}