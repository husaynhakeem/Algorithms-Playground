package leetcode.problem_0041;

public class Solution {

    public int firstMissingPositive(int[] nums) {
        final int n = nums.length;

        // Ignore any num such that num <= 0 or num > n
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Mark any num such that 1 <= num <= n as present
        for (int i = 0; i < n; i++) {
            final int num = Math.abs(nums[i]);
            if (num > n) {
                continue;
            }
            nums[num - 1] = -1 * Math.abs(nums[num - 1]);
        }

        // Find first non negative number
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        return (n+1);
    }
}
