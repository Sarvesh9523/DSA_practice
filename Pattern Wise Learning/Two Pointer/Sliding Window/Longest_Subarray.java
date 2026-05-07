import java.util.*;

public class Longest_Subarray {
    public static void main(String[] args) {
        int k = 14;
        int[] arr = { 2, 5, 1, 7, 10 };
        System.out.println(solution(arr, k));
    }

    // find maximum length of array where sum <= k
    static int solution(int[] arr, int k) {
        int sum = 0;
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // find maximum subarray where sum <= k
    static List<Integer> solution2(int[] arr, int k) {
        int sum = 0;
        int left = 0;
        int maxLen = 0;
        int start = 0;
        int end = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
                end = right;
            }

        }

        List<Integer> ans = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }

}
