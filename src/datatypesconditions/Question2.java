package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question2 {

    //Write a program that reads a number in inches, converts it to meters.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input any number in inch:");

        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter number");
            scanner.next();
        }

        double input = scanner.nextDouble();
        double meter = input * 0.0254;

        System.out.println(String.format("%f inch is %f meters", input, meter));
    }
}
