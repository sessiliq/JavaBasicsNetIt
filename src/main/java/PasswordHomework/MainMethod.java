package PasswordHomework;
public class MainMethod {
    public static void main(String[] args) {

        password2 fromConsole = new password2();
        password2 lessThanEightSymbols = new password2("kkk");
        password2 onlyLetters = new password2("abcdefghj");
        password2 onlyNumbers = new password2("123456789");
        password2 onlySpecialSymbols = new password2("!@#$%^&*(");
        password2 correctPassword = new password2("pass123!@");

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
