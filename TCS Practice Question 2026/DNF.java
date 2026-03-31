import java.util.* ;

public class DNF {
    public static void main(String[] args){
        int[] arr = {0,0,1,2,0,2,1,2,1,0,0,1,2} ;
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid < high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++ ;
            }else{
                swap(arr, mid, high);
                high-- ;
            }
        }

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
    
}
