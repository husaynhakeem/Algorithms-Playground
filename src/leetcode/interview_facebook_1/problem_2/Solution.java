package leetcode.interview_facebook_1.problem_2;

public class Solution {

    int maxSubArrayLen(int[] nums, int k) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}
