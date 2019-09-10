package code401challenges.sort;

import code401challenges.sort.Insertion;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionTest {
    @Test public void insertionSortTest() {
        int[] arr = new int[]{35, 20, -22, -15, 7};
        assertArrayEquals(new int[]{-22, -15, 7, 20, 35}, Insertion.insertionSort(arr));
    }

    //Test on empty array
    @Test public void insertionSort_emptyArray() {
        int[] arr = new int[]{};
        assertArrayEquals(new int[]{}, Insertion.insertionSort(arr));
    }

    @Test public void insertionSortTest_Another() {
        int[] arr = new int[]{100, -200, 300, -300, 400};
        assertArrayEquals(new int[]{-300, -200, 100, 300, 400}, Insertion.insertionSort(arr));
    }

    //Another version test
    @Test public void insertionSortAnotherVersionTest() {
        int[] arr = new int[]{35, 20, -22, -15, 7};
        assertArrayEquals(new int[]{-22, -15, 7, 20, 35}, Insertion.insertion(arr));
        System.out.println(Arrays.toString(Insertion.insertion(arr)));
    }


}