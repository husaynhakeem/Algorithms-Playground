package euler.problem_003.java;

public class Solution_1 {

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(13195));
        System.out.println(largestPrimeFactor(600851475143L));
    }

    private static long largestPrimeFactor(long n) {
        while (true) {
            long f = smallestPrimeFactor(n);
            if (n == f)
                return n;
            else
                n /= f;
        }
    }

    private static long smallestPrimeFactor(long n) {
        if (n <= 1)
            throw new RuntimeException();

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return i;
        }

        return n;
    }
}
