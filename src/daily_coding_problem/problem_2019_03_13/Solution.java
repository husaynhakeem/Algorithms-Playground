package daily_coding_problem.problem_2019_03_13;

import Utilities.java.TreeUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private static final String DELIMITER = ",";
    private static final String NULL = "null";

    String serialize(TreeUtils.Node root) {
        final StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(final TreeUtils.Node node, final StringBuilder sb) {
        if (node == null) {
            sb.append(NULL).append(DELIMITER);
            return;
        }
        sb.append(node.val).append(DELIMITER);
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    TreeUtils.Node deserialize(String data) {
        final List<String> strings = Arrays.asList(data.split(DELIMITER));
        final LinkedList<String> queue = new LinkedList<>(strings);
        return deserializeHelper(queue);
    }

    private TreeUtils.Node deserializeHelper(final LinkedList<String> queue) {
        if (queue.isEmpty()) {
            return null;
        }

        final String string = queue.pollFirst();
        if (string.equals(NULL)) {
            return null;
        }

        final TreeUtils.Node root = new TreeUtils.Node(Integer.parseInt(string));
        root.left = deserializeHelper(queue);
        root.right = deserializeHelper(queue);

        return root;
    }
}
