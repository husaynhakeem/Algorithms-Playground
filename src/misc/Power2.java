package misc;

/**
 * Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.
 * <p>
 * Example
 * <p>
 * Input : 4
 * Output : True
 * as 2^2 = 4.
 */
class Power2 {

    boolean isPower(int a) {
        if (a == 1) return true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            long power = i * i;
            while (isInteger(power) && power < a) {
                power *= i;
            }
            if (power == a) {
                return true;
            }
        }
        return false;
    }

    private boolean isInteger(final long a) {
        return Integer.MIN_VALUE <= a && a <= Integer.MAX_VALUE;
    }
}
