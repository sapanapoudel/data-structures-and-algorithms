package code401challenges.hashtable;

import com.google.common.base.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {

    public static void main(String[] args) {
        System.out.println();
    }


    public  HashTable repeatedWord(String str) {
        HashTable ht = new HashTable(1024);
        String[] splitWords = str.split(" ");
        Set<Strings>  words = new HashSet(Arrays.asList(splitWords));
        int count = 0;
        for(Strings word :  words) {
            for(String temp : splitWords) {
                if(word.equals(temp)) {
                    ++count;
                }
            }
            ht.add(word, count);
            count = 0;
        }
        return ht;

        }

    }

