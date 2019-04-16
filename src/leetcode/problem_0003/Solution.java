package leetcode.problem_0003;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    int lengthOfLongestSubstring(String s) {
        int length = 0;
        int left = 0;
        int right = 0;
        final Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                length = Math.max(length, right - left + 1);
            } else {
                while (left <= right && set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            right++;
        }

        return length;
    }
}
