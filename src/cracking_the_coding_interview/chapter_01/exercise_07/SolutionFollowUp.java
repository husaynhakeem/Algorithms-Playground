package cracking_the_coding_interview.chapter_01.exercise_07;

import org.jetbrains.annotations.NotNull;

class SolutionFollowUp {

    void rotateMatrix(@NotNull final int[][] matrix) {
        final int N = matrix.length;
        for (int first = 0; first < N / 2; first++) {
            int last = N - 1 - first;
            for (int j = first; j < last; j++) {
                int temp = matrix[first][j];
                matrix[first][j] = matrix[j][first];
                matrix[j][first] = matrix[last][j];
                matrix[last][j] = matrix[j][last];
                matrix[j][last] = temp;
            }
        }
    }
}
