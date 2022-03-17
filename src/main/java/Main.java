package main.java;

import java.io.File;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws Exception {
        File file1 = new File("src/main/resources/minidico.txt");
        HashTable minidico = new HashTable(file1,3);

        File file2 = new File("src/main/resources/dico.txt");
        HashTable dico = new HashTable(file2,100);

        MultiSet mixesWord = new MultiSet("abaeltaccatagmie");
        System.out.println(Arrays.toString(dico.findTwoWords( mixesWord)));

    }
}