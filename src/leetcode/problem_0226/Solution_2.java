package leetcode.problem_0226;

public class Solution_2 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        final TreeNode rightInverted = invertTree(root.right);
        final TreeNode leftInverted = invertTree(root.left);

        root.left = rightInverted;
        root.right = leftInverted;

        return root;
    }
}
