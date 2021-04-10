package leetcode.problem_0114;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final Node node1 = new Node(1);
        final Node node2 = new Node(2);
        final Node node3 = new Node(3);
        final Node node4 = new Node(4);
        final Node node5 = new Node(5);
        final Node node6 = new Node(6);

        node1.left = node2;
        node2.left = node3;

        node1.right = node5;
        node2.right = node4;
        node5.right = node6;

        solution.flatten(node1);

        assertEquals(node2, node1.right);
        assertEquals(node3, node2.right);
        assertEquals(node4, node3.right);
        assertEquals(node5, node4.right);
        assertEquals(node6, node5.right);

        assertNull(node1.left);
        assertNull(node2.left);
        assertNull(node3.left);
        assertNull(node4.left);
        assertNull(node5.left);
        assertNull(node6.left);
    }
}