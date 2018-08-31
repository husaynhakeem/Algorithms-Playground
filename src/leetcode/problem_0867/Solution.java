package leetcode.problem_0867;

class Solution {

    int[][] transpose(int[][] A) {
        if (A == null || A.length == 0) {
            return A;
        }

        final int[][] B = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i][j] = A[j][i];
            }
        }

        return B;
    }
}
