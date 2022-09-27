package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.questParser.DeclaracoesContext;
import br.ufscar.dc.compiladores.questParser.Declaracoes_perguntasContext;
import br.ufscar.dc.compiladores.questParser.MultiplaescolhaContext;
import br.ufscar.dc.compiladores.questParser.ProgramaContext;

public class Semantico extends questBaseVisitor<Double>{

    @Override
    public Double visitPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub
        return super.visitPrograma(ctx);
    }

   @Override
   public Double visitDeclaracoes(DeclaracoesContext ctx) {
        if(ctx.titulo()==null){
            String mensagem=" É obrigatório informar um autor.";
        }
        else{  

        }
        if(ctx.descricao()==null){
            String mensagem=" É obrigatório informar um autor.";
        }
        else{

        }
        if(ctx.autor()==null){
            String mensagem=" É obrigatório informar um autor.";
            
        }
        else{

        }
       // TODO Auto-generated method stub
       return super.visitDeclaracoes(ctx);
   }

   @Override
   public Double visitDeclaracoes_perguntas(Declaracoes_perguntasContext ctx) {
        if(!(ctx.tipo().equals("dissertativa")) | !(ctx.tipo().equals("multiplaescolha"))){
            String mensagem = "Tipo de pergunta inválido.";
        }

       return super.visitDeclaracoes_perguntas(ctx);
   }

   @Override
   public Double visitMultiplaescolha(MultiplaescolhaContext ctx) {
       // TODO Auto-generated method stub
       return super.visitMultiplaescolha(ctx);
   }

}
