package leetcode.problem_0617;

class Solution {

    TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        final TreeNode root = new TreeNode(0);
        mergeTrees(root, t1, t2);
        return root;
    }

    private void mergeTrees(final TreeNode result, final TreeNode t1, final TreeNode t2) {
        result.val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);

        if ((t1 != null && t1.right != null) || (t2 != null && t2.right != null)) {
            result.right = new TreeNode(0);
            mergeTrees(result.right, t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        }

        if ((t1 != null && t1.left != null) || (t2 != null && t2.left != null)) {
            result.left = new TreeNode(0);
            mergeTrees(result.left, t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
