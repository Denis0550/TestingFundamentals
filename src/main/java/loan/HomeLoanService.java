package loan;

public class HomeLoanService {

    /**
     * This method evaluates if a bank customer is eligible for a home loan.
     * It receives the account and the propertyPrice as parameters.
     * <p>
     * For property price smaller than 150_000.00, we will require only 15% down payment.
     * For property price greater or equal to 150_000.00, we will require 20% down payment.
     * <p>
     * If the account has enough balance to cover the down payment, the loan request should
     * be granted. If there isn't enough balance, the request should be rejected.
     */
    public LoanApplication applyForHomeLoan(Account account, double propertyPrice) {
        double percentage = propertyPrice >= 150_000 ? 0.20 : 0.15; // Ternary

//        double percentage;
//
//        if (propertyPrice >= 150_000) {
//            percentage = 0.20;
//        } else {
//            percentage = 0.15;
//        }

        double downPayment = propertyPrice * percentage;

        boolean isGranted = account.getBalance() >= downPayment ? true : false;
//        boolean isGranted;
//
//        if (account.getBalance() >= downPayment) {
//            isGranted = true;
//        } else {
//            isGranted = false;
//        }

        return new LoanApplication(account, propertyPrice, isGranted);
    }

}
