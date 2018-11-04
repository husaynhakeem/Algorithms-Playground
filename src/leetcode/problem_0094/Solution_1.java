package leetcode.problem_0094;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    List<Integer> inorderTraversal(Node root) {
        final List<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root, result);
        return result;
    }

    private void inorderTraversalHelper(final Node node, final List<Integer> list) {
        if (node != null) {
            inorderTraversalHelper(node.left, list);
            list.add(node.value);
            inorderTraversalHelper(node.right, list);
        }
    }
}
