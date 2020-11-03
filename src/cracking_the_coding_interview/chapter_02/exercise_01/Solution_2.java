package cracking_the_coding_interview.chapter_02.exercise_01;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class Solution_2 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    void removeDuplicates(@NotNull final Node head) {
        final Set<Integer> seen = new HashSet<>();
        seen.add(head.val);

        Node node = head;
        while (node.next != null) {
            if (seen.contains(node.next.val)) {
                node.next = node.next.next;
            } else {
                seen.add(node.next.val);
                node = node.next;
            }
        }
    }
}
