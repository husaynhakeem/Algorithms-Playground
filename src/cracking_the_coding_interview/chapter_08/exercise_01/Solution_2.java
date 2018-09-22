package cracking_the_coding_interview.chapter_08.exercise_01;

class Solution_2 {

    int tripleStep(final int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 1; i < n; i++) {
            int sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }

        return a + b + c;
    }
}
