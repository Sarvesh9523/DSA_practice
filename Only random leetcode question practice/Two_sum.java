import java.util.Arrays ;
public class Two_sum{
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7} ;
        int sum = 9 ;
        int[] ans = findIndex(arr, sum) ;
        System.out.println(Arrays.toString(ans));
        
    }
    public static int[] findIndex(int[] arr, int sum){
        for(int i=0; i<arr.length; i++){
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    return new int[] {i, j} ;
                }
            }
        } 
        return null ; 
    }
}