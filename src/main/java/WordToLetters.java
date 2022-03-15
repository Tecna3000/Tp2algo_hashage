package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.sort;

public class WordToLetters {

    private static char[] arrayOfLetters;
    private final String word;

    public String getWord() {
        return word;
    }

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


    static String firstword;

    public static boolean existWord(HashTable hashTable, String mixedWord) {
        ArrayList<Character> complementary = new ArrayList<>();
        for (LinkedList<WordToLetters> list : hashTable.getHashTable()) {
            for (WordToLetters word : list) {
                System.out.println(word.getWord());
                if (contains(mixedWord, word.getWord())) {
                    firstword = word.toString();

                }
            }
        }
        return false;
    }


//    public boolean existComplementary(){
//
//    }
//
//    public ArrayList<Character> getComplementary(){
//
//    }

    //vérifie si la word1 contient word2 marche que sur une sous chaine
//    public static boolean contains(String word1, String word2) {
//        int count = 0;
//        for (int index = 0; index < word2.length(); index++) {
//            if (count < word2.length()) {
//                if (word1.charAt(index) == word2.charAt(count)) {
//                    count++;
//                }
//            } else {
//                break;
//            }
//
//        }
//        return (count == word2.length());
//    }

    public static boolean contains(String word1, String word2) {
        int count=0;
        for (int i = 0; i < word1.length(); i++) {
            char chr = word1.charAt(i);
            for (int j = 0; j < word2.length(); j++) {
                if (word2.charAt(j) == chr) {
                    count++;
                }
            }
        }
        return (count== word2.length());
    }
}