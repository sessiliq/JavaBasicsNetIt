package MethodsExercise;

public class MainMethod {
    public static void main(String[] args) {
        System.out.printf("%d\n", Methods.sumNumbers(7,8));
        System.out.printf("%d\n", Methods.sumNumbers(7,8,1));
        System.out.printf("%.2f\n", Methods.multiply(7,8));

        Methods test1 = new Methods("Test");
        test1.sumTwoNumbers(2,3);
        test1.printSomeText();
    }
}
