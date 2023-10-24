package javaprograms;
//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

//12. Write a program that tells us input value is number or an alphabet or symbol.
public class Programme12_FindInputValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // scanner object
        System.out.println("Enter any character");
        char ch = scn.next().charAt(0);
        inputValue(ch); // static to static direct caliing
        scn.close();
    }

    public static void inputValue(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet");
        } else if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is a number ");
        } else {
            System.out.println(ch + " is a symbol");
        }
    }
}
