package BankAccountTransfer;

public class BankTransfer {
    BankAccount account1;
    BankAccount account2;
    double transferAmount;
    boolean isSuccessful;

    public BankTransfer(BankAccount account1, BankAccount account2, double transferAmount, boolean isSuccessful) {
        this.account1 = account1;
        this.account2 = account2;
        this.transferAmount = transferAmount;
        this.isSuccessful = isSuccessful;
    }

    public BankAccount getAccount1() {
        return account1;
    }

    public BankAccount getAccount2() {
        return account2;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }
}
