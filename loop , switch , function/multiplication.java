import java.util.Scanner ;
public class multiplication {
    public static void main(String[] args){
        multiplication() ;

    }
    static void multiplication(){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number : ");
        int a = sc.nextInt() ;
        System.out.println("The Multiplication table for" + " " + a + " "+"is : ");
        for(int i=1; i<=10 ; i++){
            System.out.println(a + " " +"X" +" " + i + " " +"=" + " " +a*i);
        }
    }
    
}
