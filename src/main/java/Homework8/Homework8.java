package Homework8;

import java.util.Random;

public class Homework8 {
    public static int biggestNumber (int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    //Формула: S = 1/4*Корен от 4*а2*b2 - (а2 + b2 - c2)2 където 2 означава на квадрат
    public static void triangleArea(double a, double b, double c){
        double one = 1.0/4.0;
        double two = 4 * Math.pow(a,2) * Math.pow(b,2);
        double three = Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2);
        three = Math.pow(three,2);

        double four = two - three;
        double result = one * Math.sqrt(four);

        System.out.printf("Area of the triangle is %.3f\n",result);
    }

    //Проверява дали страните са положителни числа, aко са пресмята лицето на триъгълника
    public static void areSidesNegativeNumbers(double a, double b, double c){
        if (a <= 0|| b <= 0 || c <= 0){
            System.out.println("All numbers must be positive and other than zero!");
        }
        else {
            triangleArea(a,b,c);
        }
    }

    public static void createArray(int a){
        if (isNumberNegative(a)){
            int [] newArray = new int[a];

            Random randomNumber = new Random();

            for (int i = 0; i <= a - 1; i++){
                newArray[i] = randomNumber.nextInt();
            }

            printArray(newArray);
        }
        else {
            System.out.println("The size of an array cannot be 0 or less!");
        }
    }

    public static void printArray(int [] someArray){
        for (int number: someArray) {
            System.out.println(number);
        }
    }

    public static boolean isNumberNegative(int a){
        boolean isPositive;

        if (a <= 0){
            isPositive = false;
        }
        else {
            isPositive = true;
        }
        return isPositive;
    }
}
