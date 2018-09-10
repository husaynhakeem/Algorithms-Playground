package cracking_the_coding_interview.chapter_04.exercise_03;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import java.util.List;

import static Utilities.java.ListUtils.areEqual;
import static Utilities.java.ListUtils.createList;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void listOfDepths() throws Exception {
        final Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.left = node2;
        Node node3 = new Node(3);
        node1.right = node3;
        Node node4 = new Node(4);
        node1.left.left = node4;
        Node node5 = new Node(5);
        node1.left.right = node5;
        Node node6 = new Node(6);
        node1.right.left = node6;
        Node node7 = new Node(7);
        node1.right.right = node7;

        final List<List<Node>> result = solution.listOfDepths(node1);

        assertTrue(areEqual(createList(node1), result.get(0)));
        assertTrue(areEqual(createList(node2, node3), result.get(1)));
        assertTrue(areEqual(createList(node4, node5, node6, node7), result.get(2)));
    }
}