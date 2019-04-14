package leetcode.problem_0438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<Integer> findAnagrams(String s, String p) {
        final Map<Character, Integer> map = buildCharFrequencyMap(p);
        final List<Integer> indices = new ArrayList<>();
        int left = 0;
        int right = 0;
        int count = map.size();

        while (right < s.length()) {
            final char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) == 0) {
                    count--;
                }
            }
            right++;

            while (left <= right && count == 0) {
                if (right - left == p.length()) {
                    indices.add(left);
                }

                final char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }
                left++;
            }
        }

        return indices;
    }

    private Map<Character, Integer> buildCharFrequencyMap(final String s) {
        final Map<Character, Integer> map = new HashMap<>();
        for (final char c : s.toCharArray()) {
            final int frequency = map.getOrDefault(c, 0);
            map.put(c, frequency + 1);
        }
        return map;
    }
}
