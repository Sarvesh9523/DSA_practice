public class floor_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10, 12, 14, 15, 17, 18};
        int num = 4;
        int ceiling = findfloor(arr, num);
        System.out.println("Ceiling of " + num + " is: " + ceiling);
    }

    // Method to find the ceiling of a number in the array
    public static int findfloor(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        // If the number is greater than the last element, there is no floor
        if (num > arr[end]) {
            return -1; // No floor exists
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

        // At the end of the loop, end will point to the greatest element smaller than num
        return arr[end];
    }
    
}
