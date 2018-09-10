package cracking_the_coding_interview.chapter_04.exercise_04;

import Utilities.java.TreeUtils.Node;

class Solution_1 {

    boolean checkBalanced(final Node node) {
        if (node == null) {
            return true;
        }
        boolean currentLevelIsBalanced = Math.abs(numberOfNodesFrom(node.left) - numberOfNodesFrom(node.right)) <= 1;
        return currentLevelIsBalanced && checkBalanced(node.left) && checkBalanced(node.right);
    }

    private int numberOfNodesFrom(final Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + numberOfNodesFrom(node.left) + numberOfNodesFrom(node.right);
    }
}
