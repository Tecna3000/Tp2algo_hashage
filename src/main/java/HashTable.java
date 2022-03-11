package main.java;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {
    private ArrayList<LinkedList<WordToLetters>> hashTable;
    private int length;


    public HashTable(ArrayList<WordToLetters>words) {
        this.length = getLength();
        initialize();
    }

    public void initialize(){
        this.hashTable = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            hashTable.add(new LinkedList<>());
        }
    }

    public int getLength(){

    }


}