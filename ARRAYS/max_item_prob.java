// question1: find the maximum value with in the given array { 1, 23, 45, 36, 72, 94} .
/*public class max_item{
    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 36, 72, 94};
        System.out.println(max(arr));
    }
     static int max(int[] arr){
        int maxval = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i] ;
            }
        }
        return maxval;
     }
}*/

// Question 2:Find the maximum number with in the given range with in array and the range of index is {start from 1st to 3rd index} and the array is { 1, 23, 45, 36, 72, 94}.
public class max_item_prob{
    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 36, 72};
        System.out.println(maxrange(arr, 1, 3));
    }

    static int maxrange(int[] arr, int start, int end){
        int maxval = arr[start];
        for(int i=start; i<end; i++){
            if(arr[i] > maxval){
                maxval = arr[i] ;
            }
        }
        return maxval ;

    }
}