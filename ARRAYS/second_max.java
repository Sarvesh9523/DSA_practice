public class second_max{
    public static void main(String[] args){
        int[] arr = {23, 45, 12, 63, 54, 13} ;
        int ans = find_second_largest(arr);
        System.out.println(ans);

        
    }
    static int find_second_largest(int[] arr){
        int first = arr[0] ;
        int second = -1 ;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > first){
                second = first ;
                first = arr[i] ;
            }else if(arr[i] > second && arr[i] != first){
                second = arr[i] ;
            }
        }
        return second ;
        
    }
}