package cracking_the_coding_interview.chapter_04.exercise_04;

import Utilities.java.TreeUtils.Node;

class Solution_2 {

    boolean checkBalanced(Node node) {
        return numberOfNodesFrom(node) != Integer.MIN_VALUE;
    }

    private int numberOfNodesFrom(Node node) {
        if (node == null) {
            return 0;
        }

        final int leftHeight = numberOfNodesFrom(node.left);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        final int rightHeight = numberOfNodesFrom(node.right);
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return Integer.MIN_VALUE;
        }

        return 1 + leftHeight + rightHeight;
    }
}
