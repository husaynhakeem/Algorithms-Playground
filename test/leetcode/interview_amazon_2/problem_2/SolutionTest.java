package leetcode.interview_amazon_2.problem_2;

import Utilities.java.ListUtils;
import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void zigzagLevelOrder() throws Exception {
        final Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        final List<List<Integer>> result = solution.zigzagLevelOrder(root);

        assertEquals(3, result.size());
        assertTrue(ListUtils.areEqual(ListUtils.createList(3), result.get(0)));
        assertTrue(ListUtils.areEqual(ListUtils.createList(20, 9), result.get(1)));
        assertTrue(ListUtils.areEqual(ListUtils.createList(15, 7), result.get(2)));
    }
}