package cracking_the_coding_interview.chapter_04.exercise_12;

import Utilities.java.TreeUtils.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution_1 {

    private class IntWrapper {
        int val = 0;
    }

    int getNumberOfPathsWithSum(final Node root, final int n) {
        final IntWrapper resultWrapper = new IntWrapper();

        final Queue<Node> allNodes = new LinkedList<>();
        allNodes.add(root);

        while (!allNodes.isEmpty()) {
            final Node node = allNodes.remove();
            dfs(node, n, resultWrapper);

            if (node.left != null) {
                allNodes.add(node.left);
            }

            if (node.right != null) {
                allNodes.add(node.right);
            }
        }

        return resultWrapper.val;
    }

    private void dfs(final Node node, final int n, final IntWrapper resultWrapper) {
        final List<Node> path = new ArrayList<>();
        dfs(node, 0, n, path, resultWrapper);
    }

    private void dfs(final Node node, int sum, final int n, final List<Node> path, final IntWrapper resultWrapper) {
        if (node == null) {
            return;
        }

        path.add(node);
        sum += node.val;

        if (sum == n) {
            resultWrapper.val++;
        }

        dfs(node.left, sum, n, path, resultWrapper);
        dfs(node.right, sum, n, path, resultWrapper);

        path.remove(node);
    }
}
