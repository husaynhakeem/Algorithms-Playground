package mit_course_6006.lecture_1;

class Solution {

    int findPeak(int[] array) {
        if (array == null) {
            return -1;
        }

        return findPeak(array, 0, array.length - 1);
    }

    private int findPeak(int[] array, int low, int high) {
        if (high < low) {
            return -1;
        }

        int middle = low + (high - low) / 2;

        if ((middle == 0 || array[middle - 1] <= array[middle])
                && (middle == array.length - 1 || array[middle + 1] <= array[middle])) {
            return middle;
        }

        if (array[middle] < array[middle + 1]) {
            return findPeak(array, middle + 1, high);
        }

        return findPeak(array, low, middle - 1);
    }
}
