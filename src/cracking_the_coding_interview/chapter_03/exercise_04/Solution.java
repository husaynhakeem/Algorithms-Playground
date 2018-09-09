package cracking_the_coding_interview.chapter_03.exercise_04;

import java.util.Stack;

class Solution<T> {

    private final Stack<T> stack1 = new Stack<>();
    private final Stack<T> stack2 = new Stack<>();
    private boolean isLatestItemOnTop = true;

    synchronized void add(T t) {
        if (!isLatestItemOnTop) {
            flipStacks();
            isLatestItemOnTop = true;
        }
        getNonEmptyStack().push(t);
    }

    T remove() {
        if (isLatestItemOnTop) {
            flipStacks();
            isLatestItemOnTop = false;
        }
        return getNonEmptyStack().pop();
    }

    T peek() {
        if (isLatestItemOnTop) {
            flipStacks();
            isLatestItemOnTop = false;
        }
        return getNonEmptyStack().peek();
    }

    boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void flipStacks() {
        final Stack<T> emptyStack = stack1.isEmpty() ? stack1 : stack2;
        final Stack<T> nonEmptyStack = stack1.isEmpty() ? stack2 : stack1;

        while (!nonEmptyStack.isEmpty()) {
            emptyStack.push(nonEmptyStack.pop());
        }
    }

    private Stack<T> getNonEmptyStack() {
        return stack1.isEmpty() ? stack2 : stack1;
    }
}
