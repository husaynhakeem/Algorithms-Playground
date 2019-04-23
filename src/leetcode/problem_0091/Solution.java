package leetcode.problem_0091;

import java.util.Arrays;

public class Solution {

    int numDecodings(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        final int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return numDecodingsHelper(0, s, memo);
    }

    private int numDecodingsHelper(final int index, final String s, final int[] memo) {
        if (index == s.length()) {
            return 1;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        int numDecodings = 0;

        if (index < s.length()) {
            final int oneDigit = Character.getNumericValue(s.charAt(index));
            if (oneDigit != 0) {
                numDecodings += numDecodingsHelper(index + 1, s, memo);
            }
        }

        if (index + 1 < s.length()) {
            final int twoDigits = Integer.parseInt(s.substring(index, index + 2));
            if (10 <= twoDigits && twoDigits <= 26) {
                numDecodings += numDecodingsHelper(index + 2, s, memo);
            }
        }

        memo[index] = numDecodings;
        return numDecodings;
    }
}
