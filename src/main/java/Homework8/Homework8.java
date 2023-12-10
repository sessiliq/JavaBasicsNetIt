package Homework8;

public class Homework8 {
    public static int biggestNumber (int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    //Формула: S = 1/4*Корен от 4*а2*b2 - (а2 + b2 - c2)2 където 2 означава на квадрат
    public static void triangleArea(double a, double b, double c){
        double one = 1.0/4.0;
        double two = 4 * Math.pow(a,2) * Math.pow(b,2);
        double three = Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2);
        three = Math.pow(three,2);

        double four = two - three;
        double result = one * Math.sqrt(four);

        System.out.printf("Area of the triangle is %.3f\n",result);
    }

    public static void areSidesNegativeNumbers(double a, double b, double c){
        if (a < 0|| b < 0 || c < 0){
            System.out.println("All numbers must be positive!");
        }
        else {
            triangleArea(a,b,c);
        }
    }
}
