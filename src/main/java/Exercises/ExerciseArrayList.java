package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseArrayList {
    public static void main(String [] args){
        //ArrayList of strings
        ArrayList <String> cities = new ArrayList<>();
        cities.add("Mercedes");
        cities.add("Skoda");
        cities.add("BMW");
        cities.add(3, "Honda");

        System.out.printf("Count of elements is: %d\n", cities.size());
        System.out.printf("Elements are: %s\n", cities);
        System.out.println("--------------------------");

        cities.remove("BMW");
        System.out.printf("Count of elements is: %d\n", cities.size());
        System.out.printf("Elements are: %s\n", cities);
        System.out.println("--------------------------");

        cities.remove(0);
        System.out.printf("Count of elements is: %d\n", cities.size());
        System.out.printf("Elements are: %s\n", cities);
        System.out.println("--------------------------");

        cities.add(0,"Volvo");
        System.out.printf("Count of elements is: %d\n", cities.size());
        System.out.printf("Elements are: %s\n", cities);
        System.out.println("--------------------------");

        //ArrayList of int numbers
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        System.out.println(numbers);
        System.out.println("--------------------------");

         //ArrayList of double numbers
        ArrayList <Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(2.2);
        doubleNumbers.add(4.4);
        doubleNumbers.add(6.6);

        System.out.println(doubleNumbers);
        System.out.println("--------------------------");

        //ArrayList of chars
        ArrayList <Character> symbols = new ArrayList<>();
        symbols.add('?');
        symbols.add('!');
        symbols.add('@');

        for (int k = 0; k < symbols.size(); k++){
            System.out.printf("Index: %d Value: %c\n", k, symbols.get(k));
        }
        System.out.println("--------------------------");

        //Create arrayList with for loop
        ArrayList <String> myArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        /*
        If it's one variable Scanner: enter 3 for count of elements, but accept to enter only two
        If are two variables: enter correctly
         */
        int sizeOfArrayList = input.nextInt();

        for (int i = 0; i < sizeOfArrayList; i++){
            myArrayList.add(input2.nextLine());
        }

        //take elements with index
        int iterator = 0;
        while (iterator < myArrayList.size()){
            System.out.printf("Index: %d Element: %s\n", iterator, myArrayList.get(iterator));
            iterator++;
        }

    }
}
