package leetcode.problem_0025;

import Utilities.java.LinkedListUtils.Node;

public class Solution {

    public Node reverseKGroup(final Node head, int k) {
        if (head == null || !hasKNodes(head, k)) {
            return head;
        }

        Node previous = null;
        Node current = head;
        for (int i = 0; i < k; i++) {
            // Next element
            Node next = current.next;

            // Point to the previous element
            current.next = previous;

            // Move pointers forward
            previous = current;
            current = next;
        }

        // `previous` stops at the kth element, it's the new head
        final Node newHead = previous;

        // `head` is the first element in the linked list, but the last in the reversed linked list
        final Node newTail = head;

        // `current` stops at element (k+1)
        newTail.next = reverseKGroup(current, k);

        return newHead;
    }

    private boolean hasKNodes(final Node head, int k) {
        Node node = head;
        int i = 0;

        while (node != null) {
            node = node.next;
            i++;

            // Once `i` reaches `k`, return
            if (i >= k) {
                return true;
            }
        }

        return false;
    }
}
