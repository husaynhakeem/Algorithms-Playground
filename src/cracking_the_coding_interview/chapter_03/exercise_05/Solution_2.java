package cracking_the_coding_interview.chapter_03.exercise_05;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

class Solution_2 {

    Stack<Integer> sortStack(@NotNull final Stack<Integer> stack) {
        final Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            final int top = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() < top) {
                stack.push(tempStack.pop());
            }
            tempStack.push(top);
        }
        return tempStack;
    }
}
