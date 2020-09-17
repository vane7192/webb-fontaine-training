package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question8 {
    // Write a program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print
    // "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();

        if (input == 0) {
            System.out.println("zero");
        } else {
            if (input < 0) {
                System.out.println("negative");
            }
            if (input > 0 && input <= 1000000) {
                System.out.println("positive");
            }
            if (input > 1000000) {
                System.out.println("large");
            }
        }
    }
}
