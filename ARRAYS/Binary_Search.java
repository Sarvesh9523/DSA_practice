public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;
        int start = 0;  
        int end = arr.length - 1;
        int ans = search(arr, target, start, end);
        if (ans == -1) {
            System.out.println("Element doesn't exist in the array");
        } else {
            System.out.println("Element found at index: " + ans);
        }

    }

    static int search(int[] arr, int target, int start, int end) {
        
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] == target) {
                return mid;  
            }
        }
        
        return -1;
    }
}
