package LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] arrayAfterDelete = new int[array.length - 1];

        System.out.println("Input index of an element to remove: ");
        int index = scanner.nextInt();

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            arrayAfterDelete[j++] = array[i];
        }

        System.out.println("Array after removal operation: " + Arrays.toString(arrayAfterDelete));

    }
}
