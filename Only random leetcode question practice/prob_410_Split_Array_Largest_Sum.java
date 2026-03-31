public class prob_410_Split_Array_Largest_Sum{
    public static void main (String[] args){
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr, k));

    }
    public static int splitArray(int[] nums, int k){
        int start =0 ;
        int end = 0 ;
        for(int i=0; i<nums.length ; i++){
            start = Math.max(start, nums[i]) ; // maximum element in the array where minimum k=1 and maximum k = number of elements in the array 
            end += nums[i] ; // it is maximum sum of the element in the array 
        }

        while(start < end){
            int mid = start + (end - start)/2 ; // maximum sum that can happen with the number of element of subarray where the number of subarray should be <= k.
            int sum = 0 ;
            int subarray = 1 ; // initializes the number of subarray with 1 because minimum it can be only 1 
            for(int num : nums){
                if(sum + num > mid){
                    // when if condition is true it means we have to make another new subarray array to make sum + num < mid and sum will going to be next element from the nums array 
                    sum = num ;
                    subarray++ ;
                }else{
                    sum += num ;
                }
            }
            if(subarray > k){
                start = mid + 1 ;
            }else{
                end = mid;
            }
        }

        return end ;

    }

}