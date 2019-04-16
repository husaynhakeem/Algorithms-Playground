package leetcode.problem_0734;

import java.util.*;

public class Solution {

    boolean areSentencesSimilar(final String[] words1, final String[] words2, final String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }

        final List<Set<String>> groups = group(pairs);
        for (int i = 0; i < words1.length; i++) {
            if (!words1[i].equals(words2[i]) && !areInSameGroup(groups, words1[i], words2[i])) {
                return false;
            }
        }

        return true;
    }

    private boolean areInSameGroup(final List<Set<String>> groups, final String a, final String b) {
        for (final Set<String> group : groups) {
            if (group.contains(a) && group.contains(b)) {
                return true;
            }

            if ((group.contains(a) && !group.contains(b)) || (!group.contains(a) && group.contains(b))) {
                return false;
            }
        }
        return false;
    }

    private List<Set<String>> group(final String[][] pairs) {
        final Map<String, String> parent = new HashMap<>();
        for (String[] pair : pairs) {
            union(pair[0], pair[1], parent);
        }

        final Map<String, Set<String>> groups = new HashMap<>();
        for (final Map.Entry entry : parent.entrySet()) {
            final String value = (String) entry.getValue();
            final Set<String> set = groups.containsKey(value) ? groups.get(value) : new HashSet<>();
            set.add((String) entry.getKey());
            groups.put(value, set);
        }

        return new ArrayList<>(groups.values());
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
