package leetcode.problem_0139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    boolean wordBreak(String s, List<String> wordDict) {
        final Set<String> dictionary = new HashSet<>(wordDict);
        final boolean[] memo = new boolean[s.length() + 1];
        memo[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (memo[j] && dictionary.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }

        return memo[s.length()];
    }
}
