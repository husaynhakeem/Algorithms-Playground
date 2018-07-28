package leetcode.problem_83;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void deleteDuplicates_1() throws Exception {
        final Solution.ListNode listNode = new Solution.ListNode(1);
        listNode.next = new Solution.ListNode(1);
        listNode.next.next = new Solution.ListNode(2);

        Solution.ListNode result = solution.deleteDuplicates(listNode);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    public void deleteDuplicates_2() throws Exception {
        final Solution.ListNode listNode = new Solution.ListNode(1);
        listNode.next = new Solution.ListNode(1);
        listNode.next.next = new Solution.ListNode(2);
        listNode.next.next.next = new Solution.ListNode(3);
        listNode.next.next.next.next = new Solution.ListNode(3);

        Solution.ListNode result = solution.deleteDuplicates(listNode);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void deleteDuplicates_3() throws Exception {
        final Solution.ListNode listNode = null;

        Solution.ListNode result = solution.deleteDuplicates(listNode);

        assertNull(result);
    }

    @Test
    public void deleteDuplicates_4() throws Exception {
        final Solution.ListNode listNode = new Solution.ListNode(1);
        listNode.next = new Solution.ListNode(1);
        listNode.next.next = new Solution.ListNode(1);
        listNode.next.next.next = new Solution.ListNode(1);
        listNode.next.next.next.next = new Solution.ListNode(1);

        Solution.ListNode result = solution.deleteDuplicates(listNode);

        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    public void deleteDuplicates_5() throws Exception {
        final Solution.ListNode listNode = new Solution.ListNode(1);

        Solution.ListNode result = solution.deleteDuplicates(listNode);

        assertEquals(1, result.val);
        assertNull(result.next);
    }
}