package leetcode.problem_0019;

import org.jetbrains.annotations.NotNull;

class Solution_1 {

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    Node removeNthFromEnd(@NotNull Node head, final int n) {
        Node fastRunner = head;
        Node slowRunner = null;
        int count = 0;

        while (fastRunner != null) {
            fastRunner = fastRunner.next;
            if (count >= n) {
                if (slowRunner == null) {
                    slowRunner = head;
                } else {
                    slowRunner = slowRunner.next;
                }
            } else {
                count++;
            }
        }

        if (slowRunner == null) {
            head = head.next;
        } else if (slowRunner.next != null) {
            slowRunner.next = slowRunner.next.next;
        }

        return head;
    }
}
