package leetcode.problem_0510;

public class Solution {

    Node inorderSuccessor(final Node x) {
        if (x == null) {
            return null;
        }

        Node right = x.right;
        while (right != null && right.left != null) {
            right = right.left;
        }
        if (right != null) {
            return right;
        }

        Node parent = x.parent;
        Node child = x;
        while (parent != null && parent.right == child) {
            child = parent;
            parent = parent.parent;
        }
        return parent;
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;

        Node(final int val, final Node parent) {
            this.val = val;
            this.parent = parent;
        }
    }
}
