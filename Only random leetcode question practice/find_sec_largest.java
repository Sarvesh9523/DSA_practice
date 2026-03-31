public class find_sec_largest {
    public static void main(String[] args){
        int[] arr = {1,2,34,3,4,5,33} ;
        secondlargest(arr);
        System.out.println(secondlargest(arr));

    }
    static int secondlargest(int[]arr){
        int max = arr[0] ;
        int smax = -1 ;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i] ;                
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j] > smax && arr[j] != max){
                smax = arr[j] ;
            }
        }
        return smax ;
    }
    
    
}
