import java.util.*;

public class mergesorting {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 8, 1 };
        // arr = mergesort(arr) ;
        mergesortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];

        int i = 0; // check element for the first array
        int j = 0;// check element for the second array
        int k = 0;// element of the Merged array

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArray[k] = first[i];
                i++;

            } else {
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not completly stores in
        // MergedArray .
        while (i < first.length) {
            mergedArray[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mergedArray[k] = second[j];
            j++;
            k++;
        }
        return mergedArray;

    }

    // Merge Sort In palce instead of making a copy of the array(Optimized one)

    static void mergesortInplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s+e) / 2;

        mergesortInplace(arr, s, mid);
        mergesortInplace(arr, mid, e);

        mergeInplace(arr, s, mid, e);
    }

    static void mergeInplace(int[] arr, int s, int m, int e) {
        int[] mergedArray = new int[e - s];

        int i = s; // check element for the first array
        int j = m;// check element for the second array
        int k = 0;// element of the Merged array

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mergedArray[k] = arr[i];
                i++;

            } else {
                mergedArray[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not completly stores in
        // MergedArray .
        while (i < m) {
            mergedArray[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mergedArray[k] = arr[j];
            j++;
            k++;
        }

        //now copy the merged array sorted element and push to original array with correct index 
        for (int l = 0; l < mergedArray.length; l++) {
            arr[s + l] = mergedArray[l];

        }

    }

}
