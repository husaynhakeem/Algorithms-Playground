package leetcode.problem_0076;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        final Map<Character, Integer> map = buildCharFrequencyMap(t);
        Answer answer = new Answer();
        final int length = map.size();
        int right = 0;
        int left = 0;
        int count = length;

        while (right < s.length()) {
            final char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) == 0) {
                    count--;
                }
            }

            while (count == 0) {
                if (answer.length == -1 || right - left + 1 < answer.length) {
                    answer = new Answer(left, right);
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

            right++;
        }

        return answer.length == -1 ? "" : s.substring(answer.left, answer.right + 1);
    }

    private Map<Character, Integer> buildCharFrequencyMap(final String s) {
        final Map<Character, Integer> map = new HashMap<>();
        for (final char c : s.toCharArray()) {
            final int frequency = map.getOrDefault(c, 0);
            map.put(c, frequency + 1);
        }
        return map;
    }

    class Answer {
        int left;
        int right;
        int length = -1;

        Answer() {
        }

        Answer(final int left, final int right) {
            this.left = left;
            this.right = right;
            this.length = right - left + 1;
        }
    }
}
