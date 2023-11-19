package Homework1311;
/*
Calculate even and odd numbers sum in array.
 */
import java.util.Scanner;

public class EvenAndOddNumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numbersFromConsole = new int [5];

        int index = 0;
        while (index < 5){
            numbersFromConsole[index] = input.nextInt();
            index++;
        }

        int [] array1 = {1,3,5,6,4,8,25,68,420};
        int [] array2 = {6,8,6,32,3,17,19,0,-3,-2};

        int evenSum = 0;
        int oddSum = 0;

        for (int i: numbersFromConsole) {
            if (i % 2 == 0){
               evenSum += i;
            }
            else{
                oddSum += i;
            }
        }

        System.out.printf("Sum of even numbers in your array is %d. Sum of odd numbers is %d\n", evenSum, oddSum);

        int evenSumArray1 = 0;
        int oddSumArray1 = 0;

        for (int i: array1) {
            if (i % 2 == 0){
                evenSumArray1 += i;
            }
            else{
                oddSumArray1 += i;
            }
        }

        System.out.printf("Sum of even numbers in array 1 is %d. Sum of odd numbers is %d\n", evenSumArray1, oddSumArray1);

        int evenSumArray2 = 0;
        int oddSumArray2 = 0;

        for (int i: array2) {
            if (i % 2 == 0){
                evenSumArray2 += i;
            }
            else{
                oddSumArray2 += i;
            }
        }

        System.out.printf("Sum of even numbers in array 2 is %d. Sum of odd numbers is %d\n", evenSumArray2, oddSumArray2);
    }
}
