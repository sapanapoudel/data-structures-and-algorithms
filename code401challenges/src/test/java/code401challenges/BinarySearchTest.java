package code401challenges;

import code401challenges.arraylist.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    //***********Test for Iterative Binary search *******************
    @Test public void binarySearchTest() {
        assertEquals(2,
                BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test public void binarySearch_notFound() {
        assertEquals("should return -1", -1,
                BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 6));
    }

    @Test public void binarySearch_notSorted() {
        assertEquals("should return -1", -1,
                BinarySearch.binarySearch(new int[]{3, 2, 4, 6}, 2));
    }

    //************Test for Recursive Binary Search ******************
    @Test public void recursiveBinarySearchTest () {
        assertEquals("should return index when value is found", 3,
                BinarySearch.recursiveBinarySearch(new int[]{1, 2, 3, 4, 5}, 4, 0, 4));
    }

}