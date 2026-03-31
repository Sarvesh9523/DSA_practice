import java.util.Arrays ;
public class Mix_VarArgs {
    public static void main (String [] args){
        function(1, 2, "sarvesh", "Rahul");

    }
    static void function(int a, int b,  String...v){ // variable length argument always declare as the last argument because its length in not defined .
        System.out.println(Arrays.toString(v)); /* this syntax is only use to print variable length argument because its only read the String Data type 
                                                    to print all the argument which have been passed, the first step could be change the all argument data 
                                                    type to String data type and then print them.*/

    }
    
}
