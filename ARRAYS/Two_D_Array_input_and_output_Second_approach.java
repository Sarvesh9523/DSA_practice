import java.util.Scanner;
import java.util.Arrays ;

/* Second Approach for this same question */
public class Two_D_Array_input_and_output_Second_approach {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*Just take a example of a matrix
           1 2 3
           4 5 6
           7 8 9

        print this matrix
         */
        
        //int[][] arr = new int[3][]  ;         // Here I am not assigning the size of coloumns because it's not mandatory but if you want to assign then you can . When we don't assign the size then it will be individual size of coloumn in each rows like example
        /*{1, 2, 3}
          {4, 5}
          {6, 7, 8, 9} */      // here is the example of benifit to not assigning the coloumn size .

        /*int[][] arr2D = {
            {1, 2, 3}, // 0th index   // each array is a different object.
            {4, 5},    // 1st index
            {6, 7, 8, 9}  // 2nd index         
        } ; */
        System.out.print("Enter the size for col :");
        int col = in.nextInt();
        System.out.print("Enter the size for row :");
        int row = in.nextInt();

        int[][] arr2D = new int[row][col] ;
        for(int i=0; i<row ; i++){
            for(int j=0; j<col; j++){
                System.out.print("Element ["+ i + "]" + "[" + j + "]"+ ":");
                arr2D[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            System.out.println(Arrays.toString(arr2D[i]));    // here at 0th index the 1st row will print, and at 1st index 2nd row will print both are 1D array but overall it's 2D array .
        }
        
        
    }
}
