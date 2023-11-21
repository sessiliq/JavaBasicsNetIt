package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExercise {
    public static void main (String [] args){
        LinkedList<String> cars = new LinkedList<>();
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Boolean> answers = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        Scanner inputCars = new Scanner(System.in);
        Scanner inputNumbers = new Scanner(System.in);
        Scanner inputAnswers = new Scanner(System.in);
        System.out.println("Please, enter size of the Linked List:");
        int size = input.nextInt();

        for (int i = 0; i < size; i++){
            System.out.println("Please, enter car:");
            cars.add(inputCars.nextLine());
        }

        for (int i = 0; i < size; i++){
            System.out.println("Please, enter number:");
            numbers.add(inputNumbers.nextInt());
        }

        for (int i = 0; i < size; i++){
            System.out.println("Please, enter true ot false:");
            String answer = inputAnswers.nextLine();

            if (answer.equals("true")){
                answers.add(true);
            }
            else if (answer.equals("false")){
                answers.add(false);
            }
            else {
                System.out.println("Invalid answer!");
                System.out.println("--------------------------");
            }
        }

        int counter = 0;
        while (counter < cars.size()){
            System.out.printf("Index: %d Value: %s\n", counter, cars.get(counter));
            counter++;
        }
        System.out.println("--------------------------");

        for (int j = 0; j < numbers.size(); j++){
            System.out.printf("Index: %d Value: %s\n", j, numbers.get(j));
        }
        System.out.println("--------------------------");

        int iterator = 0;
        while (iterator < answers.size()){
            System.out.printf("Index: %d Value: %s\n", iterator, answers.get(iterator));
            iterator++;
        }
        System.out.println("--------------------------");
    }
}
