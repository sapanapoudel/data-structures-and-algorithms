package code401challenges.sort;

public class Insertion {
    public static int[] insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while(j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    //Another Version
    public static int[] insertion(int[] arr) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }
        return arr;
    }
}
