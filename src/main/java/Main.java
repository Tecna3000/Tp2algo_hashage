package main.java;

import java.io.File;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/minidico.txt");
//        ReadDict.readFile(file);
        //System.out.println(WordToLetters.toString(new WordToLetters("abyjv")) );
        ReadDict.stockWords(file);



    }
}