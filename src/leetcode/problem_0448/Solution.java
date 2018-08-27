package leetcode.problem_0448;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            final int n = Math.abs(nums[i]) - 1;
            if (nums[n] > 0) {
                nums[n] = -nums[n];
            }
        }

        final List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}