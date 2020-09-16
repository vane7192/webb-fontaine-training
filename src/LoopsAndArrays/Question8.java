package LoopsAndArrays;

import java.util.Arrays;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question8 {
    public static void main(String[] args) {
        int[] array1 = {1, 55, 11, 45, 23, 1};
        int[] array2 = {2, 45, 21, 55};

        int count = 0, x = 0;

        for (int i = 0; i < array1.length; ++i) {
            int j;
            for (j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j]) {
                    count = ++count;
                }
            }
        }

        int[] repeatedNumbers = new int[count];

        for (int i = 0; i < array1.length; ++i) {
            int j;
            for (j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j]) {
                    repeatedNumbers[x] = array1[i];
                    ++x;
                }
            }
        }

        System.out.println("Array of repeated elements:" + Arrays.toString(repeatedNumbers));
    }
}