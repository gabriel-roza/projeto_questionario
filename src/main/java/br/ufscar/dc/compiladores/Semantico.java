package br.ufscar.dc.compiladores;
import java.io.FileOutputStream;

import br.ufscar.dc.compiladores.questParser.AlternativaContext;
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
    public Void visitMultiplaescolha(questParser.MultiplaescolhaContext ctx) {
        numPergunta=numPergunta+1;

        tabela = new TabelaDeSimbolos();

        String perg = ctx.pergunta().getText();

        if(perg.length() > 300){
            String mensagem = String.format("Sua pergunta número " + numPergunta + " ultrapassou a quantidade máxima de 300 caracteres permitida");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }

        boolean alternativavalida = false;

        String alt;
        for(int i=0;i<ctx.alternativa().size();i++){
            alt = ctx.alternativa(i).getText();
            if(!tabela.existe(alt)){
                tabela.adicionar(alt);
            } else {
                String mensagem = String.format("Alternativa %s duplicada na pergunta " + numPergunta +".", alt);
                SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
            }
            if(alt.equals(ctx.alternativacorreta().getText())){
                alternativavalida = true;
            }
        }

        if(alternativavalida==false){
            String mensagem = String.format("Alternativa correta não encontrada na opções da pergunta " + numPergunta +".");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }

        return super.visitMultiplaescolha(ctx);
    }

    @Override
    public Void visitDissertativa(DissertativaContext ctx) {
        numPergunta = numPergunta + 1;

        String perg = ctx.pergunta().getText();

        if(perg.length() > 300){
            String mensagem = String.format("Sua pergunta número " + numPergunta + " ultrapassou a quantidade máxima de 300 caracteres permitida");
            SemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        return super.visitDissertativa(ctx);
    }

    @Override
    public Void visitVerdadeirofalso(VerdadeirofalsoContext ctx) {
        numPergunta = numPergunta + 1;

        return super.visitVerdadeirofalso(ctx);
    }

   @Override
   public Void visitDeclaracoes_perguntas(questParser.Declaracoes_perguntasContext ctx) {
        System.out.println("entrei"); 
        return super.visitDeclaracoes_perguntas(ctx);
   }


}
