package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question3 {

//The force of gravity on the Moon is equal to ~ 17%. Write a program that by entering your weight will count your weight on the Moon.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weightOnEarth = input.nextDouble();

        double weightOnMoon = weightOnEarth * (0.17);
        System.out.println("Your weight on moon is: "  + weightOnMoon );
    }
}
