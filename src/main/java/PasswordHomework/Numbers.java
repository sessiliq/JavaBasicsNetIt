package PasswordHomework;

public class Numbers {

    //check if 3 numbers are positive and equal
    public static void numbersPositive (int a, int b, int c){
        if (a >= 0 && b >= 0 && c >= 0){
            System.out.println("All numbers are positive.");
        }
        else {
            System.out.println("There are negative numbers!");
        }
    }
    public static void numbersEqual(int a, int b, int c){
        if(a == b){
            if (b == c){
                System.out.printf("Numbers %d, %d and %d are equal.\n", a, b, c);
            }
        }
        else {
            System.out.printf("Numbers %d, %d and %d are not equal.\n", a, b, c);
        }
    }
    public static int averageValue(int a, int b){
        int result = (a + b) / 2;
        System.out.printf("The average value of %d and %d is: %d\n",a, b, result);
        return result;
    }
    public static int sum(int a, int b){
        int result = a + b;
        System.out.printf("The sum of %d and %d is: %d\n",a, b, result);
        return result;
    }

    /*
    На последните два метода, ако махна реда за принтиране и оставя само return result,
    в мейн метода ми казва Result of 'Numbers.sum()' is ignored.
    Единственото решение, което намерих е да сложа резултата в променлива, която да използвам.
    Ако може коментар дали и как това може да се избегне и съответно да принтирам само числата.
     */
}
