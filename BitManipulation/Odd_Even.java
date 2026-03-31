public class Odd_Even{
    public static void main(String[] args){
        int n = 67 ;
        System.out.println(OddCheck(n)) ;
    }
    static boolean OddCheck(int n){
        if((n & 1) == 1){  // this is the condition for beign odd in binary number because if last number is in binary is 1 then it is odd number .
            System.out.println("The number is ODD") ;
            return true ;
        }
        else{
            System.out.println("The number is EVEN") ;
            return false ;
        }
    }
}