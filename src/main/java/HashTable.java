package main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class HashTable {
    public ArrayList<LinkedList<WordToLetters>> hashTable;
    private final int length;


    public HashTable(File filePath, int filling) throws FileNotFoundException {
        this.length = findPrimeNumber(filePath,filling);
        initialize();
        fillTable(filePath);
    }

    public void initialize(){
        this.hashTable = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            hashTable.add(new LinkedList<>());
        }
    }

    public void fillTable(File filePath) throws FileNotFoundException {
        Scanner file= new Scanner(filePath);
        try {
            while (file.hasNextLine()) {
                WordToLetters word = new WordToLetters(file.nextLine());
                int key = (int) findKey(word.toString());
                this.hashTable.get(key).addFirst(word);
            }
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int computeNbOfElements(File filePath) throws FileNotFoundException {
        Scanner file = new Scanner(filePath);
        int length = 0;
        while (file.hasNextLine()){
            file.nextLine();
            length++;

        }
      return length;
    }


    // k mod findPrimenumber
    public double findKey(String word){
        return (computeAlphabetValue(word)% this.length);
    }


    public static double computeAlphabetValue(String word){
        WordToLetters w = new WordToLetters(word);
        double value = 0;
        for(int index =0; index < word.length(); index++){
          int pow= (word.length()-(index+1));
          double val = ( Math.pow(256,pow));
            value= value+ ((word.charAt(index))*val);
        }
        return value;
    }


    // le premier nb premier sup à nb delements/le taux de remplissage
    public int findPrimeNumber(File filePath,int filling) throws FileNotFoundException {
        int nbOfElements = computeNbOfElements(filePath);
        int start = (int) Math.ceil((double) nbOfElements/ filling);
        System.out.println("the filling is: "+filling);
        for(int index = start; index< computeNbOfElements(filePath); index++) {
            if (isPrimeNumber(index)) {
                return (index);

            }
        }
        return 0;
    }

    public boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(number); ++i) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public String toString() {
        String toString = "{\n";
        for(LinkedList list : hashTable) {
            if (list.size() > 0) {
                toString += "  "+ hashTable.indexOf(list)+": ";
                for(Object word : list) {

                    toString += word.toString()+", ";
                }
                toString += "\n";
            }
        }
        return toString+"}";
    }

    public ArrayList<LinkedList<WordToLetters>> getHashTable() {
        return hashTable;
    }




    public boolean existWord(char[] mixedWord) {
        ArrayList<Character> complementary = new ArrayList<>();
        for (LinkedList<WordToLetters> list : hashTable) {
            for (WordToLetters word : list) {
                System.out.println(word.getWord() +" : "+ mixedWord);
                if (word.contains(mixedWord)) {
                    System.out.println("k\n");

                    return true;

                }
            }
        }
        return false;
    }

}