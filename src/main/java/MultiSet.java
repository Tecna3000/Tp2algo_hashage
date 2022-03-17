package main.java;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class MultiSet {

    private char[] arrayOfLetters;
    private final String word;



    public MultiSet(String word) {
        this.word = word;
        this.arrayOfLetters = word.toCharArray();
        sort(arrayOfLetters);

    }
    public String getWord() {
        return word;
    }

    public char[] getArrayOfLetters(){
        return this.arrayOfLetters;
    }

    public List elementsOf(MultiSet word) {
        List<Character> elements = new ArrayList<Character>();
        for (char element : arrayOfLetters) {
            elements.add(element);
        }
        return elements;
    }


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

    public boolean remove(Character c) {
        return elementsOf(this).remove(c);
    }



//    public boolean existComplementary(){
//
//    }
//
//    public ArrayList<Character> getComplementary(){
//
//    }

    //vérifie si  word1 contient word2 marche

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




    // methode qui retourne le complementaire de this par rapport a given word
    public MultiSet complementary( MultiSet givenWord) {
        int wordLength = givenWord.getArrayOfLetters().length;
        if (this.getArrayOfLetters().length > wordLength) return null;

        MultiSet complementary = new MultiSet(givenWord.getWord());
        for (Character c : this.getArrayOfLetters() ) {
            if (!complementary.remove(c)) {
                return null;
            }
        }
        System.out.println(complementary );
        return complementary;
    }

}