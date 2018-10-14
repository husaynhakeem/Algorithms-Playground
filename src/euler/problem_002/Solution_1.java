package euler.problem_002;

class Solution_1 {

    int sumOfEvenValuedFibonacciValuesSmallerThan(final int n) {
        int first = 0;
        int second = 1;
        int third = first + second;
        int sum = 0;

        while (first + second < n) {
            if (isEven(third)) {
                sum += third;
            }

            first = second;
            second = third;
            third = first + second;
        }
        return sum;
    }

    private boolean isEven(final int n) {
        return n % 2 == 0;
    }
}
