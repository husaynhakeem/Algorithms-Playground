package cracking_the_coding_interview.chapter_16.exercise_25;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private static class DoublyLinkedList<T> {

        static class Node<T> {
            T data;
            Node<T> next;
            Node<T> previous;

            Node(T data) {
                this.data = data;
            }
        }

        private Node<T> head;
        private Node<T> tail;

        void insert(final T t) {
            final Node<T> node = new Node<>(t);
            if (head != null) {
                head.previous = node;
            }
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;
            }
        }

        T remove(final T t) {
            Node<T> temp = head;
            while (temp != null && temp.data != t) {
                temp = temp.next;
            }
            if (temp == null) {
                return null;
            }
            if (temp.previous != null) {
                temp.previous.next = temp.next;
            }
            if (temp.next != null) {
                temp.next.previous = temp.previous;
            }
            return temp.data;
        }

        T removeLast() {
            if (tail == null) {
                return null;
            }
            final T data = tail.data;
            final Node<T> previous = tail.previous;
            if (previous == null) {
                tail = null;
                head = null;
            } else {
                previous.next = null;
                tail = previous;
            }
            return data;
        }
    }

    static class LRUCache<T> {

        private int capacity;
        private DoublyLinkedList<Integer> keys = new DoublyLinkedList<>();
        private Map<Integer, T> items = new HashMap<>();

        LRUCache(int capacity) {
            this.capacity = capacity;
        }

        void insert(final int key, final T t) {
            if (items.size() == capacity) {
                final int lastKey = keys.removeLast();
                items.remove(lastKey);
            }
            keys.insert(key);
            items.put(key, t);
        }

        T retrieve(final int key) {
            if (items.containsKey(key)) {
                keys.remove(key);
                keys.insert(key);
                return items.get(key);
            }
            return null;
        }
    }
}
