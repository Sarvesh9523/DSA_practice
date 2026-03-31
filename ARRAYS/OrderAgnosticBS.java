/*This method is used for both ascending and descending order sorted array . */

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int start = 0;  
        int end = arr.length - 1;
        int ans = orderAgnosticBS( arr, target, start, end);
        if (ans == -1) {
            System.out.println("Element doesn't exist in the array");
        } else {
            System.out.println("Element found at index: " + ans);
        }

    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end] ;
        
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            
            }
            else if(isAsc){
                if(arr[mid] > target){
                    end = mid -1 ;
                }else{
                    start = mid + 1;
                }

            }else{
                if(arr[mid] < target){
                    start = mid + 1 ;
                }else{
                    end = mid - 1 ;
                }
            }
        }
        
        return -1;
    }
}
