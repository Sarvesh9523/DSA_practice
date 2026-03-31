import java.util.*;

public class mergesorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        arr = mergesort(arr) ;
        System.out.println(Arrays.toString(arr));
        
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2 ;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right) ;
    }
    static int[] merge(int[] first, int[] second){
        int[] mergedArray = new int[first.length + second.length] ;
        
        int i = 0; //check element for the first array
        int j = 0 ;//check element for the second array
        int k = 0 ;//element of the Merged array

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mergedArray[k] = first[i] ;
                i++;

            }else{
                mergedArray[k] = second[j] ;
                j++ ;
            }
            k++ ;
        }

        // it may be possible that one of the array is not completly stores in MergedArray . 
        while(i < first.length){
            mergedArray[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mergedArray[k] = second[j];
            j++;
            k++;
        }
        return mergedArray ;

    }
    
}
