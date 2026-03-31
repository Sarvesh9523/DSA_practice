public class prime_num{
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(Find_Prime(n, i));
        
    }
    static boolean Find_Prime(int n, int i){
        if(n == 0){
            return true ;
        }
        if(n % i == 0){
            return false ;
        }
        if(i*i > n){
            return true ;
        }
        return Find_Prime(n, i + 1) ;
    }
}