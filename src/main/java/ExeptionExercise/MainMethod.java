package ExeptionExercise;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainMethod {
    //If a method throws exception it must be declared in the method signature; in first method and in all that calls it
    public static void main(String[] args) throws IOException {
        //try - here is the block of code that may throw exeption
        //in try-catch construction can be only one try block
        try{
            ExceptionsExercise.readFile("nanana");
            // ExeptionsExercise.readFile("C:\\Users\\penow\\OneDrive\\Desktop\\ese.txt");
          //  ExeptionsExercise.readFile("C:\\Users\\penow\\OneDrive\\Desktop\\ese2.txt");

        }
        //in a try-catch construction can be many catch blocks
        catch (FileNotFoundException fnfe){
         System.out.println("Invalid file path name! Please, enter a valid one!");
        }
        catch (IOException test){
            System.out.println("Invalid file path name! Please, enter a valid one!");
        }
        //catch (IOException ioe) {
       // throw new RuntimeException(ioe);
    //}
        //finally block - can be only one int a try-catch construction
        //it is always executed. Used mostly to write error logs
        finally {
            System.out.println("The code in 'finally' is always executed!");
        }
    }
}
