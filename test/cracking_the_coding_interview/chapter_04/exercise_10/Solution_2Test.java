package cracking_the_coding_interview.chapter_04.exercise_10;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void checkIfSubtree_1() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(2);
        final Node node3 = new Node(3);
        final Node node4 = new Node(4);
        final Node node5 = new Node(5);
        final Node node6 = new Node(6);
        final Node node7 = new Node(7);
        final Node node8 = new Node(8);
        final Node node9 = new Node(9);
        final Node node10 = new Node(10);
        final Node node11 = new Node(11);
        final Node node12 = new Node(12);

        node11.left = node12;
        node10.right = node11;
        node6.right = node10;
        node5.right = node9;
        node4.left = node8;
        node3.right = node7;
        node3.left = node6;
        node2.right = node5;
        node2.left = node4;
        node1.right = node3;
        node1.left = node2;

        final boolean result = solution.checkIfSubtree(node1, node11);

        assertTrue(result);
    }

    @Test
    public void checkIfSubtree_2() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(2);
        final Node node3 = new Node(3);
        final Node node4 = new Node(4);
        final Node node5 = new Node(5);
        final Node node6 = new Node(6);
        final Node node7 = new Node(7);
        final Node node8 = new Node(8);
        final Node node9 = new Node(9);
        final Node node10 = new Node(10);
        final Node node11 = new Node(11);
        final Node node12 = new Node(12);

        node11.left = node12;
        node10.right = node11;
        node6.right = node10;
        node5.right = node9;
        node4.left = node8;
        node3.right = node7;
        node3.left = node6;
        node2.right = node5;
        node2.left = node4;
        node1.right = node3;
        node1.left = node2;

        final boolean result = solution.checkIfSubtree(node1, node7);

        assertTrue(result);
    }

    @Test
    public void checkIfSubtree_3() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(2);
        final Node node3 = new Node(3);
        final Node node4 = new Node(4);
        final Node node5 = new Node(5);
        final Node node6 = new Node(6);
        final Node node7 = new Node(7);
        final Node node8 = new Node(8);
        final Node node9 = new Node(9);
        final Node node10 = new Node(10);
        final Node node11 = new Node(11);
        final Node node12 = new Node(12);

        node11.left = node12;
        node10.right = node11;
        node6.right = node10;
        node5.right = node9;
        node4.left = node8;
        node3.right = node7;
        node3.left = node6;
        node2.right = node5;
        node2.left = node4;
        node1.right = node3;
        node1.left = node2;

        final boolean result = solution.checkIfSubtree(node1, node12);

        assertTrue(result);
    }

    @Test
    public void checkIfSubtree_4() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(2);
        final Node node3 = new Node(3);
        final Node node4 = new Node(4);
        final Node node5 = new Node(5);
        final Node node6 = new Node(6);
        final Node node7 = new Node(7);
        final Node node8 = new Node(8);
        final Node node9 = new Node(9);
        final Node node10 = new Node(10);
        final Node node11 = new Node(11);
        final Node node12 = new Node(12);

        node11.left = node12;
        node10.right = node11;
        node6.right = node10;
        node5.right = node9;
        node4.left = node8;
        node3.right = node7;
        node3.left = node6;
        node2.right = node5;
        node2.left = node4;
        node1.right = node3;
        node1.left = node2;

        final boolean result = solution.checkIfSubtree(node1, new Node(13));

        assertFalse(result);
    }
}