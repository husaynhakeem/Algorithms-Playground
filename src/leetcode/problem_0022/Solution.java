package leetcode.problem_0022;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        final List<String> results = new ArrayList<>();
        generateParenthesisInternal(results, "", 0, 0, n);
        return results;
    }

    private void generateParenthesisInternal(List<String> results, String word, int open, int close, int n) {
        if (word.length() == 2 * n) {
            results.add(word);
            return;
        }

        if (open < n) {
            generateParenthesisInternal(results, word + "(", open + 1, close, n);
        }

        if (close < open) {
            generateParenthesisInternal(results, word + ")", open, close + 1, n);
        }
    }
}
