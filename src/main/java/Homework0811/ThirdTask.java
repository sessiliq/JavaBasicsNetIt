package Homework0811;

import java.util.Scanner;

/*
Program that define if number is even ot odd.
 */
public class ThirdTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter number:");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.printf("Number %d is even.", number);
        }
        else {
            System.out.printf("Number %d is odd.", number);
        }

    }
}
