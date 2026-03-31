public class FindUnique{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 3, 2, 4, 1, 5, 5} ;
        System.out.println(Check(arr)) ;

    }
    static int Check(int[] arr){
        int unique = 0 ;
        for(int n : arr){
            unique ^= n ;
        }
        return unique ;
    }
}