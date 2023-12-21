package ExeptionExercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
All exceptions must be caught  or thrown
Caught means to process the exception
Thrown is to give the responsibility to another method to process it
----------------------------------
Checked - like FileNotFoundException - cannot compile if not processed
Unchecked - usually unexpected behaviour from the user. Inherits RuntimeException
Errors - can be lack of memory or like that. Something we can't control
 */
public class MainMethod {
    //If a method throws exception it must be declared in the method signature; in first method and in all that calls it
    public static void main(String[] args) throws IOException, Exceptions {
        //try - here is the block of code that may throw exception
        //in try-catch construction can be only one try block
       try{
          //  ExceptionsExercise.readFile("nanana");
             ExceptionsExercise.readFile("C:\\Users\\penow\\OneDrive\\Desktop\\ese.txt");
           // ExceptionsExercise.readFile("C:\\Users\\penow\\OneDrive\\Desktop\\ese2.txt");

        }
        //in a try-catch construction can be many catch blocks
       catch (FileNotFoundException fnfe){
        System.out.println("Invalid file path name! Please, enter a valid one!");
       }
        //declare exception and give it name
      //  catch (IOException test){
     //      System.out.println("Invalid file path name! Please, enter a valid one!");
      //  }
        //in this case we just throw the exception
      //  catch (IOException newException){
     //       throw new IOException(newException);
      //  }
        //catch (IOException ioe) {
       // throw new RuntimeException(ioe);
    //}
        //finally block - can be only one int a try-catch construction
        //it is always executed. Used mostly to write error logs
       finally {
            System.out.println("The code in 'finally' is always executed!");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter first number:");
        int a = input.nextInt();

        System.out.println("Please, enter second number:");
        int b = input.nextInt();

        try{
            System.out.printf("The result of the operation is: %d", a / b);
        }
        catch (ArithmeticException test){
            throw new Exceptions(test.getMessage(), a);
        }
    }
}
