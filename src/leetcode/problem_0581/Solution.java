package leetcode.problem_0581;

public class Solution {

    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                min = Math.min(min, nums[i + 1]);
            }
        }

        if (min == Integer.MAX_VALUE) {
            // Array is sorted
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                max = Math.max(max, nums[i - 1]);
            }
        }

        int from = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) {
                from = i;
                break;
            }
        }

        int to = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < max) {
                to = i;
                break;
            }
        }

        return to - from + 1;
    }
}
