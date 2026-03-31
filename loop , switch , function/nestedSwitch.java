import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your empID: ");
        int empID = in.nextInt();

        System.out.print("Enter your dep: ");        
        String dep = in.next();

        // switch (empID) {
        //     case 1:
        //         System.out.println("Sarvesh");
        //         break;

        //     case 2:
        //         System.out.println("Ankit");
        //         break;

        //     case 3:
        //         switch (dep) {
        //             case "IT":
        //                 System.out.println("IT Department");
        //                 break;

        //             case "CSE":
        //                 System.out.println("CSE Department");
        //                 break;

        //             default:
        //                 System.out.println("Invalid Department");

        //         }
        // }

        switch(dep){
            case "CSE" -> {
                switch(empID){
                    case 1-> System.out.print("Name - Sarvesh");
                    case 2-> System.out.print("Name - Ankit");
                }
            }
            case "IT" -> {
                switch(empID){
                    case 1-> System.out.print("Name - Mohit");
                    case 2-> System.out.print("Name - Ananya");
                }
            }
            case "Managment" -> {
                switch(empID){
                    case 1-> System.out.print("Name - Rana");
                    case 2-> System.out.print("Name - Aparna");
                }
            }
        }
    
    }
}

