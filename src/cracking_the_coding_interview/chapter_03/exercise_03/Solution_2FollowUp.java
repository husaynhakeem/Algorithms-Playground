package cracking_the_coding_interview.chapter_03.exercise_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_2FollowUp {

    static class SetOfStacks {
        final List<Stack<Integer>> stacks;
        private final int capacity;

        SetOfStacks(int capacity) {
            stacks = new ArrayList<>();
            this.capacity = capacity;
        }

        int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Empty stack.Cannot call pop()");
            }
            int lastValue = lastStack().pop();
            if (lastStack().isEmpty()) {
                stacks.remove(stacks.size() - 1);
            }
            return lastValue;
        }

        int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Empty stack.Cannot call peek()");
            }
            return lastStack().peek();
        }

        void push(int value) {
            if (isEmpty() || lastStack().size() == capacity) {
                stacks.add(new Stack<>());
            }
            lastStack().push(value);
        }

        boolean isEmpty() {
            return stacks.isEmpty();
        }

        int popAt(int index) {
            if (index < 0 || index >= stacks.size()) {
                throw new IllegalArgumentException("Invalid index " + index);
            }

            // Get pop result from stack at index `index`
            int value = stacks.get(index).pop();

            index++;

            final Stack<Integer> temp = new Stack<>();
            while (index < stacks.size()) {
                final Stack<Integer> stackAtIndex = stacks.get(index);
                while (!stackAtIndex.isEmpty()) {
                    temp.push(stackAtIndex.pop());
                }

                // Insert last value from current stack into previous one
                stacks.get(index - 1).push(temp.pop());

                // Reinsert all values into current stack
                while (!temp.isEmpty()) {
                    stackAtIndex.push(temp.pop());
                }

                index++;
            }

            if (lastStack().isEmpty()) {
                stacks.remove(stacks.size() - 1);
            }

            return value;
        }

        private Stack<Integer> lastStack() {
            return stacks.get(stacks.size() - 1);
        }
    }
}
