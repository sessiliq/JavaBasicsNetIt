package Homework0611;

import java.util.Scanner;

/*
Compare 2 strings if they are equal
 */
public class SecondTask {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter first word!");
        String firstWord = input.nextLine();

        System.out.println("Please, enter second word!");
        String secondWord = input.nextLine();


        if (firstWord.equals(secondWord)){
            System.out.println("These two words are the same.");
        }
        else {
            System.out.println("These two words are different.");
        }
    }
}
