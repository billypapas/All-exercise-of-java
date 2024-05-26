package gr.aueb.cf.cp4;

import java.util.Scanner;

/**
 * print n stars vertical
 */
public class StarsVertical {
    public static void main(String[] args) {
        int nStars = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("please enter the number of stars you would like to print vertically");
        nStars = in.nextInt();

        //check if nStars is negative number
        while(nStars<0) {
            System.out.print("can't be a negative number, please try again");
            nStars = in.nextInt();
        }

        for (int i = 1; i <= nStars; i++){
            System.out.println("*");
        }
    }
}
