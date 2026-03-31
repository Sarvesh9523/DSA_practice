import java.util.Scanner ;
import java.util.Arrays ;
public class deletion_in_Array {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5} ;
        Scanner in = new Scanner(System.in) ;
        
        System.out.print("Enter the position or index : ");
        int position = in.nextInt() ;

        arr = deleteElement(arr, position);
        System.out.println("Array after deletion: " + Arrays.toString(arr));
        

    }
    public static int[] deleteElement(int[] arr, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        
        int[] newArr = new int[arr.length - 1];
        
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == position) continue;
            newArr[j++] = arr[i];
        }
        return newArr;
    }
} 