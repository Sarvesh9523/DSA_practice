import java.util.*;
public class restrictedMaze {
    public static void main(String[] args) {
        boolean[][] maze ={
            {true, true, true},
            {true, false, true},
            {true, true, true}

        }; 

        path("", maze, 0, 0);
        System.out.println(pathList("", maze, 0, 0));
        
        
    }
    static void path(String p, boolean[][] maze, int r, int c){
        
        if(r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return; 
        }

        if(!maze[r][c]){
            return ;
        }

        if(r < maze.length -1){
            path(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            path(p + 'R', maze, r, c + 1);
        }
    }

    //Print in a list form 
    static ArrayList<String> pathList(String p, boolean[][] maze, int r, int c){
        
        if(r == maze.length - 1 && c == maze[0].length-1){
            ArrayList<String> paths = new ArrayList<>();
            paths.add(p);
            return paths; 
        }

        if(!maze[r][c]){
            return new ArrayList<>()  ;
        }

        ArrayList<String> paths = new ArrayList<>();

        if(r < maze.length -1){
           paths.addAll(pathList(p + 'D', maze, r + 1, c));
        }
        if(c < maze[0].length - 1){
            paths.addAll(pathList(p + 'R', maze, r, c + 1));
        }

        return paths ;
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

    
}
