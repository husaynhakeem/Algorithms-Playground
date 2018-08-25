package leetcode.problem_0832;

class Solution_2 {

    int[][] flipAndInvertImage(int[][] A) {
        for (int[] line : A) {
            flipAndInvert(line);
        }
        return A;
    }

    private void flipAndInvert(int[] line) {
        int begin = 0;
        int end = line.length - 1;

        while (begin <= end) {
            final int beginVal = line[begin];
            final int endVal = line[end];

            line[begin] = endVal ^ 1;
            line[end] = beginVal ^ 1;

            begin++;
            end--;
        }
    }
}
