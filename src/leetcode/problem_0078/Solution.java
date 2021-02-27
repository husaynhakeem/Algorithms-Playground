package leetcode.problem_0078;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int num: nums) {
            // Create list to contains current subsets with current num
            final List<List<Integer>> subsetsWithCurrent = new ArrayList<>();

            // Create these new subsets
            for (List<Integer> subset: subsets) {
                final List<Integer> subsetWithCurrent = new ArrayList<>(subset);
                subsetWithCurrent.add(num);
                subsetsWithCurrent.add(subsetWithCurrent);
            }

            // Add these new subsets to all the subsets
            subsets.addAll(subsetsWithCurrent);
        }

        return subsets;
    }
}
