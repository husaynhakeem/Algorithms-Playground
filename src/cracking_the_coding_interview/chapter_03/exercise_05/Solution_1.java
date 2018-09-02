package cracking_the_coding_interview.chapter_03.exercise_05;

import java.util.Stack;

import static Utilities.java.StackUtils.createStackFrom;

public class Solution_1 {

    public static void main(String[] args) {
        Stack<Integer> first = createStackFrom(7, 6, 2, 4, 9, 10, 3);
        System.out.println(sortStack(first));

        Stack<Integer> second = createStackFrom(0, 18, 24, 2, 6);
        System.out.println(sortStack(second));
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> helper = new Stack<>();

        do {
            int top = stack.pop();
            if (helper.isEmpty() || helper.peek() >= top) {
                helper.push(top);
            } else if (!helper.isEmpty()) {
                int counter = 0;

                do {
                    stack.push(helper.pop());
                    counter++;
                } while (!helper.isEmpty() && helper.peek() < top);

                helper.push(top);

                for (int i = 0; i < counter; i++) {
                    helper.push(stack.pop());
                }
            }
        } while (!stack.isEmpty());

        return helper;
    }
}
