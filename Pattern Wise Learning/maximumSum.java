/*The approach is to solve this problem using Two Pointer method for fixed window size of k */

public class maximumSum {
    public static void main(String[] args) {
        int k = 4;
        int[] arr = { -1, 2, 3, 4, 5, -1 };
        System.out.println(maxSum(k, arr));
    }

    static int maxSum(int k, int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = k - 1; // window size with left and right pointer to find maximum sum of between
                       // elements

        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        int maxsum = sum;

        for (int i = k; i < n; i++) {
            sum += arr[i]; // add next element
            sum -= arr[i - k]; // remove left element
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }

}
