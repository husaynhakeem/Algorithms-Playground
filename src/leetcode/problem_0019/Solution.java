package leetcode.problem_0019;

import org.jetbrains.annotations.NotNull;

class Solution {

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    Node removeNthFromEnd(@NotNull Node head, final int n) {
        Node fastRunner = head;
        Node slowRunner = head;
        int count = 0;

        while (fastRunner != null) {
            fastRunner = fastRunner.next;
            if (count > n) {
                slowRunner = slowRunner.next;
            } else {
                count++;
            }
        }

        if (slowRunner == head) {
            head = head.next;
        } else if (slowRunner != null && slowRunner.next != null) {
            slowRunner.next = slowRunner.next.next;
        }

        return head;
    }
}
