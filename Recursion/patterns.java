public class patterns {
    /*
    for better understanding of rows and cols I make a demo with row numbers and coloumn to make better logic.
    
                   col
             0th 1st 2nd 3rd 
        4th- *    *   *   *
    row 3rd- *    *   * 
        2nd- *    *
        1st- *

        
     */
    public static void main(String[] args) {
        int r = 4;
        int c = 0 ;
        triangle(r, c);
        
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triangle(r, c+1);
        }else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
    
}
