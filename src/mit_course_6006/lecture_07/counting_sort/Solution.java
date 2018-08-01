package mit_course_6006.lecture_07.counting_sort;

import Utilities.java.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

class Solution {

    int[] sort(final int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        return sort(array, ArrayUtils.max(array));
    }

    private int[] sort(final int[] array, final int max) {
        final ArrayList[] values = new ArrayList[max + 1];

        for (Integer n : array) {
            if (values[n] == null) {
                values[n] = new ArrayList<>();
            }
            values[n].add(n);
        }

        final int[] sortedArray = new int[array.length];
        int sortedArrayIndex = 0;

        for (List<Integer> list : values) {
            if (list == null) {
                continue;
            }
            for (Integer value : list) {
                sortedArray[sortedArrayIndex++] = value;
            }
        }

        return sortedArray;
    }
}
