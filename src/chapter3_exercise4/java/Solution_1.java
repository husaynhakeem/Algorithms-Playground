package chapter3_exercise4.java;

import java.util.Stack;

public class Solution_1 {

    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>();
        System.out.println(q.isEmpty());
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
    }

    private static class MyQueue<T> {

        private Stack<T> first = new Stack<>();
        private Stack<T> second = new Stack<>();

        public boolean isEmpty() {
            return size() == 0;
        }

        public int size() {
            if (!first.isEmpty())
                return first.size();

            if (!second.isEmpty())
                return second.size();

            return 0;
        }

        public void add(T data) {
            first.push(data);
        }

        public T peek() {
            if (isEmpty())
                return null;
            shiftStacks();
            return second.peek();
        }

        public T remove() {
            if (isEmpty())
                return null;
            shiftStacks();
            return second.pop();
        }

        private void shiftStacks() {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
    }
}
