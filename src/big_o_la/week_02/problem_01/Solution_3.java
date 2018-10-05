package big_o_la.week_02.problem_01;

class Solution_3 {

    long fibonacci(final int n) {
        if (n <= 1) {
            return n;
        }

        final long[] memo = new long[n + 1];

        fibonacciHelper(n, memo);

        return memo[n];
    }

    private long fibonacciHelper(final int index, final long[] memo) {
        if (memo[index] != 0) {
            return memo[index];
        }

        if (index <= 1) {
            return index;
        }

        memo[index] = fibonacciHelper(index - 1, memo) + fibonacciHelper(index - 2, memo);

        return memo[index];
    }
}
