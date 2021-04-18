package leetcode.problem_0034;

public class Solution_2 {

    public int[] searchRange(int[] array, int target) {
        return searchRange(array, 0, array.length - 1, target);
    }

    private int[] searchRange(int[] array, int from, int to, int target) {
        if (from > to) {
            return new int[]{-1, -1};
        }

        final int middle = from + (to - from) / 2;
        if (target > array[middle]) {
            return searchRange(array, middle + 1, to, target);
        }

        if (target < array[middle]) {
            return searchRange(array, from, middle - 1, target);
        }

        // target == array[middle]
        int start = middle;
        while (start > 0 && array[start - 1] == target) {
            start--;
        }

        int end = middle;
        while (end < (array.length - 1) && array[end + 1] == target) {
            end++;
        }

        return new int[]{start, end};
    }
}
