package cracking_the_coding_interview.chapter_08.exercise_01;

import java.math.BigInteger;
import java.util.Arrays;

class Solution_4 {

    private static final BigInteger NEGATIVE_ONE = new BigInteger("-1");

    BigInteger tripleStep(final int n) {
        final BigInteger[] memo = new BigInteger[n + 1];
        Arrays.fill(memo, NEGATIVE_ONE);
        memo[0] = BigInteger.ONE;
        return tripleStep(n, memo);
    }

    private static BigInteger tripleStep(final int n, final BigInteger[] memo) {
        if (n < 0) {
            return BigInteger.ZERO;
        }
        if (n == 0) {
            return BigInteger.ONE;
        }
        if (memo[n].equals(NEGATIVE_ONE)) {
            memo[n] = tripleStep(n - 1, memo).add(tripleStep(n - 2, memo).add(tripleStep(n - 3, memo)));
        }
        return memo[n];
    }
}
