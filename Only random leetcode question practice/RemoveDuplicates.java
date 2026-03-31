import java.util.Arrays;           // REVISE IT DAILY .

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Given sorted array with duplicates
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 7};

        // Step 1: Call the method to remove duplicates
        int newLength = removeDuplicates(arr);

        // Step 2: Display the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to remove duplicates from the array
    public static int removeDuplicates(int[] arr) {
        // Base case: if array is empty or has 1 element, no duplicates
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        // Variable to keep track of the unique elements index
        int j = 0;

        // Step 3: Iterate over the array
        for (int i = 0; i < arr.length - 1; i++) {
            // If current element is not equal to the next element, store it
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        // Store the last element (because it is always unique after the loop)
        arr[j++] = arr[arr.length - 1];

        // Return the new length of the array without duplicates
        return j;
    }
}
