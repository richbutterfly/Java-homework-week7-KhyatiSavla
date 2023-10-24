package javaprograms;

//19. Write a Java program to calculate the average value of array elements.
public class Programme19_AverageOfArray {

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5,}; // declaration of array
        System.out.println(num.length);
        int sum = 0;
        int i;
        for (i = 0; i < num.length; i++) // for loop to find the sum of array elements
            sum = sum + num[i];
        sum = sum / num.length; // finding the average of array
        System.out.println("Average value of array elements is " + sum);
    }
}
