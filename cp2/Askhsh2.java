package gr.aueb.cf.cp2;

import java.util.Scanner;

/**
 * class returns the date if you give it a day, month, years
 */

public class Askhsh2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int last2DigOfYear = 0;

        System.out.println("Δώστε μου την ημέρα");
        day = in.nextInt();
        System.out.println("Δώστε μου τον μήνα");
        month = in.nextInt();
        System.out.println("Δώστε μου την χρονιά");
        year = in.nextInt();
        last2DigOfYear = year % 100;//we only want the last two digits of the year

        System.out.printf("Η ημερομηνία ειναι η : %02d/%02d/%d", day, month, last2DigOfYear);

    }
}
