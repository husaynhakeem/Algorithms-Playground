package leetcode.problem_0235;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void lowestCommonAncestor_1() throws Exception {
        final Node node6 = new Node(6);
        final Node node2 = new Node(2);
        final Node node8 = new Node(8);
        final Node node0 = new Node(0);
        final Node node4 = new Node(4);
        final Node node7 = new Node(7);
        final Node node9 = new Node(9);
        final Node node3 = new Node(3);
        final Node node5 = new Node(5);

        node6.left = node2;
        node6.right = node8;
        node2.left = node0;
        node2.right = node4;
        node8.left = node7;
        node8.right = node9;
        node4.left = node3;
        node4.right = node5;

        final Node result = solution.lowestCommonAncestor(node6, node2, node8);

        assertEquals(node6, result);
    }

    @Test
    public void lowestCommonAncestor_2() throws Exception {
        final Node node6 = new Node(6);
        final Node node2 = new Node(2);
        final Node node8 = new Node(8);
        final Node node0 = new Node(0);
        final Node node4 = new Node(4);
        final Node node7 = new Node(7);
        final Node node9 = new Node(9);
        final Node node3 = new Node(3);
        final Node node5 = new Node(5);

        node6.left = node2;
        node6.right = node8;
        node2.left = node0;
        node2.right = node4;
        node8.left = node7;
        node8.right = node9;
        node4.left = node3;
        node4.right = node5;

        final Node result = solution.lowestCommonAncestor(node6, node2, node4);

        assertEquals(node2, result);
    }
}