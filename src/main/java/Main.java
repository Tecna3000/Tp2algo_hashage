package main.java;

import java.io.File;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/minidico.txt");
        HashTable dict = new HashTable(file,3);

       //System.out.println(dict);

        MultiSet given = new MultiSet("abcdef");
        MultiSet th = new MultiSet("abc");
      System.out.println("complementary is : "+ Arrays.toString(given.complementary(th)));
    }
}