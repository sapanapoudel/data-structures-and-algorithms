package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    /*
    1. Adding a key/value to your hashtable results in the value being in the data structure
    2. Retrieving based on a key returns the value stored
     */
    @Test public void hashTableAddTest() {
        HashTable ht = new HashTable(5);
        ht.add("Harry", "Instructor");
        ht.add("Sam", "TA");
        ht.add("Tom", "Student");
        ht.add("Joe", "Student");
        assertEquals("Student", ht.get("Tom"));
        assertEquals("TA", ht.get("Sam"));
    }

    // 3. Successfully returns null for a key that does not exist in the hashtable
    @Test public void hashTableNullTest() {
        HashTable ht = new HashTable(10);
        ht.add("Harry", "Instructor");
        ht.add("Sam", "TA");
        ht.add("Tom", "Student");
        ht.add("Joe", "Student");

        assertEquals(null, ht.get("Pete"));
    }

    @Test public void hashTableCollisionTest() {
        HashTable ht = new HashTable(3);
        ht.add("Harry", "Instructor");
        ht.add("Sam", "TA");
        ht.add("Tom", "Student");
        ht.add("Joe", "Student");
        ht.add("Joe", "TA");

        assertEquals("Student", ht.get("Tom"));
        assertEquals("TA", ht.get("Joe") );
    }

    @Test public void hashTableHasTest() {
        HashTable ht = new HashTable(1024);
        ht.add("Harry", "Instructor");
        ht.add("Sam", "TA");
        ht.add("Tom", "Student");
        ht.add("Joe", "Student");

        assertTrue(ht.contains("Harry"));
        assertFalse(ht.contains("Dom"));
    }

}