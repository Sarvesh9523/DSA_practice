// Q. Print ALL pairs that sum to K. If none, print "No pair found".
//
// Input:  6 6
//         1 5 3 3 2 4
// Output: (1, 5)
//         (3, 3)
//         (2, 4)

import java.util.*;
public class AllPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 5, 3, 3, 2, 4};
        int k = 6 ;

        findAllPairs(arr, k);
    }

    static void findAllPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false ;
        int count = 0 ;

        for(int e : arr){
            int complement = k-e ;
            if(map.getOrDefault(complement, 0) > 0){
                count++;
                System.out.println(count + " -- (" + complement + ", " + e + ")");
                map.put(complement, map.get(complement)-1) ;                
                found = true ;
            }else{
                map.put(e, map.getOrDefault(e, 0)+1 );
            }
        }
        if(!found) System.out.println("Not found");
    }

    //if we want to solve same problem with two pointer then firstly we have to sort the array 

    static void findAllPairs2(int[] arr, int k){
        Arrays.sort(arr) ;
        int left = 0 ;
        int right = arr.length-1 ;
        boolean found = false ;
        int count = 0 ; // just to count how many pairs are there .

        while(left < right){
            int sum = arr[left] + arr[right] ;
            if(sum == k){
                count++ ;
                System.out.println( count +" pair found"+ "( " + arr[left] + "," + arr[right] + " )");
                found = true ;
                left++;
                right--;
            }else if(sum < k){
                left++;
            }else{
                right--;
            }
        }
        if(!found) System.out.println("No pair found");


    }
}