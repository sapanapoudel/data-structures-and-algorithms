import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    System.out.println("Reversed array is: \n");
    int[] myArray = {1, 2, 3, 4, 5};
    reverseArray(myArray, myArray.length);
  }

  public static void reverseArray(int[] arr, int n ) {
    for (int i = 0; i < n/2; i++) {
     int initialArray = arr[i];
     arr[i] = arr[n - 1 - i ];
     arr[n - 1 - i] = initialArray;

    }
    for (int j  = 0; j < n; j++){
      System.out.println(arr[j]);
    }
  }
}