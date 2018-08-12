package mit_course_6006.lecture_20.text_justification_iterative;

class Solution {

    private static final int INFINITY = Integer.MAX_VALUE;

    int[] justifyText(final int pageWidth, final String[] words) {
        int n = words.length;
        final int[] dp = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                dp[i] = 0;
            } else {
                dp[i] = min(i, dp, pageWidth, words);
            }
        }
        return dp;
    }

    private int min(final int index, final int[] dp, final int pageWidth, final String[] words) {
        int min = INFINITY;
        for (int i = index + 1; i < dp.length; i++) {
            int k = badness(index, i, pageWidth, words) + dp[i];
            if (min > k) {
                min = k;
            }
        }
        return min;
    }

    private int badness(final int i, final int j, final int pageWidth, final String[] words) {
        int totalWidth = 0;
        for (int k = i; k < j; k++) {
            totalWidth += words[k].length();
        }

        if (totalWidth > pageWidth) {
            return INFINITY;
        }
        return (int) Math.pow(pageWidth - totalWidth, 3);
    }
}
