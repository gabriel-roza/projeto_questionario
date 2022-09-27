package br.ufscar.dc.compiladores;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class SemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();
    
    //Funcao responsavel por adicionar os erros semanticos em uma lista
    public static void adicionarErroSemantico(Token t, String mensagem)
    {
        int linha = t.getLine();
        System.out.println("Linha "+linha+": %s" +mensagem); 
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
}