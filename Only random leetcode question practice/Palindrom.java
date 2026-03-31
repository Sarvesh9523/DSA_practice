import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: " );
        int num = in.nextInt() ;
        int r , sum =0 , temp ;
        temp = num ;
        while(num != 0){
            r = num % 10 ;
            sum = sum * 10 + r ;
            num = num/10 ;
        }
        if(temp == sum){
            System.out.println("The number is palindrome");

        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
    
}
