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
    public static ArrayList<Character> existWord(HashTable hashTable, String mixedWord) {
        WordToLetters word = new WordToLetters(mixedWord);
        ArrayList<Character> complementary = new ArrayList<>();
        for (LinkedList<WordToLetters> list : hashTable.getHashTable()) {
            for( WordToLetters wrd: list){
                System.out.println(wrd.getWord());
                if (contains(mixedWord,wrd.getWord())){
                    firstword = wrd.toString();
                    list.remove(wrd);
                    int i = 0;int j =0;
                    while(i< mixedWord.length() || j< wrd.getWord().length()){
                        if(i< mixedWord.length() ){
                            if (j< (wrd.getWord().length())){
                                if(mixedWord.charAt(i) == wrd.getWord().charAt(j)){
                                    i++;
                                    j++;
                                }else if(i<mixedWord.length() && j <wrd.getWord().length()){
                                    complementary.add(mixedWord.charAt(i));
                                    i++;
                                }
                            }

                        }
                        return complementary;
                    }
                }
            }

        }
        return complementary;
    }

//    public boolean existComplementary(){
//
//    }
//
//    public ArrayList<Character> getComplementary(){
//
//    }

   //vérifie si la word1 contient word2
    public static boolean contains(String word1, String word2) {
        int count = 0;
        for (int index = 0; index < word2.length(); index++) {
            if(count< word2.length()){
                if (word1.charAt(index) == word2.charAt(count)) {
                    count++;
                }
            }else{
                break;
            }

        }
        return (count == word2.length());
    }
}