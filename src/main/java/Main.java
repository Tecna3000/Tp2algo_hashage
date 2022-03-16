package main.java;

import java.io.File;


public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/minidico.txt");
        HashTable dict = new HashTable(file,3);

       //System.out.println(dict);
        //pour tester contains
//        String mot1 = "abcdef";
//        String mot2 = "cc";
//
//        WordToLetters m1 = new WordToLetters(mot1);
//        WordToLetters m2 = new WordToLetters(mot2);
//        System.out.println(m2.getArrayOfLetters());
//        System.out.println(m2.contains(m1.getArrayOfLetters()));

      System.out.println(dict.existWord("AbymesAbyssinia"));


    }
}