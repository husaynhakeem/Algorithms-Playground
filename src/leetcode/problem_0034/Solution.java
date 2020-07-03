package leetcode.problem_0034;

public class Solution {

    public int[] searchRange(int[] array, int target) {
        int first = searchFirst(array, target);
        int last = searchLast(array, target);
        return new int[]{first, last};
    }

    private int searchFirst(int[] array, int target) {
        int index = -1;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                index = mid;
                right = mid - 1;
            }
        }

        return index;
    }

    private int searchLast(int[] array, int target) {
        int index = -1;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                index = mid;
                left = mid + 1;
            }
        }

        return index;
    }
}
