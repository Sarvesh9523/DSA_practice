public class Linear_search {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;  // here is the target element that we have to find with the index.
        int ans = linearsearch(nums, target);
        System.out.println(ans);        
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i] ;
            if(element == target){
                return i ;
            }
        }
        return -1 ;

    }
    
}
