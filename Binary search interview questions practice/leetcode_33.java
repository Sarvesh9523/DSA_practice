public class leetcode_33 {
    public static void main(String[] args){

    }
    static int search(int[] nums, int target){
        int pivot = findpivot(nums) ;
        // if did not find the pivot it means array is not rotated .
        if(pivot == -1){
            // just do normal binary search  
            return BS(nums, target, 0, nums.length-1) ;        

        }
        // if pivot is found, you have two ascending sorted arrays 
        if(nums[pivot]==target){
            return pivot ;
        }
        if(target >= nums[0]){
            return BS(nums, target, 0, pivot-1) ;
        }
        return BS(nums, target, pivot+1, nums.length-1) ;
        

    }
    static int BS(int[] arr , int target, int start, int end){
        while(start<= end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] < target){
                start = mid + 1 ;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid ;
            }
        }
        return -1 ;
    }
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            // Check if mid is the pivot point
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
    
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
    
            // Now check which part of the array to search in
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  // No pivot found, array is not rotated
    }
    
    
    
}
