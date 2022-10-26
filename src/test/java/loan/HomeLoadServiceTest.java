package loan;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class HomeLoadServiceTest {
    private HomeLoanService homeLoanService;

    @BeforeEach
    void beforeEach() {
        homeLoanService = new HomeLoanService();
    }

    //Test scenario 1:
    //- Property price = 140_000.00
    //- Account balance = 21_000.00
    //- Final decision = granted
    @Test
    void testLowerPriceAccountBalanceOk() {
        // given
        Account account = new Account("12345", "Michal Scott", 21_000);
        double propertyPrice = 140_000;

        // when
        LoanApplication result = homeLoanService.applyForHomeLoan(account, propertyPrice);

        // then
        Assertions.assertThat(result.getAccount()).isEqualTo(account);
        Assertions.assertThat(result.getPropertyPrice()).isEqualTo(propertyPrice);
        Assertions.assertThat(result.isGranted()).isTrue();


    }

    //Test scenario 2:
    //- Property price = 125_000.00
    //- Account balance = 18_749.00
    //- Final decision = not granted
    @Test
    void testLowerPriceAccountBalanceNot() {
        // given
        Account account = new Account("12344", "Wayne Rooney",18_749);
        double propertyPrice = 125_000;

        // when
        LoanApplication result =homeLoanService.applyForHomeLoan(account, propertyPrice);

        // then
        Assertions.assertThat(result.getAccount()).isEqualTo(account);
        Assertions.assertThat(result.getPropertyPrice()).isEqualTo(propertyPrice);
        Assertions.assertThat(result.isGranted()).isFalse();

    }

    //Test scenario 3:
    //- Property price = 150_000.00
    //- Account balance = 30_000.00
    //- Final decision = granted
    @Test
    void testPropertyPriceOKAccountBalanceOk() {
        // given
        Account account = new Account("122243", "David Beckham",30_000);
        double propertyPrice = 150_000;

        // when
        LoanApplication result =homeLoanService.applyForHomeLoan(account, propertyPrice);

        // then
        Assertions.assertThat(result.getAccount()).isEqualTo(account);
        Assertions.assertThat(result.getPropertyPrice()).isEqualTo(propertyPrice);
        Assertions.assertThat(result.isGranted()).isTrue();
    }

    //Test scenario 4:
    //- Property price = 200_000.00
    //- Account balance = 25_000.00
    //- Final decision = not granted
    @Test
    void testPropertyPriceMoreAccountBalanceNot() {
        // given
        Account account = new Account("4563", "Lionel Messi",25_000);
        double propertyPrice = 200_000;

        // when
        LoanApplication result =homeLoanService.applyForHomeLoan(account, propertyPrice);

        // then
        Assertions.assertThat(result.getAccount()).isEqualTo(account);              // safety net check
        Assertions.assertThat(result.getPropertyPrice()).isEqualTo(propertyPrice);  // safety net check
        Assertions.assertThat(result.isGranted()).isFalse();                        // main check

    }

}
