package leetcode.problem_0090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> subsets = new ArrayList<>();
        subsets(nums, subsets, new ArrayList<>(), 0);
        return subsets;
    }

    private void subsets(int[] nums, List<List<Integer>> subsets, List<Integer> subset, int from) {
        subsets.add(new ArrayList<>(subset));
        for (int i = from; i < nums.length; i++) {
            // TODO: Skip duplicates
            if (i > from && nums[i] == nums[i - 1]) {
                continue;
            }

            subset.add(nums[i]);
            subsets(nums, subsets, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
