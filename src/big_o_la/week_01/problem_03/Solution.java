package big_o_la.week_01.problem_03;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Solution {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    Node leastCommonAncestor(@NotNull final Node root, @NotNull final Node node1, @NotNull final Node node2) {
        final List<Node> pathToNode1 = pathToNode(root, node1);
        final List<Node> pathToNode2 = pathToNode(root, node2);

        int index1 = 0;
        int index2 = 0;

        while (index1 < pathToNode1.size() && index2 < pathToNode2.size() && pathToNode1.get(index1) == pathToNode2.get(index2)) {
            index1++;
            index2++;
        }

        return pathToNode1.get(index1 - 1);
    }

    private List<Node> pathToNode(@NotNull final Node root, @NotNull final Node target) {
        final List<Node> path = new ArrayList<>();
        pathToNodeHelper(root, target, path);
        return path;
    }

    private boolean pathToNodeHelper(final Node node, @NotNull final Node target, @NotNull final List<Node> path) {
        if (node == null) {
            return false;
        }

        path.add(node);

        if (node == target) {
            return true;
        }

        if (pathToNodeHelper(node.left, target, path)) {
            return true;
        }

        if (pathToNodeHelper(node.right, target, path)) {
            return true;
        }

        path.remove(node);
        return false;
    }
}
