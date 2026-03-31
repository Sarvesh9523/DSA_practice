
// cyclic sorting algorithm only perform on the array which elements range is 1 to N .
// NOTES : This algorithm is perform on continous element of array .
import java.util.Arrays;
public class cyclic_sort{
    public static void main(String[] args){
        int[] arr = {3,5,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0 ;
        while(i < arr.length){
            int correct_index = arr[i]-1 ;
            if(arr[i] != arr[correct_index]){
                int temp = arr[i] ;
                arr[i] = arr[correct_index];
                arr[correct_index] = temp ;
            }else{
                i++ ;
            }
        }
    }
    // static void swap(int[] arr, int first, int second){
    //     int temp = arr[first] ;
    //     arr[first] = arr[second];
    //     arr[second] = temp ;

    // }
}
