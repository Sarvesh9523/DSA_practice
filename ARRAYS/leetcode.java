/* Q.Find the numbers in given array whose contained the even number of digits . 
 * This is Leetcode problem .*/

public class leetcode {
    public static void main(String[] args){
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {  // Check if the number has an even number of digits
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;  // Return true if number of digits is even
    }

    static int digits(int num) {  // Change return type to int
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;  // Return the count of digits
    }
}
