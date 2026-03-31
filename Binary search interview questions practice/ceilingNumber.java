/*
 * Q. Find the ceiling number form the given array [1, 2, 3, 4, 5, 10, 12, 14, 15, 17, 18], and the target element is 12 /
 * Approach: what is ceiling number-> ceiling number is smallest element which is grater than or equal to the given number .
 *  So we can use binary search to find the ceiling number. If the given number is equal to 12 because it's sorted array .
 *  So the answer is 12 . And one thing given element can be out of the given array also .
 * Example :-
 * if given element is 12 then ceiling number is 12 
 * But if given element is 13 which is not in the given array then answer will be 14 .
 */

/*
 public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 12, 14, 15, 17, 18};
        int num = 16;
        int ceiling = findCeiling(arr, num);
        System.out.println("Ceiling of " + num + " is: " + ceiling);
    }

    // Make findCeiling static since we're calling it from a static method (main)
    public static int findCeiling(int[] arr, int target) {
        int ceiling = -1; // If no ceiling is found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                ceiling = arr[i];
                break; // We found the smallest number greater than or equal to target
            }
        }
        return ceiling;
    }
}

 */


 // I am going to perform this task from Binary search algorithm 
     

public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10, 12, 14, 15, 17, 18};
        int num = 4;
        int ceiling = findCeiling(arr, num);
        System.out.println("Ceiling of " + num + " is: " + ceiling);
    }

    // Method to find the ceiling of a number in the array
    public static int findCeiling(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        // If the number is greater than the last element, there is no ceiling
        if (num > arr[end]) {
            return -1; // No ceiling exists
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] == num) {
                return arr[mid];
            }
        
            else if (arr[mid] < num) {
                start = mid + 1;
            }
            
            else {
                end = mid - 1;
            }
        }

        // At the end of the loop, start will point to the smallest element greater than num
        return arr[start];
    }
}
