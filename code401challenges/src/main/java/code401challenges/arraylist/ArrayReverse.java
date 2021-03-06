package code401challenges.arraylist;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {

    int[] myArray = { 1, 2, 3, 4, 5 };
    reverseArray(myArray, myArray.length);

    int[] testArray = {6, 7, 8, 9};
    anotherReverseArray(testArray, testArray.length);

  }
  // Creating new Array 
  public static void reverseArray(int[] arr, int n) {
    int[] newArray = new int[n];
    for(int i = 0; i < n; i++) {
      newArray[i] = arr[n-1-i];
    }
//    int j = n;
//    for (int i = 0; i < n; i++) {
//      newArray[j - 1] = arr[i];
//      j = j - 1;
//    }
    System.out.println("Reverse array is: \n");

    System.out.println(Arrays.toString(newArray));

  }

  //Swapping method in a same array
  public static void anotherReverseArray(int[] arr, int n){
    for(int i = 0; i < n/2; i++){
      arr[i] = arr[n-1-i];
      int j = arr[i];
      arr[i] = arr[n - 1 - i];
      arr[n - 1 - i] = j;
      j = n - 1 - i;
    }
    System.out.println("Reverse array is: \n");

    System.out.println(Arrays.toString(arr));
  }
}
