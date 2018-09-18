package cracking_the_coding_interview.java;

import org.jetbrains.annotations.NotNull;

class MergeSort_1 {

    int[] sort(@NotNull final int[] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    private int[] mergeSort(@NotNull final int[] array, final int low, final int high) {
        if (high < low) {
            return null;
        }

        if (high == low) {
            return new int[]{array[high]};
        }

        final int mid = (high + low) / 2;

        int[] left = mergeSort(array, low, mid);
        int[] right = mergeSort(array, mid + 1, high);

        return merge(right, left);
    }

    private int[] merge(final int[] first, final int[] second) {
        final int[] result = new int[first.length + second.length];

        int firstIndex = 0;
        int secondIndex = 0;
        int resultIndex = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                result[resultIndex++] = first[firstIndex++];
            } else {
                result[resultIndex++] = second[secondIndex++];
            }
        }

        while (firstIndex < first.length) {
            result[resultIndex++] = first[firstIndex++];
        }

        while (secondIndex < second.length) {
            result[resultIndex++] = second[secondIndex++];
        }

        return result;
    }
}
