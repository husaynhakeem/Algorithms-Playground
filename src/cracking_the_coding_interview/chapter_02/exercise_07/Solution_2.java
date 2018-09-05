package cracking_the_coding_interview.chapter_02.exercise_07;

import org.jetbrains.annotations.NotNull;

class Solution_2 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node intersection(@NotNull Node l1, @NotNull Node l2) {
        while (l1 != null) {
            Node l2Runner = l2;
            while (l2Runner != null) {
                if (l1 == l2Runner) {
                    return l1;
                }
                l2Runner = l2Runner.next;
            }
            l1 = l1.next;
        }
        return null;
    }
}
