package leetcode.problem_0005;

public class Solution {

    String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        Interval result = new Interval(0, 0);

        for (int i = 0; i < s.length() - 1; i++) {
            final Interval first = expandAround(s, i, i);
            if (first.length() > result.length()) {
                result = first;
            }

            final Interval second = expandAround(s, i, i + 1);
            if (second.length() > result.length()) {
                result = second;
            }
        }

        return s.substring(result.left, result.right + 1);
    }

    private Interval expandAround(final String s, int left, int right) {
        if (s.charAt(left) == s.charAt(right)) {
            while (left > 0 && right < s.length() - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;
                right++;
            }
            return new Interval(left , right);
        }
        return new Interval(1, 0);
    }

    private class Interval {
        final int left;
        final int right;

        Interval(final int left, final int right) {
            this.left = left;
            this.right = right;
        }

        int length() {
            return right - left + 1;
        }
    }
}
