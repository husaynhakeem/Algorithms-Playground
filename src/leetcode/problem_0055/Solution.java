package leetcode.problem_0055;

public class Solution {

    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int i = 0; // Index to run through nums
        while (i <= maxReach && maxReach < nums.length) {
            maxReach = Math.max(maxReach, i + nums[i]);
            i++;
        }
        return maxReach >= nums.length - 1;
    }
}
