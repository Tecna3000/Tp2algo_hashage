package main.java;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {
    private ArrayList<LinkedList<WordToLetters>> hashtable;
    private int size;


    public HashTable(ArrayList<WordToLetters>words) {
        //this.size = size;
        initialize();
    }

    public void initialize(){
        this.hashtable = new ArrayList<>();
        for (int i = 0; i < 7; i++) {// à rectifier
            LinkedList<WordToLetters> list = hashtable.get(i);
        }
    }

//    public int getSize(File file){
//
//
//    }


}