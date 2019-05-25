package leetcode.interview_amazon_4.problem_2;

import Utilities.java.TreeUtils.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    Node lowestCommonAncestor(Node root, Node p, Node q) {
        final List<Node> pathToP = pathTo(root, p);
        final List<Node> pathToQ = pathTo(root, q);

        final int length = Math.min(pathToP.size(), pathToQ.size());
        int index = 0;
        while (index < length && pathToP.get(index).val == pathToQ.get(index).val) {
            index++;
        }

        return pathToP.get(index - 1);
    }

    private List<Node> pathTo(final Node root, final Node target) {
        final List<Node> list = new ArrayList<>();
        pathToHelper(root, target, list);
        return list;
    }

    private boolean pathToHelper(final Node node, final Node target, final List<Node> list) {
        if (node == null) {
            return false;
        }

        list.add(node);

        if (node.val == target.val) {
            return true;
        }

        if (!pathToHelper(node.left, target, list)) {
            final boolean found = pathToHelper(node.right, target, list);
            if (found) {
                return true;
            }

            list.remove(node);
            return false;
        }

        return true;
    }
}
