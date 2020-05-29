package leetcode.problem_0002;

import Utilities.java.LinkedListUtils.Node;

public class Solution {

    public Node addTwoNumbers(final Node l1, final Node l2) {
        Node runner1 = l1;
        Node runner2 = l2;

        Node head = new Node();
        Node runner = head;

        int carry = 0;

        while (runner1 != null || runner2 != null) {
            int n1 = runner1 == null ? 0 : runner1.data;
            int n2 = runner2 == null ? 0 : runner2.data;
            int sum = n1 + n2 + carry;

            runner.next = new Node(sum % 10);
            runner = runner.next;

            carry = sum / 10;

            runner1 = runner1 == null ? null : runner1.next;
            runner2 = runner2 == null ? null : runner2.next;
        }

        if (carry != 0) {
            runner.next = new Node(carry);
        }

        return head.next;
    }
}
