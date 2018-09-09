package cracking_the_coding_interview.chapter_04.exercise_01;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    static class Node {
        boolean isMarked = false;
        List<Node> adjacent;
    }

    boolean routeBetweenNodes(@NotNull final Node first, @NotNull final Node second) {
        final Queue<Node> queue = new LinkedList<>();

        first.isMarked = true;
        queue.add(first);

        while (!queue.isEmpty()) {
            final Node node = queue.remove();

            if (node == second) {
                return true;
            }

            if (node.adjacent == null) {
                continue;
            }

            for (Node adjacent : node.adjacent) {
                if (!adjacent.isMarked) {
                    adjacent.isMarked = true;
                    queue.add(adjacent);
                }
            }
        }

        return false;
    }
}
