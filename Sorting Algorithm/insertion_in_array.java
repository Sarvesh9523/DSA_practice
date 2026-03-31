import java.util.Scanner ;
import java.util.Arrays ;
public class insertion_in_array {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5} ;
        Scanner in = new Scanner(System.in) ;
        System.out.print("Enter the element : ");
        int element = in.nextInt() ;
        System.out.print("Enter the position or index : ");
        int position = in.nextInt() ;
        arr = insert(arr, element, position);
        System.out.println("Array after insertion: " + Arrays.toString(arr));
        
        

    }
    static int[] insert(int[]arr, int element ,int position){
        if(position < 0 || position > arr.length){
            System.out.println("The position is out of size because 1 iteration can increase the size of array by one index and current size of array is" + arr.length);
            return arr ;
        }

       int[] newArr = new int[arr.length + 1] ;
       for (int i = 0, j = 0; i < newArr.length; i++) {
        if (i == position) {
            newArr[i] = element;
        }
        
        else {
            newArr[i] = arr[j++];
        }
       }
       return newArr ;
    }    
}
