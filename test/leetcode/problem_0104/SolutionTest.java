package leetcode.problem_0104;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final Node node = new Node(3);
        node.left = new Node(9);
        node.right = new Node(20);
        node.right.left = new Node(15);
        node.right.right = new Node(7);

        final int result = solution.maxDepth(node);

        assertEquals(3, result);
    }

    @Test
    public void test_2() {
        final Node node = new Node(3);
        node.right = new Node(2);

        final int result = solution.maxDepth(node);

        assertEquals(2, result);

    }

    @Test
    public void test_3() {
        final int result = solution.maxDepth(null);

        assertEquals(0, result);
    }

    @Test
    public void test_4() {
        final Node node = new Node(0);

        final int result = solution.maxDepth(node);

        assertEquals(1, result);
    }
}