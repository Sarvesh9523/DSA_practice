import java.util.Scanner;
public class TCS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() ;
        System.out.println(find_Perfect_Number(num)) ;

    }
    static boolean find_Perfect_Number(int num){
            if(num == 0) return false ;
            int sum = 0;

            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    sum += i ;
                }

            }
            return sum == num ; // operator == always give the boolean return type

            
        }


}