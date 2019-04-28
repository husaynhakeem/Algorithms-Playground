package leetcode.problem_0719;

public class Solution {

    private static final int MAX_NUM = 1_000_000;

    int smallestDistancePair(final int[] nums, final int k) {
        final int[] diffs = new int[MAX_NUM + 1];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                diffs[Math.abs(nums[i] - nums[j])]++;
            }
        }

        int count = 0;
        int i = 0;
        while (i < diffs.length && count < k) {
            count += diffs[i++];
        }

        return i - 1;
    }
}
