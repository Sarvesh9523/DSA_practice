class solution{
    static int RemoveDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int j = 1;
        for(int = i; i<nums.length; i++){
            if(nums[i] =! nums[i-1]){
                nums[j] = nums[i] ;
                j++ ;
            }
        }
        return j ;

    }
}