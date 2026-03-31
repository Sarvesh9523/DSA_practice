public class CheckSorting {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50} ;
        System.out.println(CheckSOrtedArray(arr, 0));
        
    }
    static boolean CheckSOrtedArray(int[] arr, int index){
        if(index == arr.length-1){
            return true ;
        }
        if(arr[index] > arr[index+1]){
            return false ;
        }
        return CheckSOrtedArray(arr, index + 1) ;
        
    }
    
}
