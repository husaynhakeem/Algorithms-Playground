package euler.problem_005;

import Utilities.java.IntegerUtils;
import Utilities.java.ListUtils;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    int[] extractPrimeNumbersFromRange(int min, int max) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (IntegerUtils.isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return ListUtils.integerListToIntArray(primeNumbers);
    }

    private boolean isDividableByEachValue(int n, int[] values) {
        for (Integer value : values) {
            if (n % value != 0) {
                return false;
            }
        }
        return true;
    }
}
