
package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.questParser.DeclaracoesContext;
import br.ufscar.dc.compiladores.questParser.DissertativaContext;
import br.ufscar.dc.compiladores.questParser.MultiplaescolhaContext;
import br.ufscar.dc.compiladores.questParser.ProgramaContext;
import br.ufscar.dc.compiladores.questParser.VerdadeirofalsoContext;

public class GeradorHTML extends questBaseVisitor<Void>{
    
    StringBuilder out;
    int numPergunta = 0;

    // Constructor
    public GeradorHTML() {
        this.out = new StringBuilder();
    } 


    @Override
    public Void visitPrograma(ProgramaContext ctx) {
        out.append(
        "<style>@import url('https://fonts.googleapis.com/css2?family=Inter:wght@100;200;300;400;500;600;700&display=swap');\n"
        +"html * {\n"
        +"    font-family: 'Inter', sans-serif !important;\n"
        +"}\n"
        +"h1 {\n"
        +"    margin: 10px;\n"
        +"    text-align: center;\n"
        +"}\n"
        +"button {\n"
        +"    background-color: #45A159;\n"
        +"    border: none;\n"
        +"    border-radius: 8px;\n"
        +"    color: white;\n"
        +"    padding: 16px 32px;\n"
        +"    text-align: center;\n"
        +"    text-decoration: none;\n"
        +"   display: inline-block;\n"
        +"    font-size: 16px;\n"
        +"}\n"
        +"button:hover {\n"
        +"    background-color: #5DAC6E;\n"
        +"    color: white;\n"
        +"}\n"
        +".class_questions {\n"
        +"    margin-left: 60px;\n"
        +"    margin-right: 60px;\n"
        +"}\n"
        +".class_titleQuestion {\n"
        +"    font-size: 20px;\n"
        +"    font-weight: bold;\n"
        +"}\n"
        +"#id_description {\n"
        +"    text-align: center;\n"
        +"    color: #808080;\n"
        +"    margin-bottom: 100px;\n"
        +"}</style>\n\n");

        out.append("<!DOCTYPE html>\n"
                +"    <html>\n"
        +"<head>\n"
        +"<meta charset='utf-8'>\n"
        +"<meta http-equiv='X-UA-Compatible' content='IE=edge'>\n"
        );

        visitDeclaracoes(ctx.declaracoes());

        out.append("<div class='class_questions'>\n"
        +"<form action='/submit.php' method='get' id='form_quiz'>\n\n");

        for(int i=0;i<ctx.perguntas().size();i++)
            visitPerguntas(ctx.perguntas(i));

        out.append("\n</form>\n"
        +"<br><br><br>\n"
        +"<button type='submit' form='form_quiz' value='Submit'>Enviar</button>\n"
        +"</div>\n"
        +"</body>\n"
        +"</html>\n"
        );
        
        return null;
    }

    @Override
    public Void visitDeclaracoes(DeclaracoesContext ctx) {
        String titulo = ctx.titulo().getText();
        String descricao = ctx.descricao().getText();
        String autor = ctx.autor().getText();

        out.append("<title>"+titulo+"</title>\n"
        +"<meta name='viewport' content='width=device-width, initial-scale=1'>\n"
        +"<link rel='stylesheet' type='text/css' media='screen' href='main.css'>\n"
        +"</head>\n"
        +"<body>\n"
        +"<h1>\n"
        +titulo 
        +"</h1>\n"
        +"<h5>\n"
        +"Feito por: "+autor
        +"</h5>"
        +"<p id='id_description'>\n"
        +descricao
        +"</p>\n\n");

        return null;
    }



    @Override
    public Void visitMultiplaescolha(MultiplaescolhaContext ctx) {
        numPergunta = numPergunta + 1;

        String perg = ctx.pergunta().getText();
        out.append("\n<p class='class_titleQuestion'>"+numPergunta+"."+perg+"</p>\n");

        String alt;
        for(int i=0;i<ctx.alternativa().size();i++){
            alt = ctx.alternativa(i).getText();
            out.append("<input type='radio' name='question_"+numPergunta+"' value='option_"+i+"' checked>"+alt+"<br>\n");
        }

        return null;
    }

    @Override
    public Void visitDissertativa(DissertativaContext ctx) {
        numPergunta = numPergunta + 1;

        String perg = ctx.pergunta().getText();

        out.append("\n<p class='class_titleQuestion'>"+numPergunta+"."+perg+"</p>\n"
        +"<p>Digite sua resposta</p>\n"
        +"<input type='text' name='question_"+numPergunta+"' size='60' />\n\n");

        return null;
    }

    @Override
    public Void visitVerdadeirofalso(VerdadeirofalsoContext ctx) {
        numPergunta = numPergunta + 1;
        
        String perg = ctx.pergunta().getText();
        out.append("\n<p class='class_titleQuestion'>"+numPergunta+"."+perg+"</p>\n");
        out.append("<input type='radio' name='question_"+numPergunta+"' value='option_1' checked>Verdadeiro<br>\n");
        out.append("<input type='radio' name='question_"+numPergunta+"' value='option_1' checked>Falso<br>\n\n");

        return null;
    }


}