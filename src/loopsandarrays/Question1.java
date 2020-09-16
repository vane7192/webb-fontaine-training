package loopsandarrays;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = new int[5];
        System.out.println("Please input array elements");

        for (int i = 0; i < inputArray.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int");
                scanner.next();
            }
            inputArray[i] = scanner.nextInt();
        }


        for (int element : inputArray) {
            System.out.print(String.format("%d ", element));
        }

        System.out.println();

        int[] reverseArray = new int[inputArray.length];
        for (int j = inputArray.length - 1; j >= 0; --j) {
            for (int i = 0; i < inputArray.length; ++i) {
                reverseArray[j] = inputArray[i];
                j--;
            }
        }

        for (int element : reverseArray) {
            System.out.print(String.format("%d ", element));
        }
    }
}
