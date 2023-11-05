package ExercisesFromSoftUni;

import java.util.Scanner;

public class TriangleArea {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int sideA = input.nextInt();

        input = new Scanner(System.in);

        int sideB = input.nextInt();

        int area = sideA * sideB;

        System.out.println("The area of the triangle is "+area+" centimeters");
    }
}
