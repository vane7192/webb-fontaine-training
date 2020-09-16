package loopsandarrays;

import java.lang.reflect.Array;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question4 {
    public static void main(String[] args) {
        int[] array = {54, 2, 33, 65, 22, 33, 1, 33, 2};
        int k = 3;

        for (int i = 0; i < array.length; ++i) {
            int counter = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }

            if (counter == k) {
                System.out.println(array[i]);
                break;
            }
        }
    }
}
