package mit_course_6006.lecture_03.merge_sort;

public class Solution {

    void sort(final int[] array) {
        if (array == null) {
            return;
        }
        final int[] sortedArray = sort(array, 0, array.length - 1);
        System.arraycopy(sortedArray, 0, array, 0, array.length);
    }

    private int[] sort(final int[] array, final int from, final int to) {
        if (to < from) {
            return new int[]{};
        }

        if (to == from) {
            return new int[]{array[from]};
        }

        final int middle = from + (to - from) / 2;
        final int[] left = sort(array, from, middle);
        final int[] right = sort(array, middle + 1, to);
        return merge(left, right);
    }

    private int[] merge(final int[] left, final int[] right) {
        final int[] mergedArray = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int mergedArrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                mergedArray[mergedArrayIndex++] = left[leftIndex++];
            } else {
                mergedArray[mergedArrayIndex++] = right[rightIndex++];
            }
        }

        int[] array;
        int from;
        int to;
        if (leftIndex == left.length) {
            array = right;
            from = rightIndex;
            to = right.length;
        } else {
            array = left;
            from = leftIndex;
            to = left.length;
        }

        for (int i = from; i < to; i++) {
            mergedArray[mergedArrayIndex++] = array[i];
        }

        return mergedArray;
    }
}
