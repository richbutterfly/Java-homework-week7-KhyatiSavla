package javaprograms;

import java.util.Scanner;

// 6.Write a java program to input any number and find out if it’s odd or even
public class Programme6_OddEven {
    // Method to find out odd or even numbers
    public void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // scanner object
        System.out.println("Enter any number");
        int num = scn.nextInt();
        Programme6_OddEven obj = new Programme6_OddEven(); //object creation for calling instance method to static method
        obj.oddEven(num);
        scn.close();
    }
}
