package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollatzSequenceTest {

    private CollatzSequence collatzSequence;

    @BeforeEach
    void beforeEach(){
        collatzSequence = new CollatzSequence();
    }

    //The test scenarios are:
    //- Given the number 13, the sequence is: 13, 40, 20, 10, 5, 16, 8, 4, 2, 1;
    @Test
    void givenNumber13() {
        // given
        int givenNumber = 13;
        String check = "13, 40, 20, 10, 5, 16, 8, 4, 2, 1";

        // when
        String result = collatzSequence.calculateSequence(givenNumber);

        // then
        Assertions.assertThat(result).isEqualTo(check);
    }

    //- Given the number 25, the sequence is: 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1;
    @Test
        void givenNumber25() {
        // given
        int givenNumber = 25;
        String check = "25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1";

        // when
        String result = collatzSequence.calculateSequence(givenNumber);

        // then
        Assertions.assertThat(result).isEqualTo(check);
    }

    //- Given the number 9, the sequence is: 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1.
    @Test
    void givenNumber9() {
        // given
        int givenNumber = 9;
        String check = "9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1";

        // when
        String result = collatzSequence.calculateSequence(givenNumber);

        // then
        Assertions.assertThat(result).isEqualTo(check);
    }


}
