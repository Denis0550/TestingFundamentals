package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    // Test scenario 1:
    //5 + 3 = 8;
    @Test
    void testFivePlusThreeIsEqualsToEight() {
        // given
        double first = 5;
        double second = 3;

        // when
        double result = calculator.add(first, second);

        // then
        Assertions.assertEquals(8, result);
    }

    //Test scenario 2:
    //2 - 6 = -4;
    @Test
    void testTwoMinusSixIsEqualsToMinusFour() {
        // given
        double first = 2;
        double second = 6;

        // when
        double result = calculator.subtract(first, second);

        // then
        Assertions.assertEquals(-4, result);

    }

    //Test scenario 3:
    //8.4 / 4.2 = 2;
    @Test
    void testEightPointFourDividedByFourPointTwoIsEqualToTwo() {
        //given
        double first = 8.4;
        double second = 4.2;

        // when
        double result = calculator.divide(first, second);

        // then
        Assertions.assertEquals(2, result);
    }

    //Test scenario 4:
    //2.9 * 7.4 = 21.46.
    @Test
    void testTwoPointNineMultiplyBySevenPointFourIsEqualToTwentyOnePointFortySix() {
        //given
        double first = 2.9;
        double second = 7.4;

        // when
        double result = calculator.multiply(first, second);

        // then
        Assertions.assertEquals(21.46, result);
    }


}
