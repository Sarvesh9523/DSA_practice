import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1,4,5,3,8,7,6,10,9} ;
        System.out.println("Given array is :" + Arrays.toString(arr));
        selection(arr) ;
        System.out.println("Now the sorted arrays is : " + Arrays.toString(arr));        
    }
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1 ; // find the maximum in remaining array and swap it with the correct index .So that we don't need to itrate over all element again and again.
            int maxIndex = Findmax(arr, 0, last) ;
            swap(arr, maxIndex, last) ;
        }
    }
    
    // creating function to find the maximum element in the given array . 
    static int Findmax(int[] arr , int start, int end){
        int max = start ; // assuming first index will be start index and it suppose to be the maximum element in the array and then compare it with all elements in the array .
        for(int i=start; i<=end; i++){  // here itration goes till the end because after each itration end will be change by reducing by 1 index from the last. 
            if(arr[max] < arr[i]){
                max = i ;
            }
        }
        return max ;
    }

    // Creating swap function to swap the maximum element with the last index for sorting .
    static void swap(int[] arr, int first, int second){
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}

    
