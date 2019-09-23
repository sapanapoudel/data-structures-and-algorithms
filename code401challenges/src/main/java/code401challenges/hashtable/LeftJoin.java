package code401challenges.hashtable;

import java.util.HashMap;


public class LeftJoin {
    public static HashMap<String, String[]> leftJoin(HashMap<String, String> h1, HashMap<String, String> h2) {
       HashMap<String, String[]> result = new HashMap<>();
       for (String key : h1.keySet()) {
               String[] val = new String[] {h1.get(key), "null"};
               result.put(key, val);
       }
       if(!h1.isEmpty() && !h2.isEmpty()) {
           for(String key : h2.keySet()) {
               if(h1.containsKey(key)) {
                   String[] val = new String[]{h1.get(key), h2.get(key)};
                   result.put(key, val);
               }
           }
       }
       return result;
    }
}
