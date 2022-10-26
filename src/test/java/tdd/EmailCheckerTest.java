package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailCheckerTest {

    private EmailChecker checker;

    @BeforeEach
    void beforeEach() {
        checker = new EmailChecker();
    }

    @Test
    void testNumberOne() {
        // given
        String givenMail = "Jonathen.Mattaw@noneofyourbusiness.com";

        // when
        boolean result = checker.checkingTheEmail(givenMail);

        // then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void testNumberTwo() {
        // given
        String givenMail = "mh1990@hotrod.ee";

        // when
        boolean result = checker.checkingTheEmail(givenMail);

        // then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void testNumberThree() {
        // given
        String givenMail = "comedy//s@nation.ee";

        // when
        boolean result = checker.checkingTheEmail(givenMail);

        // then
        Assertions.assertThat(result).isFalse();
    }


}
