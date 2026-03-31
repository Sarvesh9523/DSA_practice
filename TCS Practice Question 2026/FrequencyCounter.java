import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 2 };
        System.out.println(countFreq(arr));

    }

    static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // step 2 : Store the outcome in new ArrayList result

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int key : map.keySet()) {
            ArrayList<Integer> temp = new ArrayList<>(); // it will store [num, freq] like array
            temp.add(key);
            temp.add(map.get(key));
            result.add(temp);
        }
        return result;

    }

}
