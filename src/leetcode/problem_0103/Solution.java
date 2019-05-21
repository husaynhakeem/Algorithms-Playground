package leetcode.problem_0103;

import Utilities.java.TreeUtils.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> zigzagLevelOrder(Node root) {
        final List<List<Integer>> levels = new ArrayList<>();
        levels(root, 0, levels);
        return levels;
    }

    private void levels(final Node node, final int level, final List<List<Integer>> levels) {
        if (node == null) {
            return;
        }

        if (level == levels.size()) {
            levels.add(new ArrayList<>());
        }

        if (level % 2 == 0) {
            levels.get(level).add(node.val);
        } else {
            levels.get(level).add(0, node.val);
        }

        levels(node.left, level + 1, levels);
        levels(node.right, level + 1, levels);
    }
}
