package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.questParser.DeclaracoesContext;
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

}