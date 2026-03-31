/*
 * Q. Find the target element from the array of infinite length.
 */
public class Infinite_array {
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170} ;
        int target = 10 ;
        System.out.println(ans(arr, target));

    }
    // funtion to find the main answer 
    public static int ans(int[] arr, int target){
        int start =0; // initializing the start index 
        int end = 1; // initializinf the end index .

        /*condition to itereate over the array to shift the start and end index by 2 times of each check like firstly we heve start at 0 and end at 1 
        but if we don't find the target element between start and end then move forward and then start will be end+1 and end will be the end + size of the array box * 2 
        */
        while(target > arr[end]){
            int newStart = end + 1 ;
            end = end + (end - start + 1) * 2 ;  // size of the array box is (end-start + 1)  and multiply it by 2 to move end index forward by 2 times of previous index .
            start = newStart ; // then update the start with newStart .
        
        }
        return Binary_search(arr, target, start, end) ;
    }
    public static int Binary_search(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid ;
            }        
            else if (arr[mid] < target) {
                start = mid + 1;
            }            
            else {
                end = mid - 1;
            }        
        }
        return -1 ;
    }    
}
