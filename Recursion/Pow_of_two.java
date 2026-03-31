public class Pow_of_two {
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(Find(n));
        
    }
    static boolean Find(int n){
        if(n == 1){
            return true ;
        }
        if(n<=0 || n%2!=0){
            return false ;
        }
        return Find(n/2) ;

    }
    
}
