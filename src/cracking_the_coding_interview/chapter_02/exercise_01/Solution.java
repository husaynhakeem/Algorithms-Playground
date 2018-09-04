package cracking_the_coding_interview.chapter_02.exercise_01;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

class Solution {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    void removeDuplicates(@NotNull final Node head) {
        final Set<Integer> set = new HashSet<>();
        Node temp = head;
        Node previous = null;

        while (temp != null) {
            if (set.contains(temp.val)) {
                previous.next = temp.next;
                temp = temp.next;
            } else {
                set.add(temp.val);
                previous = temp;
                temp = temp.next;
            }
        }
    }
}
