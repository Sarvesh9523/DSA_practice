import java.util.* ;
public class rotatearr{
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 2;

        // Call the Rotate function and print the rotated array
        Rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    static void Rotate(int arr[] , int k){
        int n = arr.length ;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        

    }
    static void reverse(int arr[], int s, int e){
        while(s < e){
            int temp = arr[s] ;
            arr[s] = arr[e] ;
            arr[e] = temp ;
            s ++ ;
            e -- ;
        }
        
    }
    
}