package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testArrayShift() {

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayShift.insertShiftArray(new int[]{1, 2, 4, 5}, 3));
        assertArrayEquals(new int[]{5, 6, 7, 8, 9, 10}, ArrayShift.insertShiftArray(new int[]{5, 6, 8, 9, 10}, 7));

    }

    @Test public void testArrayShift_expectedFailure() {

        assertNotEquals(new int[]{3, 1, 2, 4, 5}, ArrayShift.insertShiftArray(new int[]{1, 2, 4, 5}, 3));
    }

    @Test public void testArrayShift_edgeCase(){
        assertArrayEquals(new int[] {2}, ArrayShift.insertShiftArray(new int[]{}, 2));

    }

}