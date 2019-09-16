package code401challenges.hashtable;

import code401challenges.linkedlist.LinkedList;

public class HashTable {
    private Node[] map;
    private LinkedList<String>[] hashMap;


    public HashTable(int size) {
        hashMap = new LinkedList[size];
        map = new Node[size];
    }

    //hash method: takes in an arbitrary key and returns an index in the collection
    public int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }

        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    //Add method: takes in both the key and value. This method should hash the key, and add the key and value pair
    // to the table, handling collisions as needed.

    public void add(String key, String value) {
        int hashKey = hash(key);
        System.out.println("key: " + key + " hashKey:  " + hashKey);
        if(this.map[hashKey] == null) {
            map[hashKey] = new Node(key, value);
        } else {
            //handling collision using Linked list

            Node temp = map[hashKey];
            map[hashKey]  = new Node(key, value);
            map[hashKey] .setNext(temp);
        }
    }

    //get method: takes in the key and returns the value from the table.
    public String get(String key) {
        int hashKey = hash(key);
        Node newNode = map[hashKey];
        while(newNode != null) {
            if(newNode.getKey().equals(key)){
                return newNode.getValue();
            }
            newNode = newNode.getNext();

        }
        return null;
    }

    //contains method: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains(String key) {
        int hashKey = hash(key);
        if(this.map[hashKey] == null) {
            return false;
        }
        return true;

    }

}
