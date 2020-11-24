package cracking_the_coding_interview.chapter_04.exercise_05;

import Utilities.java.TreeUtils.Node;

public class Solution_3 {

    boolean isValidBST(Node root) {
        return isValidBSTInternal(root).isBST;
    }

    private Result isValidBSTInternal(Node node) {
        if (node == null) {
            return new Result(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        final Result leftResult = isValidBSTInternal(node.left);
        if (!leftResult.isBST || node.val < leftResult.max) {
            return new Result(false, 0, 0);
        }

        final Result rightResult = isValidBSTInternal(node.right);
        if (!rightResult.isBST || node.val >= rightResult.min) {
            return new Result(false, 0, 0);
        }

        return new Result(true,
                Math.max(node.val, rightResult.max),
                Math.min(node.val, leftResult.min));
    }

    static class Result {
        boolean isBST;
        int max;
        int min;

        public Result(boolean isBST, int max, int min) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }
}
