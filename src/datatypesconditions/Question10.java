package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question10 {
    //Write a program which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
    // The program shall always print “bye!” before exiting.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input any int: ");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        System.out.println("Bye!");
    }
}
