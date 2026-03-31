import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
       
        IS(arr, arr.length); 
        System.out.println(Arrays.toString(arr)); 
        
    }
    static void IS(int[] arr, int n){
        if(n <= 1){
            return ;
        }
        
        for(int j= n-1; j>0 ; j--){ // here the sorting perform from n-1 till 1 because j will never should be 0 .
            if(arr[j] < arr[j-1]){ 
                int temp = arr[j];
                arr[j] = arr[j-1] ;
                arr[j-1] = temp ;
                
            }else{
                break ; // but if j is greater than its previous element it's mean no need to compare with all the previous element, and it should be stopped .
            }

        }
        
        
        IS(arr, n-1) ;
    }

}