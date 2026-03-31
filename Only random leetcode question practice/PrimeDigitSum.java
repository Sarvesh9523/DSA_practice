public class PrimeDigitSum {
    // Check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Find the nth prime number
    static int findNthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    // Reduce a number to a single digit by summing digits repeatedly
    static int reduceToSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        int sixthPrime = findNthPrime(6); // 13
        int eighthPrime = findNthPrime(8); // 19

        int reducedSixth = reduceToSingleDigit(sixthPrime); // 4
        int reducedEighth = reduceToSingleDigit(eighthPrime); // 1

        int finalResult = reducedSixth + reducedEighth; // 5

        System.out.println("Final result: " + finalResult);
    }
}
