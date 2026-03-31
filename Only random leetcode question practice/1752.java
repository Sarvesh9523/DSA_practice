class Solution {
    public boolean check(int[] nums) {
        int countBreaks = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
            if (countBreaks > 1) {
                return false;
            }
        }
        return true;
        
    }
}
/*If the array has one or zero breaks, it is either sorted or rotated sorted.
If it has more than one break, it is not a rotated sorted array. */