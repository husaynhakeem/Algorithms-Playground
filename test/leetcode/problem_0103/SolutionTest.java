package leetcode.problem_0103;

import Utilities.java.ListUtils;
import Utilities.java.TreeUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void zigzagLevelOrder() {
        final TreeUtils.Node root = new TreeUtils.Node(3);
        root.left = new TreeUtils.Node(9);
        root.right = new TreeUtils.Node(20);
        root.right.left = new TreeUtils.Node(15);
        root.right.right = new TreeUtils.Node(7);

        final List<List<Integer>> result = solution.zigzagLevelOrder(root);

        assertEquals(3, result.size());
        assertEquals(ListUtils.createList(3), result.get(0));
        assertEquals(ListUtils.createList(20, 9), result.get(1));
        assertEquals(ListUtils.createList(15, 7), result.get(2));
    }
}