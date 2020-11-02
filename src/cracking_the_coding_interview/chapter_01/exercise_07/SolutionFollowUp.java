package cracking_the_coding_interview.chapter_01.exercise_07;

import org.jetbrains.annotations.NotNull;

class SolutionFollowUp {

    @SuppressWarnings("UnnecessaryLocalVariable")
    void rotateMatrix(@NotNull final int[][] matrix) {
        final int N = matrix.length;
        for (int layer = 0; layer < N / 2; layer++) {

            final int first = layer;
            final int last = N - 1 - first;

            for (int j = first; j < last; j++) {

                final int offset = j - first;

                // Store top element
                int temp = matrix[first][j];

                // Top <- left
                matrix[first][j] = matrix[last - offset][first];

                // Left <- bottom
                matrix[last - offset][first] = matrix[last][last - offset];

                // Bottom <- right
                matrix[last][last - offset] = matrix[j][last];

                // Right <- Top
                matrix[j][last] = temp;
            }
        }
    }
}
