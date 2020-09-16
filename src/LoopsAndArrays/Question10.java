package LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Please enter integer: ");


        while ((input = scanner.nextInt()) != -1) {
            System.out.println("Please enter integer:");
            while (!scanner.hasNextInt()) {
                System.out.println("Entered value is not Integer");
                scanner.next();
            }
        }
        System.out.println("You entered the correct number");
    }
}
