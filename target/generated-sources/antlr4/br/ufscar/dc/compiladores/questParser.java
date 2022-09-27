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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PALAVRA_CHAVE=16, 
		IDENT=17, DELIM=18, VIRGULA=19, CADEIA=20, NUM_INT=21, NUM_REAL=22, WS=23, 
		CADEIA_ERR=24, COMENTARIO_ERR=25, ERRO=26;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_perguntas = 2, RULE_declaracoes_perguntas = 3, 
		RULE_tipo = 4, RULE_multiplaescolha = 5, RULE_dissertativa = 6, RULE_titulo = 7, 
		RULE_descricao = 8, RULE_autor = 9, RULE_alternativa = 10, RULE_pergunta = 11, 
		RULE_resposta = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "perguntas", "declaracoes_perguntas", "tipo", 
			"multiplaescolha", "dissertativa", "titulo", "descricao", "autor", "alternativa", 
			"pergunta", "resposta"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio_form'", "'fim_form'", "'inicio_declaracoes'", "'titulo'", 
			"'descricao'", "'autor'", "'fim_declaracoes'", "'inicio_pergunta'", "'fim_pergunta'", 
			"'tipo'", "'dissertativa'", "'multiplaescolha'", "'pergunta'", "'alternativas'", 
			"'resposta'", null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "PALAVRA_CHAVE", "IDENT", "DELIM", "VIRGULA", 
			"CADEIA", "NUM_INT", "NUM_REAL", "WS", "CADEIA_ERR", "COMENTARIO_ERR", 
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
			setState(26);
			declaracoes();
			setState(27);
			match(T__0);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(28);
				perguntas();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(T__1);
			setState(35);
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
			setState(37);
			match(T__2);
			setState(38);
			match(T__3);
			setState(39);
			match(DELIM);
			setState(40);
			titulo();
			setState(41);
			match(T__4);
			setState(42);
			match(DELIM);
			setState(43);
			descricao();
			setState(44);
			match(T__5);
			setState(45);
			match(DELIM);
			setState(46);
			autor();
			setState(47);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof questVisitor ) return ((questVisitor<? extends T>)visitor).visitPerguntas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntasContext perguntas() throws RecognitionException {
		PerguntasContext _localctx = new PerguntasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_perguntas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__7);
			setState(50);
			declaracoes_perguntas();
			setState(51);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(T__9);
				setState(54);
				match(DELIM);
				setState(55);
				tipo();
				setState(56);
				multiplaescolha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__9);
				setState(59);
				match(DELIM);
				setState(60);
				tipo();
				setState(61);
				dissertativa();
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
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
			setState(67);
			match(T__12);
			setState(68);
			match(DELIM);
			setState(69);
			pergunta();
			setState(70);
			match(T__13);
			setState(71);
			match(DELIM);
			setState(72);
			alternativa();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(73);
				match(VIRGULA);
				setState(74);
				alternativa();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__14);
			setState(81);
			match(DELIM);
			setState(82);
			alternativa();
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
			setState(84);
			match(T__12);
			setState(85);
			match(DELIM);
			setState(86);
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
		enterRule(_localctx, 14, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 16, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 18, RULE_autor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 20, RULE_alternativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 22, RULE_pergunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 24, RULE_resposta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		"\u0004\u0001\u001ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0002\u0001\u0000\u000b\f\u0001\u0000\u0014\u0016Z\u0000\u001a\u0001"+
		"\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000"+
		"\u0000\u0006?\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nC\u0001"+
		"\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000"+
		"\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000"+
		"\u0014^\u0001\u0000\u0000\u0000\u0016`\u0001\u0000\u0000\u0000\u0018b"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001f"+
		"\u0005\u0001\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0005"+
		"\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000"+
		"\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005\u0012\u0000\u0000()\u0003\u000e"+
		"\u0007\u0000)*\u0005\u0005\u0000\u0000*+\u0005\u0012\u0000\u0000+,\u0003"+
		"\u0010\b\u0000,-\u0005\u0006\u0000\u0000-.\u0005\u0012\u0000\u0000./\u0003"+
		"\u0012\t\u0000/0\u0005\u0007\u0000\u00000\u0003\u0001\u0000\u0000\u0000"+
		"12\u0005\b\u0000\u000023\u0003\u0006\u0003\u000034\u0005\t\u0000\u0000"+
		"4\u0005\u0001\u0000\u0000\u000056\u0005\n\u0000\u000067\u0005\u0012\u0000"+
		"\u000078\u0003\b\u0004\u000089\u0003\n\u0005\u00009@\u0001\u0000\u0000"+
		"\u0000:;\u0005\n\u0000\u0000;<\u0005\u0012\u0000\u0000<=\u0003\b\u0004"+
		"\u0000=>\u0003\f\u0006\u0000>@\u0001\u0000\u0000\u0000?5\u0001\u0000\u0000"+
		"\u0000?:\u0001\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0007"+
		"\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0005\r\u0000\u0000DE"+
		"\u0005\u0012\u0000\u0000EF\u0003\u0016\u000b\u0000FG\u0005\u000e\u0000"+
		"\u0000GH\u0005\u0012\u0000\u0000HM\u0003\u0014\n\u0000IJ\u0005\u0013\u0000"+
		"\u0000JL\u0003\u0014\n\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u000f\u0000\u0000QR\u0005"+
		"\u0012\u0000\u0000RS\u0003\u0014\n\u0000S\u000b\u0001\u0000\u0000\u0000"+
		"TU\u0005\r\u0000\u0000UV\u0005\u0012\u0000\u0000VW\u0003\u0016\u000b\u0000"+
		"W\r\u0001\u0000\u0000\u0000XY\u0005\u0014\u0000\u0000Y\u000f\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0014\u0000\u0000[\u0011\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0014\u0000\u0000]\u0013\u0001\u0000\u0000\u0000^_\u0007\u0001"+
		"\u0000\u0000_\u0015\u0001\u0000\u0000\u0000`a\u0005\u0014\u0000\u0000"+
		"a\u0017\u0001\u0000\u0000\u0000bc\u0007\u0001\u0000\u0000c\u0019\u0001"+
		"\u0000\u0000\u0000\u0003\u001f?M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}