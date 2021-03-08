/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo_analisadorlexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Dojo_AnalisadorLexico {

      public static void main(String[] args) throws FileNotFoundException, IOException {
        
    String conteudo = readFile();
    ArrayList<String> palavras = readFileWords();
    conteudo = conteudo.replaceAll("([ \t]*\\/\\/.*)", "");
    conteudo = conteudo.replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", "");
    String lines[] = conteudo.split("\\r?\\n");
    System.out.println(conteudo);

            FileWriter fw = new FileWriter("Formatado.txt");
            fw.write(conteudo);
            fw.close();
}
private static String readFile() throws FileNotFoundException{

String conteudo = null;
String linha;
File texto = new File ("CodigoFonte_JS.txt");
Scanner myReader = new Scanner(texto);
        while (myReader.hasNext()){
            linha = myReader.nextLine();
            
            if (!linha.contains("//")) {
                conteudo += linha;
            }
        }
        return conteudo;
}

private static ArrayList<String> readFileWords() throws FileNotFoundException{

String conteudo = null;
String linha;
ArrayList<String> palavras = new ArrayList<String> ();
File texto = new File ("Words.txt");
Scanner myReader = new Scanner(texto);
        while (myReader.hasNext()){
            linha = myReader.nextLine();
            
            if (!linha.contains("//")) {
                palavras.add(linha);
            }
        }
        return palavras;
}

private static void Analisa(String conteudo,ArrayList<String> palavras ) throws FileNotFoundException{

String linha;
File texto = new File ("CodigoFonte_JS.txt");
Scanner myReader = new Scanner(texto);
        while (myReader.hasNext()){
            linha = myReader.nextLine();
            
            if (!linha.contains("//")) {
                conteudo += linha;
            }
        }
}

    }
        
