package leetcode.problem_0027;

class Solution {

    int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }

        final int length = nums.length;
        int numberOfShifts = 0;

        int index = 0;
        while (index < length - numberOfShifts) {
            if (nums[index] == val) {
                shift(nums, index, length - numberOfShifts);
                numberOfShifts++;
            } else {
                index++;
            }
        }

        return nums.length - numberOfShifts;
    }

    private void shift(final int[] nums, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }
}
