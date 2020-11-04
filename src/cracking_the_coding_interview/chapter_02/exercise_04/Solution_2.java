package cracking_the_coding_interview.chapter_02.exercise_04;

import org.jetbrains.annotations.NotNull;

class Solution_2 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node partition(@NotNull final Node head, final int partition) {
        final Node left = new Node(0);
        Node leftRunner = left;

        final Node right = new Node(0);
        Node rightRunner = right;

        Node node = head;

        while (node != null) {
            if (node.val < partition) {
                leftRunner.next = node;
                leftRunner = leftRunner.next;
            } else {
                rightRunner.next = node;
                rightRunner = rightRunner.next;
            }
            node = node.next;
        }

        leftRunner.next = right.next;
        return left.next;
    }
}
