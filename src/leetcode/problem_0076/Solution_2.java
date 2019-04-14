package leetcode.problem_0076;

import java.util.HashMap;
import java.util.Map;

public class Solution_2 {

    String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        final Map<Character, Integer> targetMap = buildCharFrequencyMap(t);
        final Map<Character, Integer> windowMap = new HashMap<>();
        final int targetSize = targetMap.size();

        Answer answer = new Answer();
        int left = 0;
        int right = 0;
        int formed = 0;

        while (right < s.length()) {
            final char rightChar = s.charAt(right);
            final int rightCharFrequency = windowMap.getOrDefault(rightChar, 0);
            windowMap.put(rightChar, rightCharFrequency + 1);
            if (targetMap.containsKey(rightChar) && targetMap.get(rightChar).intValue() == windowMap.get(rightChar).intValue()) {
                formed++;
            }

            while (formed == targetSize && left <= right) {
                if (answer.length == -1 || right - left + 1 < answer.length) {
                    answer = new Answer(left, right);
                }

                final char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    formed--;
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
