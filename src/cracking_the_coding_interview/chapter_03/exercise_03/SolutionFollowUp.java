package cracking_the_coding_interview.chapter_03.exercise_03;

import java.util.List;
import java.util.Stack;

class SolutionFollowUp<T> {

    class CapacityStack<U> extends Stack<U> {
        int capacity = MAX_CAPACITY;

        boolean isFull() {
            return size() == capacity;
        }
    }

    static final int MAX_CAPACITY = 10;
    List<CapacityStack<T>> stacks = new CapacityStack<>();

    public T push(T item) {
        if (stacks.isEmpty() || stacks.get(stacks.size() - 1).isFull()) {
            stacks.add(new CapacityStack<>());
        }
        final CapacityStack<T> lastStack = stacks.get(stacks.size() - 1);
        return lastStack.push(item);
    }

    public T pop() {
        if (stacks.isEmpty()) {
            return null;
        }
        final CapacityStack<T> lastStack = stacks.get(stacks.size() - 1);
        final T item = lastStack.pop();
        if (lastStack.isEmpty()) {
            stacks.remove(stacks.size() - 1);
        }
        return item;
    }

    void popAt(final int position) {
        if (position < 0 || position >= stacks.size()) {
            return;
        }
        final CapacityStack<T> stack = stacks.get(position);
        final T item = stack.pop();
        stack.capacity--;
        if (stack.isEmpty()) {
            stacks.remove(position);
        }
    }
}
