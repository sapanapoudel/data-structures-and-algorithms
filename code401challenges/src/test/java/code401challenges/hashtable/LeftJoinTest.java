package code401challenges.hashtable;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test public void leftJoinTest() {
        Hashtable<String, String> ht1 = new Hashtable<>();
        ht1.put("fond", "enamored");
        ht1.put("wrath", "anger");

        Hashtable<String, String> ht2 = new Hashtable<>();
        ht2.put("fond", "averse");
        ht2.put("wrath", "delight");
        ht2.put("guide", "usher");

        System.out.println(LeftJoin.leftJoin(ht1, ht2));
    }

}