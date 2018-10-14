package euler.problem_001;

class Solution_1 {

    int sumOfMultiplesOfThreeOrFiveSmallerThan(final int high) {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (isMultipleOfThreeOrFive(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isMultipleOfThreeOrFive(final int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
