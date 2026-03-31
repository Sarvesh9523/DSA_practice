public class Product_of_Digit {
    public static void main(String[] args){
        int n = 2;
        System.out.println(FindProduct(n));
    }
    static int FindProduct(int n){
        if(n == 0){
            return 1;
        }
        if(n<10){   // this condition is used for the handling the digits when it n is come to 0 in ricursion calls  ;
            return n ;
        }
        else{
            return ((n%10) * FindProduct(n/10)) ;
        }
    }
    
}
