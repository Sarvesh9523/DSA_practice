public class reverse {
    // public static void main(String[] args){
    //     int num = 1234 ;
    //     int ans = rever(num, 0);
    //     System.out.println(ans);

        

    // }
    // static int rever(int num, int rev){
    //     if(num == 0){
    //         return rev ;
    //     }
    //     int digit = num %10 ;
    //     rev = rev*10 + digit ;
    //     return rever(num/10, rev) ;
       
    // }
    
    // second way to find answer :-

    static int sum =0 ;
    static void rev2(int num){
        if(num==0){
            return ;
        }
        int rem = num%10;
        sum = sum*10 + rem ;
        rev2(num/10) ;
    }
    public static void main(String[] args) {
        int num = 1234 ;
        rev2(num);
        System.out.println(sum);
    }
}
