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
	 * Enter a parse tree produced by {@link questParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(questParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(questParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(questParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(questParser.TipoContext ctx);
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
	 * Enter a parse tree produced by {@link questParser#decl_perguntas}.
	 * @param ctx the parse tree
	 */
	void enterDecl_perguntas(questParser.Decl_perguntasContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#decl_perguntas}.
	 * @param ctx the parse tree
	 */
	void exitDecl_perguntas(questParser.Decl_perguntasContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#tipo_perguntas}.
	 * @param ctx the parse tree
	 */
	void enterTipo_perguntas(questParser.Tipo_perguntasContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#tipo_perguntas}.
	 * @param ctx the parse tree
	 */
	void exitTipo_perguntas(questParser.Tipo_perguntasContext ctx);
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
	 * Enter a parse tree produced by {@link questParser#alternativas}.
	 * @param ctx the parse tree
	 */
	void enterAlternativas(questParser.AlternativasContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#alternativas}.
	 * @param ctx the parse tree
	 */
	void exitAlternativas(questParser.AlternativasContext ctx);
	/**
	 * Enter a parse tree produced by {@link questParser#declaracoes_alternativas}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_alternativas(questParser.Declaracoes_alternativasContext ctx);
	/**
	 * Exit a parse tree produced by {@link questParser#declaracoes_alternativas}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_alternativas(questParser.Declaracoes_alternativasContext ctx);
}