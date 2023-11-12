package Homework0611;

import java.util.Scanner;

/*
Count the words in a given string
 */
public class CountWords {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter sentence");
        String sentence = input.nextLine();

        int countWords = sentence.split("\\s+").length;

        System.out.printf("In this sentence are %d word.\n", countWords);

        //ако между думата и точката има спейс, брои точката за отделна дума.
    }
}
