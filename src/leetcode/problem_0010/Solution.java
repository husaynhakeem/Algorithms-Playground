package leetcode.problem_0010;

public class Solution {

    public boolean isMatch(String s, String p) {
        return isMatch(s, 0, p, 0, new Result[s.length() + 1][p.length() + 1]);
    }

    private boolean isMatch(String word, int wIndex, String pattern, int pIndex, Result[][] memo) {
        if (memo[wIndex][pIndex] != null) {
            return memo[wIndex][pIndex] == Result.TRUE;
        }

        boolean result;

        if (pIndex == pattern.length()) {
            result = wIndex == word.length();
        } else {
            boolean firstCharMatch = (wIndex < word.length()) &&
                    (word.charAt(wIndex) == pattern.charAt(pIndex) || pattern.charAt(pIndex) == '.');

            if (pIndex + 1 < pattern.length() && pattern.charAt(pIndex + 1) == '*') {
                result = isMatch(word, wIndex, pattern, pIndex + 2, memo) ||
                        (firstCharMatch && isMatch(word, wIndex + 1, pattern, pIndex, memo));
            } else {
                result = firstCharMatch && isMatch(word, wIndex + 1, pattern, pIndex + 1, memo);
            }
        }

        memo[wIndex][pIndex] = result ? Result.TRUE : Result.FALSE;
        return result;
    }

    enum Result {
        TRUE, FALSE
    }
}
