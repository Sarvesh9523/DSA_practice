import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
       
        BS(arr, arr.length); 
          
        System.out.println("Sorted array : "); 
        System.out.println(Arrays.toString(arr)); 

    }
    static void BS(int[] arr, int n){
        if(n == 1){
            return ;
        }
        int count = 0 ; /*The count variable is used to track whether any two adjacent elements were swapped in the current iteration of the array.
         If no swaps are made, it indicates that the array is already sorted, and there's no need to continue iterating.
          This is a common optimization to make the Bubble Sort algorithm more efficient. */

        for(int i=0; i<n-1 ; i++){
            if(arr[i] > arr[i+1]){
                // swap arr[i] , arr[i+1]
                int temp = arr[i] ;
                arr[i] = arr[i+1] ;
                arr[i+1] = temp ;
                count = count + 1 ; // increment the itration for sorting 
            }
        }
        if(count == 0){
            return ;
        }
        BS(arr, n-1) ; // recursivily call 
        // here recusivily is happen for each itration because same swapping operation perform for each itration till unsorted element (in which the swaping perform till unsorted part)
        //and in for loop it is already perform for only first itration .
    }
    
    
}
