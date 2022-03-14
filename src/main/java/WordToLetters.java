package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
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

    public static List elementsOf(WordToLetters word) {
        List<Character> elements = new ArrayList<Character>();
        for (char element : arrayOfLetters) {
            elements.add(element);
        }
        return elements;
    }

    // tout marche à ne pas changer
    public String toString() {
        arrayOfLetters = word.toCharArray();
        sort(arrayOfLetters);
        String letters = "[";
        for (char arrayOfLetter : arrayOfLetters) {
            letters = letters + arrayOfLetter + (",");
        }
        letters = letters + ("]: ") + word;
        return letters;
    }

   //vérifi si la word1 contient word2
    public static boolean contains(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word2.length(); i++) {
            if (word1.charAt(i) == word2.charAt(count)) {
                count++;
            }
        }
        return (count == word2.length());
    }
}