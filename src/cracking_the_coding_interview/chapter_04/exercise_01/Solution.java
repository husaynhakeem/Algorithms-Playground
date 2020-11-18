package cracking_the_coding_interview.chapter_04.exercise_01;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    static class Node {
        int value;
        boolean isMarked = false;
        List<Node> adjacent = new ArrayList<>();
    }

    boolean routeBetweenNodes(@NotNull final Node first, @NotNull final Node second) {
        final Queue<Node> queue = new LinkedList<>();
        queue.add(first);

        while (!queue.isEmpty()) {
            final Node node = queue.remove();
            if (node == second) {
                return true;
            }

            node.isMarked = true;

            for (Node adjacent : node.adjacent) {
                if (!adjacent.isMarked) {
                    queue.add(adjacent);
                }
            }
        }

        return false;
    }
}
