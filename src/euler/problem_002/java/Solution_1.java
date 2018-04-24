package euler.problem_002.java;

public class Solution_1 {

    public static void main(String[] args) {
        System.out.println(sumOfEvenValuedFibonacciValuesSmallerThan(4_000_000));
    }

    private static int sumOfEvenValuedFibonacciValuesSmallerThan(int n) {
        int first = 0;
        int second = 1;
        int third = first + second;

        int evenValuesSum = 0;

        while (first + second < n) {
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
