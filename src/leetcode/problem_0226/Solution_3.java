package leetcode.problem_0226;

import java.util.LinkedList;
import java.util.Queue;

class Solution_3 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode invertTree(TreeNode root) {
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();

            final TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
        }
        return root;
    }
}
