public class leetcode_410 {
    public static void main(String[] args) {
        
    }
    static int splitArray(int[] nums, int k){
        int start = 0;
        int end = 0;
        
        // Finding start and end values
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // max element
            end += nums[i]; // sum of all elements
        }

        // Binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Calculate the number of pieces
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // Start a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            // Adjust search range based on the number of pieces
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start; // or return end, since start == end at this point
    }
    
}
