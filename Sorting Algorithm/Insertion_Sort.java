import java.util.Arrays ;
public class Insertion_Sort {
    public static void main(String[] args){
        int[] arr = {0,1,2,0,1,2,0,0,1,1,2,2};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    // creating a function that will sort the array using insertion sort algorithm 
    static void insertionsort(int[] arr){
        for(int i=0; i<arr.length-1 ; i++){ // where i is the number of passess while sorting, which is less than equal to arr.length-2 or number of iteration which is less than arr.length-1 .
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){ // here j is itratively negative because comparison should be with its privious element which is j-1 till 0th index.
                    swap(arr, j, j-1); // swapping the element when if condition will true .
                }else{
                    break ; // but if j is greater than its previous element it's mean no need to compare with all the previous element, and it should be stopped .
                }
                
            }
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second] = temp ;
    }
    
}
