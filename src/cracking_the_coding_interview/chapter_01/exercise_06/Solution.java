package cracking_the_coding_interview.chapter_01.exercise_06;

import org.jetbrains.annotations.NotNull;

class Solution {

    String compressString(@NotNull final String s) {
        final StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            final char c = s.charAt(i);
            sb.append(c);

            int count = 1;
            i++;

            while (i < s.length() && s.charAt(i) == c) {
                i++;
                count++;
            }

            sb.append(count);
        }

        if (sb.length() >= s.length()) {
            return s;
        }
        return sb.toString();
    }
}
