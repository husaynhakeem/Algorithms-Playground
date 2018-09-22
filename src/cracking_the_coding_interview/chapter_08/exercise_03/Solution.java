package cracking_the_coding_interview.chapter_08.exercise_03;

import org.jetbrains.annotations.NotNull;

class Solution {

    int magicIndex(@NotNull final int[] array) {
        return magicIndex(array, 0, array.length - 1);
    }

    private int magicIndex(final int[] array, final int low, final int high) {
        if (high < low) {
            return -1;
        }

        final int mid = low + (high - low) / 2;
        if (array[mid] == mid) {
            return mid;
        }
        if (array[mid] > mid) {
            return magicIndex(array, low, mid - 1);
        }
        return magicIndex(array, mid + 1, high);
    }
}
