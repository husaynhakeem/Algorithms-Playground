package leetcode.problem_0159;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    int lengthOfLongestSubstringTwoDistinct(String s) {
        final Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        int length = 0;

        while (right < s.length()) {
            final char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            if (map.get(rightChar) == 1) {
                count++;
            }
            right++;

            while (count > 2) {
                final char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    count--;
                }
                left++;
            }

            length = Math.max(length, right - left);
        }

        return length;
    }
}
