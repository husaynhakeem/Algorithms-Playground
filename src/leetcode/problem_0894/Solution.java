package leetcode.problem_0894;

import Utilities.java.TreeUtils.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<Node> allPossibleFBT(final int n) {
        final Map<Integer, List<Node>> memo = new HashMap<>();
        return allPossibleFBTHelper(n, memo);
    }

    private List<Node> allPossibleFBTHelper(final int n, final Map<Integer, List<Node>> memo) {
        final List<Node> result = new ArrayList<>();

        if (n % 2 == 0) {
            return result;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n == 1) {
            result.add(new Node(0));
        } else {
            for (int i = 1; i < n - 1; i++) {
                final List<Node> allLeftFBT = allPossibleFBTHelper(i, memo);
                final List<Node> allRightFBT = allPossibleFBTHelper(n - 1 - i, memo);
                for (Node left : allLeftFBT) {
                    for (Node right : allRightFBT) {
                        final Node node = new Node(0);
                        node.left = left;
                        node.right = right;
                        result.add(node);
                    }
                }
            }
        }

        memo.put(n, result);
        return result;
    }
}
