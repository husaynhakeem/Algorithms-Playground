package cracking_the_coding_interview.chapter_03.exercise_02;

import java.util.Stack;

class Solution extends Stack<Integer> {

    private Stack<Integer> minStack = new Stack<>();

    @Override
    public Integer push(Integer item) {
        final int result = super.push(item);

        if (minStack.isEmpty()) {
            minStack.push(item);
        } else {
            final int currentMin = minStack.peek();
            minStack.push(currentMin < item ? currentMin : item);
        }

        return result;
    }

    @Override
    public synchronized Integer pop() {
        final int result = super.pop();
        minStack.pop();
        return result;
    }

    public Integer min() {
        if (minStack.isEmpty()) {
            return null;
        }
        return minStack.peek();
    }
}
