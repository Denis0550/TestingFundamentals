package tdd;

public class TaxiFare {

    //Create a method that calculates the taxi fare for one ride.
    //All rides have a base fare of 2.00.
    //For rides shorter or equal to 10km the fare per kilometer is 0.80.
    //For rides longer than 10km the fare per kilometer is 0.90.

    public double calculateFare(int kilometers) {
        double baseFare = 2.00;
        double kilometerFare = kilometers <= 10 ? 0.80 : 0.90;
        return baseFare + kilometers * kilometerFare;
    }
}
