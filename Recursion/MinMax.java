import java.util.Arrays;

public class MinMax {
    public static void main(String[] args){
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int[] result = FindMinMax(arr, 0, arr.length - 1);
        System.out.println("Minimum: " + result[0] + ", Maximum: " + result[1]);
    }
  
    static int[] FindMinMax(int[] arr, int start, int end){
        //Base case 
        if(start == end ){
            return new int[]{arr[start], arr[start]} ;
        }
        // Case for array having only two element
        if(end == start + 1){
            int min = Math.min(arr[start] , arr[end]);
            int max = Math.max(arr[start] , arr[end]);

            return new int[]{min, max};
        }

        int mid = start + (end - start)/2 ;
        int[] leftMinMax = FindMinMax(arr, start, mid) ;
        int[] rightMinMax = FindMinMax(arr, mid + 1, end);

        int min = Math.min(leftMinMax[0], rightMinMax[0]);
        int max = Math.max(leftMinMax[1], rightMinMax[1]);

        return new int[]{min, max};

    }
    
}
