import java.util.Arrays ;
public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {0,1,2,0,1,2,0,0,1,1,2,2} ;
        System.out.println("Given array is :" + Arrays.toString(arr));
        Sorting(arr) ;
        System.out.println("Now the sorted arrays is : " + Arrays.toString(arr));

    }
    static void Sorting(int[] arr){
        // run the steps n-1 time 
        boolean swapped ; // this variable is used to stop the checking for all element of array when the given array is already sorted .
        for(int i=0; i < arr.length ; i++){  // where i is the number of passes .
            swapped = false ; // when at i=0 swap will not run then it mean array is already sorted so give false 
            // for each step the greatest element goes to the last respective index 
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){  // if this condition true then swap the respetive element 
                    int temp = arr[j] ;
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                    swapped = true ; // when swap is true it mean swap will perform to sorting the array .
                }
                
            }
            if(!swapped){ // this variable is used to stop the checking for all element of array when the given array is already sorted .
                break ;  // if the swap didn't perform then it should break . 
            }
        }
    }
}