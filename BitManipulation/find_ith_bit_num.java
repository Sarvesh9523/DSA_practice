public class find_ith_bit_num {
    public static void main(String[] args) {
        // Binary number as int
        int num = Integer.parseInt("101100101101", 2); // binary to int
        int i = 5;

        System.out.println(findBit(num, i));
    }

    static int findBit(int num, int i) {
        // Create a mask by left-shifting 1 by (i-1)
        int mask = 1 << (i - 1);

        // AND the mask with the number
        return (num & mask) != 0 ? 1 : 0;
    }

}
