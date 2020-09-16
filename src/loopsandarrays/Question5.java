package loopsandarrays;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question5 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any int Number: ");
        inputNumber = sc.nextInt();

        String[] stringArray = String.valueOf(inputNumber).split(",");

        int [] array = new int[stringArray.length];

        for(int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }

        for (int element : array) {
            System.out.println("[" + element + "]");
        }
    }
}
