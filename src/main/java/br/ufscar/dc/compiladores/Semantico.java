package br.ufscar.dc.compiladores;
import br.ufscar.dc.compiladores.questParser.DeclaracoesContext;
import br.ufscar.dc.compiladores.questParser.DissertativaContext;
import br.ufscar.dc.compiladores.questParser.VerdadeirofalsoContext;

public class Semantico extends questBaseVisitor<Void>{

    public TabelaDeSimbolos tabela;
    int numPergunta = 0;

    @Override
    public Void visitPrograma(questParser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracoes(DeclaracoesContext ctx) {
        String titulo = ctx.titulo().getText();
        String descricao = ctx.descricao().getText();
        String autor = ctx.autor().getText();

        if(titulo.length()<=2){
            String mensagem = String.format("O Título do formúlario não pode ser vazio.\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        if(autor.length()<=2){
            String mensagem = String.format("O autor do formúlario não pode ser vazio.\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        if(descricao.length()>=350){
            String mensagem = String.format("A quantidade máxima de caracteres para a descrição é 350.\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }

        return super.visitDeclaracoes(ctx);
    }

    @Override
    public Void visitMultiplaescolha(questParser.MultiplaescolhaContext ctx) {
        numPergunta=numPergunta+1;

        tabela = new TabelaDeSimbolos();

        String perg = ctx.pergunta().getText();

        if(perg.length() > 300){
            String mensagem = String.format("Sua pergunta número " + numPergunta + " ultrapassou a quantidade máxima de 300 caracteres permitida.\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }

        if(ctx.alternativa().size()>5){
            String mensagem = String.format("A quantidade máxima de alternativas em questões múltiplas escolhas é de 5. Revise sua pergunta número " + numPergunta +".\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }

        boolean alternativavalida = false;

        String alt;
        for(int i=0;i<ctx.alternativa().size();i++){
            alt = ctx.alternativa(i).getText();
            if(!tabela.existe(alt)){
                tabela.adicionar(alt);
            } else {
                String mensagem = String.format("Alternativa %s duplicada na pergunta " + numPergunta +".\n");
                SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
            }
            if(alt.equals(ctx.alternativacorreta().getText())){
                alternativavalida = true;
            }
        }

        if(alternativavalida==false){
            String mensagem = String.format("Alternativa correta não encontrada na opções da pergunta " + numPergunta +".\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }

        return super.visitMultiplaescolha(ctx);
    }

    @Override
    public Void visitDissertativa(DissertativaContext ctx) {
        numPergunta = numPergunta + 1;

        String perg = ctx.pergunta().getText();

        if(perg.length() > 300){
            String mensagem = String.format("Sua pergunta número " + numPergunta + " ultrapassou a quantidade máxima de 300 caracteres permitida.\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        return super.visitDissertativa(ctx);
    }

    @Override
    public Void visitVerdadeirofalso(VerdadeirofalsoContext ctx) {
        numPergunta = numPergunta + 1;

        String perg = ctx.pergunta().getText();

        if(perg.length() > 300){
            String mensagem = String.format("Sua pergunta número " + numPergunta + " ultrapassou a quantidade máxima de 300 caracteres permitida.\n");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }

        return super.visitVerdadeirofalso(ctx);
    }

}
