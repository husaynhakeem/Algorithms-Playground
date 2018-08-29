package leetcode.problem_0283;

class Solution {

    void moveZeroes(int[] nums) {
        final int length = nums.length;

        int zeroIndex = -1;
        int nonZeroIndex = -1;
        int runnerIndex = 0;

        while (runnerIndex < length) {
            zeroIndex = findZeroIndexAfter(runnerIndex, nums);
            nonZeroIndex = findNonZeroIndexAfter(zeroIndex, nums);

            if (zeroIndex == length || nonZeroIndex == length) {
                return;
            }

            final int temp = nums[zeroIndex];
            nums[zeroIndex] = nums[nonZeroIndex];
            nums[nonZeroIndex] = temp;

            runnerIndex = zeroIndex + 1;
        }
    }

    private int findZeroIndexAfter(final int index, final int[] array) {
        for (int i = index; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return array.length;
    }

    private int findNonZeroIndexAfter(final int index, final int[] array) {
        for (int i = index; i < array.length; i++) {
            if (array[i] != 0) {
                return i;
            }
        }
        return array.length;
    }
}
