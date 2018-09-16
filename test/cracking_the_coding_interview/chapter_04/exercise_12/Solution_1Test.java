package cracking_the_coding_interview.chapter_04.exercise_12;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void getNumberOfPathsWithSum_1() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(1);
        final Node node3 = new Node(-1);

        node1.left = node2;
        node1.right = node3;

        final int result = solution.getNumberOfPathsWithSum(node1, 2);

        assertEquals(1, result);
    }

    @Test
    public void getNumberOfPathsWithSum_2() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(1);
        final Node node3 = new Node(-1);

        node1.left = node2;
        node1.right = node3;

        final int result = solution.getNumberOfPathsWithSum(node1, 0);

        assertEquals(1, result);
    }

    @Test
    public void getNumberOfPathsWithSum_3() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(1);
        final Node node3 = new Node(1);

        node1.left = node2;
        node1.right = node3;

        final int result = solution.getNumberOfPathsWithSum(node1, 1);

        assertEquals(3, result);
    }

    @Test
    public void getNumberOfPathsWithSum_4() throws Exception {
        final Node node1 = new Node(1);
        final Node node2 = new Node(1);
        final Node node3 = new Node(-1);
        final Node node4 = new Node(-2);
        final Node node5 = new Node(-1);
        final Node node6 = new Node(2);
        final Node node7 = new Node(4);
        final Node node8 = new Node(-6);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.right = node6;

        node6.right = node7;

        node7.left = node8;

        final int result = solution.getNumberOfPathsWithSum(node1, 0);

        assertEquals(5, result);
    }
}