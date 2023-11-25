package PasswordHomework;
/*
1. Method that checks if 3 numbers are positive
2. Method that checks if 3 numbers are equal
3. Method that return average value of 2 numbers
4. Method that returns sum of two numbers and accepts previous method as parameter
 */
public class Numbers {

    public static void checkIfNumbersPositive (int a, int b, int c){
        if (a >= 0 && b >= 0 && c >= 0){
            System.out.println("All numbers are positive.");
        }
        else {
            System.out.println("There are negative numbers!");
        }
    }
    public static void checkIfNumbersEqual(int a, int b, int c){
        if(a == b){
            if (b == c){
                System.out.printf("Numbers %d, %d and %d are equal.\n", a, b, c);
            }
        }
        else {
            System.out.printf("Numbers %d, %d and %d are not equal.\n", a, b, c);
        }
    }
    public static double averageValue(double a, double b){
        double result = (a + b) / 2;
        System.out.printf("The average value of %.1f and %.1f is: %.1f\n",a, b, result);
        return result;
    }
    public static double sum(double a, double b){
        double result = a + b;
        System.out.printf("The sum of %.1f and %.1f is: %.1f\n",a, b, result);
        return result;
    }

    /*
    На последните два метода, ако махна реда за принтиране и оставя само return result,
    в мейн метода ми казва Result of 'Numbers.sum()' is ignored.
    Единственото решение, което намерих е да сложа резултата в променлива, която да използвам.
    Ако може коментар дали и как това може да се избегне и съответно да принтирам само числата.
     */
}
