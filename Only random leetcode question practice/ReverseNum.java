import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in) ;
        System.out.print("Enter the number: ");
        int num = in.nextInt() ;
        int ans = reverse(num); // calling the reverse function .
        System.out.println("Reversed number is: "+ ans);
    }
    static int reverse(int num){
        int reverse = 0;

        while(num != 0){
            
            int digit = num%10 ; // get the last digits .
            reverse = reverse*10 + digit ; // align the digits in reverse form.
            num = num/10 ; // remove the last digit .           

        }
        return reverse ; // return the reverse 
    }

    
}
