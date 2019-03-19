package leetcode.interview_google_1.problem_1;

import java.util.*;

public class Solution {

    String nextClosestTime(String time) {
        final int currentTime = toIntTime(time);
        final Set<Integer> times = allPossibleTimes(timeDigits(time), currentTime);

        if (times.isEmpty()) {
            return time;
        }
        return toStringTime(maxSmallerThan(times, currentTime));
    }

    private int toIntTime(final String time) {
        final int hours = Integer.parseInt(time.substring(0, 2));
        final int minutes = Integer.parseInt(time.substring(3));
        return hours * 100 + minutes;
    }

    private String toStringTime(final int time) {
        final int hours = time / 100;
        final int minutes = time % 100;

        final String hoursString = (hours <= 9 ? "0" + hours : "" + hours);
        final String minutesString = (minutes <= 9 ? "0" + minutes : "" + minutes);

        return hoursString + ":" + minutesString;
    }

    private List<Integer> timeDigits(final String time) {
        final List<Integer> digits = new ArrayList<>();
        digits.add(time.charAt(0) - '0');
        digits.add(time.charAt(1) - '0');
        digits.add(time.charAt(3) - '0');
        digits.add(time.charAt(4) - '0');
        return digits;
    }

    private Set<Integer> allPossibleTimes(final List<Integer> digits, final int except) {
        final Set<Integer> times = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        final int aTime = 1000 * digits.get(i) + 100 * digits.get(j) + 10 * digits.get(k) + digits.get(l);
                        if (aTime != except && isValidTime(aTime)) {
                            times.add(aTime);
                        }
                    }
                }
            }
        }
        return times;
    }

    private boolean isValidTime(final int time) {
        final int hours = time / 100;
        final int minutes = time % 100;
        return hours <= 23 && minutes <= 59;
    }

    private int maxSmallerThan(final Set<Integer> set, final int number) {
        int max = Integer.MAX_VALUE;
        for (int n : set) {
            if (number <= n && n < max) {
                max = n;
            }
        }
        return max == Integer.MAX_VALUE ? Collections.min(set) : max;
    }
}
