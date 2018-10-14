package euler.problem_006;

class Solution {

    int sumSquareDifference(final int n) {
        return squareOfTheSumsUntil(n) - sumOfSquaresUntil(n);
    }

    private int squareOfTheSumsUntil(final int n) {
        int sum = (n * (n + 1)) / 2;
        return sum * sum;
    }

    private int sumOfSquaresUntil(final int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
