package gr.aueb.cf.cp6c;

import java.util.Arrays;
import java.util.Comparator;

public class ExerMaxInTheParking {
    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        int [][] arrRefactor = new int[arr.length*2][arr[0].length];

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = 1;//car is in the parking
            for (int j = 0; j < arr[i].length; j++) {
                arrRefactor[counter][0] = arr[i][j];
                arrRefactor[counter][1] = value;
                counter++;
                value = 0;//car is out
            }
        }

        //sort the new array arrRefactor
        Arrays.sort(arrRefactor, Comparator.comparingInt(a -> a[0]));

        //count how many cars are parked the same time by maxCar
        int maxCar = 0;
        for (int i = 0; i < arrRefactor.length; i++) {
                if(arrRefactor[i][1] > maxCar) {
                    maxCar = ++arrRefactor[i][1];
                }
        }
        System.out.println("max number of cars in the parking was: " + maxCar);
    }
}
