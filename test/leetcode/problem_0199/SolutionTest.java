package leetcode.problem_0199;

import Utilities.java.ListUtils;
import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final Node root = null;

        final List<Integer> result = solution.rightSideView(root);

        assertTrue(result.isEmpty());
    }

    @Test
    public void test_2() {
        final Node root = new Node(1);
        root.right = new Node(3);

        final List<Integer> result = solution.rightSideView(root);

        assertEquals(ListUtils.createList(1, 3), result);
    }

    @Test
    public void test_3() {
        final Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(4);

        final List<Integer> result = solution.rightSideView(root);

        assertEquals(ListUtils.createList(1, 3, 4), result);
    }
}