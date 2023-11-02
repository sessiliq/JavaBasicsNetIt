package Exercises;

import java.util.Scanner;

public class From0111 {

    public static void main(String[] args) {

        Scanner readFromConsole = new Scanner(System.in);

        System.out.println("Please, enter your name!");

        String name = readFromConsole.nextLine();

        System.out.println("Please, enter your age!");

        int age = readFromConsole.nextInt();

        if (age > 17){

            System.out.println(" "+name+" you can vote since you are "+age+" years old.");
        }
        else{
            System.out.println(" "+name+" you can't vote since you are "+age+" years old.");
        }
    }
}
