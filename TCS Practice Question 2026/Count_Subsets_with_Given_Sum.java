import java.util.* ;

/*
Given an array of integers and a target sum S, count all subarrays (contiguous) whose elements sum to S.

Input: arr = [1, 2, 3, 3], S = 6
Output: 2  (subarrays [1,2,3] and [3,3])
*/

public class Count_Subsets_with_Given_Sum {
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 3};
        System.out.println((subset(arr, 6)));

    }

    static int subset(int[] arr, int target){
        int count = 0;
        for(int num=0; num<arr.length; num++){
            int sum = 0;
            for(int j = num; j<arr.length; j++){
                sum += j ;
                if(sum == target){
                    count++ ;
                }
            }
        }
        return count ;
    }
    
}
