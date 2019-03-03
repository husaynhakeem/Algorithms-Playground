package leetcode.problem_0938;

import Utilities.java.TreeUtils;

public class Solution {

    int rangeSumBST(TreeUtils.Node root, int L, int R) {
        return rangeSumBSTHelper(root, 0, L, R);
    }

    private int rangeSumBSTHelper(final TreeUtils.Node node, final int sum, final int min, final int max) {
        if (node == null) {
            return sum;
        }

        if (node.val < min) {
            return rangeSumBSTHelper(node.right, sum, min, max);
        }

        if (node.val > max) {
            return rangeSumBSTHelper(node.left, sum, min, max);
        }

        final int newSum = rangeSumBSTHelper(node.left, sum + node.val, min, max);
        return rangeSumBSTHelper(node.right, newSum, min, max);
    }
}
