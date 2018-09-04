package cracking_the_coding_interview.chapter_02.exercise_01;

import org.jetbrains.annotations.NotNull;

class SolutionFollowUp {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    void removeDuplicates(@NotNull final Node head) {
        Node temp = head;
        while (temp != null) {
            final int val = temp.val;
            Node n = temp.next;
            Node previous = temp;
            while (n != null) {
                if (n.val == val) {
                    previous.next = n.next;
                    n = n.next;
                } else {
                    previous = n;
                    n = n.next;
                }
            }
            temp = temp.next;
        }
    }
}
