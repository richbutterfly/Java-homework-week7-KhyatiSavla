package javaprograms;

import java.util.Scanner;

/**
 * Input any alphabet from "A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry.
 */
public class Programme8_PrintCityName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   // scanner object
        System.out.println("Enter first letter of city name");
        char city = scn.next().charAt(0);
        cityName(city); // static to static direct calling
        scn.close();
    }
// Method to match the city name with entered alphabet
    public static void cityName(char letter) {
        if (letter == 'A') {
            System.out.println("Amsterdam");
        } else if (letter == 'B') {
            System.out.println("Berlin");
        } else if (letter == 'C') {
            System.out.println("Cardiff");
        } else if (letter == 'D') {
            System.out.println("Dublin");
        } else if (letter == 'E') {
            System.out.println("Edinburgh");
        } else if (letter == 'F') {
            System.out.println("Frankfurt");
        } else {
            System.out.println("Invalid entry");
        }
    }
}