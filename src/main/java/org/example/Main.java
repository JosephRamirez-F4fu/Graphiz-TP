package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "scratch.txt";

        CharStream input = fromFileName(inputFile);

        GraphvizExprLexer lexer = new GraphvizExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GraphvizExprParser parser = new GraphvizExprParser(tokens);
        ParseTree tree = parser.program();
        TableSymbols eval = new TableSymbols();
        eval.visit(tree);
        System.out.println("Table of Symbols");
        //eval.printMemory();
        System.out.println("Printing List Adjacency");
        eval.PrintLA();
    }
}
