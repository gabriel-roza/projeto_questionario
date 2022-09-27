
package br.ufscar.dc.compiladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import br.ufscar.dc.compiladores.questParser.ProgramaContext;

public class GeradorHTML extends questBaseVisitor<Void>{
    
    StringBuilder out;

    // Constructor
    public GeradorHTML() {
        this.out = new StringBuilder();
    } 


    @Override
    public Void visitPrograma(ProgramaContext ctx) {
        out.append("<!DOCTYPE html>"
                +"    <html>"
        +"<head>"
        +"<meta charset='utf-8'>"
        +"<meta http-equiv='X-UA-Compatible' content='IE=edge'>"
        );

        return super.visitPrograma(ctx);
    }

    
}