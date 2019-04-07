package leetcode.problem_0281;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

    static class ZigzagIterator {

        private Iterator<Integer> iterator;

        public ZigzagIterator(final List<List<Integer>> lists) {
            final int maxSize = maxSize(lists);
            final List<Integer> items = new ArrayList<>();
            for (int i = 0; i < maxSize; i++) {
                for (int j = 0; j < lists.size(); j++) {
                    if (i < lists.get(j).size()) {
                        items.add(lists.get(j).get(i));
                    }
                }
            }

            iterator = items.iterator();
        }

        private int maxSize(final List<List<Integer>> lists) {
            int max = 0;
            for (final List<Integer> list : lists) {
                max = Math.max(max, list.size());
            }
            return max;
        }

        public int next() {
            return iterator.next();
        }

        public boolean hasNext() {
            return iterator.hasNext();
        }
    }
}
