package main.java;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {
    private ArrayList<LinkedList<WordToLetters>> hashtable;
    private int size;


    public HashTable(ArrayList<LinkedList<WordToLetters>> hashtable, int size) {
        this.size = size;
        initTable();
    }

    public void initTable(){
        this.hashtable = new ArrayList<>();
    }

//    public int getSize(File file){
//
//
//    }


}