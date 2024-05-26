package gr.aueb.cf.cp3;

import java.util.Scanner;

/**
 * A menu appears, which terminates when the user enters the number 5.
 * If user gives a number from the menu, he will receive the appropriate
 * message.
 */
public class MenuExer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            if (choice <= 0 || choice > 5) {
                System.out.println("Wrong number please try again!!");
                choice = in.nextInt();
            }

            if (choice==1) {

                System.out.println("Επιλέξατε Εισαγωγή!!");

            } else if (choice==2) {

                System.out.println("Επιλέξατε Διαγραφή!!");

            } else if (choice==3) {

                System.out.println("Επιλέξατε Ενημέρωση!!");

            } else if (choice==4) {

                System.out.println("Επιλέξατε Αναζήτηση !!");

            }

        } while (choice != 5);

        System.out.println("Επιλέξατε Έξοδος!!");

    }
}
