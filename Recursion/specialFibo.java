import java.util.*;

public class specialFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();

                if(a % 3 == 0){
                    System.out.println(a);
                }
                if(a % 3 == 1){
                    System.out.println(b);
                }else{
                    System.out.println(a ^ b);
                }
            }else{
                System.out.println("nothing is found");
            }

        }
        sc.close() ;

    }
}
