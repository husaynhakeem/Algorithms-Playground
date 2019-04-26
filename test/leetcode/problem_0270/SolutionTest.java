package leetcode.problem_0270;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void closestValue_1() throws Exception {
        final Node node = new Node(4);
        node.left = new Node(2);
        node.right = new Node(5);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        final double target = 3.714286;

        final int result = solution.closestValue(node, target);

        assertEquals(4, result);
    }

    @Test
    public void closestValue_2() throws Exception {
        final Node node = new Node(4);
        node.left = new Node(2);
        node.right = new Node(5);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        node.right.right = new Node(11);
        final double target = 10.714286;

        final int result = solution.closestValue(node, target);

        assertEquals(11, result);
    }
}