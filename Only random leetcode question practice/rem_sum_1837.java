public class rem_sum_1837{
    public static void main(String[] args){
        int n = 34 ;
        int k = 6 ;
        int ans = FindSum(n, k) ;
        System.out.println(ans);

    }
    static int FindSum(int n , int k){
        int sum = 0;
        while(n>0){
            int rem = n%k ;
            sum += rem ;
            n = n/k ;
        }
        return sum ;
    }
}