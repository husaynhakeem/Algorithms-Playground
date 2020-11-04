package cracking_the_coding_interview.chapter_02.exercise_03;

import org.jetbrains.annotations.NotNull;

class Solution {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    boolean deleteMiddleNode(@NotNull Node node) {
        // Cannot delete the last node of a linked list
        if (node.next == null) {
            return false;
        }

        final Node next = node.next;
        node.val = next.val;
        node.next = node.next.next;
        return true;
    }
}