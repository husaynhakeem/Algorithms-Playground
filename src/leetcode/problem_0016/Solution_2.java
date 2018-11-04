package leetcode.problem_0016;

import java.util.Arrays;

class Solution_2 {

    int threeSumClosest(final int[] array, final int target) {
        final int length = array.length;

        if (length < 3) {
            return 0;
        }

        Arrays.sort(array);

        int result = target >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        for (int i = 0; i < length - 2; i++) {
            final int twoSumResult = twoSumClosest(array, i + 1, target - array[i]);
            if (Math.abs(result - target) > Math.abs(twoSumResult + array[i] - target)) {
                result = twoSumResult + array[i];
            }

            if (result == target) {
                break;
            }
        }

        return result;
    }

    private int twoSumClosest(final int[] array, final int startIndex, final int target) {
        int start = startIndex;
        int end = array.length - 1;
        int result = target >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        while (start < end) {
            final int sum = array[start] + array[end];

            if (sum == target) {
                result = sum;
                break;
            }

            if (Math.abs(result - target) > Math.abs(sum - target)) {
                result = sum;
            }

            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return result;
    }
}
