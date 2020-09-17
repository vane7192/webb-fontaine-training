package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question4 {
    // Write a program that will prompt you to enter a natural number and print the multiplication table corresponding to the number on the screen.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number:");

        while (!scanner.hasNextInt()) {
            System.out.println("Entered number is incorrect");
            scanner.next();
        }

        int number = scanner.nextInt();

        for (int i = 1; i < 10; ++i) {
            System.out.println(String.format("%d x %d = %d", number, i, number*i));
        }

    }
}
