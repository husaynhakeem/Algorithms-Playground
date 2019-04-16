package leetcode.problem_0285;

import Utilities.java.GraphUtils.TreeNode;

public class Solution {

    TreeNode inorderSuccessor(TreeNode node, TreeNode p) {
        if (node == null) {
            return null;
        }

        if (node.data > p.data) {
            final TreeNode left = inorderSuccessor(node.left, p);
            return left == null ? node : left;
        } else {
            return inorderSuccessor(node.right, p);
        }
    }
}
