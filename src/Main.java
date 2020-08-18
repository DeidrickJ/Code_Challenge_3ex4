import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.println("I am going to make an array of numbers for you and find the average of your numbers!");
       System.out.print("Please enter the size of your array: ");

       int  arraySize = input.nextInt();
       double  sumOfNumbs = 0;
       double mean;

       int [] array = new int [arraySize];


       System.out.println("Please enter your numbers");
        for (int i = 0; i < array.length; i++){

            array[i] = input.nextInt();
            sumOfNumbs = sumOfNumbs + array[i];
        }

        System.out.println("Your numbers are: " + Arrays.toString(array));

        mean = sumOfNumbs/arraySize;

        System.out.println("The average of your numbers is: " + mean);


        }

        }


