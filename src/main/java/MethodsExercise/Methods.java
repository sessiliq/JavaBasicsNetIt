package MethodsExercise;

public class Methods {
    public String name;

    //в дефолтния конструктор можем да сетне директно стойност
    //всички обекти, които създадем ще са с името, зададено тук
    public Methods(){
        this("Goshko");
    }
    //този конструктор приема параметри и ги сетва към обекта
    public Methods (String name){
        //this name - името на обекта = името от скобите
        //ползва се да разграничим инстанс променливата от другата тук
        this.name = name;
    }
    /*static методите принадлежат към класа, не е нужно да се създава обект от този клас, за да се използват.
    извикват се иметоНаКласа.иметоНаМетода
    static методите могат да се използват директно в мейн метода.
     */
    public static int sumNumbers(int a, int b){
        return a + b;
    }

    //може return type да е различен ако те са съвместими
    public static float multiply(int a, int b){
        int result = a * b;
        return result;
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

    public void isNumberPositive(int a){
        if (a > 0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative or zero.");
        }
    }
}
