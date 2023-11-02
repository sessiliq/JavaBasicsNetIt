package Homeworks;

import java.util.Scanner;

/*
Program that
*reads name and favourite hobby
*write proper message
 */
public class FirstHomework0111 {
   public static void main(String[] args) {

       Scanner readFromConsole = new Scanner (System.in);

       System.out.println("Please, enter your name!");

       String name = readFromConsole.nextLine();

       System.out.println("Please, enter yor favourite hobby!");

       String hobby = readFromConsole.nextLine();

       System.out.println("Hello, "+name+"! I think your hobby - "+hobby+", is very interesting!");
    }
}
