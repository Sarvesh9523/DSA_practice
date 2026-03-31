public class findSum {
    public static void main(String[] args){
        
        // find(10);
        System.out.println(find(5));

    }
    static int find(int n){
        if(n == 1){
            return 1 ;
        } 
        return (n*n*n) + find(n-1) ;
    }
    
    
}
