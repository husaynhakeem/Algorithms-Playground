package cracking_the_coding_interview.chapter_02.exercise_01;

import org.jetbrains.annotations.NotNull;

class SolutionFollowUp_2 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    void removeDuplicates(@NotNull final Node head) {
        Node node = head;
        while (node != null) {
            int value = node.val;

            // Iterate through the rest of the linked list, and remove nodes that hold the current value
            Node runner = node;
            while (runner.next != null) {
                if (runner.next.val == value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            node = node.next;
        }
    }
}
