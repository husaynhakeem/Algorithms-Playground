package cracking_the_coding_interview.chapter_10.exercise_11;

import org.jetbrains.annotations.NotNull;

class Solution {

    void peaksAndValleys(@NotNull final int[] array) {
        boolean startWithBiggerVal = true;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > array[i + 1] && !startWithBiggerVal) || (array[i] < array[i + 1] && startWithBiggerVal)) {
                final int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            startWithBiggerVal = !startWithBiggerVal;
        }
    }
}
