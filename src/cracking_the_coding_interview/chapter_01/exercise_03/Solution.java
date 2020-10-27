package cracking_the_coding_interview.chapter_01.exercise_03;

class Solution {

    void urlify(final char[] chars, int trueLength) {
        int numberOfSpaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (chars[i] == ' ') {
                numberOfSpaces++;
            }
        }

        int right = trueLength - 1 + 2 * numberOfSpaces;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[right] = '0';
                chars[right - 1] = '2';
                chars[right - 2] = '%';
                right -= 3;
            } else {
                chars[right--] = chars[i];
            }
        }
    }
}
