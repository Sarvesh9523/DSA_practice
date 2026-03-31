/*Q. Print the matrix of size user inputed and the element also inputed by the user  */
import java.util.Scanner ;
import java.util.Arrays ;
public class Two_D_Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = in.nextInt();
        System.out.print("Enter the number of col : ");   
        int col = in.nextInt();                             // 2-D arrays are like matric . which have rows and coloumns .

        //input 2D array .
        int [][] arr = new int[row][col] ; 
        System.out.println("Enter the element of 2Darray : ");
        for(int i =0; i<row ; i++){
            for(int j=0; j<col ; j++){
                System.out.print("Element ["+ i + "]" + "[" + j + "]"+ ":");
                arr[i][j] = in.nextInt();
            }            
        }

        // //output the entered 2D array by user.
        // System.out.println("The matrix is:");
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {   // basically i is for row and j is for coloumn in for loop .
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // //best way to print using Arrays.toString() . 
        // for(int i=0; i<row ; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        
        // Enhanced for loop to print the 2D array which is arr
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        



    }
    
} 



