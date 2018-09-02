package cracking_the_coding_interview.chapter_01.exercise_01;

import java.util.Arrays;

class SolutionFollowUp {

    private static final int NUMBER_OF_CHARS = 128;

    boolean isUnique(final String s) {
        if (s.length() > NUMBER_OF_CHARS) {
            return false;
        }

        final char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
