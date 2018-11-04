package leetcode.problem_0019;

import org.jetbrains.annotations.NotNull;

class Solution_2 {

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    Node removeNthFromEnd(@NotNull Node head, final int n) {
        final Node beforeHead = new Node(0);
        beforeHead.next = head;

        Node fastRunner = beforeHead;
        Node slowRunner = beforeHead;

        for (int i = 0; i <= n; i++) {
            fastRunner = fastRunner.next;
        }

        while (fastRunner != null) {
            fastRunner = fastRunner.next;
            slowRunner = slowRunner.next;
        }

        slowRunner.next = slowRunner.next.next;

        return beforeHead.next;
    }
}
