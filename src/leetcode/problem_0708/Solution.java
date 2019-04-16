package leetcode.problem_0708;

import Utilities.java.LinkedListUtils.Node;

public class Solution {

    Node insert(Node head, int insertVal) {
        if (head == null) {
            final Node node = new Node(insertVal);
            node.next = node;
            return node;
        }

        insertHelper(head, head, insertVal);
        return head;
    }

    private void insertHelper(final Node head, final Node current, final int value) {
        final Node next = current.next;
        if ((next == head) || (current.data <= value && value <= next.data) || (current.data > next.data && value < next.data) || (current.data > next.data && value > current.data)) {
            final Node node = new Node(value);
            node.next = next;
            current.next = node;
        } else {
            insertHelper(head, next, value);
        }
    }
}
