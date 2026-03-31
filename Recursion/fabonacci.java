public class fabonacci{
    public static void main(String[] args){
        System.out.println(fabo(50));
        print(1) ;

    }
    static int fabo(int n){
        if(n < 2){
            return n ;
        }
        return fabo(n - 1) + fabo(n - 2) ; // here function is recursivly call the function fabo two times, (This is not tail recursion) .
        // when function call it self with in the function then it's called recusion . 
        // when only one function is return then it's called tail recursion . In Fabo function this is not a tail recursion .
    }

    // This is the another example of recursion 

    static void print(int n){
        if(n == 5){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        print(n + 1 ) ; // This is the tail recursion . 
    }
}