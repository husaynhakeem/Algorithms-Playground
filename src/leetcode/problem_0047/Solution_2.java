package leetcode.problem_0047;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_2 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        final Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            final int frequency = frequencies.getOrDefault(num, 0);
            frequencies.put(num, frequency + 1);
        }

        final List<List<Integer>> permutations = new ArrayList<>();
        permuteHelper(nums, new ArrayList<>(), frequencies, permutations);
        return permutations;
    }

    private void permuteHelper(int[] nums, List<Integer> permutation, Map<Integer, Integer> frequencies, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            final int num = entry.getKey();
            final int frequency = entry.getValue();

            if (frequency == 0) {
                continue;
            }

            permutation.add(num);
            frequencies.put(num, frequency - 1);

            permuteHelper(nums, permutation, frequencies, permutations);

            permutation.remove(permutation.size() - 1);
            frequencies.put(num, frequency);
        }
    }
}
