package br.ufscar.dc.compiladores;
import br.ufscar.dc.compiladores.questParser.ProgramaContext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new File(args[1]));

        /* Erro sintatico */
        CharStream cs = CharStreams.fromFileName(args[0]);
        questLexer lexer = new questLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        questParser parser = new questParser(tokens);

        // Remove a mensagem de erro padrão
        parser.removeErrorListeners();

        // Registra o error personalizado da analise  sintatica
        Tratamento_erros pegaErro = new Tratamento_erros(pw);
        parser.addErrorListener(pegaErro);

        /* Erro semantico */
        ProgramaContext arvore = parser.programa();
        Semantico as = new Semantico();
        as.visitPrograma(arvore);

        //Se encontrar erros semanticos
        if(SemanticoUtils.errosSemanticos.isEmpty()==false){
            //Escrevendo os erros gravados no LASemanticoUtils para um arquivo
            List<String> errosSemanticos = SemanticoUtils.errosSemanticos;
            for (var erroSemantico : errosSemanticos) {
                pw.append(erroSemantico + "\n");
            }   

            pw.append("Fim da compilacao\n");  
            pw.close();             
        }//Se não encontrar erros semanticos gera o HTML
        else{
            GeradorHTML lac = new GeradorHTML();
            lac.visitPrograma(arvore);
            try (PrintWriter pwc = new PrintWriter(args[1])) {
                pwc.println(lac.out.toString());
            }    
        }
        parser.programa();
    }
}