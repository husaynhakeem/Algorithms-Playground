package leetcode.problem_0724;

class Solution {

    int pivotIndex(int[] nums) {
        final int sum = sum(nums);
        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                leftSum += nums[i - 1];
            }
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    private int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
