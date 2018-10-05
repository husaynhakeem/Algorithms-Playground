package big_o_la.week_02.problem_01;

class Solution_1 {

    long fibonacci(final int n) {
        if (n <= 1) {
            return n;
        }

        final long[] memo = new long[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }
}
