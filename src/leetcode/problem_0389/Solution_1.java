package leetcode.problem_0389;

import java.util.HashMap;

public class Solution_1 {

    char findTheDifference(String s, String t) {
        final HashMap<Character, Integer> charsAndFreqs = new HashMap<>();
        for (Character c : t.toCharArray()) {
            Integer freq = charsAndFreqs.get(c);
            if (freq == null) {
                freq = 0;
            }
            charsAndFreqs.put(c, freq + 1);
        }

        for (Character c : s.toCharArray()) {
            final int freq = charsAndFreqs.get(c);
            if (freq == 1) {
                charsAndFreqs.remove(c);
            } else {
                charsAndFreqs.put(c, freq - 1);
            }
        }

        return charsAndFreqs.keySet().iterator().next();
    }
}
