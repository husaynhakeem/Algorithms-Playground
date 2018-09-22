package cracking_the_coding_interview.chapter_08.exercise_01;

import java.util.Arrays;

class Solution_3 {

    int tripleStep(final int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 1;
        return countWays(n, memo);
    }

    private int countWays(final int n, final int[] memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo[n] == -1) {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
        }
        return memo[n];
    }
}
