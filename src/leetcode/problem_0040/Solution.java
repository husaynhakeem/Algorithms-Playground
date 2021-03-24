package leetcode.problem_0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> results = new ArrayList<>();
        combinationSum(candidates, target, results, new ArrayList<>(), 0);
        return results;
    }

    private void combinationSum(int[] candidates, int target, List<List<Integer>> results, List<Integer> combination, int from) {
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = from; i < candidates.length; i++) {
            int candidate = candidates[i];

            // Skip duplicates
            if (i > from && candidate == candidates[i - 1]) {
                continue;
            }

            combination.add(candidate);
            combinationSum(candidates, target - candidate, results, combination, i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}
