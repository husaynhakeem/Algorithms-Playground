package leetcode.problem_0567;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        final Map<Character, Integer> map = buildCharFrequencyMap(s1);
        int left = 0;
        int right = 0;
        int count = map.size();

        while (right < s2.length()) {
            final char rightChar = s2.charAt(right);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) == 0) {
                    count--;
                }
            }
            right++;

            while (left <= right && count == 0) {
                final char leftChar = s2.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }

                if (s1.length() == right - left) {
                    return true;
                }

                left++;
            }
        }

        return false;
    }

    private Map<Character, Integer> buildCharFrequencyMap(final String s) {
        final Map<Character, Integer> map = new HashMap<>();
        for (final char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
