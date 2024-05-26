package gr.aueb.cf.cp6;

import java.util.Arrays;

public class MultiFuncApp {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 8, 16, 3, 12, -11};
        int findValue = 3;
        //exercise 1
        int position = findValue(arr, findValue);
        if (position != -1) {
            System.out.printf("Number found in position : %d \n", position+1);
        } else {
            System.out.println("error!!");
        }
        //exercise 2
        printEvenNumbers(arr);
        //exercise 3
        int[] mappingArray = mappingArray(arr);
        System.out.print("mapping array: ");
        for (int item : mappingArray) {
            System.out.print(item + " ");
        }
        //exercise 4
        System.out.printf("\nthere is one positive: %b", hasOnePositive(arr));
        //exercise 5
        System.out.printf("\nAll are positive: %b", allArePositive(arr));

    }

    /**
     * returns the position of given value
     * @param arr input array
     * @param value input value
     * @return position of value
     */
    public static int findValue(int[] arr, int value) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                position = i;
            }
        }
        return position;
    }

    /**
     * prints even numbers of input array
     * @param arr input array
     */
    public static void printEvenNumbers (int[] arr) {
        System.out.print("even numbers are :");
        for (int item : arr) {
            if (item % 2 == 0) {
                System.out.print(" " + item );
            }
        }
        System.out.println(" ");
    }

    /**
     * returns each element of the input array with twice
     * @param arr input array
     * @return twice array
     */
    public static int[] mappingArray (int[] arr) {
        int sizeArray = arr.length;
        int[] returnArray = new int[sizeArray];

        int counter = 0;
       for (int item : arr) {
           returnArray[counter] = item * 2;
           counter ++;
        }
       return returnArray;
   }

    /**
     * returns bool if there is one positive number in the given array
     * @param arr input array
     * @return bool
     */
   public static boolean hasOnePositive (int[] arr) {
        boolean hasOnePositive = false;
        for (int item : arr) {

           if (item > 0) {
               hasOnePositive = true;
               break;
           }
        }
        return hasOnePositive;
   }

    /**
     * returns bool if all number of the given array are positive
     * @param arr input array
     * @return boll
     */
    public static boolean allArePositive (int[] arr) {
        int counter = 0;

        for (int item : arr) {
            if (item > 0) {
                counter++;
            }
        }
        return arr.length == counter;
    }
}
