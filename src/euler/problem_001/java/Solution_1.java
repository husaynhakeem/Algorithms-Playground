package euler.problem_001.java;

public class Solution_1 {

    public static void main(String[] args) {
        System.out.println(sumOfMultiplesOfThreeOrFiveSmallerThan(1000));
    }

    private static int sumOfMultiplesOfThreeOrFiveSmallerThan(int high) {
        int sum = 0;
        int n = 3;

        while (sum + n <= high) {
            if (isMultipleOfThreeOrFive(n))
                sum += n;
            n++;
        }

        return sum;
    }

    private static boolean isMultipleOfThreeOrFive(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
