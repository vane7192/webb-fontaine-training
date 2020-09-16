package loopsandarrays;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question7 {
    public static void main(String[] args) {
        int length = 10, temp;
        int[] array = new int[length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.print("Random generated values: ");
        for (int element : array) {
            System.out.print(String.format("%d ", element));
        }


        System.out.println();

        //ascending order
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.print("Ascending order: ");
        for (int element : array) {
            System.out.print(String.format("%d ", element));
        }

        System.out.println();

        //descending order
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.print("Descending order: ");
        for (int element : array) {
            System.out.print(String.format("%d ", element));
        }
    }
}
