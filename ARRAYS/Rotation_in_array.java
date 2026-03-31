// Q.This program rotate the array k times .
public class Rotation_in_array{
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return; // Avoid errors for empty or single-element arrays

        k = k % nums.length; // Ensure k is within bounds
        
        if (k == 0) return; // No need to rotate if k is 0

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
