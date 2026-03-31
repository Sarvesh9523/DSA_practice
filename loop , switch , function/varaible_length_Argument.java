import java.util.Arrays ;
public class varaible_length_Argument {  // Variable length arguments basically is used for variable length of argument that will passed when function will be called. It can be of any length .
    public static void main (String[] args){
        fun(1, 2, 3, 4);

    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v)) ;
    }
    
}
