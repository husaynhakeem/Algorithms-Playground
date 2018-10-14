package euler.problem_003;

class Solution_1 {

    long largestPrimeFactor(long n) {
        while (true) {
            long f = smallestPrimeFactor(n);
            if (n == f) {
                return n;
            } else {
                n /= f;
            }
        }
    }

    private long smallestPrimeFactor(final long n) {
        if (n <= 1) {
            throw new RuntimeException();
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }

        return n;
    }
}
