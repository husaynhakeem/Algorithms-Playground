package leetcode.problem_0204;

import java.util.Arrays;

public class Solution {

    public int countPrimes(int n) {
        final boolean[] isPrimeArray = new boolean[n];
        Arrays.fill(isPrimeArray, true);

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrimeArray[i]) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    isPrimeArray[i*j] = false;
                }
            }
        }

        return count;
    }
}
