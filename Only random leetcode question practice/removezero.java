import java.util.Arrays;

public class removezero {
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 2, 3};
        int[] result = RemoveZero(arr);
        System.out.println(Arrays.toString(result));

    }
    static int[] RemoveZero(int[] arr){
        int count = 0 ;  // here count is initiated to count the number of non zero element of the given array .
        for(int num : arr){
            if(num != 0){
                count++ ;
            }
        }

        int[] result = new int[count] ;
        int index = 0 ;  // here index is used to keep tracking the non zero element of the array where to place .
        for(int num : arr){
            if(num != 0){
                result[index++] = num ;
            }
        }
        return result ;
    }
    
}
