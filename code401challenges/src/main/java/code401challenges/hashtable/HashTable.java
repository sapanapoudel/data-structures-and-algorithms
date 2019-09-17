package code401challenges.hashtable;

import code401challenges.linkedlist.LinkedList;

public class HashTable<T, S> {
    private Node[] map;

    public HashTable(int size) {
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

    public void add(T key, T value) {
        int hashKey = hash((String) key);
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
    public T get(T key) {
        int hashKey = hash((String)key);
        Node<T> newNode = map[hashKey];
        while(newNode != null) {
            if(newNode.getKey().equals(key)){
                return newNode.getValue();
            }
            newNode = newNode.getNext();

        }
        return null;
    }

    //contains method: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains(T key) {
        int hashKey = hash((String)key);
        if(this.map[hashKey] == null) {
            return false;
        }
        return true;

    }

}
