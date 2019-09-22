package code401challenges.hashtable;

import java.util.ArrayList;
import java.util.Hashtable;

public class LeftJoin {
    public static ArrayList<String> leftJoin(Hashtable h1, Hashtable h2) {
       ArrayList<String> result = new ArrayList<>();
       for (Object key : h1.keySet()) {
           if(h2.containsKey(key)) {
               String val = h2.get(key).toString();
               result.add(val);
           }
       }
       return result;
    }
}
