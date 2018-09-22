package cracking_the_coding_interview.chapter_08.exercise_05;

class Solution_1 {

    long recursiveMultiply(final int a, final int b) {
        final int min = Math.min(a, b);
        final int max = min == a ? b : a;

        long sum = 0;
        for (int i = 0; i < min; i++) {
            sum += max;
        }

        return sum;
    }
}
