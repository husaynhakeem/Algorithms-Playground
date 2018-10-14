package euler.problem_002;

class Solution_1 {

    int sumOfEvenValuedFibonacciValuesSmallerThan(final int n) {
        int first = 0;
        int second = 1;
        int third = first + second;

        int evenValuesSum = 0;
        while (first + second < n) {
            if (isEven(first)) {
                evenValuesSum += first;
            }

            if (isEven(second)) {
                evenValuesSum += second;
            }

            first = second;
            second = third;
            third = first + second;
        }
        return evenValuesSum;
    }

    private boolean isEven(final int n) {
        return n % 2 == 0;
    }
}
