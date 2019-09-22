package code401challenges.hashtable;

import java.util.HashMap;

public class RepeatedWord {
    public static String repeatedWord(String str) {
        HashTable<String, String> ht = new HashTable<>(1024);
        String[] splitWords = str.split(" ");
        for(String word :  splitWords) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if(ht.contains(word)){
                return word;
            } else {
                ht.add(word, word);
            }
        }
        return "No repeated words found in the string.";

        }
    //Find common word
    public static String findCommonWord(String str) {
        HashMap<String, Integer> ht = new HashMap<>();
        String[] splitWords = str.split(" ");
        int count = 1;
        for(String word :  splitWords) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
           if(ht.containsKey(word)){
               count = ht.get(word);
               count++;
               ht.put(word, count);
           }else{
               ht.put(word,1);
           }
        }
        int max = Integer.MIN_VALUE;
        String output = " ";
        for(String word : ht.keySet()){
            if(ht.containsKey(word)){
                int maxCount  = ht.get(word);
                if(maxCount > max){
                    max  = maxCount;
                    output = word;
                }
            }

        }
        return  output;
    }


    }

