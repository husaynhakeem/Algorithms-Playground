package leetcode.problem_0501;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findMode_1() throws Exception {
        final Solution.TreeNode treeNode = new Solution.TreeNode(1);
        treeNode.right = new Solution.TreeNode(2);
        treeNode.right.left = new Solution.TreeNode(2);

        final int[] results = solution.findMode(treeNode);

        assertEquals(1, results.length);
        assertEquals(2, results[0]);
    }

    @Test
    public void findMode_2() throws Exception {
        final Solution.TreeNode treeNode = new Solution.TreeNode(1);
        treeNode.right = new Solution.TreeNode(2);
        treeNode.right.left = new Solution.TreeNode(1);
        treeNode.right.right = new Solution.TreeNode(2);

        final int[] results = solution.findMode(treeNode);

        assertEquals(2, results.length);
        assertTrue(results[0] == 1 || results[0] == 2);
        assertTrue(results[1] == 1 || results[1] == 2);
    }

    @Test
    public void findMode_3() throws Exception {
        final Solution.TreeNode treeNode = null;

        final int[] results = solution.findMode(treeNode);

        assertEquals(0, results.length);
    }
}