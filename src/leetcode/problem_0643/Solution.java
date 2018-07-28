package leetcode.problem_0643;

class Solution {

    double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return 0;
        }

        double maxAverage = -10_000 * k - 1;
        for (int i = 0; i <= nums.length - k; i++) {
            double average = subArrayAverage(nums, i, i + k - 1);
            if (average > maxAverage) {
                maxAverage = average;
            }
        }
        return maxAverage;
    }

    private double subArrayAverage(int[] array, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += array[i];
        }
        return ((double) sum) / (endIndex - startIndex + 1);
    }
}
