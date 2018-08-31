package leetcode.problem_0226;

public class Solution_1 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode invertTree(TreeNode root) {
        invertTreeNode(root);
        return root;
    }

    private void invertTreeNode(final TreeNode node) {
        if (node == null) {
            return;
        }

        final TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertTreeNode(node.left);
        invertTreeNode(node.right);
    }
}
