package leetcode.interview_google_7.problem_1;

import java.util.Hashtable;

public class Solution {

    boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> mappings = new Hashtable<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char sChar = sChars[i];
            char tChar = tChars[i];
            Character mapping = mappings.get(sChar);

            if (mapping == null) {
                if (mappings.containsValue(tChar)) {
                    return false;
                } else {
                    mappings.put(sChar, tChar);
                }
            } else if (mapping != tChar) {
                return false;
            }
        }

        return true;
    }
}
