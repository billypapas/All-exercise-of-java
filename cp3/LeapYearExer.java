package gr.aueb.cf.cp3;

import java.util.Scanner;


/**
 * class examine if the given year is leap year or not.
 *
 */
public class LeapYearExer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeapYear = false;


        System.out.println("Enter the year to let you know if it's a leap year");
        year = in.nextInt();

        if (year <= 0) {
            System.out.println("The year given must be greater than 0, please try again");
            year = in.nextInt();
        }

        //year must be divisible by 4,400 and not by 100.
        if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }

        System.out.printf("%d is %s",year, isLeapYear ? "leap year" : "not a leap year" );


    }
}
