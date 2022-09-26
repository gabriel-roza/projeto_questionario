package br.ufscar.dc.compiladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class App {

    public static void main(String[] args) {
        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            questLexer lex = new questLexer(cs);

            String resultado = "";

            FileWriter fileWriter = new FileWriter(args[1]);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                if(t.getType() == 22)
                {
                    resultado += "Linha " + t.getLine() +": " + t.getText() + " - simbolo nao identificado";
                    resultado += System.lineSeparator();
                    break;
                }
                else if(t.getType() == 21)
                {
                    resultado += "Linha " + t.getLine() +": " + "comentario nao fechado";
                    resultado += System.lineSeparator();
                    break;
                }
                else if(t.getType() == 20)
                {
                    resultado += "Linha " + t.getLine() +": " + "cadeia literal nao fechada";
                    resultado += System.lineSeparator();
                    break;
                }
                else
                {
                    resultado += "<" + "'" + t.getText() + "'" + "," +
                    (t.getType() == 1 || t.getType() == 8 || t.getType() == 9 ? ("'" + t.getText() + "'") : questLexer.VOCABULARY.getDisplayName(t.getType())) + ">";
                    resultado += System.lineSeparator();
                }
            }

            printWriter.print(resultado);
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("erro");
        }
    }
}