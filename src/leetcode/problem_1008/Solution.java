package leetcode.problem_1008;

import Utilities.java.TreeUtils.Node;

public class Solution {

    Node bstFromPreorder(final int[] preorder) {
        return bstFromPreorderHelper(preorder, 0, preorder.length - 1);
    }

    private Node bstFromPreorderHelper(final int[] pre, final int start, final int end) {
        if (start > end) {
            return null;
        }

        final Node root = new Node(pre[start]);

        if (start == end) {
            return root;
        }

        final int rightSubtreeRootIndex = findRightSubtreeRootIndex(pre, root.val, start + 1, end);

        Node left = null;
        if (rightSubtreeRootIndex != start + 1) {
            if (rightSubtreeRootIndex == -1) {
                left = bstFromPreorderHelper(pre, start + 1, end);
            } else {
                left = bstFromPreorderHelper(pre, start + 1, rightSubtreeRootIndex - 1);
            }
        }

        Node right = null;
        if (rightSubtreeRootIndex != -1) {
            right = bstFromPreorderHelper(pre, rightSubtreeRootIndex, end);
        }

        root.left = left;
        root.right = right;
        return root;
    }

    private int findRightSubtreeRootIndex(final int[] array, final int min, final int start, final int end) {
        for (int i = start; i <= end; i++) {
            if (array[i] > min) {
                return i;
            }
        }
        return -1;
    }
}
