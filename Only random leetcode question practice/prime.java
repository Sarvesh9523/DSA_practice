public class prime{
    public static void main(String[] args){
        int n = 12 ;
        for(int i = n-1 ; i>1 ; i--){
            if(n % i != 0){
                System.out.println("prime") ;
            }else{
                System.out.println("Not prime") ;

            }
            
        }


    }
}