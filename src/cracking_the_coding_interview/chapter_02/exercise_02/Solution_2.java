package cracking_the_coding_interview.chapter_02.exercise_02;

import org.jetbrains.annotations.NotNull;

class Solution_2 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Integer findKthToLast(@NotNull Node head, final int k) {
        Node node = head;

        // Compute size of linked list
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }

        // If linked list has number of elements smaller than k, return
        if (size < k) {
            return null;
        }

        node = head;
        for (int i = 0; i < size - k; i++) {
            node = node.next;
        }
        return node.val;
    }
}
