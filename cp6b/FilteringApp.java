package gr.aueb.cf.cp6b;

import java.util.Scanner;

public class FilteringApp {
    static int[] arr = new int[6];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int counter = 0;
        System.out.println("Please give numbers from 1 to 49 until you give 6 correct numbers");

        while (counter != 6) {
            int givenNumber = in.nextInt();
            if (givenNumber >= 1 && givenNumber <= 49) {
                arr[counter] = givenNumber;
                counter++;
            } else {
                System.out.print("Wrong number,try again!!");
            }
        }
        //print array
        System.out.print("The given array is: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.printf("\nthere are more than 3 evens: %b", hasMoreThan3Evens(arr));
        System.out.printf("\nthere are more than 3 odds: %b", hasMoreThan3Odds(arr));
        System.out.printf("\nthere are more than 3 consecutive: %b", moreThanThreeConsecutive(arr));
        System.out.printf("\nthere are more than 3 in the same ten: %b", moreThanThreeSameTen(arr));


    }

    /**
     * traverses an array, if the array has more than 3 even numbers
     * @param arr input array
     * @return bool
     */
    public static boolean hasMoreThan3Evens (int[] arr) {
        int evenCounter = 0;

        if (arr == null) return false;

        for (int item : arr) {
            if(item % 2 == 0 ){
                evenCounter++;
            }
        }
        return evenCounter > 3;
    }

    /**
     * traverses an array, if the array has more than 3 odd numbers
     * @param arr input array
     * @return bool
     */
    public static boolean hasMoreThan3Odds (int[] arr) {
        int oddCounter = 0;

        if (arr == null) return false;

        for (int item : arr) {
            if(item % 2 != 0 ){
                oddCounter++;
            }
        }
        return oddCounter > 3;
    }

    /**
     * Traverses input array if there are more than 3 consecutive
     * @param arr input array
     * @return boolean
     */
    public static boolean moreThanThreeConsecutive (int[] arr) {
        if (arr == null) return false;
        int consCounter = 0;

        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2) && (arr[i] == arr[i+3] - 3)){
                consCounter++;
            }
        }
        return consCounter >= 3;
    }

    /**
     * returns if there are more than 3 in the same ten
     * @param arr input array
     * @return boolean
     */
    public static boolean moreThanThreeSameTen(int[] arr) {
        boolean hasMoreThanThreeEndings = false;
        int[] tens = new int[10];

        if (arr == null) return false;
        for (int item : arr) {
            tens[item/5]++;
        }

        for (int item : tens) {
            if (item > 3) {
                hasMoreThanThreeEndings = true;
                break;
            }
        }
        return hasMoreThanThreeEndings ;
    }
}
