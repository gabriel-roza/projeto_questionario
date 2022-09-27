package br.ufscar.dc.compiladores;

import static java.lang.System.exit;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {

    public static void main(String[] args) throws IOException {

        CharStream cs = CharStreams.fromFileName(args[0]);
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(args[1]));
        questLexer lex = new questLexer(cs);

        String resultado = "";

        Token t = null;
        while ((t = lex.nextToken()).getType() != Token.EOF) {
            if(t.getType() == 27)
            {
                resultado += "Linha " + t.getLine() +": " + t.getText() + " - simbolo nao identificado";
                resultado += System.lineSeparator();
                break;
            }
            else if(t.getType() == 26)
            {
                resultado += "Linha " + t.getLine() +": " + "comentario nao fechado";
                resultado += System.lineSeparator();
                break;
            }
            else if(t.getType() == 25)
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

        lex.reset();
        PrintWriter pw = new PrintWriter(new File(args[1]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        questParser parser = new questParser(tokens);
        Tratamento_erros pegaErro = new Tratamento_erros(pw);
        parser.removeErrorListeners();
        parser.addErrorListener(pegaErro);
        parser.programa();
    }
}