public class sum_of_digits {
    public static void main (String[] args){
        int n = 14328 ;
        int ans = FindSum(n);
        System.out.println(ans);
    }

    static int FindSum(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10) + FindSum(n/10) ;
        }
    }
    
}
