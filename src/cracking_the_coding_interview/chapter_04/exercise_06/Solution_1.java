package cracking_the_coding_interview.chapter_04.exercise_06;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    static class Node {
        int val;
        Node right;
        Node left;
        Node parent;

        Node(int val) {
            this.val = val;
        }
    }

    Node findSuccessor(@NotNull final Node node) {
        final List<Node> nodes = BuildNodesListFromRoot(node);
        final int index = nodes.indexOf(node);
        if (index < nodes.size() - 1) {
            return nodes.get(index + 1);
        }
        return null;
    }

    private List<Node> BuildNodesListFromRoot(@NotNull final Node node) {
        return buildNodesList(getRoot(node));
    }

    private Node getRoot(Node node) {
        while (node != null && node.parent != null) {
            node = node.parent;
        }
        return node;
    }

    private List<Node> buildNodesList(@NotNull final Node root) {
        final List<Node> nodes = new ArrayList<>();
        buildNodesList(nodes, root);
        return nodes;
    }

    private void buildNodesList(final List<Node> nodes, final Node node) {
        if (node == null) {
            return;
        }
        buildNodesList(nodes, node.left);
        nodes.add(node);
        buildNodesList(nodes, node.right);
    }
}
