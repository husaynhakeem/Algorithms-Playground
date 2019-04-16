package leetcode.interview_microsoft_1.problem_2;

import Utilities.java.LinkedListUtils.Node;

public class Solution {

    Node addTwoNumbers(Node l1, Node l2) {
        return toListNode(toNumber(l1), toNumber(l2));
    }

    private StringBuilder toNumber(final Node l) {
        Node node = l;
        final StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.data);
            node = node.next;
        }
        return sb;
    }

    private Node toListNode(final StringBuilder sb1, final StringBuilder sb2) {
        int i1 = sb1.length() - 1;
        int i2 = sb2.length() - 1;
        int rest = 0;
        Node head = null;

        while (i1 >= 0 || i2 >= 0) {
            final int n1 = i1 >= 0 ? Character.getNumericValue(sb1.charAt(i1)) : 0;
            final int n2 = i2 >= 0 ? Character.getNumericValue(sb2.charAt(i2)) : 0;
            final int sum = n1 + n2 + rest;

            final Node node = new Node(sum % 10);
            node.next = head;
            head = node;

            rest = sum >= 10 ? 1 : 0;
            i1--;
            i2--;
        }

        if (rest == 1) {
            final Node node = new Node(1);
            node.next = head;
            head = node;
        }

        return head;
    }
}
