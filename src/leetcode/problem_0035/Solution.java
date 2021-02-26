package leetcode.problem_0035;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        final int size = nums.length;

        // Empty array, return first index
        if (size == 0) {
            return 0;
        }

        // First item is greater than the target, return first index
        if (nums[0] > target) {
            return 0;
        }

        // Target is greater than all elements, return length
        if (nums[size - 1] < target) {
            return size;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        // Execution shouldn't reach this point
        throw new IllegalStateException("Target " + target + " not handled correctly.");
    }
}
