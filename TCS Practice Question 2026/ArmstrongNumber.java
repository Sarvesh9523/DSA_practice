import java.util.*;

public class ArmstrongNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number: ");
        int num = sc.nextInt() ;

        System.out.println(armstrong(num));
    }
    
    static boolean armstrong (int num){
        int originalNum = num ;
        int sum = 0;
        while(num != 0){
            int digit = num%10 ;
            int cube = digit*digit*digit ;
            sum += cube ;
            num = num/10 ;
        }

        return sum == originalNum ;      


    }
}
