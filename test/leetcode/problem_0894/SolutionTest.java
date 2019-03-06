package leetcode.problem_0894;

import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void allPossibleFBT_1() throws Exception {
        final int n = 1;

        final List<Node> result = solution.allPossibleFBT(n);

        assertEquals(1, result.size());
        assertTrue(result.contains(new Node(0)));
    }

    @Test
    public void allPossibleFBT_2() throws Exception {
        final int n = 4;

        final List<Node> result = solution.allPossibleFBT(n);

        assertTrue(result.isEmpty());
    }

    @Test
    public void allPossibleFBT_3() throws Exception {
        final int n = 3;

        final List<Node> result = solution.allPossibleFBT(n);

        assertEquals(1, result.size());

        final Node node = new Node(0);
        node.left = new Node(0);
        node.right = new Node(0);
        assertTrue(result.contains(node));
    }
}