import java.util.*;

public class DivisorsFinder {
    public static int[] findDivisors(int n) {
        List<Integer> divisorsList = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisorsList.add(i);
                if (i != n / i) {
                    divisorsList.add(n / i);
                }
            }
        }

        Collections.sort(divisorsList); // Sort in ascending order

        // Convert List<Integer> to int[]
        int[] result = new int[divisorsList.size()];
        for (int i = 0; i < divisorsList.size(); i++) {
            result[i] = divisorsList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 36;
        int[] result = findDivisors(n);
        System.out.println("Divisors of " + n + ": " + Arrays.toString(result));
    }
}
