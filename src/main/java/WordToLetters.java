package main.java;

import static java.util.Arrays.sort;

public class WordToLetters {

    private static char[] arrayOfLetters;
    private final String word;

    public WordToLetters(String word) {
        this.word = word;
        arrayOfLetters = word.toCharArray();
        sort(arrayOfLetters);

    }
    // tout marche à ne pas changer
    public String toString(){
        String letters = "[";
        for (char arrayOfLetter : arrayOfLetters) {
            letters = letters + arrayOfLetter + (",");
            //System.out.println(arrayOfLetters[i]);
        }
        letters= letters + ("]: ")+word  ;
        return letters;

    }
}