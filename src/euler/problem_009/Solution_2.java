package euler.problem_009;

class Solution_2 {

    int specialPythagoreanTriplet(final int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    if (a * a + b * b == c * c && a + b + c == n) {
                        return a * b * c;
                    }
                }
            }
        }
        return -1;
    }
}
