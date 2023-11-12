package Homework0811;

import java.util.Scanner;

/*
Program that reads 3 numbers and define which is biggest.
 */
public class BiggestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter first number:");
        int firstNumber = input.nextInt();

        System.out.println("Please, enter second number:");
        int secondNumber = input.nextInt();

        System.out.println("Please, enter third number:");
        int thirdNumber = input.nextInt();

      if (firstNumber > secondNumber && firstNumber > thirdNumber){

          System.out.printf("First number - %d, is biggest.",firstNumber);
      }
      else if (secondNumber > firstNumber && secondNumber > thirdNumber){

          System.out.printf("Second number - %d, is biggest", secondNumber);
      }
      else {

          System.out.printf("Third number - %d, is biggest.", thirdNumber);
      }

    }
}
