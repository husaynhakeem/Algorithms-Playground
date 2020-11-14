package cracking_the_coding_interview.chapter_03.exercise_05;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

class Solution_1 {

    Stack<Integer> sortStack(@NotNull final Stack<Integer> stack) {
        Stack<Integer> helper = new Stack<>();

        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (helper.isEmpty() || helper.peek() <= top) {
                helper.push(top);
            } else if (!helper.isEmpty()) {
                int counter = 0;

                do {
                    stack.push(helper.pop());
                    counter++;
                } while (!helper.isEmpty() && helper.peek() > top);

                helper.push(top);

                for (int i = 0; i < counter; i++) {
                    helper.push(stack.pop());
                }
            }
        }

        return helper;
    }
}
