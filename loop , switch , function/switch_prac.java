import java.util.Scanner ;
public class switch_prac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine() ;

        // This is common old switch-case-default 
        switch(fruit){
            case "apple":
            System.out.println("The fresh fruit");
            break;

            case "mango":
            System.out.println("The sweet fruit");
            break;

            case "orange" :
            System.out.println("The juicy fruit");
            break ;

            default :
            System.out.println("Invalid fruit");
        }


        // This the enhanced version of switch-case-default in this switch methode there should not break statement .
        switch (fruit) {
            case "mango" -> System.out.println("The fresh fruit");
            case "apple" -> System.out.println("The crunchy fruit");
            case "orange" -> System.out.println("The citrus fruit");
            default -> System.out.println("Please enter the fruit not anything else ");

        


        }



    }
}
