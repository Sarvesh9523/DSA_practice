public class Find_min {
    public static void main(String[] args) {
        int[] arr = {23, 24, 56, 67, 61, 32, 54, 1, 2};
        System.out.println(min(arr));
        
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans ;
    }
    
}
