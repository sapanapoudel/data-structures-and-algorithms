package code401challenges.hashtable;

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

    }

