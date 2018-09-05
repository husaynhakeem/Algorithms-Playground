package cracking_the_coding_interview.chapter_02.exercise_08;

import org.jetbrains.annotations.NotNull;

class Solution_2 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node detectLoop(@NotNull Node l) {
        Node fast = l;
        Node slow = l;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = l;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
