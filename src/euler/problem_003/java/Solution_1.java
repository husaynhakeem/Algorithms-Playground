package euler.problem_003.java;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(13195));
        System.out.println(largestPrimeFactor(600851475143L));
    }

    private static int largestPrimeFactor(long n) {
        List<Integer> factors = factorize(n);
        if (factors.isEmpty())
            return 0;
        return factors.get(factors.size() - 1);
    }

    private static List<Integer> factorize(long n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0 && isPrimeNumber(i))
                factors.add(i);
        }

        return factors;
    }

    private static boolean isPrimeNumber(long n) {
        if (n <= 1)
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
