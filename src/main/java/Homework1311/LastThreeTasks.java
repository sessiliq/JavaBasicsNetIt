package Homework1311;
/*
*Print numbers to N;
*Print numbers to N that are not divisible by 3 and 7
*Print first N Fibonacci numbers;
 */
import java.util.Scanner;

public class LastThreeTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter N:");
        int n = input.nextInt();

        System.out.println("Numbers from 1 to N are:");

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }

        System.out.println("------------------------");

        System.out.println("Numbers from 1 to N that are not divisible by 3 and 7 are:");
        int counter = 1;
        while (counter <= n){
            if (counter % 3 != 0 && counter % 7 != 0){
                System.out.println(counter);
            }
            counter++;
        }

        System.out.println("------------------------");

        System.out.printf("First %d Fibonacci numbers are:\n", n);

        int firstNumber = 1;
        int secondNumber = 1;

        System.out.print("0\n1\n1\n");

        for (int j = 0; j < n; j++){

            int thirdNumber = firstNumber + secondNumber;
            System.out.println(thirdNumber);

            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}
