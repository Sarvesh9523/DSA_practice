// Here kadean's algorithm is applied for finding the maximum sub array sum .

public class MaxSubArraySum {
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumsubarraysum(arr)) ;

    }
    static int maximumsubarraysum(int[] arr){
        int currentsum = arr[0] ;
        int maxsum = arr[0] ;
        for(int i=1; i<arr.length ; i++){
            currentsum = Math.max(arr[i] , currentsum + arr[i]) ;
            maxsum = Math.max(maxsum, currentsum) ;
        }
        return maxsum ;
    }
    
}
