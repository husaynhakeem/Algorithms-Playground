package euler.problem_010;

import Utilities.java.IntegerUtils;

class Solution {

    long summationOfPrimes(final int n) {
        long sum = 0;
        for (int i = 2; i < n; i++) {
            if (IntegerUtils.isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
