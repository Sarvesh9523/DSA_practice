// Input of string as an array 

import java.util.Scanner ;
import java.util.Arrays ;
public class Array_Input_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int size = in.nextInt() ;
        in.nextLine() ;
        String[] str = new String[size] ;

        for(int i =0; i<str.length; i++){
            System.out.print("Enter the element at index " + i + " : ");
            str[i] = in.nextLine() ; 
        }
        System.out.print(Arrays.toString(str));
    }

    
    
}
