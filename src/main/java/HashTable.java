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
    private final int filling;


    public HashTable(File filePath, int filling) throws FileNotFoundException {
        this.length = findPrimeNumber(filePath);
        //System.out.println(this.length);
        initialize();
        this.filling = filling;
        System.out.println("constructeur: "+this.filling);
        //fillTable(filePath);
    }

    public void initialize(){
        this.hashTable = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            hashTable.add(new LinkedList<>());
        }
        }

//    public void fillTable(File filePath) throws FileNotFoundException {
//        Scanner file= new Scanner(filePath);
//        while (file.hasNextLine()) {
//            WordToLetters word = new WordToLetters(file.nextLine());
//            int index = (int) findIndex(file.nextLine());
//            this.hashTable.get(index).addFirst(word);
//            System.out.println(word);
//        }
//    }

    public int computeFileLength(File filePath) throws FileNotFoundException {
        Scanner file = new Scanner(filePath);
        int length = 0;
        while (file.hasNextLine()){
            file.nextLine();
            length++;

        }
      return length;
    }




    // k/findPrimenumber
    public double findIndex(String word){
        return (computeAlphabetValue(word)% this.filling);
    }

    public double computeAlphabetValue(String word){
        double value = 0;
        for(int index =0; index < word.length(); index++){
          int pow= (word.length()-(index+1));
          double val = ( Math.pow(256,pow));
            value= value +( (value+ (word.charAt(index))*val));
        }
        return value;
    }

    // le premier nb premier sup à nb delements/le aux de remplissage
    public int findPrimeNumber(File filePath) throws FileNotFoundException {
        int length = computeFileLength(filePath);
        int start = (int) Math.ceil((double) length/ this.filling);
        System.out.println(this.filling);
        System.out.println(start);
        for(int index = start;index< computeFileLength(filePath); index++) {
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

}