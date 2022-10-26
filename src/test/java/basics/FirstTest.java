package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void testOnePlusTwoEqualsThree() {
        // given
        int firstNumber = 1;
        int secondNumber = 2;

        // when
        int result = firstNumber + secondNumber;

        // then
        Assertions.assertEquals(3, result);

    }

}
