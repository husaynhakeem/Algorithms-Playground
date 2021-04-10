package leetcode.problem_0114;

import Utilities.java.TreeUtils.Node;

public class Solution {

    public void flatten(Node root) {
        flattenHelper(root);
    }

    private Node flattenHelper(Node node) {
        if (node == null) {
            return null;
        }

        final Node lastLeft = flattenHelper(node.left);
        final Node lastRight = flattenHelper(node.right);

        if (lastLeft != null) {
            lastLeft.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        if (lastRight != null) {
            return lastRight;
        }

        if (lastLeft != null) {
            return lastLeft;
        }

        return node;
    }
}
