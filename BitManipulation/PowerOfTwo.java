public class PowerOfTwo{
    public static void main(String[] args){
        int n = 4 ;
        if((n & (n-1)) != 0){
            System.out.println("No") ;
        }
        else{
            System.out.println("Yes") ;
        }
    }


}
/*The formula for find whether the given number is power of 2 or not is == {(n & (n-1)) == 0} 
if the given condition is true then the given number will be power of 2. */ 