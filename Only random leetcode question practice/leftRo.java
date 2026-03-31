import java.util.Arrays ;
public class leftRo{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6} ;
        int k = 1 ;
        Rotate(nums, k) ;
        System.out.println(Arrays.toString(nums)) ;
    }
    static void Rotate(int[] nums, int k){
        int n = nums.length ;
        if(n == 0){
            return ;
        }
        k = k % n ;
        if(k==0){
            return ;
        }

        reverse(nums, 0, n-1) ;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1 ) ;
    }
    static void reverse(int[] nums, int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e] ;
            nums[e] = temp ;
            s++;
            e--;

        }
        
    }
}