package leetcode.problem_0098;

import Utilities.java.TreeUtils.Node;

public class Solution_2 {

    boolean isValidBST(Node root) {
        return isValidBSTHelper(root, null, null);
    }

    private boolean isValidBSTHelper(final Node node, final Integer min, final Integer max) {
        if (node == null) {
            return true;
        }

        if ((min == null || min < node.val) && (max == null || node.val < max)) {
            return isValidBSTHelper(node.left, min, min(max, node.val))
                    && isValidBSTHelper(node.right, max(min, node.val), max);
        }

        return false;
    }

    private Integer min(final Integer a, final Integer b) {
        if (a != null && b != null) {
            return Math.min(a, b);
        }
        return a == null ? b : a;
    }

    private Integer max(final Integer a, final Integer b) {
        if (a != null && b != null) {
            return Math.max(a, b);
        }
        return a == null ? b : a;
    }
}
