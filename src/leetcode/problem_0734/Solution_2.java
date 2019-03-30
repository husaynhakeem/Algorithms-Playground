package leetcode.problem_0734;

import java.util.HashSet;
import java.util.Set;

public class Solution_2 {

    boolean areSentencesSimilar(final String[] words1, final String[] words2, final String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }

        final Set<String> set = buildPairsSet(pairs);
        for (int i = 0; i < words1.length; i++) {
            String a = words1[i];
            String b = words2[i];
            if (!a.equals(b) && !set.contains(pair(a, b)) && !set.contains(pair(b, a))) {
                return false;
            }
        }

        return true;
    }

    private Set<String> buildPairsSet(final String[][] pairs) {
        final Set<String> set = new HashSet<>();
        for (final String[] pair : pairs) {
            set.add(pair(pair[0], pair[1]));
        }
        return set;
    }

    private String pair(final String a, final String b) {
        return a + "#" + b;
    }
}
