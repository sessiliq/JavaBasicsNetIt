package Homework8;

public class MainMethod {
    public static void main(String[] args) {
        System.out.printf("The biggest number is: %d\n",Homework8.biggestNumber(0,-2,-3));
        System.out.printf("The biggest number is: %d\n",Homework8.biggestNumber(143,3,1));
        System.out.printf("The biggest number is: %d\n",Homework8.biggestNumber(-3,2,1));
        System.out.println("----------------------------------");


        Homework8.triangleArea(3,3,3);
        Homework8.triangleArea(4,4,4);
        Homework8.triangleArea(4,4,-4);
        System.out.println("----------------------------------");

        Homework8.createArray(3);
        Homework8.createArray(-3);
        Homework8.createArray(0);
    }
}
