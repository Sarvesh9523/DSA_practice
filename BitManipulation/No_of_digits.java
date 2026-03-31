public class No_of_digits{
    public static void main(String[] args){
        int n = 1298656738 ;
        int base = 10 ;
        int ans = (int)(Math.log(n)/Math.log(base)) + 1 ;
        System.out.println(ans) ;

    }
    /*The formula for finding the number of digits is (int)(Math.log(n)/Math.log(base)) + 1
     * where n is the given number 
     * where base is the base according to question .
     */
}