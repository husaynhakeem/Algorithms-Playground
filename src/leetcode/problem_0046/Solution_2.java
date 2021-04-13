package leetcode.problem_0046;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution_2 {

    public List<List<Integer>> permute(int[] nums) {
        final List<List<Integer>> permutations = new ArrayList<>();
        permuteHelper(nums, new ArrayList<>(), new HashSet<>(), permutations);
        return permutations;
    }

    private void permuteHelper(int[] nums, List<Integer> permutation, HashSet<Integer> seen, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for (int num : nums) {
            if (seen.contains(num)) {
                continue;
            }

            seen.add(num);
            permutation.add(num);
            permuteHelper(nums, permutation, seen, permutations);
            permutation.remove(permutation.size() - 1);
            seen.remove(num);
        }
    }
}
