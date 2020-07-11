package leetcode.interview_amazon_2.problem_2;

import Utilities.java.ListUtils;
import Utilities.java.TreeUtils.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void zigzagLevelOrder() {
        final Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        final List<List<Integer>> result = solution.zigzagLevelOrder(root);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(3),
                ListUtils.createList(20, 9),
                ListUtils.createList(15, 7)
        );
        assertEquals(expected, result);
    }
}