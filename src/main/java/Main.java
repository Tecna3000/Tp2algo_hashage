package main.java;

import java.io.File;


public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/minidico.txt");
        HashTable dict = new HashTable(file,5);

        //System.out.println(dict);

    }
}