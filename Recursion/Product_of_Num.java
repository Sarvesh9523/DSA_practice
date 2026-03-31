public class Product_of_Num{
    public static void main(String[] args) {
        int x = 2 , y = 4 ;
        System.out.println(find_Multiplication(x, y));
        
    }
    static int find_Multiplication(int x , int y){
        if(y == 0){
            return 0 ;
        }else{
            return (x + find_Multiplication(x, y-1)) ;
        }

    }
}