package BankAccountTransfer;

public class BankTransferService {


    public BankTransfer doABankTransfer(BankAccount account1, BankAccount account2, double transferAmount) {
        if (account1.getBalance() < transferAmount) {
            boolean isSuccessful = false;
            return new BankTransfer(account1, account2,transferAmount,isSuccessful);
        } else {
           account1.setBalance(account1.getBalance() - transferAmount);
           account2.setBalance(account2.getBalance() + transferAmount);
           boolean isSuccessful = true;
           return new BankTransfer(account1, account2,transferAmount,isSuccessful);
        }

    }


}
