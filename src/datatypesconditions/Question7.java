package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question7 {
// Take three numbers from the user and print the greatest number.

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        a = scanner.nextInt();
        System.out.println("Enter a number:");
        b = scanner.nextInt();
        System.out.println("Enter a number:");
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        }

        if (b > a && b > c) {
            System.out.println(b);
        }

        if (c > a && c > b) {
            System.out.println(c);
        }
    }
}
