package main.java;

import java.util.ArrayList;

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

    public ArrayList<Character> elementsOf(MultiSet word) {
        ArrayList<Character> elements = new ArrayList<>();
        for (char element : word.getArrayOfLetters()) {
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

    public boolean contains( MultiSet givenWord) {
        int count = 0;
        for (char letter: givenWord.getArrayOfLetters()) {
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
    public char[] complementary(MultiSet givenWord) {
        int wordLength = givenWord.getArrayOfLetters().length;
        int thisLength =this.arrayOfLetters.length;
        if (thisLength<= wordLength) return null;

        char [] complementary = new char[thisLength - wordLength];
        int givenIndex= 0;
        int compIndex = 0;
        for (int thisIndex = 0; thisIndex < thisLength; thisIndex++) {
            if ( givenIndex < wordLength && givenWord.arrayOfLetters[givenIndex] == this.arrayOfLetters[thisIndex])
                givenIndex++;
            else {
                complementary[compIndex] = this.arrayOfLetters[thisIndex];
                compIndex++;
            }
        }
        return complementary;
    }
}