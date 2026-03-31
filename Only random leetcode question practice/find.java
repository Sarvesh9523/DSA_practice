public class find{
    public static void main(String[] args){
        int[] nums = {1,2,2,4} ;
        // findErrorNums(nums) ;
        System.out.println(findErrorNums(nums));

    }
    static int findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct_index = nums[i]-1;
            if(nums[i] != nums[correct_index]){
                swap(nums,i,correct_index);
            }
            else{
                i++;
            }
        }
        for(int index =0 ; index<nums.length; index++){
            if(nums[index] != index+1){
                return index + 1 ;
            }

        }
        return nums.length ;
        
    }
    static void swap(int[] nums, int first, int sec){
        int temp = 0;
        temp = nums[first];
        nums[first] = nums[sec];
        nums[sec] = temp ;
        
    }
}
