package cracking_the_coding_interview.chapter_04.exercise_10;

import Utilities.java.TreeUtils.Node;

class Solution_3 {

    boolean checkIfSubtree(final Node node1, final Node node2) {
        if (node2 == null) {
            return true;
        }
        return areTreesIdentical(node1, node2);
    }

    private boolean areTreesIdentical(final Node node1, final Node node2) {
        if (node1 == null) {
            return false;
        }

        if (node1.val == node2.val && doSubtreesMatch(node1, node2)) {
            return true;
        }

        return areTreesIdentical(node1.left, node2) || areTreesIdentical(node1.right, node2);
    }

    private boolean doSubtreesMatch(final Node node1, final Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        if (node1.val != node2.val) {
            return false;
        }

        return doSubtreesMatch(node1.left, node2.left) && doSubtreesMatch(node1.right, node2.right);
    }
}
