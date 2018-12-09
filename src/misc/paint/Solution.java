package misc.paint;

import java.util.ArrayList;

class Solution {

    private static final int FACTOR = 10000003;

    int paint(final int painters, final int timePerUnit, final ArrayList<Integer> boardLengths) {
        return paint(painters, timePerUnit, 0, boardLengths);
    }

    private int paint(final int painters, final int timePerUnit, final int boardIndex, final ArrayList<Integer> boardLengths) {
        if (painters == 0 || boardIndex >= boardLengths.size()) {
            return 0;
        }

        if (painters == 1) {
            return (timePerUnit * sum(boardLengths, boardIndex)) % FACTOR;
        }

        final int currentCost = timePerUnit * boardLengths.get(boardIndex);
        final int firstCost = currentCost + paint(painters, timePerUnit, boardIndex + 1, boardLengths);
        final int secondCost = Math.max(currentCost, paint(painters - 1, timePerUnit, boardIndex + 1, boardLengths));

        return Math.min(firstCost % FACTOR, secondCost % FACTOR);
    }

    private int sum(final ArrayList<Integer> list, final int from) {
        int sum = 0;
        for (int i = from; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
