import java.util.ArrayList;
import java.util.List;

public class prob_442 {
    class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct_index = nums[i]-1 ;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++ ;
            }
        }
        List<Integer> ans = new ArrayList<>() ;
        for(int index=0; index<nums.length; index++){
            
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }  
        return ans ;     
    }

    static void swap(int[] nums, int first, int second){
    int temp = nums[first] ;
    nums[first] = nums[second];
    nums[second] = temp ;

    }

}
    
}
