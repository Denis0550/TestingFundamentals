package BankAccountTransfer;

import loan.HomeLoanService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTransferServiceTest {
    private BankTransferService bankTransferService;

    @BeforeEach
    void beforeEach() {
        bankTransferService = new BankTransferService();
    }

    // Test scenario 1:
    // account 1 : 54228885985452135485554877 James Webb 53_768.30
    // account 2 : 84111485950561308548442389 Peter Higgs 22_234.56
    // Transferred amount = 5300
    // account 1 : 54228885985452135485554877 James Webb 48_468.30
    // account 2 : 84111485950561308548442389 Peter Higgs 27_534.56

    @Test
    void testScenarioOne() {
        // given
        BankAccount accountOne = new BankAccount("54228885985452135485554877",
                "James Webb", 53_768.30);
        BankAccount accountTwo = new BankAccount("84111485950561308548442389",
                "Peter Higgs", 22_234.56);
        double transferredAmount = 5300.00;

        // when
        BankTransfer result = bankTransferService.doABankTransfer(accountOne,accountTwo,transferredAmount);

        // then
        Assertions.assertThat(result.isSuccessful).isTrue();
        Assertions.assertThat(result.account1.getBalance()).isEqualTo(48_468.30);
        Assertions.assertThat(result.account2.getBalance()).isEqualTo(27_534.56);
        Assertions.assertThat(result.account1.getAccountNumber()).isEqualTo(accountOne.getAccountNumber());
        Assertions.assertThat(result.account2.getAccountNumber()).isEqualTo(accountTwo.getAccountNumber());

    }


    // Test scenario 2:
    // account 1 : 68661516548165516813213555 George Washington 14_555.16
    // account 2 : 48645151681321358615131565 Charles Xavier 22_234.56
    // Transferred amount = 18_000.00
    // account 1 : 68661516548165516813213555 George Washington 14_555.16
    // account 2 : 48645151681321358615131565 Charles Xavier 22_234.56

    @Test
    void testScenarioTwo() {
        // given
        BankAccount accountOne = new BankAccount("68661516548165516813213555",
                "George Washington", 14_555.16);
        BankAccount accountTwo = new BankAccount("48645151681321358615131565",
                "Charles Xavier", 22_234.56);
        double transferredAmount = 18_000.00;

        // when
        BankTransfer result = bankTransferService.doABankTransfer(accountOne,accountTwo,transferredAmount);

        // then
        Assertions.assertThat(result.isSuccessful).isFalse();
        Assertions.assertThat(result.account1.getBalance()).isEqualTo(14_555.16);
        Assertions.assertThat(result.account2.getBalance()).isEqualTo(22_234.56);
        Assertions.assertThat(result.account1.getAccountNumber()).isEqualTo(accountOne.getAccountNumber());
        Assertions.assertThat(result.account2.getAccountNumber()).isEqualTo(accountTwo.getAccountNumber());

    }




}
