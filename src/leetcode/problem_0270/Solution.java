package leetcode.problem_0270;

import Utilities.java.TreeUtils.Node;

public class Solution {

    int closestValue(Node root, double target) {
        Integer result = null;

        while (root != null) {
            if (result == null || (Math.abs(root.val - target) < Math.abs(result - target))) {
                result = root.val;
            }
            root = root.val < target ? root.right : root.left;
        }

        return result == null ? 0 : result;
    }
}
