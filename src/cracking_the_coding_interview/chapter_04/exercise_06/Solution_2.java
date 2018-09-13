package cracking_the_coding_interview.chapter_04.exercise_06;

import org.jetbrains.annotations.NotNull;

public class Solution_2 {

    static class Node {
        int val;
        Node right;
        Node left;
        Node parent;

        Node(int val) {
            this.val = val;
        }
    }

    Node findSuccessor(@NotNull Node node) {
        if (node.right != null) {
            return leftMostChild(node.right);
        }

        Node parent = node.parent;
        while (parent != null && parent.right == node) {
            node = parent;
            parent = parent.parent;
        }
        return parent;
    }

    private Node leftMostChild(@NotNull Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
