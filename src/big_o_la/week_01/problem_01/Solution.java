package big_o_la.week_01.problem_01;

import org.jetbrains.annotations.NotNull;

class Solution {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    boolean isBST(final Node root) {
        return isBST(root, null, null);
    }

    private boolean isBST(final Node node, final Integer min, final Integer max) {
        if (node == null) {
            return true;
        }

        if (min != null && node.val <= min) {
            return false;
        }

        if (max != null && max < node.val) {
            return false;
        }

        return isBST(node.left, min, max(max, node.val)) && isBST(node.right, min(min, node.val), max);
    }

    private Integer min(final Integer a, @NotNull final Integer b) {
        return a == null ? b : Math.min(a, b);
    }

    private Integer max(final Integer a, @NotNull final Integer b) {
        return a == null ? b : Math.max(a, b);
    }
}
