package PasswordHomework;

import java.util.Scanner;

/*
Check if a string can be used for password
Requirements:
1. At least 8 symbols
2.Need to contain special character, number and letter
 */
public class passwordParameters {
    public static void main(String[] args) {
        //variables for containing all symbols
        boolean hasNumber = false;
        boolean hasLetter = false;
        boolean hasSymbol = false;

        Scanner input = new Scanner(System.in);
        String passwordAccepted = input.nextLine();

        //is password correct length
        if (passwordAccepted.length() < 8){
            System.out.println("Password cannot be less than 8 symbols");
        }

        //check if symbols are correct
        for (int i = 0; i < passwordAccepted.length(); i++){
            if (Character.isDigit(passwordAccepted.charAt(i))){
                hasNumber = true;
            }
            else if (Character.isLetter(passwordAccepted.charAt(i))) {
                hasLetter = true;
            }
            else {
                hasSymbol = true;
            }
        }

        if (hasLetter){
            if (hasNumber){
                if (hasSymbol){
                    System.out.println("Password accepted!");
                }
                else {
                    System.out.println("Password must contain at least one special symbol!");
                }
            }
            else if (hasSymbol){
                System.out.println("Password must contain at least one number!");
            }
            else {
                System.out.println("Password must contain at least one number and one special symbol!");
            }
        }
        else if(hasNumber){
            if (hasSymbol){
                System.out.println("Password must contain at least one letter!");
            }
            else {
                System.out.println("Password must contain at least one letter and one special symbol!");
            }
        }
        else {
            System.out.println("Password must contain at least one letter and one number!");
        }
    }
}
