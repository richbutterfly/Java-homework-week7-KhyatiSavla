package javaprograms;

import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13_FindTheDayName {
    public static void main(String[] args) { // main method
        Scanner scn = new Scanner(System.in); // scanner object
        System.out.println("Enter any valid number (1 to 7)");
        int day = scn.nextInt();
        findTheDay(day); // static to static direct calling
        scn.close();
    }
// Method to find out days of the week by entering a valid number
    public static void findTheDay(int day) {
        switch (day) {
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
                System.out.println("Week contains 1 to 7 days");
        }

    }
}
