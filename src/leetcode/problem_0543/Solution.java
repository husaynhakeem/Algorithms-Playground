package leetcode.problem_0543;

import Utilities.java.TreeUtils.Node;

public class Solution {

    public int diameterOfBinaryTree(Node root) {
        final Result result = new Result();
        diameterOfBinaryTree(root, result);
        return result.diameter;
    }

    private int diameterOfBinaryTree(Node node, Result result) {
        int distanceToLeafLeft = node.left == null ? -1 : diameterOfBinaryTree(node.left, result);
        int distanceToLeafRight = node.right == null ? -1 : diameterOfBinaryTree(node.right, result);
        result.diameter = Math.max(result.diameter, 2 + distanceToLeafLeft + distanceToLeafRight);
        return 1 + Math.max(distanceToLeafLeft, distanceToLeafRight);
    }

    static class Result {
        int diameter = 0;
    }
}
