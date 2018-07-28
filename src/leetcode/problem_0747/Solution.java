package leetcode.problem_0747;

class Solution {

    int dominantIndex(int[] nums) {
        if (nums == null) {
            return -1;
        }

        int max = -1;
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > max) {
                return -1;
            }
        }

        return maxIndex;
    }
}
