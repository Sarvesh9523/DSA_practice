import java.util.*;
/*
Q. A sage collects gemstones one by one. Each time he collects a new gem, count how many gems so far are MORE radiant (greater) than ALL previously collected gems.

Input: [5, 3, 8, 6, 10]
Output: 3
*/

public class Count_Radiant_Gemstones {
    public static void main (String[] args){
        int[] arr = {5, 3, 8, 6, 10, 15} ;
        System.out.println(find(arr)); 
    }

    static int find(int[] arr){
        int count = 0 ;
        int max = arr[0];  // max should be always the first element of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                count++;
                max = arr[i];   // update max to new highest
            }
        }

        return count ;
    }
}
