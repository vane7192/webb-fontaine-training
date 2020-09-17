package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question1 {

    // Write a program to convert temperature from Fahrenheit to Celsius degree.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");

        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter number");
            scanner.next();
        }

        double input = scanner.nextDouble();

        System.out.println("Temperature in Celsius is: " + input / 2.12);
    }
}
