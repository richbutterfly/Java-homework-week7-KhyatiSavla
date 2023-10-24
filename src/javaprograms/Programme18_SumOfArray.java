package javaprograms;

//18. Write a Java program to sum values of an array
public class Programme18_SumOfArray {

    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25}; // array declaration
        System.out.println(array.length);
        int sum = 0;
        int i;
        for (i = 0; i < array.length; i++) // go through all elements and add them to sum
            sum += array[i];        // store the sum in the sum variable
        System.out.println("Sum value all elements of  array is " + sum);

    }
}

