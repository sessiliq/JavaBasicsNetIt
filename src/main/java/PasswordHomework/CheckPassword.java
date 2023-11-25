package PasswordHomework;

import java.util.Scanner;
/*
Check if a string can be used as password
Requirements:
1.At least 8 symbols
2.Must contain special character, number and letter
 */
public class CheckPassword {
    //variable that keeps password
    public String passwordAccepted;

    //constructor
    public CheckPassword(){

    }
    //constructor
    public CheckPassword(String passwordAccepted) {
        this.passwordAccepted = passwordAccepted;
    }

    //method that accepts password from console
    public void acceptFromConsole() {
        Scanner input = new Scanner(System.in);
        passwordAccepted = input.nextLine();
    }

    //check if password meet requirements for length and symbols
    public void checkPassword(String passwordAccepted) {
        if (passwordAccepted.length() < 8) {
            System.out.println("Password cannot be less than 8 symbols");
        } else {
            boolean hasNumber = false;
            boolean hasLetter = false;
            boolean hasSymbol = false;

            for (int i = 0; i < passwordAccepted.length(); i++) {
                if (Character.isDigit(passwordAccepted.charAt(i))) {
                    hasNumber = true;
                } else if (Character.isLetter(passwordAccepted.charAt(i))) {
                    hasLetter = true;
                } else {
                    hasSymbol = true;
                }
            }

            if (hasLetter) {
                if (hasNumber) {
                    if (hasSymbol) {
                        System.out.println("Password accepted!");
                    } else {
                        System.out.println("Password must contain at least one special symbol!");
                    }
                } else if (hasSymbol) {
                    System.out.println("Password must contain at least one number!");
                } else {
                    System.out.println("Password must contain at least one number and one special symbol!");
                }
            } else if (hasNumber) {
                if (hasSymbol) {
                    System.out.println("Password must contain at least one letter!");
                } else {
                    System.out.println("Password must contain at least one letter and one special symbol!");
                }
            } else {
                System.out.println("Password must contain at least one letter and one number!");
            }
        }
    }
}

