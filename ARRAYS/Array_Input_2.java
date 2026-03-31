import java.util.Arrays;
import java.util.Scanner ;
public class Array_Input_2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in) ;
        

        // Array of Primitive 
        /*int arr[] = new int[5] ;
        arr[1] = 23 ;
        arr[2] = 24 ;
        arr[3] = 24 ;
        arr[4] = 25 ;
        arr[5] = 26 ; */ 
        // we can store the element like this for the small size of array. But what we can do when the size is large ! then we can do only thing is using loop.
        System.out.print("Enter the size of array : ");
        int size = in.nextInt() ;
        int arr[] = new int[size] ;

        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter the element at index " + i + " : ");
            arr[i] = in.nextInt();
            
        }
        
        // for(int i=0 ; i<arr.length ; i++){
        //     System.out.print(arr[i] + ",");
        // } 
       

        // second way to print all the element of the array 

        /*for(int num : arr){  // for every (integer num) element (:) from arr(Array) -- it is like num = arr[i]  and i++ till arr.length
            System.out.print(num + " "); // here num represent the element of array.
        } */

        /* If we try to print any index's element which is not in the size then it will throw error name (Index out of bound error) */

        // The another way to print the same array 
        System.out.print(Arrays.toString(arr)); // this is the right way to show the actuall array and the printing method.  

        
    }
    
}
