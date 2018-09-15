package cracking_the_coding_interview.chapter_04.exercise_08;

import Utilities.java.TreeUtils.Node;

class Solution_2 {

    Node findFirstCommonAncestor(final Node root, final Node node1, final Node node2) {
        if (root == null || root == node1 || root == node2) {
            return root;
        }

        final boolean node1IsOnLeft = covers(root.left, node1);
        final boolean node2IsOnLeft = covers(root.left, node2);

        if (node1IsOnLeft == node2IsOnLeft) {
            return findFirstCommonAncestor(
                    node1IsOnLeft ? root.left : root.right,
                    node1,
                    node2);
        }

        return root;
    }

    private boolean covers(final Node root, final Node node) {
        if (root == null) {
            return false;
        }

        if (root == node) {
            return true;
        }

        return covers(root.left, node) || covers(root.right, node);
    }
}
