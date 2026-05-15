import java.util.*;

public class find_ODD_occurance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 2, 3, 4, 1, 1, 1 };
        
        System.out.println(findElement(arr));

    }

    static int findElement(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int result = 0 ;
        for(int num : arr){
            result = result^num ;
        }

        return result ;


        

    }

}
