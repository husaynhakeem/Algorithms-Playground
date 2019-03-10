package leetcode.problem_0814;

import Utilities.java.TreeUtils.Node;

public class Solution {

    Node pruneTree(final Node root) {
        if (!pruneTreeHelper(root)) {
            return null;
        }
        return root;
    }

    private boolean pruneTreeHelper(final Node node) {
        if (node == null) {
            return false;
        }

        final boolean containsOne = node.val == 1;
        final boolean leftContainsOne = pruneTreeHelper(node.left);
        final boolean rightContainsOne = pruneTreeHelper(node.right);

        if (!leftContainsOne) node.left = null;
        if (!rightContainsOne) node.right = null;

        return containsOne || leftContainsOne || rightContainsOne;
    }
}
