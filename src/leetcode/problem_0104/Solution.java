package leetcode.problem_0104;

import Utilities.java.TreeUtils.Node;

public class Solution {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }

        final int maxDepthLeft = maxDepth(node.left);
        final int maxDepthRight = maxDepth(node.right);
        return 1 + Math.max(maxDepthLeft, maxDepthRight);
    }
}
