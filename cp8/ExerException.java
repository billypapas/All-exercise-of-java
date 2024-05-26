package gr.aueb.cf.cp8;

import java.util.Scanner;

public class ExerException {
    public static void main(String[] args) {
        int num = 0;

        do {
            printMenu();

            num = getChoice();

            try {
                printChoice(num);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice!");
            }
        } while (num != 5);

        System.out.println("Good Bye!!");
        System.exit(0);
    }

    /**
     * Print Menu.
     */
    public static void printMenu () {
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }

    /**
     * Get the input of user
     * @return the input if it is integer
     */
    public static int getChoice() {
        Scanner in = new Scanner(System.in);

        if(!in.hasNextInt()){
            return -1;
        }
        return in.nextInt();
    }

    /**
     * print integer if this is one of the menu choice
     * @param choice integer
     * @throws IllegalArgumentException if integer not exist on the menu throws exception
     */
    public static void printChoice (int choice) throws IllegalArgumentException{
        if(choice < 1 || choice > 5) {
            throw new IllegalArgumentException();
        }
            switch (choice) {
                case 1:
                    System.out.println("Your choice is: 1. Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Your choice is: 2. Διαγραφή");
                    break;
                case 3:
                    System.out.println("Your choice is:  3. Ενημέρωση");
                    break;
                case 4:
                    System.out.println("Your choice is: 4. Αναζήτηση");
                    break;
                default:
                    System.out.println("Your choice is: 5. Έξοδος");
                    break;
            }
        }
}
