package javaprograms;

import java.util.Objects;
import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   // scanner object
        System.out.println("Enter first number");
        int firstNumber = scn.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scn.nextInt();
        System.out.println(" Enter operation (+,-,*,/");
        String operation = scn.next();
        operation(firstNumber, operation, secondNumber); // static to static direct access
        scn.close();
    }

    public static void operation(int a, String op, int b) {
        if (Objects.equals(op, "+")) { // addition
            System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        } else if (Objects.equals(op, "-")) {//subtraction
            System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
        } else if (Objects.equals(op, "*")) { //multiplication
            System.out.println(" Multiplication of " + a + " and " + b + " is " + (a * b));
        } else if (Objects.equals(op, "/")) { // division
            System.out.println("Division of " + a + " and " + b + " is " + (a / b));
        } else System.out.println("Invalid operation");

    }
}
