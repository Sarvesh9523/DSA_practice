import java.util.ArrayList;
import java.util.List;

public class prob_448 {
    
}
public List<Integer> findDisappearedNumbers(int[] nums){
    int i=0 ;
    while(i < nums.length){
        int correct_index = nums[i]-1 ;
        if(nums[i] != nums[correct_index]){
            swap(nums, i, correct_index);
        }else{
            i++ ;
        }
    }
    // now find the all missing numbers 
    List<Integer> ans = new ArrayList<>() ;
    for(int index=0; index<nums.length; index++){
        if(nums[index] != index+1){
            ans.add(index + 1) ;
        }

    }
    return ans ;
}


static void swap(int[] arr, int first, int second){
    int temp = arr[first] ;
    arr[first] = arr[second];
    arr[second] = temp ;

}
