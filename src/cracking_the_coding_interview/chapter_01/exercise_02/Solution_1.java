package cracking_the_coding_interview.chapter_01.exercise_02;

import java.util.Arrays;

class Solution_1 {

    boolean checkPermutation(final String a, final String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] charsA = a.toCharArray();
        Arrays.sort(charsA);
        final String sortedA = new String(charsA);

        char[] charsB = b.toCharArray();
        Arrays.sort(charsB);
        final String sortedB = new String(charsB);

        return sortedA.equals(sortedB);
    }
}
