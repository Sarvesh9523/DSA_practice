import java.util.Arrays;

public class selection{
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        selectionsort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selectionsort(int[] arr, int s, int e, int max){
        if(e == 0){
            return;
        }
        if(s<e){
            if(arr[max]<arr[s]){
                selectionsort(arr, s+1, e, s);          

            }else{
                selectionsort(arr, s+1, e, max);
            }

        }else{
            int temp = arr[max] ;
            arr[max] = arr[e-1] ;
            arr[e-1] = temp ;
            selectionsort(arr, 0, e-1, 0);
        }
        
        
    }
}
