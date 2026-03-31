import java.util.*;

public class prob_4_Median_of_Two_Sorted_Arrays {
    public static void main (String[] args){
        
    }
    // This one is the brute force apprached but we have to solved it using binary search 
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0 ;
        int n1 = nums1.length ;
        int j = 0;
        int n2 = nums2.length ;
        ArrayList<Integer> nums3 = new ArrayList<>() ;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                nums3.add(nums1[i++]) ;
            }else{
                nums3.add(nums2[j++]);
            }
        }
        while(i < n1){
            nums3.add(nums1[i++]);
        }
        while(j < n2){
            nums3.add(nums2[j++]);
        }

        int n3 = nums3.size() ;
        if(n3 % 2 == 1){
            return nums3.get(n3/2);  // for odd length of sorted array .
        }else{
            return (nums3.get(n3/2) + nums3.get(n3 / 2 - 1)) / 2.0 ;  // for even length
        }
        
    }
    
}
