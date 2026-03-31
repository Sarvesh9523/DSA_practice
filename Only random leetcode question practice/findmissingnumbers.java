public class findmissingnumbers {
    public static void main (String[] args){
        int[] arr = {1, 2, 4, 5, 6} ;
        System.out.println(missingvalue(arr, 6));
        
    }
    static int missingvalue(int[] arr, int n){ // here n is the last number of array 
        int total = n*(n+1)/2 ;
        int sum = 0;
        for(int num:arr){
            sum += num ;
        }
        return total-sum ;
        
    }
}
