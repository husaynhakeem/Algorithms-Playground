package leetcode.problem_0763;

import java.util.*;

public class Solution {

    List<Integer> partitionLabels(final String s) {
        final Map<Character, Integer> occurrences = occurrences(s);
        final Set<Character> chars = new HashSet<>();
        final List<Integer> list = new ArrayList<>();

        int length = 0;
        for (final char c : s.toCharArray()) {
            final int count = occurrences.get(c);

            if (count == 1) {
                occurrences.remove(c);
                chars.remove(c);
            } else {
                occurrences.put(c, count - 1);
                chars.add(c);
            }

            length++;

            if (chars.isEmpty()) {
                list.add(length);
                length = 0;
            }
        }

        return list;
    }

    private Map<Character, Integer> occurrences(final String s) {
        final Map<Character, Integer> map = new HashMap<>();
        for (final char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
