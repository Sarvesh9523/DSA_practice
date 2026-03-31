import java.util.*;

public class subset {
    // This is the itration approach to find all possible subarray
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println("----------this is the itrative approache's output of subarray-----------");

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }

        // now from here the concept of subset will start .
        System.out.println("----------this is the itrative approache's output using ArrayList-----------");
        System.out.println(subset(arr));


        System.out.println("----------this is the recursive approache's output-----------");

        subseq("", "abc"); // this is recursive function call

        System.out.println("----------this is the recursive approache's output using ArrayList-----------");

        System.out.println(subseqList("", "abc")); // this is recursive function call

    }
// This is the itrative approach of findig subset using ArrayList .
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    // This is the recursive  appraoch of findig subset 

    static void subseq(String processed, String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = Unprocessed.charAt(0);
        subseq(processed + ch, Unprocessed.substring(1));
        subseq(processed, Unprocessed.substring(1));
    }

    // same question implement using ArrayList
    static ArrayList<String> subseqList(String processed, String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            ArrayList<String> List = new ArrayList<>();
            List.add(processed);
            return List;
        }
        char ch = Unprocessed.charAt(0);
        ArrayList<String> Left = subseqList(processed + ch, Unprocessed.substring(1));
        ArrayList<String> Right = subseqList(processed, Unprocessed.substring(1));

        Left.addAll(Right);
        return Left;
    }

}
