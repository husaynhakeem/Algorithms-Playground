package leetcode.problem_0169;

public class Solution {

    public int majorityElement(int[] nums) {
        // Boyer-Moore approach

        Integer candidate = null;
        int count = 0;

        for (int num: nums) {
            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
