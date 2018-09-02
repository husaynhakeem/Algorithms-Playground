package cracking_the_coding_interview.chapter_01.exercise_02;

class Solution_2 {

    private static final int NUMBER_OF_CHARS = 128;

    boolean checkPermutation(final String a, final String b) {
        if (a.length() != b.length()) {
            return false;
        }

        final int[] chars = new int[NUMBER_OF_CHARS];

        for (Character c : a.toCharArray()) {
            chars[c]++;
        }

        for (Character c : b.toCharArray()) {
            chars[c]--;
            if (chars[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
