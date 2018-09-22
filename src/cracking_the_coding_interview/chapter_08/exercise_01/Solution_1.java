package cracking_the_coding_interview.chapter_08.exercise_01;

class Solution_1 {

    int tripleStep(final int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return tripleStep(n - 1) + tripleStep(n - 2) + tripleStep(n - 3);
    }
}
