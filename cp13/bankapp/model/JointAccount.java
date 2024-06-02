package gr.aueb.cf.cp13.bankapp.model;

/**
 * Change access modifier
 */
public class JointAccount {
    /**
     * add second user account of the given account
     * @param account where we want to add second account
     * @param secondAccount where we have to pass id, firstname, lastname parameters of account
     */
    public static void addAccountHolder (Account account, Account secondAccount ) {
        System.out.printf("On account with id:%d was added user account with id:%d", account.getId(), secondAccount.getId());
    }
}
