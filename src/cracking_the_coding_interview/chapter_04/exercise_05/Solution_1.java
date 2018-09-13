package cracking_the_coding_interview.chapter_04.exercise_05;

import Utilities.java.TreeUtils.Node;

class Solution_1 {

    boolean isValidBST(final Node node) {
        return isValidBST(node, null, null);
    }

    private boolean isValidBST(final Node node, final Integer min, final Integer max) {
        if (node == null)
            return true;

        if (min != null && node.val <= min)
            return false;

        if (max != null && node.val > max)
            return false;

        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
