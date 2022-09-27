// Generated from br/ufscar/dc/compiladores/quest.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link questParser}.
 */
public interface questListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link questParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(questParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(questParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(questParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(questParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#perguntas}.
	 * @param ctx the parse tree
	 */
	void enterPerguntas(questParser.PerguntasContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#perguntas}.
	 * @param ctx the parse tree
	 */
	void exitPerguntas(questParser.PerguntasContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#declaracoes_perguntas}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_perguntas(questParser.Declaracoes_perguntasContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#declaracoes_perguntas}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_perguntas(questParser.Declaracoes_perguntasContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#multiplaescolha}.
	 * @param ctx the parse tree
	 */
	void enterMultiplaescolha(questParser.MultiplaescolhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#multiplaescolha}.
	 * @param ctx the parse tree
	 */
	void exitMultiplaescolha(questParser.MultiplaescolhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#dissertativa}.
	 * @param ctx the parse tree
	 */
	void enterDissertativa(questParser.DissertativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#dissertativa}.
	 * @param ctx the parse tree
	 */
	void exitDissertativa(questParser.DissertativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(questParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(questParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(questParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(questParser.DescricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#autor}.
	 * @param ctx the parse tree
	 */
	void enterAutor(questParser.AutorContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#autor}.
	 * @param ctx the parse tree
	 */
	void exitAutor(questParser.AutorContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#alternativa}.
	 * @param ctx the parse tree
	 */
	void enterAlternativa(questParser.AlternativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#alternativa}.
	 * @param ctx the parse tree
	 */
	void exitAlternativa(questParser.AlternativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#pergunta}.
	 * @param ctx the parse tree
	 */
	void enterPergunta(questParser.PerguntaContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#pergunta}.
	 * @param ctx the parse tree
	 */
	void exitPergunta(questParser.PerguntaContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#resposta}.
	 * @param ctx the parse tree
	 */
	void enterResposta(questParser.RespostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#resposta}.
	 * @param ctx the parse tree
	 */
	void exitResposta(questParser.RespostaContext ctx);
}