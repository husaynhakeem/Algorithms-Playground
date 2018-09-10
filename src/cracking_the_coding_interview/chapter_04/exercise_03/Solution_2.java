package cracking_the_coding_interview.chapter_04.exercise_03;

import Utilities.java.TreeUtils.Node;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Solution_2 {

    List<List<Node>> listOfDepths(@NotNull final Node root) {
        final List<List<Node>> allDepths = new ArrayList<>();

        List<Node> level = new ArrayList<>();
        level.add(root);

        while (!level.isEmpty()) {
            allDepths.add(level);

            final List<Node> parents = level;
            level = new ArrayList<>();

            for (Node parent : parents) {
                if (parent.left != null) {
                    level.add(parent.left);
                }
                if (parent.right != null) {
                    level.add(parent.right);
                }
            }
        }

        return allDepths;
    }
}
