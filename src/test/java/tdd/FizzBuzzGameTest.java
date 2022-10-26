package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {

    //For numbers between 1 and 15 the game should return:
    //"1", "2", "Fizz", "4", "Buzz",
    //"Fizz", "7", "8", "Fizz", "Buzz",
    //"11", "Fizz", "13", "14", "FizzBuzz"

    private FizzBuzzGame fizzBuzzGame;

    @BeforeEach
    void beforeEach() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    void numbersFromOneToFifteen() {
        // given
        int n = 15;
        String[] caseArray = new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"};

        // when
        String[] result = fizzBuzzGame.resultsArray(n);

        // then
        Assertions.assertThat(result).isEqualTo(caseArray);

    }

    // For number between 1 and 100 the game should return:
    //"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
    //"11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
    //"Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
    //"31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
    //"41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
    //"Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
    //"61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
    //"71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
    //"Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
    //"91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"

    @Test
    void numbersFromOneToAHundred() {
        // given
        int n = 100;
        String[] caseArray = new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
                "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
                "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
                "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
                "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
                "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"};

        // when
        String[] result = fizzBuzzGame.resultsArray(n);

        // then
        Assertions.assertThat(result).isEqualTo(caseArray);

    }

}
