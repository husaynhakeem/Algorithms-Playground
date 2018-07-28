package leetcode.problem_0501;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int[] findMode(TreeNode root) {
        final Hashtable<Integer, Integer> valsAndOccurrences = new Hashtable<>();

        int maxOccurrence = findOccurrencesInTree(root, valsAndOccurrences, 0);

        final List<Integer> results = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : valsAndOccurrences.entrySet()) {
            if (entry.getValue() == maxOccurrence) {
                results.add(entry.getKey());
            }
        }

        final int[] resultsArray = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            resultsArray[i] = results.get(i);
        }

        return resultsArray;
    }

    private int findOccurrencesInTree(TreeNode node, Hashtable<Integer, Integer> valsAndOccurrences, int max) {
        if (node == null) {
            return max;
        }

        int val = node.val;
        int occurrences;

        if (valsAndOccurrences.containsKey(val)) {
            occurrences = valsAndOccurrences.get(val) + 1;
        } else {
            occurrences = 1;
        }
        valsAndOccurrences.put(val, occurrences);

        int newMax = occurrences > max ? occurrences : max;
        return Math.max(findOccurrencesInTree(node.left, valsAndOccurrences, newMax),
                findOccurrencesInTree(node.right, valsAndOccurrences, newMax));
    }
}
