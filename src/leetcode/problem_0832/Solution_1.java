package leetcode.problem_0832;

class Solution_1 {

    int[][] flipAndInvertImage(int[][] A) {
        final int lines = A.length;
        final int columns = A[0].length;

        final int[][] result = new int[columns][lines];
        int i = 0;
        for (int[] line : A) {
            result[i++] = flipAndInvert(line);
        }
        return result;
    }

    private int[] flipAndInvert(final int[] line) {
        final int[] result = new int[line.length];
        final int length = line.length;
        for (int i = length - 1; i >= 0; i--) {
            result[length - i - 1] = line[i] == 0 ? 1 : 0;
        }
        return result;
    }
}
