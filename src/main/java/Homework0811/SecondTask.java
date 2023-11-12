package Homework0811;

import java.util.Scanner;

/*
A program that calculates the area and perimeter of a rectangle by given height and length.
 */
public class SecondTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter height of rectangle:");
        int height = input.nextInt();

        System.out.println("Please, enter length of rectangle: ");
        int length = input.nextInt();

        int area = height * length;
        int perimeter = (height + length) * 2;

        System.out.printf("The area of the rectangle is %d. The perimeter of the rectangle is %d", area, perimeter);

    }
}
