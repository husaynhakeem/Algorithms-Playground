package mit_course_6006.lecture_03.binary_insertion_sort;

public class Solution {

    void sort(final int[] array) {
        if (array == null) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            final int insertionIndex = findIndexWhereToInsert(array, 0, i - 1, array[i]);

            if (insertionIndex == -1) {
                continue;
            }

            int first = i - 1;
            int second = i;
            while (first >= insertionIndex) {
                int temp = array[first];
                array[first] = array[second];
                array[second] = temp;
                first--;
                second--;
            }
        }
    }

    private int findIndexWhereToInsert(final int[] array, final int from, final int to, final int valueToInsert) {
        if (to < from) {
            return -1;
        }

        final int middle = from + (to - from) / 2;

        if ((middle > 0 && array[middle - 1] <= valueToInsert && array[middle] >= valueToInsert)
                || (middle == 0 && array[middle] >= valueToInsert)) {
            return middle;
        }

        if (array[middle] > valueToInsert) {
            return findIndexWhereToInsert(array, from, middle - 1, valueToInsert);
        }

        return findIndexWhereToInsert(array, middle + 1, to, valueToInsert);
    }
}
