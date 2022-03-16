package main.java;

import java.util.*;

import static java.util.Arrays.sort;

public class WordToLetters {

    private char[] arrayOfLetters;
    private final String word;

    public String getWord() {
        return word;
    }

    public WordToLetters(String word) {
        this.word = word;
        this.arrayOfLetters = word.toCharArray();
        sort(arrayOfLetters);

    }

    public char[] getArrayOfLetters(){
        return this.arrayOfLetters;
    }

    public List elementsOf(WordToLetters word) {
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



//    public boolean existComplementary(){
//
//    }
//
//    public ArrayList<Character> getComplementary(){
//
//    }

    //vérifie si la word1 contient word2 marche que sur une sous chaine

    public boolean contains(char[] givenWord) {
        int count = 0;
        for (char letter: givenWord) {
            if (letter == arrayOfLetters[count]) {
                count++;
                if(count == arrayOfLetters.length){
                    return true;
                }
            }
            if (letter > arrayOfLetters[count]){
                return false;
            }
        }
        return false;
    }

}