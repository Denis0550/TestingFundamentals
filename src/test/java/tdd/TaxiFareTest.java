package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaxiFareTest {

    private TaxiFare taxiFare;

    @BeforeEach
    void beforeEach() {
        taxiFare = new TaxiFare();

    }

    //The test scenarios are:
    //- Kati's ride lasted 20 kilometers and the fare was 20.00;
    @Test
    void testLongRideCosts20Euros() {
        // given
        int kilometers = 20;

        // when
        double result = taxiFare.calculateFare(kilometers);

        //then
        Assertions.assertThat(result).isEqualTo(20.00);
    }

    //- Agu's ride lasted 5 kilometers and the fare was 6.00;
    @Test
    void testShortRideCosts6Euros() {
        // given
        int kilometers = 5;

        // when
        double result = taxiFare.calculateFare(kilometers);

        //then
        Assertions.assertThat(result).isEqualTo(6.00);
    }

    //- Trinu's ride lasted 10 kilometers and the fare was 10.00;
    @Test
    void testLongRideCosts10Euros() {
        // given
        int kilometers = 10;

        // when
        double result = taxiFare.calculateFare(kilometers);

        //then
        Assertions.assertThat(result).isEqualTo(10.00);
    }

    //- Ott's ride lasted 8 kilometers and the fare was 8.40.
    @Test
    void testShortRideCosts848Euros() {
        // given
        int kilometers = 8;

        // when
        double result = taxiFare.calculateFare(kilometers);

        //then
        Assertions.assertThat(result).isEqualTo(8.40);

    }

}
