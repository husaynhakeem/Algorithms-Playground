package cracking_the_coding_interview.chapter_16.exercise_01;

class Solution {

    void numberSwapper(int a, int b) {
        System.out.println("Before");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("After");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
