package Homework1311;
/*
Calculate average value in array.
 */
public class AverageValue {
    public static void main(String[] args) {
        int [] numbers = new int [20];

        int index = 0;
        while (index < 20){
            numbers[index] = index * 5;
            index++;
        }

        double totalValue = 0;
        for (int k: numbers) {
            totalValue += k;
        }

        double averageValue = totalValue / 20;

        System.out.printf("Average value in current array is %.2f", averageValue);
    }
}
