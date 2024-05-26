package gr.aueb.cf.cp4;

import java.util.Scanner;

/**
 * print stars from 1 to n
 */
public class StarsFrom1ToN {
    public static void main(String[] args) {
        int nStars = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("please enter the number of stars you would like to finish with");
        nStars = in.nextInt();

        //check if nStars is negative number
        while (nStars < 0) {
            System.out.print("can't be a negative number, please try again");
            nStars = in.nextInt();
        }

        for (int i = 1; i <= nStars; i++) {

            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
