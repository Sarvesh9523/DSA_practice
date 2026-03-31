import java.util.Arrays ;
public class movezero {
    public static void main (String[] args){
        int[] arr = {0, 1, 0, 2, 3} ;
        System.out.println(Arrays.toString(Movezero(arr)));
    }
    static int[] Movezero(int[] arr){
        int j = 0 ;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                j++ ;
            }
        }
        return arr;
    }

    
}
