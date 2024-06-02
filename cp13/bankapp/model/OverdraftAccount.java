package gr.aueb.cf.cp13.bankapp.model;

/**
 * Create overdraft of the given account.
 */
public class OverdraftAccount {

    /**
     * Account balance become zero and loan was generated
     * @param amount of money withdraw (ti is not loan money)
     * @param account where we want to withdraw money
     */
    public static void Overdraft (double amount, Account account) {
        account.setLoan(amount - account.getBalance());
        account.setBalance(0);
    }

}
