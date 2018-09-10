package cracking_the_coding_interview.chapter_04.exercise_03;

import Utilities.java.TreeUtils.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_1 {

    List<List<Node>> listOfDepths(Node root) {
        final List<List<Node>> allDepths = new ArrayList<>();
        listOfDepths(allDepths, 0, root);
        return allDepths;
    }

    private void listOfDepths(final List<List<Node>> allDepths, final int depth, final Node node) {
        if (node == null) {
            return;
        }

        if (allDepths.size() == depth) {
            allDepths.add(depth, new LinkedList<>());
        }

        allDepths.get(depth).add(node);
        listOfDepths(allDepths, depth + 1, node.left);
        listOfDepths(allDepths, depth + 1, node.right);
    }
}