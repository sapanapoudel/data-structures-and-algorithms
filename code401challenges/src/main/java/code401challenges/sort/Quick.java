package code401challenges.sort;

public class Quick {

    public static int[] quickSort(int[] arr, int left, int right) {
        if(left < right){
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
       return arr;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int pIndex = left-1;
        for(int i = left; i < right; i++) {
            if(arr[i] <= pivot){
                pIndex++;
                swap(arr, i, pIndex);
            }

        }
        swap(arr, right, pIndex + 1);
        return pIndex + 1;
    }

    public static void swap(int[] arr, int i, int pIndex) {
        int temp = arr[i];
        arr[i] = arr[pIndex];
        arr[pIndex] = temp;
    }

}
