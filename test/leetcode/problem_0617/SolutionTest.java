package leetcode.problem_0617;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void mergeTrees() throws Exception {
        final Solution.TreeNode t1 = new Solution.TreeNode(1);
        t1.left = new Solution.TreeNode(3);
        t1.right = new Solution.TreeNode(2);
        t1.left.left = new Solution.TreeNode(5);

        final Solution.TreeNode t2 = new Solution.TreeNode(2);
        t2.left = new Solution.TreeNode(1);
        t2.right = new Solution.TreeNode(3);
        t2.left.right = new Solution.TreeNode(4);
        t2.right.right = new Solution.TreeNode(7);

        final Solution.TreeNode result = solution.mergeTrees(t1, t2);

        assertEquals(3, result.val);
        assertEquals(4, result.left.val);
        assertEquals(5, result.right.val);
        assertEquals(5, result.left.left.val);
        assertEquals(4, result.left.right.val);
        assertEquals(7, result.right.right.val);
    }
}