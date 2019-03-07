package leetcode.problem_0797;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        final List<Integer> path = new ArrayList<>();
        final List<List<Integer>> allPaths = new ArrayList<>();
        allPathsSourceTargetHelper(0, path, allPaths, graph);
        return allPaths;
    }

    private void allPathsSourceTargetHelper(final int index, final List<Integer> currentPath, final List<List<Integer>> allPaths, final int[][] graph) {
        currentPath.add(index);

        if (index == graph.length - 1) {
            allPaths.add(currentPath);
        } else {
            for (int i : graph[index]) {
                allPathsSourceTargetHelper(i, copy(currentPath), allPaths, graph);
            }
        }
    }

    private List<Integer> copy(final List<Integer> list) {
        return new ArrayList<Integer>(list);
    }
}
