package cracking_the_coding_interview.chapter_03.exercise_04;

import java.util.Stack;

class Solution_2<T> {

    private final Stack<T> newestStack = new Stack<>();
    private final Stack<T> oldestStack = new Stack<>();

    synchronized void add(T t) {
        newestStack.push(t);
    }

    T remove() {
        shiftItems();
        return oldestStack.pop();
    }

    T peek() {
        shiftItems();
        return oldestStack.peek();
    }

    boolean isEmpty() {
        return newestStack.isEmpty() && oldestStack.isEmpty();
    }

    private void shiftItems() {
        if (oldestStack.isEmpty()) {
            while (!newestStack.isEmpty()) {
                oldestStack.push(newestStack.pop());
            }
        }
    }
}
