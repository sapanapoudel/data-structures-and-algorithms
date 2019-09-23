package code401challenges.hashtable;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test
    public void leftJoinTest() {

        HashMap<String, String> ht1 = new HashMap<>();
        ht1.put("fond", "enamored");
        ht1.put("wrath", "anger");

        HashMap<String, String> ht2 = new HashMap<>();
        ht2.put("fond", "averse");
        ht2.put("wrath", "delight");
        ht2.put("guide", "usher");

        HashMap<String, String[]> result = LeftJoin.leftJoin(ht1, ht2);
        String resultStr = "";
        for(String key : result.keySet()){
            resultStr += key + ", " + Arrays.toString(result.get(key)) + "\n";
        }

        System.out.println(resultStr);
        String expected = "wrath, [anger, delight]\n" +
                "fond, [enamored, averse]\n";

        assertEquals(expected, resultStr);

    }

    @Test public void leftJoinTestWithBUull() {
        HashMap<String, String> ht1 = new HashMap<>();
        ht1.put("fond", "enamored");
        ht1.put("wrath", "anger");
        ht1.put("guide", "usher");

        HashMap<String, String> ht2 = new HashMap<>();
        ht2.put("fond", "averse");
        ht2.put("wrath", "delight");


        HashMap<String, String[]> result = LeftJoin.leftJoin(ht1, ht2);
        String resultStr = "";
        for(String key : result.keySet()){
            resultStr += key + ", " + Arrays.toString(result.get(key)) + "\n";
        }

        System.out.println(resultStr);
        String expected = "wrath, [anger, delight]\n" +
                "guide, [usher, null]\n" +
                "fond, [enamored, averse]\n";

        assertEquals(expected, resultStr);
    }

}