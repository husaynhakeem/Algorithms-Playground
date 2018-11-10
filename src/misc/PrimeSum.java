package misc;

import java.util.ArrayList;


/**
 * PRIMESUM
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 * <p>
 * NOTE A solution will always exist. read Goldbach’s conjecture
 * <p>
 * Example:
 * <p>
 * <p>
 * Input : 4
 * Output: 2 + 2 = 4
 * <p>
 * If there are more than one solutions possible, return the lexicographically smaller solution.
 * <p>
 * If [a, b] is one solution with a <= b,
 * and [c,d] is another solution with c <= d, then
 * <p>
 * [a, b] < [c, d]
 * <p>
 * If a < c OR a==c AND b < d.
 */
class PrimeSum {

    ArrayList<Integer> primeSum(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (isPrime(i) && isPrime(a - i)) {
                return listFrom(i, a - i);
            }
        }
        return listFrom(-1, -1);
    }

    private boolean isPrime(final int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    private ArrayList<Integer> listFrom(final int a, final int b) {
        final ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
}
