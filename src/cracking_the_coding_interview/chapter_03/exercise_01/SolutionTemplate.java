package cracking_the_coding_interview.chapter_03.exercise_01;

interface SolutionTemplate<T> {

    void push(final T item, final int stackNumber);

    T pop(final int stackNumber);

    T peek(final int stackNumber);

    boolean isEmpty(final int stackNumber);
}
