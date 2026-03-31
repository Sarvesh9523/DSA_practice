public class set_ith_bit_num {
    public static void main(String[] args){
        int num = Integer.parseInt("1001111011", 2) ;
        int i = 3 ;
        int newNum = setbit(i, num) ;
        System.out.println(Integer.toBinaryString(newNum));

    }
    static int setbit(int i, int num){
        int mask = 1<<(i-1) ;
        return num | mask ;
    }
}
