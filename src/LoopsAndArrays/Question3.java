package LoopsAndArrays;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question3 {
    public static void main(String[] args) {
        int[] array1 = {1, 55, 64, 58, 8, 99};

        int[] array2 = {66, 58, 8, 1, 99, 71};

        for (int i = 0; i < array1.length; ++i) {
            int j;
            for (j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j])
                    break;
            }
            if (j == array2.length) {
                System.out.println(array1[i]);
            }
        }
    }
}
