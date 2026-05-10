import java.util.*;

public class righAngle {
    public static void main(String[] args) {
        ReverseTriangle(4, 0);
        Triangle(4, 0);
        
    }

    static void ReverseTriangle(int r, int c){
        if(r == 0) return ;
        if(c < r){
            System.out.print("*");
            ReverseTriangle(r, c+1);

        }else{
            System.out.println();
            ReverseTriangle(r-1, 0);
        }
    }

    static void Triangle(int r, int c){
        if(r == 0) return ;
        if(c < r){
            Triangle(r, c+1);
            System.out.print("*");

        }else{
            Triangle(r-1, 0);
            System.out.println();
        }
    }
    
}
