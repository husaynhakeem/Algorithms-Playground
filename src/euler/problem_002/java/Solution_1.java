package euler.problem_002.java;

public class Solution_1 {

    private static final int FIBONACCI_LIMIT = 4_000_000;

    public static void main(String[] args) {
        System.out.println(sumOfEvenValuedFibonacciValues());
    }

    private static int sumOfEvenValuedFibonacciValues() {
        int first = 0;
        int second = 1;
        int third = first + second;

        int evenValuesSum = 0;

        while (first + second < FIBONACCI_LIMIT) {
            if (isEven(first))
                evenValuesSum += first;
            if (isEven(second))
                evenValuesSum += second;

            first = second;
            second = third;
            third = first + second;
        }

        return evenValuesSum;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
