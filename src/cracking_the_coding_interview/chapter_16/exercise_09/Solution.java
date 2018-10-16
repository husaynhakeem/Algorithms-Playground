package cracking_the_coding_interview.chapter_16.exercise_09;

class Solution {

    int multiply(final int a, final int b) {
        final int absA = Math.abs(a);
        final int absB = Math.abs(b);

        final int min = absA < absB ? absA : absB;
        final int max = absA < absB ? absB : absA;

        int result = 0;
        for (int i = 0; i < min; i++) {
            result += max;
        }

        return haveDifferentSigns(a, b) ? -result : result;
    }

    int divide(final int a, final int b) {
        if (b == 0) {
            return Integer.MAX_VALUE;
        }

        final int absA = Math.abs(a);
        final int absB = Math.abs(b);

        final int min = absA < absB ? absA : absB;
        final int max = absA < absB ? absB : absA;

        int result = 0;
        int temp = min;
        while (temp <= max) {
            result++;
            temp += min;
        }

        return haveDifferentSigns(a, b) ? -result : result;
    }

    int subtract(final int a, final int b) {
        return a + multiply(-1, b);
    }

    private boolean haveDifferentSigns(final int a, final int b) {
        return a < 0 && b > 0 || a > 0 && b < 0;
    }
}
