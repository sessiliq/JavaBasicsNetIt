package Homework8;

public class MainMethod {
    public static void main(String[] args) {
        System.out.printf("The biggest number is: %d\n",Homework8.biggestNumber(0,-2,-3));
        System.out.printf("The biggest number is: %d\n",Homework8.biggestNumber(143,3,1));
        System.out.printf("The biggest number is: %d\n",Homework8.biggestNumber(-3,2,1));


        Homework8.areSidesNegativeNumbers(3,3,3);
        Homework8.areSidesNegativeNumbers(4,4,4);
        Homework8.areSidesNegativeNumbers(4,4,-4);
    }
}
