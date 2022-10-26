package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumSquareDifferenceTest {

    private SumSquareDifference sumSquareDifference;

    @BeforeEach
    void beforeEach() {
        sumSquareDifference = new SumSquareDifference();
    }

    //The test scenarios are:
    //- Given the number 10, the differences are `3025 - 385` and the final answer is `2640`;
    @Test
    void givenNumber10(){
        // given
        int givenNumber = 10;

        // when
        int result = sumSquareDifference.calculatedDifference(givenNumber);

        // then
        Assertions.assertThat(result).isEqualTo(2640);
    }

    //- Given the number 20, the differences are `44100 - 2870` and the final answer is `41230`;
    @Test
    void givenNumber20() {
        // given
        int givenNumber = 20;

        // when
        int result = sumSquareDifference.calculatedDifference(givenNumber);

        // then
        Assertions.assertThat(result).isEqualTo(41_230);
    }

    //- Given the number 30, the differences are `216225 - 9455` and the final answer is `206770`.
    @Test
    void givenNumber30() {
        // given
        int givenNumber = 30;

        // when
        int result = sumSquareDifference.calculatedDifference(givenNumber);

        // then
        Assertions.assertThat(result).isEqualTo(206_770);
    }

}
