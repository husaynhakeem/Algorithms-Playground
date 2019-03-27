package leetcode.interview_google_5.problem_1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<String>> groupStrings(String[] strings) {
        final int count = strings.length;

        final String[] shifted = new String[count];
        for (int i = 0; i < shifted.length; i++) {
            shifted[i] = shift(strings[i]);
        }

        final List<List<String>> groups = new ArrayList<>();
        final boolean[] seen = new boolean[count];

        for (int i = 0; i < count; i++) {
            final List<String> group = new ArrayList<>();
            if (!seen[i]) {
                group.add(strings[i]);
                seen[i] = true;
            }

            for (int j = i + 1; j < count; j++) {
                if (!seen[j] && shifted[i].equals(shifted[j])) {
                    seen[j] = true;
                    group.add(strings[j]);
                }
            }

            if (!group.isEmpty()) {
                groups.add(group);
            }
        }

        return groups;
    }

    private String shift(final String word) {
        final char[] chars = word.toCharArray();
        final int distance = chars[0] - 'a';
        final StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            char shiftedC = (char) (c - distance);
            if (shiftedC < 'a') {
                shiftedC = (char) (shiftedC + 'z' - 'a' + 1);
            }
            sb.append(shiftedC);
        }

        return sb.toString();
    }
}
