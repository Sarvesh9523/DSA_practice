public class Sum_Of_Digit {
    public static void main(String[] args){
        int n = 12345 ;
        System.out.println(FindSum(n));

    }
    static int FindSum(int n){
        if(n == 0){
            return 0 ;
        }else{
            return (n%10 + FindSum(n/10)) ;
        }
    }
    
}
