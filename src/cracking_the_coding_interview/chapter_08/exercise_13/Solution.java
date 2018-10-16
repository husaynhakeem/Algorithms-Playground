package cracking_the_coding_interview.chapter_08.exercise_13;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

class Solution {

    static class Box {
        int width;
        int height;
        int depth;

        Box(int width, int height, int depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        boolean canBePlacedAbove(final Box box) {
            return this.height < box.height &&
                    this.width < box.width &&
                    this.depth < box.depth;
        }
    }

    private class BoxComparator implements Comparator<Box> {

        @Override
        public int compare(Box box1, Box box2) {
            return box2.height - box1.height;
        }
    }

    int stackOfBoxes(@NotNull final List<Box> boxes) {
        boxes.sort(new BoxComparator());
        final int[] memo = new int[boxes.size()];
        return stackOfBoxes(boxes, null, 0, memo);
    }

    private int stackOfBoxes(@NotNull final List<Box> boxes, final Box bottom, final int newBottomIndex, final int[] memo) {
        if (newBottomIndex >= boxes.size()) {
            return 0;
        }

        int heightWithNewBottom = 0;
        final Box newBottom = boxes.get(newBottomIndex);
        if (bottom == null || newBottom.canBePlacedAbove(bottom)) {
            if (memo[newBottomIndex] == 0) {
                memo[newBottomIndex] = stackOfBoxes(boxes, newBottom, newBottomIndex + 1, memo);
                memo[newBottomIndex] += newBottom.height;
            }
            heightWithNewBottom = memo[newBottomIndex];
        }

        int heightWithoutNewBottom = stackOfBoxes(boxes, bottom, newBottomIndex + 1, memo);

        return Math.max(heightWithNewBottom, heightWithoutNewBottom);
    }
}
