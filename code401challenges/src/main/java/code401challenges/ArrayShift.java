package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static int[] insertShiftArray(int[] arr, int n){
        int t = arr.length;
        int[] newArr = new int[t+1];
        int midPoint = (int)Math.floor(t/2);
        for(int i = 0; i <= t; i++){
            if(i < midPoint){
                newArr[i] = arr[i];
            } else if(i == midPoint){
                newArr[i] = n;
            } else if(i > midPoint){
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArr));
        return  newArr;
    }
}
