package main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class HashTable {
    private ArrayList<LinkedList<WordToLetters>> hashTable;
    private int length;


    public HashTable(File filePath) throws FileNotFoundException {
        this.length = findPrimeNumber(filePath);
        initialize();
    }

    public void initialize(){
        this.hashTable = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            hashTable.add(new LinkedList<>());
        }
    }

    public static int computeFileLength(File filePath) throws FileNotFoundException {
        Scanner file = new Scanner(filePath);
        int length = 0;
        while (file.hasNextLine()){
            file.nextLine();
            length++;
        }
      return length;
    }

    public void fillTable(File filePath) throws FileNotFoundException {
        Scanner file= new Scanner(filePath);
        while (file.hasNextLine()) {
            WordToLetters word = new WordToLetters(file.nextLine());
            int index = findIndex();
            this.hashTable.get(index).addFirst(word);
            System.out.println(word);
        }
    }



    // k/findPrimenumber
    public int findIndex(){
        int index = 0;
        return index;
    }

    // le premier nb premier sup à nb delements/le aux de remplissage
    public static int findPrimeNumber(File filePath) throws FileNotFoundException {
        int filling = 3;
        int start = (int) Math.ceil((double) computeFileLength(filePath)/ filling);
        for(int index = start;index< computeFileLength(filePath); index++) {
            if (isPrimeNumber(index)) {
                return (index);
            }
        }
        return 0;
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(number); ++i) {
            if (number % i == 0) return false;
        }
        return true;
    }

}