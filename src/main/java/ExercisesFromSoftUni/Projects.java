package ExercisesFromSoftUni;

import java.util.Scanner;

public class Projects {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter architect's name!");

        String architectName = input.next();

        System.out.println("Please, enter count of projects!");

        int projectsCount = input.nextInt();

        int hoursNeeded = projectsCount * 3;

        System.out.println("The architect "+architectName+" will need "+hoursNeeded+" hours to complete "+projectsCount+"project/s.");
    }
}
