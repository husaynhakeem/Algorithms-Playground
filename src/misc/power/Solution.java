package misc.power;

import java.math.BigInteger;

class Solution {

    int power(String a) {
        final BigInteger bigTwo = new BigInteger("2");
        BigInteger bigA = new BigInteger(a);

        if (bigA.mod(bigTwo).equals(new BigInteger("1"))) {
            return 0;
        }

        while (bigA.compareTo(bigTwo) == 1) {
            bigA = bigA.divide(bigTwo);
        }

        return bigA.compareTo(bigTwo) == 0 ? 1 : 0;
    }
}
