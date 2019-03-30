package leetcode.problem_0737;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    boolean areSentencesSimilarTwo(final String[] words1, final String[] words2, final String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }

        final Map<String, String> groups = group(pairs);
        for (int i = 0; i < words1.length; i++) {
            if (!words1[i].equals(words2[i]) && !areInSameGroup(groups, words1[i], words2[i])) {
                return false;
            }
        }

        return true;
    }

    private boolean areInSameGroup(final Map<String, String> groups, final String a, final String b) {
        return find(a, groups).equals(find(b, groups));
    }

    private Map<String, String> group(final String[][] pairs) {
        final Map<String, String> parent = new HashMap<>();
        for (String[] pair : pairs) {
            union(pair[0], pair[1], parent);
        }
        return parent;
    }

    private void union(final String a, final String b, final Map<String, String> parent) {
        final String parentA = find(a, parent);
        final String parentB = find(b, parent);
        if (!parentA.equals(parentB)) {
            parent.put(parentA, parentB);
        }
    }

    private String find(final String a, final Map<String, String> parent) {
        parent.putIfAbsent(a, a);
        if (!parent.get(a).equals(a)) {
            parent.put(a, find(parent.get(a), parent));
        }
        return parent.get(a);
    }
}
