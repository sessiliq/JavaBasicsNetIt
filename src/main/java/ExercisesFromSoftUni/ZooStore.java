package ExercisesFromSoftUni;

import java.util.Scanner;

public class ZooStore {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter count of dog's food needed!");

        int countOfDogFood = input.nextInt();

        System.out.println("Please, enter count of cat's food needed!");

        int countOfCatFood = input.nextInt();

        double totalForDogFood = countOfDogFood * 2.5;
        double totalForCatFood = countOfCatFood * 4;

        double total = totalForCatFood + totalForDogFood;

        System.out.println("You will need "+total+" leva.");

    }
}
