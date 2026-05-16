import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllPathWithBacktrack {
    public static void main(String[] args) {
        boolean[][] maze ={
            {true, true, true},
            {true, true, true},
            {true, true, true}

        }; 

        int[][] path = new int[maze.length][maze[0].length];
        System.out.println(allPath("", maze, 0, 0));
        AllpathPrint("", maze, 0,0, path, 1);
        
    }
    static ArrayList<String> allPath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            ArrayList<String> paths = new ArrayList<>();
            paths.add(p) ;
            return paths ;
        }
        if(!maze[r][c]){
            return new ArrayList<>() ;
        }
        maze[r][c] = false ;  // it consider when maze[r][c] = false means that path(block of maze) is already visited.
        ArrayList<String> paths = new ArrayList<>();

        if(r < maze.length-1){
            paths.addAll(allPath(p + 'D', maze, r+1, c));
        }
        if(c < maze[0].length-1){
            paths.addAll(allPath(p+'R', maze, r, c+1));
        }
        if(r > 0 ){
            paths.addAll(allPath(p+'U', maze, r-1, c));
        }
        if(c > 0 ){
            paths.addAll(allPath(p+'L', maze, r, c-1));
        }

        //now for backtracking we have to made out visited block true for revisiting for another path 
        maze[r][c] = true ;
        return paths ;
    }


    //Now this function print the all path direction as well 
    static void AllpathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step ;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();  // this print the next line for clean look.
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false ;
        path[r][c] = step ;


        if(r < maze.length-1){
            AllpathPrint(p + 'D', maze, r+1, c, path, step + 1);
        }
        if(c < maze[0].length-1){
            AllpathPrint(p + 'R', maze, r, c+1, path, step + 1);
        }
        if(r > 0){
            AllpathPrint(p + 'U',maze, r-1, c, path, step + 1);
        } 
        if(c > 0){
            AllpathPrint(p + 'L',maze, r, c-1, path, step + 1);
        }


        maze[r][c] = true ;
        path[r][c] = 0 ;
    }
    
}
