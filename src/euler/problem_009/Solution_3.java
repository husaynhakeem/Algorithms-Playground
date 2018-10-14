package euler.problem_009;

class Solution_3 {

    int specialPythagoreanTriplet(final int n) {
        for (int a = 1; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                final int c = n - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
