import java.util.Scanner;
public class addtion_fn {
    public static void main(String[] args) {
        sum() ; // it i am calling the function which i made for additions .
        
    }
    // Now This method is created for addition and it will be called in main method .
    static void sum(){
        Scanner in = new Scanner(System.in) ;
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter first Second number: ");
        int b = in.nextInt();

        int sum = a+b ;
        System.out.print("Sum of two numbers is: "+sum);


    }
    
}
