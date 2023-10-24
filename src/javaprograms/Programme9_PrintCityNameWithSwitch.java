package javaprograms;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch statement
 */
public class Programme9_PrintCityNameWithSwitch {
    // // Method to match the city name with entered alphabet using switch statement
    public void cityName(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("Amsterdam");
                break;
            case 'B':
                System.out.println("Berlin");
                break;
            case 'C':
                System.out.println("Cardiff");
                break;
            case 'D':
                System.out.println("Dublin");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   //scanner object
        System.out.println("Enter first letter of city name");
        char city = scn.next().charAt(0);
        // object creation to call instance method to static method
        Programme9_PrintCityNameWithSwitch obj = new Programme9_PrintCityNameWithSwitch();
        obj.cityName(city);
        scn.close();
    }
}
