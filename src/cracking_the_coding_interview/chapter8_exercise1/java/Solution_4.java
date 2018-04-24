package cracking_the_coding_interview.chapter8_exercise1.java;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution_4 {

    private static final BigInteger NEGATIVE_ONE = new BigInteger("-1");

    /*
    Here, I assume I need to count the number of ways when n -the
    number of steps- is larger than 36.
     */
    public static void main(String[] args) {
        System.out.println(countWays(40));
        System.out.println(countWays(80));
        System.out.println(countWays(120));
        System.out.println(countWays(200));
    }

    private static BigInteger countWays(int n) {
        BigInteger[] memo = new BigInteger[n + 1];
        Arrays.fill(memo, NEGATIVE_ONE);
        memo[0] = BigInteger.ONE;
        return countWays(n, memo);
    }

    private static BigInteger countWays(int n, BigInteger[] memo) {
        if (n < 0)
            return BigInteger.ZERO;
        if (n == 0)
            return BigInteger.ONE;

        if (memo[n].equals(NEGATIVE_ONE))
            memo[n] = countWays(n - 1, memo).add(countWays(n - 2, memo).add(countWays(n - 3, memo)));

        return memo[n];
    }
}
