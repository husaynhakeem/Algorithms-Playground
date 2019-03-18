package leetcode.problem_0222;

import Utilities.java.TreeUtils.Node;

public class Solution {

    int countNodes(final Node root) {
        return countNodesHelper(root, 0);
    }

    private int countNodesHelper(final Node node, final int nodesSoFar) {
        if (node == null) {
            return nodesSoFar;
        }

        final int nodesSoFarPlusLeftSubTree = countNodesHelper(node.left, nodesSoFar + 1);
        return countNodesHelper(node.right, nodesSoFarPlusLeftSubTree);
    }
}
