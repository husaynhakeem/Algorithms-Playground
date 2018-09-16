package cracking_the_coding_interview.chapter_04.exercise_10;

import Utilities.java.TreeUtils.Node;

class Solution_1 {

    boolean checkIfSubtree(final Node node1, final Node node2) {
        return checkIfSubtree(node1, node2, getHeight(node1) - getHeight(node2) + 1);
    }

    private boolean checkIfSubtree(final Node node1, final Node node2, final int n) {
        if (n == 0 || node1 == null) {
            return false;
        }
        return areTreesIdentical(node1, node2) || checkIfSubtree(node1.left, node2, n - 1) || checkIfSubtree(node1.right, node2, n - 1);
    }

    private int getHeight(final Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    private boolean areTreesIdentical(final Node node1, final Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val && areTreesIdentical(node1.left, node2.left) && areTreesIdentical(node1.right, node2.right);
    }
}
