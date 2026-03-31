import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {1,5,4,3,6} ;
        bubblesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr, int s, int e){
        if(e == 0){
            return;
        }
        if(s<e){
            if(arr[s] > arr[s+1]){
                int temp = arr[s];
                arr[s] = arr[s+1] ;
                arr[s+1] = temp ;

            }
            bubblesort(arr, s+1, e);
            
        }else{
            bubblesort(arr, 0, e-1);
            }
    }
    
}
