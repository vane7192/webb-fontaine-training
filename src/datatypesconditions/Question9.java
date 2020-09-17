package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question9 {
    //Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
    //Test Data
    //Input number: 3
    //Expected Output :
    //Wednesday

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number between 1-7: ");
        int input = scanner.nextInt();


        switch (input) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Input int number should be between 1-7");
        }
    }
}
