package cracking_the_coding_interview.chapter_16.exercise_17;

class Solution_1 {

    int contiguousSequence(final int[] array) {
        int length = array.length;
        final int[][] grid = new int[length][length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (i == j) {
                    grid[i][j] = array[i];
                } else {
                    grid[i][j] = grid[i][j - 1] + array[j];
                }
                if (max < grid[i][j]) {
                    max = grid[i][j];
                }
            }
        }

        return max;
    }
}
