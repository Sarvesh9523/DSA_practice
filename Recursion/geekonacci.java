import java.util.Scanner;

public class geekonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int T = sc.nextInt() ;
        while(T > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(findGeekonacci(a, b, c, n));

        }
        sc.close();       
        
    }
    static int findGeekonacci(int a, int b, int c, int n){
        if(n == 1) return a ;
        if(n == 2) return b ;
        if(n == 3) return c ;
        
        int first = a, second = b, third = c ;
        int result =0 ;
        for(int i = 4; i <= n; i++){
            result = first + second + third ;
            first = second ;
            second = third ;
            third = result ;
        }
        return result ;
    }
}