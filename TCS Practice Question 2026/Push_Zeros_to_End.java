import java.util.Arrays;

public class Push_Zeros_to_End {
    public static void main(String[] args){
        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0} ;
        push(arr);
        System.out.println(Arrays.toString(arr));                

    }

    static void push(int[] arr){       
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                swap(arr, i, j);
                j++ ;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }

    
    
}
