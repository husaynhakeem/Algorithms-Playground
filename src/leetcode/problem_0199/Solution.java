package leetcode.problem_0199;

import Utilities.java.TreeUtils.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<Integer> rightSideView(Node root) {
        final List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }

        final Queue<Node> nodes = new LinkedList<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            final int size = nodes.size();
            for (int i = 0; i < size; i++) {
                final Node node = nodes.poll();
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
                if (i == size - 1) {
                    results.add(node.val);
                }
            }
        }

        return results;
    }
}
