import java.util.*;

public class Longest_Subarray {
    public static void main(String[] args) {
        int k = 14;
        int[] arr = { 2, 5, 1, 7, 10 };
        // System.out.println(solution(arr, k));
        // System.out.println(solution2(arr, k));
        System.out.println(allLongestSubarrays(arr, k));
        // System.out.println(MaximumSumSubarray(arr, k));
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

    // find first maximum subarray where sum <= k
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

    // find all allLongestSubarrays where sum <= k and number of that subarrays
    static List<List<Integer>> allLongestSubarrays(int[] arr, int k){
    
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        List<List<Integer>> result = new ArrayList<>();
        for(int right=0; right < arr.length; right++){
            sum += arr[right] ;
            while(sum > k){
                sum -= arr[left];
                left++;
            }
            int currenLen = right - left + 1 ;
            if(currenLen > maxLen){
                maxLen = currenLen ;
                result.clear() ;
                List<Integer> temp = new ArrayList<>();
                for(int i = left; i<=right; i++){
                    temp.add(arr[i]);

                }
                result.add(temp) ;

            }else if (currenLen == maxLen) {
                List<Integer> temp = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    temp.add(arr[i]);
                }

                result.add(temp);
            }
        }
        System.out.println("Number of all subarrays: " + result.size());
        return result ;
        

    }

    // find LongestSubarrays where maximum sum <= k
    static List<Integer> MaximumSumSubarray(int[] arr, int k){
        int left = 0;
        int sum = 0;
        int maxSum = 0;
        int start = 0;
        int end = 0;
        for(int right = 0; right<arr.length; right++){
            sum += arr[right] ;
            while(sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum > maxSum){
                maxSum = sum ;
                start = left;
                end = right ;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = start; i<=end; i++){
            ans.add(arr[i]);
        }
        return ans ;
    }

}
