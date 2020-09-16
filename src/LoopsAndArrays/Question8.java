package LoopsAndArrays;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question8 {
    public static void main(String[] args) {
        int [] array1 = {1, 55, 11, 45, 23, 1};
        int [] array2 = {2, 45, 21, 55};

        for (int i = 0; i < array1.length; ++i) {
            int j;
            for (j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j])
                    System.out.println(array1[i]);;
            }
        }
    }
}
