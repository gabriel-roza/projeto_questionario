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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, PALAVRA_CHAVE=19, IDENT=20, DELIM=21, VIRGULA=22, CADEIA=23, 
		NUM_INT=24, NUM_REAL=25, WS=26, CADEIA_ERR=27, COMENTARIO_ERR=28, ERRO=29;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_perguntas = 2, RULE_declaracoes_perguntas = 3, 
		RULE_tipo = 4, RULE_multiplaescolha = 5, RULE_dissertativa = 6, RULE_verdadeirofalso = 7, 
		RULE_titulo = 8, RULE_descricao = 9, RULE_autor = 10, RULE_alternativa = 11, 
		RULE_alternativacorreta = 12, RULE_pergunta = 13, RULE_resposta = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "perguntas", "declaracoes_perguntas", "tipo", 
			"multiplaescolha", "dissertativa", "verdadeirofalso", "titulo", "descricao", 
			"autor", "alternativa", "alternativacorreta", "pergunta", "resposta"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio_form'", "'fim_form'", "'inicio_declaracoes'", "'titulo'", 
			"'descricao'", "'autor'", "'fim_declaracoes'", "'inicio_pergunta'", "'fim_pergunta'", 
			"'tipo'", "'dissertativa'", "'multiplaescolha'", "'verdadeirofalso'", 
			"'pergunta'", "'alternativas'", "'resposta'", "'verdadeiro'", "'falso'", 
			null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "PALAVRA_CHAVE", "IDENT", "DELIM", 
			"VIRGULA", "CADEIA", "NUM_INT", "NUM_REAL", "WS", "CADEIA_ERR", "COMENTARIO_ERR", 
			"ERRO"
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
		public TerminalNode EOF() { return getToken(questParser.EOF, 0); }
		public List<PerguntasContext> perguntas() {
			return getRuleContexts(PerguntasContext.class);
		}
		public PerguntasContext perguntas(int i) {
			return getRuleContext(PerguntasContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			declaracoes();
			setState(31);
			match(T__0);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(32);
				perguntas();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__1);
			setState(39);
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
		public List<TerminalNode> DELIM() { return getTokens(questParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(questParser.DELIM, i);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public AutorContext autor() {
			return getRuleContext(AutorContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__2);
			setState(42);
			match(T__3);
			setState(43);
			match(DELIM);
			setState(44);
			titulo();
			setState(45);
			match(T__4);
			setState(46);
			match(DELIM);
			setState(47);
			descricao();
			setState(48);
			match(T__5);
			setState(49);
			match(DELIM);
			setState(50);
			autor();
			setState(51);
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

	public static class PerguntasContext extends ParserRuleContext {
		public List<Declaracoes_perguntasContext> declaracoes_perguntas() {
			return getRuleContexts(Declaracoes_perguntasContext.class);
		}
		public Declaracoes_perguntasContext declaracoes_perguntas(int i) {
			return getRuleContext(Declaracoes_perguntasContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitPerguntas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntasContext perguntas() throws RecognitionException {
		PerguntasContext _localctx = new PerguntasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_perguntas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__7);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(54);
				declaracoes_perguntas();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__8);
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
		public TerminalNode DELIM() { return getToken(questParser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public MultiplaescolhaContext multiplaescolha() {
			return getRuleContext(MultiplaescolhaContext.class,0);
		}
		public DissertativaContext dissertativa() {
			return getRuleContext(DissertativaContext.class,0);
		}
		public VerdadeirofalsoContext verdadeirofalso() {
			return getRuleContext(VerdadeirofalsoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitDeclaracoes_perguntas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracoes_perguntasContext declaracoes_perguntas() throws RecognitionException {
		Declaracoes_perguntasContext _localctx = new Declaracoes_perguntasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracoes_perguntas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__9);
			setState(63);
			match(DELIM);
			setState(64);
			tipo();
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(65);
				multiplaescolha();
				}
				break;
			case 2:
				{
				setState(66);
				dissertativa();
				}
				break;
			case 3:
				{
				setState(67);
				verdadeirofalso();
				}
				break;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class MultiplaescolhaContext extends ParserRuleContext {
		public List<TerminalNode> DELIM() { return getTokens(questParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(questParser.DELIM, i);
		}
		public PerguntaContext pergunta() {
			return getRuleContext(PerguntaContext.class,0);
		}
		public List<AlternativaContext> alternativa() {
			return getRuleContexts(AlternativaContext.class);
		}
		public AlternativaContext alternativa(int i) {
			return getRuleContext(AlternativaContext.class,i);
		}
		public AlternativacorretaContext alternativacorreta() {
			return getRuleContext(AlternativacorretaContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(questParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(questParser.VIRGULA, i);
		}
		public MultiplaescolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplaescolha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterMultiplaescolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitMultiplaescolha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitMultiplaescolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplaescolhaContext multiplaescolha() throws RecognitionException {
		MultiplaescolhaContext _localctx = new MultiplaescolhaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multiplaescolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__13);
			setState(73);
			match(DELIM);
			setState(74);
			pergunta();
			setState(75);
			match(T__14);
			setState(76);
			match(DELIM);
			setState(77);
			alternativa();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(78);
				match(VIRGULA);
				setState(79);
				alternativa();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__15);
			setState(86);
			match(DELIM);
			setState(87);
			alternativacorreta();
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

	public static class DissertativaContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(questParser.DELIM, 0); }
		public PerguntaContext pergunta() {
			return getRuleContext(PerguntaContext.class,0);
		}
		public DissertativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dissertativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterDissertativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitDissertativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitDissertativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DissertativaContext dissertativa() throws RecognitionException {
		DissertativaContext _localctx = new DissertativaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dissertativa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__13);
			setState(90);
			match(DELIM);
			setState(91);
			pergunta();
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

	public static class VerdadeirofalsoContext extends ParserRuleContext {
		public List<TerminalNode> DELIM() { return getTokens(questParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(questParser.DELIM, i);
		}
		public PerguntaContext pergunta() {
			return getRuleContext(PerguntaContext.class,0);
		}
		public VerdadeirofalsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verdadeirofalso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterVerdadeirofalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitVerdadeirofalso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitVerdadeirofalso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerdadeirofalsoContext verdadeirofalso() throws RecognitionException {
		VerdadeirofalsoContext _localctx = new VerdadeirofalsoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verdadeirofalso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__13);
			setState(94);
			match(DELIM);
			setState(95);
			pergunta();
			setState(96);
			match(T__15);
			setState(97);
			match(DELIM);
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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

	public static class DescricaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitDescricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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

	public static class AutorContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public AutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterAutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitAutor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitAutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutorContext autor() throws RecognitionException {
		AutorContext _localctx = new AutorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_autor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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

	public static class AlternativaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(questParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(questParser.NUM_REAL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitAlternativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativaContext alternativa() throws RecognitionException {
		AlternativaContext _localctx = new AlternativaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alternativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
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

	public static class AlternativacorretaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(questParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(questParser.NUM_REAL, 0); }
		public AlternativacorretaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativacorreta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterAlternativacorreta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitAlternativacorreta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitAlternativacorreta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativacorretaContext alternativacorreta() throws RecognitionException {
		AlternativacorretaContext _localctx = new AlternativacorretaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_alternativacorreta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
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

	public static class PerguntaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public PerguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pergunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterPergunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitPergunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitPergunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntaContext pergunta() throws RecognitionException {
		PerguntaContext _localctx = new PerguntaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pergunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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

	public static class RespostaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(questParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(questParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(questParser.NUM_REAL, 0); }
		public RespostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resposta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).enterResposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof questListener ) ((questListener)listener).exitResposta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitResposta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RespostaContext resposta() throws RecognitionException {
		RespostaContext _localctx = new RespostaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_resposta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
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
		"\u0004\u0001\u001ds\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u00028\b\u0002"+
		"\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005Q\b\u0005"+
		"\n\u0005\f\u0005T\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u0000\u0003\u0001\u0000\u000b\r\u0001\u0000\u0011\u0012\u0001\u0000"+
		"\u0017\u0019h\u0000\u001e\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000"+
		"\u0000\u00045\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\b"+
		"F\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000"+
		"\u0000\u000e]\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012"+
		"f\u0001\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000\u0016j\u0001"+
		"\u0000\u0000\u0000\u0018l\u0001\u0000\u0000\u0000\u001an\u0001\u0000\u0000"+
		"\u0000\u001cp\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000"+
		"\u001f#\u0005\u0001\u0000\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0002\u0000\u0000\'(\u0005\u0000\u0000\u0001(\u0001\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0003\u0000\u0000*+\u0005\u0004\u0000\u0000+,\u0005"+
		"\u0015\u0000\u0000,-\u0003\u0010\b\u0000-.\u0005\u0005\u0000\u0000./\u0005"+
		"\u0015\u0000\u0000/0\u0003\u0012\t\u000001\u0005\u0006\u0000\u000012\u0005"+
		"\u0015\u0000\u000023\u0003\u0014\n\u000034\u0005\u0007\u0000\u00004\u0003"+
		"\u0001\u0000\u0000\u000059\u0005\b\u0000\u000068\u0003\u0006\u0003\u0000"+
		"76\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<=\u0005\t\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005"+
		"\n\u0000\u0000?@\u0005\u0015\u0000\u0000@D\u0003\b\u0004\u0000AE\u0003"+
		"\n\u0005\u0000BE\u0003\f\u0006\u0000CE\u0003\u000e\u0007\u0000DA\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"E\u0007\u0001\u0000\u0000\u0000FG\u0007\u0000\u0000\u0000G\t\u0001\u0000"+
		"\u0000\u0000HI\u0005\u000e\u0000\u0000IJ\u0005\u0015\u0000\u0000JK\u0003"+
		"\u001a\r\u0000KL\u0005\u000f\u0000\u0000LM\u0005\u0015\u0000\u0000MR\u0003"+
		"\u0016\u000b\u0000NO\u0005\u0016\u0000\u0000OQ\u0003\u0016\u000b\u0000"+
		"PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UV\u0005\u0010\u0000\u0000VW\u0005\u0015\u0000\u0000WX\u0003"+
		"\u0018\f\u0000X\u000b\u0001\u0000\u0000\u0000YZ\u0005\u000e\u0000\u0000"+
		"Z[\u0005\u0015\u0000\u0000[\\\u0003\u001a\r\u0000\\\r\u0001\u0000\u0000"+
		"\u0000]^\u0005\u000e\u0000\u0000^_\u0005\u0015\u0000\u0000_`\u0003\u001a"+
		"\r\u0000`a\u0005\u0010\u0000\u0000ab\u0005\u0015\u0000\u0000bc\u0007\u0001"+
		"\u0000\u0000c\u000f\u0001\u0000\u0000\u0000de\u0005\u0017\u0000\u0000"+
		"e\u0011\u0001\u0000\u0000\u0000fg\u0005\u0017\u0000\u0000g\u0013\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0017\u0000\u0000i\u0015\u0001\u0000\u0000"+
		"\u0000jk\u0007\u0002\u0000\u0000k\u0017\u0001\u0000\u0000\u0000lm\u0007"+
		"\u0002\u0000\u0000m\u0019\u0001\u0000\u0000\u0000no\u0005\u0017\u0000"+
		"\u0000o\u001b\u0001\u0000\u0000\u0000pq\u0007\u0002\u0000\u0000q\u001d"+
		"\u0001\u0000\u0000\u0000\u0004#9DR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}