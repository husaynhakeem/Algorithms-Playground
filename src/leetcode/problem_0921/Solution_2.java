package leetcode.problem_0921;

public class Solution_2 {

    int minAddToMakeValid(final String s) {
        int open = 0;
        int close = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open == 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }

        return open + close;
    }
}
