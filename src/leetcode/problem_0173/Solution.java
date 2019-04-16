package leetcode.problem_0173;

import Utilities.java.GraphUtils.TreeNode;

import java.util.Stack;

public class Solution {

    static class BSTIterator {

        private Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            populate(root);
        }

        private void populate(final TreeNode node) {
            if (node != null) {
                stack.push(node);
                populate(node.left);
            }
        }

        public int next() {
            final TreeNode next = stack.pop();
            populate(next.right);
            return next.data;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
