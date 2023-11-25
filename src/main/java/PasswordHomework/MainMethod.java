package PasswordHomework;
public class MainMethod {
    public static void main(String[] args) {

       Numbers.averageValue(1,2);
       Numbers.sum(Numbers.averageValue(100,11),Numbers.averageValue(51,40));

        System.out.println("--------------------------");

       Numbers.averageValue(22,103);
       Numbers.sum(Numbers.averageValue(2,-5),Numbers.averageValue(-50,40));

        System.out.println("--------------------------");

       Numbers.checkIfNumbersPositive(1,2,3);
       Numbers.checkIfNumbersPositive(-1,2,3);
       Numbers.checkIfNumbersPositive(-1,-2,3);
       Numbers.checkIfNumbersPositive(-1,-2,-3);

        System.out.println("--------------------------");

        Numbers.checkIfNumbersEqual(2,3,5);
        Numbers.checkIfNumbersEqual(2,2,5);
        Numbers.checkIfNumbersEqual(2,2,2);
        Numbers.checkIfNumbersEqual(-2,2,-5);
        Numbers.checkIfNumbersEqual(-5,-5,-5);

        System.out.println("--------------------------");

        CheckPassword fromConsole = new CheckPassword();
        CheckPassword lessThanEightSymbols = new CheckPassword("kkk");
        CheckPassword onlyLetters = new CheckPassword("abcdefghj");
        CheckPassword onlyNumbers = new CheckPassword("123456789");
        CheckPassword onlySpecialSymbols = new CheckPassword("!@#$%^&*(");
        CheckPassword correctPassword = new CheckPassword("pass123!@");

        fromConsole.acceptFromConsole();
        fromConsole.checkPassword(fromConsole.passwordAccepted);
        System.out.println("-------------------");

        lessThanEightSymbols.checkPassword(lessThanEightSymbols.passwordAccepted);
        System.out.println("-------------------");

        onlyLetters.checkPassword(onlyLetters.passwordAccepted);
        System.out.println("-------------------");

        onlyNumbers.checkPassword(onlyNumbers.passwordAccepted);
        System.out.println("-------------------");

        onlySpecialSymbols.checkPassword(onlySpecialSymbols.passwordAccepted);
        System.out.println("-------------------");

        correctPassword.checkPassword(correctPassword.passwordAccepted);
        System.out.println("-------------------");
    }
}
