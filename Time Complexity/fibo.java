public class fibo{
    public static void main(String[] args){
        int n = 5;
        System.out.println("Fibonacci number of " + n + "th index is : " + FIBO(n));
        
        System.out.println("----------------------------") ;
        System.out.println("These are the fibonacci number till " + n + "th index");
        for(int i=0; i<=n; i++){
            System.out.println(FIBO(i)) ;
        }

    }
    static int FIBO(int n){
        return(int)(Math.pow(((1 + Math.sqrt(5)) / 2) , n) / Math.sqrt(5)) ;
    }
}

// So this is how we can calculate any number of fibonacci by using homogenous lenear recurrences time complexity.