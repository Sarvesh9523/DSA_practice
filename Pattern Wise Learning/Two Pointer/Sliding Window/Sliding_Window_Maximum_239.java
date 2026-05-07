/*

You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

*/

import java.util.*;

public class Sliding_Window_Maximum_239 {
    //brute force approach
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] maxArr = new int[n - k + 1] ;
        for(int i=0; i<=n-k; i++){
            int max = nums[i];
            for(int j=i; j < k + i ; j++){
                max = Math.max(max, nums[j]);
            }
            maxArr[i] = max ;
            
        }
        return maxArr ;
        
    }

    //Optimal Approach (Revise it as much as i can)
    public int[] maxSlidingWindow2(int[] nums, int k) {

        int n = nums.length;

        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        int idx = 0;

        for (int i = 0; i < n; i++) {

            // remove out of window elements
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // maintain decreasing order
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // window formed
            if (i >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }

    
}
