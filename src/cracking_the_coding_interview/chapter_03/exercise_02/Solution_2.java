package cracking_the_coding_interview.chapter_03.exercise_02;

import org.jetbrains.annotations.Nullable;

import java.util.Stack;

class Solution_2 extends Stack<Integer> {

    private final Stack<Integer> minStack = new Stack<>();

    @Override
    public Integer push(Integer item) {
        final Integer min = min();
        if (min == null || item <= min) {
            minStack.push(item);
        }
        return super.push(item);
    }

    @Override
    public Integer pop() {
        if (super.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        return super.pop();
    }

    @Nullable
    public Integer min() {
        return minStack.isEmpty() ? null : minStack.peek();
    }
}
