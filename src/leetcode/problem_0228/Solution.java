package leetcode.problem_0228;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> summaryRanges(int[] nums) {
        final List<String> result = new ArrayList<>();
        final int length = nums.length;

        int i = 0;
        while (i < length) {
            Integer max = null;
            int j = i + 1;

            while (j < length && nums[j] - nums[j - 1] == 1) {
                max = nums[j];
                j++;
            }

            if (max == null) {
                result.add(String.valueOf(nums[i]));
            } else {
                result.add(nums[i] + "->" + max);
            }

            i = j;
        }

        return result;
    }
}
