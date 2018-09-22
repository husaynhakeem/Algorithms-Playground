package cracking_the_coding_interview.chapter_08.exercise_05;

class Solution_2 {

    long recursiveMultiply(final int a, final int b) {
        final int min = Math.min(a, b);
        final int max = min == a ? b : a;
        return multiply(min, max);
    }

    private long multiply(final int min, final int max) {
        if (min == 0) {
            return 0;
        }
        return max + multiply(min - 1, max);
    }
}
