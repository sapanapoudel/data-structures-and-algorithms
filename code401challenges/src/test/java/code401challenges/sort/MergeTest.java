package code401challenges.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeTest {
@Test public void mergeTest() {
    int[] arr = new int[]{34, -55, 76, 1, 9, -15, 100};
    assertEquals(new int[]{-55, -15, 1, 9, 76, 100}, Merge.mergeSort(arr));
//    assertArrayEquals(new int[]{-55, -15, 1, 9, 76, 100}, Arrays.toString(Merge.mergeSort(arr)));
    System.out.println(Arrays.toString(Merge.mergeSort(arr)));
}
}