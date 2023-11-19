package Exercises;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //basic array
        int [] numbers = {1, 2, 3};
        int [] numbers2 = new int [3];
        print(numbers);
        System.out.println("------------------------------------");
        fillArray(numbers2);
        print(numbers2);

        System.out.println("------------------------------------");

        String [] cars = {"BMW", "Honda", "Mercedes", "Skoda"};
        String [] cars2 = new String[3];
        print(cars);
        System.out.println("------------------------------------");
        fillArray(cars2);
        print(cars2);

        System.out.println("------------------------------------");

        //multidimensional arrays
        int [][] matrix = new int [3][4];
        int [][] matrix2 = {{1, 2, 3}, {14, 15, 16, 17}};
        printMultidimensionalArrays(matrix2);
        System.out.println("------------------------------------");
        fillMultidimensionalArrays(matrix);
        printMultidimensionalArrays(matrix);

        System.out.println("------------------------------------");

        String [][] cube = new String[3][4];
        String [][] cube2 = {{"BMW", "Mercedes"}, {"Skoda", "Honda"}};
        printMultidimensionalArray(cube2);
        System.out.println("------------------------------------");
        fillMultidimensionalArray(cube);
        printMultidimensionalArray(cube);
    }
    public static void print (int [] elements){
        //elements are given above
        //print elements in the array
        for (int i = 0; i < elements.length; i++){
            System.out.printf("Index: %d Value: %d\n", i,elements[i]);
        }
    }
    public static void fillArray(int [] elements){
       //fill array with numbers (numbers from 0 to array length + 5
        int counter = 0;
        while(counter < elements.length){
            elements[counter] = counter + 5;
            counter++;
        }
    }
    public static void print(String [] elements){
        //elements are given above
        //print elements in the array with index
        for (int i = 0; i < elements.length; i++){
            System.out.printf("Index: %d Value: %s\n", i,elements[i]);
        }
    }
    public static void fillArray (String [] elements){
        //fill array with elements written in the console
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter car:");

        int counter = 0;
        while (counter < elements.length){
            elements[counter] = input.nextLine();
            counter++;
        }
    }
    public static void printMultidimensionalArrays(int [][] elements){
        //elements are given above
        //print elements in the array with index
        for (int i = 0; i <= elements.length - 1; i++){
            for (int j = 0; j < elements[i].length; j++){
                System.out.printf("Index: %d-%d Value: %d\n",i, j, elements[i][j]);
            }
        }
    }
    public static void fillMultidimensionalArrays(int [][] elements){
        //fill array with numbers (i + j)
        for (int i = 0; i <= elements.length - 1; i++){
            for (int j = 0; j <= elements[i].length - 1; j++){
                elements[i][j] = i + j;
            }
        }
    }
    public static void printMultidimensionalArray(String [][] elements){
        //print array element with index
        for (int i = 0; i <= elements.length - 1; i++){
            for (int j = 0; j < elements[i].length; j++){
                System.out.printf("Index: %d-%d Value: %s\n",i, j, elements[i][j]);
            }
        }
    }
    public static void fillMultidimensionalArray(String [][] elements){
        //fill array with elements written in the console
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a car:");

        for (int i = 0; i <= elements.length - 1; i++){
            for (int j = 0; j <= elements[i].length - 1; j++){
                elements[i][j] = input.nextLine();
            }
        }
    }
}
