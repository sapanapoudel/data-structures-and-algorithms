package code401challenges.sort;

public class Merge {
    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n/2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            for (int i = 0; i <= mid - 1; i++) {
                left[i] = arr[i];
            }
            for (int j = mid; j < n; j++) {

                right[j-mid] = arr[j];

            }

            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
        return arr;
    }

    public static void merge(int[] left, int[] right, int[] arr) {
            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i = i + 1;
                } else {
                    arr[k] = right[j];
                    j = j + 1;
                }
                k = k + 1;
            }
            while (i < left.length) {
                arr[k] = left[i];
                i = i + 1;
                k = k + 1;
            }
            while (j < right.length) {
                arr[k] = right[j];
                j = j + 1;
                k = k + 1;
            }
        }
    }
