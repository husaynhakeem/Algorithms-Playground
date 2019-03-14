package leetcode.problem_0297;

import Utilities.java.TreeUtils.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private static final String DELIMITER = ",";
    private static final String NULL = "null";

    String serialize(Node root) {
        final StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(final Node node, final StringBuilder sb) {
        if (node == null) {
            sb.append(NULL).append(DELIMITER);
            return;
        }
        sb.append(node.val).append(DELIMITER);
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    Node deserialize(String data) {
        final List<String> strings = Arrays.asList(data.split(DELIMITER));
        final LinkedList<String> queue = new LinkedList<>(strings);
        return deserializeHelper(queue);
    }

    private Node deserializeHelper(final LinkedList<String> queue) {
        if (queue.isEmpty()) {
            return null;
        }

        final String string = queue.pollFirst();
        if (string.equals(NULL)) {
            return null;
        }

        final Node root = new Node(Integer.parseInt(string));
        root.left = deserializeHelper(queue);
        root.right = deserializeHelper(queue);

        return root;
    }
}
