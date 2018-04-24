package euler.problem_001.java;

public class Solution_1 {

    public static void main(String[] args) {
        System.out.println(sumOfMultiplesOfThreeOrFiveSmallerThan(1000));
    }

    private static int sumOfMultiplesOfThreeOrFiveSmallerThan(int high) {
        int sum = 0;

        for (int i = 0; i <= 1000; i++) {
            if (isMultipleOfThreeOrFive(i))
                sum += i;
        }

        return sum;
    }

    private static boolean isMultipleOfThreeOrFive(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
