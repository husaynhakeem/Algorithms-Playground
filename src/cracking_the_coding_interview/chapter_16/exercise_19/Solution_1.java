package cracking_the_coding_interview.chapter_16.exercise_19;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    List<Integer> poundSize(@NotNull final int[][] land) {
        final List<Integer> poundSizes = new ArrayList<>();
        final int lines = land.length;
        final int columns = land[0].length;
        final boolean[][] isVisited = new boolean[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                final int size = poundSize(land, i, j, isVisited);
                if (size != 0) {
                    poundSizes.add(size);
                }
            }
        }

        return poundSizes;
    }

    private int poundSize(@NotNull final int[][] land, final int i, final int j, final boolean[][] isVisited) {
        if (isBeyondGridBounds(land, i, j) || land[i][j] != 0 || isVisited[i][j]) {
            return 0;
        }

        isVisited[i][j] = true;

        return 1 + poundSize(land, i - 1, j - 1, isVisited) + // top left
                poundSize(land, i - 1, j, isVisited) +           // top
                poundSize(land, i - 1, j + 1, isVisited) +    // top right
                poundSize(land, i, j - 1, isVisited) +           // left
                poundSize(land, i, j + 1, isVisited) +           // right
                poundSize(land, i + 1, j - 1, isVisited) +    // bottom left
                poundSize(land, i + 1, j, isVisited) +           // bottom
                poundSize(land, i + 1, j + 1, isVisited);     // bottom right
    }

    private boolean isBeyondGridBounds(@NotNull final int[][] land, final int i, final int j) {
        return i < 0 || j < 0 || i >= land.length || j >= land[0].length;
    }
}
