package leetcode.problem_0039;

import java.util.*;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); //. Sort in ascending order, to make traversal quit early

        final Set<List<Integer>> results = new HashSet<>();
        combinationSum(candidates, target, new ArrayList<>(), results);
        return new ArrayList<>(results);
    }

    private void combinationSum(int[] candidates, int target, List<Integer> combination, Set<List<Integer>> results) {
        if (target == 0) {
            addIfNotPresent(results, new ArrayList<>(combination));
            return;
        }

        if (target < 0) { // No-op. No possible combination
            return;
        }

        for (int candidate: candidates) {
            if (candidate > target) { // Stop, since candidates is sorted in increasing order
                return;
            }

            combination.add(candidate); // Add current candidate
            combinationSum(candidates, target - candidate, combination, results);
            combination.remove(combination.size() - 1); // Remove current candidate
        }
    }

    private void addIfNotPresent(Set<List<Integer>> lists, List<Integer> list) {
        for (List<Integer> aList: lists) {
            if (areListsEqual(list, aList)) {
                return;
            }
        }
        lists.add(list);
    }

    private boolean areListsEqual(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {
            return false;
        }

        Collections.sort(a);
        Collections.sort(b);

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return false;
            }
        }

        return true;
    }
}
