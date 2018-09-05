package cracking_the_coding_interview.chapter_02.exercise_08;

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

    Node detectLoop(@NotNull Node l) {
        final Set<Node> set = new HashSet<>();
        while (l != null) {
            if (set.contains(l)) {
                return l;
            }
            set.add(l);
            l = l.next;
        }
        return null;
    }
}
