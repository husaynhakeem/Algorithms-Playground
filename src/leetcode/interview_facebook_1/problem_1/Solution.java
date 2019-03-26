package leetcode.interview_facebook_1.problem_1;

import Utilities.java.LinkedListUtils.Node;

public class Solution {

    Node mergeTwoLists(Node l1, Node l2) {
        final Node head = new Node(0);
        Node node = head;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                node.next = new Node(l1.data);
                l1 = l1.next;
            } else {
                node.next = new Node(l2.data);
                l2 = l2.next;
            }

            node = node.next;
        }

        node.next = l1 == null ? l2 : l1;

        return head.next;
    }
}
