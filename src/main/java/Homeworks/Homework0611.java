package Homeworks;
/*
Replace string with something written in the console.
 */
import java.util.Scanner;

public class Homework0611 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        String name = "<Your name>";

        System.out.printf("Hello, %s.\n", name);


        System.out.println("Please, enter your name!");
        name = input.nextLine();

        System.out.printf("Hello, %s.\n", name);
    }
}
