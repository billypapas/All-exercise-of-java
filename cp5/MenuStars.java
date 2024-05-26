package gr.aueb.cf.cp5;

import java.util.Scanner;

/**
 * Interactive menu of n stars
 */

public class MenuStars {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int nStars = 0;
        int choice = 0;

        do {
            printMenu();
            System.out.println("Δώσε επιλογή:");
            choice = getUserChoice();

            if (choice > 0 && choice <= 5) {
                System.out.print("Δώστε αριθμό για αστεράκια:");
                nStars = getUserChoice();
            }

            getStarsResult(choice, nStars);

        } while (choice != 6);
        System.out.println("Τέλος εφαρμογής Stars");
    }

    public static void printMenu () {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }
    public static int getUserChoice () {
        return in.nextInt();
    }

    public static void horizontalStars (int n){
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void getStarsResult ( int choice, int nStars){
        switch (choice) {
            case 1:
                horizontalStars(nStars);
                System.out.print("\n");
                break;
            case 2:
                for (int i = 1; i <= nStars; i++) {
                    System.out.println("*");
                }
                break;
            case 3:
                for (int i = 1; i <= nStars; i++) {
                    horizontalStars(nStars);
                    System.out.print("\n");
                }
                break;
            case 4:
                //int counter = 1;
                for (int i = 1; i <= nStars; i++) {
                    horizontalStars(i);
                    System.out.print("\n");
                }
                break;
            case 5:
                for (int i = nStars; i >= 0; i--) {
                    horizontalStars(i);
                    System.out.print("\n");
                }
                break;
            case 6:
                System.out.println("Επιτυχης Εξοδος!!");
                break;
            default:
                System.out.print("Λαθος επιλογή!!");
        }
    }
}