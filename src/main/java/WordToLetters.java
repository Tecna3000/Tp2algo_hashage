package main.java;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class WordToLetters {

    private static char[] arrayOfLetters;
    private final String word;

    public WordToLetters(String word) {
        this.word = word;
        arrayOfLetters = word.toCharArray();
        sort(arrayOfLetters);

    }

    public static List elementsOf(WordToLetters word){
        List<Character> elements = new ArrayList<Character>();
        for (char element : arrayOfLetters){
            elements.add(element);
        }
        return elements;
    }
    // tout marche à ne pas changer
    public String toString(){
        String letters = "[";
        for(int index =0; index< word.length(); index++){
            letters = letters + word.charAt(index) + (",");
        }
        letters= letters + ("]: ")+word  ;
        return letters;

    }
}