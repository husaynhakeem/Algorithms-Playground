package cracking_the_coding_interview.chapter_10.exercise_05;

class Solution {

    int search(final String[] array, final String x) {
        return search(array, 0, array.length - 1, x);
    }

    private int search(final String[] array, final int low, final int high, final String x) {
        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (array[mid].isEmpty()) {
            mid = findClosestNonEmptyStringIndex(array, low, mid, high);
        }

        if (mid == -1) {
            return -1;
        }

        if (array[mid].equals(x)) {
            return mid;
        }

        if (array[mid].compareTo(x) < 0)
            return search(array, mid + 1, high, x);

        return search(array, low, mid - 1, x);
    }

    private int findClosestNonEmptyStringIndex(final String[] array, final int low, final int mid, final int high) {
        int left = mid - 1;
        int right = mid + 1;

        while (true) {
            if (left < low && right > high) {
                break;
            }

            if (left >= low && !array[left].isEmpty()) {
                return left;
            }

            if (right <= high && !array[right].isEmpty()) {
                return right;
            }

            left--;
            right++;
        }

        return -1;
    }
}
