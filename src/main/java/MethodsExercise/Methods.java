package MethodsExercise;

public class Methods {
    public String name;
    public Methods (String name){
        this.name = name;
    }
    /*static методите принадлежат към класа, не е нужно да се създава обект от този клас, за да се използват.
    извикват се иметоНаКласа.иметоНаМетода
    static методите могат да се използват директно в мейн метода
     */
    public static int sumNumbers(int a, int b){
        return a + b;
    }

    //method overloading - използва се името на друг метод, но с различни параметри
    public static int sumNumbers(int a, int b, int c){
        return a + b + c;
    }


    //При нестатичните методи трябва да се създаде обект от дадения клас.

    public int sumTwoNumbers(int a, int b){
        return a + b;
    }

    //Ако метода няма да връща стойност, а ще извършва някакви действия, го правим void

    public void printSomeText(){
        System.out.printf("%s is your name \n", name);
    }
}
