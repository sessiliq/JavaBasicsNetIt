package PasswordHomework;

import java.util.Scanner;
public class MainMethod {
    public static void main(String[] args) {

        password2 test = new password2();

        test.acceptFromConsole();
        test.checkPassword(test.passwordAccepted);
    }
}
