package leetcode.interview_microsoft_2.problem_1;

import Utilities.java.TreeUtils.Node;

public class Solution {

    Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == p || root == q) {
            return root;
        }

        final boolean isPInRightSubTree = isTargetInTree(root.right, p);
        final boolean isQInRightSubTree = isTargetInTree(root.right, q);

        if (isPInRightSubTree && isQInRightSubTree) {
            return lowestCommonAncestor(root.right, p, q);
        }

        if (!isPInRightSubTree && !isQInRightSubTree) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return root;
    }

    private boolean isTargetInTree(final Node node, final Node target) {
        if (node == null) {
            return false;
        }

        if (target == node) {
            return true;
        }

        return isTargetInTree(node.left, target) || isTargetInTree(node.right, target);
    }
}
