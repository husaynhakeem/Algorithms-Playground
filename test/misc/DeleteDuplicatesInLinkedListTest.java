package misc;

import misc.DeleteDuplicatesInLinkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DeleteDuplicatesInLinkedListTest {

    private final DeleteDuplicatesInLinkedList solution = new DeleteDuplicatesInLinkedList();

    @Test
    public void deleteDuplicates_1() throws Exception {
        final ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);

        final ListNode result = solution.deleteDuplicates(head);

        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    public void deleteDuplicates_2() throws Exception {
        final ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(2);

        final ListNode result = solution.deleteDuplicates(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }
}