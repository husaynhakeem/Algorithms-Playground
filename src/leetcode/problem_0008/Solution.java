package leetcode.problem_0008;

class Solution {

    int myAtoi(String str) {
        if (str == null) {
            return 0;
        }

        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }

        char sign = '+';
        int begin = 0;
        switch (str.charAt(0)) {
            case '+':
                sign = '+';
                begin = 1;
                break;
            case '-':
                sign = '-';
                begin = 1;
                break;
            default:
                if (isDigit(str.charAt(0))) {
                    sign = '+';
                    begin = 0;
                } else {
                    return 0;
                }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = begin; i < str.length(); i++) {
            final char c = str.charAt(i);

            if (!isDigit(c)) {
                break;
            }

            sb.append(c);
            final long currentValue = Long.parseLong(sb.toString());
            if (currentValue >= Integer.MAX_VALUE && sign == '+') {
                return Integer.MAX_VALUE;
            }
            if (-1 * currentValue <= Integer.MIN_VALUE && sign == '-') {
                return Integer.MIN_VALUE;
            }
        }

        if (sb.length() == 0) {
            return 0;
        }
        return Integer.parseInt(sb.toString()) * (sign == '+' ? 1 : -1);
    }

    private boolean isDigit(final char c) {
        return '0' <= c && c <= '9';
    }
}
