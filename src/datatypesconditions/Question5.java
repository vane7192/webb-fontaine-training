package datatypesconditions;

import java.util.Scanner;

/**
 * Created by Vane Gharakhanian on Sep, 2020
 */
public class Question5 {

    //Write a calculator that will suggest entering 2 numbers and 1 math operation; Numbers can be int, double, float. Math operation is a char and can be: (+, -, /, *, etc..)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstInput, secondInput, result;
        char operation;

        System.out.println("Input first number:");
        firstInput = scanner.nextFloat();

        System.out.println("Input second number:");
        secondInput = scanner.nextFloat();

        System.out.println("Input math operation:");
        operation = scanner.next().charAt(0);

        switch(operation)
        {
            case '+':
                result = firstInput + secondInput;
                break;

            case '-':
                result = firstInput - secondInput;
                break;

            case '*':
                result = firstInput * secondInput;
                break;

            case '/':
                result = firstInput / secondInput;
                break;

            default:
                System.out.println("Incorrect operation");
                return;
        }

        System.out.println(String.format("Result: %f %c %f = %f", firstInput, operation, secondInput, result));
    }
}
