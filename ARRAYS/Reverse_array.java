// Question: Reverse the given array {1, 2, 3, 4, 5, 6}.
import java.util.Arrays ;
public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Array before Reverse :" + Arrays.toString(arr));
        reverse(arr);       
        
    }
    static void reverse(int[] arr){
        int start = 0; 
        int end = arr.length-1 ;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++ ;
            end-- ;
        }
        System.out.println("Array after Reverse :" + Arrays.toString(arr));
    }

    
    
}
