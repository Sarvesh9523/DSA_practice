import java.util.* ;
public class TwoSum{
    public static void main(String[] args){
        int arr[] = {11} ;
        int target = 11 ;

        System.out.println(twoSum(arr, target)) ;

    }
    static boolean twoSum(int arr[], int target) {
        // code here
        if(arr.length < 2){
            return false ;
        }
        HashMap<Integer, Integer> map = new HashMap<>() ;
        for(int i=0; i<=arr.length-1; i++){
            int difference = target - arr[i] ;
            if(map.containsKey(difference)){
                return true ;
            }
            map.put(arr[i] , i) ;
        }
        return false ;
    }
}