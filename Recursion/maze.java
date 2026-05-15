import java.util.*;

public class maze {
    public static void main(String[] args) {
        System.out.println(countPath(3, 3));
        // totalPath("", 3, 3);
        System.out.println(totalPathList("", 3, 3));

    }
    static int countPath(int r , int c){
    if(r == 1 || c == 1){
    return 1 ;

    }
    int left = countPath(r-1, c);
    int right = countPath(r, c-1);

    return left + right ;

    }

    // now print the total path
    static void totalPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            totalPath(p + "D", r - 1, c);
        }
        if (c > 1) {
            totalPath(p + "R", r, c - 1);
        }

    }

    //Print all path using Arraylist
    static ArrayList<String> totalPathList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> paths = new ArrayList<>();
            paths.add(p) ;
            return paths ;
        }
        ArrayList<String> paths = new ArrayList<>();
        if(r > 1){
            paths.addAll(totalPathList(p + "D", r - 1, c));
        }
        if(c>1){
            paths.addAll(totalPathList(p + "R", r, c-1));
        }

        return paths ;



    }

}
