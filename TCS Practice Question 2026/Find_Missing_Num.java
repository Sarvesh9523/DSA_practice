public class Find_Missing_Num {
    public static void main(String[] args){
        int[] arr = {1,2,4,3};
        System.out.println(findMissing(arr));


    }

    static int findMissing(int[] arr){
        int n = arr.length + 1;

    int xor1 = 0; // XOR of 1 to n
    int xor2 = 0; // XOR of array

    // XOR from 1 to n
    for(int i = 1; i <= n; i++){
        xor1 ^= i;
    }

    // XOR of array elements
    for(int num : arr){
        xor2 ^= num;
    }

    return xor1 ^ xor2;
    }
    
}
