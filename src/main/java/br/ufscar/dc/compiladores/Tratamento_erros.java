package br.ufscar.dc.compiladores;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.exit;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class Tratamento_erros implements ANTLRErrorListener {

    PrintWriter outputFile;

    public Tratamento_erros(PrintWriter pw) throws IOException {
        this.outputFile = pw;
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Token t = (Token) offendingSymbol;

        if(t.getType() == 27)
        {
            outputFile.append("Linha " + t.getLine() + ": ");
            outputFile.append("cadeia literal nao fechada\n");
            outputFile.append("Fim da compilacao\n");
            outputFile.close();
            exit(0);
        }

        else if(t.getType() == 28)
        {
            outputFile.append("Linha " + t.getLine() + ": ");
            outputFile.append("comentario nao fechado\n");
            outputFile.append("Fim da compilacao\n");
            outputFile.close();
            exit(0);
        }

        else if(t.getType() == 29)
        {
            outputFile.append("Linha " + t.getLine() + ": ");
            outputFile.append(t.getText() + " - simbolo nao identificado\n");
            outputFile.append("Fim da compilacao\n");
            outputFile.close();
            exit(0);
        }    

        else if (t.getType() != Token.EOF) {
            outputFile.append("Linha " + t.getLine() + ": ");
            outputFile.append("Erro sintático próximo à " + t.getText()  +"\n");
            outputFile.append("Fim da compilacao\n");
            outputFile.close();
            exit(0);
        } 
        
        outputFile.println("Fim da compilacao");

    }
}
