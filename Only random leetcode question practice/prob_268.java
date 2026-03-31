public class prob_268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int ans = missingNumber(arr);
        System.out.print(ans);
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i]; // it is because the given array contains 0 also and the range is from 0 to N .
            if (arr[i] < arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);

            } else {
                i++;
            }

        }
         // searching for the missing element
         for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index; 
            }
        }
        return arr.length ;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
