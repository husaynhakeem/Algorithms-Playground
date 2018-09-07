package cracking_the_coding_interview.chapter_03.exercise_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution<T> {

    static final int MAX_CAPACITY = 10;
    List<Stack<T>> stacks = new ArrayList<>();

    public T push(T item) {
        if (stacks.isEmpty() || stacks.get(stacks.size() - 1).size() == MAX_CAPACITY) {
            stacks.add(new Stack<>());
        }
        final Stack<T> lastStack = stacks.get(stacks.size() - 1);
        return lastStack.push(item);
    }

    public T pop() {
        if (stacks.isEmpty()) {
            return null;
        }
        final Stack<T> lastStack = stacks.get(stacks.size() - 1);
        final T item = lastStack.pop();
        if (lastStack.isEmpty()) {
            stacks.remove(stacks.size() - 1);
        }
        return item;
    }
}
