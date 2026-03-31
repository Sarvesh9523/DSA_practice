import java.util.*;

public class secondLarget {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 63, 54, 13 };
        int ans = search(arr);
        System.out.println(ans);

    }

    static int search(int[] arr) {
        int max = 0;
        int secondMax = -1 ;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr[max]){
                secondMax = arr[max];
                arr[max] = arr[i] ;
            }else if(arr[i] > secondMax && arr[i] < arr[max]){
                return secondMax = arr[i] ;
            }
        }
        return secondMax ;

    }
}
