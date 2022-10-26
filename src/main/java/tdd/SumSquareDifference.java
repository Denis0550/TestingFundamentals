package tdd;

public class SumSquareDifference {

    // In this exercise we will calculate the difference between the square of sums and the sum of squares from all
    // numbers between 1 and `n`, where `n` is provided as a method parameter.
    // The square of sums is given by `(1 + ... + n)^2` and the sum of squares is given by `1^2 + ... + n^2`.
    // Let's use `n = 10` as an example.
    // The square of the sum is `(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10)^2 = 55^2 = 3025`.
    // The sum of the squares is `1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 = 385`.
    // The difference between the square of sums and the sum of squares is `3025 - 385` and final answer is `2640`.

    public int calculatedDifference(int n) {
        int squareOfSums = 0;
        int sumOfSquare = 0;
        int difference;

        for (int i = 1; i <= n; i++) {
            squareOfSums = squareOfSums + i;
        }
        squareOfSums = squareOfSums * squareOfSums;

        for (int i = 1; i <= n ; i++) {
            sumOfSquare = sumOfSquare + i * i;
        }

        difference = squareOfSums - sumOfSquare;
        return difference;
    }
}
