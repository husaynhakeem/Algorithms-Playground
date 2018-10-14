package euler.problem_007;

import Utilities.java.IntegerUtils;

class Solution {

    int nthPrime(final int n) {
        int count = 0;
        int runner = 2;

        while (true) {
            if (IntegerUtils.isPrime(runner)) {
                count++;
                if (count == n) {
                    return runner;
                }
            }
            runner++;
        }
    }
}
