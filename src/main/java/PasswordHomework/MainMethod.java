package PasswordHomework;
public class MainMethod {
    public static void main(String[] args) {

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
