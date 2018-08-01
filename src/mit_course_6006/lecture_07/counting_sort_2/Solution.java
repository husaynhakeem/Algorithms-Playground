package mit_course_6006.lecture_07.counting_sort_2;

import Utilities.java.ArrayUtils;

public class Solution {

    int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        final int[] frequencies = new int[ArrayUtils.max(array) + 1];
        for (Integer n : array) {
            frequencies[n] = frequencies[n] + 1;
        }

        for (int i = 1; i < frequencies.length; i++) {
            frequencies[i] = frequencies[i] + frequencies[i - 1];
        }

        final int[] sortedArray = new int[array.length];
        for (int array_i : array) {
            final int frequency_array_i = frequencies[array_i];
            sortedArray[frequency_array_i - 1] = array_i;
            frequencies[array_i] = frequency_array_i - 1;
        }

        return sortedArray;
    }
}
