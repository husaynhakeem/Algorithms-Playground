package cracking_the_coding_interview.chapter_04.exercise_10;

import Utilities.java.TreeUtils.Node;

class Solution_2 {

    boolean checkIfSubtree(final Node node1, final Node node2) {
        final String node1PreOrderString = getPreOrderString(node1);
        final String node2PreOrderString = getPreOrderString(node2);
        return node1PreOrderString.contains(node2PreOrderString);
    }

    private String getPreOrderString(final Node node) {
        final StringBuilder stringBuilder = new StringBuilder();
        getPreOrderString(node, stringBuilder);
        return stringBuilder.toString();
    }

    private void getPreOrderString(final Node node, final StringBuilder stringBuilder) {
        if (node == null) {
            stringBuilder.append('X');
            return;
        }
        stringBuilder.append(node.val);
        getPreOrderString(node.left, stringBuilder);
        getPreOrderString(node.right, stringBuilder);
    }
}
