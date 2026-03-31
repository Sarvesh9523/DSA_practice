class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; // store current element consicutive
        int maxcount = 0 ; // store the maximum number of consicutive .
        for(int element : nums){
            if( element == 0){
                count = 0 ;
            }
            if( element == 1){
                count++;
                if(count > maxcount){
                    maxcount = count;
                }
            }
            
        }
        return maxcount ;
        
    }
}