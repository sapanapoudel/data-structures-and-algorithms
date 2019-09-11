package code401challenges.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickTest {

    @Test public void quickTest() {
        int[] arr = new int[] {6, 2, -12, 45, 1, 55};
        assertArrayEquals(new int[]{-12, 1, 2, 6, 45, 55}, Quick.quickSort(arr, 0, arr.length-1));
    }

    @Test public void quickTest_OneItem() {
        int[] arr = new int[]{3};
        assertArrayEquals(new int[]{3}, Quick.quickSort(arr, 0, arr.length-1));
    }

    @Test public void quickTest_longArray() {
        int[] arr = new int[] {78, 400, 45, -980, -167, 55, 1, 7};
        assertArrayEquals(new int[]{-980, -167, 1, 7, 45, 55, 78, 400}, Quick.quickSort(arr, 0, arr.length-1) );
    }

}