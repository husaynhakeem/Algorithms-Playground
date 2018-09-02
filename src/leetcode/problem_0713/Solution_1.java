package leetcode.problem_0713;

class Solution_1 {

    int numSubarrayProductLessThanK(int[] nums, int k) {
        final int length = nums.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] >= k) {
                continue;
            }

            count++;
            int product = nums[i];
            int j = i + 1;

            while (j < length && (product *= nums[j]) < k) {
                count++;
                j++;
            }
        }

        return count;
    }
}
