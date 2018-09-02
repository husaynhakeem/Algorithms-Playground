package cracking_the_coding_interview.chapter_01.exercise_01;

class Solution {

    private static final int NUMBER_OF_CHARS = 128;

    boolean isUnique(final String s) {
        if (s.length() > NUMBER_OF_CHARS) {
            return false;
        }

        final boolean[] chars = new boolean[NUMBER_OF_CHARS];
        for (Character c : s.toCharArray()) {
            if (chars[c]) {
                return false;
            }
            chars[c] = true;
        }

        return true;
    }
}
