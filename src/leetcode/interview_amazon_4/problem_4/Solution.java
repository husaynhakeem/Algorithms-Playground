package leetcode.interview_amazon_4.problem_4;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static class MedianFinder {

        final List<Integer> list;

        MedianFinder() {
            list = new ArrayList<>();
        }

        void addNum(final int num) {
            int index = 0;
            while (index < list.size() && num > list.get(index)) {
                index++;
            }

            if (index == 0) {
                list.add(0, num);
            } else if (index == list.size()) {
                list.add(num);
            } else {
                list.add(index, num);
            }
        }

        double findMedian() {
            if (list.size() % 2 == 1) {
                return list.get(list.size() / 2);
            }
            return ((double) (list.get(list.size() / 2) + list.get(-1 + list.size() / 2))) / 2;
        }
    }
}
