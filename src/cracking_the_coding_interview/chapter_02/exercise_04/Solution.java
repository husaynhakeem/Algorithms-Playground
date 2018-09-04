package cracking_the_coding_interview.chapter_02.exercise_04;

import org.jetbrains.annotations.NotNull;

class Solution {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    void partition(@NotNull final Node head, final int partition) {
        Node left = head;
        Node right = head;

        while (right != null) {
            while (left != null && left.val < partition) {
                left = left.next;
            }
            if (left == null) {
                return;
            }

            right = left.next;
            while (right != null && right.val >= partition) {
                right = right.next;
            }
            if (right == null) {
                return;
            }

            int temp = left.val;
            left.val = right.val;
            right.val = temp;

            left = left.next;
            right = right.next;
        }
    }
}
