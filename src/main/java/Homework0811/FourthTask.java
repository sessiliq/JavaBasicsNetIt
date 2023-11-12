package Homework0811;

import java.util.Scanner;

/*
By given numbers from 1 to 12 define month of the year.
 */
public class FourthTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter number:");
        var month = input.nextLine();

        switch (month){

            case "1":
                System.out.printf("You have selected %s. The month of the year is January.", month);
                break;

            case "2":
                System.out.printf("You have selected %s. The month of the year is February.", month);
                break;

            case "3":
                System.out.printf("You have selected %s. The month of the year is March.", month);
                break;

            case "4":
                System.out.printf("You have selected %s. The month of the year is April.", month);
                break;

            case "5":
                System.out.printf("You have selected %s. The month of the year is May.", month);
                break;

            case "6":
                System.out.printf("You have selected %s. The month of the year is June.", month);
                break;

            case "7":
                System.out.printf("You have selected %s. The month of the year is July.", month);
                break;

            case "8":
                System.out.printf("You have selected %s. The month of the year is August.", month);
                break;

            case "9":
                System.out.printf("You have selected %s. The month of the year is September.", month);
                break;

            case "10":
                System.out.printf("You have selected %s. The month of the year is October.", month);
                break;

            case "11":
                System.out.printf("You have selected %s. The month of the year is November.", month);
                break;

            case "12":
                System.out.printf("You have selected %s. The month of the year is December.", month);
                break;

            default:
                System.out.println("You have entered invalid number/data!");
        }
    }
}
