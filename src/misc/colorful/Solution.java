package misc.colorful;

import java.util.HashSet;
import java.util.Set;

class Solution {

    int colorful(int a) {
        final String strA = String.valueOf(a);
        final int digits = digits(a);
        final Set<Integer> products = new HashSet<>();

        for (int step = 1; step <= digits; step++) {
            for (int i = 0; i <= digits - step; i++) {
                final int product = product(strA.substring(i, i + step));
                if (products.contains(product)) {
                    return 0;
                } else {
                    products.add(product);
                }
            }
        }

        return 1;
    }

    private int digits(final int number) {
        return String.valueOf(number).length();
    }

    private int product(final String strNumber) {
        int number = Integer.parseInt(strNumber);
        int result = 1;
        do {
            result *= number % 10;
            number /= 10;
        } while (number != 0);
        return result;
    }
}
