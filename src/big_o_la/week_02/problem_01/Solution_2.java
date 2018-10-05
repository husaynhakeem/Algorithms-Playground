package big_o_la.week_02.problem_01;

class Solution_2 {

    long fibonacci(final int n) {
        if (n <= 1) {
            return n;
        }

        long a = 0;
        long b = 1;
        long c = -1;

        for (int i = 2; i < n + 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
