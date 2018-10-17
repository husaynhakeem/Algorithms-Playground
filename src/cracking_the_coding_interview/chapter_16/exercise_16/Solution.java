package cracking_the_coding_interview.chapter_16.exercise_16;

import kotlin.Pair;

class Solution {

    Pair<Integer, Integer> subSort(final int[] array) {
        final int length = array.length;

        if (length == 0) {
            return new Pair<>(-1, -1);
        }

        int leftIndex = 0;
        int index = 1;
        do {
            leftIndex++;
        } while (index < length && array[index - 1] <= array[index++]);

        if (leftIndex >= length) {
            return new Pair<>(-1, -1);
        }

        int rightIndex = length - 1;
        index = length - 2;
        do {
            rightIndex--;
        } while (index >= 0 && array[index] <= array[index-- + 1]);

        final int min = min(array, leftIndex, rightIndex);
        final int max = max(array, leftIndex, rightIndex);

        final boolean isSmaller = isNSmallerThanAllItemsInArrayFrom(max, array, rightIndex + 1);
        final boolean isBigger = isNBiggerThanAllItemInArrayTo(min, array, leftIndex - 1);

        if (!isSmaller) {
            index = rightIndex + 1;
            while (index < length && max >= array[index]) {
                index++;
                rightIndex++;
            }
        }

        if (!isBigger) {
            index = leftIndex - 1;
            while (index >= 0 && min <= array[index]) {
                index--;
                leftIndex--;
            }
        }

        return new Pair<>(leftIndex, rightIndex);
    }

    private int min(final int[] array, final int from, final int to) {
        int min = array[from];
        for (int i = from + 1; i <= to; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private int max(final int[] array, final int from, final int to) {
        int max = array[from];
        for (int i = from; i <= to; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private boolean isNSmallerThanAllItemsInArrayFrom(final int n, final int[] array, final int from) {
        for (int i = from; i < array.length; i++) {
            if (n > array[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isNBiggerThanAllItemInArrayTo(final int n, final int[] array, final int to) {
        for (int i = 0; i <= to; i++) {
            if (n < array[i]) {
                return false;
            }
        }
        return true;
    }
}
