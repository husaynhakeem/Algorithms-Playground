package leetcode.problem_0876;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void middleNode_1() throws Exception {
        final Solution.ListNode head = null;

        final Solution.ListNode result = solution.middleNode(head);

        assertNull(result);
    }

    @Test
    public void middleNode_2() throws Exception {
        final Solution.ListNode head = new Solution.ListNode(1);

        final Solution.ListNode result = solution.middleNode(head);

        assertEquals(1, result.val);
    }

    @Test
    public void middleNode_3() throws Exception {
        final Solution.ListNode head = new Solution.ListNode(1);
        head.next = new Solution.ListNode(2);

        final Solution.ListNode result = solution.middleNode(head);

        assertEquals(2, result.val);
    }

    @Test
    public void middleNode_4() throws Exception {
        final Solution.ListNode head = new Solution.ListNode(1);
        head.next = new Solution.ListNode(2);
        head.next.next = new Solution.ListNode(3);

        final Solution.ListNode result = solution.middleNode(head);

        assertEquals(2, result.val);
        assertEquals(3, result.next.val);
    }

    @Test
    public void middleNode_5() throws Exception {
        final Solution.ListNode head = new Solution.ListNode(1);
        head.next = new Solution.ListNode(2);
        head.next.next = new Solution.ListNode(3);
        head.next.next.next = new Solution.ListNode(4);
        head.next.next.next.next = new Solution.ListNode(5);

        final Solution.ListNode result = solution.middleNode(head);

        assertEquals(3, result.val);
        assertEquals(4, result.next.val);
        assertEquals(5, result.next.next.val);
    }

    @Test
    public void middleNode_6() throws Exception {
        final Solution.ListNode head = new Solution.ListNode(1);
        head.next = new Solution.ListNode(2);
        head.next.next = new Solution.ListNode(3);
        head.next.next.next = new Solution.ListNode(4);
        head.next.next.next.next = new Solution.ListNode(5);
        head.next.next.next.next.next = new Solution.ListNode(6);

        final Solution.ListNode result = solution.middleNode(head);

        assertEquals(4, result.val);
        assertEquals(5, result.next.val);
        assertEquals(6, result.next.next.val);
    }
}