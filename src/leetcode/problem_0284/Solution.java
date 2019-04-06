package leetcode.problem_0284;

import java.util.Iterator;

public class Solution {

    static class PeekingIterator implements Iterator<Integer> {

        private Integer next;
        private final Iterator<Integer> iterator;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
            if (iterator.hasNext()) {
                next = iterator.next();
            }
        }

        public Integer peek() {
            return next;
        }

        @Override
        public Integer next() {
            final Integer result = next;
            if (iterator.hasNext()) {
                next = iterator.next();
            } else {
                next = null;
            }
            return result;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }
}
