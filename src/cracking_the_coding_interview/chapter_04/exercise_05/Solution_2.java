package cracking_the_coding_interview.chapter_04.exercise_05;

import Utilities.java.TreeUtils.Node;

class Solution_2 {

    /**
     * I assume all elements in the Binary tree are unique
     */
    boolean isValidBST(final Node node, final int size) {
        int[] array = copyBSTToArray(node, size);
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private int index = 0;

    private int[] copyBSTToArray(final Node node, final int size) {
        index = 0;
        final int[] array = new int[size];
        copyBSTToArray(node, array);
        return array;
    }

    private void copyBSTToArray(final Node node, final int[] array) {
        if (node == null) {
            return;
        }
        copyBSTToArray(node.left, array);
        array[index++] = node.val;
        copyBSTToArray(node.right, array);
    }
}
