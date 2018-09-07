package cracking_the_coding_interview.chapter_03.exercise_01;

class Solution<T> implements SolutionTemplate<T> {

    private static final int NUMBER_OF_STACKS = 3;
    private static final int STACK_CAPACITY = 2;

    private T[] array;
    private int[] stackTopIndex;

    @SuppressWarnings("unchecked")
    public Solution() {
        array = (T[]) new Object[NUMBER_OF_STACKS * NUMBER_OF_STACKS];
        stackTopIndex = new int[NUMBER_OF_STACKS];
    }

    @Override
    public void push(final T item, final int stackNumber) {
        checkStackNumber(stackNumber);

        if (isFull(stackNumber)) {
            return;
        }
        array[peakIndexOf(stackNumber)] = item;
        stackTopIndex[stackNumber]++;
    }

    private int peakIndexOf(final int stackNumber) {
        return stackTopIndex[stackNumber] + STACK_CAPACITY * stackNumber;
    }

    @Override
    public T pop(final int stackNumber) {
        checkStackNumber(stackNumber);

        if (isEmpty(stackNumber)) {
            return null;
        }
        stackTopIndex[stackNumber]--;
        return array[peakIndexOf(stackNumber)];
    }

    @Override
    public T peek(final int stackNumber) {
        checkStackNumber(stackNumber);

        if (isEmpty(stackNumber)) {
            return null;
        }
        return array[peakIndexOf(stackNumber) - 1];
    }

    @Override
    public boolean isEmpty(final int stackNumber) {
        checkStackNumber(stackNumber);
        return stackTopIndex[stackNumber] == 0;
    }

    private boolean isFull(final int stackNumber) {
        return stackTopIndex[stackNumber] == STACK_CAPACITY;
    }

    private void checkStackNumber(final int stackNumber) {
        if (stackNumber < 0 || stackNumber >= NUMBER_OF_STACKS) {
            throw new RuntimeException("Invalid stack number. Trying to access stack with index " + stackNumber + ". The limit is " + (NUMBER_OF_STACKS - 1));
        }
    }
}
