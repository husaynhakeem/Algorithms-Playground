package cracking_the_coding_interview.chapter_01.exercise_03;

class Solution {

    void urlify(final char[] chars) {
        final int length = chars.length;
        int index = length - 1;
        int runner = length - 1;

        while (runner >= 0) {
            while (runner >= 0 && chars[runner] == ' ') {
                runner--;
            }

            if (runner < 0) {
                return;
            }

            if (runner != index) {
                chars[index--] = '0';
                chars[index--] = '2';
                chars[index--] = '%';
            }

            while (runner >= 0 && chars[runner] != ' ') {
                chars[index--] = chars[runner--];
            }
        }
    }
}
