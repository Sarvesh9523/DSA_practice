public class CheckPrimeNumber{
    public static void main(String[] args){
        int n = 1483 ;
        boolean isPrime = checkprime(n) ;
        if(isPrime){
            System.out.println(n + " is a prime number");

        }else{
            System.out.println(n + " is not a prime number");
        }
    }
    static boolean checkprime(int n){
        int count = 0 ;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                count++ ;
                if(i != n/i){
                    count++ ;
                }
            }
        }
        if(count == 2){
            return true ;
        }else{
            return false ;
        }

    }
}