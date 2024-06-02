package gr.aueb.cf.cp13.bankapp;

import gr.aueb.cf.cp13.bankapp.model.*;

public class MainBankApp {
    public static void main(String[] args) {
        //instance of a new account
        Account billAccount = new Account(12345, "GR12345", "Vasileios", "Papagiannis", "GRVASILEIOS", 100);

        //Overdraft from account
        OverdraftAccount.Overdraft(150, billAccount);
        System.out.printf("A new loan was created which is amount of %.2f euro\n", billAccount.getLoan());
        System.out.printf("Now balance is: %.2f euro\n",billAccount.getBalance());

        //instance of a new account and add it to the previous account
        Account dimitraAccount = new Account(1234567, "Dimitra", "Papagianni");
        JointAccount.addAccountHolder(billAccount, dimitraAccount);
    }
}
