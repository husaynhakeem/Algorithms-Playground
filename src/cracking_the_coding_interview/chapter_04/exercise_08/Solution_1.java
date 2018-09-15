package cracking_the_coding_interview.chapter_04.exercise_08;

import org.jetbrains.annotations.NotNull;

class Solution_1 {

    static class Node {
        int value;
        Node left;
        Node right;
        Node parent;

        Node(int value) {
            this.value = value;
        }
    }

    Node findFirstCommonAncestor(@NotNull final Node node1, @NotNull final Node node2) {
        final int level1 = getNodeLevel(node1);
        final int level2 = getNodeLevel(node2);

        Node parent1 = level1 <= level2 ? node1 : getParentNodeNLevelsUp(node1, level1 - level2);
        Node parent2 = level2 <= level1 ? node2 : getParentNodeNLevelsUp(node2, level2 - level1);

        while (parent1 != parent2) {
            parent1 = parent1.parent;
            parent2 = parent2.parent;
        }

        return parent1;
    }

    private int getNodeLevel(@NotNull final Node node) {
        Node temp = node;
        int level = 0;

        while (temp.parent != null) {
            temp = temp.parent;
            level++;
        }

        return level;
    }

    private Node getParentNodeNLevelsUp(@NotNull final Node node, final int n) {
        Node parent = node;

        for (int i = 0; i < n; i++) {
            parent = parent.parent;
        }

        return parent;
    }
}
