package tdd;

import java.util.Arrays;

public class FizzBuzzGame {

    // In this game we should print a sequence of numbers from 1 to `n`, where `n` is provided as a method parameter.

    // When printing the number we need to pay attention to some rules:
    //- Numbers divisible by 3 should appear as `Fizz` instead of number;
    //- Numbers divisible by 5 should appear as `Buzz` instead of number;
    //- Numbers divisible by 3 and 5 should appear as `FizzBuzz` instead of number.

    public String[] resultsArray(int n) {

        String[] resultsArray = new String[n];

        for (int i = 0; i < n ; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                resultsArray[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                resultsArray[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                resultsArray[i] = "Buzz";
            } else {
                resultsArray[i] = String.valueOf(i+1);
            }

        }
        return resultsArray;
    }

}

