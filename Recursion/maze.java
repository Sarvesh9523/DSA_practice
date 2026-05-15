import java.util.*;

public class maze {
    public static void main(String[] args) {
        // System.out.println(countPath(3, 3));
        // totalPath("", 3, 3);
        System.out.println(totalPathList2("", 3, 3));

    }
    static int countPath(int r , int c){
    if(r == 1 || c == 1){
    return 1 ;

    }
    int left = countPath(r-1, c);
    int right = countPath(r, c-1);

    return left + right ;

    }

    // now print the total path where pointer moves only in right and down direction
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

    //Print all path using Arraylist where pointer moves only in right and down direction
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

    //Print all path using Arraylist where pointer moves only in right, down, diagonal direction
    static ArrayList<String> totalPathList2(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> paths = new ArrayList<>();
            paths.add(p) ;
            return paths ;
        }
        ArrayList<String> paths = new ArrayList<>();
        if(r > 1){
            paths.addAll(totalPathList2(p + "V", r - 1, c)); // V--> vertically down only
        }
        if(r>1 && c>1){
            paths.addAll(totalPathList2(p + "D", r-1, c-1)); // D--> diagonal
        }
        if(c>1){
            paths.addAll(totalPathList2(p + "H", r, c-1)); //H--> horizontally right only
        }

        return paths ;
    }


}
