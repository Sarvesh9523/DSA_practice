class Solution {
    static int largestElement(int[] arr) {
        int max = arr[0]; // Initialize max with the first element of the array
        for(int i = 1; i < arr.length; i++) { // Start from the second element
            if(arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
        }
        return max; // Return the largest element
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15};
        System.out.println("The largest element in the array is: " + largestElement(arr));
    }
}
