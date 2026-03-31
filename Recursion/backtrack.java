import java.util.Arrays;

public class backtrack {
    public static void main(String[] args) {
        boolean[][] board2= {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        Allpath("", board2, 0, 0);

        System.out.println("----This is the result of Print all Path----");


        int[][] path = new int[board2.length][board2[0].length];
        AllpathPrint("", board2, 0, 0, path, 1);

    }
    static void Allpath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            
            return;
        }
        if(!maze[r][c]){ // !maze[r][c] means maze[r][c] == false .
            return;
        }
        maze[r][c] = false ; // it makes a change and make the current cell as a visited by making it false.


        if(r < maze.length-1){
            Allpath(p + 'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            Allpath(p + 'R', maze, r, c+1);
        }
        if(r > 0){
            Allpath(p + 'U',maze, r-1, c);
        } 
        if(c > 0){
            Allpath(p + 'L',maze, r, c-1);
        }


        maze[r][c] = true ;  /*Now it will makes a change and make the path go back when the current path is end by making current cell a true which indicate not visited 
                                and it is the mandatry step to find all the possible path  */

                                /*
                                 * Now whole the algorithm is defining backtrack 
                                 * firstly find a any path and make visited cell as a false and go till end of the path then make it true to go back and find another path that's it .
                                 */

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
