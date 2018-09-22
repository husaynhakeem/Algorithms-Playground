package cracking_the_coding_interview.chapter_08.exercise_05;

class Solution_3 {

    long recursiveMultiply(final int a, final int b) {
        final int min = Math.min(a, b);
        final int max = min == a ? b : a;
        return multiply(min, max);
    }

    private long multiply(final int min, final int max) {
        if (min == 0) {
            return 0;
        }
        if (min == 1) {
            return max;
        }

        final int half = min >> 1;
        final long side1 = multiply(half, max);
        long side2 = side1;
        if (min % 2 == 1) {
            side2 = multiply(min - half, max);
        }
        return side1 + side2;
    }
}
