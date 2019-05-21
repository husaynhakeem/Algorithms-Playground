package leetcode.interview_amazon_2.problem_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    static class LRUCache {
        private final Map<Integer, Integer> map = new HashMap<>();
        private final List<Integer> list = new ArrayList<>();
        private final int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                list.remove(Integer.valueOf(key));
                list.add(key);
                return map.get(key);
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                list.remove(Integer.valueOf(key));
                list.add(key);
            } else {
                if (list.size() == capacity) {
                    map.remove(list.get(0));
                    list.remove(0);
                }
                list.add(key);
            }
            map.put(key, value);
        }
    }
}
