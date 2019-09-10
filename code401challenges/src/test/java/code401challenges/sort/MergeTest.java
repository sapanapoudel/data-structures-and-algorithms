package code401challenges.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeTest {
@Test public void mergeTest() {
    int[] arr = new int[]{34, -55, 76, 1, 9, -15, 100};
    assertArrayEquals(new int[]{-55, -15, 1, 9, 34, 76, 100}, Merge.mergeSort(arr));
}
@Test public void mergeTest_empty(){
    int[] arr = new int[]{};
    assertArrayEquals(new int[]{}, Merge.mergeSort(arr));
}
@Test public void mergeTest_another(){
    int[] arr = new int[]{60, -35, 8, 78};
    assertArrayEquals(new int[]{-35, 8, 60, 78}, Merge.mergeSort(arr));
}

}