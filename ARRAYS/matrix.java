public class matrix {
    static int minimum(int[][] arr){
        int min = arr[0][0] ;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j] ;
                }
            }
        }
        return min ;
    }
    static int reset(int[][]arr, int row, int col){
        minimum(arr) ;
    }
    public static void main(String[] args) {
        int[][] arr ={
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {20, 11, 12, 14, 15}
        
        };
        System.out.println(minimum(arr));       
    }
    
}
