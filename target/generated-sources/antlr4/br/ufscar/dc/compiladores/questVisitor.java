// Generated from br/ufscar/dc/compiladores/quest.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link questParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface questVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link questParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(questParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(questParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#perguntas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerguntas(questParser.PerguntasContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#declaracoes_perguntas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes_perguntas(questParser.Declaracoes_perguntasContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#multiplaescolha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplaescolha(questParser.MultiplaescolhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#dissertativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDissertativa(questParser.DissertativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(questParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(questParser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#autor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutor(questParser.AutorContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#alternativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativa(questParser.AlternativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#pergunta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPergunta(questParser.PerguntaContext ctx);
	/**
	 * Visit a parse tree produced by {@link questParser#resposta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResposta(questParser.RespostaContext ctx);
}