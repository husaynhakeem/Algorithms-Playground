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

    void deleteMiddleNode(@NotNull Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}