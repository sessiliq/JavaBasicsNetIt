package ExercisesFromSoftUni;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Gardening {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter total square meters!");

        double squareMeters = input.nextDouble();

        double totalPriseWithoutDiscount = squareMeters * 7.61;

        double discount = (totalPriseWithoutDiscount / 100) * 18;
        double priseWithDiscount = totalPriseWithoutDiscount - discount;

        DecimalFormat format = new DecimalFormat("##.##");

        System.out.println("The final prise is "+format.format(priseWithDiscount)+" leva.");
        System.out.println("The discount is "+format.format(discount)+" leva.");
    }
}
