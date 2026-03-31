import java.util.Scanner ;
import java.util.ArrayList ;
public class ArrayList_Input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(3); // syntax for ArrayList .

        for(int i=0; i<5; i++){
            System.out.print("Enter a number at" +" "+ i +" "+ "index " + ":");
            list.add(in.nextInt());
        }
        System.out.println(list);

    }
    
}
