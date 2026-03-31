class Solution {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12} ;
        moveZeroes(nums);
        System.out.println(nums) ;
    }
    static void moveZeroes(int[] nums) {
        if(nums.length <= 1){
            return ;
        }
        int nonzero = 0 ;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, nonzero);
                nonzero++;
            }

        }
        
    }
    static void swap(int[] nums, int s, int e){
       
        int temp = nums[s] ;
        nums[s] = nums[e] ;
        nums[e] = temp ;
        
    }
}