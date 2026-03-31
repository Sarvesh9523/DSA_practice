import java.util.Arrays;

public class DNF_ALGO {  // DNF stands for Dutch National Flag .
    public static void main(String[] args){
        int[] arr = {0,0,1,2,0,2,1,2,1,0,0,1,2} ;
        DNF_Sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    // Creating a function to sort the array .
    static void DNF_Sorting(int[] arr){
        int n = arr.length ;
        /* initializing 3 pointers to evaluate the array .
        According to DNF:-
        first part of array contains only "Zero" which range is 0 to low-1.
        Second part of array contains only "ONE" which range is low to mid-1.
        Third part of array contain only "Three" which range is high+1 to n-1
        and the range of given array is mid to high . and the array is {0,0,1,2,0,2,1,2,1,0,0,1,2} .
        */ 
        int low = 0 , mid = 0 , high = n-1 ;
        while(mid <= high){
            // condition when mid pointer has value 0 .
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low ++;
                mid++ ;
            }
            // condition when mid pointer has value 1 .
            else if(arr[mid] == 1){
                mid ++ ;
            }
            // condition when mid pointer has value 2 .
            else{
                swap(arr, high, mid);
                high -- ; // high-- is use to save the space if array because the size of array us fixed we cannot increase the size of array.
            }
        }
    }
    // Creating another function to swap Two values with each other .
    static void swap(int[] arr, int first, int second){
        int temp ;
        temp = arr[first] ;
        arr[first] =  arr[second] ;
        arr[second] =  temp ;
    }
}
