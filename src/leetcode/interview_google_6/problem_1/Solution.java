package leetcode.interview_google_6.problem_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }

        final Map<String, Set<String>> map = buildMap(pairs);
        for (int i = 0; i < words1.length; i++) {
            final String word = words1[i];
            final String other = words2[i];

            if (word.equals(other)) {
                continue;
            }

            if ((map.get(word) == null || (map.get(word) != null && !map.get(word).contains(other))) || (map.get(other) == null || (map.get(other) != null && !map.get(other).contains(word)))) {
                return false;
            }
        }

        return true;
    }

    private Map<String, Set<String>> buildMap(final String[][] pairs) {
        final Map<String, Set<String>> map = new HashMap<>();

        for (final String[] pair : pairs) {
            if (!map.containsKey(pair[0])) {
                final Set<String> set = new HashSet<>();
                set.add(pair[1]);
                map.put(pair[0], set);
            } else {
                final Set<String> set = map.get(pair[0]);
                set.add(pair[1]);
                map.put(pair[0], set);
            }

            if (!map.containsKey(pair[1])) {
                final Set<String> set = new HashSet<>();
                set.add(pair[0]);
                map.put(pair[1], set);
            } else {
                final Set<String> set = map.get(pair[1]);
                set.add(pair[0]);
                map.put(pair[1], set);
            }
        }

        return map;
    }
}
