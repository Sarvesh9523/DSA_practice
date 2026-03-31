import java.util.*;

public class maxFreqCount {
    public static void main(String[] args){
         int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 2} ;
        System.out.println(freqcount(arr)) ;

    }

    static int freqcount(int[] arr){
        int maxFreq = 0;
        int result = -1;
        for(int i : arr){
            int count = 0;
            for(int j : arr){
                if(i == j){
                    count++ ;
                }
            }
            if(count > maxFreq){
                maxFreq = count ;
                result = i;
            }
        }
        return result ;
    }
    
}
