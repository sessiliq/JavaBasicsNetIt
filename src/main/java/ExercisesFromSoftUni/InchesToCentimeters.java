package ExercisesFromSoftUni;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double inches = input.nextDouble();

        double centimeters = inches * 2.54;

        DecimalFormat total = new DecimalFormat("##.##");

        System.out.println(+inches+" are "+total.format(centimeters)+" centimeters");
    }
}
