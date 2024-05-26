package gr.aueb.cf.cp2;

import java.util.Scanner;

/**
 * class accept temperatures in Fahrenheit and returns in Celsius
 */
public class Askhsh1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Δώστε μια ακαίρεα τιμή μιας θερμοκρασίας σε Fahrenheit και θα την μετατρέψω σε Κελσίου");
        int temperatureF = 0;
        int temperatureC = 0;

        temperatureF = in.nextInt();
        temperatureC = (5 * (temperatureF - 32))/9;//func is (5/9)(F-32)

        System.out.printf("Η θερμοκρασία %d F αντιστοιχεί σε %d σε C", temperatureF, temperatureC);

    }
}
