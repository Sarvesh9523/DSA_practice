import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;

public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 2, 3, };
        int k = 4;
        // System.out.println(find2(arr, k));
        // findNumberOfDistinctElementOfEveryWindowElemnt(arr, k);
        maximumOfEveryWindow(arr, k);
    }

    // Q. Given an array of N integers and a number K, find the maximum sum of any K
    // consecutive elements.

    // Input: 6 3
    // 2 1 5 1 3 2
    // Output: 9

    static int find(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;

    }
    /*
     * A quality inspector checks N product weights. Find the minimum total weight
     * of any K consecutive products.
     * 
     * Input: 5 2
     * 3 1 4 1 5
     * Output: 2
     */

    static int find2(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int minSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            minSum = Math.min(minSum, windowSum);
        }

        return minSum;
    }

    /*
     * Count distinct elements in every window of size K
     * Given an array of N integers and window size K, print the count of distinct
     * elements in every window of size K.
     * 
     * Input: 7 4
     * 1 2 1 3 4 2 3
     * Output: 3 4 4 3
     */

    static void findNumberOfDistinctElementOfEveryWindowElemnt(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        System.out.print(map.size() + " ");

        for (int i = k; i < arr.length; i++) {
            int out = arr[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

            int in = arr[i];
            map.put(in, map.getOrDefault(in, 0) + 1);
            System.out.print(map.size() + " ");
        }
    }

    /*
     * Given an array of integers (positive and negative) and window size K, print
     * the first negative number in every window. If no negative, print 0.
     * 
     * Input: 5 3
     * -8 2 3 -6 10
     * Output: -8 -6 -6
     */

    static int[] firstNegative(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        int j = 0;

        for (int i = 0; i < n; i++) {

            // add negative element index
            if (arr[i] < 0) {
                dq.addLast(i);
            }

            // remove out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // window formed
            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    result[j++] = arr[dq.peekFirst()];
                } else {
                    result[j++] = 0;
                }
            }
        }

        return result;

    }

    // same question without deque
    static int[] firstNegative2(int[] arr, int k) {
        int[] result = new int[arr.length - k + 1]; 
        int idx = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            int firstNeg = 0;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    firstNeg = arr[j]; // store VALUE directly
                    break; 
                }
            }
            result[idx++] = firstNeg; 
        }
        return result;
    }

    // Smallest subarray with sum >= S (Variable Window)
    /*
     * Given an array of N positive integers and a target S, find the length of the
     * SMALLEST contiguous subarray whose sum is greater than or equal to S. If
     * none, return 0.
     * 
     * Input: 6 7
     * 2 3 1 2 4 3
     * Output: 2 (subarray [4,3])
     */
    static int smallest(int[] arr, int s) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= s) {
                minLen = Math.min(minLen, right - left + 1);
                int out = arr[left];
                left++;
                sum = sum - out;
            }

        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    /*
     * Given an array of N integers and window size K, print the maximum element of
     * every window of size K.
     * 
     * Input: 8 3
     * 1 3 -1 -3 5 3 6 7
     * Output: 3 3 5 5 6 7
     */

    static void maximumOfEveryWindow(int[] arr, int k) {
        for (int i = 0; i < arr.length - k; i++) { // this will decide the number of iteration to reach the last element
            int windowmax = arr[i];
            for (int j = i; j < i + k; j++) { // this loop decide the window length
                if (arr[j] > windowmax) {
                    windowmax = arr[j];
                }

            }
            System.out.println(windowmax + " ");

        }

    }

}
