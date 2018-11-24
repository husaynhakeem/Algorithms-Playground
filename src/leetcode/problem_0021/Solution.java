package leetcode.problem_0021;

import Utilities.java.LinkedListUtils.Node;

class Solution {

    Node mergeTwoLists(Node l1, Node l2) {
        final Node result = new Node(0);
        Node runner = result;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                runner.next = new Node(l2.data);
                l2 = l2.next;
            } else if (l2 == null) {
                runner.next = new Node(l1.data);
                l1 = l1.next;
            } else {
                final boolean firstIsSmaller = l1.data <= l2.data;
                runner.next = new Node(firstIsSmaller ? l1.data : l2.data);
                if (firstIsSmaller) {
                    l1 = l1.next;
                } else {
                    l2 = l2.next;
                }
            }
            runner = runner.next;
        }

        return result.next;
    }
}
