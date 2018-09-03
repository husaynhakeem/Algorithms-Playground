package cracking_the_coding_interview.chapter_01.exercise_07;

import org.jetbrains.annotations.NotNull;

class Solution {

    int[][] rotateMatrix(@NotNull final int[][] matrix) {
        final int N = matrix.length;
        final int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[j][N - 1 - i] = matrix[i][j];
            }
        }

        return result;
    }
}
