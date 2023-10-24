package javaprograms;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator(? :)
 */

public class Programme1_OddEvenTernaryOperator {

    public static void main(String[] args) {    //main method
        Scanner scn = new Scanner(System.in);   //scanner object
        System.out.println("Enter a number");
        int num = scn.nextInt();
        isOddEven(num); //static to static direct calling
        scn.close();
    }

    public static void isOddEven(int num) {
        String oddEven = (num % 2 == 0) ? "even" : "odd";  //Method for finding odd or even numbers using ternary operator
        System.out.println(num + " is " + oddEven);

    }
}
