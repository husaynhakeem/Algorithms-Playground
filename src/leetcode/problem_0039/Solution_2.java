package leetcode.problem_0039;

import java.util.*;

public class Solution_2 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); //. Sort in ascending order, to make traversal quit early

        final Set<List<Integer>> results = new HashSet<>();
        combinationSum(candidates, target, new ArrayList<>(), results, 0);
        return new ArrayList<>(results);
    }

    private void combinationSum(int[] candidates, int target, List<Integer> combination, Set<List<Integer>> results, int start) {
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0) { // No-op. No possible combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int candidate = candidates[i];
            combination.add(candidate); // Add current candidate
            combinationSum(candidates, target - candidate, combination, results, i);
            combination.remove(combination.size() - 1); // Remove current candidate
        }
    }
}
