package main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HashTable {
    private ArrayList<LinkedList<WordToLetters>> hashTable;
    private int length;


    public HashTable(File filePath) throws FileNotFoundException {
        this.length = getLength(filePath);
        initialize();
    }

    public void initialize(){
        this.hashTable = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            hashTable.add(new LinkedList<>());
        }
    }

    public int getLength(File filePath) throws FileNotFoundException {
        Scanner file = new Scanner(filePath);
        int length = 0;
        while (file.hasNextLine())
          file.nextLine();
          length++;
      return length;
    }

    public void fillTable(File filePath) throws FileNotFoundException {
        Scanner file= new Scanner(filePath);
        while (file.hasNextLine()) {
            WordToLetters word = new WordToLetters(file.nextLine());
            int index = getIndex();
            this.hashTable.get(index).addFirst(word);
            System.out.println(word);
        }
    }

    public int getIndex(){

    }

    public int primeNumber(){


    }

}