package leetcode.problem_0024;

import Utilities.java.LinkedListUtils.Node;

public class Solution {

    @SuppressWarnings("UnnecessaryLocalVariable")
    public Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node first = head;
        Node second = head.next;
        Node rest = second.next;

        second.next = first;
        first.next = swapPairs(rest);

        return second;
    }
}
