package leetcode.problem_0078;

import java.util.ArrayList;
import java.util.List;

public class Solution_2 {

    public List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> subsets = new ArrayList<>();
        subsets(subsets, nums, 0, new ArrayList<>());
        return subsets;
    }

    private void subsets(List<List<Integer>> subsets, int[] nums, int from, List<Integer> subset) {
        subsets.add(new ArrayList<>(subset));
        for (int i = from; i < nums.length; i++) {
            subset.add(nums[i]);
            subsets(subsets, nums, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }
}
