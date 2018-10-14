package euler.problem_008;

class Solution_1 {

    int specialPythagoreanTriplet(final int n) {

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                final double c = Math.sqrt(a * a + b * b);
                if (!isInt(c)) {
                    continue;
                }
                if ((a + b + c) == n) {
                    return a * b * (int) c;
                }
            }
        }

        return -1;
    }

    private boolean isInt(final double n) {
        return Math.ceil(n) == Math.floor(n);
    }
}
