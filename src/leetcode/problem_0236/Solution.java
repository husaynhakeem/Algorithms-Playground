package leetcode.problem_0236;

import Utilities.java.TreeUtils.Node;

public class Solution {

    private Node lowestCommonAncestor = null;

    Node lowestCommonAncestor(final Node root, final Node p, final Node q) {
        helper(root, p, q);
        return lowestCommonAncestor;
    }

    private boolean helper(final Node node, final Node p, final Node q) {
        if (node == null) {
            return false;
        }

        final int current = (node == p || node == q) ? 1 : 0;
        final int left = helper(node.left, p, q) ? 1 : 0;
        final int right = helper(node.right, p, q) ? 1 : 0;

        if ((current + left + right) >= 2) {
            lowestCommonAncestor = node;
        }

        return (current + left + right) > 0;
    }
}
