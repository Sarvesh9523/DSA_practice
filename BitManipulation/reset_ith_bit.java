public class reset_ith_bit {
    public static void main (String[] ans){
        int num = Integer.parseInt("11101101001", 2); // Integer.parseInt() conver the string value into integer.
        int i = 4 ;
        int newNum = ResetBit(i, num);
        System.out.println(Integer.toBinaryString(newNum));
    }
    static int ResetBit(int i, int num){
        int mask = ~(1<<(i-1)) ;   // Here (~) compliment sign is used to convert the mask vlaue in its opposite value .
        return num & mask ;
    }
    
}
