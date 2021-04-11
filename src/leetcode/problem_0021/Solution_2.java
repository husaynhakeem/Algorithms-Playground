package leetcode.problem_0021;

import Utilities.java.LinkedListUtils.Node;

class Solution_2 {

    public Node mergeTwoLists(Node l1, Node l2) {
        final Node result = new Node();
        Node node = result;

        while (l1 != null && l2 != null) {
            final int n1 = l1.data;
            final int n2 = l2.data;

            if (n1 < n2) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
            node.next = null;
        }

        if (l1 == null) {
            node.next = l2;
        }

        if (l2 == null) {
            node.next = l1;
        }

        return result.next;
    }
}
