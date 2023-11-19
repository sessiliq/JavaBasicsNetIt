package Homework1311;
/*
Create array with 20 elements, type int and write it on the console.
 */
public class CrateArray {
    public static void main(String[] args) {
        int [] numbers = new int[20];

        for (int i = 0; i < 20; i++){
            int number = i * 5;
            numbers[i] = number;
        }

        for (int k = 0; k < 20; k++){
            int numberOfArray = numbers[k];
            System.out.printf("Index: %d; Number: %d.\n", k, numberOfArray);
        }
    }
}
