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
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Dojo_AnalisadorLexico {

      public static void main(String[] args) throws FileNotFoundException {
        
    String conteudo = readFile();
    
     try {
            conteudo = conteudo.replaceAll("(?s:/\\*.*?\\*/)|//.*", "") ;
            FileWriter fw = new FileWriter("Formatado.txt");
            fw.write(conteudo);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    System.out.println(conteudo);
    }
    


private static String readFile() throws FileNotFoundException{

String conteudo = null;

File texto = new File ("CodigoFonte_JS.txt");
Scanner myReader = new Scanner(texto);
        

        while (myReader.hasNext()){
            conteudo += myReader.nextLine();
        }
        return conteudo;
}

    
}
