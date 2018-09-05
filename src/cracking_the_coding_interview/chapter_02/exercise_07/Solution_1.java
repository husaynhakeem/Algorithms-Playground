package cracking_the_coding_interview.chapter_02.exercise_07;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

class Solution_1 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node intersection(@NotNull Node l1, @NotNull Node l2) {
        final Set<Node> set = new HashSet<>();

        while (l1 != null) {
            set.add(l1);
            l1 = l1.next;
        }

        while (l2 != null) {
            if (set.contains(l2)) {
                return l2;
            }
            l2 = l2.next;
        }

        return null;
    }
}
