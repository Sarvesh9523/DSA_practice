import java.util.Scanner ;
public class main{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);   // integer is small than the float values that's why the automatic conversion is not perform, if input value is integer then it will convert into float value automatically because float>integer .

        // int n = (int)(56.90f); // here the float value is converted into integer value because of the type casting .
        // System.out.println(n);  

        int a = 257 ;
        byte b = (byte)(a) ;// here the integer value is converted into byte value because of the type
        System.out.println(b); // it will print the remender value of 257 % 256 which is 1 because the maximum value of byte is 256. if we change the value of a to 256 then it will return 0 .

        // just like flaot and integer we can typecast automatically byte into integer because byte<integer .
        // let's see the exmaple 

        byte b = 50 ;
        b = b*2 ; // it will give error because the part (b*2) is integer then how we can assign b as a byte it's not right   .
    }
}