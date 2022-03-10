package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class ReadDict {

    public ReadDict(File file) {

    }


    public static LinkedList<WordToLetters> stockWords(File file) throws FileNotFoundException {
        LinkedList<WordToLetters> myDict = new LinkedList<>();
        Scanner dict = new Scanner(file);
        while (dict.hasNextLine()) {
            //System.out.println(new WordToLetters(dict.nextLine()));
            WordToLetters word = new WordToLetters(dict.nextLine());
            myDict.addFirst(word);
            System.out.println(word);
        }
        //System.out.println(myDict.size());
        System.out.println(myDict);
        return myDict;

    }

//     public static String toString(LinkedList<WordToLetters> myList){// le tostring marche pas il ecrit le worldtoletters i fois
//        String listOfWords = "{";
//         for (WordToLetters word : myList) {
//             //System.out.println(word);
//            listOfWords = listOfWords + (word) +";";
//         }
//         listOfWords = listOfWords + "}";
//         return listOfWords;
//     }
}